package com.oneslogi.ht.base.cdi.interceptor;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.ws.rs.core.Response;

import net.arnx.jsonic.JSON;

import org.dbflute.exception.EntityAlreadyDeletedException;
import org.dbflute.exception.EntityAlreadyExistsException;
import org.dbflute.exception.EntityAlreadyUpdatedException;
import org.dbflute.exception.SQLFailureException;

import com.oneslogi.base.AbstractBase;
import com.oneslogi.base.BaseConst;
import com.oneslogi.base.BaseConst.TimeoutErrorCode;
import com.oneslogi.base.cdi.interceptor.AbstractInterceptor;
import com.oneslogi.base.cdi.interceptor.WebResourceLocal;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.base.exception.ApplicationException;
import com.oneslogi.base.exception.BaseException;
import com.oneslogi.base.exception.CheckBaseException;
import com.oneslogi.base.exception.CommonException;
import com.oneslogi.base.exception.ErrorManager;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.exception.ListException;
import com.oneslogi.base.resources.AuthenticationDevelopmentResource;
import com.oneslogi.base.util.CommonUtil;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorControl;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.dto.HandyCommonDialogDto;
import com.oneslogi.ht.base.dto.HywayDefaultParamDto;
import com.oneslogi.ht.base.exception.HandySessionException;
import com.oneslogi.ht.base.resources.HandyLoginResourceBase;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.wms.core.WmsCoreMessageConst;

/**
 * Handy端末用のExceptionInterceptorクラス。
 *
 * @author hi.watanabe
 *
 */
@HandyErrorControl
@Interceptor
public class HandyErrorControlInterceptor extends AbstractInterceptor {

	// [#6501] 致命的エラー発生にてDBがロールバックされない問題を修正 2019.06.04 kawana Start
	@Inject
	private HandyErrorControlUtilBiginTransaction util;
	// [#6501] 致命的エラー発生にてDBがロールバックされない問題を修正 2019.06.04 kawana End

