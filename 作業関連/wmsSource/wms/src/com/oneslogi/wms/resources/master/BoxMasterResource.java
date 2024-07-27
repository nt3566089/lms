package com.oneslogi.wms.resources.master;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.dto.MBoxDto;
import com.oneslogi.base.dbflute.dtomapper.MBoxDtoMapper;
import com.oneslogi.base.dbflute.exentity.MBox;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.dto.master.BoxMasterDto;
import com.oneslogi.wms.logic.common.BoxMasterCheckLogic;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.master.BoxMasterInsertLogic;
import com.oneslogi.wms.logic.master.BoxMasterSelectLogic;
import com.oneslogi.wms.logic.master.BoxMasterUpdateLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * 荷材マスタ画面のリソースクラス。
 */
@Path("/master/boxMasterList")
public class BoxMasterResource extends AbstractWmsResource {
	/**
	 * ステータスコード定義
	 */
	protected static class StatusCode {
		/**
		 * 正常終了
		 */
		protected static final int SUCCESS = 0;
		/**
		 * ユーザによる確認
		 */
		protected static final int CONFIRMATION = 1;
		/**
		 * 一覧データ取得異常
		 */
		protected static final int NOT_FOUND_DATA = 2;
		/**
		 * 荷材マスタ登録異常
		 */
		protected static final int BOX_MASTER_INSERT_FAILED = 3;
		/**
		 * 荷材マスタ更新異常
		 */
		protected static final int BOX_MASTER_UPDATE_FAILED = 4;
		/**
		 * 荷材マスタデータチェック異常
		 */
		protected static final int BOX_MASTER_CHECK_FAILED = 6;
	}

	// ===== 使用ロジッククラス =====
	@Inject
	private BoxMasterSelectLogic boxMasterSelectLogic;
	@Inject
	private BoxMasterInsertLogic boxMasterInsertLogic;
	@Inject
	private BoxMasterUpdateLogic boxMasterUpdateLogic;
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private BoxMasterCheckLogic boxMasterCheckLogic;

	/**
	 * <h2>初期処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return BoxMasterDto 荷材マスタ画面用DTO
	 */
	@GET
	@Path("/init")
	public BoxMasterDto init() {
		return new BoxMasterDto();
	}

	/**
	 * <h2>検索処理。</h2>
	 * <pre>
	 * ・荷材マスタDTOをキーに荷材マスタデータ取り出し
	 * </pre>
	 * @param boxMasterDto 荷材マスタ画面用DTO
	 * @return BoxMasterDto 荷材マスタ画面用DTO
	 */
	@GET
	@Path("/search")
	public BoxMasterDto search(BoxMasterDto boxMasterDto) throws IOException {
		// Entity変換
		MBoxDtoMapper mapper = new MBoxDtoMapper();
		MBox box = mapper.mappingToEntity(boxMasterDto.data.head);

		// センタID取得
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(box.getMCenter().getCenterCd());
		long centerId = centerLogic.getUkEntity(mCenter).getCenterId();

		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}

		// Entity編集
		box.setCenterId(centerId);

		// 検索
		List<MBox> boxList = boxMasterSelectLogic.select(box, errRetSts(StatusCode.NOT_FOUND_DATA));

		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}

		// Entity-Dto変換処理
		List<MBoxDto> list = mapper.mappingToDtoList(boxList);

		// 検索結果詰込処理
		boxMasterDto.data.list = list;

		return boxMasterDto;
	}

	/**
	 * <h2>入力チェック。</h2>
	 * <pre>
	 * 登録データのチェックを行う。
	 * エラーがない場合は、次の条件に合わせて確認メッセージを設定する。
	 * ・センタCD存在チェックエラー用メッセージ
	 * ・通常の登録確認メッセージ
	 *
	 * データチェックは結果で判定。
	 * </pre>
	 * @param boxMasterDto 荷材マスタ画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/inputCheck")
	public StatusDto inputCheck(BoxMasterDto boxMasterDto) {

		// Entity変換
		MBoxDtoMapper mapper = new MBoxDtoMapper();
		List<MBox> mBoxList = mapper.mappingToEntityList(boxMasterDto.data.list);

		// チェック処理
		boxMasterCheckLogic.checkBoxMaster(mBoxList, errRetSts(StatusCode.BOX_MASTER_CHECK_FAILED));

		// 結果判定
		if (getErrorManager().size() > 0) {
			// 処理中止
			return null;
		} else {
			// 確認表示
			getInfoManager().add(infoRetSts(StatusCode.CONFIRMATION), WmsMessageConst.DATA_REGISTER_CONFIRMATION);
		}

		return null;
	}

	/**
	 * <h2>荷材マスタ登録。</h2>
	 * <pre>
	 * データの登録・更新処理。
	 * エラーがない場合は、データベースに荷材マスタデータを登録し、完了メッセージを設定する。
	 *
	 * データチェックは結果で判定。
	 *
	 * 登録データに次の値を設定する。
	 * ・センタID
	 * </pre>
	 * @param boxMasterDto 荷材マスタ画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/register")
	public StatusDto register(BoxMasterDto boxMasterDto) {
		// Entity変換
		MBoxDtoMapper mapper = new MBoxDtoMapper();
		List<MBox> mBoxList = mapper.mappingToEntityList(boxMasterDto.data.list);

		// [ON推-品向-821] 別センタの荷材CDが重複エラーになる(不要な処理削除) 2015.06.16 kawana

		// チェック処理
		boxMasterCheckLogic.checkBoxMaster(mBoxList, errRetSts(StatusCode.BOX_MASTER_CHECK_FAILED));

		// 結果判定
		if (getErrorManager().size() > 0) {
			// 処理中止
			return null;
		}

		// [ON推-品向] 一括登録に変更する 2016.02.17 DSW Start
		List<MBox> insertList = new ArrayList<>();

		List<MBox> updateList = new ArrayList<>();

		for (MBox mBox : mBoxList) {

			// [ON推-品向-821] 別センタの荷材CDが重複エラーになる(不要な処理削除) 2015.06.16 kawana

			if (mBox.getBoxId() == null) {
				// 登録
				insertList.add(mBox);
//				boxMasterInsertLogic.insert(mBox, errRetSts(StatusCode.BOX_MASTER_INSERT_FAILED));
			} else {
				// 修正
				updateList.add(mBox);
//				boxMasterUpdateLogic.update(mBox, errRetSts(StatusCode.BOX_MASTER_UPDATE_FAILED));
			}
		}

		if (!insertList.isEmpty()){
			// 登録
			boxMasterInsertLogic.batchInsert(insertList, errRetSts(StatusCode.BOX_MASTER_INSERT_FAILED));
		}

		if (!updateList.isEmpty()){
			// 修正
			boxMasterUpdateLogic.batchUpdate(updateList, errRetSts(StatusCode.BOX_MASTER_INSERT_FAILED));
		}

		// [ON推-品向] 一括登録に変更する 2016.02.17 DSW End
		// 結果判定
		if (0 < getErrorManager().size()) {
			return null;
		}
		//[ON推-品向-150]「正常に更新されました。」に修正 2014.11.26 衛 Start
		// 完了メッセージの設定
		getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.UPDATE_PROCESS_NORMAL_END_INFORMATION);
		//[ON推-品向-150]「正常に更新されました。」に修正 2014.11.26 衛 End
		return null;
	}
}