	/**
	 * Transaction制御を行う割り込み処理。
	 *
	 * @param ic
	 * @return
	 * @throws Exception
	 */
	@AroundInvoke
	public Object execute(final InvocationContext ic) throws Exception {

		// 前提条件チェック
		checkExtendBase(ic);

		// ネスト実行チェック
		if (isEnclosingMethodInvoke(ic)) {
			return ic.proceed();
		}

		Object ret = null;
		boolean err = true;

		HttpServletRequest req = (HttpServletRequest) WebResourceLocal.get().get(HttpServletRequest.class);
		HttpServletResponse res = (HttpServletResponse) WebResourceLocal.get().get(HttpServletResponse.class);

		AbstractBase base = null;

		try {
			//メイン処理
			base = (AbstractBase) ic.getTarget();
			HttpSession ses = req.getSession();
			HywayDefaultParamDto retDto = (HywayDefaultParamDto) ses.getAttribute("defDto");

			if (retDto != null) {
				retDto.setUniquePacketId(req.getParameter("_ri"));

			} else {
				if (base instanceof HandyLoginResourceBase) {
					retDto = new HywayDefaultParamDto();
					retDto.setUniquePacketId(req.getParameter("_ri"));
					retDto.setHtLocalId(req.getParameter("_ui"));

					if (req.getParameter("_si") != null) {
						retDto.setHtUniqueId(req.getParameter("_si").substring(2));
					}

					retDto.setGroupId(req.getParameter("_gi"));
					retDto.setBrowserVersion(req.getParameter("_cv"));
					retDto.setPrintResult(req.getParameter("_pr"));
					retDto.setHtLang(req.getParameter("_cp"));

				} else {
					//セッション切れのため再ログイン（基本的には認証チェック側で処理される為、本処理は実行されない想定）
					err = false;
					base.getErrorManager().add(new ErrorStatus(), WmsCoreMessageConst.HANDY_SESSION_TIMEOUT);
					throw new HandySessionException();
				}
			}

			ses.setAttribute("defDto", retDto);

			if (ses.getAttribute("loginInfo") == null && !(base instanceof HandyLoginResourceBase)) {
				//セッション切れのため再ログイン（基本的には認証チェック側で処理される為、本処理は実行されない想定）
				err = false;
				base.getErrorManager().add(new ErrorStatus(), WmsCoreMessageConst.HANDY_SESSION_TIMEOUT);
				throw new HandySessionException();
			}

			// 次画面テンプレート強制設定を再設定する。
			// これを行うことにより、エラー発生→エラーダイアログ表示後に、再度元の画面に戻った時、
			// 次画面テンプレート強制設定が適用された状態になる。
			util.restoreNextViewTemplateForceSettingIfNeed();

			ret = ic.proceed();

			// 次画面テンプレート強制設定がすでに設定されているのであれば、バックアップを取る。
			util.backupNextViewTemplateForceSettingIfNeed();

			// 警告管理クラス、情報管理クラスに追加されていた場合に動作不正になる問題を修正 2017.12.04 kawana Start

			//業務エラー存在判定処理
			if (0 < base.getErrorManager().size()) {
				err = false;
				throw new ListException(base.getErrorManager().get());

			} else if (0 < base.getWarnManager().size()) {

				throw new IllegalStateException("Don't add to \"WarnManager\" when HT. messageCd:" + ((CommonException) base.getWarnManager().get().values().toArray()[0]).getMessageCd());
			} else if (0 < base.getInfoManager().size()) {

				throw new IllegalStateException("Don't add to \"InfoManager\" when HT. messageCd:" + ((CommonException) base.getInfoManager().get().values().toArray()[0]).getMessageCd());

				// 警告管理クラス、情報管理クラスに追加されていた場合に動作不正になる問題を修正 2017.12.04 kawana End
			} else {

				String transURL = util.getTransURL(ses);
				// [#2899] HT国際化対応 カルチャ別jsp読込対応 2017.11.28 kawana Start
				util.forward(transURL, req, res);
				// [#2899] HT国際化対応 カルチャ別jsp読込対応 2017.11.28 kawana End
			}

		} catch (Exception e) {
			return error(ic, e, ret, err, req, res, base);
		}

		// NULLでない場合はそのまま返す
		if (ret != null) {
			return ret;
		}

		// voidの場合は何もしない
		if (ic.getMethod().getReturnType() == void.class) {
			return ret;
		}

		// Responseの場合は何もしない
		if (ic.getMethod().getReturnType() == Response.class) {
			if (logger.isWarnEnabled()) {
				try {
					logger.warn("This class can not be instantiated. [" + ic.getMethod().getReturnType().getName() + "]");
				} catch (Exception ex) {
					//何もしない
				}
			}
			return ret;
		}

		// NULLをStatusDtoに差し替え
		Object obj;
		try {
			obj = ic.getMethod().getReturnType().newInstance();
		} catch (IllegalAccessException e) {
			if (logger.isWarnEnabled()) {
				try {
					logger.warn("This class can not be instantiated. [" + ic.getMethod().getReturnType().getName() + "]", e);
				} catch (Exception ex) {
					//何もしない
				}
			}
			return ret;
		}

		if (BaseDto.class.isInstance(obj)) {
			return obj;
		}

		return ret;
	}

	private Object error(final InvocationContext ic, Exception e, Object ret, boolean err, HttpServletRequest req, HttpServletResponse res, AbstractBase base) throws Exception {

		HttpSession ses = req.getSession();

		if (logger.isErrorEnabled() && err) {
			try {
				logger.error("error.", e);
			} catch (Exception ex) {
				//何もしない
			}
		}

		//戻り値の型がvoidの場合はエラーを返す。
		if (ic.getMethod().getReturnType() == void.class) {
			Object tmp = ic.getTarget();

			if (tmp instanceof AbstractBase) {
				//ListExceptionが格納されている場合、メッセージコードを取得してメッセージ表示
				String message = "";

				if (e instanceof ListException) {
					util.setOnSendErrorDialogFlg();

					ErrorManager eManager = base.getErrorManager();

					// 警告管理クラス、情報管理クラスに追加されていた場合に動作不正になる問題を修正 2017.12.04 kawana Start
					if (0 < eManager.size()) {

						message = util.getMessage(eManager);
					} else {

						message = ((ListException) e).get().get(0).getMessage();
					}
					// 警告管理クラス、情報管理クラスに追加されていた場合に動作不正になる問題を修正 2017.12.04 kawana End

					HandyCommonDialogDto dto = new HandyCommonDialogDto();
					// [v3.0]iPodTouchで改行コード(\n)で改行されないため改行されたら新しいTextタグを作成 2019.01.18 kawana Start
					util.setCommonDialogMessage(dto, message, e.getLocalizedMessage());
					// [v3.0]iPodTouchで改行コード(\n)で改行されないため改行されたら新しいTextタグを作成 2019.01.18 kawana End
					ses.setAttribute("dialogDto", dto);

					util.clearNextViewTemplateForceSetting();

					// [#2734][#2899] HT国際化対応 2017.11.28 kawana Start

					String errorDialogScreenCd = "CommonErrorDialogHT";
					util.loadViewTemplate(HandyResourceBase.VIEW_TEMPLATE_ERROR, util.screenNm(errorDialogScreenCd));

					util.clearFooterButton(ses);
					String retURL = base.getClass().getAnnotation(HandyErrorReturnPath.class).returnURL();

					util.setFooterRightButton(ses,
							HandyResourceBase.BUTTON_SEND_DATA_FINAL_FIELD_INPUT,
							util.getKeyCode(HandyResourceBase.KEY_TYPE_ENTER),
							retURL,
							util.getKeyLabelWithText(HandyResourceBase.KEY_TYPE_ENTER, util.itemNm(errorDialogScreenCd, "return")));

					util.forward(HandyResourceBase.HT_URI_BASE + "/base/CommonDialog.jsp", req, res);

					// [#2734][#2899] HT国際化対応 2017.11.28 kawana End

				} else if (e instanceof HandySessionException) {
					// 基本的には認証チェック側で処理される為、本処理は実行されない想定
					ErrorManager eManager = base.getErrorManager();
					message = util.getMessage(eManager);

					HandyCommonDialogDto dto = new HandyCommonDialogDto();
					// [v3.0]iPodTouchで改行コード(\n)で改行されないため改行されたら新しいTextタグを作成 2019.01.18 kawana Start
					util.setCommonDialogMessage(dto, message, e.getLocalizedMessage());
					// [v3.0]iPodTouchで改行コード(\n)で改行されないため改行されたら新しいTextタグを作成 2019.01.18 kawana End
					ses.setAttribute("dialogDto", dto);

					util.clearNextViewTemplateForceSetting();

					// [#2734][#2899] HT国際化対応 2017.11.28 kawana Start

					String errorDialogScreenCd = "CommonErrorDialogHT";
					util.loadViewTemplate(HandyResourceBase.VIEW_TEMPLATE_ERROR, util.screenNm(errorDialogScreenCd));

					util.clearFooterButton(ses);
					String retURL = "initLogin";

					util.setFooterRightButton(ses,
							HandyResourceBase.BUTTON_SEND_DATA_FINAL_FIELD_INPUT,
							util.getKeyCode(HandyResourceBase.KEY_TYPE_ENTER),
							retURL,
							util.getKeyLabelWithText(HandyResourceBase.KEY_TYPE_ENTER, util.itemNm(errorDialogScreenCd, "end")));

					util.forward(HandyResourceBase.HT_URI_BASE + "/base/CommonDialog.jsp", req, res);

					// [#2734][#2899] HT国際化対応 2017.11.28 kawana End

				} else if (e instanceof EntityAlreadyUpdatedException
						|| e instanceof EntityAlreadyDeletedException
						|| e instanceof EntityAlreadyExistsException
						// [#1984][Ver2.2.0] HT系処理におけるDBタイムアウトエラー対応 2017.06.27 honma Add Start
						|| e instanceof SQLFailureException) {
					// [#1984][Ver2.2.0] HT系処理におけるDBタイムアウトエラー対応 2017.06.27 honma Add End

					util.setOnSendErrorDialogFlg();

					//メッセージコードからエラーメッセージを取得
					//ダイアログ共通画面の仕組みを用いてエラー画面表示
					HandyCommonDialogDto dto = new HandyCommonDialogDto();

					// 例外の種類に応じてメッセージを設定する。
					if (e instanceof EntityAlreadyUpdatedException) {
						// [v3.0]iPodTouchで改行コード(\n)で改行されないため改行されたら新しいTextタグを作成 2019.01.18 kawana Start
						util.setCommonDialogMessage(dto, util.getMessage("entityAlreadyUpdatedError"));
					} else if (e instanceof EntityAlreadyDeletedException) {
						util.setCommonDialogMessage(dto, util.getMessage("entityAlreadyDeletedError"));
					} else if (e instanceof EntityAlreadyExistsException) {
						util.setCommonDialogMessage(dto, util.getMessage("entityAlreadyExistsError"));
						// [v3.0]iPodTouchで改行コード(\n)で改行されないため改行されたら新しいTextタグを作成 2019.01.18 kawana End
						// [#1984][Ver2.2.0] HT系処理におけるDBタイムアウトエラー対応 2017.06.27 honma Add Start
					} else if (e instanceof SQLFailureException) {
						SQLException sqlException = ((SQLFailureException) e).getSQLException();
						int errorCode = sqlException.getErrorCode();

						// プロパティファイルを読み込み
						Properties properties = new Properties();
						InputStream is = AuthenticationDevelopmentResource.class.getClassLoader().getResourceAsStream("dbcp.properties");
						try {
							properties.load(is);
							is.close();

							// プロパティファイルからjdbc設定を取得
							String url = properties.getProperty("url", "jdbc:fatalError:");
							String[] splitUrl = url.split("jdbc:");
							String[] splitUrl2 = splitUrl[1].split(":");
							final String dbType = splitUrl2[0];

							if (CommonUtil.equalsIgnoreCase(BaseConst.MYSQL, dbType)) {
								if (errorCode == TimeoutErrorCode.MYSQL) {
									//MYSQLでの行ロックタイムアウトエラー
									// [v3.0]iPodTouchで改行コード(\n)で改行されないため改行されたら新しいTextタグを作成 2019.01.18 kawana Start
									util.setCommonDialogMessage(dto, util.getMessage("timeoutError"));
									// [v3.0]iPodTouchで改行コード(\n)で改行されないため改行されたら新しいTextタグを作成 2019.01.18 kawana End
								} else {
									// 致命的エラーのメッセージ設定
									setFatalError(e, req, res, ses);
									return null;
								}
							} else if (CommonUtil.equalsIgnoreCase(BaseConst.ORACLE, dbType)) {
								if (errorCode == TimeoutErrorCode.ORACLE_WAIT || errorCode == TimeoutErrorCode.ORACLE_NO_WAIT) {
									//ORACLEでの行ロックタイムアウトエラー
									// [v3.0]iPodTouchで改行コード(\n)で改行されないため改行されたら新しいTextタグを作成 2019.01.18 kawana Start
									util.setCommonDialogMessage(dto, util.getMessage("timeoutError"));
									// [v3.0]iPodTouchで改行コード(\n)で改行されないため改行されたら新しいTextタグを作成 2019.01.18 kawana End
								} else {
									// 致命的エラーのメッセージ設定
									setFatalError(e, req, res, ses);
									return null;
								}
							} else {
								// 致命的エラーのメッセージ設定
								setFatalError(e, req, res, ses);
								return null;
							}

						} catch (IOException ioException) {
							// 致命的エラーのメッセージ設定
							setFatalError(e, req, res, ses);
							return null;
						}
						// [#1984][Ver2.2.0] HT系処理におけるDBタイムアウトエラー対応 2017.06.27 honma Add End
					}

					// 以降、共通的な記述。
					ses.setAttribute("dialogDto", dto);
					util.clearNextViewTemplateForceSetting();

					// [#2734][#2899] HT国際化対応 2017.11.28 kawana Start

					String errorDialogScreenCd = "CommonErrorDialogHT";
					util.loadViewTemplate(HandyResourceBase.VIEW_TEMPLATE_FATAL, util.screenNm(errorDialogScreenCd));
					util.clearFooterButton(ses);

					String retURL = base.getClass().getAnnotation(HandyErrorReturnPath.class).returnURL();

					util.setFooterRightButton(ses,
							HandyResourceBase.BUTTON_SEND_DATA_FINAL_FIELD_INPUT,
							util.getKeyCode(HandyResourceBase.KEY_TYPE_ENTER),
							retURL,
							util.getKeyLabelWithText(HandyResourceBase.KEY_TYPE_ENTER, util.itemNm(errorDialogScreenCd, "return")));

					util.forward(HandyResourceBase.HT_URI_BASE + "/base/CommonDialog.jsp", req, res);

					// [#2734][#2899] HT国際化対応 2017.11.28 kawana End

					// [#1079][Ver2.2.1] 日次処理中のHT使用不可 2017.09.20 honma Add Start
				} else if (e instanceof CheckBaseException) {
					HandyCommonDialogDto dto = new HandyCommonDialogDto();
					((CommonException) e).getStatusCd();
					// [v3.0]iPodTouchで改行コード(\n)で改行されないため改行されたら新しいTextタグを作成 2019.01.18 kawana Start
					util.setCommonDialogMessage(dto, util.getMessage("dailyProcessRunningConfirm"), e.getLocalizedMessage());
					// [v3.0]iPodTouchで改行コード(\n)で改行されないため改行されたら新しいTextタグを作成 2019.01.18 kawana End
					ses.setAttribute("dialogDto", dto);

					util.clearNextViewTemplateForceSetting();

					// [#2734][#2899] HT国際化対応 2017.11.28 kawana Start

					String errorDialogScreenCd = "CommonErrorDialogHT";
					util.loadViewTemplate(HandyResourceBase.VIEW_TEMPLATE_FATAL, util.screenNm(errorDialogScreenCd));
					util.clearFooterButton(ses);

					String retURL = "mainmenu";

					util.setFooterRightButton(ses,
							HandyResourceBase.BUTTON_SEND_DATA_FINAL_FIELD_INPUT,
							util.getKeyCode(HandyResourceBase.KEY_TYPE_ENTER),
							retURL,
							util.getKeyLabelWithText(HandyResourceBase.KEY_TYPE_ENTER, util.itemNm(errorDialogScreenCd, "end")));

					util.forward(HandyResourceBase.HT_URI_BASE + "/base/CommonDialog.jsp", req, res);

					// [#2734][#2899] HT国際化対応 2017.11.28 kawana End

					// [#1079][Ver2.2.1] 日次処理中のHT使用不可 2017.09.20 honma Add End
				} else {
					//メッセージコードからエラーメッセージを取得
					//ダイアログ共通画面の仕組みを用いてエラー画面表示
					setFatalError(e, req, res, ses);
				}
			}

			return null;

		} else if (ic.getMethod().getReturnType() == Response.class) {
			// Responseの場合は何もしない
			if (logger.isWarnEnabled()) {
				try {
					logger.warn("This class can not be instantiated. [" + ic.getMethod().getReturnType().getName() + "]");
				} catch (Exception ex) {
					//何もしない
				}
			}
			return ret;

		} else if (ic.getMethod().getReturnType() == String.class) {
			//戻り値の型がStringの場合、BaseDtoにエラー情報を乗せてJSONで返す。
			BaseDto status = createStatus(e);
			return JSON.encode(status);

		} else {
			// NULLをStatusDtoに差し替え
			Object obj;
			try {
				obj = ic.getMethod().getReturnType().newInstance();
			} catch (IllegalAccessException ee) {
				if (logger.isWarnEnabled()) {
					try {
						logger.warn("This class can not be instantiated. [" + ic.getMethod().getReturnType().getName() + "]", ee);
					} catch (Exception ex) {
						//何もしない
					}
				}
				return ret;
			}

			if (BaseDto.class.isInstance(obj)) {
				return obj;
			}

			return ret;
		}

	}

	// [#1984][Ver2.2.0] HT系処理におけるDBタイムアウトエラー対応 2017.06.27 honma Add Start
	private void setFatalError(Exception e, HttpServletRequest req, HttpServletResponse res, HttpSession ses) throws ServletException, IOException {

		// [#2734][#2899] HT国際化対応 2017.11.28 kawana Start

		String errorDialogScreenCd = "CommonErrorDialogHT";

		HandyCommonDialogDto dto = new HandyCommonDialogDto();
		// [v3.0]iPodTouchで改行コード(\n)で改行されないため改行されたら新しいTextタグを作成 2019.01.18 kawana Start
		util.setCommonDialogMessage(dto, util.itemNm(errorDialogScreenCd, "fatal"), util.splitText(e.getLocalizedMessage()));
		// [v3.0]iPodTouchで改行コード(\n)で改行されないため改行されたら新しいTextタグを作成 2019.01.18 kawana End
		ses.setAttribute("dialogDto", dto);

		util.clearNextViewTemplateForceSetting();

		util.loadViewTemplate(HandyResourceBase.VIEW_TEMPLATE_FATAL, util.screenNm(errorDialogScreenCd));
		util.clearFooterButton(ses);

		String retURL = "";

		util.setFooterRightButton(ses,
				HandyResourceBase.BUTTON_SEND_DATA_FINAL_FIELD_INPUT,
				util.getKeyCode(HandyResourceBase.KEY_TYPE_ENTER),
				retURL,
				util.getKeyLabelWithText(HandyResourceBase.KEY_TYPE_ENTER, util.itemNm(errorDialogScreenCd, "end")));

		util.forward(HandyResourceBase.HT_URI_BASE + "/base/CommonDialog.jsp", req, res);

		// [#2734][#2899] HT国際化対応 2017.11.28 kawana End
	}

	// [#1984][Ver2.2.0] HT系処理におけるDBタイムアウトエラー対応 2017.06.27 honma Add End

	private BaseDto createStatus(Exception e) {
		return createStatus(e, new StatusDto());
	}

	private BaseDto createStatus(Exception e, BaseDto status) {

		if (e instanceof ListException) {
			ListException le = (ListException) e;
			boolean first = true;
			for (BaseException be : le.get()) {
				if (first) {
					first = false;
					status.status.statusCode = be.getStatusCd();
					status.status.developerMessage = e.getMessage();
					setCommonStatus(be, status);
					status.status.listStatus = new ArrayList<BaseDto>();
				}
				BaseDto listStatus = new StatusDto();
				listStatus.status.statusCode = be.getStatusCd();
				listStatus.status.developerMessage = be.getMessage();
				setCommonStatus(be, listStatus);
				status.status.listStatus.add(listStatus);
			}

		} else if (e instanceof BaseException && !(e instanceof ApplicationException)) {
			BaseException be = (BaseException) e;
			status.status.statusCode = be.getStatusCd();
			status.status.developerMessage = be.getMessage();
			setCommonStatus(be, status);
			status.status.listStatus = new ArrayList<BaseDto>();
			BaseDto listStatus = new StatusDto();
			listStatus.status.statusCode = be.getStatusCd();
			listStatus.status.developerMessage = be.getMessage();
			setCommonStatus(be, listStatus);
			status.status.listStatus.add(listStatus);

		} else {
			BaseDto listStatus = new StatusDto();

			StringBuilder sb = new StringBuilder();

			if (e instanceof EntityAlreadyUpdatedException) {
				//楽観的排他における更新・削除時に対象が存在しない場合に出力されるエラー
				status.status.statusCode = -2;
				listStatus.status.statusCode = -2;
				status.status.messageCode = "entityAlreadyUpdatedError";
				listStatus.status.messageCode = "entityAlreadyUpdatedError";
			} else if (e instanceof EntityAlreadyDeletedException) {
				//一件検索・更新・削除時に対象が存在しない場合に出力されるエラー
				status.status.statusCode = -3;
				listStatus.status.statusCode = -3;
				status.status.messageCode = "entityAlreadyDeletedError";
				listStatus.status.messageCode = "entityAlreadyDeletedError";
			} else if (e instanceof EntityAlreadyExistsException) {
				//追加・更新時に一意制約エラー
				status.status.statusCode = -4;
				listStatus.status.statusCode = -4;
				status.status.messageCode = "entityAlreadyExistsError";
				listStatus.status.messageCode = "entityAlreadyExistsError";
			} else {
				status.status.statusCode = -1;
				listStatus.status.statusCode = -1;
				status.status.messageCode = "unhandledError";
				listStatus.status.messageCode = "unhandledError";

				Throwable t = e;
				StringWriter sw = new StringWriter();
				PrintWriter pw = new PrintWriter(sw);

				while (true) {

					if (sb.length() > 0) {
						sb.append("\n");
					}

					try {
						sw = new StringWriter();
						pw = new PrintWriter(sw);

						t.printStackTrace(pw);
						pw.flush();

						sb.append(sw.toString());
					} finally {
						try {
							pw.close();
						} catch (Exception ee) {
							//何もしない
						}
						try {
							sw.close();
						} catch (Exception ee) {
							//何もしない
						}
					}

					if (t.getCause() == null) {
						break;
					}

					t = t.getCause();
				}

			}

			String msg;
			if (sb.length() > 0) {
				msg = sb.toString();
			} else {
				msg = e.getMessage();
			}

			status.status.developerMessage = msg;
			status.status.listStatus = new ArrayList<BaseDto>();

			listStatus.status.developerMessage = msg;
			status.status.listStatus.add(listStatus);
		}

		return status;
	}

	private void setCommonStatus(BaseException be, BaseDto status) {
		if (be instanceof CommonException) {
			CommonException ce = (CommonException) be;
			status.status.messageCode = ce.getMessageCd();
			if (ce.getReplaceValue() != null) {
				status.status.messageReplaceValue = ce.getReplaceValue().toArray(new String[ce.getReplaceValue().size()]);
			}
			status.status.rowIndex = ce.getRowIndex();
		}
	}
}
