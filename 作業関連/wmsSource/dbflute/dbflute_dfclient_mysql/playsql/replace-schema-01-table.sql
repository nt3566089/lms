-- Project Name : WMS
-- Date/Time    : 2024/05/29 18:31:18
-- Author       : yo-shimizu
-- RDBMS Type   : MySQL
-- Application  : A5:SQL Mk-2

-- 引数マスタ
create table B_ARG (
  ARG_ID bigint not null comment '引数ID'
  , FUNC_ID bigint not null comment '機能ID'
  , ARG_CD varchar(100) not null comment '引数CD'
  , DICT_ID bigint comment '辞書ID'
  , ARG_TYPE varchar(30) comment '引数型'
  , NECESSARY char(1) default '0' not null comment '必須'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint B_ARG_PK primary key (ARG_ID)
) comment '引数マスタ' ;

create unique index B_ARG_IX1
  on B_ARG(FUNC_ID,ARG_CD);

create index B_ARG_IX2
  on B_ARG(FUNC_ID);

create index B_ARG_IX3
  on B_ARG(DICT_ID);

-- 引数検証マスタ
create table B_ARG_VALID (
  ARG_ID bigint not null comment '引数ID'
  , INPUT_LIMIT varchar(100) comment '文字入力制限'
  , LIMIT_MESSAGE_CD varchar(100) comment '制限メッセージCD'
  , MIN_CHARS bigint comment '最小文字数'
  , MAX_CHARS bigint comment '最大文字数'
  , MIN_NUMBER decimal(14,4) comment '最小値'
  , MAX_NUMBER decimal(14,4) comment '最大値'
  , INTEGER_LENGTH bigint comment '整数桁数'
  , DECIMAL_LENGTH bigint comment '小数桁数'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint B_ARG_VALID_PK primary key (ARG_ID)
) comment '引数検証マスタ' ;

-- 区分値マスタ
create table B_CLASS (
  CLASS_ID bigint not null comment '区分値ID'
  , CLASS_CD varchar(30) not null comment '区分値CD'
  , CLASS_COMMENT varchar(60) comment '区分値解説'
  , SYSTEM_TYPE varchar(30) comment 'システム種別'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint B_CLASS_PK primary key (CLASS_ID)
) comment '区分値マスタ' ;

create unique index B_CLASS_IX1
  on B_CLASS(CLASS_CD);

-- 区分値明細マスタ
create table B_CLASS_DTL (
  CLASS_DTL_ID bigint not null comment '区分値明細ID'
  , CLASS_ID bigint not null comment '区分値ID'
  , CLASS_DTL_CD varchar(100) not null comment '区分値明細CD'
  , DICT_ID bigint not null comment '辞書ID'
  , VIEW_ORDER bigint comment '表示順'
  , DEFAULT_FLG char(1) default '0' not null comment 'デフォルトフラグ'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint B_CLASS_DTL_PK primary key (CLASS_DTL_ID)
) comment '区分値明細マスタ' ;

create unique index B_CLASS_DTL_IX1
  on B_CLASS_DTL(CLASS_ID,CLASS_DTL_CD);

create index B_CLASS_DTL_IX2
  on B_CLASS_DTL(CLASS_ID);

create index B_CLASS_DTL_IX3
  on B_CLASS_DTL(DICT_ID);

-- 区分値グループマスタ
create table B_CLASS_GRP (
  CLASS_GRP_ID bigint not null comment '区分値グループID'
  , CLASS_GRP_CD varchar(30) not null comment '区分値グループCD'
  , CLASS_GRP_COMMENT varchar(60) comment '区分値グループ解説'
  , CLASS_ID bigint not null comment '区分値ID'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint B_CLASS_GRP_PK primary key (CLASS_GRP_ID)
) comment '区分値グループマスタ' ;

create unique index B_CLASS_GRP_IX1
  on B_CLASS_GRP(CLASS_ID,CLASS_GRP_CD);

create index B_CLASS_GRP_IX2
  on B_CLASS_GRP(CLASS_ID);

-- 区分値グループ明細マスタ
create table B_CLASS_GRP_DTL (
  CLASS_GRP_DTL_ID bigint not null comment '区分値グループ明細ID'
  , CLASS_GRP_ID bigint not null comment '区分値グループID'
  , CLASS_DTL_ID bigint not null comment '区分値明細ID'
  , DEFAULT_FLG char(1) default '0' not null comment 'デフォルトフラグ'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint B_CLASS_GRP_DTL_PK primary key (CLASS_GRP_DTL_ID)
) comment '区分値グループ明細マスタ' ;

create unique index B_CLASS_GRP_DTL_IX1
  on B_CLASS_GRP_DTL(CLASS_GRP_ID,CLASS_DTL_ID);

create index B_CLASS_GRP_DTL_IX2
  on B_CLASS_GRP_DTL(CLASS_GRP_ID);

create index B_CLASS_GRP_DTL_IX3
  on B_CLASS_GRP_DTL(CLASS_DTL_ID);

-- 列マスタ
create table B_COL (
  COL_ID bigint not null comment '列ID'
  , ITEM_ID bigint not null comment '項目ID'
  , COL_CD varchar(100) comment '列CD'
  , DICT_ID bigint comment '辞書ID'
  , COL_ORDER bigint comment '列順序'
  , COL_TYPE varchar(30) comment '列型'
  , VISIBLE char(1) default '1' not null comment '表示可否'
  , EDITABLE char(1) default '1' not null comment '編集可否'
  , TEXT_ALIGN varchar(30) comment '表示位置'
  , NECESSARY char(1) default '0' not null comment '必須'
  , COL_WIDTH bigint comment '列幅'
  , IN_COL_INDEX bigint comment '入力ファイル列位置'
  , IN_COL_DEFAULT_VALUE varchar(255) comment '入力ファイル列規定値'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint B_COL_PK primary key (COL_ID)
) comment '列マスタ' ;

create unique index B_COL_IX1
  on B_COL(ITEM_ID,COL_CD);

create index B_COL_IX2
  on B_COL(DICT_ID);

create index B_COL_IX3
  on B_COL(ITEM_ID);

-- 列マスタ拡張基本
create table B_COL_EXT_BASE (
  COL_EXT_BASE_ID bigint not null comment '列マスタ拡張基本'
  , ITEM_ID bigint not null comment '項目ID'
  , COL_CD varchar(100) not null comment '列CD'
  , COL_ORDER bigint comment '列順序'
  , COL_WIDTH bigint comment '列幅'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint B_COL_EXT_BASE_PK primary key (COL_EXT_BASE_ID)
) comment '列マスタ拡張基本' ;

-- 列マスタ拡張ユーザ
create table B_COL_EXT_USER (
  COL_EXT_USER_ID bigint not null comment '列マスタ拡張ユーザID'
  , ITEM_ID bigint not null comment '項目ID'
  , COL_CD varchar(100) not null comment '列CD'
  , USER_ID bigint not null comment 'ユーザID'
  , COL_ORDER bigint comment '列順序'
  , COL_WIDTH bigint comment '列幅'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint B_COL_EXT_USER_PK primary key (COL_EXT_USER_ID)
) comment '列マスタ拡張ユーザ' ;

create unique index B_COL_EXT_USER_IX1
  on B_COL_EXT_USER(ITEM_ID,COL_CD,USER_ID);

-- 列権限マスタ
create table B_COL_ROLE (
  COL_ROLE_ID bigint not null comment '列権限ID'
  , COL_ID bigint not null comment '列ID'
  , ROLE_ID bigint not null comment '権限ID'
  , VISIBLE char(1) comment '表示可否'
  , EDITABLE char(1) comment '編集可否'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint B_COL_ROLE_PK primary key (COL_ROLE_ID)
) comment '列権限マスタ' ;

create unique index B_COL_ROLE_IX1
  on B_COL_ROLE(ROLE_ID,COL_ID);

create index B_COL_ROLE_IX2
  on B_COL_ROLE(ROLE_ID);

create index B_COL_ROLE_IX3
  on B_COL_ROLE(COL_ID);

-- 列検証マスタ
create table B_COL_VALID (
  COL_ID bigint not null comment '列ID'
  , INPUT_LIMIT varchar(100) comment '文字入力制限'
  , LIMIT_MESSAGE_CD varchar(100) comment '制限メッセージCD'
  , MIN_CHARS bigint comment '最小文字数'
  , MAX_CHARS bigint comment '最大文字数'
  , MIN_NUMBER decimal(14,4) comment '最小値'
  , MAX_NUMBER decimal(14,4) comment '最大値'
  , INTEGER_LENGTH bigint comment '整数桁数'
  , DECIMAL_LENGTH bigint comment '小数桁数'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint B_COL_VALID_PK primary key (COL_ID)
) comment '列検証マスタ' ;

-- カルチャマスタ
create table B_CULTURE (
  CULTURE_ID bigint not null comment 'カルチャID'
  , CULTURE_CD varchar(30) not null comment 'カルチャCD'
  , DICT_ID bigint comment '辞書ID'
  , LANG_CULTURE_ID bigint comment '言語カルチャID'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint B_CULTURE_PK primary key (CULTURE_ID)
) comment 'カルチャマスタ' ;

create unique index B_CULTURE_IX1
  on B_CULTURE(CULTURE_CD);

create index B_CULTURE_IX2
  on B_CULTURE(DICT_ID);

-- カルチャ属性マスタ
create table B_CULTURE_ATTRIBUTE (
  CULTURE_ID bigint not null comment 'カルチャID'
  , DATE_TIME_FORMAT_DISPLAY varchar(30) comment '日時書式（画面）'
  , DATE_TIME_FORMAT_REPORT varchar(30) comment '日時書式（帳票）'
  , DATE_TIME_FORMAT_EXCEL varchar(30) comment '日時書式（Excel）'
  , DATE_TIME_FORMAT_TEXT varchar(30) comment '日時書式（Text）'
  , DATE_FORMAT_DISPLAY varchar(30) comment '日付書式（画面）'
  , DATE_FORMAT_REPORT varchar(30) comment '日付書式（帳票）'
  , DATE_FORMAT_EXCEL varchar(30) comment '日付書式（Excel）'
  , DATE_FORMAT_TEXT varchar(30) comment '日付書式（Text）'
  , TIME_FORMAT_DISPLAY varchar(30) comment '時間書式（画面）'
  , TIME_FORMAT_REPORT varchar(30) comment '時間書式（帳票）'
  , TIME_FORMAT_EXCEL varchar(30) comment '時間書式（Excel）'
  , TIME_FORMAT_TEXT varchar(30) comment '時間書式（Text）'
  , NUMBER_FORMAT_DISPLAY varchar(30) comment '数値書式（画面）'
  , NUMBER_FORMAT_REPORT varchar(30) comment '数値書式（帳票）'
  , NUMBER_FORMAT_EXCEL varchar(30) comment '数値書式（Excel）'
  , NUMBER_FORMAT_TEXT varchar(30) comment '数値書式（Text）'
  , CURRENCY_FORMAT_REPORT varchar(30) comment '通貨書式（帳票）'
  , FONT_NAME_EXCEL varchar(60) comment 'フォント名称（Excel）'
  , FONT_SIZE_EXCEL decimal(14,4) comment 'フォントサイズ（Excel）'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint B_CULTURE_ATTRIBUTE_PK primary key (CULTURE_ID)
) comment 'カルチャ属性マスタ' ;

-- 辞書マスタ
create table B_DICT (
  DICT_ID bigint not null comment '辞書ID'
  , DICT_NM varchar(100) not null comment '辞書名'
  , DATA_TYPE varchar(30) comment 'データ型'
  , SYSTEM_TYPE varchar(30) comment 'システム種別'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint B_DICT_PK primary key (DICT_ID)
) comment '辞書マスタ' ;

create unique index B_DICT_IX1
  on B_DICT(DICT_NM);

-- 辞書カルチャマスタ
create table B_DICT_CULTURE (
  DICT_CULTURE_ID bigint not null comment '辞書カルチャID'
  , DICT_ID bigint not null comment '辞書ID'
  , CULTURE_ID bigint not null comment 'カルチャID'
  , DICT_NM varchar(100) not null comment '辞書名'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint B_DICT_CULTURE_PK primary key (DICT_CULTURE_ID)
) comment '辞書カルチャマスタ' ;

create unique index B_DICT_CULTURE_IX1
  on B_DICT_CULTURE(DICT_ID,CULTURE_ID);

create index B_DICT_CULTURE_IX2
  on B_DICT_CULTURE(CULTURE_ID);

create index B_DICT_CULTURE_IX3
  on B_DICT_CULTURE(DICT_ID);

-- 辞書検証マスタ
create table B_DICT_VALID (
  DICT_ID bigint not null comment '辞書ID'
  , INPUT_LIMIT varchar(100) comment '文字入力制限'
  , LIMIT_MESSAGE_CD varchar(100) comment '制限メッセージCD'
  , MIN_CHARS bigint comment '最小文字数'
  , MAX_CHARS bigint comment '最大文字数'
  , MIN_NUMBER decimal(14,4) comment '最小値'
  , MAX_NUMBER decimal(14,4) comment '最大値'
  , INTEGER_LENGTH bigint comment '整数桁数'
  , DECIMAL_LENGTH bigint comment '小数桁数'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint B_DICT_VALID_PK primary key (DICT_ID)
) comment '辞書検証マスタ' ;

-- 変更ログ
create table B_DML_LOG (
  DML_LOG_ID bigint not null comment '変更ログID'
  , DML_KBN varchar(30) comment '変更区分'
  , DML_TABLE_NM varchar(30) comment '変更テーブル名'
  , DML_COLUMN_NM varchar(30) comment '変更列名'
  , DML_ROW_ID bigint comment '変更行ID'
  , DML_BEFORE_VALUE varchar(255) comment '変更前値'
  , DML_AFTER_VALUE varchar(255) comment '変更後値'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint B_DML_LOG_PK primary key (DML_LOG_ID)
) comment '変更ログ' ;

-- 機能マスタ
create table B_FUNC (
  FUNC_ID bigint not null comment '機能ID'
  , CLASS_CD varchar(100) not null comment 'クラス名'
  , METHOD_CD varchar(100) not null comment 'メソッド名'
  , FUNC_CD varchar(100) comment '機能名'
  , FUNC_NM varchar(60) comment '機能名称'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint B_FUNC_PK primary key (FUNC_ID)
) comment '機能マスタ' ;

create unique index B_FUNC_IX1
  on B_FUNC(CLASS_CD,METHOD_CD);

-- 機能権限マスタ
create table B_FUNC_ROLE (
  FUNC_ROLE_ID bigint not null comment '機能権限ID'
  , FUNC_ID bigint not null comment '機能ID'
  , ROLE_ID bigint not null comment '権限ID'
  , USABLE char(1) not null comment '使用可否'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint B_FUNC_ROLE_PK primary key (FUNC_ROLE_ID)
) comment '機能権限マスタ' ;

create unique index B_FUNC_ROLE_IX1
  on B_FUNC_ROLE(ROLE_ID,FUNC_ID);

create index B_FUNC_ROLE_IX2
  on B_FUNC_ROLE(FUNC_ID);

create index B_FUNC_ROLE_IX3
  on B_FUNC_ROLE(ROLE_ID);

-- お知らせマスタ
create table B_INFO (
  INFO_ID bigint not null comment 'お知らせID'
  , CULTURE_ID bigint not null comment 'カルチャID'
  , INFO_NM varchar(255) comment 'お知らせ'
  , INFO_START_DT varchar(8) comment '開始日付'
  , INFO_END_DT varchar(8) comment '終了日付'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint B_INFO_PK primary key (INFO_ID)
) comment 'お知らせマスタ' ;

create index B_INFO_IX1
  on B_INFO(CULTURE_ID);

-- 項目マスタ
create table B_ITEM (
  ITEM_ID bigint not null comment '項目ID'
  , SCREEN_ID bigint not null comment '画面ID'
  , ITEM_CD varchar(100) not null comment '項目CD'
  , DICT_ID bigint comment '辞書ID'
  , ITEM_TYPE varchar(30) comment '項目型'
  , VISIBLE char(1) default '1' not null comment '表示可否'
  , EDITABLE char(1) default '1' not null comment '編集可否'
  , TEXT_ALIGN varchar(30) comment '表示位置'
  , NECESSARY char(1) default '0' not null comment '必須'
  , DISPLAY_REQUIRED char(1) default '1' not null comment '表示必須'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint B_ITEM_PK primary key (ITEM_ID)
) comment '項目マスタ' ;

create unique index B_ITEM_IX1
  on B_ITEM(ITEM_CD,SCREEN_ID);

create index B_ITEM_IX2
  on B_ITEM(DICT_ID);

create index B_ITEM_IX3
  on B_ITEM(SCREEN_ID);

-- 項目権限マスタ
create table B_ITEM_ROLE (
  ITEM_ROLE_ID bigint not null comment '項目権限ID'
  , ROLE_ID bigint not null comment '権限ID'
  , ITEM_ID bigint not null comment '項目ID'
  , VISIBLE char(1) comment '表示可否'
  , EDITABLE char(1) comment '編集可否'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint B_ITEM_ROLE_PK primary key (ITEM_ROLE_ID)
) comment '項目権限マスタ' ;

create unique index B_ITEM_ROLE_IX1
  on B_ITEM_ROLE(ROLE_ID,ITEM_ID);

create index B_ITEM_ROLE_IX2
  on B_ITEM_ROLE(ROLE_ID);

create index B_ITEM_ROLE_IX3
  on B_ITEM_ROLE(ITEM_ID);

-- 項目検証マスタ
create table B_ITEM_VALID (
  ITEM_ID bigint not null comment '項目ID'
  , INPUT_LIMIT varchar(100) comment '文字入力制限'
  , LIMIT_MESSAGE_CD varchar(100) comment '制限メッセージCD'
  , MIN_CHARS bigint comment '最小文字数'
  , MAX_CHARS bigint comment '最大文字数'
  , MIN_NUMBER decimal(14,4) comment '最小値'
  , MAX_NUMBER decimal(14,4) comment '最大値'
  , INTEGER_LENGTH bigint comment '整数桁数'
  , DECIMAL_LENGTH bigint comment '小数桁数'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint B_ITEM_VALID_PK primary key (ITEM_ID)
) comment '項目検証マスタ' ;

-- ログ
create table B_LOG (
  LOG_ID bigint not null comment 'ログID'
  , LOG_STATUS varchar(30) not null comment 'ログステータス'
  , LOG_GROUP_CD varchar(100) comment 'ロググループCD'
  , LOG_GROUP_NM varchar(60) comment 'ロググループ名称'
  , LOG_GROUP_PROCESS_ID bigint comment 'ロググループ処理ID'
  , PGM_CD varchar(100) comment 'プログラムCD'
  , PGM_NM varchar(60) comment 'プログラム名称'
  , PROCESS_START_DT datetime(3) not null comment '処理開始日時'
  , PROCESS_END_DT datetime(3) comment '処理終了日時'
  , ATTRIBUTE1 varchar(100) comment '属性1'
  , ATTRIBUTE2 varchar(100) comment '属性2'
  , ATTRIBUTE3 varchar(100) comment '属性3'
  , ATTRIBUTE4 varchar(100) comment '属性4'
  , ATTRIBUTE5 varchar(100) comment '属性5'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint B_LOG_PK primary key (LOG_ID)
) comment 'ログ' ;

create index B_LOG_IX1
  on B_LOG(PROCESS_START_DT);

create index B_LOG_IX2
  on B_LOG(PROCESS_END_DT);

-- ログ明細
create table B_LOG_DTL (
  LOG_DTL_ID bigint not null comment 'ログ明細ID'
  , LOG_ID bigint not null comment 'ログID'
  , LOG_DTL_TYPE varchar(30) not null comment 'ログ明細種別'
  , LOG_DTL_STATUS varchar(30) not null comment 'ログ明細ステータス'
  , LOG_DTL_SECTION_ID bigint comment 'ログ明細セクションID'
  , LOG_DTL_SECTION_NM varchar(60) comment 'ログ明細セクション名称'
  , PROCESS_INFO longtext not null comment '処理情報'
  , PROCESS_DT datetime(3) not null comment '処理日時'
  , MESSAGE_REPLACE_STRING1 longtext comment 'メッセージ差替文字列1'
  , MESSAGE_REPLACE_STRING2 longtext comment 'メッセージ差替文字列2'
  , MESSAGE_REPLACE_STRING3 longtext comment 'メッセージ差替文字列3'
  , MESSAGE_REPLACE_STRING4 longtext comment 'メッセージ差替文字列4'
  , MESSAGE_REPLACE_STRING5 longtext comment 'メッセージ差替文字列5'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint B_LOG_DTL_PK primary key (LOG_DTL_ID)
) comment 'ログ明細' ;

create index B_LOG_DTL_IX1
  on B_LOG_DTL(LOG_ID);

-- メニューマスタ
create table B_MENU (
  MENU_ID bigint not null comment 'メニューID'
  , MENU_GRP_ID bigint not null comment 'メニューグループID'
  , SCREEN_ID bigint comment '画面ID'
  , DICT_ID bigint comment '辞書ID'
  , URL_PATH varchar(255) comment 'URLパス'
  , VIEW_ORDER bigint comment '表示順'
  , TARGET_WINDOW varchar(30) comment 'ターゲットウインドウ'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint B_MENU_PK primary key (MENU_ID)
) comment 'メニューマスタ' ;

create index B_MENU_IX1
  on B_MENU(MENU_GRP_ID);

create index B_MENU_IX2
  on B_MENU(SCREEN_ID);

create index B_MENU_IX3
  on B_MENU(DICT_ID);

-- メニューグループマスタ
create table B_MENU_GRP (
  MENU_GRP_ID bigint not null comment 'メニューグループID'
  , MENU_GRP_CD varchar(30) not null comment 'メニューグループCD'
  , DICT_ID bigint not null comment '辞書ID'
  , PARENT_MENU_GRP_ID bigint comment '親メニューグループID'
  , VIEW_ORDER bigint comment '表示順'
  , VISIBLE_TYPE varchar(30) comment '表示種別'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint B_MENU_GRP_PK primary key (MENU_GRP_ID)
) comment 'メニューグループマスタ' ;

create unique index B_MENU_GRP_IX1
  on B_MENU_GRP(MENU_GRP_CD);

create index B_MENU_GRP_IX2
  on B_MENU_GRP(DICT_ID);

create index B_MENU_GRP_IX3
  on B_MENU_GRP(PARENT_MENU_GRP_ID);

-- メッセージマスタ
create table B_MESSAGE (
  MESSAGE_ID bigint not null comment 'メッセージID'
  , MESSAGE_CD varchar(100) comment 'メッセージCD'
  , MESSAGE_NM varchar(255) comment 'メッセージ'
  , MESSAGE_ABBR varchar(255) comment 'メッセージ略称'
  , MESSAGE_TYPE varchar(30) comment '属性'
  , SYSTEM_TYPE varchar(30) comment 'システム種別'
  , CULTURE_ID bigint not null comment 'カルチャID'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint B_MESSAGE_PK primary key (MESSAGE_ID)
) comment 'メッセージマスタ' ;

create unique index B_MESSAGE_IX1
  on B_MESSAGE(MESSAGE_CD,CULTURE_ID);

create index B_MESSAGE_IX2
  on B_MESSAGE(CULTURE_ID);

-- 採番マスタ
create table B_NUMBERING (
  NUMBERING_ID bigint not null comment '採番ID'
  , BIZ_CD varchar(30) not null comment '業務CD'
  , BIZ_NM varchar(60) not null comment '業務名称'
  , LENGTH bigint not null comment '桁数'
  , FIXED_VALUE varchar(30) comment '固定値'
  , FIXED_DT_FORMAT varchar(30) comment '固定日付フォーマット'
  , PRESENT_NUMBER bigint not null comment '現在値'
  , INC_NUMBER bigint not null comment '増分値'
  , MIN_NUMBER bigint not null comment '最小値'
  , MAX_NUMBER bigint not null comment '最大値'
  , CHECK_DIGIT varchar(30) comment 'チェックディジット'
  , SYSTEM_TYPE varchar(30) comment 'システム種別'
  , CASH_COUNT bigint default 0 comment 'キャッシュ数'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint B_NUMBERING_PK primary key (NUMBERING_ID)
) comment '採番マスタ' ;

create unique index B_NUMBERING_IX1
  on B_NUMBERING(BIZ_CD);

-- パスワードポリシーマスタ
create table B_PASSWORD_POLICY (
  PASSWORD_POLICY_ID bigint not null comment 'パスワードポリシーID'
  , PASSWORD_POLICY_NM varchar(60) not null comment 'パスワードポリシー名称'
  , FIRST_CHANGE_CONTROL varchar(30) default '00' not null comment '初回変更制御'
  , MIN_LENGTH bigint default 0 not null comment '最小桁数'
  , MIN_ALPHA bigint default 0 not null comment '最小英字桁数'
  , MIN_LOWER_CASE bigint default 0 not null comment '最小小文字桁数'
  , MIN_UPPER_CASE bigint default 0 not null comment '最小大文字桁数'
  , MIN_NUMBERS bigint default 0 not null comment '最小数字桁数'
  , MIN_SYMBOL bigint default 0 not null comment '最小記号桁数'
  , MAX_AGE bigint default 0 not null comment '有効期限'
  , MAX_FAILURE bigint default 0 not null comment '失敗回数'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint B_PASSWORD_POLICY_PK primary key (PASSWORD_POLICY_ID)
) comment 'パスワードポリシーマスタ' ;

create unique index B_PASSWORD_POLICY_IX1
  on B_PASSWORD_POLICY(PASSWORD_POLICY_NM);

-- プロパティマスタ
create table B_PROPERTY (
  PROPERTY_ID bigint not null comment 'プロパティID'
  , PROPERTY_NM varchar(60) not null comment '項目名'
  , PROPERTY_VALUE varchar(60) not null comment '項目値'
  , PROPERTY_COMMENT varchar(60) comment '項目値解説'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint B_PROPERTY_PK primary key (PROPERTY_ID)
) comment 'プロパティマスタ' ;

create unique index B_PROPERTY_IX1
  on B_PROPERTY(PROPERTY_NM);

-- 権限マスタ
create table B_ROLE (
  ROLE_ID bigint not null comment '権限ID'
  , ROLE_CD varchar(30) not null comment '権限CD'
  , DICT_ID bigint comment '辞書ID'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint B_ROLE_PK primary key (ROLE_ID)
) comment '権限マスタ' ;

create unique index B_ROLE_IX1
  on B_ROLE(ROLE_CD);

create index B_ROLE_IX2
  on B_ROLE(DICT_ID);

-- 権限グループマスタ
create table B_ROLE_GRP (
  ROLE_GRP_ID bigint not null comment '権限グループID'
  , ROLE_GRP_CD varchar(30) not null comment '権限グループCD'
  , DICT_ID bigint comment '辞書ID'
  , ROLE_CONTROL_CLASS varchar(30) not null comment '権限制御区分'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint B_ROLE_GRP_PK primary key (ROLE_GRP_ID)
) comment '権限グループマスタ' ;

create unique index B_ROLE_GRP_IX1
  on B_ROLE_GRP(ROLE_GRP_CD,DICT_ID);

create index B_ROLE_GRP_IX2
  on B_ROLE_GRP(DICT_ID);

-- 権限グループ明細マスタ
create table B_ROLE_GRP_DTL (
  ROLE_GRP_DTL_ID bigint not null comment '権限グループ明細ID'
  , ROLE_GRP_ID bigint not null comment '権限グループID'
  , ROLE_ID bigint not null comment '権限ID'
  , APPLY_ORDER bigint not null comment '適用順序'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint B_ROLE_GRP_DTL_PK primary key (ROLE_GRP_DTL_ID)
) comment '権限グループ明細マスタ' ;

create unique index B_ROLE_GRP_DTL_IX1
  on B_ROLE_GRP_DTL(ROLE_GRP_ID,ROLE_ID,APPLY_ORDER);

create index B_ROLE_GRP_DTL_IX2
  on B_ROLE_GRP_DTL(ROLE_GRP_ID);

create index B_ROLE_GRP_DTL_IX3
  on B_ROLE_GRP_DTL(ROLE_ID);

-- 画面マスタ
create table B_SCREEN (
  SCREEN_ID bigint not null comment '画面ID'
  , SCREEN_CD varchar(100) not null comment '画面CD'
  , DICT_ID bigint comment '辞書ID'
  , SYSTEM_TYPE varchar(30) comment 'システム種別'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint B_SCREEN_PK primary key (SCREEN_ID)
) comment '画面マスタ' ;

create unique index B_SCREEN_IX1
  on B_SCREEN(SCREEN_CD);

create index B_SCREEN_IX2
  on B_SCREEN(DICT_ID);

-- 画面権限マスタ
create table B_SCREEN_ROLE (
  SCREEN_ROLE_ID bigint not null comment '画面権限ID'
  , ROLE_ID bigint not null comment '権限ID'
  , SCREEN_ID bigint not null comment '画面ID'
  , VISIBLE char(1) not null comment '表示可否'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint B_SCREEN_ROLE_PK primary key (SCREEN_ROLE_ID)
) comment '画面権限マスタ' ;

create unique index B_SCREEN_ROLE_IX1
  on B_SCREEN_ROLE(ROLE_ID,SCREEN_ID);

create index B_SCREEN_ROLE_IX2
  on B_SCREEN_ROLE(ROLE_ID);

create index B_SCREEN_ROLE_IX3
  on B_SCREEN_ROLE(SCREEN_ID);

-- システム管理マスタ
create table B_SYSTEM (
  SYSTEM_ID bigint not null comment 'システムID'
  , SYSTEM_NM varchar(60) comment 'システム名称'
  , TIME_ZONE_ID bigint comment 'タイムゾーンID'
  , PASSWORD varchar(255) comment 'パスワード'
  , SALT varchar(100) comment 'ソルト'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint B_SYSTEM_PK primary key (SYSTEM_ID)
) comment 'システム管理マスタ' ;

-- システムログ
create table B_SYSTEM_LOG (
  SYSTEM_LOG_ID bigint not null comment 'システムログID'
  , SYSTEM_LOG_PROCESS_ID bigint not null comment 'システムログ処理ID'
  , SYSTEM_LOG_TYPE varchar(30) not null comment 'システムログ種別'
  , SYSTEM_LOG_STATUS varchar(30) not null comment 'システムログステータス'
  , CLASS_CD varchar(100) not null comment 'クラス名'
  , METHOD_CD varchar(100) not null comment 'メソッド名'
  , PROCESS_INFO longtext not null comment '処理情報'
  , PROCESS_DT datetime(3) not null comment '処理日時'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint B_SYSTEM_LOG_PK primary key (SYSTEM_LOG_ID)
) comment 'システムログ' ;

-- 端末マスタ
create table B_TERMINAL (
  TERMINAL_ID bigint not null comment '端末ID'
  , TERMINAL_CD varchar(30) not null comment '端末CD'
  , TERMINAL_NM varchar(60) comment '端末名'
  , UUID varchar(100) comment 'UUID'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint B_TERMINAL_PK primary key (TERMINAL_ID)
) comment '端末マスタ' ;

create unique index B_TERMINAL_IX1
  on B_TERMINAL(TERMINAL_CD);

create unique index B_TERMINAL_IX2
  on B_TERMINAL(UUID);

-- タイムゾーンマスタ
create table B_TIME_ZONE (
  TIME_ZONE_ID bigint not null comment 'タイムゾーンID'
  , TIME_ZONE_CD varchar(30) not null comment 'タイムゾーンCD'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint B_TIME_ZONE_PK primary key (TIME_ZONE_ID)
) comment 'タイムゾーンマスタ' ;

create unique index B_TIME_ZONE_IX1
  on B_TIME_ZONE(TIME_ZONE_CD);

-- トークン
create table B_TOKEN (
  TOKEN_ID bigint not null comment 'トークンID'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint B_TOKEN_PK primary key (TOKEN_ID)
) comment 'トークン' ;

-- ユーザマスタ
create table B_USER (
  USER_ID bigint not null comment 'ユーザID'
  , USER_CD varchar(30) not null comment 'ユーザCD'
  , USER_NM varchar(60) not null comment 'ユーザ名'
  , CULTURE_ID bigint not null comment 'カルチャID'
  , ROLE_GRP_ID bigint comment '権限グループID'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint B_USER_PK primary key (USER_ID)
) comment 'ユーザマスタ' ;

create unique index B_USER_IX1
  on B_USER(USER_CD);

create index B_USER_IX2
  on B_USER(CULTURE_ID);

create index B_USER_IX3
  on B_USER(ROLE_GRP_ID);

-- ユーザ認証マスタ
create table B_USER_AUTH (
  USER_ID bigint not null comment 'ユーザID'
  , PASSWORD varchar(255) comment 'パスワード'
  , SALT varchar(100) not null comment 'ソルト'
  , PASSWORD_RESET char(1) default '0' not null comment 'パスワードリセット'
  , PASSWORD_MODIFIED_DATE datetime(3) comment 'パスワード変更日時'
  , LAST_LOGIN_DATE datetime(3) comment '最終ログイン日時'
  , LAST_FAILED_LOGIN_DATE datetime(3) comment '最終ログイン失敗日時'
  , FAILED_LOGIN_ATTEMPTS bigint default 0 not null comment 'ログイン失敗回数'
  , LOCKOUT char(1) default '0' not null comment 'ロックアウト'
  , LOCKOUT_DATE datetime(3) comment 'ロックアウト日時'
  , AVAILABLE_START_DATE datetime(3) not null comment '利用可能開始日'
  , AVAILABLE_END_DATE datetime(3) not null comment '利用可能終了日'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint B_USER_AUTH_PK primary key (USER_ID)
) comment 'ユーザ認証マスタ' ;

create unique index B_USER_AUTH_IX1
  on B_USER_AUTH(SALT);

-- バーコードラベル受信テーブル
create table E_BARCODE_LABEL (
  BARCODE_LABEL_ID bigint not null comment 'バーコードラベル受信ID'
  , RECEIVE_ID bigint not null comment '受信ID'
  , RECEIVE_ROW_ID bigint not null comment '受信行ID'
  , IMPORT_FLG char(1) default '0' not null comment '取込みフラグ'
  , ERROR_FLG char(1) default '0' not null comment 'エラーフラグ'
  , ERROR_MESSAGE_CD varchar(100) comment 'エラーメッセージCD'
  , BARCODE varchar(255) comment 'バーコード'
  , BARCODE_NM varchar(255) comment 'バーコード名称'
  , BARCODE_LABEL_COMMENT varchar(255) comment '備考'
  , OUTPUT_CNT varchar(255) comment '出力枚数'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint E_BARCODE_LABEL_PK primary key (BARCODE_LABEL_ID)
) comment 'バーコードラベル受信テーブル' ;

create unique index E_BARCODE_LABEL_IX1
  on E_BARCODE_LABEL(RECEIVE_ID,RECEIVE_ROW_ID);

create index E_BARCODE_LABEL_IX2
  on E_BARCODE_LABEL(RECEIVE_ID);

-- 取引先マスタ受信テーブル
create table E_CUSTOMER (
  CUSTOMER_ID bigint not null comment '取引先マスタ受信ID'
  , RECEIVE_CD varchar(30) not null comment '受信CD'
  , RECEIVE_ROW_ID bigint not null comment '受信行ID'
  , IMPORT_FLG char(1) default '0' not null comment '取込みフラグ'
  , ERROR_FLG char(1) default '0' not null comment 'エラーフラグ'
  , ERROR_MESSAGE_CD varchar(100) comment 'エラーメッセージCD'
  , CLIENT_CD varchar(255) comment '荷主CD'
  , CUSTOMER_CD varchar(255) comment '取引先CD'
  , CUSTOMER_NM varchar(255) comment '取引先名称'
  , CUSTOMER_ABBR varchar(255) comment '取引先略称'
  , VENDOR_FLG varchar(255) comment '仕入先フラグ'
  , DELIVERY_FLG varchar(255) comment '納品先フラグ'
  , ONETIME_FLG varchar(255) comment 'ワンタイムフラグ'
  , DEPOSIT_FLG varchar(255) comment '預託先フラグ'
  , ZIP_CD varchar(255) comment '郵便番号'
  , ADDRESS1 varchar(255) comment '住所1'
  , ADDRESS2 varchar(255) comment '住所2'
  , ADDRESS3 varchar(255) comment '住所3'
  , TEL_NO varchar(255) comment '電話番号'
  , ALLOC_ORDER varchar(255) comment '引当順序'
  , SHIPPING_STOP_FLG varchar(255) default '0' comment '出荷停止フラグ'
  , LOT_REVERSE_FLG varchar(255) default '0' comment 'ロット逆転防止フラグ'
  , LIMIT_DT_REVERSE_FLG varchar(255) default '0' comment '期限日逆転防止フラグ'
  , CENTER_CD varchar(255) comment 'センタCD'
  , DELIVERY_COURSE_CD varchar(255) comment '配送コースCD'
  , DELIVERY_ORDER varchar(255) comment '配送順'
  , DELIVERY_READTIME varchar(255) comment '配送リードタイム'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint E_CUSTOMER_PK primary key (CUSTOMER_ID)
) comment '取引先マスタ受信テーブル' ;

create unique index E_CUSTOMER_IX1
  on E_CUSTOMER(RECEIVE_CD,RECEIVE_ROW_ID);

create index E_CUSTOMER_IX2
  on E_CUSTOMER(RECEIVE_CD);

-- 流通加工情報送信テーブル
create table E_DISTRIBUTION (
  DISTRIBUTION_ID bigint not null comment '流通加工情報送信ID'
  , SEND_FLG char(1) default '0' not null comment '送信済フラグ'
  , STORE_SLIP_NO varchar(30) comment '入庫伝票番号'
  , STORE_SLIP_ROW_NO varchar(30) comment '入庫明細番号'
  , STORE_REASON_CD varchar(30) comment '入庫発生事由'
  , SHIPPING_SLIP_NO varchar(30) comment '出荷伝票番号'
  , SHIPPING_SLIP_ROW_NO varchar(30) comment '出荷伝票明細番号'
  , SHIPPING_REASON_CD varchar(30) comment '出荷発生事由'
  , STORE_PLANT_CD varchar(30) comment '入庫プラント'
  , STORE_STORAGE_SPACE_CD varchar(30) comment '入庫保管場所'
  , SHIPPING_PLANT_CD varchar(30) comment '出庫プラント'
  , SHIPPING_STORAGE_SPACE_CD varchar(30) comment '出庫保管場所'
  , HINMOKU_CD varchar(100) comment '品目CD'
  , HINMOKU_TEXT varchar(60) comment '品目テキスト'
  , JAN_CD varchar(30) comment 'JANCD'
  , NUM varchar(30) comment '数量'
  , WMS_ADD_YYYY varchar(30) comment 'WMS作成日_年'
  , WMS_ADD_MM varchar(30) comment 'WMS作成日_月'
  , WMS_ADD_DD varchar(30) comment 'WMS作成日_日'
  , WMS_ADD_HH varchar(30) comment 'WMS作成時間_時'
  , WMS_ADD_MI varchar(30) comment 'WMS作成時間_分'
  , WMS_ADD_SS varchar(30) comment 'WMS作成時間_秒'
  , WMS_ADD_USER_CD varchar(30) comment 'WMS作成者'
  , WMS_UPD_YYYY varchar(30) comment 'WMS更新日_年'
  , WMS_UPD_MM varchar(30) comment 'WMS更新日_月'
  , WMS_UPD_DD varchar(30) comment 'WMS更新日_日'
  , WMS_UPD_HH varchar(30) comment 'WMS更新時間_時'
  , WMS_UPD_MI varchar(30) comment 'WMS更新時間_分'
  , WMS_UPD_SS varchar(30) comment 'WMS更新時間_秒'
  , WMS_UPD_USER_CD varchar(30) comment 'WMS更新者'
  , SPARE_STR varchar(255) comment '予備'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint E_DISTRIBUTION_PK primary key (DISTRIBUTION_ID)
) comment '流通加工情報送信テーブル' ;

-- 個体管理情報連携送信テーブル
create table E_ID_MANAG (
  ID_MANAG_ID bigint not null comment '個体管理情報連携送信ID'
  , SEND_FLG char(1) default '0' not null comment '送信済フラグ'
  , ID_MANAG_NO varchar(30) comment '個体管理番号'
  , TENHANSHA_CD varchar(30) comment '店販社CD'
  , SALES_ORG_CD varchar(30) comment '販売組織CD'
  , CUSTOMER_CD varchar(30) comment '取引先CD'
  , HINMOKU_CD varchar(100) comment '品目CD'
  , HINMOKU_TEXT varchar(100) comment '品目テキスト'
  , JAN_CD varchar(30) comment 'JANCD'
  , UNIT_NM varchar(30) comment '単位名称'
  , SHARED_PRODUCT_TYPE_CD varchar(30) comment '共有商品区分'
  , CUSTOMER_ORDER_NO varchar(30) comment '取引先注文番号'
  , DELIV_CD varchar(30) comment '納入先CD'
  , DESTINATION_ZIP_CD varchar(30) comment '送り先郵便番号'
  , DESTINATION_ADDRESS1 varchar(60) comment '送り先住所１'
  , DESTINATION_ADDRESS2 varchar(60) comment '送り先住所２'
  , DESTINATION_NM1 varchar(60) comment '送り先名称１'
  , DESTINATION_NM2 varchar(60) comment '送り先名称２'
  , DESTINATION_TEL varchar(30) comment '送り先電話番号'
  , EMP_ID_CD varchar(30) comment '社員識別コード'
  , EMP_NM varchar(60) comment '氏名'
  , STORE_DT varchar(30) comment '入庫日'
  , INVENTORY_DT varchar(30) comment '棚卸日'
  , PICKING_DT varchar(30) comment '出庫日'
  , PRODUCT_RETURN_DT varchar(30) comment '良品返却日'
  , WASTE_RETURN_DT varchar(30) comment '廃棄返却日'
  , ID_MANAG_ABOLITION_TYPE_CD varchar(30) comment '個体管理廃止区分'
  , SPARE_TYPE_CD varchar(30) comment '予備区分'
  , DATA_EXT_FLG_PICKING varchar(30) comment '提供データ抽出済_出庫'
  , DATA_ADD_DT_PICKING varchar(30) comment '提供データ作成日_出庫'
  , DATA_EXT_FLG_RETURN varchar(30) comment '提供データ抽出済_良返'
  , DATA_ADD_DT_RETURN varchar(30) comment '提供データ作成日_良返'
  , DATA_EXT_FLG_WASTE varchar(30) comment '提供データ抽出済_廃棄'
  , DATA_ADD_DT_WASTE varchar(30) comment '提供データ作成日_廃棄'
  , SPARE_STR varchar(255) comment '予備'
  , WMS_ADD_YYYY varchar(30) comment 'WMS作成日_年'
  , WMS_ADD_MM varchar(30) comment 'WMS作成日_月'
  , WMS_ADD_DD varchar(30) comment 'WMS作成日_日'
  , WMS_ADD_HH varchar(30) comment 'WMS作成時間_時'
  , WMS_ADD_MI varchar(30) comment 'WMS作成時間_分'
  , WMS_ADD_SS varchar(30) comment 'WMS作成時間_秒'
  , WMS_ADD_USER_CD varchar(30) comment 'WMS作成者'
  , WMS_UPD_YYYY varchar(30) comment 'WMS更新日_年'
  , WMS_UPD_MM varchar(30) comment 'WMS更新日_月'
  , WMS_UPD_DD varchar(30) comment 'WMS更新日_日'
  , WMS_UPD_HH varchar(30) comment 'WMS更新時間_時'
  , WMS_UPD_MI varchar(30) comment 'WMS更新時間_分'
  , WMS_UPD_SS varchar(30) comment 'WMS更新時間_秒'
  , WMS_UPD_USER_CD varchar(30) comment 'WMS更新者'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint E_ID_MANAG_PK primary key (ID_MANAG_ID)
) comment '個体管理情報連携送信テーブル' ;

-- 棚卸指示(明細)受信テーブル
create table E_INVENTORY_INST_DTL (
  INVENTORY_INST_DTL_ID bigint not null comment '棚卸指示_明細受信ID'
  , RECEIVE_CD varchar(30) not null comment '受信CD'
  , RECEIVE_ROW_ID bigint not null comment '受信行ID'
  , IMPORT_FLG char(1) default '0' not null comment '取込みフラグ'
  , ERROR_FLG char(1) default '0' not null comment 'エラーフラグ'
  , ERROR_MESSAGE_CD varchar(100) comment 'エラーメッセージCD'
  , INVENTORY_SLIP_NO varchar(30) comment '実地棚卸伝票番号'
  , INVENTORY_SLIP_ROW_NO varchar(30) comment '実地棚卸伝票明細番号'
  , PLANT_CD varchar(30) comment 'プラントCD'
  , STORAGE_SPACE_CD varchar(30) comment '保管場所'
  , REFERENCE_DT varchar(30) comment '基準日'
  , UNIT_NM varchar(30) comment '単位名称'
  , SAP_ADD_YYYY varchar(30) comment 'SAP作成日_年'
  , SAP_ADD_MM varchar(30) comment 'SAP作成日_月'
  , SAP_ADD_DD varchar(30) comment 'SAP作成日_日'
  , SAP_ADD_HH varchar(30) comment 'SAP作成時間_時'
  , SAP_ADD_MI varchar(30) comment 'SAP作成時間_分'
  , SAP_ADD_SS varchar(30) comment 'SAP作成時間_秒'
  , SAP_ADD_USER_CD varchar(30) comment 'SAP作成者'
  , SAP_UPD_YYYY varchar(30) comment 'SAP更新日_年'
  , SAP_UPD_MM varchar(30) comment 'SAP更新日_月'
  , SAP_UPD_DD varchar(30) comment 'SAP更新日_日'
  , SAP_UPD_HH varchar(30) comment 'SAP更新時間_時'
  , SAP_UPD_MI varchar(30) comment 'SAP更新時間_分'
  , SAP_UPD_SS varchar(30) comment 'SAP更新時間_秒'
  , SAP_UPD_USER_CD varchar(30) comment 'SAP更新者'
  , PRODUCT_NM_KANJI varchar(60) comment '品名漢字'
  , BARCODE varchar(30) comment 'バーコード'
  , DEPOSIT_JAN_CD varchar(30) comment '預かりJANCD'
  , TENHANSHA_CD varchar(30) comment '店販社CD'
  , TENHANSHA_NM1 varchar(60) comment '店販社名1'
  , TENHANSHA_NM2 varchar(60) comment '店販社名2'
  , SAP_USER_CD varchar(30) comment 'ユーザCD'
  , SAP_USER_NM varchar(60) comment 'ユーザ名称'
  , PRODUCT_TYPE varchar(30) comment '商品種別'
  , ALLOC_TYPE_CD varchar(30) comment '引当区分'
  , SPARE_STR varchar(255) comment '予備'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint E_INVENTORY_INST_DTL_PK primary key (INVENTORY_INST_DTL_ID)
) comment '棚卸指示(明細)受信テーブル' ;

create unique index E_INVENTORY_INST_DTL_IX1
  on E_INVENTORY_INST_DTL(RECEIVE_CD,RECEIVE_ROW_ID);

create index E_INVENTORY_INST_DTL_IX2
  on E_INVENTORY_INST_DTL(RECEIVE_CD);

-- 棚卸実績(明細)送信テーブル
create table E_INVENTORY_RECORD_DTL (
  INVENTORY_RECORD_DTL_ID bigint not null comment '棚卸実績_明細送信ID'
  , SEND_FLG char(1) default '0' not null comment '送信済フラグ'
  , INVENTORY_SLIP_NO varchar(30) comment '実地棚卸伝票番号'
  , FISCAL_YEAR varchar(30) comment '会計年度'
  , INVENTORY_SLIP_ROW_NO varchar(30) comment '実地棚卸伝票明細番号'
  , PLANT_CD varchar(30) comment 'プラントCD'
  , STORAGE_SPACE_CD varchar(30) comment '保管場所'
  , REFERENCE_DT varchar(8) comment '基準日'
  , HINMOKU_CD varchar(100) comment '品目CD'
  , STOCK_NUM decimal(14,4) default 0 comment '在庫数量'
  , PRODUCT_NM_KANJI varchar(60) comment '品名漢字'
  , BARCODE varchar(30) comment 'バーコード'
  , DEPOSIT_JAN_CD varchar(30) comment '預かりJANCD'
  , TENHANSHA_CD varchar(30) comment '店販社CD'
  , SALES_ORG_CD varchar(30) comment '販売組織CD'
  , TENHANSHA_NM1 varchar(60) comment '店販社名1'
  , TENHANSHA_NM2 varchar(60) comment '店販社名2'
  , SAP_USER_CD varchar(30) comment 'SAPユーザCD'
  , SAP_USER_NM varchar(60) comment 'SAPユーザ名称'
  , ALLOC_TYPE_CD varchar(30) comment '引当区分'
  , WMS_ADD_YYYY varchar(30) comment 'WMS作成日_年'
  , WMS_ADD_MM varchar(30) comment 'WMS作成日_月'
  , WMS_ADD_DD varchar(30) comment 'WMS作成日_日'
  , WMS_ADD_HH varchar(30) comment 'WMS作成時間_時'
  , WMS_ADD_MI varchar(30) comment 'WMS作成時間_分'
  , WMS_ADD_SS varchar(30) comment 'WMS作成時間_秒'
  , WMS_ADD_USER_CD varchar(30) comment 'WMS作成者'
  , WMS_UPD_YYYY varchar(30) comment 'WMS更新日_年'
  , WMS_UPD_MM varchar(30) comment 'WMS更新日_月'
  , WMS_UPD_DD varchar(30) comment 'WMS更新日_日'
  , WMS_UPD_HH varchar(30) comment 'WMS更新時間_時'
  , WMS_UPD_MI varchar(30) comment 'WMS更新時間_分'
  , WMS_UPD_SS varchar(30) comment 'WMS更新時間_秒'
  , WMS_UPD_USER_CD varchar(30) comment 'WMS更新者'
  , PRODUCT_TYPE varchar(30) comment '商品種別'
  , SPARE_STR varchar(255) comment '予備'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint E_INVENTORY_RECORD_DTL_PK primary key (INVENTORY_RECORD_DTL_ID)
) comment '棚卸実績(明細)送信テーブル' ;

-- 棚卸実績(集約)送信テーブル
create table E_INVENTORY_RECORD_SUM (
  INVENTORY_RECORD_SUM_ID bigint not null comment '棚卸実績_集約送信ID'
  , SEND_FLG char(1) default '0' not null comment '送信済フラグ'
  , INVENTORY_SLIP_NO varchar(30) comment '実地棚卸伝票番号'
  , FISCAL_YEAR varchar(30) comment '会計年度'
  , INVENTORY_SLIP_ROW_NO varchar(30) comment '実地棚卸伝票明細番号'
  , PLANT_CD varchar(30) comment 'プラントCD'
  , STORAGE_SPACE_CD varchar(30) comment '保管場所'
  , REFERENCE_DT varchar(8) comment '基準日'
  , HINMOKU_CD varchar(100) comment '品目CD'
  , STOCK_NUM decimal(14,4) default 0 comment '在庫数量'
  , PRODUCT_NM_KANJI varchar(60) comment '品名漢字'
  , BARCODE varchar(30) comment 'バーコード'
  , DEPOSIT_JAN_CD varchar(30) comment '預かりJANCD'
  , TENHANSHA_CD varchar(30) comment '店販社CD'
  , SALES_ORG_CD varchar(30) comment '販売組織CD'
  , TENHANSHA_NM1 varchar(60) comment '店販社名1'
  , TENHANSHA_NM2 varchar(60) comment '店販社名2'
  , SAP_USER_CD varchar(30) comment 'SAPユーザCD'
  , SAP_USER_NM varchar(60) comment 'SAPユーザ名称'
  , ALLOC_TYPE_CD varchar(30) comment '引当区分'
  , WMS_ADD_YYYY varchar(30) comment 'WMS作成日_年'
  , WMS_ADD_MM varchar(30) comment 'WMS作成日_月'
  , WMS_ADD_DD varchar(30) comment 'WMS作成日_日'
  , WMS_ADD_HH varchar(30) comment 'WMS作成時間_時'
  , WMS_ADD_MI varchar(30) comment 'WMS作成時間_分'
  , WMS_ADD_SS varchar(30) comment 'WMS作成時間_秒'
  , WMS_ADD_USER_CD varchar(30) comment 'WMS作成者'
  , WMS_UPD_YYYY varchar(30) comment 'WMS更新日_年'
  , WMS_UPD_MM varchar(30) comment 'WMS更新日_月'
  , WMS_UPD_DD varchar(30) comment 'WMS更新日_日'
  , WMS_UPD_HH varchar(30) comment 'WMS更新時間_時'
  , WMS_UPD_MI varchar(30) comment 'WMS更新時間_分'
  , WMS_UPD_SS varchar(30) comment 'WMS更新時間_秒'
  , WMS_UPD_USER_CD varchar(30) comment 'WMS更新者'
  , SPARE_STR varchar(255) comment '予備'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint E_INVENTORY_RECORD_SUM_PK primary key (INVENTORY_RECORD_SUM_ID)
) comment '棚卸実績(集約)送信テーブル' ;

-- 戸口配送マスタ受信テーブル
create table E_KOGUCHI_DELIVERY (
  KOGUCHI_DELIVERY_ID bigint not null comment '戸口配送マスタ受信ID'
  , RECEIVE_CD varchar(30) not null comment '受信CD'
  , RECEIVE_ROW_ID bigint not null comment '受信行ID'
  , RECEIVE_FLG char(1) default '0' not null comment '取込みフラグ'
  , ERROR_FLG char(1) default '0' not null comment 'エラーフラグ'
  , ERROR_MESSAGE_CD varchar(30) comment 'エラーメッセージCD'
  , BASE_CD varchar(30) comment '拠点CD'
  , SERV_SALES_ORG_CD varchar(100) comment '取扱販売組織CD'
  , SERV_SALES_ORG_NM varchar(60) comment '取扱販売組織名称'
  , DIRECT_FLG char(1) comment '直送フラグ'
  , URGENT_FLG char(1) comment '緊急フラグ'
  , DELIVERY_FLG char(1) comment '納品フラグ'
  , KOGUCHI_DELIVERY_CD varchar(30) comment '戸口配送先CD'
  , KOGUCHI_DELIVERY_NM varchar(60) comment '戸口配送先名称'
  , UNI_DELIVERY_CD varchar(30) comment '統合配送先CD'
  , UNI_DELIVERY_NM varchar(60) comment '統合配送先名称'
  , FW_TYPE_CD varchar(30) comment 'FW区分'
  , MCA_TYPE_CD varchar(30) comment 'MCA区分'
  , YOUHIN_TYPE_CD varchar(30) comment '用品区分'
  , REQ_SALES_ORG_CD varchar(30) comment '依頼元販売組織CD'
  , REQ_SALES_ORG_NM varchar(60) comment '依頼元販売組織名称'
  , REQ_SALES_ORG_BRANCH_NM varchar(60) comment '依頼元販売組織支店名称'
  , REQ_SALES_ORG_ADDRESS1 varchar(255) comment '依頼元販売組織住所１'
  , REQ_SALES_ORG_ADDRESS2 varchar(255) comment '依頼元販売組織住所２'
  , REQ_SALES_ORG_ZIP_CD varchar(30) comment '依頼元販売組織郵便番号'
  , REQ_SALES_ORG_TEL_NO varchar(30) comment '依頼元販売組織電話番号'
  , REQ_SALES_ORG_FAX_NO varchar(30) comment '依頼元販売組織FAX番号'
  , REMARK1 varchar(255) comment '物品送付下部備考項目1'
  , REMARK2 varchar(255) comment '物品送付下部備考項目2'
  , REMARK3 varchar(255) comment '物品送付下部備考項目3'
  , REMARK4 varchar(255) comment '物品送付下部備考項目4'
  , INDV_OUT varchar(30) comment '個別出力'
  , INVOICE_SUMMARY varchar(255) comment '送り状摘要'
  , PSAM varchar(30) comment 'PSAM'
  , ABOLISH_DT varchar(8) comment '廃止日'
  , FLOOR_COMP_FLG char(1) comment 'フロア完結フラグ'
  , SAP_ADD_YYYY varchar(30) comment 'SAP作成日_年'
  , SAP_ADD_MM varchar(30) comment 'SAP作成日_月'
  , SAP_ADD_DD varchar(30) comment 'SAP作成日_日'
  , SAP_ADD_HH varchar(30) comment 'SAP作成時間_時'
  , SAP_ADD_MI varchar(30) comment 'SAP作成時間_分'
  , SAP_ADD_SS varchar(30) comment 'SAP作成時間_秒'
  , SAP_ADD_USER_CD varchar(30) comment 'SAP作成者'
  , SAP_UPD_YYYY varchar(30) comment 'SAP更新日_年'
  , SAP_UPD_MM varchar(30) comment 'SAP更新日_月'
  , SAP_UPD_DD varchar(30) comment 'SAP更新日_日'
  , SAP_UPD_HH varchar(30) comment 'SAP更新時間_時'
  , SAP_UPD_MI varchar(30) comment 'SAP更新時間_分'
  , SAP_UPD_SS varchar(30) comment 'SAP更新時間_秒'
  , SAP_UPD_USER_CD varchar(30) comment 'SAP更新者'
  , SPARE_STR varchar(255) comment '予備'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint E_KOGUCHI_DELIVERY_PK primary key (KOGUCHI_DELIVERY_ID)
) comment '戸口配送マスタ受信テーブル' ;

create unique index E_KOGUCHI_DELIVERY_IX1
  on E_KOGUCHI_DELIVERY(RECEIVE_CD,RECEIVE_ROW_ID);

create index E_KOGUCHI_DELIVERY_IX2
  on E_KOGUCHI_DELIVERY(RECEIVE_CD);

-- ロケーションマスタ受信テーブル
create table E_LOCATION (
  LOCATION_ID bigint not null comment 'ロケーションマスタ受信ID'
  , RECEIVE_CD varchar(30) not null comment '受信CD'
  , RECEIVE_ROW_ID bigint not null comment '受信行ID'
  , IMPORT_FLG char(1) default '0' not null comment '取込みフラグ'
  , ERROR_FLG char(1) default '0' not null comment 'エラーフラグ'
  , ERROR_MESSAGE_CD varchar(100) comment 'エラーメッセージCD'
  , CENTER_CD varchar(255) comment 'センタCD'
  , LOCATION_CD varchar(255) comment 'ロケーションCD'
  , LOCATION_NM varchar(255) comment 'ロケーション名称'
  , WAREHOUSE_CD varchar(255) comment '倉庫CD'
  , ZONE_CD varchar(255) comment 'ゾーンCD'
  , LOCATION_TYPE varchar(255) comment 'ロケーション種別'
  , PICKING_LOCATION_FLG varchar(255) default '1' comment 'ピックロケフラグ'
  , ALLOC_NG_FLG varchar(255) default '0' comment '引当禁止フラグ'
  , PICKING_ORDER varchar(255) comment 'ピッキング順序'
  , ALLOC_ORDER varchar(255) comment '引当順序'
  , CLIENT_CD varchar(255) comment '荷主CD'
  , REPLENISH_PRODUCT_CD varchar(255) comment '補充商品CD'
  , REPLENISH_STOCK_TYPE_CD varchar(255) comment '補充在庫区分CD'
  , REPLENISH_DEPOSIT_CD varchar(255) comment '補充預託CD'
  , REPLENISH_P_NUM varchar(255) comment '補充点'
  , REPLENISH_P_PRODUCT_SHAPE_CD varchar(255) comment '補充点商品荷姿CD'
  , MAX_STORE_NUM varchar(255) comment '最大格納数'
  , MAX_STORE_PRODUCT_SHAPE_CD varchar(255) comment '最大格納数商品荷姿CD'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint E_LOCATION_PK primary key (LOCATION_ID)
) comment 'ロケーションマスタ受信テーブル' ;

create unique index E_LOCATION_IX1
  on E_LOCATION(RECEIVE_CD,RECEIVE_ROW_ID);

create index E_LOCATION_IX2
  on E_LOCATION(RECEIVE_CD);

-- 梱包明細送信テーブル
create table E_PACKING_LIST (
  PACKING_LIST_ID bigint not null comment '梱包明細送信ID'
  , SEND_FLG char(1) default '0' not null comment '送信済フラグ'
  , SHIPPING_SLIP_NO varchar(30) comment '出荷伝票番号'
  , PACKING_NO varchar(30) comment '梱包番号'
  , PACKING_ROW_NO varchar(30) comment '梱包明細番号'
  , SHIPPING_SLIP_ROW_NO varchar(30) comment '出荷伝票明細番号'
  , SHIPPING_SLIP_ROW_NO_SN varchar(30) comment '出荷伝票明細番号連番'
  , HINMOKU_CD varchar(100) comment '品目コード'
  , NUM varchar(30) comment '数量'
  , CARRIER_SLIP_NO varchar(30) comment '運送便伝票番号'
  , WMS_ADD_YYYY varchar(30) comment 'WMS作成日_年'
  , WMS_ADD_MM varchar(30) comment 'WMS作成日_月'
  , WMS_ADD_DD varchar(30) comment 'WMS作成日_日'
  , WMS_ADD_HH varchar(30) comment 'WMS作成時間_時'
  , WMS_ADD_MI varchar(30) comment 'WMS作成時間_分'
  , WMS_ADD_SS varchar(30) comment 'WMS作成時間_秒'
  , WMS_ADD_USER_CD varchar(30) comment 'WMS作成者'
  , WMS_UPD_YYYY varchar(30) comment 'WMS更新日_年'
  , WMS_UPD_MM varchar(30) comment 'WMS更新日_月'
  , WMS_UPD_DD varchar(30) comment 'WMS更新日_日'
  , WMS_UPD_HH varchar(30) comment 'WMS更新時間_時'
  , WMS_UPD_MI varchar(30) comment 'WMS更新時間_分'
  , WMS_UPD_SS varchar(30) comment 'WMS更新時間_秒'
  , WMS_UPD_USER_CD varchar(30) comment 'WMS更新者'
  , SPARE_STR varchar(255) comment '予備'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint E_PACKING_LIST_PK primary key (PACKING_LIST_ID)
) comment '梱包明細送信テーブル' ;

-- プラント保管場所マスタ受信テーブル
create table E_PLANT_STORAGE_SPACE (
  PLANT_STORAGE_SPACE_ID bigint not null comment 'プラント保管場所マスタ受信ID'
  , RECEIVE_CD varchar(30) not null comment '受信CD'
  , RECEIVE_ROW_ID bigint not null comment '受信行ID'
  , IMPORT_FLG char(1) default '0' not null comment '取込みフラグ'
  , ERROR_FLG char(1) default '0' not null comment 'エラーフラグ'
  , ERROR_MESSAGE_CD varchar(100) comment 'エラーメッセージCD'
  , PLANT_CD varchar(30) comment 'プラントCD'
  , STORAGE_SPACE_CD varchar(30) comment '保管場所'
  , COMPANY_NM varchar(60) comment '会社名'
  , PLANT_NM varchar(60) comment 'プラント名'
  , STORAGE_SPACE_NM1 varchar(60) comment '保管場所名'
  , STORAGE_SPACE_NM2 varchar(60) comment '保管場所名別名'
  , COUNTRY_NM varchar(60) comment '国'
  , ZIP_CD varchar(30) comment '郵便番号'
  , ADDRESS1 varchar(60) comment '都道府県'
  , ADDRESS2 varchar(60) comment '市区町村'
  , ADDRESS3 varchar(60) comment '所在地'
  , TEL_NO varchar(30) comment '電話番号'
  , FAX_NO varchar(30) comment 'FAX'
  , LANG_NM varchar(60) comment '言語'
  , BASE_CD varchar(30) comment '拠点コード'
  , BASE_TYPE_CD varchar(30) comment '拠点区分'
  , BASE_NM varchar(60) comment '拠点名称'
  , SAP_ADD_YYYY varchar(30) comment 'SAP作成日_年'
  , SAP_ADD_MM varchar(30) comment 'SAP作成日_月'
  , SAP_ADD_DD varchar(30) comment 'SAP作成日_日'
  , SAP_ADD_HH varchar(30) comment 'SAP作成時間_時'
  , SAP_ADD_MI varchar(30) comment 'SAP作成時間_分'
  , SAP_ADD_SS varchar(30) comment 'SAP作成時間_秒'
  , SAP_ADD_USER_CD varchar(30) comment 'SAP作成者'
  , SAP_UPD_YYYY varchar(30) comment 'SAP更新日_年'
  , SAP_UPD_MM varchar(30) comment 'SAP更新日_月'
  , SAP_UPD_DD varchar(30) comment 'SAP更新日_日'
  , SAP_UPD_HH varchar(30) comment 'SAP更新時間_時'
  , SAP_UPD_MI varchar(30) comment 'SAP更新時間_分'
  , SAP_UPD_SS varchar(30) comment 'SAP更新時間_秒'
  , SAP_UPD_USER_CD varchar(30) comment 'SAP更新者'
  , SPARE_STR varchar(255) comment '予備'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint E_PLANT_STORAGE_SPACE_PK primary key (PLANT_STORAGE_SPACE_ID)
) comment 'プラント保管場所マスタ受信テーブル' ;

create unique index E_PLANT_STORAGE_SPACE_IX1
  on E_PLANT_STORAGE_SPACE(RECEIVE_CD,RECEIVE_ROW_ID);

create index E_PLANT_STORAGE_SPACE_IX2
  on E_PLANT_STORAGE_SPACE(RECEIVE_CD);

-- 商品マスタ受信テーブル
create table E_PRODUCT (
  PRODUCT_ID bigint not null comment '商品マスタ連携受信ID'
  , RECEIVE_CD varchar(30) not null comment '受信CD'
  , RECEIVE_ROW_ID bigint not null comment '受信行ID'
  , IMPORT_FLG char(1) default '0' not null comment '取込みフラグ'
  , ERROR_FLG char(1) default '0' not null comment 'エラーフラグ'
  , ERROR_MESSAGE_CD varchar(100) comment 'エラーメッセージCD'
  , HINMOKU_CD varchar(100) comment '品目CD'
  , HINMOKU_GROUP_CD varchar(30) comment '品目グループ'
  , HINMOKU_TEXT varchar(100) comment '品目テキスト'
  , JAN_CD varchar(30) comment 'JANコード'
  , SIZE_NM varchar(60) comment 'サイズ名称'
  , CASE_TYPE_CD varchar(30) comment 'ケース区分'
  , UNIT_NUM varchar(30) comment '入数'
  , LOGI_WEIGHT_FLG varchar(30) comment '物流重量物フラグ'
  , LOGI_SPECIAL_TYPE_CD varchar(30) comment '物流特殊区分'
  , LOGI_ATTENTION_TYPE_CD varchar(30) comment '物流注意区分'
  , UNIT_NM varchar(30) comment '単位名称'
  , OLD_JAN_CD varchar(30) comment '旧JANコード'
  , SAP_ADD_DT varchar(30) comment 'SAP作成日'
  , SAP_ADD_TIME varchar(30) comment 'SAP作成時間'
  , STORAGE_LOCATION_TYPE_CD varchar(30) comment 'フロア区分_保管場所区分'
  , MEDICAL_MANAG_FLG char(1) comment '医療用管理フラグ'
  , PROD_DT_MANAG_FLG char(1) comment '製造日管理フラグ'
  , PROD_DT_LIMIT_DAYS_RCV varchar(30) comment '入荷製造日限界日数'
  , PROD_DT_LIMIT_DAYS_SHP varchar(30) comment '出荷製造日限界日数'
  , NIZOROE_10_NUM varchar(30) comment '荷揃処理10足用足数'
  , SERIAL_MANAG_FLG char(1) comment 'シリアル管理フラグ'
  , OCR_DATE_FORMAT varchar(30) comment 'OCR日付形式'
  , LP_SEND_FLG char(1) comment '物流ポータル送信済フラグ'
  , SAP_ADD_YYYY varchar(30) comment 'SAP作成日_年'
  , SAP_ADD_MM varchar(30) comment 'SAP作成日_月'
  , SAP_ADD_DD varchar(30) comment 'SAP作成日_日'
  , SAP_ADD_HH varchar(30) comment 'SAP作成時間_時'
  , SAP_ADD_MI varchar(30) comment 'SAP作成時間_分'
  , SAP_ADD_SS varchar(30) comment 'SAP作成時間_秒'
  , SAP_ADD_USER_NM varchar(30) comment 'SAP作成者'
  , SAP_UPD_YYYY varchar(30) comment 'SAP更新日_年'
  , SAP_UPD_MM varchar(30) comment 'SAP更新日_月'
  , SAP_UPD_DD varchar(30) comment 'SAP更新日_日'
  , SAP_UPD_HH varchar(30) comment 'SAP更新時間_時'
  , SAP_UPD_MI varchar(30) comment 'SAP更新時間_分'
  , SAP_UPD_SS varchar(30) comment 'SAP更新時間_秒'
  , SAP_UPD_USER_NM varchar(30) comment 'SAP更新者'
  , SPARE_STR varchar(255) comment '予備'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint E_PRODUCT_PK primary key (PRODUCT_ID)
) comment '商品マスタ受信テーブル' ;

create unique index E_PRODUCT_IX1
  on E_PRODUCT(RECEIVE_CD,RECEIVE_ROW_ID);

create index E_PRODUCT_IX2
  on E_PRODUCT(RECEIVE_CD);

-- 商品マスタ(移動平均単価)受信テーブル
create table E_PRODUCT_PRICE (
  PRODUCT_PRICE_ID bigint not null comment '商品マスタ移動平均単価受信ID'
  , RECEIVE_CD varchar(30) not null comment '受信CD'
  , RECEIVE_ROW_ID bigint not null comment '受信行ID'
  , IMPORT_FLG char(1) default '0' not null comment '取込みフラグ'
  , ERROR_FLG char(1) default '0' not null comment 'エラーフラグ'
  , ERROR_MESSAGE_CD varchar(100) comment 'エラーメッセージCD'
  , HINMOKU_CD varchar(100) comment '品目CD'
  , HINMOKU_GROUP_CD varchar(30) comment '品目グループ'
  , MOVING_AVERAGE_PRICE decimal(14,4) comment '移動平均単価'
  , SAP_ADD_YYYY varchar(30) comment 'SAP作成日_年'
  , SAP_ADD_MM varchar(30) comment 'SAP作成日_月'
  , SAP_ADD_DD varchar(30) comment 'SAP作成日_日'
  , SAP_ADD_HH varchar(30) comment 'SAP作成時間_時'
  , SAP_ADD_MI varchar(30) comment 'SAP作成時間_分'
  , SAP_ADD_SS varchar(30) comment 'SAP作成時間_秒'
  , SAP_ADD_USER_NM varchar(30) comment 'SAP作成者'
  , SAP_UPD_YYYY varchar(30) comment 'SAP更新日_年'
  , SAP_UPD_MM varchar(30) comment 'SAP更新日_月'
  , SAP_UPD_DD varchar(30) comment 'SAP更新日_日'
  , SAP_UPD_HH varchar(30) comment 'SAP更新時間_時'
  , SAP_UPD_MI varchar(30) comment 'SAP更新時間_分'
  , SAP_UPD_SS varchar(30) comment 'SAP更新時間_秒'
  , SAP_UPD_USER_NM varchar(30) comment 'SAP更新者'
  , SPARE_STR varchar(255) comment '予備'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint E_PRODUCT_PRICE_PK primary key (PRODUCT_PRICE_ID)
) comment '商品マスタ(移動平均単価)受信テーブル' ;

create unique index E_PRODUCT_PRICE_IX1
  on E_PRODUCT_PRICE(RECEIVE_CD,RECEIVE_ROW_ID);

create index E_PRODUCT_PRICE_IX2
  on E_PRODUCT_PRICE(RECEIVE_CD);

-- 商品荷姿マスタ受信テーブル
create table E_PRODUCT_SHAPE (
  PRODUCT_SHAPE_ID bigint not null comment '商品荷姿マスタ受信ID'
  , RECEIVE_CD varchar(30) not null comment '受信CD'
  , RECEIVE_ROW_ID bigint not null comment '受信行ID'
  , IMPORT_FLG char(1) default '0' not null comment '取込みフラグ'
  , ERROR_FLG char(1) default '0' not null comment 'エラーフラグ'
  , ERROR_MESSAGE_CD varchar(100) comment 'エラーメッセージCD'
  , CLIENT_CD varchar(255) comment '荷主CD'
  , PRODUCT_CD varchar(255) comment '商品CD'
  , SHAPE_CD varchar(255) comment '荷姿CD'
  , UNIT_NUM varchar(255) comment '入数'
  , LENGTH varchar(255) comment '縦(mm)'
  , WIDTH varchar(255) comment '横(mm)'
  , HEIGHT varchar(255) comment '高さ(mm)'
  , VOLUME varchar(255) comment '容積(mm3)'
  , NET_WEIGHT varchar(255) comment '商品重量(g)'
  , GROSS_WEIGHT varchar(255) comment '総重量(g)'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint E_PRODUCT_SHAPE_PK primary key (PRODUCT_SHAPE_ID)
) comment '商品荷姿マスタ受信テーブル' ;

create unique index E_PRODUCT_SHAPE_IX1
  on E_PRODUCT_SHAPE(RECEIVE_CD,RECEIVE_ROW_ID);

create index E_PRODUCT_SHAPE_IX2
  on E_PRODUCT_SHAPE(RECEIVE_CD);

-- 入荷予定受信テーブル
create table E_RECEIVE_PLAN (
  RECEIVE_PLAN_ID bigint not null comment '入荷予定受信ID'
  , RECEIVE_CD varchar(30) not null comment '受信CD'
  , RECEIVE_ROW_ID bigint not null comment '受信行ID'
  , IMPORT_FLG char(1) default '0' not null comment '取込みフラグ'
  , ERROR_FLG char(1) default '0' not null comment 'エラーフラグ'
  , ERROR_MESSAGE_CD varchar(100) comment 'エラーメッセージCD'
  , STORE_SLIP_NO varchar(30) comment '入庫伝票番号'
  , STORE_SLIP_ROW_NO varchar(30) comment '入庫明細番号'
  , SLIP_TYPE_CD varchar(30) comment '伝票種別'
  , IF_ID varchar(30) comment 'IFID'
  , IF_NO varchar(30) comment 'IF用番号'
  , HINMOKU_CD varchar(100) comment '品目コード'
  , HINMOKU_GROUP varchar(30) comment '品目グループ'
  , SANSHA_TYPE_CD varchar(30) comment '3社区分'
  , RECEIVE_REASON_CD varchar(30) comment '入荷発生事由'
  , RECEIVE_REASON_NM varchar(30) comment '入荷発生事由名称'
  , CUSTOMER_CD varchar(30) comment '取引先コード'
  , CUSTOMER_NM varchar(60) comment '取引先名称'
  , ORDER_DATE varchar(30) comment '発注日'
  , ORDER_TIME varchar(30) comment '発注時刻'
  , CONFIRMED_DELIVERY_DATE varchar(30) comment '確定納期'
  , HINMOKU_TEXT varchar(100) comment '品目テキスト'
  , JAN_CD varchar(30) comment 'JANコード'
  , UNIT_NM varchar(30) comment '単位名称'
  , RECEIVE_PLAN_NUM varchar(30) comment '入荷予定数量'
  , RECEIVE_REMAINING_NUM varchar(30) comment '入荷予定残数'
  , STORE_PLANT_CD varchar(30) comment '入庫プラント'
  , STORE_STORAGE_SPACE_CD varchar(30) comment '入庫保管場所'
  , SHIPPING_PLANT_CD varchar(30) comment '出庫プラント'
  , SHIPPING_STORAGE_SPACE_CD varchar(30) comment '出庫保管場所'
  , LOT_MANAG_TYPE_CD varchar(30) comment 'ロット管理区分'
  , TENHANSHA_CD varchar(30) comment '店販社CD'
  , SALES_ORG_CD varchar(30) comment '販売組織CD'
  , TENHANSHA_NM1 varchar(60) comment '店販社名称1'
  , TENHANSHA_NM2 varchar(60) comment '店販社名称2'
  , SAP_USER_CD varchar(30) comment 'SAPユーザコード'
  , SAP_USER_NM varchar(60) comment 'SAPユーザ名称'
  , MOD_TYPE_CD varchar(30) comment '修正区分'
  , DEPOSIT_JAN_CD varchar(30) comment '預りJANCD'
  , TIMES_NUM varchar(30) comment '回数'
  , ACCOUNT_ORDER_NO varchar(30) comment '得意先注文番号'
  , SAP_SUPPLIER_CD varchar(30) comment 'SAP仕入先コード'
  , SAP_VENDER_CD varchar(30) comment 'SAP発注先コード'
  , TODAY_FLG varchar(30) comment '当日分フラグ'
  , SANSHA_DELIVERY_SLIP_NO1 varchar(30) comment '3社納品書番号1'
  , DATA_TYPE_CD varchar(30) comment 'データ区分'
  , WMS_SEND_FLG char(1) comment 'WMS送信済フラグ'
  , LP_SEND_FLG char(1) comment '物流ポータル送信済フラグ'
  , SAP_ADD_YYYY varchar(30) comment 'SAP作成日_年'
  , SAP_ADD_MM varchar(30) comment 'SAP作成日_月'
  , SAP_ADD_DD varchar(30) comment 'SAP作成日_日'
  , SAP_ADD_HH varchar(30) comment 'SAP作成時間_時'
  , SAP_ADD_MI varchar(30) comment 'SAP作成時間_分'
  , SAP_ADD_SS varchar(30) comment 'SAP作成時間_秒'
  , SAP_ADD_USER_CD varchar(30) comment 'SAP作成者'
  , SAP_UPD_YYYY varchar(30) comment 'SAP更新日_年'
  , SAP_UPD_MM varchar(30) comment 'SAP更新日_月'
  , SAP_UPD_DD varchar(30) comment 'SAP更新日_日'
  , SAP_UPD_HH varchar(30) comment 'SAP更新時間_時'
  , SAP_UPD_MI varchar(30) comment 'SAP更新時間_分'
  , SAP_UPD_SS varchar(30) comment 'SAP更新時間_秒'
  , SAP_UPD_USER_CD varchar(30) comment 'SAP更新者'
  , DATA_TRANSFER_ONLY_STR01 varchar(30) comment '赤黒区分'
  , DATA_TRANSFER_ONLY_STR02 varchar(30) comment '代表ロケーション'
  , DATA_TRANSFER_ONLY_STR03 varchar(60) comment '品名カナ1'
  , DATA_TRANSFER_ONLY_STR04 varchar(60) comment '品名カナ2'
  , DATA_TRANSFER_ONLY_STR05 varchar(60) comment '摘要'
  , DATA_TRANSFER_ONLY_STR06 varchar(30) comment '端末番号'
  , DATA_TRANSFER_ONLY_STR07 varchar(30) comment 'サーバー送信フラグ'
  , DATA_TRANSFER_ONLY_STR08 varchar(30) comment 'サーバー宛送信時刻'
  , DATA_TRANSFER_ONLY_STR09 varchar(30) comment '3社納品書番号2'
  , DATA_TRANSFER_ONLY_STR10 varchar(30) comment '加工品区分'
  , DATA_TRANSFER_ONLY_STR11 varchar(30) comment '管理区分'
  , DATA_TRANSFER_ONLY_STR12 varchar(30) comment '3社売上日'
  , DATA_TRANSFER_ONLY_STR13 varchar(30) comment '仕入単価'
  , DATA_TRANSFER_ONLY_STR14 varchar(30) comment '作成日_発注'
  , DATA_TRANSFER_ONLY_STR15 varchar(30) comment '作成時間_発注'
  , DATA_TRANSFER_ONLY_STR16 varchar(30) comment 'データ種別'
  , DATA_TRANSFER_ONLY_STR17 varchar(30) comment '管理番号'
  , DATA_TRANSFER_ONLY_STR18 varchar(30) comment '入力順'
  , DATA_TRANSFER_ONLY_STR19 varchar(30) comment '検品残数量'
  , DATA_TRANSFER_ONLY_STR20 varchar(30) comment '検品数量'
  , DATA_TRANSFER_ONLY_STR21 varchar(30) comment '検品確定区分'
  , DATA_TRANSFER_ONLY_STR22 varchar(30) comment '倉庫コード'
  , DATA_TRANSFER_ONLY_STR23 varchar(30) comment '完了区分'
  , DATA_TRANSFER_ONLY_STR24 varchar(30) comment 'プログラムID'
  , DATA_TRANSFER_ONLY_STR25 varchar(30) comment 'JANコード区分'
  , DATA_TRANSFER_ONLY_STR26 varchar(255) comment 'ダミー'
  , DATA_TRANSFER_ONLY_STR27 varchar(30) comment 'SAP更新担当者コード'
  , DATA_TRANSFER_ONLY_STR28 varchar(30) comment 'SAP削除フラグ'
  , SPARE_STR varchar(255) comment '予備'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint E_RECEIVE_PLAN_PK primary key (RECEIVE_PLAN_ID)
) comment '入荷予定受信テーブル' ;

create unique index E_RECEIVE_PLAN_IX1
  on E_RECEIVE_PLAN(RECEIVE_CD,RECEIVE_ROW_ID);

create index E_RECEIVE_PLAN_IX2
  on E_RECEIVE_PLAN(RECEIVE_CD);

-- 販売組織マスタ受信テーブル
create table E_SALES_ORG (
  SALES_ORG_ID bigint not null comment '販売組織マスタ受信ID'
  , RECEIVE_CD varchar(30) not null comment '受信CD'
  , RECEIVE_ROW_ID bigint not null comment '受信行ID'
  , IMPORT_FLG char(1) default '0' not null comment '取込みフラグ'
  , ERROR_FLG char(1) default '0' not null comment 'エラーフラグ'
  , ERROR_MESSAGE_CD varchar(100) comment 'エラーメッセージCD'
  , SALES_ORG_CD varchar(30) comment '販売組織CD'
  , PURCHASE_ORG_CD varchar(30) comment '購買組織CD'
  , TENHANSHA_CD varchar(30) comment '店販社CD'
  , TENHANSHA_NM1 varchar(60) comment '店販社名称１'
  , TENHANSHA_NM2 varchar(60) comment '店販社名称２'
  , TENHANSHA_ZIP_CD varchar(30) comment '店販社郵便番号'
  , TENHANSHA_PREFECTURE varchar(30) comment '店販社都道府県'
  , TENHANSHA_ADDRESS1 varchar(60) comment '店販社住所１'
  , TENHANSHA_ADDRESS2 varchar(60) comment '店販社住所２'
  , TENHANSHA_TEL_NO varchar(30) comment '店販社電話番号'
  , TENHANSHA_FAX_NO varchar(30) comment '店販社ＦＡＸ番号'
  , PLANT_NORMAL varchar(30) comment 'プラント_通常品'
  , PLANT_DEPOSIT varchar(30) comment 'プラント_預かり品'
  , SAP_ADD_YYYY varchar(30) comment 'SAP作成日_年'
  , SAP_ADD_MM varchar(30) comment 'SAP作成日_月'
  , SAP_ADD_DD varchar(30) comment 'SAP作成日_日'
  , SAP_ADD_HH varchar(30) comment 'SAP作成時間_時'
  , SAP_ADD_MI varchar(30) comment 'SAP作成時間_分'
  , SAP_ADD_SS varchar(30) comment 'SAP作成時間_秒'
  , SAP_ADD_USER_CD varchar(30) comment 'SAP作成者'
  , SAP_UPD_YYYY varchar(30) comment 'SAP更新日_年'
  , SAP_UPD_MM varchar(30) comment 'SAP更新日_月'
  , SAP_UPD_DD varchar(30) comment 'SAP更新日_日'
  , SAP_UPD_HH varchar(30) comment 'SAP更新時間_時'
  , SAP_UPD_MI varchar(30) comment 'SAP更新時間_分'
  , SAP_UPD_SS varchar(30) comment 'SAP更新時間_秒'
  , SAP_UPD_USER_CD varchar(30) comment 'SAP更新者'
  , SPARE_STR varchar(255) comment '予備'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint E_SALES_ORG_PK primary key (SALES_ORG_ID)
) comment '販売組織マスタ受信テーブル' ;

create unique index E_SALES_ORG_IX1
  on E_SALES_ORG(RECEIVE_CD,RECEIVE_ROW_ID);

create index E_SALES_ORG_IX2
  on E_SALES_ORG(RECEIVE_CD);

-- SCMラベル情報送信テーブル
create table E_SCM_LABEL (
  SCM_LABEL_ID bigint not null comment 'SCMラベル情報送信ID'
  , SEND_FLG char(1) default '0' not null comment '送信済フラグ'
  , SHIPPING_SLIP_NO varchar(30) comment '出荷伝票番号'
  , PACKING_NO varchar(30) comment '梱包番号'
  , CARTON_ID_NO varchar(30) comment 'カートン識別番号'
  , SN varchar(30) comment '連番'
  , MANAG_TYPE_CD varchar(30) comment '管理区分'
  , HINMOKU_CD varchar(100) comment '品目CD'
  , HINMOKU_GROUP varchar(30) comment '品目グループ'
  , HINMOKU_TEXT varchar(60) comment '品目テキスト'
  , JAN_CD varchar(30) comment 'JANCD'
  , NUM varchar(30) comment '数量'
  , SERIAL_NO varchar(30) comment 'シリアル番号'
  , LOT_MANAG_TYPE_CD varchar(30) comment 'ロット管理区分'
  , LOT varchar(100) comment 'ロット番号'
  , LIMIT_DT varchar(30) comment '期限日'
  , PROD_DT varchar(30) comment '製造日'
  , WMS_ADD_YYYY varchar(30) comment 'WMS作成日_年'
  , WMS_ADD_MM varchar(30) comment 'WMS作成日_月'
  , WMS_ADD_DD varchar(30) comment 'WMS作成日_日'
  , WMS_ADD_HH varchar(30) comment 'WMS作成時間_時'
  , WMS_ADD_MI varchar(30) comment 'WMS作成時間_分'
  , WMS_ADD_SS varchar(30) comment 'WMS作成時間_秒'
  , WMS_ADD_USER_CD varchar(30) comment 'WMS作成者'
  , WMS_UPD_YYYY varchar(30) comment 'WMS更新日_年'
  , WMS_UPD_MM varchar(30) comment 'WMS更新日_月'
  , WMS_UPD_DD varchar(30) comment 'WMS更新日_日'
  , WMS_UPD_HH varchar(30) comment 'WMS更新時間_時'
  , WMS_UPD_MI varchar(30) comment 'WMS更新時間_分'
  , WMS_UPD_SS varchar(30) comment 'WMS更新時間_秒'
  , WMS_UPD_USER_CD varchar(30) comment 'WMS更新者'
  , SPARE_STR varchar(255) comment '予備'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint E_SCM_LABEL_PK primary key (SCM_LABEL_ID)
) comment 'SCMラベル情報送信テーブル' ;

-- シリアルNo.受信テーブル
create table E_SERIAL_INPUT (
  SERIAL_INPUT_ID bigint not null comment 'シリアルNo.受信テーブルID'
  , RECEIVE_CD varchar(30) not null comment '受信CD'
  , RECEIVE_ROW_ID bigint not null comment '受信行ID'
  , IMPORT_FLG char(1) not null comment '取込フラグ'
  , ERROR_FLG char(1) not null comment 'エラーフラグ'
  , ERROR_MESSAGE_CD varchar(100) comment 'エラーメッセージCD'
  , CLIENT_CD varchar(255) comment '荷主CD'
  , CENTER_CD varchar(255) comment 'センタCD'
  , PROCESS_TYPE varchar(255) comment '処理区分'
  , PRODUCT_CD varchar(255) comment '商品CD'
  , SERIAL_NO varchar(255) comment 'シリアルNo.'
  , SUPPLIER_CD varchar(255) comment '仕入先CD'
  , SUPPLIER_NM varchar(255) comment '仕入先名称'
  , RECEIVE_SLIP_NO varchar(255) comment 'WMS入荷伝票No.'
  , SUPPLY_CUSTOMER_CD varchar(255) comment '納品先CD'
  , SUPPLY_CUSTOMER_NM varchar(255) comment '納品先名称'
  , PICKING_WORK_NO varchar(255) comment '出庫作業No.'
  , WORK_DT varchar(255) comment '作業日'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint E_SERIAL_INPUT_PK primary key (SERIAL_INPUT_ID)
) comment 'シリアルNo.受信テーブル' ;

create unique index E_SERIAL_INPUT_IX1
  on E_SERIAL_INPUT(RECEIVE_CD,RECEIVE_ROW_ID);

create index E_SERIAL_INPUT_IX2
  on E_SERIAL_INPUT(RECEIVE_CD);

-- 出荷指示受信テーブル
create table E_SHIPPING_INST (
  SHIPPING_INST_ID bigint not null comment '出荷指示受信ID'
  , RECEIVE_CD varchar(30) not null comment '受信CD'
  , RECEIVE_ROW_ID bigint not null comment '受信行ID'
  , IMPORT_FLG char(1) default '0' not null comment '取込みフラグ'
  , ERROR_FLG char(1) default '0' not null comment 'エラーフラグ'
  , ERROR_MESSAGE_CD varchar(100) comment 'エラーメッセージCD'
  , SHIPPING_SLIP_NO varchar(30) comment '出荷伝票番号'
  , SHIPPING_SLIP_ROW_NO varchar(30) comment '出荷伝票明細番号'
  , SALES_ORDER_NO varchar(30) comment '受注番号'
  , HINMOKU_CD varchar(100) comment '品目CD'
  , SALES_ORDER_SLIP_TYPE_CD varchar(30) comment '受注伝票タイプ'
  , SALES_ORDER_SLIP_NO varchar(30) comment '受注伝票番号'
  , NIZOROE_NO varchar(30) comment '荷揃番号'
  , SHIPPING_TYPE_CD varchar(30) comment '出荷区分'
  , SHIPPING_REASON_CD varchar(30) comment '出荷発生事由'
  , HINMOKU_GROUP varchar(30) comment '品目グループ'
  , SHIPPING_NUM varchar(30) comment '出荷数'
  , HINMOKU_TEXT varchar(60) comment '品目テキスト'
  , JAN_CD varchar(30) comment 'JANCD'
  , UNIT_NM varchar(30) comment '単位名称'
  , EC_UNIT_NM varchar(30) comment 'EC単位名'
  , SAMPLE_TYPE_CD varchar(30) comment 'サンプル区分'
  , LOGI_WEIGHT_FLG varchar(30) comment '物流重量物フラグ'
  , LOGI_ATTENTION_TYPE_CD varchar(30) comment '物流注意区分'
  , LOGI_SPECIAL_TYPE_CD varchar(30) comment '物流特殊区分'
  , DIRECT_DELIVERY_TYPE_CD varchar(30) comment '直送区分'
  , KOGUCHI_DELIVERY_FLG varchar(30) comment '戸口配送フラグ'
  , SPLIT_DELIVERY_TYPE_CD varchar(30) comment '分納区分'
  , CARRIER_TYPE_CD varchar(30) comment '運送会社区分'
  , CARRIER_CD varchar(30) comment '運送業者CD'
  , EXPRESS_CD varchar(30) comment '運送便CD'
  , SHIPPING_DT varchar(30) comment '出荷日'
  , SPECIFY_DELIVERY_DT varchar(30) comment '配達指定日'
  , SPECIFY_DELIVERY_TIME varchar(30) comment '配達指定時間'
  , TENHANSHA_CD varchar(30) comment '店販社CD'
  , SALES_ORG_CD varchar(30) comment '販売組織CD'
  , TENHANSHA_ORDER_NO varchar(30) comment '店販社発注番号'
  , KOHAI_CONTRACTOR_CD varchar(30) comment '戸配契約先CD'
  , KOHAI_CONTRACTOR_NM varchar(60) comment '戸配契約先名称'
  , DESTINATION_CD varchar(30) comment '送り先CD'
  , DESTINATION_NM1 varchar(60) comment '送り先名称１'
  , DESTINATION_NM2 varchar(60) comment '送り先名称２'
  , DESTINATION_NM_KANA varchar(60) comment '送り先名称_カナ'
  , DESTINATION_ZIP_CD varchar(30) comment '送り先郵便番号'
  , DESTINATION_ADDRESS1 varchar(60) comment '送り先住所１'
  , DESTINATION_ADDRESS2 varchar(60) comment '送り先住所２'
  , DESTINATION_TEL varchar(30) comment '送り先電話番号'
  , DESTINATION_FAX varchar(30) comment '送り先ＦＡＸ番号'
  , KANJI_MESSAGE1 varchar(60) comment '漢字メッセージ_1'
  , KANJI_MESSAGE2 varchar(60) comment '漢字メッセージ_2'
  , KANJI_MESSAGE3 varchar(60) comment '漢字メッセージ_3'
  , KANJI_MESSAGE4 varchar(60) comment '漢字メッセージ_4'
  , KANJI_MESSAGE5 varchar(60) comment '漢字メッセージ_5'
  , KANJI_MESSAGE6 varchar(60) comment '漢字メッセージ_6'
  , KANJI_MESSAGE7 varchar(60) comment '漢字メッセージ_7'
  , KANJI_MESSAGE8 varchar(60) comment '漢字メッセージ_8'
  , KANJI_MESSAGE9 varchar(60) comment '漢字メッセージ_9'
  , KANJI_MESSAGE10 varchar(60) comment '漢字メッセージ_10'
  , KANA_MESSAGE1 varchar(60) comment 'カナメッセージ_1'
  , KANA_MESSAGE2 varchar(60) comment 'カナメッセージ_2'
  , KANA_MESSAGE3 varchar(60) comment 'カナメッセージ_3'
  , KANA_MESSAGE4 varchar(60) comment 'カナメッセージ_4'
  , KANA_MESSAGE5 varchar(60) comment 'カナメッセージ_5'
  , KANA_MESSAGE6 varchar(60) comment 'カナメッセージ_6'
  , KANA_MESSAGE7 varchar(60) comment 'カナメッセージ_7'
  , KANA_MESSAGE8 varchar(60) comment 'カナメッセージ_8'
  , KANA_MESSAGE9 varchar(60) comment 'カナメッセージ_9'
  , KANA_MESSAGE10 varchar(60) comment 'カナメッセージ_10'
  , DELIVERY_NOTE_SUMMARY varchar(255) comment '納品書摘要'
  , INVOICE_SUMMARY varchar(60) comment '送り状摘要'
  , UNIT_PRICE varchar(30) comment '商品単価'
  , EC_ORDER_NO varchar(30) comment 'ＥＣ発注番号'
  , EC_ORDER_BRANCH_NO varchar(30) comment 'ＥＣ発注番号_枝番'
  , EC_PRODUCT_NM_KANJI varchar(60) comment 'EC品名漢字'
  , ORDER_DT varchar(30) comment '注文日'
  , KOKYAKU_CD varchar(30) comment '顧客CD'
  , PAYMENT_TYPE_CD varchar(30) comment '決済区分'
  , TOTAL_PRICE varchar(30) comment '合計金額'
  , SHIPPING_FEE varchar(30) comment '送料'
  , SEPARATE_SHIPPING_FEE varchar(30) comment '別途送料'
  , COD_FEE varchar(30) comment '代引手数料'
  , SALES_TAX_RATE varchar(30) comment '消費税率'
  , PRICE_HIDDEN_FLG varchar(30) comment '金額非表示フラグ'
  , PAYMENT_HIDDEN_FLG varchar(30) comment '決済非表示フラグ'
  , ORDER_NO_DELIVERY_NOTE varchar(30) comment '注文番号_納品書'
  , POINT varchar(30) comment 'ポイント'
  , STORE_PLANT_CD varchar(30) comment '入庫プラント'
  , STORE_STORAGE_SPACE_CD varchar(30) comment '入庫保管場所'
  , SHIPPING_PLANT_CD varchar(30) comment '出庫プラント'
  , SHIPPING_STORAGE_SPACE_CD varchar(30) comment '出庫保管場所'
  , LOT_MANAG_TYPE_CD varchar(30) comment 'ロット管理区分'
  , DEAL_TYPE_CD varchar(30) comment '取引区分'
  , CUSTOMER_CD varchar(30) comment '取引先CD'
  , CUSTOMER_NM varchar(60) comment '取引先名称'
  , DELIV_CD varchar(30) comment '納入先CD'
  , EMP_ID_CD varchar(30) comment '社員識別CD'
  , EMP_NM varchar(60) comment '社員氏名'
  , IF_ID varchar(30) comment 'IFID'
  , DESTINATION_PREFECTURE varchar(30) comment '送り先都道府県'
  , PSAM varchar(30) comment 'PSAM'
  , FLOOR_COMP_FLG char(1) comment 'フロア完結フラグ'
  , SAP_ADD_YYYY varchar(30) comment 'SAP作成日_年'
  , SAP_ADD_MM varchar(30) comment 'SAP作成日_月'
  , SAP_ADD_DD varchar(30) comment 'SAP作成日_日'
  , SAP_ADD_HH varchar(30) comment 'SAP作成時間_時'
  , SAP_ADD_MI varchar(30) comment 'SAP作成時間_分'
  , SAP_ADD_SS varchar(30) comment 'SAP作成時間_秒'
  , SAP_ADD_USER_CD varchar(30) comment 'SAP作成者'
  , SAP_UPD_YYYY varchar(30) comment 'SAP更新日_年'
  , SAP_UPD_MM varchar(30) comment 'SAP更新日_月'
  , SAP_UPD_DD varchar(30) comment 'SAP更新日_日'
  , SAP_UPD_HH varchar(30) comment 'SAP更新時間_時'
  , SAP_UPD_MI varchar(30) comment 'SAP更新時間_分'
  , SAP_UPD_SS varchar(30) comment 'SAP更新時間_秒'
  , SAP_UPD_USER_CD varchar(30) comment 'SAP更新者'
  , DATA_TRANSFER_ONLY_STR01 varchar(30) comment 'ヘルメット区分'
  , DATA_TRANSFER_ONLY_STR02 varchar(60) comment 'マーク名称'
  , DATA_TRANSFER_ONLY_STR03 varchar(30) comment 'ステータス'
  , SPARE_STR varchar(255) comment '予備'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint E_SHIPPING_INST_PK primary key (SHIPPING_INST_ID)
) comment '出荷指示受信テーブル' ;

create unique index E_SHIPPING_INST_IX1
  on E_SHIPPING_INST(RECEIVE_CD,RECEIVE_ROW_ID);

create index E_SHIPPING_INST_IX2
  on E_SHIPPING_INST(RECEIVE_CD);

-- 出荷予定受信テーブル
create table E_SHIPPING_PLAN (
  SHIPPING_PLAN_ID bigint not null comment '出荷予定受信ID'
  , RECEIVE_CD varchar(30) not null comment '受信CD'
  , RECEIVE_ROW_ID bigint not null comment '受信行ID'
  , IMPORT_FLG char(1) default '0' not null comment '取込みフラグ'
  , ERROR_FLG char(1) default '0' not null comment 'エラーフラグ'
  , ERROR_MESSAGE_CD varchar(100) comment 'エラーメッセージCD'
  , SHIPPING_PLAN_SLIP_NO varchar(30) comment '出荷予定伝票番号'
  , SHIPPING_PLAN_SLIP_ROW_NO varchar(30) comment '出荷予定明細番号'
  , SLIP_TYPE_CD varchar(30) comment '伝票種別'
  , SHIPPING_DT varchar(30) comment '出荷日'
  , HINMOKU_CD varchar(100) comment '品目CD'
  , SALES_ORDER_TYPE_CD varchar(30) comment '受注伝票タイプ'
  , SHIPPING_TYPE_CD varchar(30) comment '出荷区分'
  , SHIPPING_REASON_CD varchar(30) comment '出荷発生事由'
  , HINMOKU_GROUP varchar(30) comment '品目グループ'
  , SHIPPING_NUM varchar(30) comment '出荷数'
  , HINMOKU_TEXT varchar(60) comment '品目テキスト'
  , JAN_CD varchar(30) comment 'JANCD'
  , UNIT_NM varchar(30) comment '単位名称'
  , DIRECT_DELIVERY_TYPE_CD varchar(30) comment '直送区分'
  , KOGUCHI_DELIVERY_FLG varchar(30) comment '戸口配送フラグ'
  , STORE_PLANT_CD varchar(30) comment '入庫プラント'
  , STORE_STORAGE_SPACE_CD varchar(30) comment '入庫保管場所'
  , SHIPPING_PLANT_CD varchar(30) comment '出庫プラント'
  , SHIPPING_STORAGE_SPACE_CD varchar(30) comment '出庫保管場所'
  , TRANSACTION_TYPE_CD varchar(30) comment '取引区分'
  , TENHANSHA_CD varchar(30) comment '店販社CD'
  , SALES_ORG_CD varchar(30) comment '販売組織CD'
  , TENHANSHA_ORDER_NO varchar(30) comment '店販社発注番号'
  , KOHAI_CONTRACTOR_CD varchar(30) comment '戸配契約先CD'
  , KOHAI_CONTRACTOR_NM varchar(60) comment '戸配契約先名称'
  , DESTINATION_CD varchar(30) comment '送り先CD'
  , DESTINATION_NM1 varchar(60) comment '送り先名称1'
  , DESTINATION_NM2 varchar(60) comment '送り先名称2'
  , DESTINATION_NM_KANA varchar(60) comment '送り先名称_カナ'
  , DESTINATION_ZIP_CD varchar(30) comment '送り先郵便番号'
  , DESTINATION_ADDRESS1 varchar(60) comment '送り先住所1'
  , DESTINATION_ADDRESS2 varchar(60) comment '送り先住所2'
  , DESTINATION_TEL varchar(30) comment '送り先電話番号'
  , DESTINATION_FAX varchar(30) comment '送り先ＦＡＸ番号'
  , SAP_ADD_YYYY varchar(30) comment 'SAP作成日_年'
  , SAP_ADD_MM varchar(30) comment 'SAP作成日_月'
  , SAP_ADD_DD varchar(30) comment 'SAP作成日_日'
  , SAP_ADD_HH varchar(30) comment 'SAP作成時間_時'
  , SAP_ADD_MI varchar(30) comment 'SAP作成時間_分'
  , SAP_ADD_SS varchar(30) comment 'SAP作成時間_秒'
  , SAP_ADD_USER_CD varchar(30) comment 'SAP作成者'
  , SAP_UPD_YYYY varchar(30) comment 'SAP更新日_年'
  , SAP_UPD_MM varchar(30) comment 'SAP更新日_月'
  , SAP_UPD_DD varchar(30) comment 'SAP更新日_日'
  , SAP_UPD_HH varchar(30) comment 'SAP更新時間_時'
  , SAP_UPD_MI varchar(30) comment 'SAP更新時間_分'
  , SAP_UPD_SS varchar(30) comment 'SAP更新時間_秒'
  , SAP_UPD_USER_CD varchar(30) comment 'SAP更新者'
  , SPARE_STR varchar(255) comment '予備'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint E_SHIPPING_PLAN_PK primary key (SHIPPING_PLAN_ID)
) comment '出荷予定受信テーブル' ;

create unique index E_SHIPPING_PLAN_IX1
  on E_SHIPPING_PLAN(RECEIVE_CD,RECEIVE_ROW_ID);

create index E_SHIPPING_PLAN_IX2
  on E_SHIPPING_PLAN(RECEIVE_CD);

-- 出荷実績送信テーブル
create table E_SHIPPING_RECORD (
  SHIPPING_RECORD_ID bigint not null comment '出荷実績送信ID'
  , SEND_FLG char(1) default '0' not null comment '送信済フラグ'
  , SHIPPING_SLIP_NO varchar(30) comment '出荷伝票番号'
  , SHIPPING_SLIP_ROW_NO varchar(30) comment '出荷伝票明細番号'
  , SN bigint default 0 comment '連番'
  , SALES_ORDER_NO varchar(30) comment '受注番号'
  , HINMOKU_CD varchar(30) not null comment '品目CD'
  , SHIPPING_DT varchar(8) not null comment '出荷日'
  , JAN_CD varchar(30) comment 'JANCD'
  , NUM decimal(14,4) default 0 not null comment '数量'
  , LOT_MANAG_TYPE_CD varchar(30) comment 'ロット管理区分'
  , LOT varchar(100) comment 'ロット番号'
  , CARRIER_SLIP_NO varchar(30) comment '運送便伝票番号'
  , CARRIER_CD varchar(30) comment '運送業者CD'
  , CARRIER_RNM varchar(60) comment '運送業者略称'
  , CONFIRMED_PACKING_NUM bigint not null comment '確定梱包数'
  , SALES_NO2 varchar(30) comment '売上番号２'
  , DELIVERY_SLIP_NO varchar(30) comment '納品書番号'
  , D_STR varchar(60) comment 'D'
  , I_STR varchar(60) comment 'I'
  , IF_ID varchar(30) comment 'IFID'
  , SHIPPING_STORAGE_SPACE_CD varchar(30) comment '出庫保管場所'
  , NIZOROE_NO varchar(30) comment '荷揃番号'
  , PL_SEND_FLG char(1) comment '梱包明細送信済フラグ'
  , WMS_ADD_YYYY varchar(30) comment 'WMS作成日_年'
  , WMS_ADD_MM varchar(30) comment 'WMS作成日_月'
  , WMS_ADD_DD varchar(30) comment 'WMS作成日_日'
  , WMS_ADD_HH varchar(30) comment 'WMS作成時間_時'
  , WMS_ADD_MI varchar(30) comment 'WMS作成時間_分'
  , WMS_ADD_SS varchar(30) comment 'WMS作成時間_秒'
  , WMS_ADD_USER_CD varchar(30) comment 'WMS作成者'
  , WMS_UPD_YYYY varchar(30) comment 'WMS更新日_年'
  , WMS_UPD_MM varchar(30) comment 'WMS更新日_月'
  , WMS_UPD_DD varchar(30) comment 'WMS更新日_日'
  , WMS_UPD_HH varchar(30) comment 'WMS更新時間_時'
  , WMS_UPD_MI varchar(30) comment 'WMS更新時間_分'
  , WMS_UPD_SS varchar(30) comment 'WMS更新時間_秒'
  , WMS_UPD_USER_CD varchar(30) comment 'WMS更新者'
  , SPARE_STR varchar(255) comment '予備'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint E_SHIPPING_RECORD_PK primary key (SHIPPING_RECORD_ID)
) comment '出荷実績送信テーブル' ;

-- 入庫実績送信テーブル
create table E_STORE_RECORD (
  STORE_RECORD_ID bigint not null comment '入庫実績送信ID'
  , SEND_FLG char(1) default '0' not null comment '送信済フラグ'
  , STORE_SLIP_NO varchar(30) comment '入庫伝票番号'
  , STORE_SLIP_ROW_NO varchar(30) comment '入庫明細番号'
  , SLIP_TYPE_CD varchar(30) comment '伝票種別'
  , SN bigint default 0 comment '連番'
  , IF_NO varchar(30) comment 'IF用番号'
  , HINMOKU_CD varchar(100) comment '品目コード'
  , JAN_CD varchar(30) comment 'JANコード'
  , STORE_REASON_CD varchar(30) comment '入庫発生事由'
  , STORE_DT varchar(8) comment '入荷日'
  , NUM decimal(14,4) comment '数量'
  , LOT_MANAG_TYPE_CD varchar(30) comment 'ロット管理区分'
  , LOT varchar(100) comment 'ロット'
  , RECEIVE_NO varchar(30) comment '入荷番号'
  , SHIPPING_PLANT_CD varchar(30) comment '出庫プラント'
  , SHIPPING_STORAGE_SPACE_CD varchar(30) comment '出庫保管場所'
  , STORE_PLANT_CD varchar(30) not null comment '入庫プラント'
  , STORE_STORAGE_SPACE_CD varchar(30) not null comment '入庫保管場所'
  , TENHANSHA_CD varchar(30) comment '店販社CD'
  , SALES_ORG_CD varchar(30) comment '販売組織CD'
  , SANSHA_DELIVERY_SLIP_NO1 varchar(30) comment '3社納品書番号1'
  , DATA_TYPE_CD varchar(30) comment 'データ区分'
  , PROCESS_TYPE_CD varchar(30) comment '処理区分'
  , SLIP_NO varchar(30) comment '伝票番号'
  , WMS_ADD_YYYY varchar(30) comment 'WMS作成日_年'
  , WMS_ADD_MM varchar(30) comment 'WMS作成日_月'
  , WMS_ADD_DD varchar(30) comment 'WMS作成日_日'
  , WMS_ADD_HH varchar(30) comment 'WMS作成時間_時'
  , WMS_ADD_MI varchar(30) comment 'WMS作成時間_分'
  , WMS_ADD_SS varchar(30) comment 'WMS作成時間_秒'
  , WMS_ADD_USER_NM varchar(60) comment 'WMS作成者'
  , WMS_UPD_YYYY varchar(30) comment 'WMS更新日_年'
  , WMS_UPD_MM varchar(30) comment 'WMS更新日_月'
  , WMS_UPD_DD varchar(30) comment 'WMS更新日_日'
  , WMS_UPD_HH varchar(30) comment 'WMS更新時間_時'
  , WMS_UPD_MI varchar(30) comment 'WMS更新時間_分'
  , WMS_UPD_SS varchar(30) comment 'WMS更新時間_秒'
  , WMS_UPD_USER_NM varchar(60) comment 'WMS更新者'
  , DATA_TRANSFER_ONLY_STR01 varchar(30) comment '会社コード'
  , SPARE_STR varchar(255) comment '予備'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint E_STORE_RECORD_PK primary key (STORE_RECORD_ID)
) comment '入庫実績送信テーブル' ;

-- 振替送信テーブル
create table E_TRANSFER (
  TRANSFER_ID bigint not null comment '振替送信ID'
  , SEND_FLG char(1) default '0' not null comment '送信済フラグ'
  , HINMOKU_CD varchar(100) comment '品目コード'
  , STOCK_TRANSFER_DT varchar(30) comment '在庫移動日_年月日'
  , RECEIVE_PLANT_CD varchar(30) comment '入庫プラント'
  , RECEIVE_STORAGE_SPACE_CD varchar(30) comment '入庫保管場所'
  , SHIPPING_PLANT_CD varchar(30) comment '出庫プラント'
  , SHIPPING_STORAGE_SPACE_CD varchar(30) comment '出庫保管場所'
  , TRANSFER_TYPE_CD varchar(30) comment '移動タイプ'
  , NUM decimal(14,4) comment '数量'
  , HINMOKU_GROUP varchar(30) comment '品目グループ'
  , JAN_CD varchar(30) comment 'JANコード'
  , PRODUCT_NM varchar(60) comment '商品名称'
  , WMS_ADD_YYYY varchar(30) comment 'WMS作成日_年'
  , WMS_ADD_MM varchar(30) comment 'WMS作成日_月'
  , WMS_ADD_DD varchar(30) comment 'WMS作成日_日'
  , WMS_ADD_HH varchar(30) comment 'WMS作成時間_時'
  , WMS_ADD_MI varchar(30) comment 'WMS作成時間_分'
  , WMS_ADD_SS varchar(30) comment 'WMS作成時間_秒'
  , WMS_ADD_USER_CD varchar(30) comment 'WMS作成者'
  , WMS_UPD_YYYY varchar(30) comment 'WMS更新日_年'
  , WMS_UPD_MM varchar(30) comment 'WMS更新日_月'
  , WMS_UPD_DD varchar(30) comment 'WMS更新日_日'
  , WMS_UPD_HH varchar(30) comment 'WMS更新時間_時'
  , WMS_UPD_MI varchar(30) comment 'WMS更新時間_分'
  , WMS_UPD_SS varchar(30) comment 'WMS更新時間_秒'
  , WMS_UPD_USER_CD varchar(30) comment 'WMS更新者'
  , DATA_TRANSFER_ONLY_STR01 varchar(30) comment '担当者'
  , DATA_TRANSFER_ONLY_STR02 varchar(30) comment '更新フラグ'
  , DATA_TRANSFER_ONLY_STR03 varchar(30) comment '入荷日'
  , DATA_TRANSFER_ONLY_STR04 varchar(30) comment '単位コード'
  , DATA_TRANSFER_ONLY_STR05 varchar(30) comment '単位コード名称'
  , DATA_TRANSFER_ONLY_STR06 varchar(30) comment '端末番号1'
  , DATA_TRANSFER_ONLY_STR07 varchar(30) comment '端末番号2'
  , DATA_TRANSFER_ONLY_STR08 varchar(30) comment '棚卸フラグ'
  , DATA_TRANSFER_ONLY_STR09 varchar(30) comment '入出庫番号'
  , SPARE_STR varchar(255) comment '予備'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint E_TRANSFER_PK primary key (TRANSFER_ID)
) comment '振替送信テーブル' ;

-- 郵便番号マスタ受信テーブル
create table E_ZIP (
  ZIP_ID bigint not null comment '郵便番号マスタ受信ID'
  , RECEIVE_CD varchar(30) not null comment '受信CD'
  , RECEIVE_ROW_ID bigint not null comment '受信行ID'
  , IMPORT_FLG char(1) default '0' not null comment '取込みフラグ'
  , ERROR_FLG char(1) default '0' not null comment 'エラーフラグ'
  , ERROR_MESSAGE_CD varchar(100) comment 'エラーメッセージCD'
  , ZIP_CD varchar(255) comment '郵便番号'
  , PUBLIC_CD varchar(255) comment '全国地方公共団体コード'
  , ZIP_CD5 varchar(255) comment '旧郵便番号'
  , ADDRESS_KN1 varchar(255) comment '都道府県カナ'
  , ADDRESS_KN2 varchar(255) comment '市区町村カナ'
  , ADDRESS_KN3 varchar(255) comment '町域カナ'
  , COMPANY_KN varchar(255) comment '大口事業所名カナ'
  , ADDRESS1 varchar(255) comment '都道府県'
  , ADDRESS2 varchar(255) comment '市区町村'
  , ADDRESS3 varchar(255) comment '町域'
  , ADDRESS4 varchar(255) comment '小字'
  , COMPANY_NM varchar(255) comment '大口事業所名'
  , FLG1 varchar(255) comment 'フラグ1'
  , FLG2 varchar(255) comment 'フラグ2'
  , FLG3 varchar(255) comment 'フラグ3'
  , FLG4 varchar(255) comment 'フラグ4'
  , UPD_TYPE varchar(255) comment '更新区分'
  , REASON_TYPE varchar(255) comment '変更理由'
  , HANDLING_ADDRESS varchar(255) comment '取扱局'
  , FLG5 varchar(255) comment 'フラグ5'
  , FLG6 varchar(255) comment 'フラグ6'
  , UPD_CD varchar(255) comment '修正コード'
  , COMPANY_FLG varchar(255) default '0' comment '大口事業所フラグ'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint E_ZIP_PK primary key (ZIP_ID)
) comment '郵便番号マスタ受信テーブル' ;

create unique index E_ZIP_IX1
  on E_ZIP(RECEIVE_CD,RECEIVE_ROW_ID);

create index E_ZIP_IX2
  on E_ZIP(RECEIVE_CD);

-- 運送便伝票番号明細受信テーブル
create table ER_CARRIER_SLIP_NO_DTL (
  CARRIER_SLIP_NO_DTL_ID bigint not null comment '運送便伝票番号明細受信ID'
  , RECEIVE_CD varchar(30) not null comment '受信CD'
  , RECEIVE_ROW_ID bigint not null comment '受信行ID'
  , IMPORT_FLG char(1) default '0' not null comment '取込みフラグ'
  , ERROR_FLG char(1) default '0' not null comment 'エラーフラグ'
  , ERROR_MESSAGE_CD varchar(100) comment 'エラーメッセージCD'
  , SHIPPING_SLIP_NO varchar(30) comment '出荷伝票番号'
  , CARRIER_SLIP_NO varchar(30) comment '運送便伝票番号'
  , NIZOROE_NO varchar(30) comment '荷揃番号'
  , NIZOROE_NO_SN varchar(30) comment '荷揃番号連番'
  , SHIPPING_DT varchar(8) comment '出荷日'
  , CARRIER_CD varchar(30) comment '運送会社CD'
  , CARRIER_NM varchar(60) comment '運送会社名称'
  , PACKING_NUM bigint comment '梱包数'
  , WMS_ADD_YYYY varchar(30) comment 'WMS作成日_年'
  , WMS_ADD_MM varchar(30) comment 'WMS作成日_月'
  , WMS_ADD_DD varchar(30) comment 'WMS作成日_日'
  , WMS_ADD_HH varchar(30) comment 'WMS作成時間_時'
  , WMS_ADD_MI varchar(30) comment 'WMS作成時間_分'
  , WMS_ADD_SS varchar(30) comment 'WMS作成時間_秒'
  , WMS_ADD_USER_CD varchar(30) comment 'WMS作成者'
  , WMS_UPD_YYYY varchar(30) comment 'WMS更新日_年'
  , WMS_UPD_MM varchar(30) comment 'WMS更新日_月'
  , WMS_UPD_DD varchar(30) comment 'WMS更新日_日'
  , WMS_UPD_HH varchar(30) comment 'WMS更新時間_時'
  , WMS_UPD_MI varchar(30) comment 'WMS更新時間_分'
  , WMS_UPD_SS varchar(30) comment 'WMS更新時間_秒'
  , WMS_UPD_USER_CD varchar(30) comment 'WMS更新者'
  , SPARE_STR varchar(255) comment '予備'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint ER_CARRIER_SLIP_NO_DTL_PK primary key (CARRIER_SLIP_NO_DTL_ID)
) comment '運送便伝票番号明細受信テーブル' ;

create unique index ER_CARRIER_SLIP_NO_DTL_IX1
  on ER_CARRIER_SLIP_NO_DTL(RECEIVE_CD,RECEIVE_ROW_ID);

create index ER_CARRIER_SLIP_NO_DTL_IX2
  on ER_CARRIER_SLIP_NO_DTL(RECEIVE_CD);

-- 流通加工情報受信テーブル
create table ER_DISTRIBUTION (
  DISTRIBUTION_ID bigint not null comment '受信ID'
  , RECEIVE_CD varchar(30) not null comment '受信CD'
  , RECEIVE_ROW_ID bigint not null comment '受信行ID'
  , ERROR_FLG char(1) default '0' not null comment 'エラーフラグ'
  , ERROR_MESSAGE_CD varchar(30) comment 'エラーメッセージCD'
  , IMPORT_FLG char(1) default '0' not null comment '送信済フラグ'
  , STORE_SLIP_NO varchar(30) comment '入庫伝票番号'
  , STORE_SLIP_ROW_NO varchar(30) comment '入庫明細番号'
  , STORE_REASON_CD varchar(30) comment '入庫発生事由'
  , SHIPPING_SLIP_NO varchar(30) comment '出荷伝票番号'
  , SHIPPING_SLIP_ROW_NO varchar(30) comment '出荷伝票明細番号'
  , SHIPPING_REASON_CD varchar(30) comment '出荷発生事由'
  , STORE_PLANT_CD varchar(30) comment '入庫プラント'
  , STORE_STORAGE_SPACE_CD varchar(30) comment '入庫保管場所'
  , SHIPPING_PLANT_CD varchar(30) comment '出庫プラント'
  , SHIPPING_STORAGE_SPACE_CD varchar(30) comment '出庫保管場所'
  , HINMOKU_CD varchar(100) comment '品目CD'
  , HINMOKU_TEXT varchar(60) comment '品目テキスト'
  , JAN_CD varchar(30) comment 'JANCD'
  , NUM varchar(30) comment '数量'
  , WMS_ADD_YYYY varchar(30) comment 'WMS作成日_年'
  , WMS_ADD_MM varchar(30) comment 'WMS作成日_月'
  , WMS_ADD_DD varchar(30) comment 'WMS作成日_日'
  , WMS_ADD_HH varchar(30) comment 'WMS作成時間_時'
  , WMS_ADD_MI varchar(30) comment 'WMS作成時間_分'
  , WMS_ADD_SS varchar(30) comment 'WMS作成時間_秒'
  , WMS_ADD_USER_CD varchar(30) comment 'WMS作成者'
  , WMS_UPD_YYYY varchar(30) comment 'WMS更新日_年'
  , WMS_UPD_MM varchar(30) comment 'WMS更新日_月'
  , WMS_UPD_DD varchar(30) comment 'WMS更新日_日'
  , WMS_UPD_HH varchar(30) comment 'WMS更新時間_時'
  , WMS_UPD_MI varchar(30) comment 'WMS更新時間_分'
  , WMS_UPD_SS varchar(30) comment 'WMS更新時間_秒'
  , WMS_UPD_USER_CD varchar(30) comment 'WMS更新者'
  , SPARE_STR varchar(255) comment '予備'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint ER_DISTRIBUTION_PK primary key (DISTRIBUTION_ID)
) comment '流通加工情報受信テーブル' ;

create unique index ER_DISTRIBUTION_IX1
  on ER_DISTRIBUTION(RECEIVE_CD,RECEIVE_ROW_ID);

create index ER_DISTRIBUTION_IX2
  on ER_DISTRIBUTION(RECEIVE_CD);

-- 個体管理情報連携受信テーブル
create table ER_ID_MANAG (
  ID_MANAG_ID bigint not null comment '個体管理情報連携受信ID'
  , RECEIVE_CD varchar(30) not null comment '受信CD'
  , RECEIVE_ROW_ID bigint not null comment '受信行ID'
  , IMPORT_FLG char(1) default '0' not null comment '取込みフラグ'
  , ERROR_FLG char(1) default '0' not null comment 'エラーフラグ'
  , ERROR_MESSAGE_CD varchar(30) comment 'エラーメッセージCD'
  , ID_MANAG_NO varchar(30) comment '個体管理番号'
  , TENHANSHA_CD varchar(30) comment '店販社CD'
  , SALES_ORG_CD varchar(30) comment '販売組織CD'
  , CUSTOMER_CD varchar(30) comment '取引先CD'
  , HINMOKU_CD varchar(100) comment '品目CD'
  , HINMOKU_TEXT varchar(100) comment '品目テキスト'
  , JAN_CD varchar(30) comment 'JANCD'
  , UNIT_NM varchar(30) comment '単位名称'
  , SHARED_PRODUCT_TYPE_CD varchar(30) comment '共有商品区分'
  , CUSTOMER_ORDER_NO varchar(30) comment '取引先注文番号'
  , DELIV_CD varchar(30) comment '納入先CD'
  , DESTINATION_ZIP_CD varchar(30) comment '送り先郵便番号'
  , DESTINATION_ADDRESS1 varchar(60) comment '送り先住所１'
  , DESTINATION_ADDRESS2 varchar(60) comment '送り先住所２'
  , DESTINATION_NM1 varchar(60) comment '送り先名称１'
  , DESTINATION_NM2 varchar(60) comment '送り先名称２'
  , DESTINATION_TEL varchar(30) comment '送り先電話番号'
  , EMP_ID_CD varchar(30) comment '社員識別コード'
  , EMP_NM varchar(60) comment '氏名'
  , STORE_DT varchar(30) comment '入庫日'
  , INVENTORY_DT varchar(30) comment '棚卸日'
  , PICKING_DT varchar(30) comment '出庫日'
  , PRODUCT_RETURN_DT varchar(30) comment '良品返却日'
  , WASTE_RETURN_DT varchar(30) comment '廃棄返却日'
  , ID_MANAG_ABOLITION_TYPE_CD varchar(30) comment '個体管理廃止区分'
  , SPARE_TYPE_CD varchar(30) comment '予備区分'
  , DATA_EXT_FLG_PICKING varchar(30) comment '提供データ抽出済_出庫'
  , DATA_ADD_DT_PICKING varchar(30) comment '提供データ作成日_出庫'
  , DATA_EXT_FLG_RETURN varchar(30) comment '提供データ抽出済_良返'
  , DATA_ADD_DT_RETURN varchar(30) comment '提供データ作成日_良返'
  , DATA_EXT_FLG_WASTE varchar(30) comment '提供データ抽出済_廃棄'
  , DATA_ADD_DT_WASTE varchar(30) comment '提供データ作成日_廃棄'
  , SPARE_STR varchar(255) comment '予備'
  , WMS_ADD_YYYY varchar(30) comment 'WMS作成日_年'
  , WMS_ADD_MM varchar(30) comment 'WMS作成日_月'
  , WMS_ADD_DD varchar(30) comment 'WMS作成日_日'
  , WMS_ADD_HH varchar(30) comment 'WMS作成時間_時'
  , WMS_ADD_MI varchar(30) comment 'WMS作成時間_分'
  , WMS_ADD_SS varchar(30) comment 'WMS作成時間_秒'
  , WMS_ADD_USER_CD varchar(30) comment 'WMS作成者'
  , WMS_UPD_YYYY varchar(30) comment 'WMS更新日_年'
  , WMS_UPD_MM varchar(30) comment 'WMS更新日_月'
  , WMS_UPD_DD varchar(30) comment 'WMS更新日_日'
  , WMS_UPD_HH varchar(30) comment 'WMS更新時間_時'
  , WMS_UPD_MI varchar(30) comment 'WMS更新時間_分'
  , WMS_UPD_SS varchar(30) comment 'WMS更新時間_秒'
  , WMS_UPD_USER_CD varchar(30) comment 'WMS更新者'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint ER_ID_MANAG_PK primary key (ID_MANAG_ID)
) comment '個体管理情報連携受信テーブル' ;

create unique index ER_ID_MANAG_IX1
  on ER_ID_MANAG(RECEIVE_CD,RECEIVE_ROW_ID);

create index ER_ID_MANAG_IX2
  on ER_ID_MANAG(RECEIVE_CD);

-- 棚卸指示(明細)受信テーブル
create table ER_INVENTORY_INST_DTL (
  INVENTORY_INST_DTL_ID bigint not null comment '棚卸指示_明細受信ID'
  , RECEIVE_CD varchar(30) not null comment '受信CD'
  , RECEIVE_ROW_ID bigint not null comment '受信行ID'
  , IMPORT_FLG char(1) default '0' not null comment '取込みフラグ'
  , ERROR_FLG char(1) default '0' not null comment 'エラーフラグ'
  , ERROR_MESSAGE_CD varchar(100) comment 'エラーメッセージCD'
  , INVENTORY_SLIP_NO varchar(30) comment '実地棚卸伝票番号'
  , FISCAL_YEAR varchar(30) comment '会計年度'
  , INVENTORY_SLIP_ROW_NO varchar(30) comment '実地棚卸伝票明細番号'
  , PLANT_CD varchar(30) comment 'プラントCD'
  , STORAGE_SPACE_CD varchar(30) comment '保管場所'
  , REFERENCE_DT varchar(30) comment '基準日'
  , HINMOKU_CD varchar(30) comment '品目CD'
  , STOCK_NUM bigint comment '在庫数量'
  , UNIT_NM varchar(30) comment '単位名称'
  , PRODUCT_NM_KANJI varchar(60) comment '品名漢字'
  , BARCODE varchar(30) comment 'バーコード'
  , DEPOSIT_JAN_CD varchar(30) comment '預かりJANCD'
  , SALES_ORG_CD varchar(30) comment '販売組織CD'
  , TENHANSHA_CD varchar(30) comment '店販社CD'
  , TENHANSHA_NM1 varchar(60) comment '店販社名1'
  , TENHANSHA_NM2 varchar(60) comment '店販社名2'
  , SAP_USER_CD varchar(30) comment 'ユーザCD'
  , SAP_USER_NM varchar(60) comment 'ユーザ名称'
  , ALLOC_TYPE_CD varchar(30) comment '引当区分'
  , LP_SEND_FLG char(1) comment '物流ポータル送信済フラグ'
  , PRODUCT_TYPE varchar(30) comment '商品種別'
  , SAP_ADD_YYYY varchar(30) comment 'SAP作成日_年'
  , SAP_ADD_MM varchar(30) comment 'SAP作成日_月'
  , SAP_ADD_DD varchar(30) comment 'SAP作成日_日'
  , SAP_ADD_HH varchar(30) comment 'SAP作成時間_時'
  , SAP_ADD_MI varchar(30) comment 'SAP作成時間_分'
  , SAP_ADD_SS varchar(30) comment 'SAP作成時間_秒'
  , SAP_ADD_USER_CD varchar(30) comment 'SAP作成者'
  , SAP_UPD_YYYY varchar(30) comment 'SAP更新日_年'
  , SAP_UPD_MM varchar(30) comment 'SAP更新日_月'
  , SAP_UPD_DD varchar(30) comment 'SAP更新日_日'
  , SAP_UPD_HH varchar(30) comment 'SAP更新時間_時'
  , SAP_UPD_MI varchar(30) comment 'SAP更新時間_分'
  , SAP_UPD_SS varchar(30) comment 'SAP更新時間_秒'
  , SAP_UPD_USER_CD varchar(30) comment 'SAP更新者'
  , SPARE_STR varchar(255) comment '予備'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint ER_INVENTORY_INST_DTL_PK primary key (INVENTORY_INST_DTL_ID)
) comment '棚卸指示(明細)受信テーブル' ;

create unique index ER_INVENTORY_INST_DTL_IX1
  on ER_INVENTORY_INST_DTL(RECEIVE_CD,RECEIVE_ROW_ID);

create index ER_INVENTORY_INST_DTL_IX2
  on ER_INVENTORY_INST_DTL(RECEIVE_CD);

-- 棚卸指示(集約)受信テーブル
create table ER_INVENTORY_INST_SUM (
  INVENTORY_INST_ID bigint not null comment '棚卸指示_集約受信ID'
  , RECEIVE_CD varchar(30) not null comment '受信CD'
  , RECEIVE_ROW_ID bigint not null comment '受信行ID'
  , IMPORT_FLG char(1) default '0' not null comment '取込みフラグ'
  , ERROR_FLG char(1) default '0' not null comment 'エラーフラグ'
  , ERROR_MESSAGE_CD varchar(100) comment 'エラーメッセージCD'
  , INVENTORY_SLIP_NO varchar(30) comment '実地棚卸伝票番号'
  , FISCAL_YEAR varchar(30) comment '会計年度'
  , INVENTORY_SLIP_ROW_NO varchar(30) comment '実地棚卸伝票明細番号'
  , PLANT_CD varchar(30) comment 'プラントCD'
  , STORAGE_SPACE_CD varchar(30) comment '保管場所'
  , REFERENCE_DT varchar(30) comment '基準日'
  , LP_SEND_FLG varchar(30) comment '物流ポータル送信済フラグ'
  , SAP_ADD_YYYY varchar(30) comment 'SAP作成日_年'
  , SAP_ADD_MM varchar(30) comment 'SAP作成日_月'
  , SAP_ADD_DD varchar(30) comment 'SAP作成日_日'
  , SAP_ADD_HH varchar(30) comment 'SAP作成時間_時'
  , SAP_ADD_MI varchar(30) comment 'SAP作成時間_分'
  , SAP_ADD_SS varchar(30) comment 'SAP作成時間_秒'
  , SAP_ADD_USER_CD varchar(30) comment 'SAP作成者'
  , SAP_UPD_YYYY varchar(30) comment 'SAP更新日_年'
  , SAP_UPD_MM varchar(30) comment 'SAP更新日_月'
  , SAP_UPD_DD varchar(30) comment 'SAP更新日_日'
  , SAP_UPD_HH varchar(30) comment 'SAP更新時間_時'
  , SAP_UPD_MI varchar(30) comment 'SAP更新時間_分'
  , SAP_UPD_SS varchar(30) comment 'SAP更新時間_秒'
  , SAP_UPD_USER_CD varchar(30) comment 'SAP更新者'
  , SPARE_STR varchar(255) comment '予備'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint ER_INVENTORY_INST_SUM_PK primary key (INVENTORY_INST_ID)
) comment '棚卸指示(集約)受信テーブル' ;

create unique index ER_INVENTORY_INST_SUM_IX1
  on ER_INVENTORY_INST_SUM(RECEIVE_CD,RECEIVE_ROW_ID);

create index ER_INVENTORY_INST_SUM_IX2
  on ER_INVENTORY_INST_SUM(RECEIVE_CD);

-- 棚卸実績(明細)受信テーブル
create table ER_INVENTORY_RECORD_DTL (
  INVENTORY_RECORD_DTL_ID bigint not null comment '棚卸実績_明細受信ID'
  , RECEIVE_CD varchar(30) not null comment '受信CD'
  , RECEIVE_ROW_ID bigint not null comment '受信行ID'
  , IMPORT_FLG char(1) default '0' not null comment '取込みフラグ'
  , ERROR_FLG char(1) default '0' not null comment 'エラーフラグ'
  , ERROR_MESSAGE_CD varchar(30) comment 'エラーメッセージCD'
  , INVENTORY_SLIP_NO varchar(30) comment '実地棚卸伝票番号'
  , FISCAL_YEAR varchar(30) comment '会計年度'
  , INVENTORY_SLIP_ROW_NO varchar(30) comment '実地棚卸伝票明細番号'
  , PLANT_CD varchar(30) comment 'プラントCD'
  , STORAGE_SPACE_CD varchar(30) comment '保管場所'
  , REFERENCE_DT varchar(8) comment '基準日'
  , HINMOKU_CD varchar(100) comment '品目CD'
  , STOCK_NUM decimal(14,4) default 0 comment '在庫数量'
  , PRODUCT_NM_KANJI varchar(60) comment '品名漢字'
  , BARCODE varchar(30) comment 'バーコード'
  , DEPOSIT_JAN_CD varchar(30) comment '預かりJANCD'
  , TENHANSHA_CD varchar(30) comment '店販社CD'
  , SALES_ORG_CD varchar(30) comment '販売組織CD'
  , TENHANSHA_NM1 varchar(60) comment '店販社名1'
  , TENHANSHA_NM2 varchar(60) comment '店販社名2'
  , SAP_USER_CD varchar(30) comment 'SAPユーザCD'
  , SAP_USER_NM varchar(60) comment 'SAPユーザ名称'
  , ALLOC_TYPE_CD varchar(30) comment '引当区分'
  , S4_SEND_FLG char(1) comment 'S4送信済フラグ'
  , WMS_ADD_YYYY varchar(30) comment 'WMS作成日_年'
  , WMS_ADD_MM varchar(30) comment 'WMS作成日_月'
  , WMS_ADD_DD varchar(30) comment 'WMS作成日_日'
  , WMS_ADD_HH varchar(30) comment 'WMS作成時間_時'
  , WMS_ADD_MI varchar(30) comment 'WMS作成時間_分'
  , WMS_ADD_SS varchar(30) comment 'WMS作成時間_秒'
  , WMS_ADD_USER_CD varchar(30) comment 'WMS作成者'
  , WMS_UPD_YYYY varchar(30) comment 'WMS更新日_年'
  , WMS_UPD_MM varchar(30) comment 'WMS更新日_月'
  , WMS_UPD_DD varchar(30) comment 'WMS更新日_日'
  , WMS_UPD_HH varchar(30) comment 'WMS更新時間_時'
  , WMS_UPD_MI varchar(30) comment 'WMS更新時間_分'
  , WMS_UPD_SS varchar(30) comment 'WMS更新時間_秒'
  , WMS_UPD_USER_CD varchar(30) comment 'WMS更新者'
  , SPARE_STR varchar(255) comment '予備'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint ER_INVENTORY_RECORD_DTL_PK primary key (INVENTORY_RECORD_DTL_ID)
) comment '棚卸実績(明細)受信テーブル' ;

create unique index ER_INVENTORY_RECORD_DTL_IX1
  on ER_INVENTORY_RECORD_DTL(RECEIVE_CD,RECEIVE_ROW_ID);

create index ER_INVENTORY_RECORD_DTL_IX2
  on ER_INVENTORY_RECORD_DTL(RECEIVE_CD);

-- 棚卸実績(集約)受信テーブル
create table ER_INVENTORY_REPORT_SUM (
  INVENTORY_REPORT_SUM_ID bigint not null comment '棚卸実績_集約受信ID'
  , RECEIVE_CD varchar(30) not null comment '受信CD'
  , RECEIVE_ROW_ID bigint not null comment '受信行ID'
  , IMPORT_FLG char(1) default '0' not null comment '取込みフラグ'
  , ERROR_FLG char(1) default '0' not null comment 'エラーフラグ'
  , ERROR_MESSAGE_CD varchar(30) comment 'エラーメッセージCD'
  , INVENTORY_SLIP_NO varchar(30) comment '実地棚卸伝票番号'
  , FISCAL_YEAR varchar(30) comment '会計年度'
  , INVENTORY_SLIP_ROW_NO varchar(30) comment '実地棚卸伝票明細番号'
  , PLANT_CD varchar(30) comment 'プラントCD'
  , STORAGE_SPACE_CD varchar(30) comment '保管場所'
  , REFERENCE_DT varchar(8) comment '基準日'
  , HINMOKU_CD varchar(100) comment '品目CD'
  , STOCK_NUM decimal(14,4) default 0 comment '在庫数量'
  , PRODUCT_NM_KANJI varchar(60) comment '品名漢字'
  , BARCODE varchar(30) comment 'バーコード'
  , DEPOSIT_JAN_CD varchar(30) comment '預かりJANCD'
  , TENHANSHA_CD varchar(30) comment '店販社CD'
  , SALES_ORG_CD varchar(30) comment '販売組織CD'
  , TENHANSHA_NM1 varchar(60) comment '店販社名1'
  , TENHANSHA_NM2 varchar(60) comment '店販社名2'
  , SAP_USER_CD varchar(30) comment 'SAPユーザCD'
  , SAP_USER_NM varchar(60) comment 'SAPユーザ名称'
  , ALLOC_TYPE_CD varchar(30) comment '引当区分'
  , S4_SEND_FLG char(1) comment 'S4送信済フラグ'
  , WMS_ADD_YYYY varchar(30) comment 'WMS作成日_年'
  , WMS_ADD_MM varchar(30) comment 'WMS作成日_月'
  , WMS_ADD_DD varchar(30) comment 'WMS作成日_日'
  , WMS_ADD_HH varchar(30) comment 'WMS作成時間_時'
  , WMS_ADD_MI varchar(30) comment 'WMS作成時間_分'
  , WMS_ADD_SS varchar(30) comment 'WMS作成時間_秒'
  , WMS_ADD_USER_CD varchar(30) comment 'WMS作成者'
  , WMS_UPD_YYYY varchar(30) comment 'WMS更新日_年'
  , WMS_UPD_MM varchar(30) comment 'WMS更新日_月'
  , WMS_UPD_DD varchar(30) comment 'WMS更新日_日'
  , WMS_UPD_HH varchar(30) comment 'WMS更新時間_時'
  , WMS_UPD_MI varchar(30) comment 'WMS更新時間_分'
  , WMS_UPD_SS varchar(30) comment 'WMS更新時間_秒'
  , WMS_UPD_USER_CD varchar(30) comment 'WMS更新者'
  , SPARE_STR varchar(255) comment '予備'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint ER_INVENTORY_REPORT_SUM_PK primary key (INVENTORY_REPORT_SUM_ID)
) comment '棚卸実績(集約)受信テーブル' ;

create unique index ER_INVENTORY_REPORT_SUM_IX1
  on ER_INVENTORY_REPORT_SUM(RECEIVE_CD,RECEIVE_ROW_ID);

create index ER_INVENTORY_REPORT_SUM_IX2
  on ER_INVENTORY_REPORT_SUM(RECEIVE_CD);

-- 梱包明細受信テーブル
create table ER_PACKING_LIST (
  PACKING_LIST_ID bigint not null comment '梱包明細受信ID'
  , RECEIVE_CD varchar(30) not null comment '受信CD'
  , RECEIVE_ROW_ID bigint not null comment '受信行ID'
  , IMPORT_FLG char(1) default '0' not null comment '取込みフラグ'
  , ERROR_FLG char(1) default '0' not null comment 'エラーフラグ'
  , ERROR_MESSAGE_CD varchar(30) comment 'エラーメッセージCD'
  , SHIPPING_SLIP_NO varchar(30) comment '出荷伝票番号'
  , PACKING_NO varchar(30) comment '梱包番号'
  , PACKING_ROW_NO varchar(30) comment '梱包明細番号'
  , SHIPPING_SLIP_ROW_NO varchar(30) comment '出荷伝票明細番号'
  , SHIPPING_SLIP_ROW_NO_SN varchar(30) comment '出荷伝票明細番号連番'
  , HINMOKU_CD varchar(100) comment '品目コード'
  , NUM varchar(30) comment '数量'
  , CARRIER_SLIP_NO varchar(30) comment '運送便伝票番号'
  , WMS_ADD_YYYY varchar(30) comment 'WMS作成日_年'
  , WMS_ADD_MM varchar(30) comment 'WMS作成日_月'
  , WMS_ADD_DD varchar(30) comment 'WMS作成日_日'
  , WMS_ADD_HH varchar(30) comment 'WMS作成時間_時'
  , WMS_ADD_MI varchar(30) comment 'WMS作成時間_分'
  , WMS_ADD_SS varchar(30) comment 'WMS作成時間_秒'
  , WMS_ADD_USER_CD varchar(30) comment 'WMS作成者'
  , WMS_UPD_YYYY varchar(30) comment 'WMS更新日_年'
  , WMS_UPD_MM varchar(30) comment 'WMS更新日_月'
  , WMS_UPD_DD varchar(30) comment 'WMS更新日_日'
  , WMS_UPD_HH varchar(30) comment 'WMS更新時間_時'
  , WMS_UPD_MI varchar(30) comment 'WMS更新時間_分'
  , WMS_UPD_SS varchar(30) comment 'WMS更新時間_秒'
  , WMS_UPD_USER_CD varchar(30) comment 'WMS更新者'
  , SPARE_STR varchar(255) comment '予備'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint ER_PACKING_LIST_PK primary key (PACKING_LIST_ID)
) comment '梱包明細受信テーブル' ;

create unique index ER_PACKING_LIST_IX1
  on ER_PACKING_LIST(RECEIVE_CD,RECEIVE_ROW_ID);

create index ER_PACKING_LIST_IX2
  on ER_PACKING_LIST(RECEIVE_CD);

-- 入庫実績受信テーブル
create table ER_RECEIVE_REPORT (
  RECEIVE_REPORT_ID bigint not null comment '入庫実績受信ID'
  , RECEIVE_CD varchar(30) not null comment '受信CD'
  , RECEIVE_ROW_ID bigint not null comment '受信行ID'
  , IMPORT_FLG char(1) default '0' not null comment '取込みフラグ'
  , ERROR_FLG char(1) not null comment 'エラーフラグ'
  , ERROR_MESSAGE_CD varchar(30) comment 'エラーメッセージCD'
  , STORE_SLIP_NO varchar(30) comment '入庫伝票番号'
  , STORE_SLIP_ROW_NO varchar(30) comment '入庫明細番号'
  , SLIP_TYPE_CD varchar(30) comment '伝票種別'
  , SN bigint default 0 comment '連番'
  , IF_ID varchar(30) comment 'IFID'
  , IF_NO varchar(30) comment 'IF用番号'
  , HINMOKU_CD varchar(100) comment '品目コード'
  , JAN_CD varchar(30) comment 'JANコード'
  , STORE_REASON_CD varchar(30) comment '入庫発生事由'
  , STORE_DT varchar(8) comment '入荷日'
  , NUM decimal(14,4) comment '数量'
  , LOT_MANAG_TYPE_CD varchar(30) comment 'ロット管理区分'
  , LOT varchar(100) comment 'ロット'
  , RECEIVE_NO varchar(30) comment '入荷番号'
  , SHIPPING_PLANT_CD varchar(30) comment '出庫プラント'
  , SHIPPING_STORAGE_SPACE_CD varchar(30) comment '出庫保管場所'
  , STORE_PLANT_CD varchar(30) not null comment '入庫プラント'
  , STORE_STORAGE_SPACE_CD varchar(30) not null comment '入庫保管場所'
  , TENHANSHA_CD varchar(30) comment '店販社CD'
  , SALES_ORG_CD varchar(30) comment '販売組織CD'
  , SANSHA_DELIVERY_SLIP_NO1 varchar(30) comment '3社納品書番号1'
  , DATA_TYPE_CD varchar(30) comment 'データ区分'
  , PROCESS_TYPE_CD varchar(30) comment '処理区分'
  , SLIP_NO varchar(30) comment '伝票番号'
  , WMS_ADD_YYYY varchar(30) comment 'WMS作成日_年'
  , WMS_ADD_MM varchar(30) comment 'WMS作成日_月'
  , WMS_ADD_DD varchar(30) comment 'WMS作成日_日'
  , WMS_ADD_HH varchar(30) comment 'WMS作成時間_時'
  , WMS_ADD_MI varchar(30) comment 'WMS作成時間_分'
  , WMS_ADD_SS varchar(30) comment 'WMS作成時間_秒'
  , WMS_ADD_USER_NM varchar(60) comment 'WMS作成者'
  , WMS_UPD_YYYY varchar(30) comment 'WMS更新日_年'
  , WMS_UPD_MM varchar(30) comment 'WMS更新日_月'
  , WMS_UPD_DD varchar(30) comment 'WMS更新日_日'
  , WMS_UPD_HH varchar(30) comment 'WMS更新時間_時'
  , WMS_UPD_MI varchar(30) comment 'WMS更新時間_分'
  , WMS_UPD_SS varchar(30) comment 'WMS更新時間_秒'
  , WMS_UPD_USER_NM varchar(60) comment 'WMS更新者'
  , DATA_TRANSFER_ONLY_STR01 varchar(30) comment '会社コード'
  , SPARE_STR varchar(255) comment '予備'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint ER_RECEIVE_REPORT_PK primary key (RECEIVE_REPORT_ID)
) comment '入庫実績受信テーブル' ;

create unique index ER_RECEIVE_REPORT_IX1
  on ER_RECEIVE_REPORT(RECEIVE_CD,RECEIVE_ROW_ID);

create index ER_RECEIVE_REPORT_IX2
  on ER_RECEIVE_REPORT(RECEIVE_CD);

-- 販売組織マスタ受信テーブル
create table ER_SALES_ORG (
  SALES_ORG_ID bigint not null comment '販売組織マスタ受信ID'
  , RECEIVE_CD varchar(30) not null comment '受信CD'
  , RECEIVE_ROW_ID bigint not null comment '受信行ID'
  , IMPORT_FLG char(1) default '0' not null comment '取込みフラグ'
  , ERROR_FLG char(1) default '0' not null comment 'エラーフラグ'
  , ERROR_MESSAGE_CD varchar(100) comment 'エラーメッセージCD'
  , SALES_ORG_CD varchar(30) comment '販売組織CD'
  , PURCHASE_ORG_CD varchar(30) comment '購買組織CD'
  , TENHANSHA_CD varchar(30) comment '店販社CD'
  , TENHANSHA_NM1 varchar(60) comment '店販社名称１'
  , TENHANSHA_NM2 varchar(60) comment '店販社名称２'
  , TENHANSHA_ZIP_CD varchar(30) comment '店販社郵便番号'
  , TENHANSHA_PREFECTURE varchar(30) comment '店販社都道府県'
  , TENHANSHA_ADDRESS1 varchar(60) comment '店販社住所１'
  , TENHANSHA_ADDRESS2 varchar(60) comment '店販社住所２'
  , TENHANSHA_TEL_NO varchar(30) comment '店販社電話番号'
  , TENHANSHA_FAX_NO varchar(30) comment '店販社ＦＡＸ番号'
  , PLANT_NORMAL varchar(30) comment 'プラント_通常品'
  , PLANT_DEPOSIT varchar(30) comment 'プラント_預かり品'
  , SAP_ADD_YYYY varchar(30) comment 'SAP作成日_年'
  , SAP_ADD_MM varchar(30) comment 'SAP作成日_月'
  , SAP_ADD_DD varchar(30) comment 'SAP作成日_日'
  , SAP_ADD_HH varchar(30) comment 'SAP作成時間_時'
  , SAP_ADD_MI varchar(30) comment 'SAP作成時間_分'
  , SAP_ADD_SS varchar(30) comment 'SAP作成時間_秒'
  , SAP_ADD_USER_CD varchar(30) comment 'SAP作成者'
  , SAP_UPD_YYYY varchar(30) comment 'SAP更新日_年'
  , SAP_UPD_MM varchar(30) comment 'SAP更新日_月'
  , SAP_UPD_DD varchar(30) comment 'SAP更新日_日'
  , SAP_UPD_HH varchar(30) comment 'SAP更新時間_時'
  , SAP_UPD_MI varchar(30) comment 'SAP更新時間_分'
  , SAP_UPD_SS varchar(30) comment 'SAP更新時間_秒'
  , SAP_UPD_USER_CD varchar(30) comment 'SAP更新者'
  , SPARE_STR varchar(255) comment '予備'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint ER_SALES_ORG_PK primary key (SALES_ORG_ID)
) comment '販売組織マスタ受信テーブル' ;

create unique index ER_SALES_ORG_IX1
  on ER_SALES_ORG(RECEIVE_CD,RECEIVE_ROW_ID);

create index ER_SALES_ORG_IX2
  on ER_SALES_ORG(RECEIVE_CD);

-- SCMラベル情報受信テーブル
create table ER_SCM_LABEL (
  SCM_LABEL_ID bigint not null comment 'SCMラベル情報受信ID'
  , RECEIVE_CD varchar(30) not null comment '受信CD'
  , RECEIVE_ROW_ID bigint not null comment '受信行ID'
  , IMPORT_FLG char(1) default '0' not null comment '取込みフラグ'
  , ERROR_FLG char(1) default '0' not null comment 'エラーフラグ'
  , ERROR_MESSAGE_CD varchar(30) comment 'エラーメッセージCD'
  , SHIPPING_SLIP_NO varchar(30) comment '出荷伝票番号'
  , PACKING_NO varchar(30) comment '梱包番号'
  , CARTON_ID_NO varchar(30) comment 'カートン識別番号'
  , SN varchar(30) comment '連番'
  , MANAG_TYPE_CD varchar(30) comment '管理区分'
  , HINMOKU_CD varchar(100) comment '品目CD'
  , HINMOKU_GROUP varchar(30) comment '品目グループ'
  , HINMOKU_TEXT varchar(60) comment '品目テキスト'
  , JAN_CD varchar(30) comment 'JANCD'
  , NUM varchar(30) comment '数量'
  , SERIAL_NO varchar(30) comment 'シリアル番号'
  , LOT_MANAG_TYPE_CD varchar(30) comment 'ロット管理区分'
  , LOT varchar(100) comment 'ロット番号'
  , LIMIT_DT varchar(30) comment '期限日'
  , PROD_DT varchar(30) comment '製造日'
  , WMS_ADD_YYYY varchar(30) comment 'WMS作成日_年'
  , WMS_ADD_MM varchar(30) comment 'WMS作成日_月'
  , WMS_ADD_DD varchar(30) comment 'WMS作成日_日'
  , WMS_ADD_HH varchar(30) comment 'WMS作成時間_時'
  , WMS_ADD_MI varchar(30) comment 'WMS作成時間_分'
  , WMS_ADD_SS varchar(30) comment 'WMS作成時間_秒'
  , WMS_ADD_USER_CD varchar(30) comment 'WMS作成者'
  , WMS_UPD_YYYY varchar(30) comment 'WMS更新日_年'
  , WMS_UPD_MM varchar(30) comment 'WMS更新日_月'
  , WMS_UPD_DD varchar(30) comment 'WMS更新日_日'
  , WMS_UPD_HH varchar(30) comment 'WMS更新時間_時'
  , WMS_UPD_MI varchar(30) comment 'WMS更新時間_分'
  , WMS_UPD_SS varchar(30) comment 'WMS更新時間_秒'
  , WMS_UPD_USER_CD varchar(30) comment 'WMS更新者'
  , SPARE_STR varchar(255) comment '予備'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint ER_SCM_LABEL_PK primary key (SCM_LABEL_ID)
) comment 'SCMラベル情報受信テーブル' ;

create unique index ER_SCM_LABEL_IX1
  on ER_SCM_LABEL(RECEIVE_CD,RECEIVE_ROW_ID);

create index ER_SCM_LABEL_IX2
  on ER_SCM_LABEL(RECEIVE_CD);

-- シリアル番号情報受信テーブル
create table ER_SERIAL_NO (
  SERIAL_NO_ID bigint not null comment 'シリアル番号情報受信ID'
  , RECEIVE_CD varchar(30) not null comment '受信CD'
  , RECEIVE_ROW_ID bigint not null comment '受信行ID'
  , IMPORT_FLG char(1) default '0' not null comment '取込みフラグ'
  , ERROR_FLG char(1) default '0' not null comment 'エラーフラグ'
  , ERROR_MESSAGE_CD varchar(100) comment 'エラーメッセージCD'
  , SHIPPING_SLIP_NO varchar(30) comment '出荷伝票番号'
  , SHIPPING_SLIP_ROW_NO varchar(30) comment '出荷伝票明細番号'
  , SERIAL_NO varchar(100) comment 'シリアル番号'
  , HINMOKU_CD varchar(100) comment '品目CD'
  , HINMOKU_GROUP varchar(30) comment '品目グループ'
  , HINMOKU_TEXT varchar(60) comment '品目テキスト'
  , JAN_CD varchar(30) comment 'JANCD'
  , UNIT_NM varchar(60) comment '単位名称'
  , SALES_ORG_CD varchar(30) comment '販売組織CD'
  , SHIPPING_DT varchar(30) comment '出荷日'
  , CUSTOMER_CD varchar(30) comment '取引先CD'
  , DESTINATION_CD varchar(30) comment '送り先CD'
  , DESTINATION_NM1 varchar(60) comment '送り先名称１'
  , DESTINATION_NM2 varchar(60) comment '送り先名称２'
  , DESTINATION_NM_KANA varchar(60) comment '送り先名称_カナ'
  , DESTINATION_ZIP_CD varchar(60) comment '送り先郵便番号'
  , DESTINATION_ADDRESS1 varchar(60) comment '送り先住所１'
  , DESTINATION_ADDRESS2 varchar(60) comment '送り先住所２'
  , DESTINATION_TEL varchar(30) comment '送り先電話番号'
  , SHIPPING_PLANT_CD varchar(30) comment '出庫プラント'
  , SHIPPING_STORAGE_SPACE_CD varchar(30) comment '出庫保管場所'
  , WMS_ADD_YYYY varchar(30) comment 'WMS作成日_年'
  , WMS_ADD_MM varchar(30) comment 'WMS作成日_月'
  , WMS_ADD_DD varchar(30) comment 'WMS作成日_日'
  , WMS_ADD_HH varchar(30) comment 'WMS作成時間_時'
  , WMS_ADD_MI varchar(30) comment 'WMS作成時間_分'
  , WMS_ADD_SS varchar(30) comment 'WMS作成時間_秒'
  , WMS_ADD_USER_CD varchar(30) comment 'WMS作成者'
  , WMS_UPD_YYYY varchar(30) comment 'WMS更新日_年'
  , WMS_UPD_MM varchar(30) comment 'WMS更新日_月'
  , WMS_UPD_DD varchar(30) comment 'WMS更新日_日'
  , WMS_UPD_HH varchar(30) comment 'WMS更新時間_時'
  , WMS_UPD_MI varchar(30) comment 'WMS更新時間_分'
  , WMS_UPD_SS varchar(30) comment 'WMS更新時間_秒'
  , WMS_UPD_USER_CD varchar(30) comment 'WMS更新者'
  , SPARE_STR varchar(255) comment '予備'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint ER_SERIAL_NO_PK primary key (SERIAL_NO_ID)
) comment 'シリアル番号情報受信テーブル' ;

create unique index ER_SERIAL_NO_IX1
  on ER_SERIAL_NO(RECEIVE_CD,RECEIVE_ROW_ID);

create index ER_SERIAL_NO_IX2
  on ER_SERIAL_NO(RECEIVE_CD);

-- 出荷実績受信テーブル
create table ER_SHIPPING_RECORD (
  SHIPPING_RECORD_ID bigint not null comment '出荷実績受信ID'
  , RECEIVE_CD varchar(30) not null comment '受信CD'
  , RECEIVE_ROW_ID bigint not null comment '受信行ID'
  , IMPORT_FLG char(1) default '0' not null comment '取込みフラグ'
  , ERROR_FLG char(1) default '0' not null comment 'エラーフラグ'
  , ERROR_MESSAGE_CD varchar(30) comment 'エラーメッセージCD'
  , SHIPPING_SLIP_NO varchar(30) comment '出荷伝票番号'
  , SHIPPING_SLIP_ROW_NO varchar(30) comment '出荷伝票明細番号'
  , SN bigint default 0 comment '連番'
  , SALES_ORDER_NO varchar(30) comment '受注番号'
  , HINMOKU_CD varchar(30) not null comment '品目コード'
  , SHIPPING_DT varchar(8) not null comment '出荷日'
  , JAN_CD varchar(30) comment 'JANコード'
  , NUM decimal(14,4) default 0 not null comment '数量'
  , LOT_MANAG_TYPE_CD varchar(30) comment 'ロット管理区分'
  , LOT varchar(100) comment 'ロット番号'
  , CARRIER_SLIP_NO varchar(30) comment '運送便伝票番号'
  , CARRIER_CD varchar(30) comment '運送業者コード'
  , CARRIER_RNM varchar(60) comment '運送業者略称'
  , CONFIRMED_PACKING_NUM bigint not null comment '確定梱包数'
  , SALES_NO2 varchar(30) comment '売上番号２'
  , DELIVERY_SLIP_NO varchar(30) comment '納品書番号'
  , D_STR varchar(60) comment 'D'
  , I_STR varchar(60) comment 'I'
  , SHIPPING_STORAGE_SPACE_CD varchar(30) comment '出庫保管場所'
  , WMS_ADD_YYYY varchar(30) comment 'WMS作成日_年'
  , WMS_ADD_MM varchar(30) comment 'WMS作成日_月'
  , WMS_ADD_DD varchar(30) comment 'WMS作成日_日'
  , WMS_ADD_HH varchar(30) comment 'WMS作成時間_時'
  , WMS_ADD_MI varchar(30) comment 'WMS作成時間_分'
  , WMS_ADD_SS varchar(30) comment 'WMS作成時間_秒'
  , WMS_ADD_USER_CD varchar(30) comment 'WMS作成者'
  , WMS_UPD_YYYY varchar(30) comment 'WMS更新日_年'
  , WMS_UPD_MM varchar(30) comment 'WMS更新日_月'
  , WMS_UPD_DD varchar(30) comment 'WMS更新日_日'
  , WMS_UPD_HH varchar(30) comment 'WMS更新時間_時'
  , WMS_UPD_MI varchar(30) comment 'WMS更新時間_分'
  , WMS_UPD_SS varchar(30) comment 'WMS更新時間_秒'
  , WMS_UPD_USER_CD varchar(30) comment 'WMS更新者'
  , SPARE_STR varchar(255) comment '予備'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint ER_SHIPPING_RECORD_PK primary key (SHIPPING_RECORD_ID)
) comment '出荷実績受信テーブル' ;

create unique index ER_SHIPPING_RECORD_IX1
  on ER_SHIPPING_RECORD(RECEIVE_CD,RECEIVE_ROW_ID);

create index ER_SHIPPING_RECORD_IX2
  on ER_SHIPPING_RECORD(RECEIVE_CD);

-- 在庫実績受信テーブル
create table ER_STOCK_RECORD (
  STOCK_RECORD_ID bigint not null comment '在庫実績受信ID'
  , RECEIVE_CD varchar(30) not null comment '受信CD'
  , RECEIVE_ROW_ID bigint not null comment '受信行ID'
  , IMPORT_FLG char(1) default '0' not null comment '取込みフラグ'
  , ERROR_FLG char(1) default '0' not null comment 'エラーフラグ'
  , ERROR_MESSAGE_CD varchar(100) comment 'エラーメッセージCD'
  , PLANT_CD varchar(30) comment 'プラントCD'
  , STORAGE_SPACE_CD varchar(30) comment '保管場所'
  , REFERENCE_DT varchar(8) comment '基準日'
  , HINMOKU_CD varchar(100) comment '品目CD'
  , STOCK_NUM decimal(14,4) default 0 comment '在庫数量'
  , PRODUCT_NM_KANJI varchar(60) comment '品名漢字'
  , BARCODE varchar(30) comment 'バーコード'
  , DEPOSIT_JAN_CD varchar(30) comment '預かりJANCD'
  , TENHANSHA_CD varchar(30) comment '店販社CD'
  , SALES_ORG_CD varchar(30) comment '販売組織CD'
  , TENHANSHA_NM1 varchar(60) comment '店販社名1'
  , TENHANSHA_NM2 varchar(60) comment '店販社名2'
  , SAP_USER_CD varchar(30) comment 'SAPユーザCD'
  , SAP_USER_NM varchar(60) comment 'SAPユーザ名称'
  , ALLOC_TYPE_CD varchar(30) comment '引当区分'
  , WMS_ADD_YYYY varchar(30) comment 'WMS作成日_年'
  , WMS_ADD_MM varchar(30) comment 'WMS作成日_月'
  , WMS_ADD_DD varchar(30) comment 'WMS作成日_日'
  , WMS_ADD_HH varchar(30) comment 'WMS作成時間_時'
  , WMS_ADD_MI varchar(30) comment 'WMS作成時間_分'
  , WMS_ADD_SS varchar(30) comment 'WMS作成時間_秒'
  , WMS_ADD_USER_CD varchar(30) comment 'WMS作成者'
  , WMS_UPD_YYYY varchar(30) comment 'WMS更新日_年'
  , WMS_UPD_MM varchar(30) comment 'WMS更新日_月'
  , WMS_UPD_DD varchar(30) comment 'WMS更新日_日'
  , WMS_UPD_HH varchar(30) comment 'WMS更新時間_時'
  , WMS_UPD_MI varchar(30) comment 'WMS更新時間_分'
  , WMS_UPD_SS varchar(30) comment 'WMS更新時間_秒'
  , WMS_UPD_USER_CD varchar(30) comment 'WMS更新者'
  , SPARE_STR varchar(255) comment '予備'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint ER_STOCK_RECORD_PK primary key (STOCK_RECORD_ID)
) comment '在庫実績受信テーブル' ;

create unique index ER_STOCK_RECORD_IX1
  on ER_STOCK_RECORD(RECEIVE_CD,RECEIVE_ROW_ID);

create index ER_STOCK_RECORD_IX2
  on ER_STOCK_RECORD(RECEIVE_CD);

-- 振替受信テーブル
create table ER_TRANSFER_REPORT (
  TRANSFER_REPORT_ID bigint not null comment '振替受信ID'
  , RECEIVE_CD varchar(30) not null comment '受信CD'
  , RECEIVE_ROW_ID bigint not null comment '受信行ID'
  , IMPORT_FLG char(1) default '0' not null comment '取込みフラグ'
  , ERROR_FLG char(1) default '0' not null comment 'エラーフラグ'
  , ERROR_MESSAGE_CD varchar(30) comment 'エラーメッセージCD'
  , HINMOKU_CD varchar(100) comment '品目コード'
  , STOCK_TRANSFER_DT varchar(30) comment '在庫移動日_年月日'
  , RECEIVE_PLANT_CD varchar(30) comment '入庫プラント'
  , RECEIVE_STORAGE_SPACE_CD varchar(30) comment '入庫保管場所'
  , SHIPPING_PLANT_CD varchar(30) comment '出庫プラント'
  , SHIPPING_STORAGE_SPACE_CD varchar(30) comment '出庫保管場所'
  , TRANSFER_TYPE_CD varchar(30) comment '移動タイプ'
  , NUM decimal(14,4) comment '数量'
  , HINMOKU_GROUP varchar(30) comment '品目グループ'
  , JAN_CD varchar(30) comment 'JANコード'
  , PRODUCT_NM varchar(60) comment '商品名称'
  , S4_SEND_FLG char(1) comment 'S4送信済フラグ'
  , WMS_ADD_YYYY varchar(30) comment 'WMS作成日_年'
  , WMS_ADD_MM varchar(30) comment 'WMS作成日_月'
  , WMS_ADD_DD varchar(30) comment 'WMS作成日_日'
  , WMS_ADD_HH varchar(30) comment 'WMS作成時間_時'
  , WMS_ADD_MI varchar(30) comment 'WMS作成時間_分'
  , WMS_ADD_SS varchar(30) comment 'WMS作成時間_秒'
  , WMS_ADD_USER_CD varchar(30) comment 'WMS作成者'
  , WMS_UPD_YYYY varchar(30) comment 'WMS更新日_年'
  , WMS_UPD_MM varchar(30) comment 'WMS更新日_月'
  , WMS_UPD_DD varchar(30) comment 'WMS更新日_日'
  , WMS_UPD_HH varchar(30) comment 'WMS更新時間_時'
  , WMS_UPD_MI varchar(30) comment 'WMS更新時間_分'
  , WMS_UPD_SS varchar(30) comment 'WMS更新時間_秒'
  , WMS_UPD_USER_CD varchar(30) comment 'WMS更新者'
  , DATA_TRANSFER_ONLY_STR01 varchar(30) comment '担当者'
  , DATA_TRANSFER_ONLY_STR02 varchar(30) comment '更新フラグ'
  , DATA_TRANSFER_ONLY_STR03 varchar(30) comment '入荷日'
  , DATA_TRANSFER_ONLY_STR04 varchar(30) comment '単位コード'
  , DATA_TRANSFER_ONLY_STR05 varchar(30) comment '単位コード名称'
  , DATA_TRANSFER_ONLY_STR06 varchar(30) comment '端末番号1'
  , DATA_TRANSFER_ONLY_STR07 varchar(30) comment '端末番号2'
  , DATA_TRANSFER_ONLY_STR08 varchar(30) comment '棚卸フラグ'
  , DATA_TRANSFER_ONLY_STR09 varchar(30) comment '入出庫番号'
  , SPARE_STR varchar(255) comment '予備'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint ER_TRANSFER_REPORT_PK primary key (TRANSFER_REPORT_ID)
) comment '振替受信テーブル' ;

create unique index ER_TRANSFER_REPORT_IX1
  on ER_TRANSFER_REPORT(RECEIVE_CD,RECEIVE_ROW_ID);

create index ER_TRANSFER_REPORT_IX2
  on ER_TRANSFER_REPORT(RECEIVE_CD);

-- 拠点マスタ送信テーブル
create table ES_BASE (
  BASE_ID bigint not null comment '拠点マスタ送信ID'
  , SEND_FLG char(1) default '0' not null comment '送信済フラグ'
  , BASE_CD varchar(30) comment '拠点CD'
  , BASE_NM varchar(60) comment '拠点名称'
  , BASE_TYPE_CD varchar(30) comment '拠点種別'
  , FOREIGN_FLG char(1) comment '国内外フラグ'
  , SAP_ADD_YYYY varchar(30) comment 'SAP作成日_年'
  , SAP_ADD_MM varchar(30) comment 'SAP作成日_月'
  , SAP_ADD_DD varchar(30) comment 'SAP作成日_日'
  , SAP_ADD_HH varchar(30) comment 'SAP作成時間_時'
  , SAP_ADD_MI varchar(30) comment 'SAP作成時間_分'
  , SAP_ADD_SS varchar(30) comment 'SAP作成時間_秒'
  , SAP_ADD_USER_CD varchar(30) comment 'SAP作成者'
  , SAP_UPD_YYYY varchar(30) comment 'SAP更新日_年'
  , SAP_UPD_MM varchar(30) comment 'SAP更新日_月'
  , SAP_UPD_DD varchar(30) comment 'SAP更新日_日'
  , SAP_UPD_HH varchar(30) comment 'SAP更新時間_時'
  , SAP_UPD_MI varchar(30) comment 'SAP更新時間_分'
  , SAP_UPD_SS varchar(30) comment 'SAP更新時間_秒'
  , SAP_UPD_USER_CD varchar(30) comment 'SAP更新者'
  , SPARE_STR varchar(255) comment '予備'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint ES_BASE_PK primary key (BASE_ID)
) comment '拠点マスタ送信テーブル' ;

-- 棚卸指示送信テーブル
create table ES_INVENTORY_INST (
  INVENTORY_INST_ID bigint not null comment '棚卸指示送信ID'
  , SEND_FLG char(1) default '0' not null comment '送信済フラグ'
  , INVENTORY_SLIP_NO varchar(30) comment '実地棚卸伝票番号'
  , INVENTORY_SLIP_ROW_NO varchar(30) comment '実地棚卸伝票明細番号'
  , PLANT_CD varchar(30) comment 'プラントCD'
  , STORAGE_SPACE_CD varchar(30) comment '保管場所'
  , REFERENCE_DT varchar(30) comment '基準日'
  , UNIT_NM varchar(30) comment '単位名称'
  , SAP_ADD_YYYY varchar(30) comment 'SAP作成日_年'
  , SAP_ADD_MM varchar(30) comment 'SAP作成日_月'
  , SAP_ADD_DD varchar(30) comment 'SAP作成日_日'
  , SAP_ADD_HH varchar(30) comment 'SAP作成時間_時'
  , SAP_ADD_MI varchar(30) comment 'SAP作成時間_分'
  , SAP_ADD_SS varchar(30) comment 'SAP作成時間_秒'
  , SAP_ADD_USER_CD varchar(30) comment 'SAP作成者'
  , SAP_UPD_YYYY varchar(30) comment 'SAP更新日_年'
  , SAP_UPD_MM varchar(30) comment 'SAP更新日_月'
  , SAP_UPD_DD varchar(30) comment 'SAP更新日_日'
  , SAP_UPD_HH varchar(30) comment 'SAP更新時間_時'
  , SAP_UPD_MI varchar(30) comment 'SAP更新時間_分'
  , SAP_UPD_SS varchar(30) comment 'SAP更新時間_秒'
  , SAP_UPD_USER_CD varchar(30) comment 'SAP更新者'
  , PRODUCT_NM_KANJI varchar(60) comment '品名漢字'
  , BARCODE varchar(30) comment 'バーコード'
  , DEPOSIT_JAN_CD varchar(30) comment '預かりJANCD'
  , TENHANSHA_CD varchar(30) comment '店販社CD'
  , TENHANSHA_NM1 varchar(60) comment '店販社名1'
  , TENHANSHA_NM2 varchar(60) comment '店販社名2'
  , SAP_USER_CD varchar(30) comment 'ユーザCD'
  , SAP_USER_NM varchar(60) comment 'ユーザ名称'
  , PRODUCT_TYPE varchar(30) comment '商品種別'
  , ALLOC_TYPE_CD varchar(30) comment '引当区分'
  , SPARE_STR varchar(255) comment '予備'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint ES_INVENTORY_INST_PK primary key (INVENTORY_INST_ID)
) comment '棚卸指示送信テーブル' ;

-- 棚卸指示(明細)送信テーブル
create table ES_INVENTORY_INST_DTL (
  INVENTORY_INST_DTL_ID bigint not null comment '棚卸指示_明細送信ID'
  , SEND_FLG char(1) default '0' not null comment '送信済フラグ'
  , INVENTORY_SLIP_NO varchar(30) comment '実地棚卸伝票番号'
  , FISCAL_YEAR varchar(30) comment '会計年度'
  , INVENTORY_SLIP_ROW_NO varchar(30) comment '実地棚卸伝票明細番号'
  , PLANT_CD varchar(30) comment 'プラントCD'
  , STORAGE_SPACE_CD varchar(30) comment '保管場所'
  , REFERENCE_DT varchar(30) comment '基準日'
  , HINMOKU_CD varchar(30) comment '品目CD'
  , STOCK_NUM bigint comment '在庫数量'
  , UNIT_NM varchar(30) comment '単位名称'
  , PRODUCT_NM_KANJI varchar(60) comment '品名漢字'
  , BARCODE varchar(30) comment 'バーコード'
  , DEPOSIT_JAN_CD varchar(30) comment '預かりJANCD'
  , SALES_ORG_CD varchar(30) comment '販売組織CD'
  , TENHANSHA_CD varchar(30) comment '店販社CD'
  , TENHANSHA_NM1 varchar(60) comment '店販社名1'
  , TENHANSHA_NM2 varchar(60) comment '店販社名2'
  , SAP_USER_CD varchar(30) comment 'ユーザCD'
  , SAP_USER_NM varchar(60) comment 'ユーザ名称'
  , PRODUCT_TYPE varchar(30) comment '商品種別'
  , ALLOC_TYPE_CD varchar(30) comment '引当区分'
  , SAP_ADD_YYYY varchar(30) comment 'SAP作成日_年'
  , SAP_ADD_MM varchar(30) comment 'SAP作成日_月'
  , SAP_ADD_DD varchar(30) comment 'SAP作成日_日'
  , SAP_ADD_HH varchar(30) comment 'SAP作成時間_時'
  , SAP_ADD_MI varchar(30) comment 'SAP作成時間_分'
  , SAP_ADD_SS varchar(30) comment 'SAP作成時間_秒'
  , SAP_ADD_USER_CD varchar(30) comment 'SAP作成者'
  , SAP_UPD_YYYY varchar(30) comment 'SAP更新日_年'
  , SAP_UPD_MM varchar(30) comment 'SAP更新日_月'
  , SAP_UPD_DD varchar(30) comment 'SAP更新日_日'
  , SAP_UPD_HH varchar(30) comment 'SAP更新時間_時'
  , SAP_UPD_MI varchar(30) comment 'SAP更新時間_分'
  , SAP_UPD_SS varchar(30) comment 'SAP更新時間_秒'
  , SAP_UPD_USER_CD varchar(30) comment 'SAP更新者'
  , SPARE_STR varchar(255) comment '予備'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint ES_INVENTORY_INST_DTL_PK primary key (INVENTORY_INST_DTL_ID)
) comment '棚卸指示(明細)送信テーブル' ;

-- 棚卸指示(集約)送信テーブル
create table ES_INVENTORY_INST_SUM (
  INVENTORY_INST_ID bigint not null comment '棚卸指示_集約送信ID'
  , SEND_FLG char(1) default '0' not null comment '送信済フラグ'
  , INVENTORY_SLIP_NO varchar(30) comment '実地棚卸伝票番号'
  , FISCAL_YEAR varchar(30) comment '会計年度'
  , INVENTORY_SLIP_ROW_NO varchar(30) comment '実地棚卸伝票明細番号'
  , PLANT_CD varchar(30) comment 'プラントCD'
  , STORAGE_SPACE_CD varchar(30) comment '保管場所'
  , REFERENCE_DT varchar(30) comment '基準日'
  , UNIT_NM varchar(30) comment '単位名称'
  , SAP_ADD_YYYY varchar(30) comment 'SAP作成日_年'
  , SAP_ADD_MM varchar(30) comment 'SAP作成日_月'
  , SAP_ADD_DD varchar(30) comment 'SAP作成日_日'
  , SAP_ADD_HH varchar(30) comment 'SAP作成時間_時'
  , SAP_ADD_MI varchar(30) comment 'SAP作成時間_分'
  , SAP_ADD_SS varchar(30) comment 'SAP作成時間_秒'
  , SAP_ADD_USER_CD varchar(30) comment 'SAP作成者'
  , SAP_UPD_YYYY varchar(30) comment 'SAP更新日_年'
  , SAP_UPD_MM varchar(30) comment 'SAP更新日_月'
  , SAP_UPD_DD varchar(30) comment 'SAP更新日_日'
  , SAP_UPD_HH varchar(30) comment 'SAP更新時間_時'
  , SAP_UPD_MI varchar(30) comment 'SAP更新時間_分'
  , SAP_UPD_SS varchar(30) comment 'SAP更新時間_秒'
  , SAP_UPD_USER_CD varchar(30) comment 'SAP更新者'
  , SPARE_STR varchar(255) comment '予備'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint ES_INVENTORY_INST_SUM_PK primary key (INVENTORY_INST_ID)
) comment '棚卸指示(集約)送信テーブル' ;

-- 戸口配送マスタ送信テーブル
create table ES_KOGUCHI_DELIVERY (
  KOGUCHI_DELIVERY_ID bigint not null comment '戸口配送マスタ送信ID'
  , SEND_FLG char(1) default '0' not null comment '送信済フラグ'
  , BASE_CD varchar(30) comment '拠点CD'
  , SERV_SALES_ORG_CD varchar(100) comment '取扱販売組織CD'
  , SERV_SALES_ORG_NM varchar(60) comment '取扱販売組織名称'
  , DIRECT_FLG char(1) comment '直送フラグ'
  , URGENT_FLG char(1) comment '緊急フラグ'
  , DELIVERY_FLG char(1) comment '納品フラグ'
  , KOGUCHI_DELIVERY_CD varchar(30) comment '戸口配送先CD'
  , KOGUCHI_DELIVERY_NM varchar(60) comment '戸口配送先名称'
  , UNI_DELIVERY_CD varchar(30) comment '統合配送先CD'
  , UNI_DELIVERY_NM varchar(60) comment '統合配送先名称'
  , FW_TYPE_CD varchar(30) comment 'FW区分'
  , MCA_TYPE_CD varchar(30) comment 'MCA区分'
  , YOUHIN_TYPE_CD varchar(30) comment '用品区分'
  , REQ_SALES_ORG_CD varchar(30) comment '依頼元販売組織CD'
  , REQ_SALES_ORG_NM varchar(60) comment '依頼元販売組織名称'
  , REQ_SALES_ORG_BRANCH_NM varchar(60) comment '依頼元販売組織支店名称'
  , REQ_SALES_ORG_ADDRESS1 varchar(255) comment '依頼元販売組織住所１'
  , REQ_SALES_ORG_ADDRESS2 varchar(255) comment '依頼元販売組織住所２'
  , REQ_SALES_ORG_ZIP_CD varchar(30) comment '依頼元販売組織郵便番号'
  , REQ_SALES_ORG_TEL_NO varchar(30) comment '依頼元販売組織電話番号'
  , REQ_SALES_ORG_FAX_NO varchar(30) comment '依頼元販売組織FAX番号'
  , REMARK1 varchar(255) comment '物品送付下部備考項目1'
  , REMARK2 varchar(255) comment '物品送付下部備考項目2'
  , REMARK3 varchar(255) comment '物品送付下部備考項目3'
  , REMARK4 varchar(255) comment '物品送付下部備考項目4'
  , INDV_OUT varchar(30) comment '個別出力'
  , INVOICE_SUMMARY varchar(255) comment '送り状摘要'
  , PSAM varchar(30) comment 'PSAM'
  , ABOLISH_DT varchar(8) comment '廃止日'
  , FLOOR_COMP_FLG char(1) comment 'フロア完結フラグ'
  , SAP_ADD_YYYY varchar(30) comment 'SAP作成日_年'
  , SAP_ADD_MM varchar(30) comment 'SAP作成日_月'
  , SAP_ADD_DD varchar(30) comment 'SAP作成日_日'
  , SAP_ADD_HH varchar(30) comment 'SAP作成時間_時'
  , SAP_ADD_MI varchar(30) comment 'SAP作成時間_分'
  , SAP_ADD_SS varchar(30) comment 'SAP作成時間_秒'
  , SAP_ADD_USER_CD varchar(30) comment 'SAP作成者'
  , SAP_UPD_YYYY varchar(30) comment 'SAP更新日_年'
  , SAP_UPD_MM varchar(30) comment 'SAP更新日_月'
  , SAP_UPD_DD varchar(30) comment 'SAP更新日_日'
  , SAP_UPD_HH varchar(30) comment 'SAP更新時間_時'
  , SAP_UPD_MI varchar(30) comment 'SAP更新時間_分'
  , SAP_UPD_SS varchar(30) comment 'SAP更新時間_秒'
  , SAP_UPD_USER_CD varchar(30) comment 'SAP更新者'
  , SPARE_STR varchar(255) comment '予備'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint ES_KOGUCHI_DELIVERY_PK primary key (KOGUCHI_DELIVERY_ID)
) comment '戸口配送マスタ送信テーブル' ;

-- プラント保管場所マスタ送信テーブル
create table ES_PLANT_STORAGE_SPACE (
  PLANT_STORAGE_SPACE_ID bigint not null comment 'プラント保管場所マスタ送信ID'
  , SEND_FLG char(1) default '0' not null comment '送信済フラグ'
  , PLANT_CD varchar(30) comment 'プラントCD'
  , STORAGE_SPACE_CD varchar(30) comment '保管場所'
  , COMPANY_NM varchar(60) comment '会社名'
  , PLANT_NM varchar(60) comment 'プラント名'
  , STORAGE_SPACE_NM1 varchar(60) comment '保管場所名'
  , STORAGE_SPACE_NM2 varchar(60) comment '保管場所名別名'
  , COUNTRY_NM varchar(60) comment '国'
  , ZIP_CD varchar(30) comment '郵便番号'
  , ADDRESS1 varchar(60) comment '都道府県'
  , ADDRESS2 varchar(60) comment '市区町村'
  , ADDRESS3 varchar(60) comment '所在地'
  , TEL_NO varchar(30) comment '電話番号'
  , FAX_NO varchar(30) comment 'FAX'
  , LANG_NM varchar(60) comment '言語'
  , BASE_CD varchar(30) comment '拠点コード'
  , BASE_TYPE_CD varchar(30) comment '拠点区分'
  , BASE_NM varchar(60) comment '拠点名称'
  , SAP_ADD_YYYY varchar(30) comment 'SAP作成日_年'
  , SAP_ADD_MM varchar(30) comment 'SAP作成日_月'
  , SAP_ADD_DD varchar(30) comment 'SAP作成日_日'
  , SAP_ADD_HH varchar(30) comment 'SAP作成時間_時'
  , SAP_ADD_MI varchar(30) comment 'SAP作成時間_分'
  , SAP_ADD_SS varchar(30) comment 'SAP作成時間_秒'
  , SAP_ADD_USER_CD varchar(30) comment 'SAP作成者'
  , SAP_UPD_YYYY varchar(30) comment 'SAP更新日_年'
  , SAP_UPD_MM varchar(30) comment 'SAP更新日_月'
  , SAP_UPD_DD varchar(30) comment 'SAP更新日_日'
  , SAP_UPD_HH varchar(30) comment 'SAP更新時間_時'
  , SAP_UPD_MI varchar(30) comment 'SAP更新時間_分'
  , SAP_UPD_SS varchar(30) comment 'SAP更新時間_秒'
  , SAP_UPD_USER_CD varchar(30) comment 'SAP更新者'
  , SPARE_STR varchar(255) comment '予備'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint ES_PLANT_STORAGE_SPACE_PK primary key (PLANT_STORAGE_SPACE_ID)
) comment 'プラント保管場所マスタ送信テーブル' ;

-- 商品マスタ連携送信テーブル
create table ES_PRODUCT (
  PRODUCT_ID bigint not null comment '商品マスタ連携送信ID'
  , SEND_FLG char(1) default '0' not null comment '送信済フラグ'
  , HINMOKU_CD varchar(100) comment '品目CD'
  , HINMOKU_GROUP_CD varchar(30) comment '品目グループ'
  , HINMOKU_TEXT varchar(100) comment '品目テキスト'
  , JAN_CD varchar(30) comment 'JANコード'
  , SIZE_NM varchar(60) comment 'サイズ名称'
  , CASE_TYPE_CD varchar(30) comment 'ケース区分'
  , UNIT_NUM varchar(30) comment '入数'
  , LOGI_WEIGHT_FLG varchar(30) comment '物流重量物フラグ'
  , LOGI_SPECIAL_TYPE_CD varchar(30) comment '物流特殊区分'
  , LOGI_ATTENTION_TYPE_CD varchar(30) comment '物流注意区分'
  , UNIT_NM varchar(30) comment '単位名称'
  , OLD_JAN_CD varchar(30) comment '旧JANコード'
  , SAP_ADD_DT varchar(30) comment 'SAP作成日'
  , SAP_ADD_TIME varchar(30) comment 'SAP作成時間'
  , STORAGE_LOCATION_TYPE_CD varchar(30) comment 'フロア区分_保管場所区分'
  , MEDICAL_MANAG_FLG char(1) comment '医療用管理フラグ'
  , PROD_DT_MANAG_FLG char(1) comment '製造日管理フラグ'
  , PROD_DT_LIMIT_DAYS_RCV varchar(30) comment '入荷製造日限界日数'
  , PROD_DT_LIMIT_DAYS_SHP varchar(30) comment '出荷製造日限界日数'
  , NIZOROE_10_NUM varchar(30) comment '荷揃処理10足用足数'
  , SERIAL_MANAG_FLG char(1) comment 'シリアル管理フラグ'
  , OCR_DATE_FORMAT varchar(30) comment 'OCR日付形式'
  , SAP_ADD_YYYY varchar(30) comment 'SAP作成日_年'
  , SAP_ADD_MM varchar(30) comment 'SAP作成日_月'
  , SAP_ADD_DD varchar(30) comment 'SAP作成日_日'
  , SAP_ADD_HH varchar(30) comment 'SAP作成時間_時'
  , SAP_ADD_MI varchar(30) comment 'SAP作成時間_分'
  , SAP_ADD_SS varchar(30) comment 'SAP作成時間_秒'
  , SAP_ADD_USER_NM varchar(30) comment 'SAP作成者'
  , SAP_UPD_YYYY varchar(30) comment 'SAP更新日_年'
  , SAP_UPD_MM varchar(30) comment 'SAP更新日_月'
  , SAP_UPD_DD varchar(30) comment 'SAP更新日_日'
  , SAP_UPD_HH varchar(30) comment 'SAP更新時間_時'
  , SAP_UPD_MI varchar(30) comment 'SAP更新時間_分'
  , SAP_UPD_SS varchar(30) comment 'SAP更新時間_秒'
  , SAP_UPD_USER_NM varchar(30) comment 'SAP更新者'
  , SPARE_STR varchar(255) comment '予備'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint ES_PRODUCT_PK primary key (PRODUCT_ID)
) comment '商品マスタ連携送信テーブル' ;

-- 商品マスタ(移動平均単価)送信テーブル
create table ES_PRODUCT_PRICE (
  PRODUCT_PRICE_ID bigint not null comment '商品マスタ移動平均単価送信ID'
  , SEND_FLG char(1) default '0' not null comment '送信済フラグ'
  , HINMOKU_CD varchar(100) comment '品目CD'
  , HINMOKU_GROUP_CD varchar(30) comment '品目グループ'
  , MOVING_AVERAGE_PRICE decimal(14,4) comment '移動平均単価'
  , SAP_ADD_YYYY varchar(30) comment 'SAP作成日_年'
  , SAP_ADD_MM varchar(30) comment 'SAP作成日_月'
  , SAP_ADD_DD varchar(30) comment 'SAP作成日_日'
  , SAP_ADD_HH varchar(30) comment 'SAP作成時間_時'
  , SAP_ADD_MI varchar(30) comment 'SAP作成時間_分'
  , SAP_ADD_SS varchar(30) comment 'SAP作成時間_秒'
  , SAP_ADD_USER_NM varchar(30) comment 'SAP作成者'
  , SAP_UPD_YYYY varchar(30) comment 'SAP更新日_年'
  , SAP_UPD_MM varchar(30) comment 'SAP更新日_月'
  , SAP_UPD_DD varchar(30) comment 'SAP更新日_日'
  , SAP_UPD_HH varchar(30) comment 'SAP更新時間_時'
  , SAP_UPD_MI varchar(30) comment 'SAP更新時間_分'
  , SAP_UPD_SS varchar(30) comment 'SAP更新時間_秒'
  , SAP_UPD_USER_NM varchar(30) comment 'SAP更新者'
  , SPARE_STR varchar(255) comment '予備'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint ES_PRODUCT_PRICE_PK primary key (PRODUCT_PRICE_ID)
) comment '商品マスタ(移動平均単価)送信テーブル' ;

-- 入庫予定送信テーブル
create table ES_RECEIVE_PLAN (
  RECEIVE_PLAN_ID bigint not null comment '入庫予定送信ID'
  , SEND_FLG char(1) default '0' not null comment '送信済フラグ'
  , STORE_SLIP_NO varchar(30) comment '入庫伝票番号'
  , STORE_SLIP_ROW_NO varchar(30) comment '入庫明細番号'
  , SLIP_TYPE_CD varchar(30) comment '伝票種別'
  , IF_ID varchar(30) comment 'IFID'
  , IF_NO varchar(30) comment 'IF用番号'
  , HINMOKU_CD varchar(100) comment '品目CD'
  , HINMOKU_GROUP varchar(30) comment '品目グループ'
  , SANSHA_TYPE_CD varchar(30) comment '3社区分'
  , RECEIVE_REASON_CD varchar(30) comment '入荷発生事由'
  , RECEIVE_REASON_NM varchar(30) comment '入荷発生事由名称'
  , CUSTOMER_CD varchar(30) comment '取引先CD'
  , CUSTOMER_NM varchar(60) comment '取引先名称'
  , ORDER_DATE varchar(30) comment '発注日'
  , ORDER_TIME varchar(30) comment '発注時刻'
  , CONFIRMED_DELIVERY_DATE varchar(30) comment '確定納期'
  , HINMOKU_TEXT varchar(100) comment '品目テキスト'
  , JAN_CD varchar(30) comment 'JANコード'
  , UNIT_NM varchar(30) comment '単位名称'
  , RECEIVE_PLAN_NUM varchar(30) comment '入荷予定数量'
  , RECEIVE_REMAINING_NUM varchar(30) comment '入荷予定残数'
  , STORE_PLANT_CD varchar(30) comment '入庫プラント'
  , STORE_STORAGE_SPACE_CD varchar(30) comment '入庫保管場所'
  , SHIPPING_PLANT_CD varchar(30) comment '出庫プラント'
  , SHIPPING_STORAGE_SPACE_CD varchar(30) comment '出庫保管場所'
  , LOT_MANAG_TYPE_CD varchar(30) comment 'ロット管理区分'
  , TENHANSHA_CD varchar(30) comment '店販社CD'
  , SALES_ORG_CD varchar(30) comment '販売組織CD'
  , TENHANSHA_NM1 varchar(60) comment '店販社名称1'
  , TENHANSHA_NM2 varchar(60) comment '店販社名称2'
  , SAP_USER_CD varchar(30) comment 'SAPユーザコード'
  , SAP_USER_NM varchar(60) comment 'SAPユーザ名称'
  , MOD_TYPE_CD varchar(30) comment '修正区分'
  , DEPOSIT_JAN_CD varchar(30) comment '預りJANCD'
  , TIMES_NUM varchar(30) comment '回数'
  , ACCOUNT_ORDER_NO varchar(30) comment '得意先注文番号'
  , SAP_SUPPLIER_CD varchar(30) comment 'SAP仕入先コード'
  , SAP_VENDER_CD varchar(30) comment 'SAP発注先コード'
  , TODAY_FLG varchar(30) comment '当日分フラグ'
  , SANSHA_DELIVERY_SLIP_NO1 varchar(30) comment '3社納品書番号1'
  , DATA_TYPE_CD varchar(30) comment 'データ区分'
  , SAP_ADD_YYYY varchar(30) comment 'SAP作成日_年'
  , SAP_ADD_MM varchar(30) comment 'SAP作成日_月'
  , SAP_ADD_DD varchar(30) comment 'SAP作成日_日'
  , SAP_ADD_HH varchar(30) comment 'SAP作成時間_時'
  , SAP_ADD_MI varchar(30) comment 'SAP作成時間_分'
  , SAP_ADD_SS varchar(30) comment 'SAP作成時間_秒'
  , SAP_ADD_USER_CD varchar(30) comment 'SAP作成者'
  , SAP_UPD_YYYY varchar(30) comment 'SAP更新日_年'
  , SAP_UPD_MM varchar(30) comment 'SAP更新日_月'
  , SAP_UPD_DD varchar(30) comment 'SAP更新日_日'
  , SAP_UPD_HH varchar(30) comment 'SAP更新時間_時'
  , SAP_UPD_MI varchar(30) comment 'SAP更新時間_分'
  , SAP_UPD_SS varchar(30) comment 'SAP更新時間_秒'
  , SAP_UPD_USER_CD varchar(30) comment 'SAP更新者'
  , DATA_TRANSFER_ONLY_STR01 varchar(30) comment '赤黒区分'
  , DATA_TRANSFER_ONLY_STR02 varchar(30) comment '代表ロケーション'
  , DATA_TRANSFER_ONLY_STR03 varchar(60) comment '品名カナ1'
  , DATA_TRANSFER_ONLY_STR04 varchar(60) comment '品名カナ2'
  , DATA_TRANSFER_ONLY_STR05 varchar(60) comment '摘要'
  , DATA_TRANSFER_ONLY_STR06 varchar(30) comment '端末番号'
  , DATA_TRANSFER_ONLY_STR07 varchar(30) comment 'サーバー送信フラグ'
  , DATA_TRANSFER_ONLY_STR08 varchar(30) comment 'サーバー宛送信時刻'
  , DATA_TRANSFER_ONLY_STR09 varchar(30) comment '3社納品書番号2'
  , DATA_TRANSFER_ONLY_STR10 varchar(30) comment '加工品区分'
  , DATA_TRANSFER_ONLY_STR11 varchar(30) comment '管理区分'
  , DATA_TRANSFER_ONLY_STR12 varchar(30) comment '3社売上日'
  , DATA_TRANSFER_ONLY_STR13 varchar(30) comment '仕入単価'
  , DATA_TRANSFER_ONLY_STR14 varchar(30) comment '作成日_発注'
  , DATA_TRANSFER_ONLY_STR15 varchar(30) comment '作成時間_発注'
  , DATA_TRANSFER_ONLY_STR16 varchar(30) comment 'データ種別'
  , DATA_TRANSFER_ONLY_STR17 varchar(30) comment '管理番号'
  , DATA_TRANSFER_ONLY_STR18 varchar(30) comment '入力順'
  , DATA_TRANSFER_ONLY_STR19 varchar(30) comment '検品残数量'
  , DATA_TRANSFER_ONLY_STR20 varchar(30) comment '検品数量'
  , DATA_TRANSFER_ONLY_STR21 varchar(30) comment '検品確定区分'
  , DATA_TRANSFER_ONLY_STR22 varchar(30) comment '倉庫コード'
  , DATA_TRANSFER_ONLY_STR23 varchar(30) comment '完了区分'
  , DATA_TRANSFER_ONLY_STR24 varchar(30) comment 'プログラムID'
  , DATA_TRANSFER_ONLY_STR25 varchar(30) comment 'JANコード区分'
  , DATA_TRANSFER_ONLY_STR26 varchar(255) comment 'ダミー'
  , DATA_TRANSFER_ONLY_STR27 varchar(30) comment 'SAP更新担当者コード'
  , DATA_TRANSFER_ONLY_STR28 varchar(30) comment 'SAP削除フラグ'
  , SPARE_STR varchar(255) comment '予備'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint ES_RECEIVE_PLAN_PK primary key (RECEIVE_PLAN_ID)
) comment '入庫予定送信テーブル' ;

-- 販売組織マスタ送信テーブル
create table ES_SALES_ORG (
  SALES_ORG_ID bigint not null comment '販売組織マスタ送信ID'
  , SEND_FLG char(1) default '0' not null comment '送信済フラグ'
  , SALES_ORG_CD varchar(30) comment '販売組織CD'
  , PURCHASE_ORG_CD varchar(30) comment '購買組織CD'
  , TENHANSHA_CD varchar(30) comment '店販社CD'
  , TENHANSHA_NM1 varchar(60) comment '店販社名称１'
  , TENHANSHA_NM2 varchar(60) comment '店販社名称２'
  , TENHANSHA_ZIP_CD varchar(30) comment '店販社郵便番号'
  , TENHANSHA_PREFECTURE varchar(30) comment '店販社都道府県'
  , TENHANSHA_ADDRESS1 varchar(60) comment '店販社住所１'
  , TENHANSHA_ADDRESS2 varchar(60) comment '店販社住所２'
  , TENHANSHA_TEL_NO varchar(30) comment '店販社電話番号'
  , TENHANSHA_FAX_NO varchar(30) comment '店販社ＦＡＸ番号'
  , PLANT_NORMAL varchar(30) comment 'プラント_通常品'
  , PLANT_DEPOSIT varchar(30) comment 'プラント_預かり品'
  , SAP_ADD_YYYY varchar(30) comment 'SAP作成日_年'
  , SAP_ADD_MM varchar(30) comment 'SAP作成日_月'
  , SAP_ADD_DD varchar(30) comment 'SAP作成日_日'
  , SAP_ADD_HH varchar(30) comment 'SAP作成時間_時'
  , SAP_ADD_MI varchar(30) comment 'SAP作成時間_分'
  , SAP_ADD_SS varchar(30) comment 'SAP作成時間_秒'
  , SAP_ADD_USER_CD varchar(30) comment 'SAP作成者'
  , SAP_UPD_YYYY varchar(30) comment 'SAP更新日_年'
  , SAP_UPD_MM varchar(30) comment 'SAP更新日_月'
  , SAP_UPD_DD varchar(30) comment 'SAP更新日_日'
  , SAP_UPD_HH varchar(30) comment 'SAP更新時間_時'
  , SAP_UPD_MI varchar(30) comment 'SAP更新時間_分'
  , SAP_UPD_SS varchar(30) comment 'SAP更新時間_秒'
  , SAP_UPD_USER_CD varchar(30) comment 'SAP更新者'
  , SPARE_STR varchar(255) comment '予備'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint ES_SALES_ORG_PK primary key (SALES_ORG_ID)
) comment '販売組織マスタ送信テーブル' ;

-- 出荷指示送信テーブル
create table ES_SHIPPING_INST (
  SHIPPING_INST_ID bigint not null comment '出荷指示送信D'
  , SEND_FLG char(1) default '0' not null comment '送信済フラグ'
  , SHIPPING_SLIP_NO varchar(30) comment '出荷伝票番号'
  , SHIPPING_SLIP_ROW_NO varchar(30) comment '出荷伝票明細番号'
  , SALES_ORDER_NO varchar(30) comment '受注番号'
  , HINMOKU_CD varchar(100) comment '品目CD'
  , SALES_ORDER_SLIP_TYPE_CD varchar(30) comment '受注伝票タイプ'
  , SALES_ORDER_SLIP_NO varchar(30) comment '受注伝票番号'
  , NIZOROE_NO varchar(30) comment '荷揃番号'
  , SHIPPING_TYPE_CD varchar(30) comment '出荷区分'
  , SHIPPING_REASON_CD varchar(30) comment '出荷発生事由'
  , HINMOKU_GROUP varchar(30) comment '品目グループ'
  , SHIPPING_NUM varchar(30) comment '出荷数'
  , SALES_ORDER_NUM varchar(30) comment '受注数量'
  , HINMOKU_TEXT varchar(60) comment '品目テキスト'
  , JAN_CD varchar(30) comment 'JANCD'
  , UNIT_NM varchar(30) comment '単位名称'
  , EC_UNIT_NM varchar(30) comment 'EC単位名'
  , SAMPLE_TYPE_CD varchar(30) comment 'サンプル区分'
  , LOGI_WEIGHT_FLG varchar(30) comment '物流重量物フラグ'
  , LOGI_ATTENTION_TYPE_CD varchar(30) comment '物流注意区分'
  , LOGI_SPECIAL_TYPE_CD varchar(30) comment '物流特殊区分'
  , DIRECT_DELIVERY_TYPE_CD varchar(30) comment '直送区分'
  , KOGUCHI_DELIVERY_FLG varchar(30) comment '戸口配送フラグ'
  , SPLIT_DELIVERY_TYPE_CD varchar(30) comment '分納区分'
  , CARRIER_TYPE_CD varchar(30) comment '運送会社区分'
  , CARRIER_CD varchar(30) comment '運送業者CD'
  , EXPRESS_CD varchar(30) comment '運送便CD'
  , SHIPPING_DT varchar(30) comment '出荷日'
  , SPECIFY_DELIVERY_DT varchar(30) comment '配達指定日'
  , SPECIFY_DELIVERY_TIME varchar(30) comment '配達指定時間'
  , TENHANSHA_CD varchar(30) comment '店販社CD'
  , SALES_ORG_CD varchar(30) comment '販売組織CD'
  , TENHANSHA_ORDER_NO varchar(30) comment '店販社発注番号'
  , KOHAI_CONTRACTOR_CD varchar(30) comment '戸配契約先CD'
  , KOHAI_CONTRACTOR_NM varchar(60) comment '戸配契約先名称'
  , DESTINATION_CD varchar(30) comment '送り先CD'
  , DESTINATION_NM1 varchar(60) comment '送り先名称１'
  , DESTINATION_NM2 varchar(60) comment '送り先名称２'
  , DESTINATION_NM_KANA varchar(60) comment '送り先名称_カナ'
  , DESTINATION_ZIP_CD varchar(30) comment '送り先郵便番号'
  , DESTINATION_ADDRESS1 varchar(60) comment '送り先住所１'
  , DESTINATION_ADDRESS2 varchar(60) comment '送り先住所２'
  , DESTINATION_TEL varchar(30) comment '送り先電話番号'
  , DESTINATION_FAX varchar(30) comment '送り先ＦＡＸ番号'
  , KANJI_MESSAGE1 varchar(60) comment '漢字メッセージ_1'
  , KANJI_MESSAGE2 varchar(60) comment '漢字メッセージ_2'
  , KANJI_MESSAGE3 varchar(60) comment '漢字メッセージ_3'
  , KANJI_MESSAGE4 varchar(60) comment '漢字メッセージ_4'
  , KANJI_MESSAGE5 varchar(60) comment '漢字メッセージ_5'
  , KANJI_MESSAGE6 varchar(60) comment '漢字メッセージ_6'
  , KANJI_MESSAGE7 varchar(60) comment '漢字メッセージ_7'
  , KANJI_MESSAGE8 varchar(60) comment '漢字メッセージ_8'
  , KANJI_MESSAGE9 varchar(60) comment '漢字メッセージ_9'
  , KANJI_MESSAGE10 varchar(60) comment '漢字メッセージ_10'
  , KANA_MESSAGE1 varchar(60) comment 'カナメッセージ_1'
  , KANA_MESSAGE2 varchar(60) comment 'カナメッセージ_2'
  , KANA_MESSAGE3 varchar(60) comment 'カナメッセージ_3'
  , KANA_MESSAGE4 varchar(60) comment 'カナメッセージ_4'
  , KANA_MESSAGE5 varchar(60) comment 'カナメッセージ_5'
  , KANA_MESSAGE6 varchar(60) comment 'カナメッセージ_6'
  , KANA_MESSAGE7 varchar(60) comment 'カナメッセージ_7'
  , KANA_MESSAGE8 varchar(60) comment 'カナメッセージ_8'
  , KANA_MESSAGE9 varchar(60) comment 'カナメッセージ_9'
  , KANA_MESSAGE10 varchar(60) comment 'カナメッセージ_10'
  , DELIVERY_NOTE_SUMMARY varchar(255) comment '納品書摘要'
  , INVOICE_SUMMARY varchar(60) comment '送り状摘要'
  , UNIT_PRICE varchar(30) comment '商品単価'
  , EC_ORDER_NO varchar(30) comment 'ＥＣ発注番号'
  , EC_ORDER_BRANCH_NO varchar(30) comment 'ＥＣ発注番号_枝番'
  , EC_PRODUCT_NM_KANJI varchar(60) comment 'EC品名漢字'
  , ORDER_DT varchar(30) comment '注文日'
  , KOKYAKU_CD varchar(30) comment '顧客CD'
  , PAYMENT_TYPE_CD varchar(30) comment '決済区分'
  , TOTAL_PRICE varchar(30) comment '合計金額'
  , SHIPPING_FEE varchar(30) comment '送料'
  , SEPARATE_SHIPPING_FEE varchar(30) comment '別途送料'
  , COD_FEE varchar(30) comment '代引手数料'
  , SALES_TAX_RATE varchar(30) comment '消費税率'
  , PRICE_HIDDEN_FLG varchar(30) comment '金額非表示フラグ'
  , PAYMENT_HIDDEN_FLG varchar(30) comment '決済非表示フラグ'
  , ORDER_NO_DELIVERY_NOTE varchar(30) comment '注文番号_納品書'
  , POINT varchar(30) comment 'ポイント'
  , STORE_PLANT_CD varchar(30) comment '入庫プラント'
  , STORE_STORAGE_SPACE_CD varchar(30) comment '入庫保管場所'
  , SHIPPING_PLANT_CD varchar(30) comment '出庫プラント'
  , SHIPPING_STORAGE_SPACE_CD varchar(30) comment '出庫保管場所'
  , LOT_MANAG_TYPE_CD varchar(30) comment 'ロット管理区分'
  , DEAL_TYPE_CD varchar(30) comment '取引区分'
  , CUSTOMER_CD varchar(30) comment '取引先CD'
  , CUSTOMER_NM varchar(60) comment '取引先名称'
  , DELIV_CD varchar(30) comment '納入先CD'
  , EMP_ID_CD varchar(30) comment '社員識別CD'
  , EMP_NM varchar(60) comment '社員氏名'
  , SAP_ADD_YYYY varchar(30) comment 'SAP作成日_年'
  , SAP_ADD_MM varchar(30) comment 'SAP作成日_月'
  , SAP_ADD_DD varchar(30) comment 'SAP作成日_日'
  , SAP_ADD_HH varchar(30) comment 'SAP作成時間_時'
  , SAP_ADD_MI varchar(30) comment 'SAP作成時間_分'
  , SAP_ADD_SS varchar(30) comment 'SAP作成時間_秒'
  , SAP_ADD_USER_CD varchar(30) comment 'SAP作成者'
  , SAP_UPD_YYYY varchar(30) comment 'SAP更新日_年'
  , SAP_UPD_MM varchar(30) comment 'SAP更新日_月'
  , SAP_UPD_DD varchar(30) comment 'SAP更新日_日'
  , SAP_UPD_HH varchar(30) comment 'SAP更新時間_時'
  , SAP_UPD_MI varchar(30) comment 'SAP更新時間_分'
  , SAP_UPD_SS varchar(30) comment 'SAP更新時間_秒'
  , SAP_UPD_USER_CD varchar(30) comment 'SAP更新者'
  , DATA_TRANSFER_ONLY_STR01 varchar(30) comment 'ヘルメット区分'
  , DATA_TRANSFER_ONLY_STR02 varchar(60) comment 'マーク名称'
  , DATA_TRANSFER_ONLY_STR03 varchar(30) comment 'ステータス'
  , SPARE_STR varchar(255) comment '予備'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint ES_SHIPPING_INST_PK primary key (SHIPPING_INST_ID)
) comment '出荷指示送信テーブル' ;

-- 在庫実績送信テーブル
create table ES_STOCK_RECORD (
  PACKING_LIST_ID bigint not null comment '梱包明細受信ID'
  , RECEIVE_CD varchar(30) not null comment '受信CD'
  , RECEIVE_ROW_ID bigint not null comment '受信行ID'
  , IMPORT_FLG char(1) default '0' not null comment '取込みフラグ'
  , ERROR_FLG char(1) default '0' not null comment 'エラーフラグ'
  , ERROR_MESSAGE_CD varchar(30) comment 'エラーメッセージCD'
  , SHIPPING_SLIP_NO varchar(30) comment '出荷伝票番号'
  , PACKING_NO varchar(30) comment '梱包番号'
  , PACKING_ROW_NO varchar(30) comment '梱包明細番号'
  , SHIPPING_SLIP_ROW_NO varchar(30) comment '出荷伝票明細番号'
  , SHIPPING_SLIP_ROW_NO_SN varchar(30) comment '出荷伝票明細番号連番'
  , HINMOKU_CD varchar(100) comment '品目コード'
  , NUM varchar(30) comment '数量'
  , CARRIER_SLIP_NO varchar(30) comment '運送便伝票番号'
  , WMS_ADD_YYYY varchar(30) comment 'WMS作成日_年'
  , WMS_ADD_MM varchar(30) comment 'WMS作成日_月'
  , WMS_ADD_DD varchar(30) comment 'WMS作成日_日'
  , WMS_ADD_HH varchar(30) comment 'WMS作成時間_時'
  , WMS_ADD_MI varchar(30) comment 'WMS作成時間_分'
  , WMS_ADD_SS varchar(30) comment 'WMS作成時間_秒'
  , WMS_ADD_USER_CD varchar(30) comment 'WMS作成者'
  , WMS_UPD_YYYY varchar(30) comment 'WMS更新日_年'
  , WMS_UPD_MM varchar(30) comment 'WMS更新日_月'
  , WMS_UPD_DD varchar(30) comment 'WMS更新日_日'
  , WMS_UPD_HH varchar(30) comment 'WMS更新時間_時'
  , WMS_UPD_MI varchar(30) comment 'WMS更新時間_分'
  , WMS_UPD_SS varchar(30) comment 'WMS更新時間_秒'
  , WMS_UPD_USER_CD varchar(30) comment 'WMS更新者'
  , SPARE_STR varchar(255) comment '予備'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint ES_STOCK_RECORD_PK primary key (PACKING_LIST_ID)
) comment '在庫実績送信テーブル' ;

create unique index ES_STOCK_RECORD_IX1
  on ES_STOCK_RECORD(RECEIVE_CD,RECEIVE_ROW_ID);

create index ES_STOCK_RECORD_IX2
  on ES_STOCK_RECORD(RECEIVE_CD);

-- 個体管理情報履歴
create table H_ID_MANAG_DATA (
  ID_MANAG_DATA_ID bigint not null comment '個体管理情報ID'
  , ID_MANAG_NO varchar(30) comment '個体管理番号'
  , TENHANSHA_CD varchar(30) comment '店販社CD'
  , SALES_ORG_CD varchar(30) comment '販売組織CD'
  , CUSTOMER_CD varchar(30) comment '取引先CD'
  , PRODUCT_CD varchar(30) comment '商品CD'
  , HINMOKU_TEXT varchar(60) comment '品目テキスト'
  , JAN_CD varchar(30) comment 'JANCD'
  , UNIT_NM varchar(30) comment '単位名称'
  , SHARED_PRODUCT_TYPE_CD varchar(30) comment '共有商品区分'
  , CUSTOMER_ORDER_NO varchar(30) comment '取引先注文番号'
  , DELIV_CD varchar(30) comment '納入先CD'
  , DESTINATION_ZIP_CD varchar(30) comment '送り先郵便番号'
  , DESTINATION_ADDRESS1 varchar(255) comment '送り先住所１'
  , DESTINATION_ADDRESS2 varchar(255) comment '送り先住所２'
  , DESTINATION_NM1 varchar(60) comment '送り先名称１'
  , DESTINATION_NM2 varchar(60) comment '送り先名称２'
  , DESTINATION_TEL varchar(30) comment '送り先電話番号'
  , EMP_ID_CD varchar(30) comment '社員識別コード'
  , EMP_NM varchar(60) comment '氏名'
  , STORE_DT varchar(8) comment '入庫日'
  , INVENTORY_DT varchar(8) comment '棚卸日'
  , PICKING_DT varchar(8) comment '出庫日'
  , PRODUCT_RETURN_DT varchar(8) comment '良品返却日'
  , WASTE_RETURN_DT varchar(8) comment '廃棄返却日'
  , ID_MANAG_ABOLITION_TYPE_CD varchar(30) comment '個体管理廃止区分'
  , SPARE_TYPE_CD varchar(30) comment '予備区分'
  , DATA_EXT_FLG_PICKING char(1) comment '提供データ抽出済_出庫'
  , DATA_ADD_DT_PICKING varchar(8) comment '提供データ作成日_出庫'
  , DATA_EXT_FLG_RETURN char(1) comment '提供データ抽出済_良返'
  , DATA_ADD_DT_RETURN varchar(8) comment '提供データ作成日_良返'
  , DATA_EXT_FLG_WASTE char(1) comment '提供データ抽出済_廃棄'
  , DATA_ADD_DT_WASTE varchar(8) comment '提供データ作成日_廃棄'
  , WORK_DT varchar(8) comment '作業日'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint H_ID_MANAG_DATA_PK primary key (ID_MANAG_DATA_ID)
) comment '個体管理情報履歴' ;

-- 棚卸ボディ履歴
create table H_INVENTORY_B (
  INVENTORY_B_ID bigint not null comment '棚卸ボディID'
  , INVENTORY_H_ID bigint not null comment '棚卸ヘッダID'
  , STOCK_ID bigint comment '在庫ID'
  , WAREHOUSE_ID bigint comment '倉庫ID'
  , WAREHOUSE_CD varchar(30) comment '倉庫CD'
  , WAREHOUSE_NM varchar(60) comment '倉庫名称'
  , PRODUCT_ID bigint comment '商品ID'
  , PRODUCT_CD varchar(100) comment '商品CD'
  , PRODUCT_NM varchar(255) comment '商品名称'
  , STOCK_TYPE_ID bigint comment '在庫区分ID'
  , LOCATION_ID bigint comment 'ロケーションID'
  , LOCATION_CD varchar(30) comment 'ロケーションCD'
  , LOCATION_NM varchar(60) comment 'ロケーション名称'
  , DEPOSIT_ID bigint comment '預託ID'
  , DEPOSIT_CD varchar(30) comment '預託CD'
  , DEPOSIT_NM varchar(60) comment '預託名称'
  , LOT_ID bigint comment 'ロットID'
  , LOT varchar(30) comment 'ロット'
  , LIMIT_DT varchar(8) comment '期限日'
  , SHAPE_ID bigint comment '荷姿ID'
  , STORE_NO_ID bigint comment '入庫No.ID'
  , STORE_LABEL_NO varchar(30) comment '入庫ラベルNo.'
  , SUPPLIER_ID bigint comment '仕入先ID'
  , SUPPLIER_CD varchar(30) comment '仕入先CD'
  , SUPPLIER_NM varchar(60) comment '仕入先名称'
  , STORE_DT varchar(8) comment '入庫日'
  , UNIT_NUM bigint comment '入数'
  , CHARGE_NUM decimal(14,4) not null comment '引当可能数'
  , ALLOC_NUM decimal(14,4) not null comment '引当済数'
  , MOVE_NUM decimal(14,4) not null comment '移動中数'
  , INVENTORY_NUM decimal(14,4) not null comment '棚卸数'
  , INPUT_TYPE varchar(30) comment '入力区分'
  , STOCK_ADJUST_FLG char(1) not null comment '在庫調整フラグ'
  , MOVE_INST_H_ID bigint comment '在庫移動指示ヘッダID'
  , HT_INPUT_INVENTORY_NUM decimal(14,4) default 0 comment 'HT入力棚卸数量'
  , WEB_INPUT_INVENTORY_NUM decimal(14,4) default 0 comment '画面入力棚卸数量'
  , AJIS_INPUT_INVENTORY_NUM decimal(14,4) default 0 comment 'エイジス取込棚卸数量'
  , PROD_DT varchar(8) comment '製造日'
  , AREA_CD varchar(30) comment 'エリア'
  , SALES_ORG_ID bigint comment '販売組織ID'
  , ACCOUNT_ID bigint comment '得意先ID'
  , ALLOC_TYPE_CD varchar(30) comment '引当区分'
  , S4_SEND_FLG char(1) default '0' comment 'S4送信済フラグ'
  , CM_SEND_FLG char(1) default '0' comment '共通管理送信済フラグ'
  , INVENTORY_USER_ID bigint comment '棚卸担当者ID'
  , INVENTORY_UPD_USER_ID bigint comment '棚卸変更担当者ID'
  , RECEIVE_DT varchar(8) comment '入荷日'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint H_INVENTORY_B_PK primary key (INVENTORY_B_ID)
) comment '棚卸ボディ履歴' ;

create index H_INVENTORY_B_IX1
  on H_INVENTORY_B(INVENTORY_H_ID);

create index H_INVENTORY_B_IX2
  on H_INVENTORY_B(STOCK_ID);

create index H_INVENTORY_B_IX3
  on H_INVENTORY_B(STOCK_TYPE_ID);

create index H_INVENTORY_B_IX4
  on H_INVENTORY_B(SHAPE_ID);

create index H_INVENTORY_B_IX5
  on H_INVENTORY_B(MOVE_INST_H_ID);

create index H_INVENTORY_B_IX6
  on H_INVENTORY_B(PRODUCT_CD);

-- 棚卸ヘッダ履歴
create table H_INVENTORY_H (
  INVENTORY_H_ID bigint not null comment '棚卸ヘッダID'
  , HIST_DT varchar(8) comment '履歴日'
  , CLIENT_ID bigint not null comment '荷主ID'
  , CLIENT_CD varchar(30) comment '荷主CD'
  , CLIENT_NM varchar(60) comment '荷主名称'
  , CENTER_ID bigint not null comment 'センタID'
  , CENTER_CD varchar(30) comment 'センタCD'
  , CENTER_NM varchar(60) comment 'センタ名称'
  , INVENTORY_DT varchar(8) not null comment '棚卸日'
  , BATCH_NUM bigint not null comment 'バッチNo.'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint H_INVENTORY_H_PK primary key (INVENTORY_H_ID)
) comment '棚卸ヘッダ履歴' ;

create index H_INVENTORY_H_IX1
  on H_INVENTORY_H(INVENTORY_DT);

-- ロケーション属性履歴
create table H_LOCATION_ATTRIBUTE (
  LOCATION_ATTRIBUTE_ID bigint not null comment 'ロケーション属性ID'
  , CENTER_ID bigint not null comment 'センタID'
  , LOCATION_ID bigint comment 'ロケーションID'
  , HIST_NO bigint comment '履歴番号'
  , PREV_LOCATION_HIST varchar(30) comment '前回ロケーション履歴'
  , CURT_LOCATION_HIST varchar(30) comment '今回ロケーション履歴'
  , HIST_DT varchar(8) comment '履歴日'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint H_LOCATION_ATTRIBUTE_PK primary key (LOCATION_ATTRIBUTE_ID)
) comment 'ロケーション属性履歴' ;

-- 在庫移動ボディ履歴
create table H_MOVE_B (
  MOVE_RECORD_B_ID bigint not null comment '在庫移動実績ボディID'
  , MOVE_INST_H_ID bigint not null comment '在庫移動指示ヘッダID'
  , INOUT_TYPE char(1) comment '入出庫区分'
  , STOCK_ID bigint not null comment '在庫ID'
  , PROCESS_NO varchar(30) comment '処理No.'
  , MOVE_DT varchar(8) comment '移動日'
  , MOVE_NUM decimal(14,4) comment '在庫移動実績数'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint H_MOVE_B_PK primary key (MOVE_RECORD_B_ID)
) comment '在庫移動ボディ履歴' ;

create index H_MOVE_B_IX1
  on H_MOVE_B(MOVE_INST_H_ID);

create index H_MOVE_B_IX2
  on H_MOVE_B(STOCK_ID);

create index H_MOVE_B_IX3
  on H_MOVE_B(MOVE_DT);

-- 在庫移動ヘッダ履歴
create table H_MOVE_H (
  MOVE_INST_H_ID bigint not null comment '在庫移動指示ヘッダID'
  , HIST_DT varchar(8) not null comment '履歴日'
  , CLIENT_ID bigint not null comment '荷主ID'
  , CLIENT_CD varchar(30) comment '荷主CD'
  , CLIENT_NM varchar(60) comment '荷主名称'
  , CENTER_ID bigint not null comment 'センタID'
  , CENTER_CD varchar(30) comment 'センタCD'
  , CENTER_NM varchar(60) comment 'センタ名称'
  , PROCESS_TYPE_ID bigint not null comment '処理区分ID'
  , MOVE_INST_COMMENT varchar(255) comment '在庫移動指示備考'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint H_MOVE_H_PK primary key (MOVE_INST_H_ID)
) comment '在庫移動ヘッダ履歴' ;

create index H_MOVE_H_IX1
  on H_MOVE_H(PROCESS_TYPE_ID);

-- 梱包ボディ履歴
create table H_PACKING_B (
  PACKING_B_ID bigint not null comment '梱包ボディID'
  , PACKING_H_ID bigint not null comment '梱包ヘッダID'
  , SHIPPING_INST_B_ID bigint comment '出荷指示ボディID'
  , STOCK_ID bigint not null comment '在庫ID'
  , PACKING_NUM decimal(14,4) comment '梱包数'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint H_PACKING_B_PK primary key (PACKING_B_ID)
) comment '梱包ボディ履歴' ;

create index H_PACKING_B_IX1
  on H_PACKING_B(PACKING_H_ID);

create index H_PACKING_B_IX2
  on H_PACKING_B(SHIPPING_INST_B_ID);

create index H_PACKING_B_IX3
  on H_PACKING_B(STOCK_ID);

-- 梱包ヘッダ履歴
create table H_PACKING_H (
  PACKING_H_ID bigint not null comment '梱包ヘッダID'
  , SHIPPING_INST_H_ID bigint not null comment '出荷指示ヘッダID'
  , PROCESS_TYPE_ID bigint not null comment '処理区分ID'
  , CARRIER_TRACE_NUM varchar(30) comment '貨物追跡No.'
  , BOX_ID bigint comment '荷材ID'
  , BOX_CD varchar(30) comment '荷材CD'
  , BOX_NM varchar(60) comment '荷材名称'
  , GROSS_WEIGHT decimal(14,4) comment '総重量(g)'
  , TOTAL_VOLUME decimal(14,4) comment '総容積(mm3)'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint H_PACKING_H_PK primary key (PACKING_H_ID)
) comment '梱包ヘッダ履歴' ;

create index H_PACKING_H_IX1
  on H_PACKING_H(SHIPPING_INST_H_ID);

-- 入荷ボディ履歴
create table H_RECEIVE_B (
  STORE_RECORD_B_ID bigint not null comment '入庫実績ボディID'
  , STORE_RECORD_H_ID bigint not null comment '入庫実績ヘッダID'
  , STOCK_ID bigint not null comment '在庫ID'
  , PLAN_NUM decimal(14,4) comment '予定数'
  , PROCESS_NO varchar(30) comment '処理No.'
  , STORE_DT varchar(8) comment '入庫日'
  , STORE_NUM decimal(14,4) comment '入庫数'
  , STORE_FLG char(1) comment '入庫格納フラグ'
  , STORE_LOCATION_ID bigint comment '入庫格納ロケーションID'
  , STORE_LOCATION_CD varchar(30) comment '入庫格納ロケーションCD'
  , STORE_LOCATION_NM varchar(60) comment '入庫格納ロケーション名称'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint H_RECEIVE_B_PK primary key (STORE_RECORD_B_ID)
) comment '入荷ボディ履歴' ;

create index H_RECEIVE_B_IX1
  on H_RECEIVE_B(STORE_RECORD_H_ID);

create index H_RECEIVE_B_IX2
  on H_RECEIVE_B(STOCK_ID);

create index H_RECEIVE_B_IX3
  on H_RECEIVE_B(STORE_DT);

-- 入荷ヘッダ履歴
create table H_RECEIVE_H (
  STORE_RECORD_H_ID bigint not null comment '入庫実績ヘッダID'
  , HIST_DT varchar(8) not null comment '履歴日'
  , CLIENT_ID bigint not null comment '荷主ID'
  , CLIENT_CD varchar(30) comment '荷主CD'
  , CLIENT_NM varchar(60) comment '荷主名称'
  , CENTER_ID bigint not null comment 'センタID'
  , CENTER_CD varchar(30) comment 'センタCD'
  , CENTER_NM varchar(60) comment 'センタ名称'
  , PROCESS_TYPE_ID bigint not null comment '処理区分ID'
  , RECEIVE_PLAN_DT varchar(8) comment '入荷予定日'
  , CLIENT_RECEIVE_NO varchar(30) comment '顧客入荷指示No.'
  , RECEIVE_SLIP_NO varchar(30) comment 'WMS入荷伝票No.'
  , SUPPLIER_ID bigint comment '仕入先ID'
  , SUPPLIER_CD varchar(30) comment '仕入先CD'
  , SUPPLIER_NM varchar(60) comment '仕入先名称'
  , DEPOSIT_ID bigint comment '預託ID'
  , DEPOSIT_CD varchar(30) comment '預託CD'
  , DEPOSIT_NM varchar(60) comment '預託名称'
  , RECEIVE_DELIVERY_STATUS varchar(30) comment '入荷納品ステータス'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint H_RECEIVE_H_PK primary key (STORE_RECORD_H_ID)
) comment '入荷ヘッダ履歴' ;

create index H_RECEIVE_H_IX1
  on H_RECEIVE_H(PROCESS_TYPE_ID);

create index H_RECEIVE_H_IX2
  on H_RECEIVE_H(CLIENT_RECEIVE_NO);

create index H_RECEIVE_H_IX3
  on H_RECEIVE_H(RECEIVE_SLIP_NO);

create index H_RECEIVE_H_IX4
  on H_RECEIVE_H(SUPPLIER_CD);

-- 入荷予備履歴
create table H_RECEIVE_SPARE (
  STORE_RECORD_B_ID bigint not null comment '入庫実績ボディID'
  , SPARE_STR_1 varchar(255) comment '予備項目１（文字列）'
  , SPARE_STR_2 varchar(255) comment '予備項目２（文字列）'
  , SPARE_STR_3 varchar(255) comment '予備項目３（文字列）'
  , SPARE_NUM_1 decimal(14,4) comment '予備項目１（数値）'
  , SPARE_NUM_2 decimal(14,4) comment '予備項目２（数値）'
  , SPARE_NUM_3 decimal(14,4) comment '予備項目３（数値）'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint H_RECEIVE_SPARE_PK primary key (STORE_RECORD_B_ID)
) comment '入荷予備履歴' ;

-- 出荷ボディ履歴
create table H_SHIPPING_B (
  SHIPPING_INST_B_ID bigint not null comment '出荷指示ボディID'
  , SHIPPING_INST_H_ID bigint not null comment '出荷指示ヘッダID'
  , LINE_NO bigint comment '行No.'
  , WAREHOUSE_ID bigint comment '指定倉庫ID'
  , WAREHOUSE_CD varchar(30) comment '指定倉庫CD'
  , WAREHOUSE_NM varchar(60) comment '指定倉庫名称'
  , PRODUCT_ID bigint comment '商品ID'
  , PRODUCT_CD varchar(100) comment '商品CD'
  , PRODUCT_NM varchar(255) comment '商品名称'
  , STOCK_TYPE_ID bigint comment '在庫区分ID'
  , LOCATION_ID bigint comment '指定ロケーションID'
  , LOCATION_CD varchar(30) comment '指定ロケーションCD'
  , LOCATION_NM varchar(60) comment '指定ロケーション名称'
  , DEPOSIT_ID bigint comment '指定預託ID'
  , DEPOSIT_CD varchar(30) comment '指定預託CD'
  , DEPOSIT_NM varchar(60) comment '指定預託名称'
  , LOT_ID bigint comment '指定ロットID'
  , LOT varchar(30) comment '指定ロット'
  , LIMIT_DT varchar(8) comment '指定期限日'
  , STORE_NO_ID bigint comment '指定入庫No.ID'
  , STORE_LABEL_NO varchar(30) comment '指定入庫ラベルNo.'
  , SHAPE_ID bigint comment '指定荷姿ID'
  , SHAPE_CD varchar(30) comment '指定荷姿CD'
  , SHAPE_NM varchar(60) comment '指定荷姿名称'
  , UNIT_NUM bigint comment '指定入数'
  , INST_NUM decimal(14,4) comment '指示数'
  , SHIPPING_NUM decimal(14,4) comment '出荷数'
  , UNIT_PRICE decimal(14,4) comment '単価'
  , PRICE decimal(14,4) comment '金額'
  , TAX decimal(14,4) comment '消費税'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint H_SHIPPING_B_PK primary key (SHIPPING_INST_B_ID)
) comment '出荷ボディ履歴' ;

create index H_SHIPPING_B_IX1
  on H_SHIPPING_B(SHIPPING_INST_H_ID);

create index H_SHIPPING_B_IX2
  on H_SHIPPING_B(STOCK_TYPE_ID);

create index H_SHIPPING_B_IX3
  on H_SHIPPING_B(PRODUCT_CD);

-- 出荷ヘッダ履歴
create table H_SHIPPING_H (
  SHIPPING_INST_H_ID bigint not null comment '出荷指示ヘッダID'
  , HIST_DT varchar(8) not null comment '履歴日'
  , CLIENT_ID bigint not null comment '荷主ID'
  , CLIENT_CD varchar(30) comment '荷主CD'
  , CLIENT_NM varchar(60) comment '荷主名称'
  , CENTER_ID bigint not null comment 'センタID'
  , CENTER_CD varchar(30) comment 'センタCD'
  , CENTER_NM varchar(60) comment 'センタ名称'
  , PROCESS_TYPE_ID bigint not null comment '処理区分ID'
  , DELIV_PLAN_DT varchar(8) comment '納品予定日'
  , DELIV_DT varchar(8) comment '納品指定日'
  , DELIV_TZ varchar(30) comment '納品時間帯'
  , SHIPPING_DT varchar(8) comment '出荷日'
  , WORK_DT varchar(8) comment '作業日'
  , CLIENT_SHIPPING_NO varchar(30) comment '顧客出荷指示No.'
  , SHIPPING_SLIP_NO varchar(30) comment 'WMS出荷伝票No.'
  , SUPPLY_CUSTOMER_ID bigint comment '納品先ID'
  , SUPPLY_CUSTOMER_CD varchar(30) comment '納品先CD'
  , SUPPLY_CUSTOMER_NM varchar(255) comment '納品先名称'
  , DELIV_CUSTOMER_ID bigint comment '届先ID'
  , DELIV_CUSTOMER_CD varchar(30) comment '届先CD'
  , DELIV_ZIP_CD varchar(30) comment '届先郵便番号'
  , DELIV_ADDRESS1 varchar(255) comment '届先住所1'
  , DELIV_ADDRESS2 varchar(255) comment '届先住所2'
  , DELIV_ADDRESS3 varchar(255) comment '届先住所3'
  , DELIV_ADDRESS_SUPPLY varchar(60) comment '届先住所補足'
  , DELIV_CUSTOMER_NM varchar(255) comment '届先名称'
  , DELIV_TEL_NO varchar(255) comment '届先電話番号'
  , DELIVERY_COURSE_ID bigint comment '配送コースID'
  , DELIVERY_COURSE_CD varchar(30) comment '配送コースCD'
  , DELIVERY_COURSE_NM varchar(60) comment '配送コース名称'
  , CARRIER_ID bigint comment '運送業者ID'
  , CARRIER_CD varchar(30) comment '運送業者CD'
  , CARRIER_NM varchar(60) comment '運送業者名称'
  , EMERGENCY_FLG char(1) comment '緊急フラグ'
  , PICKING_WORK_MESSAGE varchar(255) comment '出庫作業メッセージ'
  , TOTAL_PRICE decimal(14,4) comment '合計金額'
  , TOTAL_TAX decimal(14,4) comment '合計消費税'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint H_SHIPPING_H_PK primary key (SHIPPING_INST_H_ID)
) comment '出荷ヘッダ履歴' ;

create index H_SHIPPING_H_IX1
  on H_SHIPPING_H(PROCESS_TYPE_ID);

create index H_SHIPPING_H_IX2
  on H_SHIPPING_H(SHIPPING_DT);

create index H_SHIPPING_H_IX3
  on H_SHIPPING_H(WORK_DT);

create index H_SHIPPING_H_IX4
  on H_SHIPPING_H(CLIENT_SHIPPING_NO);

create index H_SHIPPING_H_IX5
  on H_SHIPPING_H(SHIPPING_SLIP_NO);

create index H_SHIPPING_H_IX6
  on H_SHIPPING_H(SUPPLY_CUSTOMER_CD);

-- 出荷予備履歴
create table H_SHIPPING_SPARE (
  SHIPPING_INST_B_ID bigint not null comment '出荷指示ボディID'
  , SPARE_STR_1 varchar(255) comment '予備項目１（文字列）'
  , SPARE_STR_2 varchar(255) comment '予備項目２（文字列）'
  , SPARE_STR_3 varchar(255) comment '予備項目３（文字列）'
  , SPARE_NUM_1 decimal(14,4) comment '予備項目１（数値）'
  , SPARE_NUM_2 decimal(14,4) comment '予備項目２（数値）'
  , SPARE_NUM_3 decimal(14,4) comment '予備項目３（数値）'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint H_SHIPPING_SPARE_PK primary key (SHIPPING_INST_B_ID)
) comment '出荷予備履歴' ;

-- 在庫履歴
create table H_STOCK (
  STOCK_ID bigint not null comment '在庫ID'
  , CLIENT_ID bigint not null comment '荷主ID'
  , CLIENT_CD varchar(30) comment '荷主CD'
  , CLIENT_NM varchar(60) comment '荷主名称'
  , CENTER_ID bigint comment 'センタID'
  , CENTER_CD varchar(30) comment 'センタCD'
  , CENTER_NM varchar(60) comment 'センタ名称'
  , WAREHOUSE_ID bigint not null comment '倉庫ID'
  , WAREHOUSE_CD varchar(30) comment '倉庫CD'
  , WAREHOUSE_NM varchar(60) comment '倉庫名称'
  , PRODUCT_ID bigint not null comment '商品ID'
  , PRODUCT_CD varchar(100) comment '商品CD'
  , PRODUCT_NM varchar(255) comment '商品名称'
  , PRODUCT_ABBR varchar(60) comment '商品略称'
  , JAN_CD varchar(30) comment 'JANCD'
  , STOCK_TYPE_ID bigint not null comment '在庫区分ID'
  , ZONE_ID bigint comment 'ゾーンID'
  , ZONE_CD varchar(30) comment 'ゾーンCD'
  , ZONE_NM varchar(60) comment 'ゾーン名称'
  , LOCATION_ID bigint not null comment 'ロケーションID'
  , LOCATION_CD varchar(30) comment 'ロケーションCD'
  , LOCATION_NM varchar(60) comment 'ロケーション名称'
  , DEPOSIT_ID bigint not null comment '預託ID'
  , DEPOSIT_CD varchar(30) comment '預託CD'
  , DEPOSIT_NM varchar(60) comment '預託名称'
  , DEPOSIT_ABBR varchar(60) comment '預託略称'
  , LOT_ID bigint not null comment 'ロットID'
  , LOT varchar(30) comment 'ロット'
  , LIMIT_DT varchar(8) comment '期限日'
  , SHAPE_ID bigint comment '荷姿ID'
  , STORE_NO_ID bigint not null comment '入庫No.ID'
  , STORE_LABEL_NO varchar(30) comment '入庫ラベルNo.'
  , OLD_STORE_NUM_ID bigint comment '元入庫No.ID'
  , OLD_STORE_LABEL_NO varchar(30) comment '元入庫ラベルNo.'
  , SUPPLIER_ID bigint comment '仕入先ID'
  , SUPPLIER_CD varchar(30) comment '仕入先CD'
  , SUPPLIER_NM varchar(60) comment '仕入先名称'
  , SUPPLIER_ABBR varchar(60) comment '仕入先略称'
  , STORE_DT varchar(8) comment '入庫日'
  , UNIT_NUM bigint comment '入数'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint H_STOCK_PK primary key (STOCK_ID)
) comment '在庫履歴' ;

create index H_STOCK_IX1
  on H_STOCK(PRODUCT_CD);

create index H_STOCK_IX2
  on H_STOCK(JAN_CD);

create index H_STOCK_IX3
  on H_STOCK(LOCATION_CD);

create index H_STOCK_IX4
  on H_STOCK(DEPOSIT_CD);

create index H_STOCK_IX5
  on H_STOCK(LOT);

create index H_STOCK_IX6
  on H_STOCK(LIMIT_DT);

create index H_STOCK_IX7
  on H_STOCK(STOCK_TYPE_ID);

create index H_STOCK_IX8
  on H_STOCK(SHAPE_ID);

-- 帳簿在庫履歴
create table H_STOCK_BOOK (
  STOCK_BOOK_ID bigint not null comment '帳簿在庫履歴ID'
  , REFERENCE_DT varchar(8) not null comment '基準日'
  , BASE_CD varchar(30) comment '拠点CD'
  , BASE_TYPE_CD varchar(30) comment '拠点区分'
  , VARIETY_TYPE_CD varchar(30) comment '品種区分'
  , PRODUCT_ID bigint comment '商品ID'
  , CHARGE_NUM decimal(14,4) comment '帳簿引当可能数'
  , ALLOC_NUM decimal(14,4) comment '帳簿引当済数'
  , SALES_ORG_CD varchar(30) comment '販売組織CD'
  , SALES_ORG_NM varchar(60) comment '販売組織名称'
  , USER_CD varchar(30) comment 'ユーザCD'
  , USER_NM varchar(60) comment 'ユーザ名称'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint H_STOCK_BOOK_PK primary key (STOCK_BOOK_ID)
) comment '帳簿在庫履歴' ;

-- 在庫受払データ履歴
create table H_STOCK_INOUT (
  STOCK_INOUT_ID bigint not null comment '在庫受払ID'
  , HIST_DT varchar(8) not null comment '履歴日'
  , FS_STOCK_INOUT_ID bigint comment '初回在庫受払ID'
  , BF_STOCK_INOUT_ID bigint comment '前回在庫受払ID'
  , PROCESS_DT varchar(8) not null comment '処理日'
  , PROCESS_TYPE_ID bigint not null comment '処理区分ID'
  , PROCESS_NO varchar(30) not null comment '処理No.'
  , CORRECT_TYPE char(1) not null comment '赤黒区分'
  , STOCK_ID bigint not null comment '在庫ID'
  , INOUT_TYPE char(1) not null comment '入出庫区分'
  , STOCK_INOUT_NUM decimal(14,4) not null comment '受払数'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint H_STOCK_INOUT_PK primary key (STOCK_INOUT_ID)
) comment '在庫受払データ履歴' ;

create index H_STOCK_INOUT_IX1
  on H_STOCK_INOUT(PROCESS_DT);

create index H_STOCK_INOUT_IX2
  on H_STOCK_INOUT(PROCESS_TYPE_ID);

create index H_STOCK_INOUT_IX3
  on H_STOCK_INOUT(STOCK_ID);

-- 在庫日報履歴
create table H_STOCK_REPORT (
  STOCK_REPORT_ID bigint not null comment '在庫履歴ID'
  , HIST_DT varchar(8) not null comment '履歴日'
  , STOCK_ID bigint not null comment '在庫ID'
  , CHARGE_NUM decimal(14,4) default 0 not null comment '引当可能数'
  , ALLOC_NUM decimal(14,4) default 0 not null comment '引当済数'
  , MOVE_NUM decimal(14,4) default 0 not null comment '移動中数'
  , TRANSIT_NUM decimal(14,4) default 0 not null comment '積送中数'
  , STORE_NUM_DAY decimal(14,4) default 0 comment '当日入庫数'
  , PICKING_NUM_DAY decimal(14,4) default 0 comment '当日出庫数'
  , MOVE_PLS_NUM_DAY decimal(14,4) default 0 comment '当日移動数＋'
  , MOVE_MNS_NUM_DAY decimal(14,4) default 0 comment '当日移動数－'
  , ADJ_PLS_NUM_DAY decimal(14,4) default 0 comment '当日調整数＋'
  , ADJ_MNS_NUM_DAY decimal(14,4) default 0 comment '当日調整数－'
  , P_CHARGE_NUM_DAY decimal(14,4) default 0 comment '前日引当可能数'
  , P_ALLOC_NUM_DAY decimal(14,4) default 0 comment '前日引当済数'
  , P_MOVE_NUM_DAY decimal(14,4) default 0 comment '前日移動中数'
  , P_TRANSIT_NUM_DAY decimal(14,4) default 0 comment '前日積送中数'
  , STORE_NUM_MONTH decimal(14,4) default 0 comment '当月入庫数'
  , PICKING_NUM_MONTH decimal(14,4) default 0 comment '当月出庫数'
  , MOVE_PLS_NUM_MONTH decimal(14,4) default 0 comment '当月移動数＋'
  , MOVE_MNS_NUM_MONTH decimal(14,4) default 0 comment '当月移動数－'
  , ADJ_PLS_NUM_MONTH decimal(14,4) default 0 comment '当月調整数＋'
  , ADJ_MNS_NUM_MONTH decimal(14,4) default 0 comment '当月調整数－'
  , P_CHARGE_NUM_MONTH decimal(14,4) default 0 comment '前月引当可能数'
  , P_ALLOC_NUM_MONTH decimal(14,4) default 0 comment '前月引当済数'
  , P_MOVE_NUM_MONTH decimal(14,4) default 0 comment '前月移動中数'
  , P_TRANSIT_NUM_MONTH decimal(14,4) default 0 comment '前月積送中数'
  , CHARGE_NUM_10 decimal(14,4) default 0 comment '10日残引当可能数'
  , ALLOC_NUM_10 decimal(14,4) default 0 comment '10日残引当済数'
  , MOVE_NUM_10 decimal(14,4) default 0 comment '10日残移動中数'
  , TRANSIT_NUM_10 decimal(14,4) default 0 comment '10日残積送中数'
  , CHARGE_NUM_15 decimal(14,4) default 0 comment '15日残引当可能数'
  , ALLOC_NUM_15 decimal(14,4) default 0 comment '15日残引当済数'
  , MOVE_NUM_15 decimal(14,4) default 0 comment '15日残移動中数'
  , TRANSIT_NUM_15 decimal(14,4) default 0 comment '15日残積送中数'
  , CHARGE_NUM_20 decimal(14,4) default 0 comment '20日残引当可能数'
  , ALLOC_NUM_20 decimal(14,4) default 0 comment '20日残引当済数'
  , MOVE_NUM_20 decimal(14,4) default 0 comment '20日残移動中数'
  , TRANSIT_NUM_20 decimal(14,4) default 0 comment '20日残積送中数'
  , CHARGE_NUM_LAST decimal(14,4) default 0 comment '末日残引当可能数'
  , ALLOC_NUM_LAST decimal(14,4) default 0 comment '末日残引当済数'
  , MOVE_NUM_LAST decimal(14,4) default 0 comment '末日残移動中数'
  , TRANSIT_NUM_LAST decimal(14,4) default 0 comment '末日残積送中数'
  , LAST_STORE_DT varchar(8) comment '最新入庫年月日'
  , LAST_PICKING_DT varchar(8) comment '最新出庫年月日'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint H_STOCK_REPORT_PK primary key (STOCK_REPORT_ID)
) comment '在庫日報履歴' ;

create unique index H_STOCK_REPORT_IX1
  on H_STOCK_REPORT(HIST_DT,STOCK_ID);

create index H_STOCK_REPORT_IX2
  on H_STOCK_REPORT(STOCK_ID);

create index H_STOCK_REPORT_IX3
  on H_STOCK_REPORT(HIST_DT);

-- 拠点販売組織マスタ
create table M_BASE_SALES_ORG (
  BASE_SALES_ORG_ID bigint not null comment '拠点販売組織ID'
  , BASE_CD varchar(30) comment '拠点CD'
  , SALES_ORG_ID bigint comment '販売組織ID'
  , CARRIER_ID bigint comment '運送業者ID'
  , CARRIER_CD varchar(30) comment '運送業者CD'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint M_BASE_SALES_ORG_PK primary key (BASE_SALES_ORG_ID)
) comment '拠点販売組織マスタ' ;

-- 荷材マスタ
create table M_BOX (
  BOX_ID bigint not null comment '荷材ID'
  , CENTER_ID bigint not null comment 'センタID'
  , BOX_CD varchar(30) not null comment '荷材CD'
  , BOX_NM varchar(60) not null comment '荷材名称'
  , LENGTH decimal(14,4) comment '縦(mm)'
  , WIDTH decimal(14,4) comment '横(mm)'
  , HEIGHT decimal(14,4) comment '高さ(mm)'
  , VOLUME decimal(14,4) comment '容積(mm3)'
  , VOLUME_RATE bigint comment '容積率(%)'
  , PERMIT_VOLUME decimal(14,4) comment '許容容積(mm3)'
  , PERMIT_WEIGHT decimal(14,4) comment '許容重量(g)'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint M_BOX_PK primary key (BOX_ID)
) comment '荷材マスタ' ;

create unique index M_BOX_IX1
  on M_BOX(CENTER_ID,BOX_CD);

create index M_BOX_IX2
  on M_BOX(BOX_CD);

-- 荷材グループマスタ
create table M_BOX_GRP (
  BOX_GRP_ID bigint not null comment '荷材グループID'
  , CENTER_ID bigint not null comment 'センタID'
  , BOX_GRP_CD varchar(30) not null comment '荷材グループCD'
  , BOX_GRP_NM varchar(255) not null comment '荷材グループ名称'
  , STANDARD_BOX_ID bigint not null comment '基準荷材ID'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint M_BOX_GRP_PK primary key (BOX_GRP_ID)
) comment '荷材グループマスタ' ;

create unique index M_BOX_GRP_IX1
  on M_BOX_GRP(CENTER_ID,BOX_GRP_CD);

create index M_BOX_GRP_IX2
  on M_BOX_GRP(STANDARD_BOX_ID);

create index M_BOX_GRP_IX3
  on M_BOX_GRP(BOX_GRP_CD);

-- 荷材グループ明細マスタ
create table M_BOX_GRP_DTL (
  BOX_GRP_DTL_ID bigint not null comment '荷材グループ明細ID'
  , BOX_GRP_ID bigint not null comment '荷材グループID'
  , BOX_ID bigint not null comment '荷材ID'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint M_BOX_GRP_DTL_PK primary key (BOX_GRP_DTL_ID)
) comment '荷材グループ明細マスタ' ;

create unique index M_BOX_GRP_DTL_IX1
  on M_BOX_GRP_DTL(BOX_GRP_ID,BOX_ID);

create index M_BOX_GRP_DTL_IX2
  on M_BOX_GRP_DTL(BOX_GRP_ID);

create index M_BOX_GRP_DTL_IX3
  on M_BOX_GRP_DTL(BOX_ID);

-- センタ運送業者マスタ
create table M_CARRIER (
  CARRIER_ID bigint not null comment '運送業者ID'
  , CENTER_ID bigint not null comment 'センタID'
  , COMMON_CARRIER_ID bigint comment '共通運送業者ID'
  , CARRIER_CD varchar(30) comment '運送業者CD'
  , CARRIER_NM varchar(60) comment '運送業者名称'
  , CARRIER_ABBR varchar(60) comment '運送業者略称'
  , LARGE_ITEM_HADLING_FLG char(1) default '0' not null comment '大物取扱フラグ'
  , HEAVY_ITEM_HADLING_FLG char(1) default '0' not null comment '重量取扱フラグ'
  , HOLIDAY_CARRIER_FLG char(1) default '0' not null comment '休日振替運送業者フラグ'
  , OKINAWA_FLIGHT_FLG char(1) default '0' not null comment '沖縄航空便振替フラグ'
  , BASE_DEFAULT_CARRIER_FLG char(1) default '0' not null comment '拠点デフォルト運送業者フラグ'
  , INSURANCE_CARRIER_CD varchar(30) comment '保険品振替業者CD'
  , SLIP_TYPE_CD varchar(30) comment '受渡表区分'
  , BASE_CD varchar(30) comment '拠点CD'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint M_CARRIER_PK primary key (CARRIER_ID)
) comment 'センタ運送業者マスタ' ;

create unique index M_CARRIER_IX1
  on M_CARRIER(CENTER_ID,CARRIER_CD);

create index M_CARRIER_IX2
  on M_CARRIER(CARRIER_CD);

create index M_CARRIER_IX3
  on M_CARRIER(COMMON_CARRIER_ID);

-- 運送業者荷材マスタ
create table M_CARRIER_BOX (
  CARRIER_BOX_ID bigint not null comment '運送業者荷材ID'
  , CARRIER_ID bigint not null comment '運送業者ID'
  , BOX_ID bigint not null comment '荷材ID'
  , BOX_SIZE_CD varchar(30) not null comment '荷材サイズCD'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint M_CARRIER_BOX_PK primary key (CARRIER_BOX_ID)
) comment '運送業者荷材マスタ' ;

create unique index M_CARRIER_BOX_IX1
  on M_CARRIER_BOX(CARRIER_ID,BOX_ID);

create index M_CARRIER_BOX_IX2
  on M_CARRIER_BOX(CARRIER_ID);

create index M_CARRIER_BOX_IX3
  on M_CARRIER_BOX(BOX_ID);

-- 運送業者決定マスタ
create table M_CARRIER_DECISION (
  CARRIER_DECISION_ID bigint not null comment '運送業者決定ID'
  , CENTER_CD varchar(30) comment '拠点CD'
  , ZIP_CD varchar(30) comment '郵便番号'
  , SALES_ORG_ID bigint comment '販売組織ID'
  , SALES_ORG_CD varchar(30) comment '販売組織CD'
  , CUSTOMER_ID bigint comment '取引先ID'
  , CUSTOMER_CD varchar(30) comment '取引先CD'
  , DIRECT_KOHAI_TYPE_CD varchar(30) comment '直送・戸配区分'
  , PREFECTURE varchar(60) comment '都道府県'
  , CARRIER_ID bigint comment '運送業者ID'
  , CARRIER_CD varchar(30) comment '運送業者CD'
  , CARRIER_ID1 bigint comment '運送業者ID(UN/HM/用品)'
  , CARRIER_CD1 varchar(30) comment '運送業者CD(UN/HM/用品)'
  , CARRIER_ID2 bigint comment '運送業者ID(FW足数上限)'
  , CARRIER_CD2 varchar(30) comment '運送業者CD(FW足数上限)'
  , CARRIER_ID3 bigint comment '運送業者ID(FW足数以上業者)'
  , CARRIER_CD3 varchar(30) comment '運送業者CD(FW足数以上業者)'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint M_CARRIER_DECISION_PK primary key (CARRIER_DECISION_ID)
) comment '運送業者決定マスタ' ;

create index M_CARRIER_DECISION_IX1
  on M_CARRIER_DECISION(SALES_ORG_CD,CUSTOMER_CD);

create index M_CARRIER_DECISION_IX2
  on M_CARRIER_DECISION(ZIP_CD);

create index M_CARRIER_DECISION_IX3
  on M_CARRIER_DECISION(DIRECT_KOHAI_TYPE_CD,PREFECTURE);

-- キャリアEDIシステム送り状マスタ
create table M_CARRIER_SLIP_CES (
  CUSTOMER_ID bigint not null comment '取引先ID'
  , COLLECT_ACCOUNT_NO_BILL_TO varchar(30) comment 'Collect Account # (Bill To)'
  , COLLECT_ZIP_CD_BILL_TO varchar(30) comment 'Collect Zip Code (Bill To)'
  , COLLECT_COUNTRY_CD_BILL_TO varchar(30) comment 'Collect Country Code (Bill To)'
  , PAYMENT_TERM_CD_TAXES_TO varchar(30) comment 'Payment Term Code (Taxes to)'
  , COLLECT_ACCOUNT_NO_TAXES_TO varchar(30) comment 'Collect Account # (Taxes to)'
  , COLLECT_ZIP_CD_TAXES_TO varchar(30) comment 'Collect Zip Code (Taxes to)'
  , COLLECT_COUNTRY_CD_TAXES_TO varchar(30) comment 'Collect Country Code (Taxes To)'
  , COD_PAYMENT_TERM_CD varchar(30) comment 'COD Payment Term Code'
  , COD_AMOUNT decimal(14,4) comment 'COD Amount'
  , COD_FEE_PAYER varchar(30) comment 'COD Fee Payer'
  , TERMS_OF_SALES varchar(30) comment 'Terms of Sales'
  , BROKER_NAME varchar(255) comment 'Broker Name'
  , BROKER_PHONE_NO varchar(30) comment 'Broker Phone #'
  , BROKER_FAX_NO varchar(30) comment 'Broker Fax #'
  , SAT_DELIVERY_FLG char(1) comment 'Saturday Delivery Flag'
  , RESIDENTIAL_DELIVERY_FLG char(1) comment 'Residential Delivery Flag'
  , COD_FLG char(1) comment 'Collect on Delivery Flag'
  , SIGNATURE_REQUIRED_FLG char(1) comment 'Signature Required Flag'
  , SIGNATURE_RELEASE_FLG char(1) comment 'Signature Release Flag'
  , CALL_BEFORE_DELIVERY_FLG char(1) comment 'Call Before Delivery Flag'
  , FREEZABLE_PROTECTION_FLG char(1) comment 'Freezable Protection Flag'
  , GUARANTEED_PLUS_FLG char(1) comment 'Guaranteed Plus Flag'
  , RESIDENTIAL_PICKUP_FLG char(1) comment 'Residential Pickup Flag'
  , DO_NOT_STACK_STACK_FLG char(1) comment 'Do Not Stack Pallets Flag'
  , LIMITED_ACCESS_DELIVERY_FLG char(1) comment 'Limited Access Delivery Flag'
  , LIMITED_ACCESS_PICKUP_FLG char(1) comment 'Limited Access Pickup Flag'
  , OVER_SIZED_FLG char(1) comment 'Over-Sized / Extreme Length Flag'
  , POISON_FLG char(1) comment 'Poison Flag'
  , FOOG_FLG char(1) comment 'Food Flag'
  , LIFTGATE_DELIVERY_PREPAID_FLG char(1) comment 'Liftgate at delivery Flag (Prepaid)'
  , LIFTGATE_DELIVERY_COLLECT_FLG char(1) comment 'Liftgate at delivery Flag (Collect)'
  , LIFTGATE_PICKUP_PREPAID_FLG char(1) comment 'Liftgate at pickup Flag (Prepaid)'
  , LIFTGATE_PICKUP_COLLECT_FLG char(1) comment 'Liftgate at pickup Flag (Collect)'
  , INSIDE_DELIVERY_PREPAID_FLG char(1) comment 'Inside Delivery Flag (Prepaid)'
  , INSIDE_DELIVERY_COLLECT_FLG char(1) comment 'Inside Delivery Flag (Collect)'
  , INSIDE_PICKUP_PREPAID_FLG char(1) comment 'Inside Pickup Flag (Prepaid)'
  , INSIDE_PICKUP_COLLECT_FLG char(1) comment 'Inside Pickup Flag (Collect)'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint M_CARRIER_SLIP_CES_PK primary key (CUSTOMER_ID)
) comment 'キャリアEDIシステム送り状マスタ' ;

-- 佐川送り状マスタ
create table M_CARRIER_SLIP_SGW (
  CARRIER_SLIP_SGW_ID bigint not null comment '送り状定義ID'
  , CENTER_ID bigint not null comment 'センタID'
  , TAG_TYPE varchar(30) not null comment 'データ種別'
  , TAG_NM varchar(60) comment 'データ種別名称'
  , CHARACTER_CD varchar(30) comment '文字コード'
  , SLIP_CUSTOMER_CD varchar(30) comment 'お客様コード'
  , WEB_API_REQUEST_URL varchar(100) comment 'WebAPIリクエストURL'
  , CUSTOMER_ID varchar(30) comment 'カスタマーID'
  , LOGIN_PASSWORD varchar(30) comment 'ログインパスワード'
  , DEPT_CONSIGNOR_NM varchar(255) comment '部署・担当者'
  , CONSIGNOR_TEL_NO varchar(30) comment '荷送人電話番号'
  , SLIP_CLIENT_TEL_NO varchar(30) comment 'ご依頼主電話番号'
  , SLIP_CLIENT_ZIP_CD varchar(30) comment 'ご依頼主郵便番号'
  , SLIP_CLIENT_ADDRESS1 varchar(255) comment 'ご依頼主住所1'
  , SLIP_CLIENT_ADDRESS2 varchar(255) comment 'ご依頼主住所2'
  , SLIP_CLIENT_NM1 varchar(255) comment 'ご依頼主名称1'
  , SLIP_CLIENT_NM2 varchar(255) comment 'ご依頼主名称2'
  , SLIP_SHAPE_CD varchar(30) comment '荷姿コード'
  , SLIP_ITEM_NM1 varchar(255) comment '品名1'
  , SLIP_ITEM_NM2 varchar(255) comment '品名2'
  , SLIP_ITEM_NM3 varchar(255) comment '品名3'
  , SLIP_ITEM_NM4 varchar(255) comment '品名4'
  , SLIP_ITEM_NM5 varchar(255) comment '品名5'
  , TRANSPORT_TYPE_SPEED varchar(30) comment '便種(スピードで選択)'
  , TRANSPORT_TYPE_ITEM varchar(30) comment '便種(商品)'
  , SETTLEMENT_TYPE varchar(30) comment '決済種別'
  , SEAL_TYPE1 varchar(30) comment '指定シール1'
  , SEAL_TYPE2 varchar(30) comment '指定シール2'
  , SEAL_TYPE3 varchar(30) comment '指定シール3'
  , COD_CLS varchar(30) comment '元着区分'
  , SEND_CD varchar(30) comment '発店CD'
  , API_OKURI_CODE varchar(30) comment 'WebAPI送り状コード'
  , API_BINSYU_CODE varchar(30) comment 'WebAPI便種コード'
  , API_DAIBIKI_FLG char(1) comment 'WebAPI代引フラグ'
  , API_DAIBIKI_TYPE varchar(30) comment 'WebAPI代引支払方法区分'
  , API_WEIGHT_CD_1 varchar(30) comment 'WebAPI重量コード1'
  , API_WEIGHT_CD_2 varchar(30) comment 'WebAPI重量コード2'
  , API_EIDOME_FLG char(1) comment 'WebAPI営止フラグ'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint M_CARRIER_SLIP_SGW_PK primary key (CARRIER_SLIP_SGW_ID)
) comment '佐川送り状マスタ' ;

create unique index M_CARRIER_SLIP_SGW_IX1
  on M_CARRIER_SLIP_SGW(CENTER_ID,TAG_TYPE);

-- ヤマト送り状マスタ
create table M_CARRIER_SLIP_YMT (
  CARRIER_SLIP_YMT_ID bigint not null comment '送り状定義ID'
  , CENTER_ID bigint not null comment 'センタID'
  , TAG_TYPE varchar(30) not null comment 'データ種別'
  , TAG_NM varchar(60) comment 'データ種別名称'
  , CHARACTER_CD varchar(30) comment '文字コード'
  , SLIP_TYPE varchar(30) comment '送り状種別'
  , COOL_CLS varchar(30) comment 'クール区分'
  , HONORIFIC varchar(30) comment '敬称'
  , PACKING_SHOW_FLG char(1) comment '個数口表示フラグ'
  , SLIP_CLIENT_TEL_NO varchar(30) comment 'ご依頼主電話番号'
  , SLIP_CLIENT_ZIP_CD varchar(30) comment 'ご依頼主郵便番号'
  , SLIP_CLIENT_ADDRESS1 varchar(60) comment 'ご依頼主住所(都道府県)'
  , SLIP_CLIENT_ADDRESS2 varchar(60) comment 'ご依頼主住所(市区郡町村)'
  , SLIP_CLIENT_ADDRESS3 varchar(60) comment 'ご依頼主住所(町域)'
  , SLIP_CLIENT_ADDRESS4 varchar(60) comment 'ご依頼主住所(アパートマンション名)'
  , SLIP_CLIENT_NM varchar(60) comment 'ご依頼主名'
  , SLIP_ITEM_CD1 varchar(30) comment '品名コード1'
  , SLIP_ITEM_NM1 varchar(60) comment '品名1'
  , SLIP_ITEM_CD2 varchar(30) comment '品名コード2'
  , SLIP_ITEM_NM2 varchar(60) comment '品名2'
  , FREIGHT_HANDLING1 varchar(60) comment '荷扱い1'
  , FREIGHT_HANDLING2 varchar(60) comment '荷扱い2'
  , ARTICLE varchar(255) comment '記事'
  , BILLING_CUSTOMER_CD varchar(30) comment 'ご請求先顧客コード'
  , FARE_NO varchar(30) comment '運賃管理番号'
  , SEND_CD varchar(30) comment '発店CD'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint M_CARRIER_SLIP_YMT_PK primary key (CARRIER_SLIP_YMT_ID)
) comment 'ヤマト送り状マスタ' ;

create unique index M_CARRIER_SLIP_YMT_IX1
  on M_CARRIER_SLIP_YMT(CENTER_ID,TAG_TYPE);

-- ゆうパック送り状マスタ
create table M_CARRIER_SLIP_YUPK (
  CARRIER_SLIP_YUPK_ID bigint not null comment '送り状定義ID'
  , CENTER_ID bigint not null comment 'センタID'
  , TAG_TYPE varchar(30) not null comment 'データ種別'
  , TAG_NM varchar(60) comment 'データ種別名称'
  , CHARACTER_CD varchar(30) comment '文字コード'
  , POST_TYPE varchar(30) comment '郵便種別'
  , COOL_TYPE varchar(30) comment '保冷種別'
  , COD_TYPE varchar(30) comment '元／着払／代引'
  , CARRIER_TYPE varchar(30) comment '送り状種別'
  , SLIP_CLIENT_ZIP_CD varchar(30) comment 'ご依頼主郵便番号'
  , SLIP_CLIENT_ADDRESS1 varchar(255) comment 'ご依頼主住所1'
  , SLIP_CLIENT_ADDRESS2 varchar(255) comment 'ご依頼主住所2'
  , SLIP_CLIENT_ADDRESS3 varchar(255) comment 'ご依頼主住所3'
  , SLIP_CLIENT_NM1 varchar(255) comment 'ご依頼主名称1'
  , SLIP_CLIENT_TEL_NO varchar(30) comment 'ご依頼主電話番号'
  , SLIP_CLIENT_MAIL varchar(255) comment 'ご依頼主メールアドレス1'
  , NO_UPSIDE_DOWN_CLS char(1) comment '逆さま厳禁区分'
  , NO_STOCK_CLS char(1) comment '下積み厳禁区分'
  , SLIP_PRODUCT_SIZE_CLS varchar(30) comment '商品サイズ区分'
  , SLIP_PRODUCT_NO varchar(30) comment '商品番号(明細)'
  , SLIP_ITEM_NM varchar(255) comment '品名(明細)'
  , SHIP_RESERVE_DATA_MARK varchar(30) comment '発送予約データマーク'
  , DELI_CERT_PRE_YEARS bigint comment '配達証保存年数'
  , SEND_NM varchar(60) comment '発店名称'
  , PRODUCT_TYPE_CODE varchar(30) comment '商品種別コード'
  , POST_BIZ_CARD_CUSTOMER_NO varchar(100) comment 'ゆうびんビズカードお客さま番号'
  , SHIPPING_COMPANY_CODE varchar(30) comment '発送会社コード'
  , SHIPMENT_CODE varchar(30) comment '発送局コード'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint M_CARRIER_SLIP_YUPK_PK primary key (CARRIER_SLIP_YUPK_ID)
) comment 'ゆうパック送り状マスタ' ;

create unique index M_CARRIER_SLIP_YUPK_IX1
  on M_CARRIER_SLIP_YUPK(CENTER_ID,TAG_TYPE);

-- 運送業者郵便番号マスタ
create table M_CARRIER_ZIP (
  CARRIER_ZIP_ID bigint not null comment '運送業者郵便番号ID'
  , COMMON_CARRIER_ID bigint not null comment '共通運送業者ID'
  , ZIP_ID bigint not null comment '郵便番号ID'
  , ARRIVAL_STORE_CD varchar(30) not null comment '着店CD'
  , ARRIVAL_STORE_NM varchar(255) comment '着店名称'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint M_CARRIER_ZIP_PK primary key (CARRIER_ZIP_ID)
) comment '運送業者郵便番号マスタ' ;

create index M_CARRIER_ZIP_IX1
  on M_CARRIER_ZIP(COMMON_CARRIER_ID);

create index M_CARRIER_ZIP_IX2
  on M_CARRIER_ZIP(ZIP_ID);

-- センタマスタ
create table M_CENTER (
  CENTER_ID bigint not null comment 'センタID'
  , CENTER_CD varchar(30) not null comment 'センタCD'
  , CENTER_NM varchar(60) not null comment 'センタ名称'
  , CENTER_ABBR varchar(60) comment 'センタ略称'
  , CULTURE_ID bigint comment 'カルチャID'
  , TIME_ZONE_ID bigint comment 'タイムゾーンID'
  , ADDRESS varchar(255) comment '住所'
  , TEL_NO varchar(30) comment '電話番号'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint M_CENTER_PK primary key (CENTER_ID)
) comment 'センタマスタ' ;

create unique index M_CENTER_IX1
  on M_CENTER(CENTER_CD);

create index M_CENTER_IX2
  on M_CENTER(CULTURE_ID);

-- センタ区分値マスタ
create table M_CENTER_CLASS (
  CENTER_CLASS_ID bigint not null comment 'センタ区分値ID'
  , CENTER_ID bigint not null comment 'センタID'
  , CLASS_CD varchar(30) not null comment '区分値CD'
  , CLASS_COMMENT varchar(60) comment '区分値解説'
  , SYSTEM_TYPE varchar(30) comment 'システム種別'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint M_CENTER_CLASS_PK primary key (CENTER_CLASS_ID)
) comment 'センタ区分値マスタ' ;

create unique index M_CENTER_CLASS_IX1
  on M_CENTER_CLASS(CENTER_ID,CLASS_CD);

-- センタ区分値明細マスタ
create table M_CENTER_CLASS_DTL (
  CENTER_CLASS_DTL_ID bigint not null comment 'センタ区分値明細ID'
  , CENTER_CLASS_ID bigint not null comment 'センタ区分値ID'
  , CLASS_DTL_CD varchar(100) not null comment '区分値明細CD'
  , DICT_ID bigint not null comment '辞書ID'
  , VIEW_ORDER bigint comment '表示順'
  , DEFAULT_FLG char(1) default '0' not null comment 'デフォルトフラグ'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint M_CENTER_CLASS_DTL_PK primary key (CENTER_CLASS_DTL_ID)
) comment 'センタ区分値明細マスタ' ;

create unique index M_CENTER_CLASS_DTL_IX1
  on M_CENTER_CLASS_DTL(CENTER_CLASS_ID,CLASS_DTL_CD);

create index M_CENTER_CLASS_DTL_IX2
  on M_CENTER_CLASS_DTL(CENTER_CLASS_ID);

create index M_CENTER_CLASS_DTL_IX3
  on M_CENTER_CLASS_DTL(DICT_ID);

-- センタ区分値グループマスタ
create table M_CENTER_CLASS_GRP (
  CENTER_CLASS_GRP_ID bigint not null comment 'センタ区分値グループID'
  , CLASS_GRP_CD varchar(30) not null comment '区分値グループCD'
  , CLASS_GRP_COMMENT varchar(60) comment '区分値グループ解説'
  , CENTER_CLASS_ID bigint not null comment 'センタ区分値ID'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint M_CENTER_CLASS_GRP_PK primary key (CENTER_CLASS_GRP_ID)
) comment 'センタ区分値グループマスタ' ;

create unique index M_CENTER_CLASS_GRP_IX1
  on M_CENTER_CLASS_GRP(CENTER_CLASS_ID,CLASS_GRP_CD);

create index M_CENTER_CLASS_GRP_IX2
  on M_CENTER_CLASS_GRP(CENTER_CLASS_ID);

-- センタ区分値グループ明細マスタ
create table M_CENTER_CLASS_GRP_DTL (
  CENTER_CLASS_GRP_DTL_ID bigint not null comment 'センタ区分値グループ明細ID'
  , CENTER_CLASS_GRP_ID bigint not null comment 'センタ区分値グループID'
  , CENTER_CLASS_DTL_ID bigint not null comment 'センタ区分値明細ID'
  , DEFAULT_FLG char(1) default '0' not null comment 'デフォルトフラグ'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint M_CENTER_CLASS_GRP_DTL_PK primary key (CENTER_CLASS_GRP_DTL_ID)
) comment 'センタ区分値グループ明細マスタ' ;

create unique index M_CENTER_CLASS_GRP_DTL_IX1
  on M_CENTER_CLASS_GRP_DTL(CENTER_CLASS_GRP_ID,CENTER_CLASS_DTL_ID);

create index M_CENTER_CLASS_GRP_DTL_IX2
  on M_CENTER_CLASS_GRP_DTL(CENTER_CLASS_GRP_ID);

create index M_CENTER_CLASS_GRP_DTL_IX3
  on M_CENTER_CLASS_GRP_DTL(CENTER_CLASS_DTL_ID);

-- センタ列マスタ
create table M_CENTER_COL (
  CENTER_COL_ID bigint not null comment 'センタ列 ID'
  , CENTER_ID bigint not null comment 'センタID'
  , COL_ID bigint not null comment '列ID'
  , DICT_ID bigint comment '辞書ID'
  , VISIBLE char(1) comment '表示可否'
  , EDITABLE char(1) comment '編集可否'
  , NECESSARY char(1) comment '必須'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint M_CENTER_COL_PK primary key (CENTER_COL_ID)
) comment 'センタ列マスタ' ;

create unique index M_CENTER_COL_IX1
  on M_CENTER_COL(CENTER_ID,COL_ID,DICT_ID);

create index M_CENTER_COL_IX2
  on M_CENTER_COL(COL_ID);

create index M_CENTER_COL_IX3
  on M_CENTER_COL(DICT_ID);

-- センタ取引先マスタ
create table M_CENTER_CUSTOMER (
  CENTER_CUSTOMER_ID bigint not null comment 'センタ取引先ID'
  , CENTER_ID bigint not null comment 'センタID'
  , CUSTOMER_ID bigint not null comment '取引先ID'
  , DELIVERY_COURSE_ID bigint not null comment '配送コースID'
  , DELIVERY_ORDER bigint comment '配送順'
  , DELIVERY_READ_TIME bigint comment '配送リードタイム'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint M_CENTER_CUSTOMER_PK primary key (CENTER_CUSTOMER_ID)
) comment 'センタ取引先マスタ' ;

create unique index M_CENTER_CUSTOMER_IX1
  on M_CENTER_CUSTOMER(CENTER_ID,CUSTOMER_ID,DELIVERY_COURSE_ID);

create index M_CENTER_CUSTOMER_IX2
  on M_CENTER_CUSTOMER(CUSTOMER_ID);

create index M_CENTER_CUSTOMER_IX3
  on M_CENTER_CUSTOMER(DELIVERY_COURSE_ID);

-- センタ項目マスタ
create table M_CENTER_ITEM (
  CENTER_ITEM_ID bigint not null comment 'センタ項目ID'
  , CENTER_ID bigint not null comment 'センタID'
  , ITEM_ID bigint not null comment '項目ID'
  , DICT_ID bigint comment '辞書ID'
  , VISIBLE char(1) comment '表示可否'
  , EDITABLE char(1) comment '編集可否'
  , NECESSARY char(1) comment '必須'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint M_CENTER_ITEM_PK primary key (CENTER_ITEM_ID)
) comment 'センタ項目マスタ' ;

create unique index M_CENTER_ITEM_IX1
  on M_CENTER_ITEM(CENTER_ID,ITEM_ID,DICT_ID);

create index M_CENTER_ITEM_IX2
  on M_CENTER_ITEM(ITEM_ID);

create index M_CENTER_ITEM_IX3
  on M_CENTER_ITEM(DICT_ID);

-- センタ画面マスタ
create table M_CENTER_SCREEN (
  CENTER_SCREEN_ID bigint not null comment 'センタ画面ID'
  , CENTER_ID bigint not null comment 'センタID'
  , SCREEN_ID bigint not null comment '画面ID'
  , DICT_ID bigint comment '辞書ID'
  , VISIBLE char(1) comment '表示可否'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint M_CENTER_SCREEN_PK primary key (CENTER_SCREEN_ID)
) comment 'センタ画面マスタ' ;

create unique index M_CENTER_SCREEN_IX1
  on M_CENTER_SCREEN(CENTER_ID,SCREEN_ID,DICT_ID);

create index M_CENTER_SCREEN_IX2
  on M_CENTER_SCREEN(SCREEN_ID);

create index M_CENTER_SCREEN_IX3
  on M_CENTER_SCREEN(DICT_ID);

-- 荷主マスタ
create table M_CLIENT (
  CLIENT_ID bigint not null comment '荷主ID'
  , CLIENT_CD varchar(30) not null comment '荷主CD'
  , CLIENT_NM varchar(60) not null comment '荷主名称'
  , CLIENT_ABBR varchar(60) comment '荷主略称'
  , CUSTOMER_ID bigint comment '荷主取引先ID'
  , SHAPE_GRP_ID bigint comment '荷姿グループID'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint M_CLIENT_PK primary key (CLIENT_ID)
) comment '荷主マスタ' ;

create unique index M_CLIENT_IX1
  on M_CLIENT(CLIENT_CD);

create index M_CLIENT_IX2
  on M_CLIENT(CUSTOMER_ID);

-- 荷主センタマスタ
create table M_CLIENT_CENTER (
  CLIENT_CENTER_ID bigint not null comment '荷主センタID'
  , CLIENT_ID bigint not null comment '荷主ID'
  , CENTER_ID bigint not null comment 'センタID'
  , SYSTEM_DT varchar(8) not null comment 'システム管理日付'
  , BATCH_PROGRESS_FLG char(1) default '0' not null comment 'バッチ処理中フラグ'
  , BEFORE_SYSTEM_DT varchar(8) comment '前回システム管理日付'
  , CUSTOMER_ID bigint comment 'センタ取引先ID'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint M_CLIENT_CENTER_PK primary key (CLIENT_CENTER_ID)
) comment '荷主センタマスタ' ;

create unique index M_CLIENT_CENTER_IX1
  on M_CLIENT_CENTER(CLIENT_ID,CENTER_ID);

create index M_CLIENT_CENTER_IX2
  on M_CLIENT_CENTER(CUSTOMER_ID);

-- 荷主列マスタ
create table M_CLIENT_COL (
  CLIENT_COL_ID bigint not null comment '荷主列 ID'
  , CLIENT_ID bigint not null comment '荷主ID'
  , COL_ID bigint not null comment '列ID'
  , DICT_ID bigint comment '辞書ID'
  , VISIBLE char(1) comment '表示可否'
  , EDITABLE char(1) comment '編集可否'
  , NECESSARY char(1) comment '必須'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint M_CLIENT_COL_PK primary key (CLIENT_COL_ID)
) comment '荷主列マスタ' ;

create unique index M_CLIENT_COL_IX1
  on M_CLIENT_COL(CLIENT_ID,COL_ID,DICT_ID);

create index M_CLIENT_COL_IX2
  on M_CLIENT_COL(COL_ID);

create index M_CLIENT_COL_IX3
  on M_CLIENT_COL(DICT_ID);

-- 荷主項目マスタ
create table M_CLIENT_ITEM (
  CLIENT_ITEM_ID bigint not null comment '荷主項目ID'
  , CLIENT_ID bigint not null comment '荷主ID'
  , ITEM_ID bigint not null comment '項目ID'
  , DICT_ID bigint comment '辞書ID'
  , VISIBLE char(1) comment '表示可否'
  , EDITABLE char(1) comment '編集可否'
  , NECESSARY char(1) comment '必須'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint M_CLIENT_ITEM_PK primary key (CLIENT_ITEM_ID)
) comment '荷主項目マスタ' ;

create unique index M_CLIENT_ITEM_IX1
  on M_CLIENT_ITEM(CLIENT_ID,ITEM_ID,DICT_ID);

create index M_CLIENT_ITEM_IX2
  on M_CLIENT_ITEM(ITEM_ID);

create index M_CLIENT_ITEM_IX3
  on M_CLIENT_ITEM(DICT_ID);

-- 荷主画面マスタ
create table M_CLIENT_SCREEN (
  CLIENT_SCREEN_ID bigint not null comment '荷主画面ID'
  , CLIENT_ID bigint not null comment '荷主ID'
  , SCREEN_ID bigint not null comment '画面ID'
  , DICT_ID bigint comment '辞書ID'
  , VISIBLE char(1) comment '表示可否'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint M_CLIENT_SCREEN_PK primary key (CLIENT_SCREEN_ID)
) comment '荷主画面マスタ' ;

create unique index M_CLIENT_SCREEN_IX1
  on M_CLIENT_SCREEN(CLIENT_ID,SCREEN_ID,DICT_ID);

create index M_CLIENT_SCREEN_IX2
  on M_CLIENT_SCREEN(SCREEN_ID);

create index M_CLIENT_SCREEN_IX3
  on M_CLIENT_SCREEN(DICT_ID);

-- 共通運送業者マスタ
create table M_COMMON_CARRIER (
  COMMON_CARRIER_ID bigint not null comment '共通運送業者ID'
  , CARRIER_CD varchar(30) not null comment '運送業者CD'
  , CARRIER_NM varchar(60) not null comment '運送業者名称'
  , CARRIER_ABBR varchar(60) comment '運送業者略称'
  , ARRIVAL_STORE_BARCODE varchar(30) comment '着店CDバーコード種別'
  , ARRIVAL_STORE_START_BIT varchar(30) comment '着店CDスタートビット'
  , ARRIVAL_STORE_END_BIT varchar(30) comment '着店CDエンドビット'
  , ARRIVAL_STORE_FORMAT varchar(30) comment '着店CDフォーマット'
  , TRACKING_BARCODE varchar(30) comment '追跡番号バーコード種別'
  , TRACKING_START_BIT varchar(30) comment '追跡番号スタートビット'
  , TRACKING_END_BIT varchar(30) comment '追跡番号エンドビット'
  , BOL_OUTPUT_TARGET_FLG char(1) comment 'Bill of Lading出力対象フラグ'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint M_COMMON_CARRIER_PK primary key (COMMON_CARRIER_ID)
) comment '共通運送業者マスタ' ;

create index M_COMMON_CARRIER_IX1
  on M_COMMON_CARRIER(CARRIER_CD);

-- 取引先マスタ
create table M_CUSTOMER (
  CUSTOMER_ID bigint not null comment '取引先ID'
  , CLIENT_ID bigint not null comment '荷主ID'
  , CUSTOMER_CD varchar(30) not null comment '取引先CD'
  , CUSTOMER_NM varchar(60) not null comment '取引先名称'
  , CUSTOMER_ABBR varchar(60) comment '取引先略称'
  , ZIP_CD varchar(30) comment '郵便番号'
  , TEL_NO varchar(30) comment '電話番号'
  , ADDRESS1 varchar(60) comment '住所1'
  , ADDRESS2 varchar(60) comment '住所2'
  , ADDRESS3 varchar(60) comment '住所3'
  , VENDOR_FLG char(1) comment '仕入先フラグ'
  , DELIVERY_FLG char(1) comment '納品先フラグ'
  , ONETIME_FLG char(1) comment 'ワンタイムフラグ'
  , DEPOSIT_FLG char(1) comment '預託先フラグ'
  , ALLOC_ORDER bigint comment '引当順序'
  , LOT_REVERSE_FLG char(1) default '0' comment 'ロット逆転防止フラグ'
  , LIMIT_DT_REVERSE_FLG char(1) default '0' comment '期限日逆転防止フラグ'
  , SHIPPING_STOP_FLG char(1) default '0' comment '出荷停止フラグ'
  , DELIV_CUSTOMER_ID bigint comment '届先ID'
  , ACCOUNT_FLG char(1) comment '得意先フラグ'
  , CENTER_ID bigint comment 'センタID'
  , SALES_ORG_ID bigint comment '販売組織ID'
  , LOT_SPLIT_TYPE_CD char(1) default '0' comment 'ロット割れ区分'
  , LIMIT_DT_SPLIT_TYPE_CD char(1) default '0' comment '期限日割れ区分'
  , PROD_DT_SPLIT_TYPE_CD char(1) default '0' comment '製造日割れ区分'
  , LOT_UNMATCH_TYPE_CD char(1) default '0' comment 'ロット不一致区分'
  , LIMIT_DT_UNMATCH_TYPE_CD char(1) default '0' comment '期限日不一致区分'
  , PROD_DT_UNMATCH_TYPE_CD char(1) default '0' comment '製造日不一致区分'
  , UNI_CUSTOMER_CD varchar(30) comment '統合取引先CD'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint M_CUSTOMER_PK primary key (CUSTOMER_ID)
) comment '取引先マスタ' ;

create unique index M_CUSTOMER_IX1
  on M_CUSTOMER(CLIENT_ID,CUSTOMER_CD);

create index M_CUSTOMER_IX2
  on M_CUSTOMER(DELIV_CUSTOMER_ID);

create index M_CUSTOMER_IX3
  on M_CUSTOMER(CUSTOMER_CD);

-- 指定取引先ピッキングマスタ
create table M_CUSTOMER_PICKING (
  CUSTOMER_PICKING_ID bigint not null comment '指定取引先ピッキングID'
  , CENTER_ID bigint not null comment 'センタID'
  , CENTER_CD varchar(30) comment 'センタCD'
  , SALES_ORG_ID bigint not null comment '販売組織ID'
  , SALES_ORG_CD varchar(30) comment '販売組織CD'
  , CUSTOMER_ID bigint comment '取引先ID'
  , CUSTOMER_CD varchar(30) comment '取引先CD'
  , PICK_PATTERN_CD varchar(30) comment 'ピックパターンCD'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint M_CUSTOMER_PICKING_PK primary key (CUSTOMER_PICKING_ID)
) comment '指定取引先ピッキングマスタ' ;

-- 初期データ取込種別マスタ
create table M_DATA_INPUT_TYPE (
  DATA_INPUT_TYPE_ID bigint not null comment '初期データ取込種別ID'
  , DATA_INPUT_TYPE_CD varchar(30) not null comment '初期データ取込種別CD'
  , DATA_INPUT_TYPE_NM varchar(60) not null comment '初期データ取込種別名称'
  , CHARACTER_CD varchar(30) comment '文字コード'
  , LINE_FEED_CD varchar(30) comment '改行コード'
  , DELIMITER varchar(30) comment '区切り文字'
  , SKIPPING_ROWS bigint comment '読み飛ばし行数'
  , UPLOAD_TABLE_NM varchar(100) not null comment 'アップロードテーブル名'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint M_DATA_INPUT_TYPE_PK primary key (DATA_INPUT_TYPE_ID)
) comment '初期データ取込種別マスタ' ;

create index M_DATA_INPUT_TYPE_IX1
  on M_DATA_INPUT_TYPE(DATA_INPUT_TYPE_CD);

-- 初期データ取込種別ボディマスタ
create table M_DATA_INPUT_TYPE_B (
  DATA_INPUT_TYPE_B_ID bigint not null comment '初期データ取込種別ボディID'
  , DATA_INPUT_TYPE_ID bigint not null comment '初期データ取込種別ID'
  , COL_NO bigint comment '列番号'
  , COL_NM varchar(60) comment '列名称'
  , UPLOAD_COLUMN_NM varchar(100) comment 'アップロード列名'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint M_DATA_INPUT_TYPE_B_PK primary key (DATA_INPUT_TYPE_B_ID)
) comment '初期データ取込種別ボディマスタ' ;

create index M_DATA_INPUT_TYPE_B_IX1
  on M_DATA_INPUT_TYPE_B(DATA_INPUT_TYPE_ID);

-- 配送コースマスタ
create table M_DELIVERY_COURSE (
  DELIVERY_COURSE_ID bigint not null comment '配送コースID'
  , CENTER_ID bigint not null comment 'センタID'
  , DELIVERY_COURSE_CD varchar(30) not null comment '配送コースCD'
  , DELIVERY_COURSE_NM varchar(60) not null comment '配送コース名称'
  , CARRIER_ID bigint not null comment '運送業者ID'
  , PICKING_TIME varchar(60) comment '出庫開始時刻'
  , STOWAGE_TIME varchar(60) comment '積込予定時刻'
  , SHIPPING_TIME varchar(60) comment '出荷予定時刻'
  , CARRIER_SLIP_YMT_ID bigint comment 'ヤマト送り状定義ID'
  , CARRIER_SLIP_SGW_ID bigint comment '佐川送り状定義ID'
  , CARRIER_SLIP_YUPK_ID bigint comment 'ゆうパック送り状定義ID'
  , TRACKING_NUMBERING_KEY varchar(30) comment '追跡番号採番キー'
  , TRACKING_NUMBERING_AFTER_KEY varchar(30) comment '追跡番号採番キー(代引時、2枚目以降)'
  , TRACKING_NUMBERING_UNIT varchar(30) comment '追跡番号採番単位'
  , TAG_TYPE varchar(30) comment '送り状種別'
  , TAG_TYPE_AFTER varchar(30) comment '送り状種別(代引時、2枚目以降)'
  , TAG_DATA_TYPE varchar(30) comment '送り状データ種別'
  , PAYMENT_TERM varchar(30) comment 'Payment Term'
  , CARRIER_TYPE_CD varchar(30) comment '運送会社区分'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint M_DELIVERY_COURSE_PK primary key (DELIVERY_COURSE_ID)
) comment '配送コースマスタ' ;

create unique index M_DELIVERY_COURSE_IX1
  on M_DELIVERY_COURSE(CENTER_ID,DELIVERY_COURSE_CD);

create index M_DELIVERY_COURSE_IX2
  on M_DELIVERY_COURSE(CARRIER_ID);

create index M_DELIVERY_COURSE_IX3
  on M_DELIVERY_COURSE(DELIVERY_COURSE_CD);

create index M_DELIVERY_COURSE_IX4
  on M_DELIVERY_COURSE(CARRIER_SLIP_YMT_ID);

create index M_DELIVERY_COURSE_IX5
  on M_DELIVERY_COURSE(CARRIER_SLIP_SGW_ID);

create index M_DELIVERY_COURSE_IX6
  on M_DELIVERY_COURSE(CARRIER_SLIP_YUPK_ID);

-- 預り商品マスタ
create table M_DEPOSIT_PRODUCT (
  DEPOSIT_PRODUCT_ID bigint not null comment '預り商品ID'
  , SALES_ORG_ID bigint not null comment '販売組織ID'
  , ACCOUNT_ID bigint comment '得意先ID'
  , ACCOUNT_CD varchar(30) comment '得意先CD'
  , PRODUCT_ID bigint not null comment '商品ID'
  , DEPOSIT_JAN_CD varchar(30) comment '預りJANCD'
  , ID_MANAG_TYPE_CD varchar(30) comment '個体管理区分'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint M_DEPOSIT_PRODUCT_PK primary key (DEPOSIT_PRODUCT_ID)
) comment '預り商品マスタ' ;

-- EDIマスタ
create table M_EDI (
  EDI_ID bigint not null comment 'EDIID'
  , EDI_NM varchar(60) comment 'EDI名称'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint M_EDI_PK primary key (EDI_ID)
) comment 'EDIマスタ' ;

-- EDI項目マスタ
create table M_EDI_COLUMN (
  EDI_COLUMN_ID bigint not null comment 'EDI項目ID'
  , EDI_ID bigint comment 'EDIID'
  , EDI_COLUMN_NM varchar(255) comment 'EDI項目名'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint M_EDI_COLUMN_PK primary key (EDI_COLUMN_ID)
) comment 'EDI項目マスタ' ;

create index M_EDI_COLUMN_IX1
  on M_EDI_COLUMN(EDI_ID);

-- 汎用マスタ
create table M_GENERAL (
  GENERAL_ID bigint not null comment '汎用マスタID'
  , CENTER_ID bigint not null comment 'センタID'
  , CENTER_CD varchar(100) comment 'センタCD'
  , GENERAL_MASTER_TYPE varchar(30) comment '汎用マスタ区分'
  , GENERAL_MASTER_TYPE_NM varchar(60) comment '汎用マスタ区分名称'
  , GENERAL_CD varchar(30) comment '汎用CD'
  , GENERAL_NM varchar(60) comment '汎用名称'
  , GENERAL_ABBR varchar(60) comment '汎用略称'
  , CHARACTER1 varchar(100) comment 'キャラクタ１'
  , CHARACTER2 varchar(100) comment 'キャラクタ２'
  , CHARACTER3 varchar(100) comment 'キャラクタ３'
  , CHARACTER4 varchar(100) comment 'キャラクタ４'
  , CHARACTER5 varchar(100) comment 'キャラクタ５'
  , CHARACTER6 varchar(100) comment 'キャラクタ６'
  , CHARACTER7 varchar(100) comment 'キャラクタ７'
  , CHARACTER8 varchar(100) comment 'キャラクタ８'
  , CHARACTER9 varchar(100) comment 'キャラクタ９'
  , CHARACTER10 varchar(100) comment 'キャラクタ１０'
  , NUM1 decimal(14,4) default 0 comment 'ナンバー１'
  , NUM2 decimal(14,4) default 0 comment 'ナンバー２'
  , NUM3 decimal(14,4) default 0 comment 'ナンバー３'
  , NUM4 decimal(14,4) default 0 comment 'ナンバー４'
  , NUM5 decimal(14,4) default 0 comment 'ナンバー５'
  , NUM6 decimal(14,4) default 0 comment 'ナンバー６'
  , NUM7 decimal(14,4) default 0 comment 'ナンバー７'
  , NUM8 decimal(14,4) default 0 comment 'ナンバー８'
  , NUM9 decimal(14,4) default 0 comment 'ナンバー９'
  , NUM10 decimal(14,4) default 0 comment 'ナンバー１０'
  , COMMENT1 varchar(255) comment 'コメント１'
  , COMMENT2 varchar(255) comment 'コメント２'
  , DEFAULT_TYPE varchar(30) comment 'デフォルト区分'
  , SYSTEM_TYPE varchar(30) comment 'システム区分'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint M_GENERAL_PK primary key (GENERAL_ID)
) comment '汎用マスタ' ;

create unique index M_GENERAL_IX1
  on M_GENERAL(GENERAL_MASTER_TYPE,GENERAL_CD,CENTER_ID);

-- 休日祝日マスタ
create table M_HOLIDAY (
  HOLIDAY_ID bigint not null comment '休日祝日ID'
  , BASE_CD varchar(30) comment '拠点CD'
  , CALENDER_DT varchar(8) comment 'カレンダー日付'
  , HOLIDAY_FLG char(1) default '0' not null comment '休日フラグ'
  , NATIONAL_HOLIDAY_FLG char(1) default '0' not null comment '祝日フラグ'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint M_HOLIDAY_PK primary key (HOLIDAY_ID)
) comment '休日祝日マスタ' ;

-- HT辞書マスタ
create table M_HT_DICT (
  DICT_ID bigint not null comment '辞書ID'
  , DICT_NM varchar(100) not null comment '辞書名'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint M_HT_DICT_PK primary key (DICT_ID)
) comment 'HT辞書マスタ' ;

-- HT辞書カルチャマスタ
create table M_HT_DICT_CULTURE (
  DICT_CULTURE_ID bigint not null comment '辞書カルチャID'
  , DICT_NM varchar(100) not null comment '辞書名'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint M_HT_DICT_CULTURE_PK primary key (DICT_CULTURE_ID)
) comment 'HT辞書カルチャマスタ' ;

-- HTメッセージマスタ
create table M_HT_MESSAGE (
  MESSAGE_ID bigint not null comment 'メッセージID'
  , MESSAGE_NM varchar(255) comment 'メッセージ'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint M_HT_MESSAGE_PK primary key (MESSAGE_ID)
) comment 'HTメッセージマスタ' ;

-- 取込種別マスタ
create table M_IMPORT_TYPE (
  IMPORT_TYPE_ID bigint not null comment '取込種別ID'
  , CLIENT_ID bigint not null comment '荷主ID'
  , IMPORT_TYPE_CD varchar(30) not null comment '取込種別CD'
  , IMPORT_TYPE_NM varchar(60) not null comment '取込種別名称'
  , EDI_ID bigint comment 'EDIID'
  , CHARACTER_CD varchar(30) comment '文字コード'
  , LINE_FEED_CD varchar(30) comment '改行コード'
  , DELIMITER varchar(30) comment '区切り文字'
  , SKIPPING_ROWS bigint default 0 comment '読み飛ばし行数'
  , UPLOAD_TABLE_NM varchar(100) comment 'アップロードテーブル名'
  , DUPLICATE_COLUMN_NM varchar(30) comment '重複チェック列名'
  , RCV_ID_COLUMN_NM varchar(30) comment '受信ID列名'
  , ROW_NO_COLUMN_NM varchar(30) comment '行番号列名'
  , GIFT_STATEMENT_TYPE varchar(30) default '0' not null comment 'ギフト用納品書種類'
  , GIFT_STATEMENT_DETAIL varchar(255) comment '納品書明細置換え文字列'
  , O_KEEPING_DAYS bigint not null comment '受注保持期間'
  , STATEMENT_TITLE varchar(255) comment '納品書タイトル'
  , STATEMENT_URL varchar(255) comment '納品書記載URL'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint M_IMPORT_TYPE_PK primary key (IMPORT_TYPE_ID)
) comment '取込種別マスタ' ;

create unique index M_IMPORT_TYPE_IX1
  on M_IMPORT_TYPE(CLIENT_ID,IMPORT_TYPE_CD);

create index M_IMPORT_TYPE_IX2
  on M_IMPORT_TYPE(EDI_ID);

create index M_IMPORT_TYPE_IX3
  on M_IMPORT_TYPE(IMPORT_TYPE_CD);

-- 取込種別ボディマスタ
create table M_IMPORT_TYPE_B (
  IMPORT_TYPE_B_ID bigint not null comment '取込種別ボディID'
  , IMPORT_TYPE_ID bigint comment '取込種別ID'
  , COLUMN_NO bigint comment '列番号'
  , EDI_COLUMN_ID bigint comment 'EDI項目ID'
  , UPLOAD_COLUMN_NM varchar(100) comment 'アップロード列名'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint M_IMPORT_TYPE_B_PK primary key (IMPORT_TYPE_B_ID)
) comment '取込種別ボディマスタ' ;

create index M_IMPORT_TYPE_B_IX1
  on M_IMPORT_TYPE_B(IMPORT_TYPE_ID);

create index M_IMPORT_TYPE_B_IX2
  on M_IMPORT_TYPE_B(EDI_COLUMN_ID);

-- EC受注ボディコピーマスタ
create table M_IMPORT_TYPE_B_COPY_B (
  IMPORT_TYPE_B_COPY_B_ID bigint not null comment 'EC受注ボディコピーID'
  , IMPORT_TYPE_B_ID bigint comment '取込種別ボディID'
  , COPY_B_COLUMN_NM varchar(100) comment 'EC受注ボディコピー列名'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint M_IMPORT_TYPE_B_COPY_B_PK primary key (IMPORT_TYPE_B_COPY_B_ID)
) comment 'EC受注ボディコピーマスタ' ;

create index M_IMPORT_TYPE_B_COPY_B_IX1
  on M_IMPORT_TYPE_B_COPY_B(IMPORT_TYPE_B_ID);

-- EC受注ヘッダコピーマスタ
create table M_IMPORT_TYPE_B_COPY_H (
  IMPORT_TYPE_B_COPY_H_ID bigint not null comment 'EC受注ヘッダコピーマスタID'
  , IMPORT_TYPE_B_ID bigint comment '取込種別ボディID'
  , COPY_H_COLUMN_NM varchar(100) comment 'EC受注ヘッダコピー列名'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint M_IMPORT_TYPE_B_COPY_H_PK primary key (IMPORT_TYPE_B_COPY_H_ID)
) comment 'EC受注ヘッダコピーマスタ' ;

create index M_IMPORT_TYPE_B_COPY_H_IX1
  on M_IMPORT_TYPE_B_COPY_H(IMPORT_TYPE_B_ID);

-- 戸口配送マスタ
create table M_KOGUCHI_DELIVERY (
  KOGUCHI_DELIVERY_ID bigint not null comment '戸口配送ID'
  , BASE_CD varchar(30) comment '拠点CD'
  , SERV_SALES_ORG_ID bigint comment '取扱販売組織ID'
  , SERV_SALES_ORG_CD varchar(100) comment '取扱販売組織CD'
  , SERV_SALES_ORG_NM varchar(60) comment '取扱販売組織名称'
  , DIRECT_FLG char(1) comment '直送フラグ'
  , URGENT_FLG char(1) comment '緊急フラグ'
  , DELIVERY_FLG char(1) comment '納品フラグ'
  , KOGUCHI_DELIVERY_CD varchar(30) comment '戸口配送先CD'
  , KOGUCHI_DELIVERY_NM varchar(60) comment '戸口配送先名称'
  , UNI_DELIVERY_CD varchar(30) comment '統合配送先CD'
  , UNI_DELIVERY_NM varchar(60) comment '統合配送先名称'
  , FW_TYPE_CD varchar(30) comment 'FW区分'
  , MCA_TYPE_CD varchar(30) comment 'MCA区分'
  , YOUHIN_TYPE_CD varchar(30) comment '用品区分'
  , CARRIER_ID bigint comment '運送業者ID'
  , REQ_SALES_ORG_ID bigint comment '依頼元販売組織ID'
  , REQ_SALES_ORG_CD varchar(30) comment '依頼元販売組織CD'
  , REQ_SALES_ORG_NM varchar(60) comment '依頼元販売組織名称'
  , REQ_SALES_ORG_BRANCH_NM varchar(60) comment '依頼元販売組織支店名称'
  , REQ_SALES_ORG_ADDRESS1 varchar(255) comment '依頼元販売組織住所１'
  , REQ_SALES_ORG_ADDRESS2 varchar(255) comment '依頼元販売組織住所２'
  , REQ_SALES_ORG_ZIP_CD varchar(30) comment '依頼元販売組織郵便番号'
  , REQ_SALES_ORG_TEL_NO varchar(30) comment '依頼元販売組織電話番号'
  , REQ_SALES_ORG_FAX_NO varchar(30) comment '依頼元販売組織FAX番号'
  , REMARK1 varchar(255) comment '物品送付下部備考項目1'
  , REMARK2 varchar(255) comment '物品送付下部備考項目2'
  , REMARK3 varchar(255) comment '物品送付下部備考項目3'
  , REMARK4 varchar(255) comment '物品送付下部備考項目4'
  , INDV_OUT varchar(30) comment '個別出力'
  , INVOICE_SUMMARY varchar(255) comment '送り状摘要'
  , PSAM varchar(30) comment 'PSAM'
  , ABOLISH_DT varchar(8) comment '廃止日'
  , FLOOR_COMP_FLG char(1) comment 'フロア完結フラグ'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint M_KOGUCHI_DELIVERY_PK primary key (KOGUCHI_DELIVERY_ID)
) comment '戸口配送マスタ' ;

-- ロケーションマスタ
create table M_LOCATION (
  LOCATION_ID bigint not null comment 'ロケーションID'
  , CENTER_ID bigint not null comment 'センタID'
  , ZONE_ID bigint not null comment 'ゾーンID'
  , LOCATION_CD varchar(30) not null comment 'ロケーションCD'
  , LOCATION_NM varchar(60) comment 'ロケーション名称'
  , PICKING_LOCATION_FLG char(1) default '1' not null comment 'ピックロケフラグ'
  , PICKING_ORDER bigint comment 'ピッキング順序'
  , LOCATION_TYPE varchar(30) comment 'ロケーション種別'
  , ALLOC_ORDER bigint comment '引当順序'
  , ALLOC_NG_FLG char(1) default '0' not null comment '引当禁止フラグ'
  , REPLENISH_PRODUCT_ID bigint comment '補充商品(不使用)'
  , REPLENISH_STOCK_TYPE_ID bigint comment '補充在庫区分ID'
  , REPLENISH_DEPOSIT_ID bigint comment '補充預託ID'
  , REPLENISH_P_NUM decimal(14,4) comment '補充点'
  , REPLENISH_P_PRODUCT_SHAPE_ID bigint comment '補充点商品荷姿ID'
  , MAX_STORE_NUM decimal(14,4) comment '最大格納数'
  , MAX_STORE_PRODUCT_SHAPE_ID bigint comment '最大格納数商品荷姿ID'
  , EXTERNAL_WH_FLG char(1) default '0' not null comment '外部倉庫フラグ'
  , LOCATION_ATTRIBUTE varchar(30) comment 'ロケーション属性'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint M_LOCATION_PK primary key (LOCATION_ID)
) comment 'ロケーションマスタ' ;

create unique index M_LOCATION_IX1
  on M_LOCATION(CENTER_ID,LOCATION_CD);

create index M_LOCATION_IX2
  on M_LOCATION(ZONE_ID);

create index M_LOCATION_IX3
  on M_LOCATION(REPLENISH_PRODUCT_ID);

create index M_LOCATION_IX4
  on M_LOCATION(REPLENISH_STOCK_TYPE_ID);

create index M_LOCATION_IX5
  on M_LOCATION(REPLENISH_DEPOSIT_ID);

create index M_LOCATION_IX6
  on M_LOCATION(REPLENISH_P_PRODUCT_SHAPE_ID);

create index M_LOCATION_IX7
  on M_LOCATION(MAX_STORE_PRODUCT_SHAPE_ID);

create index M_LOCATION_IX8
  on M_LOCATION(LOCATION_CD);

-- ロケーション補充商品マスタ
create table M_LOCATION_REPLENISH_PRODUCT (
  LOCATION_REPLENISH_PRODUCT_ID bigint not null comment 'ロケーション補充商品ID'
  , LOCATION_ID bigint not null comment 'ロケーションID'
  , REPLENISH_PRODUCT_ID bigint not null comment '補充商品ID'
  , REPLENISH_DEPOSIT_ID bigint comment '補充預託ID'
  , REPLENISH_P_NUM bigint comment '補充点'
  , MAX_STORE_PRODUCT_SHAPE_ID bigint not null comment '最大格納数商品荷姿ID'
  , MAX_STORE_NUM bigint comment '最大格納数'
  , REPLENISH_STOCK_TYPE_ID bigint comment '補充在庫区分ID'
  , REPLENISH_P_PRODUCT_SHAPE_ID bigint comment '補充点商品荷姿ID'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint M_LOCATION_REPLENISH_PRODUCT_PK primary key (LOCATION_REPLENISH_PRODUCT_ID)
) comment 'ロケーション補充商品マスタ' ;

-- マッチングマスタ
create table M_MATCHING (
  MATCHING_ID bigint not null comment 'マッチングID'
  , MATCHING_TYPE varchar(30) not null comment 'マッチング種類'
  , MATCHING_KEYWORD varchar(100) not null comment 'マッチングキーワード'
  , TRANSFORM_CD varchar(100) not null comment '変換CD'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint M_MATCHING_PK primary key (MATCHING_ID)
) comment 'マッチングマスタ' ;

create unique index M_MATCHING_IX1
  on M_MATCHING(MATCHING_TYPE,MATCHING_KEYWORD);

-- 荷揃マスタ
create table M_NIZOROE (
  NIZOROE_ID bigint not null comment '荷揃ID'
  , CENTER_ID bigint not null comment 'センタID'
  , BASE_CD varchar(30) comment '拠点CD'
  , NIZOROE_PATERN_ID bigint comment '荷揃パターンID'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint M_NIZOROE_PK primary key (NIZOROE_ID)
) comment '荷揃マスタ' ;

-- 荷揃パターンマスタ
create table M_NIZOROE_PATERN (
  NIZOROE_PATERN_ID bigint not null comment '荷揃パターンID'
  , NIZOROE_TYPE_CD varchar(30) comment '荷揃区分'
  , NIZOROE_PROC_ID varchar(30) not null comment '荷揃処理ID'
  , NIZOROE_PROC_NM varchar(60) comment '荷揃処理名称'
  , PROGRAM_ID varchar(60) comment 'プログラムID'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint M_NIZOROE_PATERN_PK primary key (NIZOROE_PATERN_ID)
) comment '荷揃パターンマスタ' ;

create unique index M_NIZOROE_PATERN_IX1
  on M_NIZOROE_PATERN(NIZOROE_PROC_ID);

-- センタ採番マスタ
create table M_NUMBERING_CENTER (
  NUMBERING_CENTER_ID bigint not null comment 'センタ採番ID'
  , CENTER_ID bigint not null comment 'センタID'
  , BIZ_CD varchar(30) not null comment '業務CD'
  , BIZ_NM varchar(60) not null comment '業務名称'
  , LENGTH bigint not null comment '桁数'
  , FIXED_VALUE varchar(30) comment '固定値'
  , FIXED_DT_FORMAT varchar(30) comment '固定日付フォーマット'
  , PRESENT_NUMBER bigint not null comment '現在値'
  , INC_NUMBER bigint not null comment '増分値'
  , MIN_NUMBER bigint not null comment '最小値'
  , MAX_NUMBER bigint not null comment '最大値'
  , CHECK_DIGIT varchar(30) comment 'チェックディジット'
  , CASH_COUNT bigint default 0 comment 'キャッシュ数'
  , USER_EDITABLE char(1) comment 'ユーザ編集可否'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint M_NUMBERING_CENTER_PK primary key (NUMBERING_CENTER_ID)
) comment 'センタ採番マスタ' ;

create unique index M_NUMBERING_CENTER_IX1
  on M_NUMBERING_CENTER(CENTER_ID,BIZ_CD);

-- パラメータマスタ
create table M_PARAM (
  CLIENT_CENTER_ID bigint not null comment '荷主センタID'
  , DELIVERY_COURSE_ID bigint comment '配送コースID'
  , STORE_DT_FLG char(1) default '0' comment '入庫日管理フラグ'
  , STORE_NO_FLG char(1) default '0' not null comment '入庫No.管理フラグ'
  , MERGE_CLS varchar(30) default '02' not null comment '入庫No.マージ区分'
  , T_KEEPING_DAYS bigint default 0 not null comment 'トランザクション保持期間'
  , H_KEEPING_DAYS bigint default 0 not null comment '履歴保持期間'
  , D_KEEPING_DAYS bigint default 0 not null comment '削除保持期間'
  , OVER_STORE_NUM_FLG char(1) default '0' comment 'HT/SD過入荷可フラグ'
  , PAST_STORE_DT_FLG char(1) default '0' comment 'HT/SD過去日入力可フラグ'
  , USE_HT_SHIP_FLG char(1) default '0' not null comment '出荷時HT/SD使用フラグ'
  , ALLOC_SORT_KEY varchar(100) comment '引当ソートキー'
  , RG_REPLENISH_UNIT_CLS varchar(30) default '1' comment '定期補充単位区分'
  , EM_REPLENISH_UNIT_CLS varchar(30) default '0' comment '緊急補充単位区分'
  , EM_REPLENISH_ZONE_ID bigint comment '緊急補充ゾーンID'
  , EM_REPLENISH_ALLOC_CLS varchar(30) comment '緊急補充ロケ割付区分'
  , PACKING_CAL_CLS varchar(30) default '0' comment '梱包計算処理区分'
  , PACKING_PROCESS_CLS varchar(30) default '0' comment '詰め込み方'
  , PRODUCT_PART_PACKING varchar(30) default '0' comment '商品毎別梱包'
  , DECIMAL_PRODUCT_PACKING varchar(30) comment '小数管理商品梱包単位'
  , PACKING_BOX_GROUP_ID bigint comment '梱包荷材グループID'
  , TOTAL_PIC_FLG char(1) default '1' not null comment 'トータルピックフラグ'
  , MULTI_PIC_CLS varchar(30) default '0' not null comment 'マルチピック計算区分'
  , BACKET_COL_NUM bigint default 0 comment 'バケット列数'
  , BACKET_ROW_NUM bigint default 0 comment 'バケット段数'
  , CASE_PIC_FLG char(1) default '0' comment 'ケースピックフラグ'
  , SGL_ROW_PIC_FLG char(1) default '0' not null comment '単行ピックフラグ'
  , SGL_ROW_PIC_MAX_INST_NUM bigint comment '単行ピック上限指示数'
  , PIC_MTHD_RCMD_FLG char(1) default '0' not null comment '最適ピック提案フラグ'
  , PIC_MTHD_RCMD_BREAK_KEY varchar(30) comment '最適ピック提案ブレイクキー'
  , PIC_MTHD_RCMD_API_KEY varchar(255) comment '最適ピック提案APIキー'
  , PIC_MTHD_RCMD_MLT_PL_OUT char(1) comment '最適ピック提案マルチピック摘み取りリスト出力フラグ'
  , PIC_MTHD_RCMD_SPL_SL_OUT char(1) comment '最適ピック提案単行ピック種蒔きリスト出力フラグ'
  , PRODUCT_LABEL_OUT_UNIT char(1) comment '商品ラベル出力単位'
  , RESULT_AFTER_PRODUCT_LABEL char(1) comment '実績入力後入庫/商品ラベル出力フラグ'
  , RESULT_AFTER_PRODUCT_TARGET char(1) comment '実績入力後入庫/商品ラベル出力対象'
  , PRODUCT_LABEL_JAN_BARCODE varchar(30) comment '商品ラベルJANCDバーコード種別'
  , PRODUCT_LABEL_PROD_BARCODE varchar(30) comment '商品ラベル商品CDバーコード種別'
  , PRODUCT_LABEL_JAN_STARTBIT varchar(30) comment '商品ラベルバーコードJANCDスタートビット'
  , PRODUCT_LABEL_JAN_ENDBIT varchar(30) comment '商品ラベルバーコードJANCDエンドビット'
  , PRODUCT_LABEL_PROD_STARTBIT varchar(30) comment '商品ラベルバーコード商品CDスタートビット'
  , PRODUCT_LABEL_PROD_ENDBIT varchar(30) comment '商品ラベルバーコード商品CDエンドビット'
  , BOX_SELECT_SKIP char(1) comment '荷材選択スキップ'
  , DEFAULT_BOX_ID bigint comment 'デフォルト荷材ID'
  , ERROR_SOUND_PLAY_FLG char(1) default '1' not null comment 'エラー音再生フラグ'
  , WARN_SOUND_PLAY_FLG char(1) default '1' not null comment '警告音再生フラグ'
  , INSP_SOUND_PLAY_FLG char(1) default '1' not null comment '検品音再生フラグ'
  , INSP_COMP_SOUND_PLAY_FLG char(1) default '1' not null comment '検品完了音再生フラグ'
  , AFTER_TAG_OUT_FLG char(1) default '1' not null comment '検品後荷札出力フラグ'
  , TAG_DELIVERY_OUT_FLG char(1) comment '荷札納品書在中出力フラグ'
  , AFTER_DELIV_SLIP_OUT_FLG char(1) default '1' not null comment '検品後納品明細出力フラグ'
  , AFTER_DELIV_SLIP_OUT_TGT char(1) comment '検品後納品明細出力対象'
  , SGL_ROW_INSP_AFTER_OUT_CLS varchar(30) comment '単行出荷検品荷札/納品明細出力区分'
  , HT_CHAR_READ_FLG char(1) default '0' comment 'HT文字認識使用フラグ'
  , HT_LOT_INPUT_TYPE varchar(30) comment 'HTロット入力方式'
  , HT_SERIAL_INPUT_TYPE varchar(30) comment 'HTシリアル入力方式'
  , INSPECTION_LABEL_OUT_FLG char(1) default '0' comment 'SD検品ラベル出力フラグ'
  , AUTO_SHIP_INST_FLG char(1) default '0' not null comment '自動出庫指示フラグ'
  , STOCK_OUT_AUTO_INST_FLG char(1) comment '欠品時自動出庫指示フラグ'
  , AUTO_EMG_SET_FLG char(1) default '0' not null comment '自動緊急フラグ設定フラグ'
  , AUTO_EMG_SET_TGT varchar(30) comment '自動緊急フラグ判断対象'
  , AUTO_EMG_SET_MINUTE bigint comment '自動緊急フラグ判断時間(分)'
  , STOCK_OUT_INST_CXL_FLG char(1) default '0' not null comment '欠品時出庫指示取消フラグ'
  , STOCK_OUT_ALLOC_CLS varchar(30) default '0' comment '欠品時引当区分'
  , STOCK_OUT_INST_SPLIT_FLG char(1) default '0' comment '欠品時出荷指示分離フラグ'
  , CES_INTEGRATION_FLG char(1) comment 'CES連携フラグ'
  , PACKING_SLIP_AUTO_OUTPUT_FLG char(1) comment '納品明細書自動発行フラグ'
  , RECEIVE_LABEL_FLG char(1) comment '入荷ラベル使用フラグ'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint M_PARAM_PK primary key (CLIENT_CENTER_ID)
) comment 'パラメータマスタ' ;

create index M_PARAM_IX1
  on M_PARAM(DELIVERY_COURSE_ID);

create index M_PARAM_IX2
  on M_PARAM(EM_REPLENISH_ZONE_ID);

create index M_PARAM_IX3
  on M_PARAM(PACKING_BOX_GROUP_ID);

create index M_PARAM_IX4
  on M_PARAM(DEFAULT_BOX_ID);

-- プラント保管場所マスタ
create table M_PLANT_STORAGE_SPACE (
  PLANT_STORAGE_SPACE_ID bigint not null comment 'プラント保管場所ID'
  , OWNER_CD varchar(30) comment '所有者CD'
  , PLANT_CD varchar(30) comment 'プラントCD'
  , STORAGE_SPACE_CD varchar(30) comment '保管場所CD'
  , COMPANY_NM varchar(60) comment '会社名'
  , PLANT_NM varchar(60) comment 'プラント名'
  , STORAGE_SPACE_NM1 varchar(60) comment '保管場所名1'
  , STORAGE_SPACE_NM2 varchar(60) comment '保管場所名2'
  , COUNTRY_NM varchar(60) comment '国'
  , ADDRESS1 varchar(60) comment '都道府県'
  , ZIP_CD varchar(30) comment '郵便番号'
  , ADDRESS2 varchar(60) comment '市区町村'
  , ADDRESS3 varchar(60) comment '所在地'
  , TEL_NO varchar(30) comment '電話番号'
  , FAX_NO varchar(30) comment 'FAX'
  , LANG_NM varchar(60) comment '言語'
  , BASE_CD varchar(30) comment '拠点CD'
  , BASE_TYPE_CD varchar(30) comment '拠点区分'
  , BASE_NM varchar(60) comment '拠点名称'
  , SPARE_STR varchar(255) comment '予備'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint M_PLANT_STORAGE_SPACE_PK primary key (PLANT_STORAGE_SPACE_ID)
) comment 'プラント保管場所マスタ' ;

create index M_PLANT_STORAGE_SPACE_IX1
  on M_PLANT_STORAGE_SPACE(PLANT_STORAGE_SPACE_ID);

-- 処理区分マスタ
create table M_PROCESS_TYPE (
  PROCESS_TYPE_ID bigint not null comment '処理区分ID'
  , PROCESS_TYPE_CD varchar(30) not null comment '処理区分CD'
  , DICT_ID bigint not null comment '辞書ID'
  , RECEIVE_FLG char(1) not null comment '入荷フラグ'
  , SHIPPING_FLG char(1) not null comment '出荷フラグ'
  , STOCK_ADJUST_FLG char(1) not null comment '在庫調整フラグ'
  , DEFAULT_FLG char(1) default '0' comment 'デフォルトフラグ'
  , STOCK_TYPE_ID bigint comment '在庫区分ID'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint M_PROCESS_TYPE_PK primary key (PROCESS_TYPE_ID)
) comment '処理区分マスタ' ;

create unique index M_PROCESS_TYPE_IX1
  on M_PROCESS_TYPE(PROCESS_TYPE_CD);

create index M_PROCESS_TYPE_IX2
  on M_PROCESS_TYPE(STOCK_TYPE_ID);

create index M_PROCESS_TYPE_IX3
  on M_PROCESS_TYPE(DICT_ID);

-- 商品マスタ
create table M_PRODUCT (
  PRODUCT_ID bigint not null comment '商品ID'
  , CLIENT_ID bigint not null comment '荷主ID'
  , PRODUCT_CD varchar(100) not null comment '商品CD'
  , PRODUCT_NM varchar(255) not null comment '商品名称'
  , PRODUCT_ABBR varchar(60) comment '商品略称'
  , JAN_CD varchar(30) comment 'JANCD'
  , LOT_MANAG_FLG char(1) default '0' not null comment 'ロット管理フラグ'
  , LIMIT_DT_MANAG_FLG char(1) default '0' not null comment '期限日管理フラグ'
  , RECEIVE_LIMIT_NUM bigint default 0 comment '入荷期限日数'
  , SHIPPING_LIMIT_NUM bigint default 0 comment '出荷期限日数'
  , MERGE_CLS varchar(30) default '02' not null comment '入庫No.マージ区分'
  , LOT_REVERSE_FLG char(1) default '0' comment 'ロット逆転防止フラグ'
  , LIMIT_DT_REVERSE_FLG char(1) default '0' comment '期限日逆転防止フラグ'
  , SHIPPING_STOP_FLG char(1) default '0' comment '出荷停止フラグ'
  , FIXED_POINT decimal(14,4) comment '定点'
  , SHAPE_GRP_ID bigint comment '荷姿グループID'
  , NMFC_CODE varchar(30) comment 'NMFC Code'
  , FREIGHT_CLS varchar(30) comment 'Freight Class'
  , COUNNTRY_OF_ORIGIN varchar(30) comment 'Country of Origin'
  , UNIT_VAL decimal(14,4) comment 'Unit Value'
  , HTS_CD varchar(30) comment 'Harmonized Code'
  , PRODUCT_CATEGORY_CLS varchar(30) comment '品種区分'
  , PROD_DT_MANAG_FLG char(1) comment '製造日管理フラグ'
  , PROD_DT_LIMIT_DAYS_RCV bigint comment '入荷製造日限界日数'
  , PROD_DT_LIMIT_DAYS_SHP bigint comment '出荷製造日限界日数'
  , SERIAL_MANAG_FLG char(1) comment 'シリアル管理フラグ'
  , OCR_DATE_FORMAT varchar(30) comment 'OCR日付形式'
  , INSURANCE_FLG char(1) comment '保険品フラグ'
  , NO_OKINAWA_FLIGHT_FLG char(1) comment '沖縄航空便不可フラグ'
  , HEAVY_ITEM_FLG char(1) comment '重量フラグ'
  , LARGE_ITEM_FLG char(1) comment '大物フラグ'
  , HINMOKU_GROUP_CD varchar(30) comment '品目グループCD'
  , CASE_TYPE_CD varchar(30) comment 'ケース区分CD'
  , EVALUATION_UNIT_PRICE decimal(14,4) comment '評価単価'
  , LOGI_SPECIAL_TYPE_CD varchar(30) comment '物流特殊区分CD'
  , LOGI_ATTENTION_TYPE_CD varchar(30) comment '物流注意区分CD'
  , UNIT_NM varchar(30) comment '単位名称'
  , OLD_JAN_CD varchar(30) comment '旧JANCD'
  , RECOMEND_LOCATION_CD varchar(30) comment '推奨ロケーションCD'
  , RECOMEND_LOCATION_TYPE_CD varchar(30) comment '推奨ロケーション区分'
  , INNER_JAN_CD varchar(30) comment 'インナーJANCD'
  , CREATE_DATE varchar(8) comment '作成日'
  , CREATE_TIME varchar(6) comment '作成時間'
  , FLOOR_REF_STOCK_NUM decimal(14,4) comment 'フロア基準在庫'
  , WM_SEND_FLG char(1) default '0' comment 'WMS送信済フラグ'
  , LP_SEND_FLG char(1) default '0' comment '物流ポータル送信済フラグ'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint M_PRODUCT_PK primary key (PRODUCT_ID)
) comment '商品マスタ' ;

create unique index M_PRODUCT_IX1
  on M_PRODUCT(CLIENT_ID,PRODUCT_CD);

create index M_PRODUCT_IX2
  on M_PRODUCT(JAN_CD);

create index M_PRODUCT_IX3
  on M_PRODUCT(PRODUCT_CD);

-- 商品荷姿マスタ
create table M_PRODUCT_SHAPE (
  PRODUCT_SHAPE_ID bigint not null comment '商品荷姿ID'
  , PRODUCT_ID bigint not null comment '商品ID'
  , SHAPE_GRP_DTL_ID bigint not null comment '荷姿グループ明細ID'
  , UNIT_NUM bigint comment '入数'
  , LENGTH decimal(14,4) comment '縦(mm)'
  , WIDTH decimal(14,4) comment '横(mm)'
  , HEIGHT decimal(14,4) comment '高さ(mm)'
  , VOLUME decimal(14,4) comment '容積(mm3)'
  , NET_WEIGHT decimal(14,4) comment '商品重量(g)'
  , GROSS_WEIGHT decimal(14,4) comment '総重量(g)'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint M_PRODUCT_SHAPE_PK primary key (PRODUCT_SHAPE_ID)
) comment '商品荷姿マスタ' ;

create unique index M_PRODUCT_SHAPE_IX1
  on M_PRODUCT_SHAPE(PRODUCT_ID,SHAPE_GRP_DTL_ID);

create index M_PRODUCT_SHAPE_IX2
  on M_PRODUCT_SHAPE(PRODUCT_ID);

create index M_PRODUCT_SHAPE_IX3
  on M_PRODUCT_SHAPE(SHAPE_GRP_DTL_ID);

-- 販売組織マスタ
create table M_SALES_ORG (
  SALES_ORG_ID bigint not null comment '販売組織ID'
  , SALES_ORG_CD varchar(30) comment '販売組織CD'
  , PURCHASE_ORG_CD varchar(30) comment '購買組織CD'
  , TENHANSHA_CD varchar(30) comment '店販社CD'
  , TENHANSHA_NM1 varchar(60) comment '店販社名称１'
  , TENHANSHA_NM2 varchar(60) comment '店販社名称２'
  , TENHANSHA_ZIP_CD varchar(30) comment '店販社郵便番号'
  , TENHANSHA_PREFECTURE varchar(60) comment '店販社都道府県'
  , TENHANSHA_ADDRESS1 varchar(60) comment '店販社住所１'
  , TENHANSHA_ADDRESS2 varchar(60) comment '店販社住所２'
  , TENHANSHA_TEL_NO varchar(30) comment '店販社電話番号'
  , TENHANSHA_FAX_NO varchar(30) comment '店販社ＦＡＸ番号'
  , PLANT_NORMAL varchar(30) comment 'プラント_通常品'
  , PLANT_DEPOSIT varchar(30) comment 'プラント_預かり品'
  , LP_SEND_FLG char(1) default '0' comment '物流ポータル送信済フラグ'
  , WMS_SEND_FLG char(1) default '0' comment 'WMS送信済フラグ'
  , SPARE_STR varchar(255) comment '予備'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint M_SALES_ORG_PK primary key (SALES_ORG_ID)
) comment '販売組織マスタ' ;

create unique index M_SALES_ORG_IX1
  on M_SALES_ORG(SALES_ORG_CD);

-- セット品親マスタ
create table M_SET_PARENT (
  SET_PARENT_ID bigint not null comment '親ID'
  , PRODUCT_ID bigint not null comment '商品ID'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint M_SET_PARENT_PK primary key (SET_PARENT_ID)
) comment 'セット品親マスタ' ;

create unique index M_SET_PARENT_IX1
  on M_SET_PARENT(PRODUCT_ID);

-- セット品構成マスタ
create table M_SET_STRUCTURE (
  SET_STRUCTURE_ID bigint not null comment '構成ID'
  , SET_PARENT_ID bigint not null comment '親ID'
  , PRODUCT_ID bigint not null comment '商品ID'
  , UNIT_NUM bigint comment '入数'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint M_SET_STRUCTURE_PK primary key (SET_STRUCTURE_ID)
) comment 'セット品構成マスタ' ;

create unique index M_SET_STRUCTURE_IX1
  on M_SET_STRUCTURE(SET_PARENT_ID,PRODUCT_ID);

create index M_SET_STRUCTURE_IX2
  on M_SET_STRUCTURE(PRODUCT_ID);

create index M_SET_STRUCTURE_IX3
  on M_SET_STRUCTURE(SET_PARENT_ID);

-- 荷姿マスタ
create table M_SHAPE (
  SHAPE_ID bigint not null comment '荷姿ID'
  , SHAPE_CD varchar(30) not null comment '荷姿CD'
  , SHAPE_DICT_ID bigint not null comment '荷姿名称辞書ID'
  , SHAPE_UNIT_DICT_ID bigint not null comment '荷姿単位辞書ID'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint M_SHAPE_PK primary key (SHAPE_ID)
) comment '荷姿マスタ' ;

create unique index M_SHAPE_IX1
  on M_SHAPE(SHAPE_CD);

create index M_SHAPE_IX2
  on M_SHAPE(SHAPE_DICT_ID);

create index M_SHAPE_IX3
  on M_SHAPE(SHAPE_UNIT_DICT_ID);

-- 荷姿グループマスタ
create table M_SHAPE_GRP (
  SHAPE_GRP_ID bigint not null comment '荷姿グループID'
  , CLIENT_ID bigint not null comment '荷主ID'
  , SHAPE_GRP_CD varchar(30) not null comment '荷姿グループCD'
  , SHAPE_GRP_NAME varchar(255) not null comment '荷姿グループ名称'
  , DECIMAL_EXIST_FLG char(1) not null comment '小数有無フラグ'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint M_SHAPE_GRP_PK primary key (SHAPE_GRP_ID)
) comment '荷姿グループマスタ' ;

create index M_SHAPE_GRP_IX1
  on M_SHAPE_GRP(CLIENT_ID,SHAPE_GRP_CD);

-- 荷姿グループ明細マスタ
create table M_SHAPE_GRP_DTL (
  SHAPE_GRP_DTL_ID bigint not null comment '荷姿グループ明細ID'
  , SHAPE_GRP_ID bigint not null comment '荷姿グループID'
  , SHAPE_ID bigint not null comment '荷姿ID'
  , GTIN14_SYMBOL bigint default 1 comment 'GTIN14シンボル'
  , CASE_PICK_FLG char(1) comment 'ケースピッキング対象'
  , SHAPE_SORT bigint not null comment '荷姿ソート順'
  , EM_REPLENISH_SHAPE_FLG char(1) comment '緊急補充ゾーン補充荷姿'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint M_SHAPE_GRP_DTL_PK primary key (SHAPE_GRP_DTL_ID)
) comment '荷姿グループ明細マスタ' ;

create index M_SHAPE_GRP_DTL_IX1
  on M_SHAPE_GRP_DTL(SHAPE_GRP_ID);

create index M_SHAPE_GRP_DTL_IX2
  on M_SHAPE_GRP_DTL(SHAPE_ID);

-- 在庫区分マスタ
create table M_STOCK_TYPE (
  STOCK_TYPE_ID bigint not null comment '在庫区分ID'
  , STOCK_TYPE_CD varchar(30) not null comment '在庫区分CD'
  , DICT_ID bigint not null comment '辞書ID'
  , REVERSE_VALID_FLG char(1) comment '逆転防止有効フラグ'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint M_STOCK_TYPE_PK primary key (STOCK_TYPE_ID)
) comment '在庫区分マスタ' ;

create unique index M_STOCK_TYPE_IX1
  on M_STOCK_TYPE(STOCK_TYPE_CD);

create index M_STOCK_TYPE_IX2
  on M_STOCK_TYPE(DICT_ID);

-- ユーザセンタマスタ
create table M_USER_CENTER (
  USER_CENTER_ID bigint not null comment 'ユーザセンタID'
  , USER_ID bigint not null comment 'ユーザID'
  , CENTER_ID bigint not null comment 'センタID'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint M_USER_CENTER_PK primary key (USER_CENTER_ID)
) comment 'ユーザセンタマスタ' ;

create unique index M_USER_CENTER_IX1
  on M_USER_CENTER(USER_ID,CENTER_ID);

create index M_USER_CENTER_IX2
  on M_USER_CENTER(USER_ID);

-- ユーザ荷主マスタ
create table M_USER_CLIENT (
  USER_CLIENT_ID bigint not null comment 'ユーザ荷主ID'
  , USER_ID bigint not null comment 'ユーザID'
  , CLIENT_ID bigint not null comment '荷主ID'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint M_USER_CLIENT_PK primary key (USER_CLIENT_ID)
) comment 'ユーザ荷主マスタ' ;

create unique index M_USER_CLIENT_IX1
  on M_USER_CLIENT(USER_ID,CLIENT_ID);

create index M_USER_CLIENT_IX2
  on M_USER_CLIENT(USER_ID);

-- ユーザ預託マスタ
create table M_USER_DEPOSIT (
  USER_DEPOSIT_ID bigint not null comment 'ユーザ預託ID'
  , USER_ID bigint not null comment 'ユーザID'
  , CUSTOMER_ID bigint not null comment '取引先ID'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint M_USER_DEPOSIT_PK primary key (USER_DEPOSIT_ID)
) comment 'ユーザ預託マスタ' ;

create unique index M_USER_DEPOSIT_IX1
  on M_USER_DEPOSIT(USER_ID,CUSTOMER_ID);

create index M_USER_DEPOSIT_IX2
  on M_USER_DEPOSIT(USER_ID);

-- ユーザログインマスタ
create table M_USER_LOGIN (
  USER_ID bigint not null comment 'ユーザID'
  , CENTER_ID bigint not null comment 'センタID'
  , CLIENT_ID bigint not null comment '荷主ID'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint M_USER_LOGIN_PK primary key (USER_ID)
) comment 'ユーザログインマスタ' ;

-- 倉庫マスタ
create table M_WAREHOUSE (
  WAREHOUSE_ID bigint not null comment '倉庫ID'
  , CENTER_ID bigint not null comment 'センタID'
  , WAREHOUSE_CD varchar(30) not null comment '倉庫CD'
  , WAREHOUSE_NM varchar(60) comment '倉庫名称'
  , WAREHOUSE_ABBR varchar(60) comment '倉庫略称'
  , FOREIGN_FLG char(1) comment '外貨フラグ'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint M_WAREHOUSE_PK primary key (WAREHOUSE_ID)
) comment '倉庫マスタ' ;

create unique index M_WAREHOUSE_IX1
  on M_WAREHOUSE(CENTER_ID,WAREHOUSE_CD);

create index M_WAREHOUSE_IX2
  on M_WAREHOUSE(WAREHOUSE_CD);

-- ＷＥＢＨＴ管理マスタ
create table M_WEB_HT_INFO (
  WEB_HT_INFO_ID bigint not null comment '管理情報ID'
  , MAC_ADDRESS varchar(30) comment 'MACアドレス'
  , CLIENT_ID bigint comment '荷主ID'
  , CENTER_ID bigint comment 'センタID'
  , WAREHOUSE_ID bigint comment '倉庫ID'
  , PRINTER_NM varchar(60) comment 'プリンタ名称'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint M_WEB_HT_INFO_PK primary key (WEB_HT_INFO_ID)
) comment 'ＷＥＢＨＴ管理マスタ' ;

create unique index M_WEB_HT_INFO_IX1
  on M_WEB_HT_INFO(MAC_ADDRESS);

-- 郵便番号マスタ
create table M_ZIP (
  ZIP_ID bigint not null comment '郵便番号ID'
  , PUBLIC_CD varchar(30) comment '全国地方公共団体コード'
  , ZIP_CD_5 varchar(30) comment '旧郵便番号'
  , ZIP_CD varchar(30) not null comment '郵便番号'
  , ADDRESS_KN1 varchar(255) comment '都道府県カナ'
  , ADDRESS_KN2 varchar(255) comment '市区町村カナ'
  , ADDRESS_KN3 varchar(255) comment '町域カナ'
  , COMPANY_KN varchar(255) comment '大口事業所名カナ'
  , ADDRESS1 varchar(255) comment '都道府県'
  , ADDRESS2 varchar(255) comment '市区町村'
  , ADDRESS3 varchar(255) comment '町域'
  , ADDRESS4 varchar(255) comment '小字'
  , COMPANY_NM varchar(255) comment '大口事業所名'
  , FLG1 char(1) comment 'フラグ1'
  , FLG2 char(1) comment 'フラグ2'
  , FLG3 char(1) comment 'フラグ3'
  , FLG4 char(1) comment 'フラグ4'
  , UPD_TYPE char(1) comment '更新区分'
  , REASON_TYPE char(1) comment '変更理由'
  , HANDLING_ADDRESS varchar(60) comment '取扱局'
  , FLG5 char(1) comment 'フラグ5'
  , FLG6 char(1) comment 'フラグ6'
  , UPD_CD char(1) comment '修正コード'
  , COMPANY_FLG char(1) default '0' not null comment '大口事業所フラグ'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint M_ZIP_PK primary key (ZIP_ID)
) comment '郵便番号マスタ' ;

create unique index M_ZIP_IX1
  on M_ZIP(ZIP_CD);

-- ゾーンマスタ
create table M_ZONE (
  ZONE_ID bigint not null comment 'ゾーンID'
  , WAREHOUSE_ID bigint not null comment '倉庫ID'
  , ZONE_CD varchar(30) not null comment 'ゾーンCD'
  , ZONE_NM varchar(60) comment 'ゾーン名称'
  , PICKING_ORDER bigint comment 'ピッキング順序'
  , FLOOR_CD varchar(30) comment 'フロアCD'
  , STORAGE_SPACE_CD varchar(30) comment '保管場所CD'
  , REPLENISH_TYPE_CD varchar(30) comment '定期補充元区分'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint M_ZONE_PK primary key (ZONE_ID)
) comment 'ゾーンマスタ' ;

create unique index M_ZONE_IX1
  on M_ZONE(WAREHOUSE_ID,ZONE_CD);

create index M_ZONE_IX2
  on M_ZONE(ZONE_CD);

create index M_ZONE_IX3
  on M_ZONE(WAREHOUSE_ID);

-- レイアウト別印刷設定マスタ
create table P_LAYOUT_PRINT_SETTING (
  LAYOUT_PRINT_SETTING_ID bigint not null comment 'レイアウト別印刷設定ID'
  , REPORT_LAYOUT_ID bigint not null comment '帳票レイアウトID'
  , PRINTER_GROUP_ID bigint comment 'プリンタグループID'
  , PRINTER_ID bigint comment 'プリンタID'
  , PRINTER_ATTRIBUTE_ID bigint comment 'プリンタ属性ID'
  , PRINT_NUM bigint comment '印刷部数'
  , SHEET_COLLATE char(1) comment '部単位印刷要否'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint P_LAYOUT_PRINT_SETTING_PK primary key (LAYOUT_PRINT_SETTING_ID)
) comment 'レイアウト別印刷設定マスタ' ;

create unique index P_LAYOUT_PRINT_SETTING_IX1
  on P_LAYOUT_PRINT_SETTING(REPORT_LAYOUT_ID);

create index P_LAYOUT_PRINT_SETTING_IX2
  on P_LAYOUT_PRINT_SETTING(PRINTER_GROUP_ID);

create index P_LAYOUT_PRINT_SETTING_IX3
  on P_LAYOUT_PRINT_SETTING(PRINTER_ID);

create index P_LAYOUT_PRINT_SETTING_IX4
  on P_LAYOUT_PRINT_SETTING(PRINTER_ATTRIBUTE_ID);

-- 印刷キュー情報
create table P_PRINT_QUEUE (
  PRINT_QUEUE_ID bigint not null comment '印刷キューID'
  , PRINT_REQUEST_ID bigint not null comment '印刷情報ID'
  , PRINTER_GROUP_ID bigint not null comment 'プリンタグループID'
  , PRINT_QUEUE_STATUS varchar(30) not null comment '印刷キューステータス'
  , PRINTER_NM varchar(60) comment 'プリンタ名称'
  , TRAY_NM varchar(60) comment 'トレイ名称'
  , PRINT_NUM bigint comment '印刷部数'
  , SHEET_COLLATE char(1) comment '部単位印刷要否'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint P_PRINT_QUEUE_PK primary key (PRINT_QUEUE_ID)
) comment '印刷キュー情報' ;

create index P_PRINT_QUEUE_IX1
  on P_PRINT_QUEUE(PRINTER_GROUP_ID,PRINT_QUEUE_STATUS);

create index P_PRINT_QUEUE_IX2
  on P_PRINT_QUEUE(PRINT_REQUEST_ID);

create index P_PRINT_QUEUE_IX3
  on P_PRINT_QUEUE(PRINTER_GROUP_ID);

-- 印刷情報
create table P_PRINT_REQUEST (
  PRINT_REQUEST_ID bigint not null comment '印刷情報ID'
  , REPORT_CD varchar(100) not null comment '帳票CD'
  , REPORT_NM varchar(60) not null comment '帳票名称'
  , REPORT_LAYOUT_NM varchar(60) comment '帳票レイアウト名称'
  , PRINTER_GROUP_ID bigint not null comment 'プリンタグループID'
  , PRINTER_GROUP_NM varchar(60) not null comment 'プリンタグループ名称'
  , PRINTER_NM varchar(60) comment 'プリンタ名称'
  , TRAY_NM varchar(60) comment 'トレイ名称'
  , PRINT_NUM bigint comment '印刷部数'
  , DOCUMENT_PAGE_SIZE bigint comment 'ページ総数'
  , SHEET_COLLATE char(1) comment '部単位印刷要否'
  , PRINT_STATUS varchar(30) not null comment '印刷ステータス'
  , FIRST_PRINT_DT datetime(3) comment '初回印刷日時'
  , LATEST_PRINT_DT datetime(3) comment '最終印刷日時'
  , PRINTED_COUNT bigint default 0 not null comment '印刷回数'
  , PRINTED_FLG char(1) default 0 not null comment '再印刷有無'
  , QUEUE_ADD_DT datetime(3) comment 'キュー登録日時'
  , PRINT_DATA_TYPE char(1) not null comment '印刷データタイプ'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint P_PRINT_REQUEST_PK primary key (PRINT_REQUEST_ID)
) comment '印刷情報' ;

create index P_PRINT_REQUEST_IX1
  on P_PRINT_REQUEST(QUEUE_ADD_DT);

-- 印刷データ情報(バイナリファイル)
create table P_PRINT_REQUEST_BINARY (
  PRINT_REQUEST_BINARY_ID bigint not null comment '印刷データ情報(バイナリ)ID'
  , PRINT_REQUEST_ID bigint not null comment '印刷情報ID'
  , SRC_FILE_INDEX bigint not null comment 'ファイル番号'
  , REPORT_BINARY longblob comment '帳票バイナリデータ'
  , PRINT_CUSTOM_RANGE_FLG char(1) not null comment 'ページ指定印刷有無'
  , PRINT_FIRST_PAGE bigint comment '印刷開始ページ'
  , PRINT_LAST_PAGE bigint comment '印刷終了ページ'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint P_PRINT_REQUEST_BINARY_PK primary key (PRINT_REQUEST_BINARY_ID)
) comment '印刷データ情報(バイナリファイル)' ;

create unique index P_PRINT_REQUEST_BINARY_IX1
  on P_PRINT_REQUEST_BINARY(PRINT_REQUEST_ID,SRC_FILE_INDEX);

create index P_PRINT_REQUEST_BINARY_IX2
  on P_PRINT_REQUEST_BINARY(PRINT_REQUEST_ID);

-- 印刷データ情報
create table P_PRINT_REQUEST_DATA (
  PRINT_REQUEST_ID bigint not null comment '印刷情報ID'
  , REPORT_LAYOUT_DATA longtext comment '帳票レイアウトデータ'
  , SUBREP_LAYOUT_DATA longtext comment 'サブレポートレイアウトデータ'
  , REPORT_LAYOUT_BINARY longblob comment '帳票レイアウトバイナリ'
  , SUBREP_LAYOUT_BINARY longblob comment 'サブレポートレイアウトバイナリ'
  , DATA_FOR_REPORT longtext comment '業務データ'
  , CULTURE_CD varchar(30) comment 'カルチャCD'
  , TIME_ZONE_CD varchar(30) comment 'タイムゾーンCD'
  , DATE_TIME_FORMAT varchar(30) comment '日時書式'
  , DATE_FORMAT varchar(30) comment '日付書式'
  , TIME_FORMAT varchar(30) comment '時間書式'
  , NUMBER_FORMAT varchar(30) comment '数値書式'
  , CURRENCY_FORMAT varchar(30) comment '通貨書式'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint P_PRINT_REQUEST_DATA_PK primary key (PRINT_REQUEST_ID)
) comment '印刷データ情報' ;

-- 印刷履歴情報
create table P_PRINT_REQUEST_HIST (
  PRINT_REQUEST_HIST_ID bigint not null comment '印刷履歴ID'
  , PRINT_REQUEST_ID bigint not null comment '印刷情報ID'
  , PRINT_REQUEST_NO bigint not null comment '印刷No.'
  , PRINTER_NM varchar(60) comment 'プリンタ名称'
  , TRAY_NM varchar(60) comment 'トレイ名称'
  , PRINT_NUM bigint comment '印刷部数'
  , DOCUMENT_PAGE_SIZE bigint comment 'ページ総数'
  , SHEET_COLLATE char(1) comment '部単位印刷要否'
  , PRINT_RESULT_CLASS varchar(30) not null comment '印刷結果区分'
  , PROCESS_INFO longtext comment '処理情報'
  , QUEUE_ADD_DT datetime(3) not null comment 'キュー登録日時'
  , PRINT_DT datetime(3) not null comment '印刷日時'
  , PRINT_DATA_TYPE char(1) not null comment '印刷データタイプ'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint P_PRINT_REQUEST_HIST_PK primary key (PRINT_REQUEST_HIST_ID)
) comment '印刷履歴情報' ;

create unique index P_PRINT_REQUEST_HIST_IX1
  on P_PRINT_REQUEST_HIST(PRINT_REQUEST_ID,PRINT_REQUEST_NO);

create index P_PRINT_REQUEST_HIST_IX2
  on P_PRINT_REQUEST_HIST(PRINT_REQUEST_ID);

-- 印刷サービス情報
create table P_PRINT_SERVICE (
  PRINT_SERVICE_ID bigint not null comment '印刷サービスID'
  , PRINT_SERVICE_NM varchar(60) not null comment '印刷サービス名称'
  , TERMINAL_NM varchar(60) not null comment '端末名称'
  , MAC_ADDRESS varchar(30) not null comment 'MACアドレス'
  , PRINTER_GROUP_ID bigint comment 'プリンタグループID'
  , PRINT_SERVICE_STATUS char(1) not null comment '印刷サービスステータス'
  , START_DT datetime(3) comment '開始日時'
  , END_DT datetime(3) comment '終了日時'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint P_PRINT_SERVICE_PK primary key (PRINT_SERVICE_ID)
) comment '印刷サービス情報' ;

create unique index P_PRINT_SERVICE_IX1
  on P_PRINT_SERVICE(MAC_ADDRESS);

create index P_PRINT_SERVICE_IX2
  on P_PRINT_SERVICE(PRINTER_GROUP_ID);

-- プリンタマスタ
create table P_PRINTER (
  PRINTER_ID bigint not null comment 'プリンタID'
  , PRINTER_GROUP_ID bigint not null comment 'プリンタグループID'
  , PRINTER_NM varchar(60) not null comment 'プリンタ名称'
  , VISIBLE char(1) default '1' not null comment '表示可否'
  , ADD_TERMINAL varchar(60) comment '登録端末'
  , UPD_TERMINAL varchar(60) comment '更新端末'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint P_PRINTER_PK primary key (PRINTER_ID)
) comment 'プリンタマスタ' ;

create unique index P_PRINTER_IX1
  on P_PRINTER(PRINTER_GROUP_ID,PRINTER_NM);

create index P_PRINTER_IX2
  on P_PRINTER(PRINTER_GROUP_ID);

-- プリンタ属性マスタ
create table P_PRINTER_ATTRIBUTE (
  PRINTER_ATTRIBUTE_ID bigint not null comment 'プリンタ属性ID'
  , PRINTER_ID bigint not null comment 'プリンタID'
  , TRAY_NM varchar(60) not null comment 'トレイ名称'
  , VISIBLE char(1) default '1' not null comment '表示可否'
  , ADD_TERMINAL varchar(60) comment '登録端末'
  , UPD_TERMINAL varchar(60) comment '更新端末'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint P_PRINTER_ATTRIBUTE_PK primary key (PRINTER_ATTRIBUTE_ID)
) comment 'プリンタ属性マスタ' ;

create index P_PRINTER_ATTRIBUTE_IX1
  on P_PRINTER_ATTRIBUTE(PRINTER_ID);

-- プリンタグループマスタ
create table P_PRINTER_GROUP (
  PRINTER_GROUP_ID bigint not null comment 'プリンタグループID'
  , PRINTER_GROUP_NM varchar(60) not null comment 'プリンタグループ名称'
  , ATTRIBUTE1 varchar(100) comment '属性1'
  , ATTRIBUTE2 varchar(100) comment '属性2'
  , ATTRIBUTE3 varchar(100) comment '属性3'
  , ATTRIBUTE4 varchar(100) comment '属性4'
  , ATTRIBUTE5 varchar(100) comment '属性5'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint P_PRINTER_GROUP_PK primary key (PRINTER_GROUP_ID)
) comment 'プリンタグループマスタ' ;

create unique index P_PRINTER_GROUP_IX1
  on P_PRINTER_GROUP(PRINTER_GROUP_NM);

-- 帳票マスタ
create table P_REPORT (
  REPORT_ID bigint not null comment '帳票ID'
  , REPORT_CD varchar(100) not null comment '帳票CD'
  , REPORT_NM varchar(60) not null comment '帳票名称'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint P_REPORT_PK primary key (REPORT_ID)
) comment '帳票マスタ' ;

create unique index P_REPORT_IX1
  on P_REPORT(REPORT_CD);

-- 帳票レイアウトマスタ
create table P_REPORT_LAYOUT (
  REPORT_LAYOUT_ID bigint not null comment '帳票レイアウトID'
  , REPORT_ID bigint not null comment '帳票ID'
  , REPORT_LAYOUT_NM varchar(60) not null comment '帳票レイアウト名称'
  , REPORT_LAYOUT_DATA longtext not null comment '帳票レイアウトデータ'
  , UPDATABLE char(1) not null comment '更新可否'
  , ATTRIBUTE1 varchar(100) comment '属性1'
  , ATTRIBUTE2 varchar(100) comment '属性2'
  , ATTRIBUTE3 varchar(100) comment '属性3'
  , ATTRIBUTE4 varchar(100) comment '属性4'
  , ATTRIBUTE5 varchar(100) comment '属性5'
  , AUTO_PRINT_TARGET_FLG char(1) default 0 not null comment '自動印刷対象フラグ'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint P_REPORT_LAYOUT_PK primary key (REPORT_LAYOUT_ID)
) comment '帳票レイアウトマスタ' ;

create unique index P_REPORT_LAYOUT_IX1
  on P_REPORT_LAYOUT(REPORT_ID,REPORT_LAYOUT_NM);

create index P_REPORT_LAYOUT_IX2
  on P_REPORT_LAYOUT(REPORT_ID);

-- 帳票レイアウト項目マスタ
create table P_REPORT_LAYOUT_ITEM (
  REPORT_LAYOUT_ITEM_ID bigint not null comment '帳票レイアウト項目ID'
  , REPORT_LAYOUT_ID bigint not null comment '帳票レイアウトID'
  , ITEM_CD varchar(100) not null comment '項目CD'
  , DICT_ID bigint comment '辞書ID'
  , ITEM_TYPE varchar(30) comment '項目型'
  , VISIBLE char(1) default '1' not null comment '表示可否'
  , ITEM_FORMAT varchar(30) comment '項目書式'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint P_REPORT_LAYOUT_ITEM_PK primary key (REPORT_LAYOUT_ITEM_ID)
) comment '帳票レイアウト項目マスタ' ;

create unique index P_REPORT_LAYOUT_ITEM_IX1
  on P_REPORT_LAYOUT_ITEM(REPORT_LAYOUT_ID,ITEM_CD);

create index P_REPORT_LAYOUT_ITEM_IX2
  on P_REPORT_LAYOUT_ITEM(REPORT_LAYOUT_ID);

create index P_REPORT_LAYOUT_ITEM_IX3
  on P_REPORT_LAYOUT_ITEM(DICT_ID);

-- サブレポートレイアウトマスタ
create table P_SUBREP_LAYOUT (
  SUBREP_LAYOUT_ID bigint not null comment 'サブレポートレイアウトID'
  , REPORT_LAYOUT_ID bigint not null comment '帳票レイアウトID'
  , SUBREP_LAYOUT_DATA longtext not null comment 'サブレポートレイアウトデータ'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint P_SUBREP_LAYOUT_PK primary key (SUBREP_LAYOUT_ID)
) comment 'サブレポートレイアウトマスタ' ;

create unique index P_SUBREP_LAYOUT_IX1
  on P_SUBREP_LAYOUT(REPORT_LAYOUT_ID);

-- サブレポートレイアウト項目マスタ
create table P_SUBREP_LAYOUT_ITEM (
  SUBREP_LAYOUT_ITEM_ID bigint not null comment 'サブレポートレイアウト項目ID'
  , SUBREP_LAYOUT_ID bigint not null comment 'サブレポートレイアウトID'
  , ITEM_CD varchar(100) not null comment '項目CD'
  , DICT_ID bigint comment '辞書ID'
  , ITEM_TYPE varchar(30) comment '項目型'
  , VISIBLE char(1) default '1' not null comment '表示可否'
  , ITEM_FORMAT varchar(30) comment '項目書式'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint P_SUBREP_LAYOUT_ITEM_PK primary key (SUBREP_LAYOUT_ITEM_ID)
) comment 'サブレポートレイアウト項目マスタ' ;

create unique index P_SUBREP_LAYOUT_ITEM_IX1
  on P_SUBREP_LAYOUT_ITEM(SUBREP_LAYOUT_ID,ITEM_CD);

create index P_SUBREP_LAYOUT_ITEM_IX2
  on P_SUBREP_LAYOUT_ITEM(SUBREP_LAYOUT_ID);

create index P_SUBREP_LAYOUT_ITEM_IX3
  on P_SUBREP_LAYOUT_ITEM(DICT_ID);

-- 端末別自動印刷設定マスタ
create table P_TERMINAL_AUTO_PRINT_SET (
  TERMINAL_AUTO_PRINT_SET_ID bigint not null comment '端末別自動印刷設定ID'
  , TERMINAL_ASSIGN_CD varchar(100) not null comment '端末識別CD'
  , REPORT_LAYOUT_ID bigint not null comment '帳票レイアウトID'
  , PRINTER_GROUP_ID bigint comment 'プリンタグループID'
  , PRINTER_ID bigint comment 'プリンタID'
  , PRINTER_ATTRIBUTE_ID bigint comment 'プリンタ属性ID'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint P_TERMINAL_AUTO_PRINT_SET_PK primary key (TERMINAL_AUTO_PRINT_SET_ID)
) comment '端末別自動印刷設定マスタ' ;

create unique index P_TERMINAL_AUTO_PRINT_SET_IX1
  on P_TERMINAL_AUTO_PRINT_SET(TERMINAL_ASSIGN_CD,REPORT_LAYOUT_ID);

create index P_TERMINAL_AUTO_PRINT_SET_IX2
  on P_TERMINAL_AUTO_PRINT_SET(TERMINAL_ASSIGN_CD);

create index P_TERMINAL_AUTO_PRINT_SET_IX3
  on P_TERMINAL_AUTO_PRINT_SET(REPORT_LAYOUT_ID);

create index P_TERMINAL_AUTO_PRINT_SET_IX4
  on P_TERMINAL_AUTO_PRINT_SET(PRINTER_GROUP_ID);

create index P_TERMINAL_AUTO_PRINT_SET_IX5
  on P_TERMINAL_AUTO_PRINT_SET(PRINTER_ID);

create index P_TERMINAL_AUTO_PRINT_SET_IX6
  on P_TERMINAL_AUTO_PRINT_SET(PRINTER_ATTRIBUTE_ID);

-- 端末別印刷設定情報
create table P_TERMINAL_PRINT_SETTING (
  TERMINAL_PRINT_SETTING_ID bigint not null comment '端末別印刷設定ID'
  , TERMINAL_ASSIGN_CD varchar(100) not null comment '端末識別CD'
  , REPORT_LAYOUT_ID bigint not null comment '帳票レイアウトID'
  , PRINTER_GROUP_ID bigint comment 'プリンタグループID'
  , PRINTER_ID bigint comment 'プリンタID'
  , PRINTER_ATTRIBUTE_ID bigint comment 'プリンタ属性ID'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint P_TERMINAL_PRINT_SETTING_PK primary key (TERMINAL_PRINT_SETTING_ID)
) comment '端末別印刷設定情報' ;

create unique index P_TERMINAL_PRINT_SETTING_IX1
  on P_TERMINAL_PRINT_SETTING(TERMINAL_ASSIGN_CD,REPORT_LAYOUT_ID);

create index P_TERMINAL_PRINT_SETTING_IX2
  on P_TERMINAL_PRINT_SETTING(REPORT_LAYOUT_ID);

create index P_TERMINAL_PRINT_SETTING_IX3
  on P_TERMINAL_PRINT_SETTING(PRINTER_GROUP_ID);

create index P_TERMINAL_PRINT_SETTING_IX4
  on P_TERMINAL_PRINT_SETTING(PRINTER_ID);

create index P_TERMINAL_PRINT_SETTING_IX5
  on P_TERMINAL_PRINT_SETTING(PRINTER_ATTRIBUTE_ID);

create index P_TERMINAL_PRINT_SETTING_IX6
  on P_TERMINAL_PRINT_SETTING(TERMINAL_ASSIGN_CD);

-- ユーザ別自動印刷設定マスタ
create table P_USER_AUTO_PRINT_SETTING (
  USER_AUTO_PRINT_SETTING_ID bigint not null comment 'ユーザ別自動印刷設定ID'
  , USER_ID bigint not null comment 'ユーザID'
  , REPORT_LAYOUT_ID bigint not null comment '帳票レイアウトID'
  , PRINTER_GROUP_ID bigint comment 'プリンタグループID'
  , PRINTER_ID bigint comment 'プリンタID'
  , PRINTER_ATTRIBUTE_ID bigint comment 'プリンタ属性ID'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint P_USER_AUTO_PRINT_SETTING_PK primary key (USER_AUTO_PRINT_SETTING_ID)
) comment 'ユーザ別自動印刷設定マスタ' ;

create unique index P_USER_AUTO_PRINT_SETTING_IX1
  on P_USER_AUTO_PRINT_SETTING(USER_ID,REPORT_LAYOUT_ID);

create index P_USER_AUTO_PRINT_SETTING_IX2
  on P_USER_AUTO_PRINT_SETTING(USER_ID);

create index P_USER_AUTO_PRINT_SETTING_IX3
  on P_USER_AUTO_PRINT_SETTING(REPORT_LAYOUT_ID);

create index P_USER_AUTO_PRINT_SETTING_IX4
  on P_USER_AUTO_PRINT_SETTING(PRINTER_GROUP_ID);

create index P_USER_AUTO_PRINT_SETTING_IX5
  on P_USER_AUTO_PRINT_SETTING(PRINTER_ID);

create index P_USER_AUTO_PRINT_SETTING_IX6
  on P_USER_AUTO_PRINT_SETTING(PRINTER_ATTRIBUTE_ID);

-- ユーザ別印刷設定情報
create table P_USER_PRINT_SETTING (
  USER_PRINT_SETTING_ID bigint not null comment 'ユーザ別印刷設定ID'
  , USER_ID bigint not null comment 'ユーザID'
  , REPORT_LAYOUT_ID bigint not null comment '帳票レイアウトID'
  , PRINTER_GROUP_ID bigint comment 'プリンタグループID'
  , PRINTER_ID bigint comment 'プリンタID'
  , PRINTER_ATTRIBUTE_ID bigint comment 'プリンタ属性ID'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint P_USER_PRINT_SETTING_PK primary key (USER_PRINT_SETTING_ID)
) comment 'ユーザ別印刷設定情報' ;

create unique index P_USER_PRINT_SETTING_IX1
  on P_USER_PRINT_SETTING(USER_ID,REPORT_LAYOUT_ID);

create index P_USER_PRINT_SETTING_IX2
  on P_USER_PRINT_SETTING(REPORT_LAYOUT_ID);

create index P_USER_PRINT_SETTING_IX3
  on P_USER_PRINT_SETTING(PRINTER_GROUP_ID);

create index P_USER_PRINT_SETTING_IX4
  on P_USER_PRINT_SETTING(PRINTER_ID);

create index P_USER_PRINT_SETTING_IX5
  on P_USER_PRINT_SETTING(PRINTER_ATTRIBUTE_ID);

create index P_USER_PRINT_SETTING_IX6
  on P_USER_PRINT_SETTING(USER_ID);

-- 引当指示ボディ
create table T_ALLOC_INST_B (
  ALLOC_INST_B_ID bigint not null comment '引当指示ボディID'
  , ALLOC_INST_H_ID bigint not null comment '引当指示ヘッダID'
  , WAREHOUSE_ID bigint comment '指定倉庫ID'
  , PRODUCT_ID bigint comment '商品ID'
  , STOCK_TYPE_ID bigint comment '在庫区分ID'
  , LOCATION_ID bigint comment '指定ロケーションID'
  , LOCATION_CD varchar(30) comment '指定ロケーションCD'
  , DEPOSIT_ID bigint comment '預託ID'
  , LOT_ID bigint comment '指定ロットID'
  , LOT varchar(30) comment '指定ロット'
  , LIMIT_DT varchar(8) comment '指定期限日'
  , STORE_NO_ID bigint comment '指定入庫No.ID'
  , STORE_LABEL_NO varchar(30) comment '指定入庫ラベルNo.'
  , SHAPE_ID bigint comment '指定荷姿ID'
  , SHAPE_CD varchar(30) comment '指定荷姿CD'
  , LIMIT_DT_REVERSE_FLG char(1) comment '期限日逆転防止フラグ'
  , SHIPPING_LIMIT_DT varchar(8) comment '出荷限界期限日'
  , LOT_MANAG_FLG char(1) comment 'ロット管理フラグ'
  , LIMIT_DT_MANAG_FLG char(1) comment '期限日管理フラグ'
  , UNIT_NUM bigint comment '指定入数'
  , INST_NUM decimal(14,4) default 0 not null comment '指示数'
  , PROCESS_NO varchar(30) comment '処理No.'
  , ALLOC_NUM decimal(14,4) default 0 not null comment '引当済数'
  , PROD_DT varchar(8) comment '指定製造日'
  , PROD_DT_MANAG_FLG char(1) comment '製造日管理フラグ'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_ALLOC_INST_B_PK primary key (ALLOC_INST_B_ID)
) comment '引当指示ボディ' ;

create index T_ALLOC_INST_B_IX1
  on T_ALLOC_INST_B(ALLOC_INST_H_ID);

create index T_ALLOC_INST_B_IX2
  on T_ALLOC_INST_B(PRODUCT_ID);

create index T_ALLOC_INST_B_IX3
  on T_ALLOC_INST_B(STOCK_TYPE_ID);

create index T_ALLOC_INST_B_IX4
  on T_ALLOC_INST_B(LOCATION_ID);

create index T_ALLOC_INST_B_IX5
  on T_ALLOC_INST_B(DEPOSIT_ID);

create index T_ALLOC_INST_B_IX6
  on T_ALLOC_INST_B(LOT_ID);

create index T_ALLOC_INST_B_IX7
  on T_ALLOC_INST_B(STORE_NO_ID);

create index T_ALLOC_INST_B_IX8
  on T_ALLOC_INST_B(SHAPE_ID);

create index T_ALLOC_INST_B_IX9
  on T_ALLOC_INST_B(WAREHOUSE_ID);

-- 引当指示ヘッダ
create table T_ALLOC_INST_H (
  ALLOC_INST_H_ID bigint not null comment '引当指示ヘッダID'
  , CLIENT_ID bigint not null comment '荷主ID'
  , CENTER_ID bigint not null comment 'センタID'
  , PROCESS_TYPE_ID bigint not null comment '処理区分ID'
  , SHIPPING_DT varchar(8) comment '出荷日'
  , WORK_DT varchar(8) comment '作業日'
  , DELIV_PLAN_DT varchar(8) comment '納品予定日'
  , DELIV_DT varchar(8) comment '納品指定日'
  , DELIV_TZ varchar(30) comment '納品時間帯'
  , SUPPLY_CUSTOMER_ID bigint comment '納品先ID'
  , SUPPLY_CUSTOMER_CD varchar(30) comment '納品先CD'
  , SUPPLY_CUSTOMER_NM varchar(255) comment '納品先名称'
  , DELIV_CUSTOMER_ID bigint comment '届先ID'
  , DELIV_CUSTOMER_CD varchar(30) comment '届先CD'
  , DELIV_ZIP_CD varchar(30) comment '届先郵便番号'
  , DELIV_ADDRESS1 varchar(255) comment '届先住所1'
  , DELIV_ADDRESS2 varchar(255) comment '届先住所2'
  , DELIV_ADDRESS3 varchar(255) comment '届先住所3'
  , DELIV_ADDRESS_SUPPLY varchar(60) comment '届先住所補足'
  , DELIV_CUSTOMER_NM varchar(255) comment '届先名称'
  , DELIV_CUSTOMER_NM1 varchar(255) comment '届先名称1'
  , DELIV_CUSTOMER_NM2 varchar(255) comment '届先名称2'
  , DELIV_TEL_NO varchar(255) comment '届先電話番号'
  , DELIVERY_COURSE_ID bigint comment '配送コースID'
  , NIZOROE_NO varchar(30) comment '荷揃番号'
  , DAIHYO_NIZOROE_NO varchar(30) comment '代表荷揃番号'
  , NIZOROE_NO2 varchar(30) comment '荷揃番号_ハイフンあり'
  , DAIHYO_NIZOROE_NO2 varchar(30) comment '代表荷揃番号_ハイフンあり'
  , SPECIFY_DELIVERY_DT varchar(8) comment '配達指定日'
  , SPECIFY_DELIVERY_TIME varchar(30) comment '配達指定時間'
  , `共通管理送信済フラグ` char(1) comment '共通管理送信済フラグ'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_ALLOC_INST_H_PK primary key (ALLOC_INST_H_ID)
) comment '引当指示ヘッダ' ;

create index T_ALLOC_INST_H_IX1
  on T_ALLOC_INST_H(PROCESS_TYPE_ID);

create index T_ALLOC_INST_H_IX2
  on T_ALLOC_INST_H(SUPPLY_CUSTOMER_ID);

create index T_ALLOC_INST_H_IX3
  on T_ALLOC_INST_H(DELIV_CUSTOMER_ID);

create index T_ALLOC_INST_H_IX4
  on T_ALLOC_INST_H(DELIVERY_COURSE_ID);

create index T_ALLOC_INST_H_IX5
  on T_ALLOC_INST_H(SHIPPING_DT);

create index T_ALLOC_INST_H_IX6
  on T_ALLOC_INST_H(WORK_DT);

create index T_ALLOC_INST_H_IX7
  on T_ALLOC_INST_H(SUPPLY_CUSTOMER_CD);

-- 引当ロット管理
create table T_ALLOC_LOT (
  ALLOC_INST_B_ID bigint not null comment '引当指示ボディID'
  , CUSTOMER_ID bigint not null comment '取引先ID'
  , PRODUCT_ID bigint not null comment '商品ID'
  , LOT_ID bigint not null comment 'ロットID'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_ALLOC_LOT_PK primary key (ALLOC_INST_B_ID)
) comment '引当ロット管理' ;

create index T_ALLOC_LOT_IX1
  on T_ALLOC_LOT(CUSTOMER_ID);

create index T_ALLOC_LOT_IX2
  on T_ALLOC_LOT(PRODUCT_ID);

create index T_ALLOC_LOT_IX3
  on T_ALLOC_LOT(LOT_ID);

-- Amazon受注
create table T_AMAZON_ORDER (
  AMAZON_ORDER_ID bigint not null comment 'Amazon受注ID'
  , ORDER_ID varchar(30) comment '受注番号'
  , ORDER_ITEM_ID varchar(30) comment 'Amazon商品ID'
  , PURCHASE_DATE varchar(30) comment '受注日時'
  , PAYMENTS_DATE varchar(30) comment '注文完了日時'
  , BUYER_EMAIL varchar(255) comment '注文者Eメールアドレス'
  , BUYER_NAME varchar(255) comment '注文者名称(フルネーム)'
  , BUYER_PHONE_NUMBER varchar(255) comment '注文者電話番号(数値のみ)'
  , SKU varchar(30) comment '商品ID'
  , PRODUCT_NAME varchar(255) comment '商品名称'
  , QUANTITY_PURCHASED bigint comment '購入数'
  , CURRENCY varchar(60) comment '決済通貨'
  , ITEM_PRICE bigint comment '商品金額'
  , ITEM_TAX bigint comment '商品税額'
  , SHIPPING_PRICE bigint comment '配送料金額'
  , SHIPPING_TAX bigint comment '配送料税額'
  , GIFT_WRAP_PRICE bigint comment 'ギフト包装金額'
  , GIFT_WRAP_TAX bigint comment 'ギフト包装税額'
  , SHIP_SERVICE_LEVEL varchar(60) comment 'フルフィルメントサービス'
  , RECIPIENT_NAME varchar(255) comment '送付先名称'
  , SHIP_ADDRESS_1 varchar(255) comment '配送先住所1'
  , SHIP_ADDRESS_2 varchar(255) comment '配送先住所2'
  , SHIP_ADDRESS_3 varchar(255) comment '配送先住所3'
  , SHIP_CITY varchar(255) comment '配送先市区町村'
  , SHIP_STATE varchar(255) comment '配送先都道府県'
  , SHIP_POSTAL_CODE varchar(30) comment '配送先郵便番号'
  , SHIP_COUNTRY varchar(30) comment '国別コード'
  , SHIP_PHONE_NUMBER varchar(255) comment '配送先電話番号'
  , GIFT_WRAP_TYPE varchar(30) comment 'ギフト包装ID'
  , GIFT_MASSAGE_TEXT varchar(60) comment 'ギフトメッセージ'
  , ITEM_PROMOTION_DISCOUNT bigint comment '商品プロモーション割引額'
  , ITEM_PROMOTION_ID varchar(30) comment '商品プロモーションID'
  , SHIP_PROMOTION_DISCOUNT bigint comment '配送プロモーション割引額'
  , SHIP_PROMOTION_ID varchar(30) comment '配送プロモーションID'
  , DELIVERY_START_DATE varchar(30) comment '配送予定日時(最速)'
  , DELIVERY_END_DATE varchar(30) comment '配送予定日時(最遅)'
  , DELIVERY_TIME_ZONE varchar(30) comment '配送日時タイムゾーン'
  , DELIVERY_INSTRUCTIONS varchar(60) comment '配送特記事項'
  , PAYMENT_METHOD varchar(60) comment '支払方法'
  , COD_COLLECTIBLE_AMOUNT bigint comment '代金引換金額'
  , ALREADY_PAID bigint comment '代金引換Amazonギフト前払金額'
  , PAYMENT_METHOD_FEE bigint comment '支払方法別手数料'
  , SCHEDULED_DELI_ST_DATE varchar(30) comment '納品指定日時(最速)'
  , SCHEDULED_DELI_ED_DATE varchar(30) comment '納品指定日時(最遅)'
  , PACKING_QTY bigint comment '個口数'
  , SLIP_ITEM_NM1 longtext comment '品名1'
  , SLIP_ITEM_NM2 varchar(255) comment '品名2'
  , SLIP_ITEM_NM3 varchar(255) comment '品名3'
  , SLIP_ITEM_NM4 varchar(255) comment '品名4'
  , SLIP_ITEM_NM5 varchar(255) comment '品名5'
  , SLIP_ITEM_CD1 varchar(30) comment '品名コード1'
  , SLIP_ITEM_CD2 varchar(30) comment '品名コード2'
  , FREIGHT_HANDLING1 varchar(30) comment '荷扱い1'
  , FREIGHT_HANDLING2 varchar(30) comment '荷扱い2'
  , ARTICLE varchar(255) comment '記事'
  , RECEIVE_ID bigint comment '受信ID'
  , ROW_NO bigint comment '行No.'
  , ERROR_FLG char(1) comment 'エラーフラグ'
  , IMPORT_FLG char(1) comment '取込フラグ'
  , IMPORT_TYPE_ID bigint comment '取込種別'
  , EC_ORDER_B_ID bigint comment 'EC受注ボディID'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_AMAZON_ORDER_PK primary key (AMAZON_ORDER_ID)
) comment 'Amazon受注' ;

create index T_AMAZON_ORDER_IX1
  on T_AMAZON_ORDER(RECEIVE_ID);

-- 請求元データ
create table T_BILLING_DATA (
  BILLING_DATA_ID bigint not null comment '請求元データID'
  , YEARMONTH varchar(30) comment '年月'
  , MONTH varchar(30) comment '対象月度'
  , MESSAGE_CD varchar(30) comment 'メッセージCD'
  , NUM bigint comment '数量'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_BILLING_DATA_PK primary key (BILLING_DATA_ID)
) comment '請求元データ' ;

-- BLDL3310
create table T_BLDL3310 (
  BLDL3310_ID bigint not null comment 'BLDL3310ID'
  , YEARMONTH varchar(30) comment '年月'
  , BASE_NM varchar(60) comment '拠点'
  , MONTH varchar(60) comment '対象月度'
  , CONTRACTOR_NM varchar(60) comment '戸口契約先'
  , EC_TYPE_CD varchar(30) comment 'EC区分'
  , FW_PRICE bigint comment 'FW単体金額'
  , SANSHA_FW_PRICE bigint comment '3社戸配対象_FW金額'
  , SANSHA_UN_PRICE bigint comment '3社戸配対象_UN金額'
  , SANSHA_SH_PRICE bigint comment '3社戸配対象_SH金額'
  , SANSHA_HM_PRICE bigint comment '3社戸配対象_HM金額'
  , SANSHA_TOTAL_PRICE bigint comment '3社戸配対象_3社合計'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_BLDL3310_PK primary key (BLDL3310_ID)
) comment 'BLDL3310' ;

-- BLDL3330
create table T_BLDL3330 (
  BLDL3310_ID bigint not null comment 'BLDL3330ID'
  , YEARMONTH varchar(30) comment '年月'
  , BASE_NM varchar(60) comment '拠点'
  , MONTH varchar(60) comment '対象月度'
  , CONTRACTOR_NM varchar(60) comment '戸口契約先'
  , EC_USER_TYPE_CD varchar(30) comment 'ECユーザ区分'
  , FW_NUM bigint comment 'FW単体数量'
  , SANSHA_FW_NUM bigint comment '3社戸配対象_FW数量'
  , SANSHA_UN_NUM bigint comment '3社戸配対象_UN数量'
  , SANSHA_SH_NUM bigint comment '3社戸配対象_SH数量'
  , SANSHA_HM_NUM bigint comment '3社戸配対象_HM数量'
  , SANSHA_TOTAL_NUM bigint comment '3社戸配対象_3社合計'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_BLDL3330_PK primary key (BLDL3310_ID)
) comment 'BLDL3330' ;

-- BLDL3350
create table T_BLDL3350 (
  BLDL3350_ID bigint not null comment 'BLDL3350ID'
  , YEARMONTH varchar(30) comment '年月'
  , BASE_NM varchar(60) comment '拠点'
  , MONTH varchar(60) comment '対象月度'
  , SALES_ORG_NM varchar(60) comment '販売組織名称'
  , SHIPPING_DT varchar(8) comment '出荷日'
  , YAMATO_SHIPPING_NUM bigint comment 'ヤマト運輸_出荷数'
  , YAMATO_EC_SHIPPING_NUM bigint comment 'ヤマト運輸_EC出荷手数料'
  , SAGAWA_SHIPPING_NUM bigint comment '佐川急便_出荷数'
  , SAGAWA_EC_SHIPPING_NUM bigint comment '佐川急便_EC出荷手数料'
  , SAGAWA2_SHIPPING_NUM bigint comment '佐川代引_出荷数'
  , SAGAWA2_EC_SHIPPING_NUM bigint comment '佐川代引_EC出荷手数料'
  , OTHER_SHIPPING_NUM bigint comment 'その他_出荷数'
  , OTHER_EC_SHIPPING_NUM bigint comment 'その他_EC出荷手数料'
  , CANCEL_SHIPPING_NUM bigint comment '取り消し_出荷数'
  , CANCEL_EC_SHIPPING_NUM bigint comment '取り消し_EC出荷手数料'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_BLDL3350_PK primary key (BLDL3350_ID)
) comment 'BLDL3350' ;

-- BLDL3390
create table T_BLDL3390 (
  BLDL3390_ID bigint not null comment 'BLDL3390ID'
  , YEARMONTH varchar(30) comment '年月'
  , BASE_NM varchar(60) comment '拠点'
  , MONTH varchar(60) comment '対象月度'
  , SHIPPING_DT varchar(8) comment '出荷日'
  , CONTRACTOR_CD varchar(30) comment '戸口契約先CD'
  , CONTRACTOR_NM varchar(60) comment '戸口契約先名称'
  , PRODUCT_NM varchar(60) comment '商品名称'
  , SALES_ORG_NM varchar(60) comment '販売組織名称'
  , SHIPPING_NUM bigint comment '出荷数'
  , KOHAI_FEE bigint comment '戸配手数料'
  , TAX bigint comment '消費税額'
  , TAX_RATE bigint comment '消費税率値'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_BLDL3390_PK primary key (BLDL3390_ID)
) comment 'BLDL3390' ;

-- BLDL350K
create table T_BLDL350K (
  BLDL350K_ID bigint not null comment 'BLDL350KID'
  , YEARMONTH varchar(30) comment '年月'
  , BASE_NM varchar(60) comment '拠点'
  , MONTH varchar(60) comment '対象月度'
  , CONTRACTOR_NM varchar(60) comment '戸口契約先名'
  , SHIPPING_DT varchar(8) comment '出荷日'
  , DESTINATION_NM varchar(60) comment '送り先名'
  , SHIPPING_NUM bigint comment '出荷数'
  , SHIPPING_FEE bigint comment '送料'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_BLDL350K_PK primary key (BLDL350K_ID)
) comment 'BLDL350K' ;

-- BLDL350N
create table T_BLDL350N (
  BLDL350N_ID bigint not null comment 'BLDL350NID'
  , YEARMONTH varchar(30) comment '年月'
  , BASE_NM varchar(60) comment '拠点'
  , MONTH varchar(60) comment '対象月度'
  , CONTRACTOR_NM varchar(60) comment '戸口契約先名'
  , SHIPPING_DT varchar(8) comment '出荷日'
  , DESTINATION_NM varchar(60) comment '送り先名'
  , SHIPPING_NUM bigint comment '出荷数'
  , SHIPPING_FEE bigint comment '送料'
  , FW_SHIPPING_NUM bigint comment 'FW出荷数'
  , UN_SHIPPING_NUM bigint comment 'UN出荷数'
  , SH_SHIPPING_NUM bigint comment 'SH出荷数'
  , HM_SHIPPING_NUM bigint comment 'HM出荷数'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_BLDL350N_PK primary key (BLDL350N_ID)
) comment 'BLDL350N' ;

-- BLDL5050
create table T_BLDL5050 (
  BLDL5050_ID bigint not null comment 'BLDL5050ID'
  , YEARMONTH varchar(30) comment '年月'
  , BASE_NM varchar(60) comment '拠点'
  , MONTH varchar(60) comment '対象月度'
  , ROW_NO varchar(30) comment '項番'
  , SHIPPING_DT varchar(30) comment '出荷日'
  , FW_ITEM_CNT bigint comment 'FW関連_アイテム数'
  , FW_PICK_NUM bigint comment 'FW関連_ピッキング数'
  , FW_RATE bigint comment 'FW関連_率'
  , UN_ITEM_CNT bigint comment 'UN関連_アイテム数'
  , UN_PICK_NUM bigint comment 'UN関連_ピッキング数'
  , UN_RATE bigint comment 'UN関連_率'
  , SH_ITEM_CNT bigint comment 'SH関連_アイテム数'
  , SH_PICK_NUM bigint comment 'SH関連_ピッキング数'
  , SH_RATE bigint comment 'SH関連_率'
  , HM_ITEM_CNT bigint comment 'HM関連_アイテム数'
  , HM_PICK_NUM bigint comment 'HM関連_ピッキング数'
  , HM_RATE bigint comment 'HM関連_率'
  , TOTAL_ITEM_CNT bigint comment '当日合計_アイテム数'
  , TOTAL_PICK_NUM bigint comment '当日合計_ピッキング数'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_BLDL5050_PK primary key (BLDL5050_ID)
) comment 'BLDL5050' ;

-- BLDL5052
create table T_BLDL5052 (
  BLDL5052_ID bigint not null comment 'BLDL5052ID'
  , YEARMONTH varchar(30) comment '年月'
  , BASE_NM varchar(60) comment '拠点'
  , MONTH varchar(60) comment '対象月度'
  , ROW_NO varchar(30) comment '項番'
  , SHIPPING_DT varchar(30) comment '出荷日'
  , FW_CASE_NUM bigint comment 'FW関連_ケース数'
  , FW_PICK_NUM bigint comment 'FW関連_ピッキング数'
  , FW_RATE bigint comment 'FW関連_率'
  , UN_CASE_NUM bigint comment 'UN関連_ケース数'
  , UN_PICK_NUM bigint comment 'UN関連_ピッキング数'
  , UN_RATE bigint comment 'UN関連_率'
  , SH_CASE_NUM bigint comment 'SH関連_ケース数'
  , SH_PICK_NUM bigint comment 'SH関連_ピッキング数'
  , SH_RATE bigint comment 'SH関連_率'
  , HM_CASE_NUM bigint comment 'HM関連_ケース数'
  , HM_PICK_NUM bigint comment 'HM関連_ピッキング数'
  , HM_RATE bigint comment 'HM関連_率'
  , TOTAL_CASE_NUM bigint comment '当日合計_ケース数'
  , TOTAL_PICK_NUM bigint comment '当日合計_ピッキング数'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_BLDL5052_PK primary key (BLDL5052_ID)
) comment 'BLDL5052' ;

-- BLDL5060
create table T_BLDL5060 (
  BLDL5060_ID bigint not null comment 'BLDL5060ID'
  , YEARMONTH varchar(30) comment '年月'
  , BASE_NM varchar(60) comment '拠点'
  , MONTH varchar(60) comment '対象月度'
  , ROW_NO varchar(30) comment '項番'
  , RETURN_DT varchar(30) comment '返品受入日'
  , FW_RETURN_CNT bigint comment 'FW_返品件数'
  , FW_RETURN_NUM bigint comment 'FW_返品数量'
  , UN_RETURN_CNT bigint comment 'UN_返品件数'
  , UN_RETURN_NUM bigint comment 'UN_返品数量'
  , SH_RETURN_CNT bigint comment 'SH_返品件数'
  , SH_RETURN_NUM bigint comment 'SH_返品数量'
  , HM_RETURN_CNT bigint comment 'HM関連_返品件数'
  , HM_RETURN_NUM bigint comment 'HM関連_返品数量'
  , TOTAL_RETURN_CNT bigint comment '合計返品件数'
  , TOTAL_RETURN_NUM bigint comment '合計返品数量'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_BLDL5060_PK primary key (BLDL5060_ID)
) comment 'BLDL5060' ;

-- BLDL5100
create table T_BLDL5100 (
  BLDL5100_ID bigint not null comment 'BLDL5100ID'
  , YEARMONTH varchar(30) comment '年月'
  , BASE_NM varchar(60) comment '拠点'
  , MONTH varchar(60) comment '対象月度'
  , CARRIER_CD varchar(30) comment '運送会社CD'
  , CARRIER_NM varchar(30) comment '運送会社名'
  , SHIPPING_DT varchar(30) comment '出荷日'
  , FW_STORE bigint comment 'FW店送り'
  , FW_DIRECT bigint comment 'FW直送'
  , UN_STORE bigint comment 'UN店送り'
  , UN_DIRECT bigint comment 'UN直送'
  , SH_STORE bigint comment 'SH店送り'
  , SH_DIRECT bigint comment 'SH直送'
  , HM_STORE bigint comment 'HM店送り'
  , HM_DIRECT bigint comment 'HM直送'
  , TOTAL_STORE bigint comment '店送り合計'
  , TOTAL_DIRECT bigint comment '直送合計'
  , KOGUCHI_INCLUDE bigint comment '戸口配送(建設分を含む)'
  , KOGUCHI_CONST bigint comment '戸口配送(建設分)'
  , TOTAL_PACK_NUM bigint comment '総梱包数'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_BLDL5100_PK primary key (BLDL5100_ID)
) comment 'BLDL5100' ;

-- BLDL5110
create table T_BLDL5110 (
  BLDL5110_ID bigint not null comment 'BLDL5110ID'
  , YEARMONTH varchar(30) comment '年月'
  , BASE_NM varchar(60) comment '拠点'
  , MONTH varchar(60) comment '対象月度'
  , CARRIER_CD varchar(30) comment '運送会社CD'
  , CARRIER_NM varchar(30) comment '運送会社名'
  , SHIPPING_DT varchar(30) comment '出荷日'
  , FW_STORE bigint comment 'FW店送'
  , FW_DIRECT bigint comment 'FW直送'
  , UN_STORE bigint comment 'UN店送'
  , UN_DIRECT bigint comment 'UN直送'
  , SH_STORE bigint comment 'SH店送'
  , SH_DIRECT bigint comment 'SH直送'
  , HM_STORE bigint comment 'HM店送'
  , HM_DIRECT bigint comment 'HM直送'
  , TOTAL_STORE bigint comment '店送合計'
  , TOTAL_DIRECT bigint comment '直送合計'
  , KOGUCHI_INCLUDE bigint comment '戸口配送(建設分を含む)'
  , KOGUCHI_CONST bigint comment '戸口配送(建設分)'
  , TOTAL_PACK_NUM bigint comment '総梱包数'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_BLDL5110_PK primary key (BLDL5110_ID)
) comment 'BLDL5110' ;

-- BLDL5120
create table T_BLDL5120 (
  BLDL5120_ID bigint not null comment 'BLDL5120ID'
  , YEARMONTH varchar(30) comment '年月'
  , MONTH varchar(60) comment '対象月度'
  , CARRIER_CD varchar(30) comment '運送会社CD'
  , CARRIER_NM varchar(60) comment '運送会社名'
  , ROW_NO varchar(30) comment '項番'
  , SHIPPING_DT varchar(8) comment '出荷日'
  , KAMATA_STORE bigint comment '蓮田物流_店送り'
  , KAMATA_DIRECT bigint comment '蓮田物流_直送'
  , KASHIWA_STORE bigint comment '柏SRC_店送り'
  , KASHIWA_DIRECT bigint comment '柏SRC_直送'
  , STORE_TOTAL bigint comment '店送り合計'
  , DIRECT_TOTAL bigint comment '直送合計'
  , TOTAL_PACK_NUM bigint comment '総梱包数'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_BLDL5120_PK primary key (BLDL5120_ID)
) comment 'BLDL5120' ;

-- BLDL5125
create table T_BLDL5125 (
  BLDL5125_ID bigint not null comment 'BLDL5125ID'
  , YEARMONTH varchar(30) comment '年月'
  , MONTH varchar(60) comment '対象月度'
  , CARRIER_CD varchar(30) comment '運送業者CD'
  , CARRIER_NM varchar(60) comment '運送業者名'
  , ROW_NO varchar(30) comment '項番'
  , SHIPPING_DT varchar(8) comment '出荷日'
  , KOSHIGAYA_STORE bigint comment '越谷US_店送り'
  , KOSHIGAYA_DIRECT bigint comment '越谷US_直送'
  , TOTAL_PACK_NUM bigint comment '総梱包数'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_BLDL5125_PK primary key (BLDL5125_ID)
) comment 'BLDL5125' ;

-- BLDL5130
create table T_BLDL5130 (
  BLDL5130_ID bigint not null comment 'BLDL5130ID'
  , YEARMONTH varchar(30) comment '年月'
  , BASE_NM varchar(60) comment '拠点'
  , MONTH varchar(60) comment '対象月度'
  , CARRIER_CD varchar(30) comment '運送会社CD'
  , CARRIER_NM varchar(60) comment '運送会社名'
  , ROW_NO varchar(30) comment '項番'
  , SHIPPING_DT varchar(8) comment '出荷日'
  , FW_STORE bigint comment 'FW店送り'
  , FW_DIRECT bigint comment 'FW直送'
  , FW_TRANFER bigint comment 'FW転送'
  , SH_STORE bigint comment 'SH店送り'
  , SH_DIRECT bigint comment 'SH直送'
  , SH_TRANFER bigint comment 'SH転送'
  , STORE_TOTAL bigint comment '店送り合計'
  , DIRECT_TOTAL bigint comment '直送合計'
  , TRANSFER_TOTAL bigint comment '転送合計'
  , KOGUCHI_DELIV bigint comment '戸口配送'
  , TOTAL_PACK_NUM bigint comment '総梱包数'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_BLDL5130_PK primary key (BLDL5130_ID)
) comment 'BLDL5130' ;

-- BLDL5150
create table T_BLDL5150 (
  BLDL5150_ID bigint not null comment 'BLDL5150ID'
  , YEARMONTH varchar(30) comment '年月'
  , BASE_NM varchar(60) comment '拠点'
  , MONTH varchar(60) comment '対象月度'
  , ROW_NO varchar(30) comment '項番'
  , RECEIVE_DT varchar(8) comment '入荷日'
  , FW_RCV_CNT bigint comment 'FW_入荷件数'
  , FW_RCV_NUM bigint comment 'FW_入荷数量'
  , FW_CASE_NUM bigint comment 'FW_ケース数'
  , UN_RCV_CNT bigint comment 'UN_入荷件数'
  , UN_RCV_NUM bigint comment 'UN_入荷数量'
  , UN_CASE_NUM bigint comment 'UN_ケース数'
  , SH_RCV_CNT bigint comment 'SH_入荷件数'
  , SH_RCV_NUM bigint comment 'SH_入荷数量'
  , SH_CASE_NUM bigint comment 'SH_ケース数'
  , HM_RCV_CNT bigint comment 'HM_入荷件数'
  , HM_RCV_NUM bigint comment 'HM_入荷数量'
  , HM_CASE_NUM bigint comment 'HM_ケース数'
  , TOTAL_RCV_NUM bigint comment '当日合計入荷数'
  , TOTAL_CASE_NUM bigint comment '当日合計ケース数'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_BLDL5150_PK primary key (BLDL5150_ID)
) comment 'BLDL5150' ;

-- BLDL5151
create table T_BLDL5151 (
  BLDL5151_ID bigint not null comment 'BLDL5151ID'
  , YEARMONTH varchar(30) comment '年月'
  , BASE_NM varchar(60) comment '拠点'
  , MONTH varchar(60) comment '対象月度'
  , ROW_NO varchar(30) comment '項番'
  , RECEIVE_DT varchar(8) comment '入荷日'
  , FW_RCV_CNT bigint comment 'FW_入荷件数'
  , FW_RCV_NUM bigint comment 'FW_入荷数量'
  , FW_CASE_NUM bigint comment 'FW_ケース数'
  , UN_RCV_CNT bigint comment 'UN_入荷件数'
  , UN_RCV_NUM bigint comment 'UN_入荷数量'
  , UN_CASE_NUM bigint comment 'UN_ケース数'
  , SH_RCV_CNT bigint comment 'SH_入荷件数'
  , SH_RCV_NUM bigint comment 'SH_入荷数量'
  , SH_CASE_NUM bigint comment 'SH_ケース数'
  , HM_RCV_CNT bigint comment 'HM_入荷件数'
  , HM_RCV_NUM bigint comment 'HM_入荷数量'
  , HM_CASE_NUM bigint comment 'HM_ケース数'
  , TOTAL_RCV_NUM bigint comment '当日合計_入荷数'
  , TOTAL_CASE_NUM bigint comment '当日合計_ケース数'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_BLDL5151_PK primary key (BLDL5151_ID)
) comment 'BLDL5151' ;

-- BLDL5160
create table T_BLDL5160 (
  BLDL5160_ID bigint not null comment 'BLDL5160ID'
  , YEARMONTH varchar(30) comment '年月'
  , BASE_NM varchar(60) comment '拠点'
  , MONTH varchar(60) comment '対象月度'
  , ROW_NO varchar(30) comment '項番'
  , RECEIVE_DT varchar(8) comment '入荷日'
  , FW_RECEIVE_CNT bigint comment 'FW関連_入荷件数'
  , FW_RECEIVE_NUM bigint comment 'FW関連_入荷数量'
  , FW_CASE_NUM bigint comment 'FW関連_ケース数'
  , UN_RECEIVE_CNT bigint comment 'UN関連_入荷件数'
  , UN_RECEIVE_NUM bigint comment 'UN関連_入荷数量'
  , UN_CASE_NUM bigint comment 'UN関連_ケース数'
  , SH_RECEIVE_CNT bigint comment 'SH関連_入荷件数'
  , SH_RECEIVE_NUM bigint comment 'SH関連_入荷数量'
  , SH_CASE_NUM bigint comment 'SH関連_ケース数'
  , TOTAL_RECEIVE_NUM bigint comment '当日合計入荷数'
  , TOTAL_CASE_NUM bigint comment '当日合計ケース数'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_BLDL5160_PK primary key (BLDL5160_ID)
) comment 'BLDL5160' ;

-- BLDL5170
create table T_BLDL5170 (
  BLDL5170_ID bigint not null comment 'BLDL5170ID'
  , YEARMONTH varchar(30) comment '年月'
  , BASE_NM varchar(60) comment '拠点'
  , MONTH varchar(60) comment '対象月度'
  , ROW_NO varchar(30) comment '項番'
  , RECEIVE_DT varchar(8) comment '入荷日'
  , FW_RECEIVE_CNT bigint comment 'FW関連_入荷件数'
  , FW_RECEIVE_NUM bigint comment 'FW関連_入荷数量'
  , FW_CASE_NUM bigint comment 'FW関連_ケース数'
  , UN_RECEIVE_CNT bigint comment 'UN関連_入荷件数'
  , UN_RECEIVE_NUM bigint comment 'UN関連_入荷数量'
  , UN_CASE_NUM bigint comment 'UN関連_ケース数'
  , SH_RECEIVE_CNT bigint comment 'SH関連_入荷件数'
  , SH_RECEIVE_NUM bigint comment 'SH関連_入荷数量'
  , SH_CASE_NUM bigint comment 'SH関連_ケース数'
  , TOTAL_RECEIVE_NUM bigint comment '当日合計入荷数'
  , TOTAL_CASE_NUM bigint comment '当日合計ケース数'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_BLDL5170_PK primary key (BLDL5170_ID)
) comment 'BLDL5170' ;

-- BLDL5175
create table T_BLDL5175 (
  BLDL5175_ID bigint not null comment 'BLDL5175ID'
  , YEARMONTH varchar(30) comment '年月'
  , BASE_NM varchar(60) comment '拠点'
  , MONTH varchar(60) comment '対象月度'
  , ROW_NO varchar(30) comment '項番'
  , RECEIVE_DT varchar(8) comment '入荷日'
  , FW_RECEIVE_CNT bigint comment 'FW関連_入荷件数'
  , FW_RECEIVE_NUM bigint comment 'FW関連_入荷数量'
  , FW_CASE_NUM bigint comment 'FW関連_ケース数'
  , UN_RECEIVE_CNT bigint comment 'UN関連_入荷件数'
  , UN_RECEIVE_NUM bigint comment 'UN関連_入荷数量'
  , UN_CASE_NUM bigint comment 'UN関連_ケース数'
  , SH_RECEIVE_CNT bigint comment 'SH関連_入荷件数'
  , SH_RECEIVE_NUM bigint comment 'SH関連_入荷数量'
  , SH_CASE_NUM bigint comment 'SH関連_ケース数'
  , TOTAL_RECEIVE_NUM bigint comment '当日合計入荷数'
  , TOTAL_CASE_NUM bigint comment '当日合計ケース数'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_BLDL5175_PK primary key (BLDL5175_ID)
) comment 'BLDL5175' ;

-- BLDL5180
create table T_BLDL5180 (
  BLDL5180_ID bigint not null comment 'BLDL5180ID'
  , YEARMONTH varchar(30) comment '年月'
  , MONTH varchar(60) comment '対象月度'
  , ROW_NO varchar(30) comment '項番'
  , RECEIVE_DT varchar(8) comment '入荷日'
  , KOSHIGAYA_RECEIVE_CNT bigint comment '越谷US_入荷件数'
  , KOSHIGAYA_RECEIVE_NUM bigint comment '越谷US_入荷数量'
  , KOSHIGAYA_CASE_NUM bigint comment '越谷US_ケース数'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_BLDL5180_PK primary key (BLDL5180_ID)
) comment 'BLDL5180' ;

-- BLDL5250
create table T_BLDL5250 (
  BLDL5250_ID bigint not null comment 'BLDL5250ID'
  , YEARMONTH varchar(30) comment '年月'
  , BASE_NM varchar(60) comment '拠点'
  , MONTH varchar(60) comment '対象月度'
  , TRANSFER_TYPE_CD varchar(30) comment '移動種別'
  , TRANSFER_DT varchar(8) comment '移動日'
  , BEFORE_LOC_CD varchar(30) comment '移動元ロケ'
  , AFTER_LOC_CD varchar(30) comment '移動先ロケ'
  , PRODUCT_CD varchar(30) comment '商品CD'
  , PRODUCT_NM varchar(60) comment '商品名称'
  , NUM bigint comment '数量'
  , CASE_NUM bigint comment 'ケース数'
  , UNIT_NUM bigint comment '入数'
  , USER_NM varchar(60) comment '作業者名称'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_BLDL5250_PK primary key (BLDL5250_ID)
) comment 'BLDL5250' ;

-- BLDL5310
create table T_BLDL5310 (
  BLDL5310_ID bigint not null comment 'BLDL5310ID'
  , YEARMONTH varchar(30) comment '年月'
  , MONTH varchar(60) comment '対象月度'
  , ROW_NO varchar(30) comment '項番'
  , SALES_ORG_CD varchar(30) comment '販売組織CD'
  , SALES_ORG_NM varchar(60) comment '販売組織名称'
  , SHIPPING_DT varchar(8) comment '出荷日'
  , SOUKA_FW_NUM bigint comment '草加C出荷分_FW関連'
  , SOUKA_UN_NUM bigint comment '草加C出荷分_UN関連'
  , SOUKA_SH_NUM bigint comment '草加C出荷分_SH関連'
  , SOUKA_TOTAL_NUM bigint comment '草加C出荷分_合計数量'
  , KOSHIGAYA_FW_NUM bigint comment '越谷C出荷分_FW関連'
  , KOSHIGAYA_UN_NUM bigint comment '越谷C出荷分_UN関連'
  , KOSHIGAYA_SH_NUM bigint comment '越谷C出荷分_SH関連'
  , KOSHIGAYA_TOTAL_NUM bigint comment '越谷C出荷分_合計数量'
  , TOTAL_NUM bigint comment '当日合計数量'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_BLDL5310_PK primary key (BLDL5310_ID)
) comment 'BLDL5310' ;

-- BLDL5312
create table T_BLDL5312 (
  BLDL5312_ID bigint not null comment 'BLDL5312ID'
  , YEARMONTH varchar(30) comment '年月'
  , BASE_NM varchar(60) comment '拠点'
  , MONTH varchar(60) comment '対象月度'
  , ROW_NO varchar(30) comment '項番'
  , SALES_ORG_CD varchar(30) comment '販売組織CD'
  , SALES_ORG_NM varchar(60) comment '販売組織名称'
  , SHIPPING_DT varchar(8) comment '出荷日'
  , PRODUCT_CD varchar(30) comment '商品CD'
  , PRODUCT_NM varchar(60) comment '商品名称'
  , SHIPPING_CNT bigint comment '出荷点数'
  , UNIT_NUM bigint comment '入数'
  , CASE_NUM bigint comment 'ケース数'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_BLDL5312_PK primary key (BLDL5312_ID)
) comment 'BLDL5312' ;

-- BLDL5313
create table T_BLDL5313 (
  BLDL5313_ID bigint not null comment 'BLDL5313ID'
  , YEARMONTH varchar(30) comment '年月'
  , BASE_NM varchar(60) comment '拠点'
  , MONTH varchar(60) comment '対象月度'
  , SALES_ORG_CD varchar(30) comment '販売組織コード'
  , SALES_ORG_NM varchar(60) comment '販売組織名称'
  , PRODUCT_CD varchar(30) comment '商品コード'
  , PRODUCT_NM varchar(60) comment '商品名称'
  , SHIPPING_DT varchar(8) comment '出荷日'
  , SHIPPING_NUM bigint comment '出荷数'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_BLDL5313_PK primary key (BLDL5313_ID)
) comment 'BLDL5313' ;

-- BLDL5315
create table T_BLDL5315 (
  BLDL5315_ID bigint not null comment 'BLDL5315ID'
  , YEARMONTH varchar(30) comment '年月'
  , BASE_NM varchar(60) comment '拠点'
  , MONTH varchar(60) comment '対象月度'
  , ROW_NO varchar(30) comment '項番'
  , SALES_ORG_CD varchar(30) comment '販売組織CD'
  , SALES_ORG_NM varchar(60) comment '販売組織名称'
  , SHIPPING_DT varchar(8) comment '出荷日'
  , SAGAWA_FW_NUM bigint comment '佐川L出荷分_FW関連'
  , SAGAWA_UN_NUM bigint comment '佐川L出荷分_UN関連'
  , SAGAWA_SH_NUM bigint comment '佐川L出荷分_SH関連'
  , SAGAWA_TOTAL_NUM bigint comment '佐川L出荷分_合計数量'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_BLDL5315_PK primary key (BLDL5315_ID)
) comment 'BLDL5315' ;

-- BLDL5340
create table T_BLDL5340 (
  BLDL5340_ID bigint not null comment 'BLDL5340ID'
  , YEARMONTH varchar(30) comment '年月'
  , MONTH varchar(60) comment '対象月度'
  , SALES_ORG_CD varchar(30) comment '販売組織CD'
  , SALES_ORG_NM varchar(60) comment '販売組織名称'
  , RELATED_CATEGORY varchar(30) comment '関連品種'
  , ROW_NO varchar(30) comment '項番'
  , PRODUCT_CD varchar(30) comment '商品コード'
  , DEPOSIT_JAN_CD varchar(30) comment '預りJANコード'
  , PRODUCT_NM varchar(60) comment '商品名称'
  , DEPOSIT_STOCK_NUM bigint comment '預り在庫数'
  , DEPOSIT_WH_NM varchar(60) comment '預り倉庫'
  , DEPOSIT_USER_NM varchar(60) comment '預りユーザー名'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_BLDL5340_PK primary key (BLDL5340_ID)
) comment 'BLDL5340' ;

-- BLDL5351
create table T_BLDL5351 (
  BLDL5351_ID bigint not null comment 'BLDL5351ID'
  , YEARMONTH varchar(30) comment '年月'
  , MONTH varchar(60) comment '対象月度'
  , SALES_ORG_CD varchar(30) comment '販売組織CD'
  , SALES_ORG_NM varchar(60) comment '販売組織名称'
  , ROW_NO varchar(30) comment '項番'
  , DATE varchar(30) comment '日付'
  , HOLIDAY varchar(30) comment '休日'
  , SOUKA_FW_NUM bigint comment '草加C在庫分_FW関連'
  , SOUKA_UN_NUM bigint comment '草加C在庫分_UN関連'
  , SOUKA_SH_NUM bigint comment '草加C在庫分_SH関連'
  , SOUKA_TOTAL_NUM bigint comment '草加C在庫分_合計数量'
  , KOSHIGAYA_FW_NUM bigint comment '越谷C在庫分_FW関連'
  , KOSHIGAYA_UN_NUM bigint comment '越谷C在庫分_UN関連'
  , KOSHIGAYA_SH_NUM bigint comment '越谷C在庫分_SH関連'
  , KOSHIGAYA_TOTAL_NUM bigint comment '越谷C在庫分_合計数量'
  , OTHER_TOTAL_NUM bigint comment '他倉庫_合計数量'
  , TOTAL_NUM bigint comment '当日合計数量'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_BLDL5351_PK primary key (BLDL5351_ID)
) comment 'BLDL5351' ;

-- BLDL5352
create table T_BLDL5352 (
  BLDL5352_ID bigint not null comment 'BLDL5352ID'
  , YEARMONTH varchar(30) comment '年月'
  , MONTH varchar(60) comment '対象月度'
  , SALES_ORG_CD varchar(30) comment '販売組織CD'
  , SALES_ORG_NM varchar(60) comment '販売組織名称'
  , ROW_NO varchar(30) comment '項番'
  , DATE varchar(30) comment '日付'
  , HOLIDAY varchar(30) comment '休日'
  , SOUKA_FW_NUM bigint comment '草加C在庫分_FW関連'
  , SOUKA_UN_NUM bigint comment '草加C在庫分_UN関連'
  , SOUKA_SH_NUM bigint comment '草加C在庫分_SH関連'
  , SOUKA_TOTAL_NUM bigint comment '草加C在庫分_合計数量'
  , KOSHIGAYA_FW_NUM bigint comment 'SG柏在庫分_FW関連'
  , KOSHIGAYA_UN_NUM bigint comment 'SG柏在庫分_UN関連'
  , KOSHIGAYA_SH_NUM bigint comment 'SG柏在庫分_SH関連'
  , KOSHIGAYA_TOTAL_NUM bigint comment 'SG柏在庫分_合計数量'
  , TOTAL_NUM bigint comment '当日合計数量'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_BLDL5352_PK primary key (BLDL5352_ID)
) comment 'BLDL5352' ;

-- BLDL5353
create table T_BLDL5353 (
  BLDL5353_ID bigint not null comment 'BLDL5353ID'
  , YEARMONTH varchar(30) comment '年月'
  , MONTH varchar(60) comment '対象月度'
  , SALES_ORG_CD varchar(30) comment '販売組織CD'
  , SALES_ORG_NM varchar(60) comment '販売組織名称'
  , ROW_NO varchar(30) comment '項番'
  , DATE varchar(30) comment '日付'
  , HOLIDAY varchar(30) comment '休日'
  , SOUKA_FW_NUM bigint comment '草加C在庫分_FW関連'
  , SOUKA_UN_NUM bigint comment '草加C在庫分_UN関連'
  , SOUKA_SH_NUM bigint comment '草加C在庫分_SH関連'
  , SOUKA_TOTAL_NUM bigint comment '草加C在庫分_合計数量'
  , KOSHIGAYA_FW_NUM bigint comment 'SG柏在庫分_FW関連'
  , KOSHIGAYA_UN_NUM bigint comment 'SG柏在庫分_UN関連'
  , KOSHIGAYA_SH_NUM bigint comment 'SG柏在庫分_SH関連'
  , KOSHIGAYA_TOTAL_NUM bigint comment 'SG柏在庫分_合計数量'
  , TOTAL_NUM bigint comment '当日合計数量'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_BLDL5353_PK primary key (BLDL5353_ID)
) comment 'BLDL5353' ;

-- BLDL5430
create table T_BLDL5430 (
  BLDL5430_ID bigint not null comment 'BLDL5430ID'
  , YEARMONTH varchar(30) comment '年月'
  , MONTH varchar(60) comment '対象月度'
  , SHIPPING_DT varchar(8) comment '出荷日'
  , DESTINATION_NM1 varchar(60) comment '送り先名称1'
  , DESTINATION_NM2 varchar(60) comment '送り先名称2'
  , PRODUCT_CD varchar(30) comment '商品コード'
  , PRODUCT_NM varchar(60) comment '商品名称'
  , SHIPPING_NUM bigint comment '出荷数'
  , KOHAI_CUSTOMER_NM varchar(60) comment '戸配登録先'
  , NIZOROE_CNT bigint comment '荷揃件数'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_BLDL5430_PK primary key (BLDL5430_ID)
) comment 'BLDL5430' ;

-- BLDL5610
create table T_BLDL5610 (
  BLDL5610_ID bigint not null comment 'BLDL5610ID'
  , YEARMONTH varchar(30) comment '年月'
  , BASE_NM varchar(60) comment '拠点'
  , MONTH varchar(60) comment '対象月度'
  , ROW_NO varchar(30) comment '項番'
  , DATE varchar(8) comment '日付'
  , HOLIDAY varchar(8) comment '休日'
  , HASUDA_NUM bigint comment '蓮田物流'
  , KASHIWA_NUM bigint comment '柏SRC'
  , TOTAL_NUM bigint comment '当日合計数量'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_BLDL5610_PK primary key (BLDL5610_ID)
) comment 'BLDL5610' ;

-- BLDL5615
create table T_BLDL5615 (
  BLDL5615_ID bigint not null comment 'BLDL5615ID'
  , YEARMONTH varchar(30) comment '年月'
  , BASE_NM varchar(60) comment '拠点'
  , MONTH varchar(60) comment '対象月度'
  , ROW_NO varchar(30) comment '項番'
  , DATE varchar(30) comment '日付'
  , HOLIDAY varchar(30) comment '休日'
  , FW_NUM bigint comment 'FW関連'
  , UN_NUM bigint comment 'UN関連'
  , SH_NUM bigint comment 'SH関連'
  , TOTAL_NUM bigint comment '当日合計数量'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_BLDL5615_PK primary key (BLDL5615_ID)
) comment 'BLDL5615' ;

-- BLDL5620
create table T_BLDL5620 (
  BLDL5620_ID bigint not null comment 'BLDL5620ID'
  , YEARMONTH varchar(30) comment '年月'
  , BASE_NM varchar(60) comment '拠点'
  , MONTH varchar(60) comment '対象月度'
  , ROW_NO varchar(30) comment '項番'
  , SHIPPING_DT varchar(8) comment '出荷日'
  , FW_SHIPPING_CNT bigint comment 'FW関連_出荷件数'
  , FW_SHIPPING_NUM bigint comment 'FW関連_出荷数量'
  , UN_SHIPPING_CNT bigint comment 'UN関連_出荷件数'
  , UN_SHIPPING_NUM bigint comment 'UN関連_出荷数量'
  , SH_SHIPPING_CNT bigint comment 'SH関連_出荷件数'
  , SH_SHIPPING_NUM bigint comment 'SH関連_出荷数量'
  , TOTAL_SHIPPING_CNT bigint comment '当日合計_出荷件数'
  , TOTAL_SHIPPING_NUM bigint comment '当日合計_出荷数量'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_BLDL5620_PK primary key (BLDL5620_ID)
) comment 'BLDL5620' ;

-- BLDL5625
create table T_BLDL5625 (
  BLDL5625_ID bigint not null comment 'BLDL5625ID'
  , YEARMONTH varchar(30) comment '年月'
  , BASE_NM varchar(60) comment '拠点'
  , MONTH varchar(60) comment '対象月度'
  , ROW_NO varchar(30) comment '項番'
  , SHIPPING_DT varchar(8) comment '出荷日'
  , FW_SHIPPING_CNT bigint comment 'FW関連_出荷件数'
  , FW_SHIPPING_NUM bigint comment 'FW関連_出荷数量'
  , UN_SHIPPING_CNT bigint comment 'UN関連_出荷件数'
  , UN_SHIPPING_NUM bigint comment 'UN関連_出荷数量'
  , SH_SHIPPING_CNT bigint comment 'SH関連_出荷件数'
  , SH_SHIPPING_NUM bigint comment 'SH関連_出荷数量'
  , TOTAL_SHIPPING_CNT bigint comment '当日合計_出荷件数'
  , TOTAL_SHIPPING_NUM bigint comment '当日合計_出荷数量'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_BLDL5625_PK primary key (BLDL5625_ID)
) comment 'BLDL5625' ;

-- BLDL5630
create table T_BLDL5630 (
  BLDL5630_ID bigint not null comment 'BLDL5630ID'
  , YEARMONTH varchar(30) comment '年月'
  , MONTH varchar(60) comment '対象月度'
  , ROW_NO varchar(30) comment '項番'
  , DATE varchar(30) comment '日付'
  , HOLIDAY varchar(30) comment '休日'
  , KOSHIGAYA_US bigint comment '越谷US'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_BLDL5630_PK primary key (BLDL5630_ID)
) comment 'BLDL5630' ;

-- BLDL5640
create table T_BLDL5640 (
  BLDL5640_ID bigint not null comment 'BLDL5640ID'
  , YEARMONTH varchar(30) comment '年月'
  , MONTH varchar(60) comment '対象月度'
  , ROW_NO varchar(30) comment '項番'
  , SHIPPING_DT varchar(8) comment '出荷日'
  , KOSHIGAYA_SHIPPING_CNT bigint comment '越谷US_出荷件数'
  , KOSHIGAYA_SHIPPING_NUM bigint comment '越谷US_出荷数量'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_BLDL5640_PK primary key (BLDL5640_ID)
) comment 'BLDL5640' ;

-- BLDL5650
create table T_BLDL5650 (
  BLDL5650_ID bigint not null comment 'BLDL5650ID'
  , YEARMONTH varchar(30) comment '年月'
  , BASE_NM varchar(60) comment '拠点'
  , MONTH varchar(60) comment '対象月度'
  , ROW_NO varchar(30) comment '項番'
  , DATE varchar(8) comment '日付'
  , HOLIDAY varchar(8) comment '休日'
  , FW_NUM bigint comment 'FW関連'
  , UN_NUM bigint comment 'UN関連'
  , SH_NUM bigint comment 'SH関連'
  , TOTAL_NUM bigint comment '当日合計数量'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_BLDL5650_PK primary key (BLDL5650_ID)
) comment 'BLDL5650' ;

-- BLDL5660
create table T_BLDL5660 (
  BLDL5660_ID bigint not null comment 'BLDL5660ID'
  , YEARMONTH varchar(30) comment '年月'
  , BASE_NM varchar(60) comment '拠点'
  , MONTH varchar(60) comment '対象月度'
  , ROW_NO varchar(30) comment '項番'
  , SHIPPING_DT varchar(8) comment '出荷日'
  , FW_SHIPPING_CNT bigint comment 'FW関連_出荷件数'
  , FW_SHIPPING_NUM bigint comment 'FW関連_出荷数量'
  , SH_SHIPPING_CNT bigint comment 'SH関連_出荷件数'
  , SH_SHIPPING_NUM bigint comment 'SH関連_出荷数量'
  , HM_SHIPPING_CNT bigint comment 'HM関連_出荷件数'
  , HM_SHIPPING_NUM bigint comment 'HM関連_出荷数量'
  , TOTAL_SHIPPING_CNT bigint comment '当日合計_出荷件数'
  , TOTAL_SHIPPING_NUM bigint comment '当日合計_出荷数量'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_BLDL5660_PK primary key (BLDL5660_ID)
) comment 'BLDL5660' ;

-- BLDL6760
create table T_BLDL6760 (
  BLDL6760_ID bigint not null comment 'BLDL6760ID'
  , YEARMONTH varchar(30) comment '年月'
  , BASE_CD varchar(30) comment '拠点CD'
  , BASE_NM varchar(60) comment '拠点'
  , MONTH varchar(60) comment '対象月度'
  , SALES_ORG_NM varchar(60) comment '販売組織名称'
  , SHIPPING_DT varchar(8) comment '出荷日'
  , NIZOROE_NO varchar(30) comment '荷揃番号'
  , DESTINATION_NM varchar(60) comment '送り先名'
  , SHIPPING_NUM bigint comment '出荷数'
  , SHIPPING_FEE bigint comment '送料'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_BLDL6760_PK primary key (BLDL6760_ID)
) comment 'BLDL6760' ;

-- EC受注ボディ
create table T_EC_ORDER_B (
  EC_ORDER_B_ID bigint not null comment 'EC受注ボディID'
  , EC_ORDER_H_ID bigint comment 'EC受注ヘッダID'
  , PRODUCT_CD varchar(100) comment '商品コード'
  , PRODUCT_NM varchar(255) comment '商品名称'
  , PRODUCT_OPTION varchar(255) comment '商品オプション'
  , ORDER_NUM bigint comment '個数'
  , UNIT_PRICE bigint comment '単価'
  , UNIT_TOTAL_PRICE bigint comment '小計'
  , ERROR_FLG char(1) comment 'エラーフラグ'
  , ERROR_MESSAGE_CD varchar(100) comment 'エラーメッセージCD'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_EC_ORDER_B_PK primary key (EC_ORDER_B_ID)
) comment 'EC受注ボディ' ;

create index T_EC_ORDER_B_IX1
  on T_EC_ORDER_B(EC_ORDER_H_ID);

-- EC受注ヘッダ
create table T_EC_ORDER_H (
  EC_ORDER_H_ID bigint not null comment 'EC受注ヘッダID'
  , CLIENT_ID bigint comment '荷主ID'
  , CENTER_ID bigint comment 'センタID'
  , IMPORT_DT varchar(8) comment '取込日'
  , ORDER_NO varchar(100) comment '受注番号'
  , PRIORITY_FLG char(1) comment '優先フラグ'
  , ORDER_DT varchar(30) comment '注文日'
  , ORDER_TIME varchar(30) comment '注文時刻'
  , DELIV_DT varchar(30) comment 'お届け日指定'
  , DELIV_TZ varchar(30) comment 'お届け時間帯'
  , COMMENT1 varchar(255) comment 'コメント1'
  , COMMENT2 varchar(255) comment 'コメント2'
  , GIFT_FLG char(1) comment 'ギフトフラグ'
  , NOSHI varchar(255) comment 'のし'
  , ORDER_ZIP_CD varchar(30) comment '注文者郵便番号'
  , ORDER_ADDRESS1 varchar(255) comment '注文者住所：都道府県'
  , ORDER_ADDRESS2 varchar(255) comment '注文者住所：都市区'
  , ORDER_ADDRESS3 varchar(255) comment '注文者住所：町以降'
  , ORDER_CUSTOMER_NM varchar(255) comment '注文者名称'
  , ORDER_CUSTOMER_NM_KANA varchar(255) comment '注文者名称カナ'
  , ORDER_TEL_NO varchar(255) comment '注文者電話番号'
  , DELIV_MATCH_FLG char(1) comment '送付先一致フラグ'
  , MERGE_ID varchar(100) comment '名寄せID'
  , MERGE_STATUS varchar(30) comment '名寄せステータス'
  , DELIV_ZIP_CD varchar(30) comment '送付先郵便番号'
  , DELIV_ADDRESS1 varchar(255) comment '送付先住所：都道府県'
  , DELIV_ADDRESS2 varchar(255) comment '送付先住所：都市区'
  , DELIV_ADDRESS3 varchar(255) comment '送付先住所：町以降'
  , INVOICE_DELIV_ADDRESS1 varchar(255) comment '送り状用送付先住所：都道府県'
  , INVOICE_DELIV_ADDRESS2 varchar(255) comment '送り状用送付先住所：都市区'
  , INVOICE_DELIV_ADDRESS3 varchar(255) comment '送り状用送付先住所：町以降'
  , DELIV_CUSTOMER_NM varchar(255) comment '送付先名称'
  , DELIV_CUSTOMER_NM_KANA varchar(255) comment '送付先名称カナ'
  , DELIV_TEL_NO varchar(255) comment '送付先電話番号'
  , DELIV_METHOD varchar(255) comment '配送方法'
  , DELIV_TYPE varchar(255) comment '配送区分'
  , DELIV_COMPANY varchar(255) comment '配送会社'
  , PAYMENT_METHOD varchar(255) comment '決済方法'
  , CARD_TYPE varchar(60) comment 'クレジットカード種類'
  , TOTAL bigint comment '合計'
  , TAX bigint comment '消費税'
  , CARRIAGE bigint comment '送料'
  , COD bigint comment '代引料'
  , TOTAL_AMOUNT bigint comment '合計金額'
  , COUPON_DISCOUNT bigint comment 'クーポン利用額'
  , POINT_DISCOUNT bigint comment 'ポイント利用額'
  , OTHER_DISCOUNT bigint comment 'その他値引額'
  , AMOUNT_BILLED bigint comment '請求金額'
  , MERGE_TOTAL bigint comment '名寄せ商品合計金額'
  , MERGE_CARRIAGE bigint comment '名寄せ送料合計'
  , MERGE_COD bigint comment '名寄せ代引料合計'
  , MERGE_TAX bigint comment '名寄せ消費税合計'
  , MERGE_AMOUNT_BILLED bigint comment '名寄せ請求金額'
  , MERGE_TOTAL_AMOUNT bigint comment '名寄せ合計金額'
  , MERGE_COUPON_DISCOUNT bigint comment '名寄せクーポン利用額合計'
  , MERGE_POINT_DISCOUNT bigint comment '名寄せポイント利用額合計'
  , MERGE_OTHER_DISCOUNT bigint comment '名寄せその他値引額合計'
  , PACKING_QTY bigint comment '個口数'
  , SLIP_ITEM_NM1 longtext comment '品名1'
  , SLIP_ITEM_NM2 varchar(255) comment '品名2'
  , SLIP_ITEM_NM3 varchar(255) comment '品名3'
  , SLIP_ITEM_NM4 varchar(255) comment '品名4'
  , SLIP_ITEM_NM5 varchar(255) comment '品名5'
  , SLIP_ITEM_CD1 varchar(30) comment '品名コード1'
  , SLIP_ITEM_CD2 varchar(30) comment '品名コード2'
  , FREIGHT_HANDLING1 varchar(30) comment '荷扱い1'
  , FREIGHT_HANDLING2 varchar(30) comment '荷扱い2'
  , ARTICLE varchar(255) comment '記事'
  , RECEIVE_ID bigint comment '受信ID'
  , ERROR_FLG char(1) comment 'エラーフラグ'
  , ERROR_MESSAGE_CD varchar(100) comment 'エラーメッセージCD'
  , IMPORT_FLG char(1) comment '取込フラグ'
  , IMPORT_TYPE_ID bigint comment '取込種別ID'
  , SHIPPING_INST_H_ID bigint comment '出荷指示ヘッダID'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_EC_ORDER_H_PK primary key (EC_ORDER_H_ID)
) comment 'EC受注ヘッダ' ;

create index T_EC_ORDER_H_IX1
  on T_EC_ORDER_H(ORDER_NO);

create index T_EC_ORDER_H_IX2
  on T_EC_ORDER_H(IMPORT_DT);

create index T_EC_ORDER_H_IX3
  on T_EC_ORDER_H(IMPORT_TYPE_ID);

create index T_EC_ORDER_H_IX4
  on T_EC_ORDER_H(SHIPPING_INST_H_ID);

create index T_EC_ORDER_H_IX5
  on T_EC_ORDER_H(MERGE_ID);

-- EC受注帳票
create table T_EC_ORDER_R (
  EC_ORDER_H_ID bigint not null comment 'EC受注ヘッダID'
  , STATEMENT_OUT_FLG char(1) comment '納品書出力フラグ'
  , STATEMENT_OUT_USER_ID bigint comment '納品書出力者ID'
  , STATEMENT_OUT_DT datetime(3) comment '納品書出力日時'
  , INVOICE_CREATE_FLG char(1) comment '送り状データ作成フラグ'
  , INVOICE_CREATE_DT datetime(3) comment '送り状データ作成日時'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_EC_ORDER_R_PK primary key (EC_ORDER_H_ID)
) comment 'EC受注帳票' ;

create index T_EC_ORDER_R_IX1
  on T_EC_ORDER_R(STATEMENT_OUT_USER_ID);

-- HT通信制御
create table T_HT_COMCTL (
  HT_COMCTL_ID bigint not null comment '通信制御ID'
  , MAC_ADDRESS varchar(60) comment 'MACアドレス'
  , CLIENT_ID bigint comment '荷主ID'
  , CLIENT_CD varchar(30) comment '荷主CD'
  , CENTER_ID bigint comment 'センタID'
  , CENTER_CD varchar(30) comment 'センタCD'
  , HT_DATA_KBN varchar(60) comment 'HTデータ区分'
  , SGY_KEY varchar(60) comment '作業管理キー'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_HT_COMCTL_PK primary key (HT_COMCTL_ID)
) comment 'HT通信制御' ;

create index T_HT_COMCTL_IX1
  on T_HT_COMCTL(MAC_ADDRESS);

-- 個体管理情報
create table T_ID_MANAG_DATA (
  ID_MANAG_DATA_ID bigint not null comment '個体管理情報ID'
  , ID_MANAG_NO varchar(30) comment '個体管理番号'
  , TENHANSHA_CD varchar(30) comment '店販社CD'
  , SALES_ORG_CD varchar(30) comment '販売組織CD'
  , CUSTOMER_CD varchar(30) comment '取引先CD'
  , PRODUCT_CD varchar(30) comment '商品CD'
  , HINMOKU_TEXT varchar(60) comment '品目テキスト'
  , JAN_CD varchar(30) comment 'JANCD'
  , UNIT_NM varchar(30) comment '単位名称'
  , SHARED_PRODUCT_TYPE_CD varchar(30) comment '共有商品区分'
  , CUSTOMER_ORDER_NO varchar(30) comment '取引先注文番号'
  , DELIV_CD varchar(30) comment '納入先CD'
  , DESTINATION_ZIP_CD varchar(30) comment '送り先郵便番号'
  , DESTINATION_ADDRESS1 varchar(255) comment '送り先住所１'
  , DESTINATION_ADDRESS2 varchar(255) comment '送り先住所２'
  , DESTINATION_NM1 varchar(60) comment '送り先名称１'
  , DESTINATION_NM2 varchar(60) comment '送り先名称２'
  , DESTINATION_TEL varchar(30) comment '送り先電話番号'
  , EMP_ID_CD varchar(30) comment '社員識別コード'
  , EMP_NM varchar(60) comment '氏名'
  , STORE_DT varchar(8) comment '入庫日'
  , INVENTORY_DT varchar(8) comment '棚卸日'
  , PICKING_DT varchar(8) comment '出庫日'
  , PRODUCT_RETURN_DT varchar(8) comment '良品返却日'
  , WASTE_RETURN_DT varchar(8) comment '廃棄返却日'
  , ID_MANAG_ABOLITION_TYPE_CD varchar(30) comment '個体管理廃止区分'
  , SPARE_TYPE_CD varchar(30) comment '予備区分'
  , DATA_EXT_FLG_PICKING char(1) comment '提供データ抽出済_出庫'
  , DATA_ADD_DT_PICKING varchar(8) comment '提供データ作成日_出庫'
  , DATA_EXT_FLG_RETURN char(1) comment '提供データ抽出済_良返'
  , DATA_ADD_DT_RETURN varchar(8) comment '提供データ作成日_良返'
  , DATA_EXT_FLG_WASTE char(1) comment '提供データ抽出済_廃棄'
  , DATA_ADD_DT_WASTE varchar(8) comment '提供データ作成日_廃棄'
  , CM_SEND_FLG char(1) default '0' comment '共通管理送信済フラグ'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_ID_MANAG_DATA_PK primary key (ID_MANAG_DATA_ID)
) comment '個体管理情報' ;

-- 棚卸ボディ
create table T_INVENTORY_B (
  INVENTORY_B_ID bigint not null comment '棚卸ボディID'
  , INVENTORY_H_ID bigint not null comment '棚卸ヘッダID'
  , STOCK_ID bigint comment '在庫ID'
  , WAREHOUSE_ID bigint comment '倉庫ID'
  , PRODUCT_ID bigint comment '商品ID'
  , STOCK_TYPE_ID bigint comment '在庫区分ID'
  , LOCATION_ID bigint comment 'ロケーションID'
  , DEPOSIT_ID bigint comment '預託ID'
  , LOT_ID bigint comment 'ロットID'
  , LOT varchar(30) comment 'ロット'
  , LIMIT_DT varchar(8) comment '期限日'
  , STORE_NO_ID bigint comment '入庫No.ID'
  , STORE_LABEL_NO varchar(30) comment '入庫ラベルNo.'
  , STORE_DT varchar(8) comment '入庫日'
  , SUPPLIER_ID bigint comment '仕入先ID'
  , SUPPLIER_CD varchar(30) comment '仕入先CD'
  , SHAPE_ID bigint comment '荷姿ID'
  , UNIT_NUM bigint comment '入数'
  , CHARGE_NUM decimal(14,4) default 0 not null comment '引当可能数'
  , ALLOC_NUM decimal(14,4) default 0 not null comment '引当済数'
  , MOVE_NUM decimal(14,4) default 0 not null comment '移動中数'
  , INVENTORY_NUM decimal(14,4) default 0 not null comment '棚卸数'
  , INPUT_TYPE varchar(30) comment '入力区分'
  , STOCK_ADJUST_FLG char(1) not null comment '在庫調整フラグ'
  , MOVE_INST_H_ID bigint comment '在庫移動指示ヘッダID'
  , HT_INPUT_INVENTORY_NUM decimal(14,4) default 0 comment 'HT入力棚卸数量'
  , WEB_INPUT_INVENTORY_NUM decimal(14,4) default 0 comment '画面入力棚卸数量'
  , AJIS_INPUT_INVENTORY_NUM decimal(14,4) default 0 comment 'エイジス取込棚卸数量'
  , PROD_DT varchar(8) comment '製造日'
  , AREA_CD varchar(30) comment 'エリア'
  , SALES_ORG_ID bigint comment '販売組織ID'
  , ACCOUNT_ID bigint comment '得意先ID'
  , ALLOC_TYPE_CD varchar(30) comment '引当区分'
  , S4_SEND_FLG char(1) default '0' comment 'S4送信済フラグ'
  , CM_SEND_FLG char(1) default '0' comment '共通管理送信済フラグ'
  , INVENTORY_USER_ID bigint comment '棚卸担当者ID'
  , INVENTORY_UPD_USER_ID bigint comment '棚卸変更担当者ID'
  , RECEIVE_DT varchar(8) comment '入荷日'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_INVENTORY_B_PK primary key (INVENTORY_B_ID)
) comment '棚卸ボディ' ;

create index T_INVENTORY_B_IX1
  on T_INVENTORY_B(INVENTORY_H_ID);

create index T_INVENTORY_B_IX2
  on T_INVENTORY_B(STOCK_ID);

create index T_INVENTORY_B_IX3
  on T_INVENTORY_B(PRODUCT_ID);

create index T_INVENTORY_B_IX4
  on T_INVENTORY_B(STOCK_TYPE_ID);

create index T_INVENTORY_B_IX5
  on T_INVENTORY_B(LOCATION_ID);

create index T_INVENTORY_B_IX6
  on T_INVENTORY_B(DEPOSIT_ID);

create index T_INVENTORY_B_IX7
  on T_INVENTORY_B(LOT_ID);

create index T_INVENTORY_B_IX8
  on T_INVENTORY_B(STORE_NO_ID);

create index T_INVENTORY_B_IX9
  on T_INVENTORY_B(SUPPLIER_ID);

create index T_INVENTORY_B_IX10
  on T_INVENTORY_B(SHAPE_ID);

create index T_INVENTORY_B_IX11
  on T_INVENTORY_B(MOVE_INST_H_ID);

create index T_INVENTORY_B_IX12
  on T_INVENTORY_B(STORE_LABEL_NO);

create index T_INVENTORY_B_IX13
  on T_INVENTORY_B(WAREHOUSE_ID);

-- 棚卸ヘッダ
create table T_INVENTORY_H (
  INVENTORY_H_ID bigint not null comment '棚卸ヘッダID'
  , CLIENT_ID bigint not null comment '荷主ID'
  , CENTER_ID bigint not null comment 'センタID'
  , BATCH_NUM bigint not null comment 'バッチNo.'
  , INVENTORY_DT varchar(8) not null comment '棚卸日'
  , PLANT_CD varchar(30) comment 'プラントCD'
  , STORAGE_SPACE_CD varchar(30) comment '保管場所CD'
  , INVENTORY_INST_NO varchar(30) comment '棚卸指示No'
  , INVENTORY_STATUS_TYPE_ID bigint comment '棚卸進捗状況区分ID'
  , INVENTORY_STATUS_TYPE_CD varchar(30) comment '棚卸進捗状況区分'
  , INST_RECV_TIME datetime(3) comment '指示受信時刻'
  , REPORT_SEND_TIME datetime(3) comment '実績送信時刻'
  , INVENTORY_UPDATE_FLG char(1) default '0' comment '棚卸一括確定フラグ'
  , INVENTORY_DATA_STATUS varchar(30) default '00' comment '棚卸データ作成状況'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_INVENTORY_H_PK primary key (INVENTORY_H_ID)
) comment '棚卸ヘッダ' ;

create unique index T_INVENTORY_H_IX1
  on T_INVENTORY_H(CLIENT_ID,CENTER_ID,INVENTORY_DT);

create index T_INVENTORY_H_IX2
  on T_INVENTORY_H(INVENTORY_DT);

-- 棚卸入力履歴
create table T_INVENTORY_INP_HIST (
  INVENTORY_INP_HIST_ID bigint not null comment '棚卸入力履歴ID'
  , INPUT_DT datetime(3) not null comment '入力日時'
  , INVENTORY_B_ID bigint not null comment '棚卸ボディID'
  , INVENTORY_NUM decimal(14,4) default 0 not null comment '棚卸数'
  , LAST_FLG char(1) comment '最新フラグ'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_INVENTORY_INP_HIST_PK primary key (INVENTORY_INP_HIST_ID)
) comment '棚卸入力履歴' ;

create index T_INVENTORY_INP_HIST_IX1
  on T_INVENTORY_INP_HIST(INVENTORY_B_ID);

-- 棚卸指示
create table T_INVENTORY_INST (
  INVENTORY_INST_ID bigint not null comment '棚卸指示ID'
  , INVENTORY_H_ID bigint not null comment '棚卸ヘッダID'
  , DEPOSIT_ID bigint comment '預託ID'
  , STOCK_TYPE_ID bigint comment '在庫区分ID'
  , FROM_LOCATION_CD varchar(30) comment 'FROMロケーションCD'
  , TO_LOCATION_CD varchar(30) comment 'TOロケーションCD'
  , ZONE_ID bigint comment 'ゾーンID'
  , FROM_STOCK_INOUT_DT varchar(8) comment 'FROM受払日'
  , TO_STOCK_INOUT_DT varchar(8) comment 'TO受払日'
  , STOCK_EXIST_ONLY_FLG char(1) comment '在庫有のみフラグ'
  , FISCAL_YEAR varchar(30) comment '会計年度'
  , LP_SEND_FLG char(1) default '0' comment '物流ポータル送信済フラグ'
  , WM_SEND_FLG char(1) default '0' comment 'WMS送信済フラグ'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_INVENTORY_INST_PK primary key (INVENTORY_INST_ID)
) comment '棚卸指示' ;

create index T_INVENTORY_INST_IX1
  on T_INVENTORY_INST(INVENTORY_H_ID);

create index T_INVENTORY_INST_IX2
  on T_INVENTORY_INST(DEPOSIT_ID);

create index T_INVENTORY_INST_IX3
  on T_INVENTORY_INST(STOCK_TYPE_ID);

create index T_INVENTORY_INST_IX4
  on T_INVENTORY_INST(ZONE_ID);

-- 棚卸帳票
create table T_INVENTORY_R (
  INVENTORY_B_ID bigint not null comment '棚卸ボディID'
  , TWL_OUT_FLG char(1) comment '棚卸作業リスト出力フラグ'
  , TWL_OUT_USER_ID bigint comment '棚卸作業リスト出力者ID'
  , TWL_OUT_DT datetime(3) comment '棚卸作業リスト出力日時'
  , INVENTORY_DIFF_OUT_FLG char(1) comment '棚卸在庫差異表出力フラグ'
  , INVENTORY_DIFF_OUT_USER_ID bigint comment '棚卸在庫差異表出力者ID'
  , INVENTORY_DIFF_OUT_DT datetime(3) comment '棚卸在庫差異表出力日時'
  , INVENTORY_RECORD_OUT_FLG char(1) comment '商品別棚卸実績表兼差異表出力フラグ'
  , INVENTORY_RECORD_OUT_USER_ID bigint comment '商品別棚卸実績表兼差異表出力者ID'
  , INVENTORY_RECORD_OUT_DT datetime(3) comment '商品別棚卸実績表兼差異表出力日時'
  , INVENTORY_RECORD_LOC_OUT_FLG char(1) comment '商品別棚卸実績表(LOC表示あり)出力フラグ'
  , INVENTORY_RECORD_LOC_OUT_USER_ID bigint comment '商品別棚卸実績表(LOC表示あり)出力者ID'
  , INVENTORY_RECORD_LOC_OUT_DT datetime(3) comment '商品別棚卸実績表(LOC表示あり)出力日時'
  , STOCK_DIFF_OUT_FLG char(1) comment '在庫差異確認表出力フラグ'
  , STOCK_DIFF_OUT_USER_ID bigint comment '在庫差異確認表出力者ID'
  , STOCK_DIFF_OUT_DT datetime(3) comment '在庫差異確認表出力日時'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_INVENTORY_R_PK primary key (INVENTORY_B_ID)
) comment '棚卸帳票' ;

create index T_INVENTORY_R_IX1
  on T_INVENTORY_R(TWL_OUT_USER_ID);

-- 棚卸入荷ラベル
create table T_INVENTORY_RECEIVE_LABEL (
  INVENTORY_RECEIVE_LABEL_ID bigint not null comment '棚卸入荷ラベルID'
  , INVENTORY_B_ID bigint comment '棚卸ボディID'
  , RECEIVE_LABEL_NO varchar(255) comment '入荷ラベルNo'
  , SCAN_FLG char(1) default '0' comment 'スキャン済フラグ'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_INVENTORY_RECEIVE_LABEL_PK primary key (INVENTORY_RECEIVE_LABEL_ID)
) comment '棚卸入荷ラベル' ;

-- 送り状問合せ番号
create table T_INVOICE_TRACKING (
  INVOICE_TRACKING_ID bigint not null comment '送り状問合せ番号ID'
  , CARRIER_SLIP_NO varchar(30) comment '運送便伝票番号'
  , NIZOROE_NO varchar(30) comment '荷揃番号'
  , SHIPPING_SLIP_NO varchar(30) comment '出荷伝票番号'
  , SHIPPING_DT varchar(8) comment '出荷日'
  , PACKING_NO varchar(30) comment '梱包番号'
  , CARRIER_CD varchar(30) comment '運送業者CD'
  , CARRIER_NM varchar(60) comment '運送業者名称'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_INVOICE_TRACKING_PK primary key (INVOICE_TRACKING_ID)
) comment '送り状問合せ番号' ;

-- 保管ロット管理
create table T_KEEPING_LOT (
  KEEPING_LOT_ID bigint not null comment '保管ロットID'
  , CUSTOMER_ID bigint not null comment '取引先ID'
  , PRODUCT_ID bigint not null comment '商品ID'
  , LOT_ID bigint not null comment 'ロットID'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_KEEPING_LOT_PK primary key (KEEPING_LOT_ID)
) comment '保管ロット管理' ;

create index T_KEEPING_LOT_IX1
  on T_KEEPING_LOT(CUSTOMER_ID);

create index T_KEEPING_LOT_IX2
  on T_KEEPING_LOT(PRODUCT_ID);

create index T_KEEPING_LOT_IX3
  on T_KEEPING_LOT(LOT_ID);

-- 最終ロット管理
create table T_LAST_LOT (
  LAST_LOT_ID bigint not null comment '最終ロットID'
  , CUSTOMER_ID bigint not null comment '取引先ID'
  , PRODUCT_ID bigint not null comment '商品ID'
  , LOT_ID bigint not null comment 'ロットID'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_LAST_LOT_PK primary key (LAST_LOT_ID)
) comment '最終ロット管理' ;

create unique index T_LAST_LOT_IX1
  on T_LAST_LOT(CUSTOMER_ID,PRODUCT_ID);

create index T_LAST_LOT_IX2
  on T_LAST_LOT(PRODUCT_ID);

create index T_LAST_LOT_IX3
  on T_LAST_LOT(LOT_ID);

create index T_LAST_LOT_IX4
  on T_LAST_LOT(CUSTOMER_ID);

-- ロット
create table T_LOT (
  LOT_ID bigint not null comment 'ロットID'
  , PRODUCT_ID bigint not null comment '商品ID'
  , LOT varchar(30) comment 'ロット'
  , LOT_SORT varchar(30) comment 'ロットソート順'
  , LIMIT_DT varchar(8) comment '期限日'
  , PROD_DT varchar(8) comment '製造日'
  , RECEIVE_DT varchar(8) comment '入荷日'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_LOT_PK primary key (LOT_ID)
) comment 'ロット' ;

create index T_LOT_IX1
  on T_LOT(PRODUCT_ID);

create index T_LOT_IX2
  on T_LOT(LOT);

create index T_LOT_IX3
  on T_LOT(LIMIT_DT);

-- 在庫移動指示ボディ
create table T_MOVE_INST_B (
  MOVE_INST_B_ID bigint not null comment '在庫移動指示ボディID'
  , MOVE_INST_H_ID bigint not null comment '在庫移動指示ヘッダID'
  , MOVE_INST_STATUS varchar(30) comment '在庫移動指示ステータス'
  , INOUT_TYPE char(1) not null comment '入出庫区分'
  , WAREHOUSE_ID bigint comment '倉庫ID'
  , WAREHOUSE_CD varchar(30) comment '倉庫CD'
  , PRODUCT_ID bigint comment '商品ID'
  , PRODUCT_CD varchar(100) comment '商品CD'
  , STOCK_TYPE_ID bigint comment '在庫区分ID'
  , STOCK_TYPE_CD varchar(30) comment '在庫区分CD'
  , LOCATION_ID bigint comment 'ロケーションID'
  , LOCATION_CD varchar(30) comment 'ロケーションCD'
  , DEPOSIT_ID bigint comment '預託ID'
  , DEPOSIT_CD varchar(30) comment '預託CD'
  , LOT_ID bigint comment 'ロットID'
  , LOT varchar(30) comment 'ロット'
  , LIMIT_DT varchar(8) comment '期限日'
  , PROD_DT varchar(8) comment '製造日'
  , STORE_NO_ID bigint comment '入庫No.ID'
  , STORE_LABEL_NO varchar(30) comment '入庫ラベルNo.'
  , STORE_DT varchar(8) comment '入庫日'
  , SUPPLIER_ID bigint comment '仕入先ID'
  , SUPPLIER_CD varchar(30) comment '仕入先CD'
  , SHAPE_ID bigint comment '荷姿ID'
  , SHAPE_CD varchar(30) comment '荷姿CD'
  , UNIT_NUM bigint comment '入数'
  , INST_NUM decimal(14,4) default 0 not null comment '指示数'
  , PLANT_CD varchar(30) comment 'プラントCD'
  , STORAGE_SPACE_CD varchar(30) comment '保管場所CD'
  , TRANSFER_TYPE_CD varchar(30) comment '移動タイプCD'
  , TRANSFER_SEND_FLG char(1) comment '振替送信フラグ'
  , SALES_ORG_ID bigint comment '販売組織ID'
  , ACCOUNT_ID bigint comment '得意先ID'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_MOVE_INST_B_PK primary key (MOVE_INST_B_ID)
) comment '在庫移動指示ボディ' ;

create index T_MOVE_INST_B_IX1
  on T_MOVE_INST_B(MOVE_INST_H_ID);

create index T_MOVE_INST_B_IX2
  on T_MOVE_INST_B(PRODUCT_ID);

create index T_MOVE_INST_B_IX3
  on T_MOVE_INST_B(STOCK_TYPE_ID);

create index T_MOVE_INST_B_IX4
  on T_MOVE_INST_B(LOCATION_ID);

create index T_MOVE_INST_B_IX5
  on T_MOVE_INST_B(DEPOSIT_ID);

create index T_MOVE_INST_B_IX6
  on T_MOVE_INST_B(LOT_ID);

create index T_MOVE_INST_B_IX7
  on T_MOVE_INST_B(STORE_NO_ID);

create index T_MOVE_INST_B_IX8
  on T_MOVE_INST_B(SUPPLIER_ID);

create index T_MOVE_INST_B_IX9
  on T_MOVE_INST_B(SHAPE_ID);

create index T_MOVE_INST_B_IX10
  on T_MOVE_INST_B(WAREHOUSE_ID);

create index T_MOVE_INST_B_IX11
  on T_MOVE_INST_B(PRODUCT_CD);

-- 在庫移動指示ヘッダ
create table T_MOVE_INST_H (
  MOVE_INST_H_ID bigint not null comment '在庫移動指示ヘッダID'
  , CLIENT_ID bigint not null comment '荷主ID'
  , CENTER_ID bigint not null comment 'センタID'
  , INST_DT varchar(8) not null comment '指示日'
  , MOVE_SLIP_NO varchar(30) not null comment 'WMS在庫移動伝票No.'
  , PROCESS_TYPE_ID bigint not null comment '処理区分ID'
  , MOVE_INST_STATUS varchar(30) not null comment '在庫移動指示ステータス'
  , INPUT_TYPE varchar(30) not null comment '入力区分'
  , MOVE_INST_COMMENT varchar(255) comment '在庫移動指示備考'
  , SOURCE_BATCH_NO varchar(30) comment '指示元バッチNo.'
  , KOHAI_TYPE_CD varchar(30) comment '戸配区分'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_MOVE_INST_H_PK primary key (MOVE_INST_H_ID)
) comment '在庫移動指示ヘッダ' ;

create index T_MOVE_INST_H_IX1
  on T_MOVE_INST_H(PROCESS_TYPE_ID);

create index T_MOVE_INST_H_IX2
  on T_MOVE_INST_H(INST_DT);

create index T_MOVE_INST_H_IX3
  on T_MOVE_INST_H(MOVE_SLIP_NO);

-- 在庫移動指示帳票
create table T_MOVE_INST_R (
  MOVE_INST_H_ID bigint not null comment '在庫移動指示ヘッダID'
  , INST_OUT_FLG char(1) comment '指示書出力フラグ'
  , INST_OUT_USER_ID bigint comment '指示書出力者ID'
  , INST_OUT_DT datetime(3) comment '指示書出力日時'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_MOVE_INST_R_PK primary key (MOVE_INST_H_ID)
) comment '在庫移動指示帳票' ;

create index T_MOVE_INST_R_IX1
  on T_MOVE_INST_R(INST_OUT_USER_ID);

-- 在庫移動実績ボディ
create table T_MOVE_RECORD_B (
  MOVE_RECORD_B_ID bigint not null comment '在庫移動実績ボディID'
  , MOVE_INST_H_ID bigint not null comment '在庫移動指示ヘッダID'
  , MOVE_INST_B_ID bigint not null comment '在庫移動指示ボディID'
  , PROCESS_NO varchar(30) not null comment '処理No.'
  , LOCATION_ID bigint comment 'ロケーションID'
  , MOVE_DT varchar(8) not null comment '移動日'
  , MOVE_NUM decimal(14,4) comment '在庫移動実績数'
  , STORE_NO_MERGE_FLG char(1) comment '入庫No.マージフラグ'
  , ALL_SHIPPING_FLG char(1) comment '全数出庫フラグ'
  , USER_ID bigint comment '担当者ID'
  , CM_SEND_FLG char(1) default '0' comment '共通管理送信済フラグ'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_MOVE_RECORD_B_PK primary key (MOVE_RECORD_B_ID)
) comment '在庫移動実績ボディ' ;

create index T_MOVE_RECORD_B_IX1
  on T_MOVE_RECORD_B(MOVE_INST_H_ID);

create index T_MOVE_RECORD_B_IX2
  on T_MOVE_RECORD_B(MOVE_INST_B_ID);

create index T_MOVE_RECORD_B_IX3
  on T_MOVE_RECORD_B(LOCATION_ID);

-- 荷揃処理
create table T_NIZOROE (
  NIZOROE_ID bigint not null comment '荷揃処理ID'
  , BASE_CD varchar(30) comment '拠点CD'
  , NIZOROE_PROC_UNIT varchar(30) comment '荷揃処理単位'
  , NIZOROE_TYPE_CD varchar(30) comment '荷揃種別'
  , STATUS varchar(30) comment '実行ステータス'
  , PROC_DT varchar(8) comment '処理日'
  , PROC_START_TIME datetime(3) comment '処理開始時刻'
  , PROC_END_TIME datetime(3) comment '処理終了時刻'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_NIZOROE_PK primary key (NIZOROE_ID)
) comment '荷揃処理' ;

-- 荷揃処理アラームログ
create table T_NIZOROE_ALARM_LOG (
  NIZOROE_ALARM_LOG_ID bigint not null comment '荷揃処理アラームログID'
  , NIZOROE_TYPE_CD varchar(30) comment '荷揃種別'
  , NIZOROE_PROC_UNIT varchar(30) comment '荷揃処理単位'
  , PROC_DT datetime(3) comment '処理日時'
  , PRINT_FLG char(1) comment '発行フラグ'
  , BASE_CD varchar(30) comment '拠点CD'
  , BASE_NM varchar(60) comment '拠点名称'
  , TYPE_CD varchar(30) comment '種別区分'
  , ALARM_TYPE_CD varchar(30) comment 'アラーム区分'
  , NIZOROE_NO varchar(30) comment '荷揃番号'
  , SALES_ORDER_SLIP_NO varchar(30) comment '受注伝票番号'
  , SHIPPING_SLIP_NO varchar(30) comment '出荷伝票番号'
  , SHIPPING_SLIP_ROW_NO varchar(30) comment '出荷伝票明細番号'
  , PRODUCT_ID bigint comment '商品ID'
  , PRODUCT_CD varchar(30) comment '商品CD'
  , PRODUCT_NM varchar(60) comment '商品名称'
  , SALES_ORG_ID bigint comment '販売組織ID'
  , SALES_ORG_CD varchar(30) comment '販売組織CD'
  , SALES_ORG_NM1 varchar(60) comment '販売組織名称1'
  , SALES_ORG_NM2 varchar(60) comment '販売組織名称2'
  , DESTINATION_NM1 varchar(60) comment '送り先名称1'
  , DESTINATION_NM2 varchar(60) comment '送り先名称2'
  , STOCK_OUT_NUM bigint comment '欠品数'
  , OUT_USER_ID bigint comment '出力者ID'
  , OUT_DT datetime(3) comment '出力日時'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_NIZOROE_ALARM_LOG_PK primary key (NIZOROE_ALARM_LOG_ID)
) comment '荷揃処理アラームログ' ;

-- 特殊操作履歴
create table T_OPERATION_LOG (
  OPERATION_LOG_ID bigint not null comment '特殊操作履歴ID'
  , CLIENT_CD varchar(30) comment '荷主CD'
  , CENTER_CD varchar(30) comment 'センタCD'
  , WORK_CD varchar(30) comment '作業CD'
  , WORK_DT varchar(8) comment '作業日時'
  , MAC_ADDRESS varchar(30) comment 'MACアドレス'
  , USER_CD varchar(30) comment 'ユーザCD'
  , TRACE_ITEM varchar(30) comment 'トレース項目'
  , PRODUCT_ID bigint comment '商品ID'
  , JAN_CD varchar(30) comment 'JANCD'
  , PRODUCT_CD varchar(30) comment '商品CD'
  , PRODUCT_NM varchar(60) comment '商品名称'
  , LOCATION_CD varchar(30) comment 'ロケーションCD'
  , LOCATION_NM varchar(60) comment 'ロケーション名称'
  , LOT varchar(30) comment 'ロット'
  , LIMIT_DT varchar(8) comment '期限日'
  , PROD_DT varchar(8) comment '製造日'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_OPERATION_LOG_PK primary key (OPERATION_LOG_ID)
) comment '特殊操作履歴' ;

-- 梱包ボディ
create table T_PACKING_B (
  PACKING_B_ID bigint not null comment '梱包ボディID'
  , PACKING_H_ID bigint not null comment '梱包ヘッダID'
  , PICKING_B_ID bigint comment '出庫ボディID'
  , ALLOC_INST_B_ID bigint comment '引当指示ボディID'
  , PACKING_NUM decimal(14,4) default 0 not null comment '梱包数'
  , PICKING_FLG char(1) default '0' comment '出庫フラグ'
  , INSPECTION_FLG char(1) default '0' comment '検品フラグ'
  , CASE_PICKING_NO varchar(30) comment 'ケースピッキングNo.'
  , SHIPPING_PACKING_ROW_NO varchar(30) comment '出荷梱包明細No'
  , OLD_PACKING_B_ID bigint comment '元梱包ボディID'
  , RECEIVE_LABEL_NO varchar(30) comment '入荷ラベルNo'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_PACKING_B_PK primary key (PACKING_B_ID)
) comment '梱包ボディ' ;

create index T_PACKING_B_IX1
  on T_PACKING_B(PACKING_H_ID);

create index T_PACKING_B_IX2
  on T_PACKING_B(PICKING_B_ID);

create index T_PACKING_B_IX3
  on T_PACKING_B(ALLOC_INST_B_ID);

-- 梱包ヘッダ
create table T_PACKING_H (
  PACKING_H_ID bigint not null comment '梱包ヘッダID'
  , CLIENT_ID bigint not null comment '荷主ID'
  , CENTER_ID bigint not null comment 'センタID'
  , PROCESS_TYPE_ID bigint not null comment '処理区分ID'
  , PACKING_STATUS varchar(30) comment '梱包ステータス'
  , ALLOC_INST_H_ID bigint comment '引当指示ヘッダID'
  , PICKING_H_ID bigint comment '出庫ヘッダID'
  , SHIPPING_PACKING_NO varchar(30) comment '出荷梱包No.'
  , CARRIER_TRACE_NUM varchar(30) comment '貨物追跡No.'
  , BOX_ID bigint comment '荷材ID'
  , GROSS_WEIGHT decimal(14,4) comment '総重量(g)'
  , TOTAL_VOLUME decimal(14,4) comment '総容積(mm3)'
  , MIXED_FLG char(1) default '0' not null comment '混載フラグ'
  , MULTI_PIC_FLG char(1) default '0' not null comment 'マルチピック計算フラグ'
  , CART_NO bigint comment '台車№'
  , BUCKET_COL_NO bigint comment 'バケット列№'
  , BUCKET_ROW_NO bigint comment 'バケット段№'
  , SEEDING_NO varchar(30) comment '種蒔きNo.'
  , LOADING_FLG char(1) default '0' not null comment '積込フラグ'
  , NIZOROE_NO varchar(30) comment '荷揃番号'
  , DAIHYO_NIZOROE_NO varchar(30) comment '代表荷揃番号'
  , NIZOROE_NO2 varchar(30) comment '荷揃番号_ハイフンあり'
  , DAIHYO_NIZOROE_NO2 varchar(30) comment '代表荷揃番号_ハイフンあり'
  , CM_SEND_FLG char(1) comment '共通管理送信済フラグ'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_PACKING_H_PK primary key (PACKING_H_ID)
) comment '梱包ヘッダ' ;

create index T_PACKING_H_IX1
  on T_PACKING_H(PROCESS_TYPE_ID);

create index T_PACKING_H_IX2
  on T_PACKING_H(ALLOC_INST_H_ID);

create index T_PACKING_H_IX3
  on T_PACKING_H(PICKING_H_ID);

create index T_PACKING_H_IX4
  on T_PACKING_H(BOX_ID);

-- 梱包明細情報
create table T_PACKING_LIST (
  PACKING_LIST_ID bigint not null comment '梱包明細ID'
  , CLIENT_ID bigint not null comment '荷主ID'
  , SHIPPING_SLIP_NO varchar(30) comment '出荷伝票番号'
  , PACKING_NO varchar(30) comment '梱包番号'
  , PACKING_ROW_NO varchar(30) comment '梱包明細番号'
  , SHIPPING_SLIP_ROW_NO varchar(30) comment '出荷伝票明細番号'
  , SHIPPING_SLIP_ROW_NO_SN varchar(30) comment '出荷伝票明細番号連番'
  , PRODUCT_CD varchar(30) comment '商品CD'
  , NUM bigint comment '数量'
  , CARRIER_SLIP_NO varchar(30) comment '運送便伝票番号'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_PACKING_LIST_PK primary key (PACKING_LIST_ID)
) comment '梱包明細情報' ;

-- 梱包帳票
create table T_PACKING_R (
  PACKING_H_ID bigint not null comment '梱包ヘッダID'
  , STW_OUT_FLG char(1) comment '積込リスト出力フラグ'
  , STW_OUT_USER_ID bigint comment '積込リスト出力者ID'
  , STW_OUT_DT datetime(3) comment '積込リスト出力日時'
  , TAG_OUT_FLG char(1) comment '荷札出力フラグ'
  , TAG_OUT_USER_ID bigint comment '荷札出力者ID'
  , TAG_OUT_DT datetime(3) comment '荷札出力日時'
  , TAG_DL_URL varchar(255) comment '荷札ダウンロードURL'
  , INSPECTION_OUT_FLG char(1) default '0' comment 'SD検品ラベル出力フラグ'
  , INSPECTION_OUT_USER_ID bigint comment 'SD検品ラベル出力者ID'
  , INSPECTION_OUT_DT datetime(3) comment 'SD検品ラベル出力日時'
  , CDL_OUT_FLG char(1) comment '運送業者引き渡し票出力フラグ'
  , CDL_OUT_USER_ID bigint comment '運送業者引き渡し票出力者ID'
  , CDL_OUT_DT datetime(3) comment '運送業者引き渡し票出力日時'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_PACKING_R_PK primary key (PACKING_H_ID)
) comment '梱包帳票' ;

create index T_PACKING_R_IX1
  on T_PACKING_R(STW_OUT_USER_ID);

create index T_PACKING_R_IX2
  on T_PACKING_R(TAG_OUT_USER_ID);

create index T_PACKING_R_IX3
  on T_PACKING_R(INSPECTION_OUT_USER_ID);

-- ピッキング提案
create table T_PIC_MTHD_RCMD (
  PIC_MTHD_RCMD_ID bigint not null comment 'ピッキング提案ID'
  , CLIENT_ID bigint not null comment '荷主ID'
  , CENTER_ID bigint not null comment 'センタID'
  , PICKING_BATCH_NO varchar(30) comment 'ピッキングバッチNo.'
  , RCMD_PICKING_CLS varchar(30) comment '提案ピッキング方法'
  , PACKING_NUM bigint comment '梱包数'
  , WORK_VOLUME decimal(14,4) comment '仕事量'
  , DELIVERY_COURSE_CD varchar(100) comment '配送コースCD'
  , DELIVERY_COURSE_NM varchar(255) comment '配送コース名称'
  , CARRIER_CD varchar(100) comment '運送業者CD'
  , CARRIER_NM varchar(255) comment '運送業者名称'
  , EMERGENCY_FLG char(1) comment '緊急フラグ'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_PIC_MTHD_RCMD_PK primary key (PIC_MTHD_RCMD_ID)
) comment 'ピッキング提案' ;

-- ピッキング提案台車
create table T_PIC_MTHD_RCMD_CART (
  PIC_MTHD_RCMD_CART_ID bigint not null comment 'ピッキング提案台車ID'
  , PACKING_H_ID bigint not null comment '梱包ヘッダID'
  , CART_NO bigint comment '台車No.'
  , PIC_MTHD_RCMD_ID bigint comment 'ピッキング提案ID'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_PIC_MTHD_RCMD_CART_PK primary key (PIC_MTHD_RCMD_CART_ID)
) comment 'ピッキング提案台車' ;

create index T_PIC_MTHD_RCMD_CART_IX1
  on T_PIC_MTHD_RCMD_CART(PACKING_H_ID);

create index T_PIC_MTHD_RCMD_CART_IX2
  on T_PIC_MTHD_RCMD_CART(PIC_MTHD_RCMD_ID);

-- ピッキング提案データ
create table T_PIC_MTHD_RCMD_DATA (
  PIC_MTHD_RCMD_DATA_ID bigint not null comment 'ピッキング提案データID'
  , PICKING_H_ID bigint not null comment '出庫ヘッダID'
  , PIC_MTHD_RCMD_ID bigint comment 'ピッキング提案ID'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_PIC_MTHD_RCMD_DATA_PK primary key (PIC_MTHD_RCMD_DATA_ID)
) comment 'ピッキング提案データ' ;

create index T_PIC_MTHD_RCMD_DATA_IX1
  on T_PIC_MTHD_RCMD_DATA(PICKING_H_ID);

create index T_PIC_MTHD_RCMD_DATA_IX2
  on T_PIC_MTHD_RCMD_DATA(PIC_MTHD_RCMD_ID);

-- 出庫ボディ
create table T_PICKING_B (
  PICKING_B_ID bigint not null comment '出庫ボディID'
  , PICKING_H_ID bigint not null comment '出庫ヘッダID'
  , SHIPPING_INST_B_ID bigint comment '出荷指示ボディID'
  , ALLOC_INST_B_ID bigint comment '引当指示ボディID'
  , STOCK_ID bigint comment '在庫ID'
  , PICKING_NUM decimal(14,4) default 0 not null comment '出庫数'
  , TEMP_NO varchar(30) comment '仮置きNo.'
  , TRANSIT_NUM decimal(14,4) default 0 comment '積送中数'
  , SHAPE_ID bigint comment '荷姿ID'
  , PICKED_NUM bigint comment 'ピッキング済数'
  , PICKING_PATERN_CD varchar(30) comment 'ピッキングパターンCD'
  , INDV_LABEL_NO varchar(30) comment '個別貼付ラベルNO'
  , OLD_PICKING_B_ID bigint comment '元出庫ボディID'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_PICKING_B_PK primary key (PICKING_B_ID)
) comment '出庫ボディ' ;

create index T_PICKING_B_IX1
  on T_PICKING_B(PICKING_H_ID);

create index T_PICKING_B_IX2
  on T_PICKING_B(SHIPPING_INST_B_ID);

create index T_PICKING_B_IX3
  on T_PICKING_B(ALLOC_INST_B_ID);

create index T_PICKING_B_IX4
  on T_PICKING_B(STOCK_ID);

create index T_PICKING_B_IX5
  on T_PICKING_B(SHAPE_ID);

-- 出庫ヘッダ
create table T_PICKING_H (
  PICKING_H_ID bigint not null comment '出庫ヘッダID'
  , CLIENT_ID bigint not null comment '荷主ID'
  , CENTER_ID bigint not null comment 'センタID'
  , PROCESS_TYPE_ID bigint not null comment '処理区分ID'
  , PICKING_STATUS varchar(30) comment '出庫ステータス'
  , DELIV_UNIT_NO varchar(30) comment '届先単位No.'
  , PICKING_WORK_NO varchar(30) comment '出庫作業No.'
  , ALLOC_INST_H_ID bigint comment '引当指示ヘッダID'
  , FORCE_FIXED_FLG char(1) comment '強制確定フラグ'
  , PICKING_GROUP_NO varchar(30) comment 'ピッキンググループNo.'
  , SGL_ROW_PIC_FLG char(1) comment '単行ピックフラグ'
  , SHIPPING_FIXED_DT varchar(8) comment '出荷確定日'
  , CENTER_TRANSIT_FLG char(1) default '0' comment 'センタ間移動フラグ'
  , PACKING_CAL_CLS varchar(30) comment '梱包計算処理区分'
  , BOL_NO varchar(30) comment 'Bill of Lading No.'
  , NIZOROE_NO varchar(30) comment '荷揃番号'
  , DAIHYO_NIZOROE_NO varchar(30) comment '代表荷揃番号'
  , NIZOROE_NO2 varchar(30) comment '荷揃番号_ハイフンあり'
  , DAIHYO_NIZOROE_NO2 varchar(30) comment '代表荷揃番号_ハイフンあり'
  , PICK_FORCE_COPLETE_FLG char(1) default '0' comment 'ピッキング強制完了フラグ'
  , INSP_FORCE_COPLETE_FLG char(1) default '0' comment '出荷検品強制完了フラグ'
  , PRINT_STATUS varchar(30) comment '発行状況'
  , WORK_GROUP_KEY varchar(30) comment '作業グループキー'
  , NIZOROE_PRINT_TYPE_CD varchar(30) comment '荷揃表印刷区分'
  , DELIV_PRINT_TYPE_CD varchar(30) comment '納品書印刷区分'
  , TAG_PRINT_TYPE_CD varchar(30) comment '荷札印刷区分'
  , INTEG_PRINT_FLG char(1) comment '一体型伝票印刷フラグ'
  , ID_MANAG_PRINT_FLG char(1) comment '個体管理印刷フラグ'
  , SCM_PRINT_FLG char(1) comment '梱包明細印刷フラグ'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_PICKING_H_PK primary key (PICKING_H_ID)
) comment '出庫ヘッダ' ;

create index T_PICKING_H_IX1
  on T_PICKING_H(PROCESS_TYPE_ID);

create index T_PICKING_H_IX2
  on T_PICKING_H(ALLOC_INST_H_ID);

create index T_PICKING_H_IX3
  on T_PICKING_H(PICKING_WORK_NO);

-- 出庫帳票
create table T_PICKING_R (
  PICKING_H_ID bigint not null comment '出庫ヘッダID'
  , OPL_OUT_FLG char(1) comment 'オーダーピッキングリスト出力フラグ'
  , TPL_OUT_FLG char(1) comment 'トータルピッキングリスト出力フラグ'
  , MLT_OUT_FLG char(1) comment 'マルチピッキングリスト出力フラグ'
  , SPL_OUT_FLG char(1) comment '単行ピッキングリスト出力フラグ'
  , PL1_OUT_FLG char(1) comment '1次ピッキングリスト出力フラグ'
  , PL1_OUT_USER_ID bigint comment '1次ピッキングリスト出力者ID'
  , PL1_OUT_DT datetime(3) comment '1次ピッキングリスト出力日時'
  , PL_OUT_FLG char(1) comment '摘み取りリスト出力フラグ'
  , PL_OUT_USER_ID bigint comment '摘み取りリスト出力者'
  , PL_OUT_DT datetime(3) comment '摘み取りリスト出力日時'
  , SL_OUT_FLG char(1) comment '種蒔きリスト出力フラグ'
  , PL2_OUT_FLG char(1) comment '2次ピッキングリスト出力フラグ'
  , PL2_OUT_USER_ID bigint comment '2次ピッキングリスト出力者ID'
  , PL2_OUT_DT datetime(3) comment '2次ピッキングリスト出力日時'
  , CASE_OUT_FLG char(1) comment 'ケースピッキングリスト出力フラグ'
  , CASE_OUT_USER_ID bigint comment 'ケースピッキングリスト出力者ID'
  , CASE_OUT_DT datetime(3) comment 'ケースピッキングリスト出力日時'
  , PACKING_OUT_FLG char(1) comment '納品明細書出力フラグ'
  , PACKING_OUT_USER_ID bigint comment '納品明細書出力者ID'
  , PACKING_OUT_DT datetime(3) comment '納品明細書出力日時'
  , SLIP_OUT_FLG char(1) comment '送り状出力フラグ'
  , SLIP_OUT_USER_ID bigint comment '送り状出力者ID'
  , SLIP_OUT_DT datetime(3) comment '送り状出力日時'
  , INVOICE_CREATE_FLG char(1) comment '送り状データ作成フラグ'
  , INVOICE_CREATE_DT datetime(3) comment '送り状データ作成日時'
  , INVOICE_ISSUE_NUM bigint comment '送り状発行枚数'
  , SHIPPING_RECORD_OUT_FLG char(1) comment '出荷実績出力フラグ'
  , SHIPPING_RECORD_OUT_USER_ID bigint comment '出荷実績出力者ID'
  , SHIPPING_RECORD_OUT_DT datetime(3) comment '出荷実績出力日時'
  , BOL_OUT_FLG char(1) comment 'Bill of Lading出力フラグ'
  , BOL_OUT_USER_ID bigint comment 'Bill of Lading出力者ID'
  , BOL_OUT_DT datetime(3) comment 'Bill of Lading出力日時'
  , TAG_OUT_FLG char(1) comment '荷札出力フラグ'
  , TAG_OUT_USER_ID bigint comment '荷札出力者ID'
  , TAG_OUT_DT datetime(3) comment '荷札出力日時'
  , DELIV_OUT_FLG char(1) comment '納品書出力フラグ'
  , DELIV_OUT_USER_ID bigint comment '納品書出力者ID'
  , DELIV_OUT_DT datetime(3) comment '納品書出力日時'
  , PLL_OUT_FLG char(1) comment '梱包明細出力フラグ'
  , PLL_OUT_USER_ID bigint comment '梱包明細出力者ID'
  , PLL_OUT_DT datetime(3) comment '梱包明細出力日時'
  , NIZOROE_OUT_FLG char(1) comment '荷揃表出力フラグ'
  , NIZOROE_OUT_USER_ID bigint comment '荷揃表出力者ID'
  , NIZOROE_OUT_DT datetime(3) comment '荷揃表出力日時'
  , INDV_SUPPLY_OUT_FLG char(1) comment '個人別支給明細出力フラグ'
  , INDV_SUPPLY_OUT_USER_ID bigint comment '個人別支給明細出力者ID'
  , INDV_SUPPLY_OUT_DT datetime(3) comment '個人別支給明細出力日時'
  , INDV_LABEL_OUT_FLG char(1) comment '個別貼り付けラベル出力フラグ'
  , INDV_LABEL_OUT_USER_ID bigint comment '個別貼り付けラベル出力者ID'
  , INDV_LABEL_OUT_DT datetime(3) comment '個別貼り付けラベル出力日時'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_PICKING_R_PK primary key (PICKING_H_ID)
) comment '出庫帳票' ;

create index T_PICKING_R_IX1
  on T_PICKING_R(PL1_OUT_USER_ID);

create index T_PICKING_R_IX2
  on T_PICKING_R(PL2_OUT_USER_ID);

create index T_PICKING_R_IX3
  on T_PICKING_R(PACKING_OUT_USER_ID);

create index T_PICKING_R_IX4
  on T_PICKING_R(SLIP_OUT_USER_ID);

create index T_PICKING_R_IX5
  on T_PICKING_R(SHIPPING_RECORD_OUT_USER_ID);

-- 出庫入荷ラベル
create table T_PICKING_RECEIVE_LABEL (
  PICKING_RECEIVE_LABEL_ID bigint not null comment '出庫入荷ラベル'
  , PICKING_B_ID bigint comment '出庫ボディID'
  , RECEIVE_LABEL_NO varchar(30) comment '入荷ラベルNo'
  , RECEIVE_DT varchar(8) comment '入荷日'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_PICKING_RECEIVE_LABEL_PK primary key (PICKING_RECEIVE_LABEL_ID)
) comment '出庫入荷ラベル' ;

-- 出庫実績在庫
create table T_PICKING_RECORD_STOCK (
  PICKING_RECORD_STOCK_ID bigint not null comment '出庫実績在庫ID'
  , PICKING_B_ID bigint comment '出庫ボディID'
  , STOCK_ID bigint comment '在庫ID'
  , PICKING_NUM bigint comment '出庫数'
  , `在庫調整済フラグ` char(1) comment '在庫調整済フラグ'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_PICKING_RECORD_STOCK_PK primary key (PICKING_RECORD_STOCK_ID)
) comment '出庫実績在庫' ;

-- 楽天RMS受注
create table T_RAKUTEN_ORDER (
  RAKUTEN_ORDER_ID bigint not null comment '楽天RMS受注ID'
  , ORDER_NO varchar(100) comment '受注番号'
  , ORDER_STATUS varchar(30) comment '受注ステータス'
  , CARD_STATUS varchar(30) comment 'カード決済ステータス'
  , PAYMENT_DT varchar(30) comment '入金日'
  , SHIPPING_DT varchar(30) comment '配送日'
  , DELIV_TZ varchar(30) comment 'お届け時間帯'
  , DELIV_DT varchar(30) comment 'お届け日指定'
  , PERSON_IN_CHARGE varchar(30) comment '担当者'
  , SINGLE_MEMO varchar(255) comment 'ひとことメモ'
  , MAIL_INPUT varchar(255) comment 'メール差込文(お客様へのメッセージ)'
  , FIRST_PAYMENT bigint comment '初期購入合計金額'
  , TERMINAL varchar(100) comment '利用端末'
  , MAIL_CARRIER_CD varchar(30) comment 'メールキャリアコード'
  , GIFT_FLG char(1) comment 'ギフトチェック（0:なし/1:あり）'
  , RAKUTEN_ORDER_COMMENT varchar(255) comment 'コメント'
  , ORDER_DATETIME varchar(30) comment '注文日時'
  , MULTI_DELIV_FLG char(1) comment '複数送付先フラグ'
  , ALERT_FLG char(1) comment '警告表示フラグ'
  , MEMBER_FLG char(1) comment '楽天会員フラグ'
  , TOTAL bigint comment '合計'
  , TAX bigint comment '消費税(-99999=無効値)'
  , CARRIAGE bigint comment '送料(-99999=無効値)'
  , COD bigint comment '代引料(-99999=無効値)'
  , AMOUNT_BILLED bigint comment '請求金額(-99999=無効値)'
  , TOTAL_AMOUNT bigint comment '合計金額(-99999=無効値)'
  , COMBINE_ID varchar(30) comment '同梱ID'
  , COMBINE_STATUS varchar(30) comment '同梱ステータス'
  , COMBINE_TOTAL bigint comment '同梱商品合計金額'
  , COMBINE_CARRIAGE bigint comment '同梱送料合計'
  , COMBINE_COD bigint comment '同梱代引料合計'
  , COMBINE_TAX bigint comment '同梱消費税合計'
  , COMBINE_BILLED bigint comment '同梱請求金額'
  , COMBINE_AMOUNT bigint comment '同梱合計金額'
  , COMBINE_BANK_FEE bigint comment '同梱楽天バンク決済振替手数料'
  , COMBINE_POINT_USE bigint comment '同梱ポイント利用合計'
  , MAIL_FLG char(1) comment 'メールフラグ'
  , ORDER_DT varchar(30) comment '注文日'
  , ORDER_TIME varchar(30) comment '注文時間'
  , MOBILE_PAYMENT_NO varchar(30) comment 'モバイルキャリア決済番号'
  , HISTORY_MOD_FLG varchar(30) comment '購入履歴修正可否タイプ'
  , HISTORY_ICON_FLG char(1) comment '購入履歴修正アイコンフラグ'
  , HISTORY_MAIL_FLG char(1) comment '購入履歴修正催促メールフラグ'
  , DELIV_MATCH_FLG char(1) comment '送付先一致フラグ'
  , POINT_USE_FLG char(1) comment 'ポイント利用有無'
  , ORDER_ZIP_CD1 varchar(30) comment '注文者郵便番号1'
  , ORDER_ZIP_CD2 varchar(30) comment '注文者郵便番号2'
  , ORDER_ADDRESS1 varchar(255) comment '注文者住所：都道府県'
  , ORDER_ADDRESS2 varchar(255) comment '注文者住所：都市区'
  , ORDER_ADDRESS3 varchar(255) comment '注文者住所：町以降'
  , ORDER_CUSTOMER_NM1 varchar(255) comment '注文者名字'
  , ORDER_CUSTOMER_NM2 varchar(255) comment '注文者名前'
  , ORDER_CUSTOMER_KN1 varchar(255) comment '注文者名字フリガナ'
  , ORDER_CUSTOMER_KN2 varchar(255) comment '注文者名前フリガナ'
  , ORDER_TEL_NO1 varchar(255) comment '注文者電話番号1'
  , ORDER_TEL_NO2 varchar(255) comment '注文者電話番号2'
  , ORDER_TEL_NO3 varchar(255) comment '注文者電話番号3'
  , MAIL_ADDRESS varchar(255) comment 'メールアドレス'
  , ORDER_SEX varchar(30) comment '注文者性別'
  , ORDER_BIRTHDAY varchar(30) comment '注文者誕生日'
  , PAYMENT_METHOD varchar(255) comment '決済方法'
  , CARD_TYPE varchar(100) comment 'クレジットカード種類'
  , CARD_NO varchar(255) comment 'クレジットカード番号'
  , CARD_NM varchar(255) comment 'クレジットカード名義人'
  , CARD_AVAILABLE varchar(255) comment 'クレジットカード有効期限'
  , CARD_INST varchar(30) comment 'クレジットカード分割選択'
  , CARD_INST_COMMENT varchar(255) comment 'クレジットカード分割備考'
  , DELIV_METHOD varchar(255) comment '配送方法'
  , DELIV_TYPE varchar(255) comment '配送区分'
  , POINT_USE bigint comment 'ポイント利用額'
  , POINT_CONDITION varchar(30) comment 'ポイント利用条件'
  , POINT_STATUS varchar(30) comment 'ポイントステータス'
  , BANK_STATUS varchar(30) comment '楽天バンク決済ステータス'
  , BANK_FEE_FLG char(1) comment '楽天バンク振替手数料負担区分'
  , BANK_FEE bigint comment '楽天バンク決済手数料'
  , WRAPPING_TITLE_P varchar(255) comment 'ラッピングタイトル(包装紙)'
  , WRAPPING_NM_P varchar(255) comment 'ラッピング名(包装紙)'
  , WRAPPING_FEE_P bigint comment 'ラッピング料金(包装紙)'
  , WRAPPING_TAX_P bigint comment '税込別(包装紙)'
  , WRAPPING_TITLE_R varchar(255) comment 'ラッピングタイトル(リボン)'
  , WRAPPING_NM_R varchar(255) comment 'ラッピング名(リボン)'
  , WRAPPING_FEE_R bigint comment 'ラッピング料金(リボン)'
  , WRAPPING_TAX_R bigint comment '税込別(リボン)'
  , DELIV_CARRIAGE bigint comment '送付先送料'
  , DELIV_COD bigint comment '送付先代引料'
  , DELIV_TAX bigint comment '送付先消費税'
  , CARRIER_TRACE_NUM varchar(30) comment 'お荷物伝票番号'
  , DELIV_TOTAL bigint comment '送付先商品合計金額'
  , NOSHI varchar(255) comment 'のし'
  , DELIV_ZIP_CD1 varchar(30) comment '送付先郵便番号1'
  , DELIV_ZIP_CD2 varchar(30) comment '送付先郵便番号2'
  , DELIV_ADDRESS1 varchar(255) comment '送付先住所：都道府県'
  , DELIV_ADDRESS2 varchar(255) comment '送付先住所：都市区'
  , DELIV_ADDRESS3 varchar(255) comment '送付先住所：町以降'
  , DELIV_CUSTOMER_NM1 varchar(255) comment '送付先名字'
  , DELIV_CUSTOMER_NM2 varchar(255) comment '送付先名前'
  , DELIV_CUSTOMER_KN1 varchar(255) comment '送付先名字フリガナ'
  , DELIV_CUSTOMER_KN2 varchar(255) comment '送付先名前フリガナ'
  , DELIV_TEL_NO1 varchar(255) comment '送付先電話番号1'
  , DELIV_TEL_NO2 varchar(255) comment '送付先電話番号2'
  , DELIV_TEL_NO3 varchar(255) comment '送付先電話番号3'
  , PRODUCT_ID varchar(30) comment '商品ID'
  , PRODUCT_NM varchar(255) comment '商品名'
  , PRODUCT_NO varchar(100) comment '商品番号'
  , PRODUCT_URL varchar(100) comment '商品URL'
  , UNIT_PRICE bigint comment '単価'
  , ORDER_NUM bigint comment '個数'
  , PRODUCT_CARRIAGE bigint comment '送料込別'
  , PRODUCT_TAX bigint comment '税込別'
  , PRODUCT_COD bigint comment '代引手数料込別'
  , ITEM_CHOICE varchar(255) comment '項目・選択肢'
  , POINT_SCALE decimal(14,4) comment 'ポイント倍率'
  , POINT_TYPE varchar(100) comment 'ポイントタイプ'
  , RECORD_NUMBER bigint comment 'レコードナンバー'
  , DELIVERY_INFO varchar(100) comment '納期情報'
  , STOCK_TYPE varchar(100) comment '在庫タイプ'
  , WRAPPING_TYPE_P varchar(255) comment 'ラッピング種類(包装紙)'
  , WRAPPING_TYPE_R varchar(255) comment 'ラッピング種類(リボン)'
  , TOMORROW_FLG varchar(30) comment 'あす楽希望'
  , COUPON_USE bigint comment 'クーポン利用額'
  , SHOP_COUPON_USE bigint comment '店舗発行クーポン利用額'
  , RAKUTEN_COUPON_USE bigint comment '楽天発行クーポン利用額'
  , COMBINE_COUPON_USE bigint comment '同梱注文クーポン利用額'
  , DELIV_COMPANY varchar(255) comment '配送会社'
  , PHAMACE_FLG char(1) comment '薬事フラグ'
  , PACKING_QTY bigint comment '個口数'
  , SLIP_ITEM_NM1 longtext comment '品名1'
  , SLIP_ITEM_NM2 varchar(255) comment '品名2'
  , SLIP_ITEM_NM3 varchar(255) comment '品名3'
  , SLIP_ITEM_NM4 varchar(255) comment '品名4'
  , SLIP_ITEM_NM5 varchar(255) comment '品名5'
  , SLIP_ITEM_CD1 varchar(30) comment '品名コード1'
  , SLIP_ITEM_CD2 varchar(30) comment '品名コード2'
  , FREIGHT_HANDLING1 varchar(30) comment '荷扱い1'
  , FREIGHT_HANDLING2 varchar(30) comment '荷扱い2'
  , ARTICLE varchar(255) comment '記事'
  , RECEIVE_ID bigint comment '受信ID'
  , ROW_NO bigint comment '行No.'
  , ERROR_FLG char(1) comment 'エラーフラグ'
  , IMPORT_FLG char(1) comment '取込フラグ'
  , IMPORT_TYPE_ID bigint comment '取込種別ID'
  , EC_ORDER_B_ID bigint comment 'EC受注ボディID'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_RAKUTEN_ORDER_PK primary key (RAKUTEN_ORDER_ID)
) comment '楽天RMS受注' ;

create index T_RAKUTEN_ORDER_IX1
  on T_RAKUTEN_ORDER(RECEIVE_ID);

-- 入荷ラベル
create table T_RECEIVE_LABEL (
  RECEIVE_LABEL_ID bigint not null comment '入荷ラベルID'
  , STOCK_ID bigint not null comment '在庫ID'
  , RECEIVE_LABEL_NO varchar(255) comment '入荷ラベルNo'
  , NUM decimal(14,4) default 0 comment '数量'
  , OWNER_CD varchar(30) comment '所有者CD'
  , OWNER_ABBR varchar(60) comment '所有者略称'
  , RECOMMEND_LOCATION_CD varchar(30) comment '推奨ロケCD'
  , LOCATION_CD varchar(30) comment 'ロケーションCD'
  , JANCD varchar(30) comment 'JANCD'
  , PRODUCT_NM varchar(60) comment '商品名称'
  , UNIT_NM varchar(60) comment '数量単位'
  , LOT varchar(30) comment 'ロット'
  , LIMIT_DT varchar(8) comment '期限日'
  , PROD_DT varchar(8) comment '製造日'
  , RECEIVE_DT varchar(8) comment '入荷日'
  , DEPOSIT_FLG char(1) comment '預り品フラグ'
  , REPRINT_FLG char(1) comment '再発行フラグ'
  , RECEIVE_UNIT_NUM bigint comment '入荷時入数'
  , RECEIVE_PLAN_B_ID bigint comment '入荷予定ボディID'
  , RCV_LBL_OUT_USER_ID bigint comment '入荷ラベル出力者ID'
  , RCV_LBL_OUT_DT datetime(3) comment '入荷ラベル出力日時'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_RECEIVE_LABEL_PK primary key (RECEIVE_LABEL_ID)
) comment '入荷ラベル' ;

create index T_RECEIVE_LABEL_IX1
  on T_RECEIVE_LABEL(STOCK_ID);

create index T_RECEIVE_LABEL_IX2
  on T_RECEIVE_LABEL(RECEIVE_LABEL_NO);

-- 入荷予定ボディ
create table T_RECEIVE_PLAN_B (
  RECEIVE_PLAN_B_ID bigint not null comment '入荷予定ボディID'
  , RECEIVE_PLAN_H_ID bigint not null comment '入荷予定ヘッダID'
  , LINE_NO bigint not null comment '行No.'
  , RECEIVE_STATUS varchar(30) not null comment '入荷ステータス'
  , PLAN_CLIENT_ORDER_NO varchar(30) comment '予定顧客発注No.'
  , PLAN_WAREHOUSE_ID bigint comment '予定倉庫ID'
  , PLAN_WAREHOUSE_CD varchar(30) comment '予定倉庫CD'
  , PRODUCT_ID bigint comment '商品ID'
  , PRODUCT_CD varchar(100) not null comment '商品CD'
  , PLAN_LOT varchar(30) comment '予定ロット'
  , PLAN_LIMIT_DT varchar(8) comment '予定期限日'
  , PLAN_LOCATION_ID bigint comment '予定ロケーションID'
  , PLAN_LOCATION_CD varchar(30) comment '予定ロケーションCD'
  , PLAN_STORE_LABEL_NO varchar(30) comment '予定入庫ラベルNo.'
  , PLAN_NUM decimal(14,4) default 0 not null comment '予定数'
  , ERROR_FLG char(1) comment 'エラーフラグ'
  , ERROR_MESSAGE_CD varchar(100) comment 'エラーメッセージCD'
  , STORE_ROW_NO varchar(30) comment '入庫明細番号'
  , PLAN_PROD_DT varchar(8) comment '予定製造日'
  , HINMOKU_GROUP varchar(30) comment '品目グループ'
  , HINMOKU_TEXT varchar(60) comment '品目テキスト'
  , JAN_CD varchar(30) comment 'JANCD'
  , UNIT_NM varchar(60) comment '単位名称'
  , REMAINING_RECEIVE_NUM decimal(14,4) default 0 comment '入荷予定残数'
  , LOT_MANAG_TYPE_ID bigint comment 'ロット管理区分ID'
  , LOT_MANAG_TYPE_CD varchar(30) comment 'ロット管理区分CD'
  , SHIPPING_PLANT_CD varchar(30) comment '出庫プラントCD'
  , SHIPPING_STORAGE_SPACE_CD varchar(30) comment '出庫保管場所CD'
  , REMAIN_FLG char(1) default '1' not null comment '残数有フラグ'
  , WM_SEND_FLG char(1) default '0' comment 'WMS送信済フラグ'
  , LP_SEND_FLG char(1) default '0' comment '物流ポータル送信済フラグ'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_RECEIVE_PLAN_B_PK primary key (RECEIVE_PLAN_B_ID)
) comment '入荷予定ボディ' ;

create index T_RECEIVE_PLAN_B_IX1
  on T_RECEIVE_PLAN_B(RECEIVE_PLAN_H_ID);

create index T_RECEIVE_PLAN_B_IX2
  on T_RECEIVE_PLAN_B(PRODUCT_ID);

create index T_RECEIVE_PLAN_B_IX3
  on T_RECEIVE_PLAN_B(PLAN_LOCATION_ID);

create index T_RECEIVE_PLAN_B_IX4
  on T_RECEIVE_PLAN_B(PLAN_CLIENT_ORDER_NO);

create index T_RECEIVE_PLAN_B_IX5
  on T_RECEIVE_PLAN_B(PRODUCT_CD);

-- 入庫IFデータ転送テーブル
create table T_RECEIVE_PLAN_DATA_TRANSFER (
  RECEIVE_PLAN_DATA_TRANSFER_ID bigint not null comment '入庫IFデータ転送ID'
  , RECEIVE_PLAN_B_ID bigint not null comment '入荷予定ボディID'
  , DATA_TRANSFER_ONLY_STR01 varchar(30) comment '赤黒区分'
  , DATA_TRANSFER_ONLY_STR02 varchar(30) comment '代表ロケーション'
  , DATA_TRANSFER_ONLY_STR03 varchar(60) comment '品名カナ1'
  , DATA_TRANSFER_ONLY_STR04 varchar(60) comment '品名カナ2'
  , DATA_TRANSFER_ONLY_STR05 varchar(60) comment '摘要'
  , DATA_TRANSFER_ONLY_STR06 varchar(30) comment '端末番号'
  , DATA_TRANSFER_ONLY_STR07 varchar(30) comment 'サーバー送信フラグ'
  , DATA_TRANSFER_ONLY_STR08 varchar(30) comment 'サーバー宛送信時刻'
  , DATA_TRANSFER_ONLY_STR09 varchar(30) comment '3社納品書番号2'
  , DATA_TRANSFER_ONLY_STR10 varchar(30) comment '加工品区分'
  , DATA_TRANSFER_ONLY_STR11 varchar(30) comment '管理区分'
  , DATA_TRANSFER_ONLY_STR12 varchar(30) comment '3社売上日'
  , DATA_TRANSFER_ONLY_STR13 varchar(30) comment '仕入単価'
  , DATA_TRANSFER_ONLY_STR14 varchar(30) comment '作成日_発注'
  , DATA_TRANSFER_ONLY_STR15 varchar(30) comment '作成時間_発注'
  , DATA_TRANSFER_ONLY_STR16 varchar(30) comment 'データ種別'
  , DATA_TRANSFER_ONLY_STR17 varchar(30) comment '管理番号'
  , DATA_TRANSFER_ONLY_STR18 varchar(30) comment '入力順'
  , DATA_TRANSFER_ONLY_STR19 varchar(30) comment '検品残数量'
  , DATA_TRANSFER_ONLY_STR20 varchar(30) comment '検品数量'
  , DATA_TRANSFER_ONLY_STR21 varchar(30) comment '検品確定区分'
  , DATA_TRANSFER_ONLY_STR22 varchar(30) comment '倉庫コード'
  , DATA_TRANSFER_ONLY_STR23 varchar(30) comment '完了区分'
  , DATA_TRANSFER_ONLY_STR24 varchar(30) comment 'プログラムID'
  , DATA_TRANSFER_ONLY_STR25 varchar(30) comment 'JANコード区分'
  , DATA_TRANSFER_ONLY_STR26 varchar(255) comment 'ダミー'
  , DATA_TRANSFER_ONLY_STR27 varchar(30) comment 'SAP更新担当者コード'
  , DATA_TRANSFER_ONLY_STR28 varchar(30) comment '削除フラグ'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_RECEIVE_PLAN_DATA_TRANSFER_PK primary key (RECEIVE_PLAN_DATA_TRANSFER_ID,RECEIVE_PLAN_B_ID)
) comment '入庫IFデータ転送テーブル' ;

create index T_RECEIVE_PLAN_DATA_TRANSFER_IX1
  on T_RECEIVE_PLAN_DATA_TRANSFER(RECEIVE_PLAN_B_ID);

-- 入荷予定ヘッダ
create table T_RECEIVE_PLAN_H (
  RECEIVE_PLAN_H_ID bigint not null comment '入荷予定ヘッダID'
  , CLIENT_ID bigint not null comment '荷主ID'
  , CENTER_ID bigint not null comment 'センタID'
  , PROCESS_TYPE_ID bigint comment '処理区分ID'
  , STOCK_TYPE_ID bigint comment '在庫区分ID'
  , RECEIVE_PLAN_DT varchar(8) not null comment '入荷予定日'
  , PLAN_CLIENT_RECEIVE_NO varchar(30) comment '予定顧客入荷指示No.'
  , RECEIVE_SLIP_NO varchar(30) not null comment 'WMS入荷伝票No.'
  , PLAN_SUPPLIER_ID bigint comment '予定仕入先ID'
  , PLAN_SUPPLIER_CD varchar(30) comment '予定仕入先CD'
  , PLAN_DEPOSIT_ID bigint comment '予定預託ID'
  , PLAN_DEPOSIT_CD varchar(30) comment '予定預託CD'
  , RECEIVE_STATUS varchar(30) not null comment '入荷ステータス'
  , INPUT_TYPE varchar(30) not null comment '入力区分'
  , RECEIVE_DELIVERY_STATUS varchar(30) comment '入荷納品ステータス'
  , OLD_RECEIVE_PLAN_H_ID bigint comment '元入荷予定ヘッダID'
  , ERROR_FLG char(1) default '0' not null comment 'エラーフラグ'
  , ERROR_MESSAGE_CD varchar(100) comment 'エラーメッセージCD'
  , CENTER_TRANSIT_FLG char(1) default '0' comment 'センタ間移動フラグ'
  , PICKING_H_ID bigint comment 'センタ間移動出庫ヘッダID'
  , SAP_RECEIVE_SLIP_NO varchar(30) comment '入庫伝票番号'
  , SLIP_TYPE_ID bigint comment '伝票種別ID'
  , SLIP_TYPE_CD varchar(30) comment '伝票種別CD'
  , PURCHASE_ORDER_NO varchar(30) comment 'IF用番号'
  , RECEIVE_REASON_CD varchar(255) comment '入荷発生事由CD'
  , ORDER_DATE varchar(8) comment '発注日'
  , ORDER_TIME varchar(6) comment '発注時刻'
  , CONFIRMED_DELIVERY_DT varchar(8) comment '確定納期'
  , PLANT_CD varchar(30) comment 'プラントCD'
  , STORAGE_SPACE_CD varchar(30) comment '保管場所CD'
  , TENHANSHA_CD varchar(30) comment '店販社CD'
  , SALES_ORG_ID bigint comment '販売組織ID'
  , SALES_ORG_CD varchar(30) comment '販売組織CD'
  , TENHANSHA_NM1 varchar(60) comment '店販社名称1'
  , TENHANSHA_NM2 varchar(60) comment '店販社名称2'
  , SAP_USER_CD varchar(30) comment 'SAPユーザCD'
  , SAP_USER_NM varchar(60) comment 'SAPユーザ名称'
  , CUSTOMER_ORDER_NO varchar(100) comment '得意先注文番号'
  , SAP_VENDER_CD varchar(30) comment 'SAP発注先CD'
  , SAP_SUPPLIER_CD varchar(30) comment 'SAP仕入先CD'
  , TODAY_FLG char(1) comment '当日分フラグ'
  , SANSHA_DELIVERY_SLIP_NO1 varchar(30) comment '3社納品書番号1'
  , DATA_TYPE_CD varchar(30) comment 'データ区分CD'
  , SANSHA_TYPE_CD varchar(30) comment '3社区分'
  , RECEIVE_REASON_NM varchar(60) comment '入荷発生事由名称'
  , MOD_TYPE_CD varchar(30) comment '修正区分'
  , IF_ID varchar(30) comment 'IFID'
  , SPARE_STR varchar(255) comment '予備'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_RECEIVE_PLAN_H_PK primary key (RECEIVE_PLAN_H_ID)
) comment '入荷予定ヘッダ' ;

create index T_RECEIVE_PLAN_H_IX1
  on T_RECEIVE_PLAN_H(PROCESS_TYPE_ID);

create index T_RECEIVE_PLAN_H_IX2
  on T_RECEIVE_PLAN_H(PLAN_SUPPLIER_ID);

create index T_RECEIVE_PLAN_H_IX3
  on T_RECEIVE_PLAN_H(PLAN_DEPOSIT_ID);

create index T_RECEIVE_PLAN_H_IX4
  on T_RECEIVE_PLAN_H(OLD_RECEIVE_PLAN_H_ID);

create index T_RECEIVE_PLAN_H_IX5
  on T_RECEIVE_PLAN_H(RECEIVE_PLAN_DT);

create index T_RECEIVE_PLAN_H_IX6
  on T_RECEIVE_PLAN_H(PLAN_CLIENT_RECEIVE_NO);

create index T_RECEIVE_PLAN_H_IX7
  on T_RECEIVE_PLAN_H(RECEIVE_SLIP_NO);

create index T_RECEIVE_PLAN_H_IX8
  on T_RECEIVE_PLAN_H(PLAN_SUPPLIER_CD);

create index T_RECEIVE_PLAN_H_IX9
  on T_RECEIVE_PLAN_H(PICKING_H_ID);

-- 入荷予定帳票
create table T_RECEIVE_PLAN_R (
  RECEIVE_PLAN_H_ID bigint not null comment '入荷予定ヘッダID'
  , RPL_OUT_FLG char(1) comment '入荷予定リスト出力フラグ'
  , RPL_OUT_USER_ID bigint comment '入荷予定リスト出力者ID'
  , RPL_OUT_DT datetime(3) comment '入荷予定リスト出力日時'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_RECEIVE_PLAN_R_PK primary key (RECEIVE_PLAN_H_ID)
) comment '入荷予定帳票' ;

create index T_RECEIVE_PLAN_R_IX1
  on T_RECEIVE_PLAN_R(RPL_OUT_USER_ID);

-- 入荷予定予備
create table T_RECEIVE_PLAN_SPARE (
  RECEIVE_PLAN_B_ID bigint not null comment '入荷予定ボディID'
  , SPARE_STR_1 varchar(255) comment '予備項目１（文字列）'
  , SPARE_STR_2 varchar(255) comment '予備項目２（文字列）'
  , SPARE_STR_3 varchar(255) comment '予備項目３（文字列）'
  , SPARE_NUM_1 decimal(14,4) comment '予備項目１（数値）'
  , SPARE_NUM_2 decimal(14,4) comment '予備項目２（数値）'
  , SPARE_NUM_3 decimal(14,4) comment '予備項目３（数値）'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_RECEIVE_PLAN_SPARE_PK primary key (RECEIVE_PLAN_B_ID)
) comment '入荷予定予備' ;

-- SCMラベル
create table T_SCM_LABEL (
  SCM_LABEL_ID bigint not null comment 'SCMラベルID'
  , STOCK_ID bigint not null comment '在庫ID'
  , SCM_LABEL_NO varchar(255) comment 'SCMラベルNo'
  , NUM decimal(14,4) default 0 comment '数量'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_SCM_LABEL_PK primary key (SCM_LABEL_ID)
) comment 'SCMラベル' ;

create index T_SCM_LABEL_IX1
  on T_SCM_LABEL(STOCK_ID);

create index T_SCM_LABEL_IX2
  on T_SCM_LABEL(SCM_LABEL_NO);

-- シリアルNo.管理
create table T_SERIAL_NO (
  SERIAL_NO_ID bigint not null comment 'シリアルNo.管理ID'
  , CENTER_ID bigint not null comment 'センタID'
  , CLIENT_ID bigint not null comment '荷主ID'
  , PRODUCT_ID bigint not null comment '商品ID'
  , SERIAL_NO varchar(100) not null comment 'シリアルNo.'
  , SUPPLIER_CD varchar(30) comment '仕入先CD'
  , SUPPLIER_NM varchar(60) comment '仕入先名称'
  , RECEIVE_SLIP_NO varchar(30) comment 'WMS入荷伝票No.'
  , RECEIVE_DT varchar(8) comment '入荷日'
  , SUPPLY_CUSTOMER_CD varchar(30) comment '納品先CD'
  , SUPPLY_CUSTOMER_NM varchar(60) comment '納品先名称'
  , PICKING_WORK_NO varchar(30) comment '出庫作業No.'
  , SHIPPING_DT varchar(8) comment '出荷日'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_SERIAL_NO_PK primary key (SERIAL_NO_ID)
) comment 'シリアルNo.管理' ;

create unique index T_SERIAL_NO_IX1
  on T_SERIAL_NO(CENTER_ID,CLIENT_ID,PRODUCT_ID,SERIAL_NO);

create index T_SERIAL_NO_IX2
  on T_SERIAL_NO(PRODUCT_ID);

-- 出荷指示ボディ
create table T_SHIPPING_INST_B (
  SHIPPING_INST_B_ID bigint not null comment '出荷指示ボディID'
  , SHIPPING_INST_H_ID bigint not null comment '出荷指示ヘッダID'
  , LINE_NO bigint not null comment '行No.'
  , WAREHOUSE_ID bigint comment '指定倉庫ID'
  , WAREHOUSE_CD varchar(30) comment '指定倉庫CD'
  , PRODUCT_ID bigint comment '商品ID'
  , PRODUCT_CD varchar(100) not null comment '商品CD'
  , STOCK_TYPE_ID bigint comment '在庫区分ID'
  , STOCK_TYPE_CD varchar(30) not null comment '在庫区分CD'
  , LOCATION_ID bigint comment '指定ロケーションID'
  , LOCATION_CD varchar(30) comment '指定ロケーションCD'
  , DEPOSIT_ID bigint comment '預託ID'
  , DEPOSIT_CD varchar(30) comment '預託CD'
  , LOT_ID bigint comment '指定ロットID'
  , LOT varchar(30) comment '指定ロット'
  , LIMIT_DT varchar(8) comment '指定期限日'
  , STORE_NO_ID bigint comment '指定入庫No.ID'
  , STORE_LABEL_NO varchar(30) comment '指定入庫ラベルNo.'
  , SHAPE_ID bigint comment '指定荷姿ID'
  , SHAPE_CD varchar(30) comment '指定荷姿CD'
  , UNIT_NUM bigint comment '指定入数'
  , INST_NUM decimal(14,4) default 0 not null comment '指示数'
  , ERROR_FLG char(1) comment 'エラーフラグ'
  , ERROR_MESSAGE_CD varchar(100) comment 'エラーメッセージCD'
  , ALLOC_INST_B_ID bigint comment '引当指示ボディID'
  , ALLOC_NUM decimal(14,4) default 0 not null comment '引当済数'
  , STOCK_OUT_NUM decimal(14,4) comment '欠品数'
  , UNIT_PRICE decimal(14,4) comment '単価'
  , PRICE decimal(14,4) comment '金額'
  , TAX decimal(14,4) comment '消費税'
  , CASE_PIECE_TYPE_ID bigint comment 'ケースバラ指定区分ID'
  , CASE_PIECE_TYPE_CD varchar(30) comment 'ケースバラ指定区分CD'
  , PROD_DT varchar(8) comment '指定製造日'
  , JAN_CD varchar(30) comment 'JANCD'
  , TAX_RATE decimal(14,4) comment '消費税率'
  , LOGI_WEIGHT_FLG char(1) comment '物流重量物フラグ'
  , LOGI_ATTENTION_TYPE_CD varchar(30) comment '物流注意区分'
  , LOGI_SPECIAL_TYPE_CD varchar(30) comment '物流特殊区分'
  , HINMOKU_TEXT varchar(60) comment '品目テキスト'
  , UNIT_NM varchar(60) comment '単位名称'
  , EC_UNIT_NM varchar(60) comment 'EC単位名'
  , SAMPLE_TYPE_CD varchar(30) comment 'サンプル区分'
  , EC_ORDER_BRANCH_NO varchar(30) comment 'ＥＣ発注番号_枝番'
  , EC_PRODUCT_NM_KANJI varchar(60) comment 'EC品名漢字'
  , STORE_PLANT_CD varchar(30) comment '入庫プラント'
  , STORE_STORAGE_SPACE_CD varchar(30) comment '入庫保管場所'
  , LOT_MANAG_TYPE_CD varchar(30) comment 'ロット管理区分'
  , DELIV_CD varchar(30) comment '納入先CD'
  , TRANSACTION_TYPE_CD varchar(30) comment '取引区分'
  , WM_SEND_FLG char(1) comment 'WMS送信済フラグ'
  , LP_SEND_FLG char(1) comment '物流ポータル送信済フラグ'
  , CM_SEND_FLG char(1) comment '共通管理送信済フラグ'
  , EMP_ID_CD varchar(30) comment '社員識別CD'
  , EMP_NM varchar(60) comment '社員氏名'
  , US3F_TYPE_CD varchar(30) comment 'US3階区分'
  , HINMOKU_GROUP varchar(30) comment '品目グループ'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_SHIPPING_INST_B_PK primary key (SHIPPING_INST_B_ID)
) comment '出荷指示ボディ' ;

create index T_SHIPPING_INST_B_IX1
  on T_SHIPPING_INST_B(SHIPPING_INST_H_ID);

create index T_SHIPPING_INST_B_IX2
  on T_SHIPPING_INST_B(PRODUCT_ID);

create index T_SHIPPING_INST_B_IX3
  on T_SHIPPING_INST_B(STOCK_TYPE_ID);

create index T_SHIPPING_INST_B_IX4
  on T_SHIPPING_INST_B(LOCATION_ID);

create index T_SHIPPING_INST_B_IX5
  on T_SHIPPING_INST_B(DEPOSIT_ID);

create index T_SHIPPING_INST_B_IX6
  on T_SHIPPING_INST_B(LOT_ID);

create index T_SHIPPING_INST_B_IX7
  on T_SHIPPING_INST_B(STORE_NO_ID);

create index T_SHIPPING_INST_B_IX8
  on T_SHIPPING_INST_B(SHAPE_ID);

create index T_SHIPPING_INST_B_IX9
  on T_SHIPPING_INST_B(ALLOC_INST_B_ID);

create index T_SHIPPING_INST_B_IX10
  on T_SHIPPING_INST_B(PRODUCT_CD);

create index T_SHIPPING_INST_B_IX11
  on T_SHIPPING_INST_B(WAREHOUSE_ID);

-- 出荷指示ボディ印刷データ
create table T_SHIPPING_INST_B_PRINT (
  SHIPPING_INST_B_PRINT_ID bigint not null comment '出荷指示ボディ帳票ID'
  , SHIPPING_INST_B_ID bigint not null comment '出荷指示ボディID'
  , HINMOKU_CD varchar(30) comment '品目CD'
  , HINMOKU_GROUP_CD varchar(30) comment '品目グループ'
  , SALES_ORDER_NUM decimal(14,4) default 0 comment '受注数量'
  , LOGI_WEIGHT_FLG char(1) comment '物流重量物フラグ'
  , LOGI_ATTENTION_TYPE_CD varchar(30) comment '物流注意区分'
  , LOGI_SPECIAL_TYPE_CD varchar(30) comment '物流特殊区分'
  , UNIT_PRICE bigint comment '商品単価'
  , EC_ORDER_BRANCH_NO varchar(30) comment 'ＥＣ発注番号_枝番'
  , EC_PRODUCT_NM_KANJI varchar(60) comment 'EC品名漢字'
  , DEAL_TYPE_CD varchar(30) comment '取引区分'
  , SPARE_STR varchar(255) comment '予備'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_SHIPPING_INST_B_PRINT_PK primary key (SHIPPING_INST_B_PRINT_ID)
) comment '出荷指示ボディ印刷データ' ;

create index T_SHIPPING_INST_B_PRINT_IX1
  on T_SHIPPING_INST_B_PRINT(SHIPPING_INST_B_PRINT_ID);

create index T_SHIPPING_INST_B_PRINT_IX2
  on T_SHIPPING_INST_B_PRINT(SHIPPING_INST_B_ID);

-- 出荷IFデータ転送テーブル
create table T_SHIPPING_INST_DATA_TRANSFER (
  SHIPPING_INST_DATA_TRANSFER_ID bigint not null comment '出荷IFデータ転送ID'
  , SHIPPING_INST_B_ID bigint not null comment '出荷指示ボディID'
  , DATA_TRANSFER_ONLY_STR01 varchar(30) comment 'ヘルメット区分'
  , DATA_TRANSFER_ONLY_STR02 varchar(60) comment 'マーク名称'
  , DATA_TRANSFER_ONLY_STR03 varchar(30) comment 'ステータス'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_SHIPPING_INST_DATA_TRANSFER_PK primary key (SHIPPING_INST_DATA_TRANSFER_ID,SHIPPING_INST_B_ID)
) comment '出荷IFデータ転送テーブル' ;

create index T_SHIPPING_INST_DATA_TRANSFER_IX1
  on T_SHIPPING_INST_DATA_TRANSFER(SHIPPING_INST_B_ID);

-- 出荷指示ヘッダ
create table T_SHIPPING_INST_H (
  SHIPPING_INST_H_ID bigint not null comment '出荷指示ヘッダID'
  , CLIENT_ID bigint not null comment '荷主ID'
  , CENTER_ID bigint not null comment 'センタID'
  , PROCESS_TYPE_ID bigint not null comment '処理区分ID'
  , INPUT_TYPE varchar(30) comment '入力区分'
  , SHIPPING_DT varchar(8) not null comment '出荷日'
  , WORK_DT varchar(8) comment '作業日'
  , DELIV_PLAN_DT varchar(8) comment '納品予定日'
  , DELIV_DT varchar(8) comment '納品指定日'
  , DELIV_TZ varchar(30) comment '納品時間帯'
  , CLIENT_SHIPPING_NO varchar(30) comment '顧客出荷指示No.'
  , SHIPPING_SLIP_NO varchar(30) comment 'WMS出荷伝票No.'
  , SHIPPING_STATUS varchar(30) not null comment '出荷ステータス'
  , SUPPLY_CUSTOMER_ID bigint comment '納品先ID'
  , SUPPLY_CUSTOMER_CD varchar(30) comment '納品先CD'
  , SUPPLY_CUSTOMER_NM varchar(255) comment '納品先名称'
  , DELIV_CUSTOMER_ID bigint comment '届先ID'
  , DELIV_CUSTOMER_CD varchar(30) comment '届先CD'
  , DELIV_ZIP_CD varchar(30) comment '届先郵便番号'
  , DELIV_ADDRESS1 varchar(255) comment '届先住所1'
  , DELIV_ADDRESS2 varchar(255) comment '届先住所2'
  , DELIV_ADDRESS3 varchar(255) comment '届先住所3'
  , DELIV_ADDRESS_SUPPLY varchar(60) comment '届先住所補足'
  , DELIV_CUSTOMER_NM varchar(255) comment '届先名称'
  , DELIV_CUSTOMER_NM1 varchar(255) comment '届先名称1'
  , DELIV_CUSTOMER_NM2 varchar(255) comment '届先名称2'
  , DELIV_TEL_NO varchar(255) comment '届先電話番号'
  , DELIVERY_COURSE_ID bigint comment '配送コースID'
  , DELIVERY_COURSE_CD varchar(30) comment '配送コースCD'
  , EMERGENCY_FLG char(1) comment '緊急フラグ'
  , PICKING_WORK_MESSAGE varchar(255) comment '出庫作業メッセージ'
  , ERROR_FLG char(1) comment 'エラーフラグ'
  , ERROR_MESSAGE_CD varchar(100) comment 'エラーメッセージCD'
  , PICKING_BATCH_NO varchar(30) comment '出庫指示バッチNo.'
  , STOCK_OUT_FLG char(1) comment '欠品フラグ'
  , ALLOC_INST_H_ID bigint comment '引当指示ヘッダID'
  , COD bigint comment '代引請求額'
  , COD_TAX bigint comment '代引消費税'
  , TOTAL_PRICE decimal(14,4) comment '合計金額'
  , TOTAL_TAX decimal(14,4) comment '合計消費税'
  , NIZOROE_NO varchar(30) comment '荷揃番号'
  , DAIHYO_NIZOROE_NO varchar(30) comment '代表荷揃番号'
  , NIZOROE_NO2 varchar(30) comment '荷揃番号_ハイフンあり'
  , DAIHYO_NIZOROE_NO2 varchar(30) comment '代表荷揃番号_ハイフンあり'
  , SHIPPING_TYPE_ID bigint comment '出荷区分ID'
  , SHIPPING_TYPE_CD varchar(30) comment '出荷区分CD'
  , CARRIER_ID varchar(30) comment '運送業者ID'
  , CARRIER_CD varchar(30) comment '運送業者CD'
  , SALES_ORG_CD varchar(30) comment '販売組織CD'
  , SALES_ORDER_NO varchar(30) comment '受注番号'
  , SALES_ORDER_SLIP_TYPE_CD varchar(30) comment '受注伝票タイプ'
  , SALES_ORDER_SLIP_NO varchar(30) comment '受注伝票番号'
  , ORDER_DT varchar(8) comment '注文日'
  , KOKYAKU_CD varchar(30) comment '顧客CD'
  , SHIPPING_FEE bigint comment '送料'
  , SEPARATE_SHIPPING_FEE bigint comment '別途送料'
  , COD_FEE bigint comment '代引手数料'
  , ORDER_NO_DELIVERY_NOTE varchar(30) comment '注文番号_納品書'
  , POINT bigint comment 'ポイント'
  , KOGUCHI_DELIVERY_FLG char(1) comment '戸口配送フラグ'
  , RECORD_SEND_FLG char(1) default '0' comment '実績送信フラグ'
  , CARRIER_DATA_OUT_FLG char(1) default '0' comment '運送業者データ出力フラグ'
  , KOHAI_CONTRACTOR_CD varchar(30) comment '戸配契約先CD'
  , KOHAI_CONTRACTOR_NM varchar(60) comment '戸配契約先名称'
  , SHIPPING_PLANT_CD varchar(30) comment '出庫プラント'
  , SHIPPING_STORAGE_SPACE_CD varchar(30) comment '出庫保管場所'
  , NIZOROE_ID bigint comment '荷揃処理ID'
  , NIZOROE_PROC_UNIT varchar(30) comment '荷揃処理単位'
  , ACCOUNT_ID bigint comment '得意先ID'
  , ACCOUNT_CD varchar(30) comment '得意先CD'
  , SHIPPING_REASON_CD varchar(30) comment '出荷発生事由'
  , TRANSFER_FLG char(1) comment '通常振替フラグ'
  , TENHANSHA_SALES_ORDER_NO varchar(30) comment '店販社発注番号'
  , DELIV_CD varchar(30) comment '納入先CD'
  , SALES_ORDER_NUM bigint comment '受注数量'
  , DIRECT_DELIVERY_TYPE_CD varchar(30) comment '直送区分'
  , SPLIT_DELIVERY_TYPE_CD varchar(30) comment '分納区分'
  , CARRIER_TYPE_CD varchar(30) comment '運送会社区分'
  , SPECIFY_DELIVERY_DT varchar(8) comment '配達指定日'
  , SPECIFY_DELIVERY_TIME varchar(30) comment '配達指定時間'
  , TENHANSHA_CD varchar(30) comment '店販社CD'
  , DESTINATION_NM_KANA varchar(60) comment '送り先名称_カナ'
  , DESTINATION_FAX varchar(30) comment '送り先ＦＡＸ番号'
  , KANJI_MESSAGE1 varchar(60) comment '漢字メッセージ_1'
  , KANJI_MESSAGE2 varchar(60) comment '漢字メッセージ_2'
  , KANJI_MESSAGE3 varchar(60) comment '漢字メッセージ_3'
  , KANJI_MESSAGE4 varchar(60) comment '漢字メッセージ_4'
  , KANJI_MESSAGE5 varchar(60) comment '漢字メッセージ_5'
  , KANJI_MESSAGE6 varchar(60) comment '漢字メッセージ_6'
  , KANJI_MESSAGE7 varchar(60) comment '漢字メッセージ_7'
  , KANJI_MESSAGE8 varchar(60) comment '漢字メッセージ_8'
  , KANJI_MESSAGE9 varchar(60) comment '漢字メッセージ_9'
  , KANJI_MESSAGE10 varchar(60) comment '漢字メッセージ_10'
  , KANA_MESSAGE1 varchar(60) comment 'カナメッセージ_1'
  , KANA_MESSAGE2 varchar(60) comment 'カナメッセージ_2'
  , KANA_MESSAGE3 varchar(60) comment 'カナメッセージ_3'
  , KANA_MESSAGE4 varchar(60) comment 'カナメッセージ_4'
  , KANA_MESSAGE5 varchar(60) comment 'カナメッセージ_5'
  , KANA_MESSAGE6 varchar(60) comment 'カナメッセージ_6'
  , KANA_MESSAGE7 varchar(60) comment 'カナメッセージ_7'
  , KANA_MESSAGE8 varchar(60) comment 'カナメッセージ_8'
  , KANA_MESSAGE9 varchar(60) comment 'カナメッセージ_9'
  , KANA_MESSAGE10 varchar(60) comment 'カナメッセージ_10'
  , DELIVERY_NOTE_SUMMARY varchar(255) comment '納品書摘要'
  , INVOICE_SUMMARY varchar(60) comment '送り状摘要'
  , EC_ORDER_NO varchar(30) comment 'ＥＣ発注番号'
  , PAYMENT_TYPE_CD varchar(30) comment '決済区分'
  , PRICE_HIDDEN_FLG char(1) comment '金額非表示フラグ'
  , PAYMENT_HIDDEN_FLG char(1) comment '決済非表示フラグ'
  , DIRECT_UPD_FLG char(1) comment '直送扱い更新フラグ'
  , IF_ID varchar(30) comment 'IFID'
  , CUSTOMER_CD varchar(30) comment '取引先CD'
  , CUSTOMER_NM varchar(60) comment '取引先名称'
  , PSAM varchar(30) comment 'PSAM'
  , FLOOR_COMP_FLG char(1) comment 'フロア完結フラグ'
  , DELIVERY_TYPE varchar(30) comment '配送種別'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_SHIPPING_INST_H_PK primary key (SHIPPING_INST_H_ID)
) comment '出荷指示ヘッダ' ;

create index T_SHIPPING_INST_H_IX1
  on T_SHIPPING_INST_H(ALLOC_INST_H_ID);

create index T_SHIPPING_INST_H_IX2
  on T_SHIPPING_INST_H(PROCESS_TYPE_ID);

create index T_SHIPPING_INST_H_IX3
  on T_SHIPPING_INST_H(SUPPLY_CUSTOMER_ID);

create index T_SHIPPING_INST_H_IX4
  on T_SHIPPING_INST_H(DELIV_CUSTOMER_ID);

create index T_SHIPPING_INST_H_IX5
  on T_SHIPPING_INST_H(DELIVERY_COURSE_ID);

create index T_SHIPPING_INST_H_IX6
  on T_SHIPPING_INST_H(SHIPPING_DT);

create index T_SHIPPING_INST_H_IX7
  on T_SHIPPING_INST_H(WORK_DT);

create index T_SHIPPING_INST_H_IX8
  on T_SHIPPING_INST_H(CLIENT_SHIPPING_NO);

create index T_SHIPPING_INST_H_IX9
  on T_SHIPPING_INST_H(SHIPPING_SLIP_NO);

create index T_SHIPPING_INST_H_IX10
  on T_SHIPPING_INST_H(SUPPLY_CUSTOMER_CD);

create index T_SHIPPING_INST_H_IX11
  on T_SHIPPING_INST_H(DELIVERY_COURSE_CD);

create index T_SHIPPING_INST_H_IX12
  on T_SHIPPING_INST_H(PICKING_BATCH_NO);

create index T_SHIPPING_INST_H_IX13
  on T_SHIPPING_INST_H(SHIPPING_STATUS);

-- 出荷指示ヘッダ印刷データ
create table T_SHIPPING_INST_H_PRINT (
  SHIPPING_INST_H_PRINT_ID bigint not null comment '出荷指示ヘッダ帳票ID'
  , SHIPPING_INST_H_ID bigint not null comment '出荷指示ヘッダID'
  , SALES_ORDER_NO varchar(30) comment '受注番号'
  , SALES_ORDER_SLIP_TYPE_CD varchar(30) comment '受注伝票タイプ'
  , SALES_ORDER_SLIP_NO varchar(30) comment '受注伝票番号'
  , SHIPPING_REASON varchar(60) comment '出荷発生事由'
  , LOGI_ATTENTION_TYPE_CD varchar(30) comment '物流注意区分'
  , LOGI_SPECIAL_TYPE_CD varchar(30) comment '物流特殊区分'
  , KOGUCHI_DELIVERY_FLG varchar(30) comment '戸口配送フラグ'
  , SHIPPING_DT varchar(8) comment '出荷日'
  , SPECIFY_DELIVERY_DT varchar(8) comment '配達指定日'
  , SPECIFY_DELIVERY_TIME varchar(6) comment '配達指定時間'
  , TENHANSHA_ID bigint comment '店販社ID'
  , TENHANSHA_ORDER_NO varchar(30) comment '店販社発注番号'
  , CONTRACTOR_NM varchar(60) comment '戸配契約先名称'
  , DESTINATION_CD varchar(30) comment '送り先CD'
  , DESTINATION_NM1 varchar(60) comment '送り先名称１'
  , DESTINATION_NM2 varchar(60) comment '送り先名称２'
  , DESTINATION_ZIP_CD varchar(60) comment '送り先郵便番号'
  , DESTINATION_ADDRESS1 varchar(60) comment '送り先住所１'
  , DESTINATION_ADDRESS2 varchar(60) comment '送り先住所２'
  , DESTINATION_TEL varchar(30) comment '送り先電話番号'
  , SHIPPING_PLANT_CD varchar(30) comment '出庫プラント'
  , SHIPPING_STORAGE_SPACE_CD varchar(30) comment '出庫保管場所'
  , DEAL_TYPE_CD varchar(30) comment '取引区分'
  , CUSTOMER_CD varchar(30) comment '取引先CD'
  , CUSTOMER_NM varchar(60) comment '取引先名称'
  , SPARE_STR varchar(255) comment '予備'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_SHIPPING_INST_H_PRINT_PK primary key (SHIPPING_INST_H_PRINT_ID)
) comment '出荷指示ヘッダ印刷データ' ;

create index T_SHIPPING_INST_H_PRINT_IX1
  on T_SHIPPING_INST_H_PRINT(SHIPPING_INST_H_PRINT_ID);

create index T_SHIPPING_INST_H_PRINT_IX2
  on T_SHIPPING_INST_H_PRINT(SHIPPING_INST_H_ID);

-- 出荷指示予備
create table T_SHIPPING_INST_SPARE (
  SHIPPING_INST_B_ID bigint not null comment '出荷指示ボディID'
  , SPARE_STR_1 varchar(255) comment '予備項目１（文字列）'
  , SPARE_STR_2 varchar(255) comment '予備項目２（文字列）'
  , SPARE_STR_3 varchar(255) comment '予備項目３（文字列）'
  , SPARE_NUM_1 decimal(14,4) comment '予備項目１（数値）'
  , SPARE_NUM_2 decimal(14,4) comment '予備項目２（数値）'
  , SPARE_NUM_3 decimal(14,4) comment '予備項目３（数値）'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_SHIPPING_INST_SPARE_PK primary key (SHIPPING_INST_B_ID)
) comment '出荷指示予備' ;

-- 出荷予定ボディ
create table T_SHIPPING_PLAN_B (
  SHIPPING_PLAN_B_ID bigint not null comment '出荷予定ボディID'
  , SHIPPING_PLAN_H_ID bigint not null comment '出荷予定ヘッダID'
  , LINE_NO bigint not null comment '行No.'
  , WAREHOUSE_ID bigint comment '指定倉庫ID'
  , WAREHOUSE_CD varchar(30) comment '指定倉庫CD'
  , PRODUCT_ID bigint comment '商品ID'
  , PRODUCT_CD varchar(100) not null comment '商品CD'
  , LOCATION_ID bigint comment '指定ロケーションID'
  , LOCATION_CD varchar(30) comment '指定ロケーションCD'
  , DEPOSIT_ID bigint comment '預託ID'
  , DEPOSIT_CD varchar(30) comment '預託CD'
  , LOT_ID bigint comment '指定ロットID'
  , LOT varchar(30) comment '指定ロット'
  , LIMIT_DT varchar(8) comment '指定期限日'
  , STORE_NO_ID bigint comment '指定入庫No.ID'
  , STORE_LABEL_NO varchar(30) comment '指定入庫ラベルNo.'
  , SHAPE_ID bigint comment '指定荷姿ID'
  , SHAPE_CD varchar(30) comment '指定荷姿CD'
  , UNIT_NUM bigint comment '指定入数'
  , INST_NUM decimal(14,4) default 0 not null comment '指示数'
  , ERROR_FLG char(1) comment 'エラーフラグ'
  , ERROR_MESSAGE_CD varchar(100) comment 'エラーメッセージCD'
  , ALLOC_INST_B_ID bigint comment '引当指示ボディID'
  , ALLOC_NUM decimal(14,4) default 0 not null comment '引当済数'
  , STOCK_OUT_NUM decimal(14,4) comment '欠品数'
  , UNIT_PRICE decimal(14,4) comment '単価'
  , PRICE decimal(14,4) comment '金額'
  , TAX decimal(14,4) comment '消費税'
  , CASE_PIECE_TYPE_ID bigint comment 'ケースバラ指定区分ID'
  , CASE_PIECE_TYPE_CD varchar(30) comment 'ケースバラ指定区分CD'
  , PROD_DT varchar(8) comment '指定製造日'
  , JAN_CD varchar(30) comment 'JANCD'
  , HINMOKU_GROUP varchar(30) comment '品目グループ'
  , HINMOKU_TEXT varchar(60) comment '品目テキスト'
  , UNIT_NM varchar(60) comment '単位名称'
  , STORE_STORAGE_SPACE_CD varchar(60) comment '入庫保管場所'
  , STORE_PLANT_CD varchar(30) comment '入庫プラント'
  , TRANSACTION_TYPE_CD varchar(30) comment '取引区分'
  , CM_SEND_FLG char(1) default '0' comment '共通管理送信済フラグ'
  , LP_SEND_FLG char(1) default '0' comment '物流ポータル送信済フラグ'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_SHIPPING_PLAN_B_PK primary key (SHIPPING_PLAN_B_ID)
) comment '出荷予定ボディ' ;

create index T_SHIPPING_PLAN_B_IX1
  on T_SHIPPING_PLAN_B(SHIPPING_PLAN_H_ID);

create index T_SHIPPING_PLAN_B_IX2
  on T_SHIPPING_PLAN_B(PRODUCT_ID);

create index T_SHIPPING_PLAN_B_IX3
  on T_SHIPPING_PLAN_B(LOCATION_ID);

create index T_SHIPPING_PLAN_B_IX4
  on T_SHIPPING_PLAN_B(DEPOSIT_ID);

create index T_SHIPPING_PLAN_B_IX5
  on T_SHIPPING_PLAN_B(LOT_ID);

create index T_SHIPPING_PLAN_B_IX6
  on T_SHIPPING_PLAN_B(STORE_NO_ID);

create index T_SHIPPING_PLAN_B_IX7
  on T_SHIPPING_PLAN_B(SHAPE_ID);

create index T_SHIPPING_PLAN_B_IX8
  on T_SHIPPING_PLAN_B(ALLOC_INST_B_ID);

create index T_SHIPPING_PLAN_B_IX9
  on T_SHIPPING_PLAN_B(PRODUCT_CD);

create index T_SHIPPING_PLAN_B_IX10
  on T_SHIPPING_PLAN_B(WAREHOUSE_ID);

-- 出荷予定ヘッダ
create table T_SHIPPING_PLAN_H (
  SHIPPING_PLAN_H_ID bigint not null comment '出荷予定ヘッダID'
  , CLIENT_ID bigint not null comment '荷主ID'
  , CENTER_ID bigint not null comment 'センタID'
  , PROCESS_TYPE_ID bigint not null comment '処理区分ID'
  , INPUT_TYPE varchar(30) comment '入力区分'
  , SHIPPING_DT varchar(8) not null comment '出荷日'
  , WORK_DT varchar(8) comment '作業日'
  , DELIV_PLAN_DT varchar(8) comment '納品予定日'
  , DELIV_DT varchar(8) comment '納品指定日'
  , DELIV_TZ varchar(30) comment '納品時間帯'
  , CLIENT_SHIPPING_NO varchar(30) comment '顧客出荷指示No.'
  , SHIPPING_SLIP_NO varchar(30) comment 'WMS出荷伝票No.'
  , SHIPPING_STATUS varchar(30) not null comment '出荷ステータス'
  , SUPPLY_CUSTOMER_ID bigint comment '納品先ID'
  , SUPPLY_CUSTOMER_CD varchar(30) comment '納品先CD'
  , SUPPLY_CUSTOMER_NM varchar(255) comment '納品先名称'
  , DELIV_CUSTOMER_ID bigint comment '届先ID'
  , DELIV_CUSTOMER_CD varchar(30) comment '届先CD'
  , DELIV_ZIP_CD varchar(30) comment '届先郵便番号'
  , DELIV_ADDRESS1 varchar(255) comment '届先住所1'
  , DELIV_ADDRESS2 varchar(255) comment '届先住所2'
  , DELIV_ADDRESS3 varchar(255) comment '届先住所3'
  , DELIV_ADDRESS_SUPPLY varchar(60) comment '届先住所補足'
  , DELIV_TEL_NO varchar(255) comment '届先電話番号'
  , DELIVERY_COURSE_ID bigint comment '配送コースID'
  , DELIVERY_COURSE_CD varchar(30) comment '配送コースCD'
  , EMERGENCY_FLG char(1) comment '緊急フラグ'
  , PICKING_WORK_MESSAGE varchar(255) comment '出庫作業メッセージ'
  , ERROR_FLG char(1) comment 'エラーフラグ'
  , ERROR_MESSAGE_CD varchar(100) comment 'エラーメッセージCD'
  , PICKING_BATCH_NO varchar(30) comment '出庫指示バッチNo.'
  , STOCK_OUT_FLG char(1) comment '欠品フラグ'
  , ALLOC_INST_H_ID bigint comment '引当指示ヘッダID'
  , COD bigint comment '代引請求額'
  , COD_TAX bigint comment '代引消費税'
  , TOTAL_PRICE decimal(14,4) comment '合計金額'
  , TOTAL_TAX decimal(14,4) comment '合計消費税'
  , SLIP_TYPE_CD varchar(30) comment '伝票種別'
  , SALES_ORDER_SLIP_TYPE_CD varchar(30) comment '受注伝票タイプ'
  , DIRECT_DELIVERY_TYPE_CD varchar(30) comment '直送区分'
  , SHIPPING_TYPE_ID bigint comment '出荷区分ID'
  , SHIPPING_TYPE_CD varchar(30) comment '出荷区分CD'
  , SALES_ORG_CD varchar(30) comment '販売組織CD'
  , KOGUCHI_DELIVERY_FLG char(1) comment '戸口配送フラグ'
  , KOHAI_CONTRACTOR_CD varchar(30) comment '戸配契約先CD'
  , KOHAI_CONTRACTOR_NM varchar(60) comment '戸配契約先名称'
  , SHIPPING_REASON_CD varchar(30) comment '出荷発生事由'
  , SHIPPING_PLANT_CD varchar(30) comment '出庫プラント'
  , SHIPPING_STORAGE_SPACE_CD varchar(30) comment '出庫保管場所'
  , TENHANSHA_CD varchar(30) comment '店販社CD'
  , TENHANSHA_ORDER_NO varchar(30) comment '店販社発注番号'
  , DESTINATION_CD varchar(30) comment '送り先CD'
  , DESTINATION_NM1 varchar(60) comment '送り先名称1'
  , DESTINATION_NM2 varchar(60) comment '送り先名称2'
  , DESTINATION_NM_KANA varchar(60) comment '送り先名称_カナ'
  , DESTINATION_FAX varchar(30) comment '送り先ＦＡＸ番号'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_SHIPPING_PLAN_H_PK primary key (SHIPPING_PLAN_H_ID)
) comment '出荷予定ヘッダ' ;

create index T_SHIPPING_PLAN_H_IX1
  on T_SHIPPING_PLAN_H(ALLOC_INST_H_ID);

create index T_SHIPPING_PLAN_H_IX2
  on T_SHIPPING_PLAN_H(PROCESS_TYPE_ID);

create index T_SHIPPING_PLAN_H_IX3
  on T_SHIPPING_PLAN_H(SUPPLY_CUSTOMER_ID);

create index T_SHIPPING_PLAN_H_IX4
  on T_SHIPPING_PLAN_H(DELIV_CUSTOMER_ID);

create index T_SHIPPING_PLAN_H_IX5
  on T_SHIPPING_PLAN_H(DELIVERY_COURSE_ID);

create index T_SHIPPING_PLAN_H_IX6
  on T_SHIPPING_PLAN_H(SHIPPING_DT);

create index T_SHIPPING_PLAN_H_IX7
  on T_SHIPPING_PLAN_H(WORK_DT);

create index T_SHIPPING_PLAN_H_IX8
  on T_SHIPPING_PLAN_H(CLIENT_SHIPPING_NO);

create index T_SHIPPING_PLAN_H_IX9
  on T_SHIPPING_PLAN_H(SHIPPING_SLIP_NO);

create index T_SHIPPING_PLAN_H_IX10
  on T_SHIPPING_PLAN_H(SUPPLY_CUSTOMER_CD);

create index T_SHIPPING_PLAN_H_IX11
  on T_SHIPPING_PLAN_H(DELIV_CUSTOMER_CD);

create index T_SHIPPING_PLAN_H_IX12
  on T_SHIPPING_PLAN_H(PICKING_BATCH_NO);

create index T_SHIPPING_PLAN_H_IX13
  on T_SHIPPING_PLAN_H(SHIPPING_STATUS);

-- 出荷実績ボディ
create table T_SHIPPING_RECORD_B (
  SHIPPING_RECORD_B_ID bigint not null comment '出荷実績ボディID'
  , SHIPPING_RECORD_H_ID bigint comment '出荷実績ヘッダID'
  , SHIPPING_SLIP_ROW_NO varchar(30) comment '出荷伝票明細番号'
  , SN bigint default 0 comment '連番'
  , PRODUCT_CD varchar(30) not null comment '商品CD'
  , JAN_CD varchar(30) comment 'JANCD'
  , NUM decimal(14,4) default 0 not null comment '数量'
  , LOT_MANAG_TYPE_CD varchar(30) comment 'ロット管理区分'
  , LOT varchar(100) comment 'ロット番号'
  , CONFIRMED_PACKING_NUM bigint not null comment '確定梱包数'
  , SR_SEND_FLG char(1) default '0' comment '出荷実績送信済フラグ'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_SHIPPING_RECORD_B_PK primary key (SHIPPING_RECORD_B_ID)
) comment '出荷実績ボディ' ;

-- 出荷実績ヘッダ
create table T_SHIPPING_RECORD_H (
  SHIPPING_RECORD_H_ID bigint not null comment '出荷実績ヘッダID'
  , CLIENT_ID bigint not null comment '荷主ID'
  , SHIPPING_SLIP_NO varchar(30) comment '出荷伝票番号'
  , SALES_ORDER_NO varchar(30) comment '受注番号'
  , SHIPPING_DT varchar(8) not null comment '出荷日'
  , SHIPPING_STORAGE_SPACE_CD varchar(30) comment '出庫保管場所'
  , NIZOROE_NO varchar(30) comment '荷揃番号'
  , DAIHYO_NIZOROE_NO varchar(30) comment '代表荷揃番号'
  , CARRIER_SLIP_NO varchar(30) comment '運送便伝票番号'
  , CARRIER_CD varchar(30) comment '運送業者CD'
  , CARRIER_RNM varchar(60) comment '運送業者略称'
  , SALES_NO2 varchar(30) comment '売上番号２'
  , DELIVERY_SLIP_NO varchar(30) comment '納品書番号'
  , D_STR varchar(60) comment 'D'
  , I_STR varchar(60) comment 'I'
  , S4_SEND_FLG char(1) comment 'S4送信済フラグ'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_SHIPPING_RECORD_H_PK primary key (SHIPPING_RECORD_H_ID)
) comment '出荷実績ヘッダ' ;

-- 在庫
create table T_STOCK (
  STOCK_ID bigint not null comment '在庫ID'
  , CLIENT_ID bigint not null comment '荷主ID'
  , WAREHOUSE_ID bigint not null comment '倉庫ID'
  , PRODUCT_ID bigint not null comment '商品ID'
  , STOCK_TYPE_ID bigint not null comment '在庫区分ID'
  , LOCATION_ID bigint not null comment 'ロケーションID'
  , DEPOSIT_ID bigint not null comment '預託ID'
  , LOT_ID bigint not null comment 'ロットID'
  , SHAPE_ID bigint comment '荷姿ID'
  , STORE_NO_ID bigint not null comment '入庫No.ID'
  , UNIT_NUM bigint comment '入数'
  , CHARGE_NUM decimal(14,4) default 0 not null comment '引当可能数'
  , ALLOC_NUM decimal(14,4) default 0 not null comment '引当済数'
  , MOVE_NUM decimal(14,4) default 0 not null comment '移動中数'
  , TRANSIT_NUM decimal(14,4) default 0 not null comment '積送中数'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_STOCK_PK primary key (STOCK_ID)
) comment '在庫' ;

create unique index T_STOCK_IX1
  on T_STOCK(STORE_NO_ID,LOCATION_ID);

create index T_STOCK_IX2
  on T_STOCK(PRODUCT_ID,STOCK_TYPE_ID,DEPOSIT_ID,LOT_ID,LOCATION_ID);

create index T_STOCK_IX3
  on T_STOCK(STOCK_TYPE_ID);

create index T_STOCK_IX4
  on T_STOCK(LOCATION_ID);

create index T_STOCK_IX5
  on T_STOCK(DEPOSIT_ID);

create index T_STOCK_IX6
  on T_STOCK(LOT_ID);

create index T_STOCK_IX7
  on T_STOCK(SHAPE_ID);

create index T_STOCK_IX8
  on T_STOCK(STORE_NO_ID);

-- 帳簿在庫
create table T_STOCK_BOOK (
  STOCK_BOOK_ID bigint not null comment '帳簿在庫ID'
  , BASE_CD varchar(30) comment '拠点CD'
  , BASE_TYPE_CD varchar(30) comment '拠点区分'
  , VARIETY_TYPE_CD varchar(30) comment '品種区分'
  , PRODUCT_ID bigint comment '商品ID'
  , CHARGE_NUM decimal(14,4) comment '帳簿引当可能数'
  , ALLOC_NUM decimal(14,4) comment '帳簿引当済数'
  , SALES_ORG_CD varchar(30) comment '販売組織CD'
  , SALES_ORG_NM varchar(60) comment '販売組織名称'
  , USER_CD varchar(30) comment 'ユーザCD'
  , USER_NM varchar(60) comment 'ユーザ名称'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_STOCK_BOOK_PK primary key (STOCK_BOOK_ID)
) comment '帳簿在庫' ;

-- 在庫受払
create table T_STOCK_INOUT (
  STOCK_INOUT_ID bigint not null comment '在庫受払ID'
  , FS_STOCK_INOUT_ID bigint comment '初回在庫受払ID'
  , BF_STOCK_INOUT_ID bigint comment '前回在庫受払ID'
  , MOVE_RECORD_B_ID bigint comment '在庫移動実績ボディID'
  , STORE_RECORD_B_ID bigint comment '入庫実績ボディID'
  , ALLOC_INST_B_ID bigint comment '引当指示ボディID'
  , PROCESS_DT varchar(8) not null comment '処理日'
  , PROCESS_TYPE_ID bigint not null comment '処理区分ID'
  , PROCESS_NO varchar(30) not null comment '処理No.'
  , CORRECT_TYPE char(1) not null comment '赤黒区分'
  , STOCK_ID bigint not null comment '在庫ID'
  , INOUT_TYPE char(1) not null comment '入出庫区分'
  , STOCK_INOUT_NUM decimal(14,4) default 0 not null comment '受払数'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_STOCK_INOUT_PK primary key (STOCK_INOUT_ID)
) comment '在庫受払' ;

create index T_STOCK_INOUT_IX1
  on T_STOCK_INOUT(MOVE_RECORD_B_ID);

create index T_STOCK_INOUT_IX2
  on T_STOCK_INOUT(STORE_RECORD_B_ID);

create index T_STOCK_INOUT_IX3
  on T_STOCK_INOUT(ALLOC_INST_B_ID);

create index T_STOCK_INOUT_IX4
  on T_STOCK_INOUT(FS_STOCK_INOUT_ID);

create index T_STOCK_INOUT_IX5
  on T_STOCK_INOUT(BF_STOCK_INOUT_ID);

create index T_STOCK_INOUT_IX6
  on T_STOCK_INOUT(PROCESS_TYPE_ID);

create index T_STOCK_INOUT_IX7
  on T_STOCK_INOUT(STOCK_ID);

create index T_STOCK_INOUT_IX8
  on T_STOCK_INOUT(PROCESS_DT);

-- 在庫実績情報
create table T_STOCK_RECORD (
  STOCK_RECORD_ID bigint not null comment '在庫実績ID'
  , CLIENT_ID bigint not null comment '荷主ID'
  , PLANT_CD varchar(30) comment 'プラントCD'
  , STORAGE_SPACE_CD varchar(30) comment '保管場所'
  , REFERENCE_DT varchar(8) comment '基準日'
  , PRODUCT_CD varchar(30) comment '商品CD'
  , STOCK_NUM decimal(14,4) default 0 comment '在庫数量'
  , PRODUCT_NM_KANJI varchar(60) comment '品名漢字'
  , BARCODE varchar(30) comment 'バーコード'
  , DEPOSIT_JAN_CD varchar(30) comment '預かりJANCD'
  , TENHANSHA_CD varchar(30) comment '店販社CD'
  , SALES_ORG_CD varchar(30) comment '販売組織CD'
  , TENHANSHA_NM1 varchar(60) comment '店販社名1'
  , TENHANSHA_NM2 varchar(60) comment '店販社名2'
  , SAP_USER_CD varchar(30) comment 'SAPユーザCD'
  , SAP_USER_NM varchar(60) comment 'SAPユーザ名称'
  , ALLOC_TYPE_CD varchar(30) comment '引当区分'
  , COMMENT varchar(255) comment '備考'
  , SPARE_STR varchar(255) comment '予備'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_STOCK_RECORD_PK primary key (STOCK_RECORD_ID)
) comment '在庫実績情報' ;

-- 在庫日報
create table T_STOCK_REPORT (
  STOCK_ID bigint not null comment '在庫ID'
  , STORE_NUM_DAY decimal(14,4) default 0 comment '当日入庫数'
  , PICKING_NUM_DAY decimal(14,4) default 0 comment '当日出庫数'
  , MOVE_PLS_NUM_DAY decimal(14,4) default 0 comment '当日移動数＋'
  , MOVE_MNS_NUM_DAY decimal(14,4) default 0 comment '当日移動数－'
  , ADJ_PLS_NUM_DAY decimal(14,4) default 0 comment '当日調整数＋'
  , ADJ_MNS_NUM_DAY decimal(14,4) default 0 comment '当日調整数－'
  , P_CHARGE_NUM_DAY decimal(14,4) default 0 comment '前日引当可能数'
  , P_ALLOC_NUM_DAY decimal(14,4) default 0 comment '前日引当済数'
  , P_MOVE_NUM_DAY decimal(14,4) default 0 comment '前日移動中数'
  , P_TRANSIT_NUM_DAY decimal(14,4) default 0 comment '前日積送中数'
  , STORE_NUM_MONTH decimal(14,4) default 0 comment '当月入庫数'
  , PICKING_NUM_MONTH decimal(14,4) default 0 comment '当月出庫数'
  , MOVE_PLS_NUM_MONTH decimal(14,4) default 0 comment '当月移動数＋'
  , MOVE_MNS_NUM_MONTH decimal(14,4) default 0 comment '当月移動数－'
  , ADJ_PLS_NUM_MONTH decimal(14,4) default 0 comment '当月調整数＋'
  , ADJ_MNS_NUM_MONTH decimal(14,4) default 0 comment '当月調整数－'
  , P_CHARGE_NUM_MONTH decimal(14,4) default 0 comment '前月引当可能数'
  , P_ALLOC_NUM_MONTH decimal(14,4) default 0 comment '前月引当済数'
  , P_MOVE_NUM_MONTH decimal(14,4) default 0 comment '前月移動中数'
  , P_TRANSIT_NUM_MONTH decimal(14,4) default 0 comment '前月積送中数'
  , CHARGE_NUM_10 decimal(14,4) default 0 comment '10日残引当可能数'
  , ALLOC_NUM_10 decimal(14,4) default 0 comment '10日残引当済数'
  , MOVE_NUM_10 decimal(14,4) default 0 comment '10日残移動中数'
  , TRANSIT_NUM_10 decimal(14,4) default 0 comment '10日残積送中数'
  , CHARGE_NUM_15 decimal(14,4) default 0 comment '15日残引当可能数'
  , ALLOC_NUM_15 decimal(14,4) default 0 comment '15日残引当済数'
  , MOVE_NUM_15 decimal(14,4) default 0 comment '15日残移動中数'
  , TRANSIT_NUM_15 decimal(14,4) default 0 comment '15日残積送中数'
  , CHARGE_NUM_20 decimal(14,4) default 0 comment '20日残引当可能数'
  , ALLOC_NUM_20 decimal(14,4) default 0 comment '20日残引当済数'
  , MOVE_NUM_20 decimal(14,4) default 0 comment '20日残移動中数'
  , TRANSIT_NUM_20 decimal(14,4) default 0 comment '20日残積送中数'
  , CHARGE_NUM_LAST decimal(14,4) default 0 comment '末日残引当可能数'
  , ALLOC_NUM_LAST decimal(14,4) default 0 comment '末日残引当済数'
  , MOVE_NUM_LAST decimal(14,4) default 0 comment '末日残移動中数'
  , TRANSIT_NUM_LAST decimal(14,4) default 0 comment '末日残積送中数'
  , LAST_STORE_DT varchar(8) comment '最新入庫年月日'
  , LAST_PICKING_DT varchar(8) comment '最新出庫年月日'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_STOCK_REPORT_PK primary key (STOCK_ID)
) comment '在庫日報' ;

-- 入庫No.
create table T_STORE_NO (
  STORE_NO_ID bigint not null comment '入庫No.ID'
  , STORE_LABEL_NO varchar(30) not null comment '入庫ラベルNo.'
  , OLD_STORE_NUM_ID bigint comment '元入庫No.ID'
  , SUPPLIER_ID bigint comment '仕入先ID'
  , STORE_DT varchar(8) comment '入庫日'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_STORE_NO_PK primary key (STORE_NO_ID)
) comment '入庫No.' ;

create unique index T_STORE_NO_IX1
  on T_STORE_NO(STORE_LABEL_NO);

create index T_STORE_NO_IX2
  on T_STORE_NO(OLD_STORE_NUM_ID);

create index T_STORE_NO_IX3
  on T_STORE_NO(SUPPLIER_ID);

-- 入庫No.帳票
create table T_STORE_NO_R (
  STORE_NO_ID bigint not null comment '入庫No.ID'
  , TWL_OUT_FLG char(1) comment '入庫ラベル出力フラグ'
  , TWL_OUT_USER_ID bigint comment '入庫ラベル出力者ID'
  , TWL_OUT_DT datetime(3) comment '入庫ラベル出力日時'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_STORE_NO_R_PK primary key (STORE_NO_ID)
) comment '入庫No.帳票' ;

create index T_STORE_NO_R_IX1
  on T_STORE_NO_R(TWL_OUT_USER_ID);

-- 入庫実績ボディ
create table T_STORE_RECORD_B (
  STORE_RECORD_B_ID bigint not null comment '入庫実績ボディID'
  , STORE_RECORD_H_ID bigint not null comment '入庫実績ヘッダID'
  , RECEIVE_PLAN_B_ID bigint not null comment '入荷予定ボディID'
  , PROCESS_NO varchar(30) not null comment '処理No.'
  , CLIENT_ORDER_NO varchar(30) comment '顧客発注No.'
  , LOT varchar(30) comment 'ロット'
  , LIMIT_DT varchar(8) comment '期限日'
  , STORE_DT varchar(8) not null comment '入庫日'
  , STORE_NUM decimal(14,4) default 0 not null comment '入庫数'
  , STORE_FLG char(1) default '0' not null comment '入庫格納フラグ'
  , STORE_LOCATION_ID bigint comment '入庫格納ロケーションID'
  , INPUT_TYPE varchar(30) comment '入力区分'
  , HT_STORE_INSPECTION_DT varchar(8) comment 'HT検品完了日'
  , HT_STORE_INSPECTION_USER_ID varchar(30) comment 'HT検品担当者ID'
  , STORE_RECORD_B_COMMENT varchar(255) comment '入庫実績ボディ備考'
  , PROD_DT varchar(8) comment '製造日'
  , STORE_REASON_CD varchar(30) comment '入庫発生事由CD'
  , RECEIVE_NO varchar(30) comment '入荷番号'
  , PROCESS_TYPE_CD varchar(30) comment '処理区分'
  , SLIP_NO varchar(30) comment '伝票番号'
  , RECEIVE_UNIT_NUM bigint comment '入荷時入数'
  , STORE_RECORD_SEND_FLG char(1) comment '入庫実績送信済フラグ'
  , TRANSFER_SEND_FLG char(1) comment '振替送信済フラグ'
  , PRODUCT_STORE_STATUS varchar(30) comment '商品別入庫ステータス'
  , USER_ID bigint comment '担当者ID'
  , CM_SEND_FLG_STORE char(1) default '0' comment '共通管理送信済フラグ_入庫実績'
  , CM_SEND_FLG_TRANSFER char(1) default '0' comment '共通管理送信済フラグ_振替'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_STORE_RECORD_B_PK primary key (STORE_RECORD_B_ID)
) comment '入庫実績ボディ' ;

create index T_STORE_RECORD_B_IX1
  on T_STORE_RECORD_B(STORE_RECORD_H_ID);

create index T_STORE_RECORD_B_IX2
  on T_STORE_RECORD_B(RECEIVE_PLAN_B_ID);

create index T_STORE_RECORD_B_IX3
  on T_STORE_RECORD_B(STORE_LOCATION_ID);

create index T_STORE_RECORD_B_IX4
  on T_STORE_RECORD_B(CLIENT_ORDER_NO);

create index T_STORE_RECORD_B_IX5
  on T_STORE_RECORD_B(STORE_DT);

-- 入庫実績ヘッダ
create table T_STORE_RECORD_H (
  STORE_RECORD_H_ID bigint not null comment '入庫実績ヘッダID'
  , RECEIVE_PLAN_H_ID bigint not null comment '入荷予定ヘッダID'
  , CLIENT_ID bigint not null comment '荷主ID'
  , CENTER_ID bigint not null comment 'センタID'
  , PROCESS_TYPE_ID bigint not null comment '処理区分ID'
  , STOCK_TYPE_ID bigint comment '在庫区分ID'
  , CLIENT_RECEIVE_NO varchar(30) comment '顧客入荷指示No.'
  , SUPPLIER_ID bigint comment '仕入先ID'
  , DEPOSIT_ID bigint comment '預託ID'
  , STORE_RECORD_H_COMMENT varchar(255) comment '入庫実績ヘッダ備考'
  , S4_SEND_FLG varchar(30) comment 'S4送信済フラグ'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_STORE_RECORD_H_PK primary key (STORE_RECORD_H_ID)
) comment '入庫実績ヘッダ' ;

create index T_STORE_RECORD_H_IX1
  on T_STORE_RECORD_H(RECEIVE_PLAN_H_ID);

create index T_STORE_RECORD_H_IX2
  on T_STORE_RECORD_H(PROCESS_TYPE_ID);

create index T_STORE_RECORD_H_IX3
  on T_STORE_RECORD_H(SUPPLIER_ID);

create index T_STORE_RECORD_H_IX4
  on T_STORE_RECORD_H(DEPOSIT_ID);

create index T_STORE_RECORD_H_IX5
  on T_STORE_RECORD_H(CLIENT_RECEIVE_NO);

-- 入庫実績帳票
create table T_STORE_RECORD_R (
  STORE_RECORD_H_ID bigint not null comment '入庫実績ヘッダID'
  , RECEIVE_RECORD_OUT_FLG char(1) comment '入荷実績出力フラグ'
  , RECEIVE_RECORD_OUT_USER_ID bigint comment '入荷実績出力者ID'
  , RECEIVE_RECORD_OUT_DT datetime(3) comment '入荷実績出力日時'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_STORE_RECORD_R_PK primary key (STORE_RECORD_H_ID)
) comment '入庫実績帳票' ;

create index T_STORE_RECORD_R_IX1
  on T_STORE_RECORD_R(RECEIVE_RECORD_OUT_USER_ID);

-- 振替情報
create table T_TRANSFER (
  TRANSFER_ID bigint not null comment '振替ID'
  , CLIENT_ID bigint not null comment '荷主ID'
  , PRODUCT_CD varchar(100) comment '商品CD'
  , STOCK_TRANSFER_DT varchar(30) comment '在庫移動日'
  , RECEIVE_PLANT_CD varchar(30) comment '入庫プラント'
  , RECEIVE_STORAGE_SPACE_CD varchar(30) comment '入庫保管場所'
  , SHIPPING_PLANT_CD varchar(30) comment '出庫プラント'
  , SHIPPING_STORAGE_SPACE_CD varchar(30) comment '出庫保管場所'
  , TRANSFER_TYPE_CD varchar(30) comment '移動タイプ'
  , NUM decimal(14,4) comment '数量'
  , HINMOKU_GROUP varchar(30) comment '品目グループ'
  , JAN_CD varchar(30) comment 'JANコード'
  , PRODUCT_NM varchar(60) comment '商品名称'
  , S4_SEND_FLG char(1) default '0' comment 'S4送信済フラグ'
  , LOCATION_CD1 varchar(30) comment '移動前ロケーション'
  , LOCATION_CD2 varchar(30) comment '移動後ロケーション'
  , USER_CD varchar(30) comment '担当者'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_TRANSFER_PK primary key (TRANSFER_ID)
) comment '振替情報' ;

-- 作業中データ
create table T_WORK_DATA (
  WORK_DATA_ID bigint not null comment '作業中データID'
  , USER_CD varchar(30) comment 'ユーザCD'
  , WORK_CD varchar(30) comment '作業CD'
  , WORK_QTY decimal(14,4) comment '作業中数量'
  , MAC_ADDRESS varchar(60) comment 'MACアドレス'
  , CLIENT_CD varchar(30) comment '荷主CD'
  , CENTER_CD varchar(30) comment 'センタCD'
  , WORK_LOG_ID bigint not null comment '作業実績ID'
  , WORK_QTY_CS bigint comment '作業中数量'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_WORK_DATA_PK primary key (WORK_DATA_ID)
) comment '作業中データ' ;

create index T_WORK_DATA_IX1
  on T_WORK_DATA(USER_CD,WORK_CD,CLIENT_CD,CENTER_CD);

create index T_WORK_DATA_IX2
  on T_WORK_DATA(MAC_ADDRESS,USER_CD,WORK_CD,CLIENT_CD,CENTER_CD);

-- 作業実績
create table T_WORK_LOG (
  WORK_LOG_ID bigint not null comment '作業実績ID'
  , CLIENT_CD varchar(30) comment '荷主CD'
  , CENTER_CD varchar(30) comment 'センタCD'
  , USER_CD varchar(30) comment 'ユーザCD'
  , WORK_CD varchar(30) comment '作業CD'
  , WORK_DT varchar(8) comment '作業日'
  , WORK_START_DT datetime(3) comment '作業開始日時'
  , WORK_END_DT datetime(3) comment '作業終了日時'
  , WORK_QTY decimal(14,4) comment '作業数量'
  , TRACE_ITEM varchar(255) comment 'トレース項目'
  , MAC_ADDRESS varchar(60) comment 'MACアドレス'
  , WORK_STATUS varchar(30) comment '作業ステータス'
  , WORK_LOG_OUT_FLG char(1) comment '作業実績出力フラグ'
  , WORK_LOG_OUT_DT datetime(3) comment '作業実績出力日時'
  , FORCE_COMPLETE_FLG char(1) comment '強制完了フラグ'
  , WORK_QTY_CS decimal(14,4) comment '作業数量（ケース）'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_WORK_LOG_PK primary key (WORK_LOG_ID)
) comment '作業実績' ;

create index T_WORK_LOG_IX1
  on T_WORK_LOG(WORK_LOG_OUT_FLG);

-- YAHOO受注
create table T_YAHOO_ORDER (
  YAHOO_ORDER_ID bigint not null comment 'YAHOO受注ID'
  , ORDER_ID varchar(30) comment '注文ID'
  , PARENT_ORDER_ID varchar(30) comment '分割元注文ID'
  , DEVICE_TYPE varchar(60) comment '注文媒体'
  , IS_AFFILIATE varchar(60) comment 'アフェリエイト経由注文種別'
  , FSP_LICENSE_CODE varchar(30) comment 'スタンプラリーコード'
  , FSP_LICENSE_NAME varchar(60) comment 'スタンプラリー名'
  , ORDER_TIME varchar(30) comment '注文日時'
  , ORDER_TIME_UNIX_EPOCH varchar(30) comment '注文日時(UnixTime値)'
  , USE_POINT_TYPE varchar(60) comment '利用ポイント種別'
  , ORDER_STATUS varchar(60) comment '注文ステータス'
  , STORE_STATUS varchar(60) comment 'ストアカスタムステータス'
  , REFERER varchar(60) comment '参照元URL'
  , ENTRY_POINT varchar(60) comment '入力ポイント'
  , CLINK varchar(60) comment '調査用リンク'
  , SUSPECT_MESSAGE varchar(60) comment 'いたずら注文警告'
  , IS_ITEM_COUPON varchar(30) comment '定率・定額クーポン利用フラグ'
  , IS_SHIPPING_COUPON varchar(30) comment '送料無料クーポン利用フラグ'
  , SHIP_NAME varchar(255) comment 'お届け先氏名'
  , SHIP_FIRST_NAME varchar(255) comment 'お届け先名前'
  , SHIP_LAST_NAME varchar(255) comment 'お届け先名字'
  , SHIP_ADDRESS1 varchar(255) comment 'お届け先住所1'
  , SHIP_ADDRESS2 varchar(255) comment 'お届け先住所2'
  , SHIP_CITY varchar(255) comment 'お届け先市区町村'
  , SHIP_PREFECTURE varchar(255) comment 'お届け先都道府県'
  , SHIP_ZIP_CODE varchar(60) comment 'お届け先郵便番号'
  , SHIP_NAME_KANA varchar(255) comment 'お届け先氏名カナ'
  , SHIP_FIRST_NAME_KANA varchar(255) comment 'お届け先名前カナ'
  , SHIP_LAST_NAME_KANA varchar(255) comment 'お届け先名字カナ'
  , SHIP_ADDRESS1_KANA varchar(255) comment 'お届け先住所1カナ'
  , SHIP_ADDRESS2_KANA varchar(255) comment 'お届け先住所2カナ'
  , SHIP_CITY_KANA varchar(255) comment 'お届け先市区町村カナ'
  , SHIP_PREFECTURE_KANA varchar(255) comment 'お届け先都道府県カナ'
  , SHIP_SECTION1_FIELD varchar(60) comment 'お届け先所属1フィールド名'
  , SHIP_SECTION1_VALUE varchar(60) comment 'お届け先所属1フィールド入力内容'
  , SHIP_SECTION2_FIELD varchar(60) comment 'お届け先所属2フィールド名'
  , SHIP_SECTION2_VALUE varchar(60) comment 'お届け先所属2フィールド入力内容'
  , SHIP_PHONE_NUMBER varchar(255) comment 'お届け先電話番号'
  , SHIP_EMG_PHONE_NUMBER varchar(255) comment 'お届け先電話番号(緊急)'
  , SHIP_METHOD varchar(60) comment 'お届け方法'
  , SHIP_METHOD_NAME varchar(60) comment 'お届け方法名称'
  , SHIP_REQUEST_DATE varchar(60) comment 'お届け希望日'
  , SHIP_REQUEST_TIME varchar(60) comment 'お届け希望時間帯'
  , SHIP_NOTES varchar(60) comment '配送メモ'
  , ARRIVE_TYPE varchar(60) comment '着荷種別'
  , SHIP_INVOICE_NUMBER1 varchar(30) comment 'お問い合わせ伝票番号1'
  , SHIP_INVOICE_NUMBER2 varchar(30) comment 'お問い合わせ伝票番号2'
  , SHIP_URL varchar(60) comment '配送会社URL'
  , SHIP_DATE varchar(30) comment '出荷日'
  , GIFT_WRAP_TYPE varchar(60) comment 'ギフト包装種類'
  , GIFT_WRAP_PAPER_TYPE varchar(60) comment 'のし'
  , GIFT_WRAP_NAME varchar(60) comment 'のし名入れ'
  , NEED_BILL_SLIP varchar(60) comment '請求書 同梱有無'
  , NEED_DETAILED_SLIP varchar(60) comment '明細書・納品書 同梱有無'
  , NEED_RECEIPT varchar(60) comment '領収書 同梱有無'
  , OPTION1_FIELD varchar(60) comment 'オプションフィールド1名称'
  , OPTION1_VALUE varchar(60) comment 'オプションフィールド1入力内容'
  , OPTION2_FIELD varchar(60) comment 'オプションフィールド2名称'
  , OPTION2_VALUE varchar(60) comment 'オプションフィールド2入力内容'
  , GIFT_WRAP_MASSAGE varchar(60) comment 'ギフトメッセージ'
  , BILL_NAME varchar(255) comment 'ご請求先氏名'
  , BILL_FIRST_NAME varchar(255) comment 'ご請求先名前'
  , BILL_LAST_NAME varchar(255) comment 'ご請求先名字'
  , BILL_ADDRESS1 varchar(255) comment 'ご請求先住所1'
  , BILL_ADDRESS2 varchar(255) comment 'ご請求先住所2'
  , BILL_CITY varchar(255) comment 'ご請求先市区町村'
  , BILL_PREFECTURE varchar(255) comment 'ご請求先都道府県'
  , BILL_ZIP_CODE varchar(30) comment 'ご請求先郵便番号'
  , BILL_NAME_KANA varchar(255) comment 'ご請求先氏名カナ'
  , BILL_FIRST_NAME_KANA varchar(255) comment 'ご請求先名前カナ'
  , BILL_LAST_NAME_KANA varchar(255) comment 'ご請求先名字カナ'
  , BILL_ADDRESS1_KANA varchar(255) comment 'ご請求先住所1カナ'
  , BILL_ADDRESS2_KANA varchar(255) comment 'ご請求先住所2カナ'
  , BILL_CITY_KANA varchar(255) comment 'ご請求先市区町村カナ'
  , BILL_PREFECTURE_KANA varchar(255) comment 'ご請求先都道府県カナ'
  , BILL_SECTION1_FIELD varchar(60) comment 'ご請求先所属1フィールド名'
  , BILL_SECTION1_VALUE varchar(60) comment 'ご請求先所属1フィールド入力内容'
  , BILL_SECTION2_FIELD varchar(60) comment 'ご請求先所属2フィールド名'
  , BILL_SECTION2_VALUE varchar(60) comment 'ご請求先所属2フィールド入力内容'
  , BILL_PHONE_NUMBER varchar(255) comment 'ご請求先電話番号'
  , BILL_EMG_PHONE_NUMBER varchar(255) comment 'ご請求先電話番号(緊急)'
  , BILL_MAIL_ADDRESS varchar(255) comment 'ご請求先メールアドレス'
  , PAY_MATHOD varchar(60) comment 'お支払方法'
  , PAY_MATHOD_NAME varchar(60) comment 'お支払方法名称'
  , PAY_KIND varchar(60) comment 'お支払方法種別'
  , CARD_PAY_COUNT bigint comment 'クレジットカードお支払回数'
  , CARD_PAY_TYPE varchar(60) comment 'クレジットカードお支払区分'
  , SETTLE_STATUS varchar(60) comment '決済ステータス'
  , SETTLE_ID varchar(30) comment '決済ID'
  , PAY_NO varchar(30) comment '支払番号'
  , PAY_NO_ISSUE_DATE varchar(30) comment '支払番号発行日時'
  , PAY_DATE varchar(30) comment '入金日'
  , BUYER_COMMENTS varchar(60) comment 'ご要望'
  , AGE_CONFIRM varchar(60) comment '年齢確認'
  , QUANTITY_DETAIL bigint comment '注文商品の数量'
  , SHIP_CHARGE bigint comment '送料'
  , PAY_CHARGE bigint comment '手数料'
  , GIFT_WRAP_CHARGE bigint comment 'ギフト包装料'
  , DISCOUNT bigint comment '値引き'
  , ADJUSTMENTS bigint comment '調整額'
  , USE_POINT bigint comment '利用ポイント合計'
  , GET_POINT bigint comment '付与ポイント合計'
  , TOTAL bigint comment '請求金額合計'
  , TOTAL_PRICE bigint comment '注文金額合計'
  , SHIPPING_C_DISCOUNT bigint comment '送料無料クーポン値引額'
  , ITEM_C_DISCOUNT bigint comment '定額・定率クーポン値引額'
  , TOTAL_MALL_C_DISCOUNT bigint comment 'モールクーポン値引額'
  , GET_POINT_CRG_TO_STORE bigint comment 'ストア負担ポイント合計'
  , LINE_ID varchar(30) comment 'Line ID'
  , QUANTITY bigint comment '数量'
  , ITEM_ID varchar(30) comment '商品コード'
  , SUB_CODE varchar(30) comment '商品サブコード'
  , TITLE varchar(255) comment '商品名'
  , ITEM_OPTION_NAME varchar(60) comment '商品オプション名'
  , ITEM_OPTION_VALUE varchar(60) comment '商品オプション内容'
  , SUB_CODE_OPTION varchar(60) comment '商品サブコードオプション内容文字列'
  , INSCRIPTION_NAME varchar(60) comment 'インスクリプション番号'
  , INSCRIPTION_VALUE varchar(60) comment 'インスクリプション内容'
  , UNIT_PRICE bigint comment '商品販売価格'
  , UNIT_GET_POINT bigint comment '注文付与ポイント'
  , LINE_SUB_TOTAL bigint comment '商品毎の小計'
  , LINE_GET_POINT bigint comment '商品毎の付与ポイント小計'
  , POINT_FSP_CODE varchar(30) comment '商品付与ポイントコード'
  , ITEM_CONDITION varchar(30) comment '商品状態'
  , COUPON_ID varchar(30) comment 'クーポンID'
  , COUPON_DISCOUNT bigint comment 'クーポン利用値引額'
  , ORIGINAL_PRICE bigint comment '値引き前単価'
  , IS_GET_POINT_FIX varchar(30) comment 'ポイント確定状態'
  , GET_POINT_FIX_DATE varchar(30) comment 'ポイント確定予定日'
  , RELEASE_DATE varchar(30) comment '発売日'
  , GET_POINT_TYPE varchar(30) comment '付与ポイント種別'
  , JAN varchar(30) comment 'JANコード'
  , PRODUCT_ID varchar(30) comment '製品ID'
  , POINT_CHARGED_TO_STORE bigint comment '商品毎ストア負担ポイント小計'
  , PACKING_QTY bigint comment '個口数'
  , SLIP_ITEM_NM1 longtext comment '品名1'
  , SLIP_ITEM_NM2 varchar(255) comment '品名2'
  , SLIP_ITEM_NM3 varchar(255) comment '品名3'
  , SLIP_ITEM_NM4 varchar(255) comment '品名4'
  , SLIP_ITEM_NM5 varchar(255) comment '品名5'
  , SLIP_ITEM_CD1 varchar(30) comment '品名コード1'
  , SLIP_ITEM_CD2 varchar(30) comment '品名コード2'
  , FREIGHT_HANDLING1 varchar(30) comment '荷扱い1'
  , FREIGHT_HANDLING2 varchar(30) comment '荷扱い2'
  , ARTICLE varchar(255) comment '記事'
  , RECEIVE_ID bigint comment '受信ID'
  , ROW_NO bigint comment '行No.'
  , ERROR_FLG char(1) comment 'エラーフラグ'
  , IMPORT_FLG char(1) comment '取込フラグ'
  , IMPORT_TYPE_ID bigint comment '取込種別ID'
  , EC_ORDER_B_ID bigint comment 'EC受注ボディID'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint T_YAHOO_ORDER_PK primary key (YAHOO_ORDER_ID)
) comment 'YAHOO受注' ;

create index T_YAHOO_ORDER_IX1
  on T_YAHOO_ORDER(RECEIVE_ID);

-- 運送業者郵便番号マスタ取込ワーク
create table W_CARRIER_ZIP_INPUT (
  CARRIER_ZIP_INPUT_ID bigint not null comment '運送業者郵便番号マスタ取込ワークID'
  , ZIP_CD varchar(255) comment '郵便番号CD'
  , ARRIVAL_STORE_CD varchar(255) comment '着店CD'
  , ARRIVAL_STORE_NM varchar(255) comment '着店名称'
  , LINE_NO bigint comment '行NO'
  , WORK_FLG char(1) comment '処理済フラグ'
  , ERROR_FLG char(1) comment 'エラーフラグ'
  , ERROR_MSG longtext comment 'エラー内容'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint W_CARRIER_ZIP_INPUT_PK primary key (CARRIER_ZIP_INPUT_ID)
) comment '運送業者郵便番号マスタ取込ワーク' ;

-- 取引先マスタ取込ワーク
create table W_CUSTOMER_INPUT (
  CUSTOMER_INPUT_ID bigint not null comment '取引先マスタ取込ワークID'
  , CLIENT_CD varchar(255) comment '荷主CD'
  , CUSTOMER_CD varchar(255) comment '取引先CD'
  , CUSTOMER_NM varchar(255) comment '取引先名称'
  , CUSTOMER_ABBR varchar(255) comment '取引先略称'
  , ZIP_CD varchar(255) comment '郵便番号'
  , TEL_NO varchar(255) comment '電話番号'
  , ADDRESS1 varchar(255) comment '住所1'
  , ADDRESS2 varchar(255) comment '住所2'
  , ADDRESS3 varchar(255) comment '住所3'
  , VENDOR_FLG varchar(255) comment '仕入先フラグ'
  , DELIVERY_FLG varchar(255) comment '納品先フラグ'
  , ONETIME_FLG varchar(255) comment 'ワンタイムフラグ'
  , DEPOSIT_FLG varchar(255) comment '預託先フラグ'
  , ALLOC_ORDER varchar(255) comment '引当順序'
  , LOT_REVERSE_FLG varchar(255) default '0' comment 'ロット逆転防止フラグ'
  , LIMIT_DT_REVERSE_FLG varchar(255) default '0' comment '期限日逆転防止フラグ'
  , SHIPPING_STOP_FLG varchar(255) default '0' comment '出荷停止フラグ'
  , CENTER_CD varchar(255) comment 'センタCD'
  , DELIVERY_COURSE_CD varchar(255) comment '配送コースCD'
  , DELIVERY_ORDER varchar(255) comment '配送順'
  , DELIVERY_READ_TIME varchar(255) comment '配送リードタイム'
  , LINE_NO bigint not null comment '行NO.'
  , WORK_FLG char(1) default 0 comment '処理済フラグ'
  , ERROR_FLG char(1) default 0 comment 'エラーフラグ'
  , ERROR_MSG longtext comment 'エラー内容'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint W_CUSTOMER_INPUT_PK primary key (CUSTOMER_INPUT_ID)
) comment '取引先マスタ取込ワーク' ;

-- 商品棚卸ワーク
create table W_HT_INVENTORY_INPUT_PROD (
  HT_INVENTORY_INPUT_PROD_ID bigint not null comment '商品棚卸ワークID'
  , MAC_ADDRESS varchar(30) not null comment 'MACアドレス'
  , CLIENT_ID bigint not null comment '荷主ID'
  , CENTER_ID bigint not null comment 'センタID'
  , WAREHOUSE_ID bigint comment '倉庫ID'
  , INVENTORY_H_ID bigint not null comment '棚卸ヘッダID'
  , RCV_LABEL_NO varchar(30) comment '入庫ラベルＮＯ'
  , PRODUCT_ID bigint not null comment '商品ID'
  , PRODUCT_CD varchar(30) comment '商品CD'
  , PRODUCT_NM varchar(255) comment '商品名称'
  , LOC_ID bigint comment 'ロケーションID'
  , LOC_CD varchar(30) comment 'ロケーションCD'
  , LOC_NM varchar(60) comment 'ロケーション名称'
  , JAN_CD varchar(30) comment 'JANCD'
  , CONSIGNMENT_CLS_ID bigint comment '預託在庫区分ID'
  , CONSIGNMENT_CLS_NM varchar(60) comment '預託在庫区分名称'
  , STOCK_TYPE_ID bigint comment '在庫区分ID'
  , STK_CLS_NM varchar(60) comment '在庫区分名称'
  , LOT_ID bigint comment 'ロットID'
  , LOT varchar(30) comment 'ロット'
  , LIMIT_DT varchar(8) comment '期限日'
  , QTY decimal(14,4) comment '数量'
  , INVENTORY_B_VERSION_NO bigint comment '棚卸ボディバージョンNo.'
  , CR_DT datetime(3) comment '登録日付'
  , WORK_START_DT datetime(3) comment '開始時間'
  , WORK_END_DT datetime(3) comment '終了時間'
  , PRODUCTION_DT varchar(8) comment '製造日'
  , UNIT_NM varchar(30) comment '単位'
  , AREA_CD varchar(30) comment 'エリア'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint W_HT_INVENTORY_INPUT_PROD_PK primary key (HT_INVENTORY_INPUT_PROD_ID)
) comment '商品棚卸ワーク' ;

create unique index W_HT_INVENTORY_INPUT_PROD_IX1
  on W_HT_INVENTORY_INPUT_PROD(INVENTORY_H_ID,PRODUCT_ID,LOC_ID,CONSIGNMENT_CLS_ID,STOCK_TYPE_ID,LOT,LIMIT_DT,INVENTORY_B_VERSION_NO);

create index W_HT_INVENTORY_INPUT_PROD_IX2
  on W_HT_INVENTORY_INPUT_PROD(MAC_ADDRESS);

-- 積込検品ワーク
create table W_HT_LOADING (
  HT_LOADING_ID bigint not null comment '積込検品ワークID'
  , MAC_ADDRESS varchar(30) not null comment 'MACアドレス'
  , CLIENT_ID bigint not null comment '荷主ID'
  , CENTER_ID bigint not null comment 'センタID'
  , PACKING_H_ID bigint not null comment '梱包ヘッダID'
  , CARRIER_TRACE_NUM varchar(30) comment '貨物追跡No'
  , SHIPPING_PACKING_NO varchar(30) comment '出荷梱包No'
  , DELIVERY_COURSE_ID bigint comment '配送コースID'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint W_HT_LOADING_PK primary key (HT_LOADING_ID)
) comment '積込検品ワーク' ;

create index W_HT_LOADING_IX1
  on W_HT_LOADING(MAC_ADDRESS);

-- ピッキングワーク
create table W_HT_PICKING (
  HT_PICKING_ID bigint not null comment 'ピッキングワークID'
  , MAC_ADDRESS varchar(30) not null comment 'MACアドレス'
  , CLIENT_ID bigint not null comment '荷主ID'
  , CENTER_ID bigint not null comment 'センタID'
  , PICKING_B_ID bigint not null comment '出庫ボディID'
  , NIZOROE_NO varchar(30) not null comment '荷揃番号'
  , PRODUCT_ID bigint not null comment '商品ID'
  , JAN_CD varchar(30) comment 'JANCD'
  , PRODUCT_CD varchar(100) comment '商品CD'
  , PRODUCT_NM varchar(255) comment '商品名称'
  , INST_NUM decimal(14,4) not null comment '指示数'
  , SPG_QTY_ONS decimal(14,4) comment 'ピッキング済数'
  , LOCATION_ID bigint comment 'ロケーションID'
  , LOCATION_CD varchar(30) comment 'ロケーションCD'
  , LOCATION_NM varchar(60) comment 'ロケーション名称'
  , LOT varchar(30) comment 'ロット'
  , LIMIT_DT varchar(8) comment '期限日'
  , WORK_START_DT datetime(3) comment '開始時間'
  , WORK_END_DT datetime(3) comment '終了時間'
  , STORE_LABEL_NO varchar(30) comment '入荷ラベルNo.'
  , LOT_ID bigint comment 'ロットID'
  , PICKING_FLG char(1) comment '出庫フラグ'
  , SKIP_NUM bigint comment 'スキップ回数'
  , PROD_DT varchar(8) comment '製造日'
  , FORCE_COPLETE_FLG char(1) comment '強制完了フラグ'
  , DAIHYO_NIZOROE_NO varchar(30) comment '代表荷揃番号'
  , NIZOROE_NO2 varchar(30) comment '荷揃番号_ハイフンあり'
  , DAIHYO_NIZOROE_NO2 varchar(30) comment '代表荷揃番号_ハイフン有り'
  , SUSPEND_FLG char(1) comment '中断フラグ'
  , WORK_GROUP_KEY varchar(30) comment '作業グループキー'
  , ANOTHER_PICKING_FLG char(1) comment '別在庫ピッキングフラグ'
  , LAP_NUM bigint comment '周回数'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint W_HT_PICKING_PK primary key (HT_PICKING_ID)
) comment 'ピッキングワーク' ;

create index W_HT_PICKING_IX1
  on W_HT_PICKING(PICKING_B_ID);

create index W_HT_PICKING_IX2
  on W_HT_PICKING(PRODUCT_ID);

create index W_HT_PICKING_IX3
  on W_HT_PICKING(LOCATION_ID);

create index W_HT_PICKING_IX4
  on W_HT_PICKING(LOT_ID);

create index W_HT_PICKING_IX5
  on W_HT_PICKING(MAC_ADDRESS);

-- 入荷検品ワーク
create table W_HT_RECEIVE_INSPECTION (
  HT_RECEIVE_INSPECTION_ID bigint not null comment '入荷検品ワークID'
  , MAC_ADDRESS varchar(30) not null comment 'MACアドレス'
  , CLIENT_ID bigint not null comment '荷主ID'
  , CENTER_ID bigint not null comment 'センタID'
  , WAREHOUSE_ID bigint comment '倉庫ID'
  , PRODUCT_ID bigint not null comment '商品ID'
  , JAN_CD varchar(30) comment 'JANCD'
  , PRODUCT_CD varchar(30) comment '商品CD'
  , PRODUCT_NM varchar(255) comment '商品名称'
  , STOCK_TYPE_ID bigint comment '在庫区分ID'
  , STK_CLS_NM varchar(60) comment '在庫区分名称'
  , PIECE_QTY_RCV_ORD decimal(14,4) comment '入荷予定数量'
  , PIECE_QTY_RCV decimal(14,4) comment '入荷検収数量'
  , RCV_LOC_ID bigint comment '仮入庫ロケーションID'
  , RCV_LOC_CD varchar(30) comment '仮入庫ロケーションCD'
  , RCV_LOC_NM varchar(60) comment '仮入庫ロケーション名称'
  , HT_WORK_NO varchar(30) comment 'ＨＴ作業ＮＯ'
  , ONS_NUM varchar(30) comment '入庫ＮＯ'
  , LOT_ID bigint comment 'ロットID'
  , LOT varchar(30) comment 'ロット'
  , LIMIT_DT varchar(8) comment '期限日'
  , LABEL_SELECT varchar(30) comment 'ラベル選択'
  , WORK_START_DT datetime(3) comment '開始時間'
  , WORK_END_DT datetime(3) comment '終了時間'
  , PRODUCTION_DT varchar(8) comment '製造日'
  , INPUT_ASSISTANCE_UNIT_NUM bigint comment '入力補助入数'
  , INPUT_ASSISTANCE_CASE_NUM decimal(14,4) comment '入力補助ケース数'
  , INPUT_ASSISTANCE_PIECE_NUM decimal(14,4) comment '入力補助ピース数'
  , CASE_RECEIVE_LABEL_NUM bigint comment '入荷ラベルケース枚数'
  , PIECE_RECEIVE_LABEL_NUM bigint comment '入荷ラベルピース枚数'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint W_HT_RECEIVE_INSPECTION_PK primary key (HT_RECEIVE_INSPECTION_ID)
) comment '入荷検品ワーク' ;

create index W_HT_RECEIVE_INSPECTION_IX1
  on W_HT_RECEIVE_INSPECTION(MAC_ADDRESS);

-- 予定無し入荷ワーク
create table W_HT_RECEIVE_NO_PLAN_INSP (
  HT_RECEIVE_NO_PLAN_INSP_ID bigint not null comment '予定無し入荷ワークID'
  , MAC_ADDRESS varchar(30) not null comment 'MACアドレス'
  , CLIENT_ID bigint not null comment '荷主ID'
  , CENTER_ID bigint not null comment 'センタID'
  , WAREHOUSE_ID bigint comment '倉庫ID'
  , PRODUCT_ID bigint not null comment '商品ID'
  , JAN_CD varchar(30) comment 'JANCD'
  , PRODUCT_CD varchar(30) comment '商品CD'
  , PRODUCT_NM varchar(255) comment '商品名称'
  , DEPOSIT_ID bigint comment '預託在庫区分ID'
  , DEPOSIT_NM varchar(60) comment '預託在庫区分名称'
  , PROCESS_TYPE_ID bigint comment '処理区分ID'
  , PROCESS_TYPE_NM varchar(60) comment '処理区分名称'
  , STOCK_TYPE_ID bigint comment '在庫区分ID'
  , STOCK_TYPE_NM varchar(60) comment '在庫区分名称'
  , CLIENT_RECEIVE_NO varchar(30) comment '顧客入荷指示No.'
  , SUPPLIER_ID bigint comment '仕入先ID'
  , SUPPLIER_CD varchar(30) comment '仕入先コード'
  , SUPPLIER_NM varchar(60) comment '仕入先名称'
  , PIECE_QTY_RCV decimal(14,4) comment '入荷検収数量'
  , RCV_LOC_ID bigint comment '入庫ロケーションID'
  , RCV_LOC_CD varchar(30) comment '入庫ロケーションCD'
  , RCV_LOC_NM varchar(60) comment '入庫ロケーション名称'
  , HT_WORK_NO varchar(30) comment 'ＨＴ作業ＮＯ'
  , STORE_NO varchar(30) comment '入庫ＮＯ'
  , LOT_ID bigint comment 'ロットID'
  , LOT varchar(30) comment 'ロット'
  , LIMIT_DT varchar(8) comment '期限日'
  , LABEL_SELECT varchar(30) comment 'ラベル選択'
  , WORK_START_DT datetime(3) comment '開始時間'
  , WORK_END_DT datetime(3) comment '終了時間'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint W_HT_RECEIVE_NO_PLAN_INSP_PK primary key (HT_RECEIVE_NO_PLAN_INSP_ID)
) comment '予定無し入荷ワーク' ;

create index W_HT_RECEIVE_NO_PLAN_INSP_IX1
  on W_HT_RECEIVE_NO_PLAN_INSP(MAC_ADDRESS);

-- 入庫格納ワーク
create table W_HT_RECEIVE_STORE (
  HT_RECEIVE_STORE_ID bigint not null comment '入庫格納ワークID'
  , MAC_ADDRESS varchar(30) not null comment 'MACアドレス'
  , CLIENT_ID bigint not null comment '荷主ID'
  , CENTER_ID bigint not null comment 'センタID'
  , WAREHOUSE_ID bigint comment '倉庫ID'
  , LOC_ID bigint comment 'ロケーションID'
  , LOC_CD varchar(30) comment 'ロケーションCD'
  , LOC_NM varchar(60) comment 'ロケーション名称'
  , JAN_CD varchar(30) comment 'JANCD'
  , PRODUCT_ID bigint not null comment '商品ID'
  , PRODUCT_CD varchar(30) comment '商品CD'
  , PRODUCT_NM varchar(255) comment '商品名称'
  , STOCK_TYPE_ID bigint comment '在庫区分ID'
  , STK_CLS_NM varchar(60) comment '在庫区分名称'
  , STORE_NUM decimal(14,4) comment '格納数'
  , ONS_NUM varchar(30) comment '入庫ＮＯ'
  , LOT_ID bigint comment 'ロットID'
  , LOT varchar(30) comment 'ロット'
  , LIMIT_DT varchar(8) comment '期限日'
  , PLAN_NUM decimal(14,4) comment '入荷数'
  , WORK_START_DT datetime(3) comment '開始時間'
  , WORK_END_DT datetime(3) comment '終了時間'
  , PRODUCTION_DT varchar(8) comment '製造日'
  , INPUT_ASSISTANCE_UNIT_NUM bigint comment '入力補助入数'
  , INPUT_ASSISTANCE_CASE_NUM decimal(14,4) comment '入力補助ケース数'
  , INPUT_ASSISTANCE_PIECE_NUM decimal(14,4) comment '入力補助ピース数'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint W_HT_RECEIVE_STORE_PK primary key (HT_RECEIVE_STORE_ID)
) comment '入庫格納ワーク' ;

create index W_HT_RECEIVE_STORE_IX1
  on W_HT_RECEIVE_STORE(MAC_ADDRESS);

-- シリアル登録(入荷)ワーク
create table W_HT_SERIAL_RECEIVE_INSP (
  HT_SERIAL_RECEIVE_INSP_ID bigint not null comment 'シリアル登録(入荷)ワークID'
  , MAC_ADDRESS varchar(30) comment 'MACアドレス'
  , CLIENT_ID bigint comment '荷主ID'
  , CENTER_ID bigint comment 'センタID'
  , RECEIVE_SLIP_NO varchar(30) comment 'WMS入荷伝票No.'
  , CUSTOMER_ID bigint comment '仕入先ID'
  , JAN_CD varchar(30) comment 'JANCD'
  , PRODUCT_CD varchar(30) comment '商品CD'
  , PRODUCT_NM varchar(255) comment '商品名称'
  , SERIAL_NO varchar(30) comment 'シリアルNo'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint W_HT_SERIAL_RECEIVE_INSP_PK primary key (HT_SERIAL_RECEIVE_INSP_ID)
) comment 'シリアル登録(入荷)ワーク' ;

create index W_HT_SERIAL_RECEIVE_INSP_IX1
  on W_HT_SERIAL_RECEIVE_INSP(MAC_ADDRESS);

-- シリアル登録(出荷)ワーク
create table W_HT_SERIAL_SHIPPING_INSP (
  HT_SERIAL_SHIPPING_INSP_ID bigint not null comment 'シリアル登録(出荷)ワークID'
  , MAC_ADDRESS varchar(30) comment 'MACアドレス'
  , CLIENT_ID bigint comment '荷主ID'
  , CENTER_ID bigint comment 'センタID'
  , PICKING_WORK_NO varchar(30) comment '出庫作業No'
  , CUSTOMER_ID bigint comment '納品先ID'
  , SPG_WORK_COMMENT varchar(255) comment '出荷作業備考'
  , JAN_CD varchar(30) comment 'JANCD'
  , PRODUCT_CD varchar(30) comment '商品CD'
  , PRODUCT_NM varchar(255) comment '商品名称'
  , SERIAL_NO varchar(30) comment 'シリアルNo'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint W_HT_SERIAL_SHIPPING_INSP_PK primary key (HT_SERIAL_SHIPPING_INSP_ID)
) comment 'シリアル登録(出荷)ワーク' ;

create index W_HT_SERIAL_SHIPPING_INSP_IX1
  on W_HT_SERIAL_SHIPPING_INSP(MAC_ADDRESS);

-- 出荷検品ワーク
create table W_HT_SHIPPING (
  HT_SHIPPING_ID bigint not null comment '出荷検品ワークID'
  , MAC_ADDRESS varchar(30) not null comment 'MACアドレス'
  , ALLOC_INST_H_ID bigint not null comment '引当指示ヘッダID'
  , CLIENT_ID bigint not null comment '荷主ID'
  , CENTER_ID bigint not null comment 'センタID'
  , NIZOROE_NO varchar(30) not null comment '荷揃番号'
  , PRODUCT_ID bigint not null comment '商品ID'
  , JAN_CD varchar(30) comment 'JANCD'
  , PRODUCT_CD varchar(100) comment '商品CD'
  , PRODUCT_NM varchar(255) comment '商品名称'
  , INST_NUM decimal(14,4) not null comment '指示数'
  , SPG_QTY_ONS decimal(14,4) comment '検品済数'
  , SPG_QTY_REMAIN decimal(14,4) comment '検品残数'
  , PIECE_NO bigint comment '個口番号'
  , SPG_WORK_COMMENT varchar(255) comment '出荷作業備考'
  , BOX_ID bigint comment '荷材ID'
  , BOX_CD varchar(30) comment '荷材CD'
  , BOX_NM varchar(60) comment '荷材名称'
  , PICKING_WORK_NO varchar(30) comment '出庫作業No.'
  , LOT varchar(30) comment 'ロット'
  , CONSUME_DT varchar(8) comment '期限日'
  , PROD_DT varchar(8) comment '製造日'
  , INDV_LABEL_NO varchar(30) comment '個別貼付ラベルNo'
  , EXPECTED_SHIPMENT_NO varchar(30) comment '個体管理番号'
  , FORCE_COPLETE_FLG char(1) comment '強制完了フラグ'
  , SUSPEND_FLG char(1) comment '中断フラグ'
  , RECEIVE_LABEL_NO varchar(30) comment '入荷ラベルNo'
  , NIZOROE_NO2 varchar(30) comment '荷揃番号_ハイフンあり'
  , DAIHYO_NIZOROE_NO varchar(30) comment '代表荷揃番号'
  , DAIHYO_NIZOROE_NO2 varchar(30) comment '表荷揃番号_ハイフンあり'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint W_HT_SHIPPING_PK primary key (HT_SHIPPING_ID)
) comment '出荷検品ワーク' ;

create index W_HT_SHIPPING_IX1
  on W_HT_SHIPPING(PRODUCT_ID);

create index W_HT_SHIPPING_IX2
  on W_HT_SHIPPING(BOX_ID);

create index W_HT_SHIPPING_IX3
  on W_HT_SHIPPING(MAC_ADDRESS);

-- 出荷ピッキングワーク
create table W_HT_SHIPPING_PICKING (
  HT_SHIPPING_PICKING_ID bigint not null comment '出荷ピッキングワークID'
  , MAC_ADDRESS varchar(30) not null comment 'MACアドレス'
  , CLIENT_ID bigint not null comment '荷主ID'
  , CENTER_ID bigint not null comment 'センタID'
  , PICKING_B_ID bigint not null comment '出庫ボディID'
  , NIZOROE_NO varchar(30) not null comment '荷揃番号'
  , PRODUCT_ID bigint not null comment '商品ID'
  , JAN_CD varchar(30) comment 'JANCD'
  , PRODUCT_CD varchar(100) comment '商品CD'
  , PRODUCT_NM varchar(255) comment '商品名称'
  , INST_NUM decimal(14,4) not null comment '指示数'
  , SPG_QTY_ONS decimal(14,4) comment '検品済数'
  , LOCATION_ID bigint comment 'ロケーションID'
  , LOCATION_CD varchar(30) comment 'ロケーションCD'
  , LOCATION_NM varchar(60) comment 'ロケーション名称'
  , LOT varchar(30) comment 'ロット'
  , LIMIT_DT varchar(8) comment '期限日'
  , WORK_START_DT datetime(3) comment '開始時間'
  , WORK_END_DT datetime(3) comment '終了時間'
  , STORE_LABEL_NO varchar(30) comment '入庫ラベルNo.'
  , LOT_ID bigint comment 'ロットID'
  , PICKING_FLG char(1) comment '出庫フラグ'
  , SKIP_NUM bigint comment 'スキップ回数'
  , PICKING_WORK_NO varchar(30) comment '出庫作業No.'
  , PROD_DT varchar(8) comment '製造日'
  , FORCE_COPLETE_FLG char(1) comment '強制完了フラグ'
  , DAIHYO_NIZOROE_NO varchar(30) comment '代表荷揃番号'
  , NIZOROE_NO2 varchar(30) comment '荷揃番号_ハイフンあり'
  , DAIHYO_NIZOROE_NO2 varchar(30) comment '代表荷揃番号_ハイフン有り'
  , SUSPEND_FLG char(1) comment '中断フラグ'
  , WORK_GROUP_KEY varchar(30) comment '作業グループキー'
  , ANOTHER_PICKING_FLG char(1) comment '別在庫ピッキングフラグ'
  , LAP_NUM bigint comment '周回数'
  , MULTI_PICK_FLG char(1) comment '複数人ピッキングフラグ'
  , MULTI_MAC_ADDRESS varchar(30) comment 'MACアドレス(複数人作業者)'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint W_HT_SHIPPING_PICKING_PK primary key (HT_SHIPPING_PICKING_ID)
) comment '出荷ピッキングワーク' ;

create index W_HT_SHIPPING_PICKING_IX1
  on W_HT_SHIPPING_PICKING(PICKING_B_ID);

create index W_HT_SHIPPING_PICKING_IX2
  on W_HT_SHIPPING_PICKING(PRODUCT_ID);

create index W_HT_SHIPPING_PICKING_IX3
  on W_HT_SHIPPING_PICKING(LOCATION_ID);

create index W_HT_SHIPPING_PICKING_IX4
  on W_HT_SHIPPING_PICKING(LOT_ID);

create index W_HT_SHIPPING_PICKING_IX5
  on W_HT_SHIPPING_PICKING(MAC_ADDRESS);

-- トータルピッキングワーク
create table W_HT_TOTAL_PICKING (
  HT_TOTAL_PICKING_ID bigint not null comment 'トータルピッキングワークID'
  , MAC_ADDRESS varchar(30) not null comment 'MACアドレス'
  , CLIENT_ID bigint not null comment '荷主ID'
  , CENTER_ID bigint not null comment 'センタID'
  , PICKING_B_ID bigint not null comment '出庫ボディID'
  , NIZOROE_NO varchar(30) not null comment '荷揃番号'
  , PRODUCT_ID bigint not null comment '商品ID'
  , JAN_CD varchar(30) comment 'JANCD'
  , PRODUCT_CD varchar(100) comment '商品CD'
  , PRODUCT_NM varchar(255) comment '商品名称'
  , INST_NUM decimal(14,4) not null comment '指示数'
  , SPG_QTY_ONS decimal(14,4) comment 'ピッキング済数'
  , LOCATION_ID bigint comment 'ロケーションID'
  , LOCATION_CD varchar(30) comment 'ロケーションCD'
  , LOCATION_NM varchar(60) comment 'ロケーション名称'
  , LOT varchar(30) comment 'ロット'
  , LIMIT_DT varchar(8) comment '期限日'
  , WORK_START_DT datetime(3) comment '開始時間'
  , WORK_END_DT datetime(3) comment '終了時間'
  , STORE_LABEL_NO varchar(30) comment '入荷ラベルNo.'
  , LOT_ID bigint comment 'ロットID'
  , PICKING_FLG char(1) comment '出庫フラグ'
  , SKIP_NUM bigint comment 'スキップ回数'
  , PROD_DT varchar(8) comment '製造日'
  , FORCE_COPLETE_FLG char(1) comment '強制完了フラグ'
  , DAIHYO_NIZOROE_NO varchar(30) comment '代表荷揃番号'
  , NIZOROE_NO2 varchar(30) comment '荷揃番号_ハイフンあり'
  , DAIHYO_NIZOROE_NO2 varchar(30) comment '代表荷揃番号_ハイフン有り'
  , SUSPEND_FLG char(1) comment '中断フラグ'
  , WORK_GROUP_KEY varchar(30) comment '業グループキー'
  , ANOTHER_PICKING_FLG char(1) comment '別在庫ピッキングフラグ'
  , LAP_NUM bigint comment '周回数'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint W_HT_TOTAL_PICKING_PK primary key (HT_TOTAL_PICKING_ID)
) comment 'トータルピッキングワーク' ;

create index W_HT_TOTAL_PICKING_IX1
  on W_HT_TOTAL_PICKING(PICKING_B_ID);

create index W_HT_TOTAL_PICKING_IX2
  on W_HT_TOTAL_PICKING(PRODUCT_ID);

create index W_HT_TOTAL_PICKING_IX3
  on W_HT_TOTAL_PICKING(LOCATION_ID);

create index W_HT_TOTAL_PICKING_IX4
  on W_HT_TOTAL_PICKING(LOT_ID);

create index W_HT_TOTAL_PICKING_IX5
  on W_HT_TOTAL_PICKING(MAC_ADDRESS);

-- ロケーションマスタ取込ワーク
create table W_LOCATION_INPUT (
  LOCATION_INPUT_ID bigint not null comment 'ロケーションマスタ取込ワークID'
  , CENTER_CD varchar(255) comment 'センタCD'
  , WAREHOUSE_CD varchar(255) comment '倉庫CD'
  , ZONE_CD varchar(255) comment 'ゾーンCD'
  , LOCATION_CD varchar(255) comment 'ロケーションCD'
  , LOCATION_NM varchar(255) comment 'ロケーション名称'
  , PICKING_LOCATION_FLG varchar(255) comment 'ピックロケフラグ'
  , PICKING_ORDER varchar(255) comment 'ピッキング順序'
  , LOCATION_TYPE varchar(255) comment 'ロケーション種別'
  , ALLOC_ORDER varchar(255) comment '引当順序'
  , ALLOC_NG_FLG varchar(255) comment '引当禁止フラグ'
  , RESTOCK_PRODUCT_CD varchar(255) comment '補充商品CD'
  , RESTOCK_STOCK_TYPE_CD varchar(255) comment '補充在庫区分CD'
  , RESTOCK_DEPOSIT_CD varchar(255) comment '補充預託CD'
  , RESTOCK_SHAPE_CD varchar(255) comment '補充点荷姿CD'
  , RESTOCK_POINT_NUM varchar(255) comment '補充点'
  , MAX_STORE_SHAPE_CD varchar(255) comment '最大格納数商品荷姿CD'
  , MAX_STORE_NUM varchar(255) comment '最大格納数'
  , LINE_NO bigint not null comment '行NO.'
  , WORK_FLG char(1) default 0 comment '処理済フラグ'
  , ERROR_FLG char(1) default 0 comment 'エラーフラグ'
  , ERROR_MSG longtext comment 'エラー内容'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint W_LOCATION_INPUT_PK primary key (LOCATION_INPUT_ID)
) comment 'ロケーションマスタ取込ワーク' ;

-- 商品マスタ取込ワーク
create table W_PRODUCT_INPUT (
  PRODUCT_INPUT_ID bigint not null comment '商品マスタ取込ワークID'
  , CLIENT_CD varchar(255) comment '荷主CD'
  , PRODUCT_CD varchar(255) comment '商品CD'
  , PRODUCT_NM varchar(255) comment '商品名称'
  , PRODUCT_ABBR varchar(255) comment '商品略称'
  , JAN_CD varchar(255) comment 'JANCD'
  , LOT_MANAG_FLG varchar(255) default '0' comment 'ロット管理フラグ'
  , LIMIT_DT_MANAG_FLG varchar(255) default '0' comment '期限日管理フラグ'
  , RECEIVE_LIMIT_NUM varchar(255) comment '入荷期限日数'
  , SHIPPING_LIMIT_NUM varchar(255) comment '出荷期限日数'
  , MERGE_CLS varchar(255) default '02' comment '入庫No.マージ区分'
  , LOT_REVERSE_FLG varchar(255) default '0' comment 'ロット逆転防止フラグ'
  , LIMIT_DT_REVERSE_FLG varchar(255) default '0' comment '期限日逆転防止フラグ'
  , SHIPPING_STOP_FLG varchar(255) default '0' comment '出荷停止フラグ'
  , SHAPE_GRP_CD varchar(255) comment '荷姿グループCD'
  , FIXED_POINT varchar(255) comment '定点'
  , LENGTH varchar(255) comment '縦(mm)'
  , WIDTH varchar(255) comment '横(mm)'
  , HEIGHT varchar(255) comment '高さ(mm)'
  , VOLUME varchar(255) comment '容積(mm3)'
  , NET_WEIGHT varchar(255) comment '商品重量(g)'
  , GROSS_WEIGHT varchar(255) comment '総重量(g)'
  , LINE_NO bigint not null comment '行NO.'
  , WORK_FLG char(1) default 0 comment '処理済フラグ'
  , ERROR_FLG char(1) default 0 comment 'エラーフラグ'
  , ERROR_MSG longtext comment 'エラー内容'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint W_PRODUCT_INPUT_PK primary key (PRODUCT_INPUT_ID)
) comment '商品マスタ取込ワーク' ;

-- 商品荷姿マスタ取込ワーク
create table W_PRODUCT_SHAPE_INPUT (
  PRODUCT_SHAPE_INPUT_ID bigint not null comment '商品荷姿マスタ取込ワークID'
  , CLIENT_CD varchar(255) comment '荷主CD'
  , PRODUCT_CD varchar(255) comment '商品CD'
  , SHAPE_CD varchar(255) comment '荷姿CD'
  , UNIT_NUM varchar(255) comment '入数'
  , LENGTH varchar(255) comment '縦(mm)'
  , WIDTH varchar(255) comment '横(mm)'
  , HEIGHT varchar(255) comment '高さ(mm)'
  , VOLUME varchar(255) comment '容積(mm3)'
  , NET_WEIGHT varchar(255) comment '商品重量(g)'
  , GROSS_WEIGHT varchar(255) comment '総重量(g)'
  , LINE_NO bigint not null comment '行NO.'
  , WORK_FLG char(1) default 0 comment '処理済フラグ'
  , ERROR_FLG char(1) default 0 comment 'エラーフラグ'
  , ERROR_MSG longtext comment 'エラー内容'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint W_PRODUCT_SHAPE_INPUT_PK primary key (PRODUCT_SHAPE_INPUT_ID)
) comment '商品荷姿マスタ取込ワーク' ;

-- 単行出荷検品ワークボディ
create table W_SGL_ROW_SHIP_INSP_B (
  SGL_ROW_SHIP_INSP_B_ID bigint not null comment '単行出荷検品ワークボディID'
  , SGL_ROW_SHIP_INSP_H_ID bigint not null comment '単行出荷検品ワークヘッダID'
  , PICKING_H_ID bigint not null comment '出庫ヘッダID'
  , USER_ID bigint comment 'ユーザID'
  , INSPECTED_NUM bigint default 0 not null comment '検品済数'
  , INSPECTION_FLG char(1) default '0' comment '検品フラグ'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint W_SGL_ROW_SHIP_INSP_B_PK primary key (SGL_ROW_SHIP_INSP_B_ID)
) comment '単行出荷検品ワークボディ' ;

create index W_SGL_ROW_SHIP_INSP_B_IX1
  on W_SGL_ROW_SHIP_INSP_B(PICKING_H_ID);

create index W_SGL_ROW_SHIP_INSP_B_IX2
  on W_SGL_ROW_SHIP_INSP_B(USER_ID);

create index W_SGL_ROW_SHIP_INSP_B_IX3
  on W_SGL_ROW_SHIP_INSP_B(SGL_ROW_SHIP_INSP_H_ID);

create unique index W_SGL_ROW_SHIP_INSP_B_IX4
  on W_SGL_ROW_SHIP_INSP_B(SGL_ROW_SHIP_INSP_H_ID,PICKING_H_ID);

-- 単行出荷検品ワークヘッダ
create table W_SGL_ROW_SHIP_INSP_H (
  SGL_ROW_SHIP_INSP_H_ID bigint not null comment '単行出荷検品ワークヘッダID'
  , CLIENT_ID bigint not null comment '荷主ID'
  , CENTER_ID bigint not null comment 'センタID'
  , PICKING_GROUP_NO varchar(30) not null comment 'ピッキンググループNo.'
  , TEMP_NO varchar(30) not null comment '仮置きNo.'
  , PRODUCT_ID bigint not null comment '商品ID'
  , WORK_INST_NUM bigint not null comment '作業指示数'
  , SLIP_NUM bigint comment '伝票数'
  , INSPECTED_SLIP_NUM bigint comment '検品済伝票数'
  , BOX_ID bigint comment '荷材ID'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint W_SGL_ROW_SHIP_INSP_H_PK primary key (SGL_ROW_SHIP_INSP_H_ID)
) comment '単行出荷検品ワークヘッダ' ;

create index W_SGL_ROW_SHIP_INSP_H_IX1
  on W_SGL_ROW_SHIP_INSP_H(PRODUCT_ID);

create index W_SGL_ROW_SHIP_INSP_H_IX2
  on W_SGL_ROW_SHIP_INSP_H(BOX_ID);

create unique index W_SGL_ROW_SHIP_INSP_H_IX3
  on W_SGL_ROW_SHIP_INSP_H(CLIENT_ID,CENTER_ID,PICKING_GROUP_NO,TEMP_NO,PRODUCT_ID,WORK_INST_NUM);

-- 出荷検品中断
create table W_SHIPPING_INTERRUPT (
  SHIPPING_INST_H_ID bigint not null comment '出荷検品中断ID'
  , ALLOC_INST_H_ID bigint not null comment '引当指示ヘッダID'
  , CLIENT_ID bigint not null comment '荷主ID'
  , CENTER_ID bigint not null comment 'センタID'
  , USER_CD varchar(30) not null comment 'ユーザCD'
  , PRODUCT_ID bigint comment '商品ID'
  , INST_NUM decimal(14,4) not null comment '指示数'
  , SPG_QTY_ONS decimal(14,4) comment '検品済数'
  , SPG_QTY_REMAIN decimal(14,4) comment '検品残数'
  , PIECE_NO bigint comment '個口番号'
  , BOX_ID bigint comment '荷材ID'
  , PICKING_WORK_NO varchar(30) comment '出庫作業No.'
  , NIZOROE_NO varchar(30) not null comment '荷揃番号'
  , DAIHYO_NIZOROE_NO varchar(30) comment '荷揃番号_ハイフンあり'
  , NIZOROE_NO2 varchar(30) comment '代表荷揃番号'
  , DAIHYO_NIZOROE_NO2 varchar(30) comment '代表荷揃番号_ハイフンあり'
  , LOT varchar(30) comment 'ロット'
  , LIMIT_DT varchar(8) comment '期限日'
  , PROD_DT varchar(8) comment '製造日'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint W_SHIPPING_INTERRUPT_PK primary key (SHIPPING_INST_H_ID)
) comment '出荷検品中断' ;

create index W_SHIPPING_INTERRUPT_IX1
  on W_SHIPPING_INTERRUPT(PRODUCT_ID);

create index W_SHIPPING_INTERRUPT_IX2
  on W_SHIPPING_INTERRUPT(BOX_ID);

-- 在庫取込ワーク
create table W_STOCK_INPUT (
  STOCK_INPUT_ID bigint not null comment '在庫取込ワークID'
  , CLIENT_CD varchar(255) comment '荷主CD'
  , CENTER_CD varchar(255) comment 'センタCD'
  , WAREHOUSE_CD varchar(255) comment '倉庫CD'
  , PRODUCT_CD varchar(255) comment '商品CD'
  , STOCK_TYPE_CD varchar(255) comment '在庫区分CD'
  , LOCATION_CD varchar(255) comment 'ロケーションCD'
  , DEPOSIT_CD varchar(255) comment '預託CD'
  , PROCESS_TYPE_CD varchar(255) comment '処理区分CD'
  , LOT_CD varchar(255) comment 'ロットCD'
  , STORE_LABEL_NO varchar(255) comment '入庫ラベルNo.'
  , SUPPLIER_CD varchar(255) comment '仕入先CD'
  , LIMIT_DT varchar(255) comment '期限日'
  , INST_NUM varchar(255) default 0 comment '指示数'
  , STOCK_INPUT_COMMENT varchar(255) comment '備考'
  , LINE_NO bigint comment '行NO.'
  , WORK_FLG char(1) default 0 comment '処理済フラグ'
  , ERROR_FLG char(1) default 0 comment 'エラーフラグ'
  , ERROR_MSG longtext comment 'エラー内容'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint W_STOCK_INPUT_PK primary key (STOCK_INPUT_ID)
) comment '在庫取込ワーク' ;

-- 勤務実績ワーク
create table W_WORK (
  WORK_ID bigint not null comment '勤務実績ワークID'
  , CENTER_CD varchar(30) comment 'センタCD'
  , WORK_USER_CD varchar(30) comment '作業者CD'
  , WORK_DT varchar(8) comment '作業日'
  , CLOCK_IN_FLG char(1) default '0' comment '出勤フラグ'
  , CLOCK_OUT_FLG char(1) default '0' comment '退勤フラグ'
  , ENTRY_START_DT varchar(8) comment '打刻開始日'
  , ENTRY_START_TM varchar(6) comment '打刻開始時刻'
  , ENTRY_END_DT varchar(8) comment '打刻終了日'
  , ENTRY_END_TM varchar(6) comment '打刻終了時刻'
  , BREAK_START_FLG char(1) default '0' comment '休憩開始フラグ'
  , BREAK_START_DT varchar(8) comment '休憩開始日'
  , BREAK_START_TM varchar(6) comment '休憩開始時刻'
  , BREAK_END_DT varchar(8) comment '休憩終了日'
  , BREAK_END_TM varchar(6) comment '休憩終了時刻'
  , FORCED_CLOCK_OUT_FLG char(1) default '0' comment '強制退勤フラグ'
  , WORK_FLG char(1) default '0' comment '処理済フラグ'
  , ERROR_FLG char(1) default 0 comment 'エラーフラグ'
  , ERROR_MSG longtext comment 'エラー内容'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint W_WORK_PK primary key (WORK_ID)
) comment '勤務実績ワーク' ;

-- 郵便番号マスタ(大口事業所)取込ワーク
create table W_ZIP_COMPANY_INPUT (
  ZIP_COMPANY_INPUT_ID bigint not null comment '郵便番号マスタ(大口事業所)取込ワークID'
  , PUBLIC_CD varchar(255) comment '全国地方公共団体コード'
  , COMPANY_KN varchar(255) comment '大口事業所名カナ'
  , COMPANY_NM varchar(255) comment '大口事業所名'
  , ADDRESS1 varchar(255) comment '都道府県名'
  , ADDRESS2 varchar(255) comment '市区町村名'
  , ADDRESS3 varchar(255) comment '町域名'
  , ADDRESS4 varchar(255) comment '小字'
  , ZIP_CD varchar(255) comment '郵便番号'
  , ZIP_CD_5 varchar(255) comment '旧郵便番号'
  , HANDLING_ADDRESS varchar(255) comment '取扱局'
  , FLG5 varchar(255) comment 'フラグ５'
  , FLG6 varchar(255) comment 'フラグ６'
  , UPD_CD varchar(255) comment '修正コード'
  , COMPANY_FLG varchar(255) default '1' comment '大口事業所フラグ'
  , LINE_NO bigint comment '行NO'
  , WORK_FLG char(1) comment '処理済フラグ'
  , ERROR_FLG char(1) comment 'エラーフラグ'
  , ERROR_MSG longtext comment 'エラー内容'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint W_ZIP_COMPANY_INPUT_PK primary key (ZIP_COMPANY_INPUT_ID)
) comment '郵便番号マスタ(大口事業所)取込ワーク' ;

-- 郵便番号マスタ取込ワーク
create table W_ZIP_INPUT (
  ZIP_INPUT_ID bigint not null comment '郵便番号マスタ取込ワークID'
  , PUBLIC_CD varchar(255) comment '全国地方公共団体コード'
  , ZIP_CD_5 varchar(255) comment '旧郵便番号'
  , ZIP_CD varchar(255) comment '郵便番号'
  , ADDRESS_KN1 varchar(255) comment '都道府県名カナ'
  , ADDRESS_KN2 varchar(255) comment '市区町村名カナ'
  , ADDRESS_KN3 varchar(255) comment '町域名カナ'
  , ADDRESS1 varchar(255) comment '都道府県名'
  , ADDRESS2 varchar(255) comment '市区町村名'
  , ADDRESS3 varchar(255) comment '町域名'
  , FLG1 varchar(255) comment 'フラグ１'
  , FLG2 varchar(255) comment 'フラグ２'
  , FLG3 varchar(255) comment 'フラグ３'
  , FLG4 varchar(255) comment 'フラグ４'
  , UPD_TYPE varchar(255) comment '更新の表示'
  , REASON_TYPE varchar(255) comment '変更理由'
  , LINE_NO bigint comment '行NO'
  , WORK_FLG char(1) comment '処理済フラグ'
  , ERROR_FLG char(1) comment 'エラーフラグ'
  , ERROR_MSG longtext comment 'エラー内容'
  , DEL_FLG char(1) default '0' not null comment '削除フラグ'
  , VERSION_NO bigint default 0 not null comment 'バージョンNo.'
  , CONTROL_NO bigint comment 'コントロールNo.'
  , ADD_DT datetime(3) comment '登録日時'
  , ADD_USER varchar(60) comment '登録ユーザ'
  , ADD_PROCESS varchar(255) comment '登録プロセス'
  , UPD_DT datetime(3) comment '更新日時'
  , UPD_USER varchar(60) comment '更新ユーザ'
  , UPD_PROCESS varchar(255) comment '更新プロセス'
  , constraint W_ZIP_INPUT_PK primary key (ZIP_INPUT_ID)
) comment '郵便番号マスタ取込ワーク' ;

-- 辞書マスタビュー
create view V_DICT as 
SELECT D.DICT_ID
      ,COALESCE(DC.DICT_NM, D.DICT_NM) AS DICT_NM
      ,C.CULTURE_ID
  FROM B_CULTURE C
 CROSS JOIN B_DICT D
  LEFT OUTER JOIN B_DICT_CULTURE DC
    ON D.DICT_ID = DC.DICT_ID
   AND C.CULTURE_ID = DC.CULTURE_ID
   AND DC.DEL_FLG = '0'
 WHERE C.DEL_FLG = '0'
   AND D.DEL_FLG = '0'
;

-- HT辞書マスタビュー
create view V_HT_DICT as 
SELECT D.DICT_ID
      ,COALESCE(HTDC.DICT_NM, DC.DICT_NM, HTD.DICT_NM, D.DICT_NM) AS DICT_NM
      ,C.CULTURE_ID
  FROM B_CULTURE C
 CROSS JOIN B_DICT D
  LEFT OUTER JOIN M_HT_DICT HTD
    ON HTD.DICT_ID = D.DICT_ID
   AND HTD.DEL_FLG = '0'
  LEFT OUTER JOIN B_DICT_CULTURE DC
    ON D.DICT_ID = DC.DICT_ID
   AND C.CULTURE_ID = DC.CULTURE_ID
   AND DC.DEL_FLG = '0'
  LEFT OUTER JOIN M_HT_DICT_CULTURE HTDC
    ON HTDC.DICT_CULTURE_ID = DC.DICT_CULTURE_ID
   AND HTDC.DEL_FLG = '0'
 WHERE C.DEL_FLG = '0'
   AND D.DEL_FLG = '0'

;

alter table B_ARG
  add constraint B_ARG_FK1 foreign key (FUNC_ID) references B_FUNC(FUNC_ID);

alter table B_ARG
  add constraint B_ARG_FK2 foreign key (DICT_ID) references B_DICT(DICT_ID);

alter table B_ARG_VALID
  add constraint B_ARG_VALID_FK1 foreign key (ARG_ID) references B_ARG(ARG_ID);

alter table B_CLASS_DTL
  add constraint B_CLASS_DTL_FK1 foreign key (DICT_ID) references B_DICT(DICT_ID);

alter table B_CLASS_DTL
  add constraint B_CLASS_DTL_FK2 foreign key (CLASS_ID) references B_CLASS(CLASS_ID);

alter table B_CLASS_GRP
  add constraint B_CLASS_GRP_FK1 foreign key (CLASS_ID) references B_CLASS(CLASS_ID);

alter table B_CLASS_GRP_DTL
  add constraint B_CLASS_GRP_DTL_FK1 foreign key (CLASS_GRP_ID) references B_CLASS_GRP(CLASS_GRP_ID);

alter table B_CLASS_GRP_DTL
  add constraint B_CLASS_GRP_DTL_FK2 foreign key (CLASS_DTL_ID) references B_CLASS_DTL(CLASS_DTL_ID);

alter table B_COL
  add constraint B_COL_FK1 foreign key (ITEM_ID) references B_ITEM(ITEM_ID);

alter table B_COL
  add constraint B_COL_FK2 foreign key (DICT_ID) references B_DICT(DICT_ID);

alter table B_COL_EXT_BASE
  add constraint B_COL_EXT_BASE_FK1 foreign key (ITEM_ID) references B_ITEM(ITEM_ID);

alter table B_COL_EXT_USER
  add constraint B_COL_EXT_USER_FK1 foreign key (ITEM_ID) references B_ITEM(ITEM_ID);

alter table B_COL_ROLE
  add constraint B_COL_ROLE_FK1 foreign key (COL_ID) references B_COL(COL_ID);

alter table B_COL_ROLE
  add constraint B_COL_ROLE_FK2 foreign key (ROLE_ID) references B_ROLE(ROLE_ID);

alter table B_COL_VALID
  add constraint B_COL_VALID_FK1 foreign key (COL_ID) references B_COL(COL_ID);

alter table B_CULTURE
  add constraint B_CULTURE_FK1 foreign key (DICT_ID) references B_DICT(DICT_ID);

alter table B_CULTURE
  add constraint B_CULTURE_FK2 foreign key (LANG_CULTURE_ID) references B_CULTURE(CULTURE_ID);

alter table B_CULTURE_ATTRIBUTE
  add constraint B_CULTURE_ATTRIBUTE_FK1 foreign key (CULTURE_ID) references B_CULTURE(CULTURE_ID);

alter table B_DICT_CULTURE
  add constraint B_DICT_CULTURE_FK1 foreign key (CULTURE_ID) references B_CULTURE(CULTURE_ID);

alter table B_DICT_CULTURE
  add constraint B_DICT_CULTURE_FK2 foreign key (DICT_ID) references B_DICT(DICT_ID);

alter table B_DICT_VALID
  add constraint B_DICT_VALID_FK1 foreign key (DICT_ID) references B_DICT(DICT_ID);

alter table B_FUNC_ROLE
  add constraint B_FUNC_ROLE_FK1 foreign key (FUNC_ID) references B_FUNC(FUNC_ID);

alter table B_FUNC_ROLE
  add constraint B_FUNC_ROLE_FK2 foreign key (ROLE_ID) references B_ROLE(ROLE_ID);

alter table B_INFO
  add constraint B_INFO_FK1 foreign key (CULTURE_ID) references B_CULTURE(CULTURE_ID);

alter table B_ITEM
  add constraint B_ITEM_FK1 foreign key (DICT_ID) references B_DICT(DICT_ID);

alter table B_ITEM
  add constraint B_ITEM_FK2 foreign key (SCREEN_ID) references B_SCREEN(SCREEN_ID);

alter table B_ITEM_ROLE
  add constraint B_ITEM_ROLE_FK1 foreign key (ITEM_ID) references B_ITEM(ITEM_ID);

alter table B_ITEM_ROLE
  add constraint B_ITEM_ROLE_FK2 foreign key (ROLE_ID) references B_ROLE(ROLE_ID);

alter table B_ITEM_VALID
  add constraint B_ITEM_VALID_FK1 foreign key (ITEM_ID) references B_ITEM(ITEM_ID);

alter table B_LOG_DTL
  add constraint B_LOG_DTL_FK1 foreign key (LOG_ID) references B_LOG(LOG_ID);

alter table B_MENU
  add constraint B_MENU_FK1 foreign key (MENU_GRP_ID) references B_MENU_GRP(MENU_GRP_ID);

alter table B_MENU
  add constraint B_MENU_FK2 foreign key (DICT_ID) references B_DICT(DICT_ID);

alter table B_MENU
  add constraint B_MENU_FK3 foreign key (SCREEN_ID) references B_SCREEN(SCREEN_ID);

alter table B_MENU_GRP
  add constraint B_MENU_GRP_FK1 foreign key (DICT_ID) references B_DICT(DICT_ID);

alter table B_MENU_GRP
  add constraint B_MENU_GRP_FK2 foreign key (PARENT_MENU_GRP_ID) references B_MENU_GRP(MENU_GRP_ID);

alter table B_MESSAGE
  add constraint B_MESSAGE_FK1 foreign key (CULTURE_ID) references B_CULTURE(CULTURE_ID);

alter table B_ROLE
  add constraint B_ROLE_FK1 foreign key (DICT_ID) references B_DICT(DICT_ID);

alter table B_ROLE_GRP
  add constraint B_ROLE_GRP_FK1 foreign key (DICT_ID) references B_DICT(DICT_ID);

alter table B_ROLE_GRP_DTL
  add constraint B_ROLE_GRP_DTL_FK1 foreign key (ROLE_GRP_ID) references B_ROLE_GRP(ROLE_GRP_ID);

alter table B_ROLE_GRP_DTL
  add constraint B_ROLE_GRP_DTL_FK2 foreign key (ROLE_ID) references B_ROLE(ROLE_ID);

alter table B_SCREEN
  add constraint B_SCREEN_FK1 foreign key (DICT_ID) references B_DICT(DICT_ID);

alter table B_SCREEN_ROLE
  add constraint B_SCREEN_ROLE_FK1 foreign key (SCREEN_ID) references B_SCREEN(SCREEN_ID);

alter table B_SCREEN_ROLE
  add constraint B_SCREEN_ROLE_FK2 foreign key (ROLE_ID) references B_ROLE(ROLE_ID);

alter table B_SYSTEM
  add constraint B_SYSTEM_FK1 foreign key (TIME_ZONE_ID) references B_TIME_ZONE(TIME_ZONE_ID);

alter table B_USER
  add constraint B_USER_FK1 foreign key (CULTURE_ID) references B_CULTURE(CULTURE_ID);

alter table B_USER
  add constraint B_USER_FK2 foreign key (ROLE_GRP_ID) references B_ROLE_GRP(ROLE_GRP_ID);

alter table B_USER_AUTH
  add constraint B_USER_AUTH_FK1 foreign key (USER_ID) references B_USER(USER_ID);

alter table H_INVENTORY_B
  add constraint H_INVENTORY_B_FK1 foreign key (STOCK_TYPE_ID) references M_STOCK_TYPE(STOCK_TYPE_ID);

alter table H_INVENTORY_B
  add constraint H_INVENTORY_B_FK2 foreign key (STOCK_ID) references H_STOCK(STOCK_ID);

alter table H_INVENTORY_B
  add constraint H_INVENTORY_B_FK3 foreign key (MOVE_INST_H_ID) references H_MOVE_H(MOVE_INST_H_ID);

alter table H_INVENTORY_B
  add constraint H_INVENTORY_B_FK4 foreign key (INVENTORY_H_ID) references H_INVENTORY_H(INVENTORY_H_ID);

alter table H_INVENTORY_B
  add constraint H_INVENTORY_B_FK5 foreign key (SHAPE_ID) references M_SHAPE(SHAPE_ID);

alter table H_LOCATION_ATTRIBUTE
  add constraint H_LOCATION_ATTRIBUTE_FK1 foreign key (CENTER_ID) references M_CENTER(CENTER_ID);

alter table H_LOCATION_ATTRIBUTE
  add constraint H_LOCATION_ATTRIBUTE_FK2 foreign key (LOCATION_ID) references M_LOCATION(LOCATION_ID);

alter table H_MOVE_B
  add constraint H_MOVE_B_FK1 foreign key (STOCK_ID) references H_STOCK(STOCK_ID);

alter table H_MOVE_B
  add constraint H_MOVE_B_FK2 foreign key (MOVE_INST_H_ID) references H_MOVE_H(MOVE_INST_H_ID);

alter table H_MOVE_H
  add constraint H_MOVE_H_FK1 foreign key (PROCESS_TYPE_ID) references M_PROCESS_TYPE(PROCESS_TYPE_ID);

alter table H_PACKING_B
  add constraint H_PACKING_B_FK1 foreign key (STOCK_ID) references H_STOCK(STOCK_ID);

alter table H_PACKING_B
  add constraint H_PACKING_B_FK2 foreign key (SHIPPING_INST_B_ID) references H_SHIPPING_B(SHIPPING_INST_B_ID);

alter table H_PACKING_B
  add constraint H_PACKING_B_FK3 foreign key (PACKING_H_ID) references H_PACKING_H(PACKING_H_ID);

alter table H_PACKING_H
  add constraint H_PACKING_H_FK1 foreign key (SHIPPING_INST_H_ID) references H_SHIPPING_H(SHIPPING_INST_H_ID);

alter table H_RECEIVE_B
  add constraint H_RECEIVE_B_FK1 foreign key (STORE_RECORD_H_ID) references H_RECEIVE_H(STORE_RECORD_H_ID);

alter table H_RECEIVE_B
  add constraint H_RECEIVE_B_FK2 foreign key (STOCK_ID) references H_STOCK(STOCK_ID);

alter table H_RECEIVE_H
  add constraint H_RECEIVE_H_FK1 foreign key (PROCESS_TYPE_ID) references M_PROCESS_TYPE(PROCESS_TYPE_ID);

alter table H_RECEIVE_SPARE
  add constraint H_RECEIVE_SPARE_FK1 foreign key (STORE_RECORD_B_ID) references H_RECEIVE_B(STORE_RECORD_B_ID);

alter table H_SHIPPING_B
  add constraint H_SHIPPING_B_FK1 foreign key (SHIPPING_INST_H_ID) references H_SHIPPING_H(SHIPPING_INST_H_ID);

alter table H_SHIPPING_B
  add constraint H_SHIPPING_B_FK2 foreign key (STOCK_TYPE_ID) references M_STOCK_TYPE(STOCK_TYPE_ID);

alter table H_SHIPPING_H
  add constraint H_SHIPPING_H_FK1 foreign key (PROCESS_TYPE_ID) references M_PROCESS_TYPE(PROCESS_TYPE_ID);

alter table H_SHIPPING_SPARE
  add constraint H_SHIPPING_SPARE_FK1 foreign key (SHIPPING_INST_B_ID) references H_SHIPPING_B(SHIPPING_INST_B_ID);

alter table H_STOCK
  add constraint H_STOCK_FK1 foreign key (STOCK_TYPE_ID) references M_STOCK_TYPE(STOCK_TYPE_ID);

alter table H_STOCK
  add constraint H_STOCK_FK2 foreign key (SHAPE_ID) references M_SHAPE(SHAPE_ID);

alter table H_STOCK_BOOK
  add constraint H_STOCK_BOOK_FK1 foreign key (PRODUCT_ID) references M_PRODUCT(PRODUCT_ID);

alter table H_STOCK_INOUT
  add constraint H_STOCK_INOUT_FK1 foreign key (STOCK_ID) references H_STOCK(STOCK_ID);

alter table H_STOCK_INOUT
  add constraint H_STOCK_INOUT_FK2 foreign key (PROCESS_TYPE_ID) references M_PROCESS_TYPE(PROCESS_TYPE_ID);

alter table H_STOCK_REPORT
  add constraint H_STOCK_REPORT_FK1 foreign key (STOCK_ID) references H_STOCK(STOCK_ID);

alter table M_BASE_SALES_ORG
  add constraint M_BASE_SALES_ORG_FK1 foreign key (SALES_ORG_ID) references M_SALES_ORG(SALES_ORG_ID);

alter table M_BASE_SALES_ORG
  add constraint M_BASE_SALES_ORG_FK2 foreign key (CARRIER_ID) references M_CARRIER(CARRIER_ID);

alter table M_BOX
  add constraint M_BOX_FK1 foreign key (CENTER_ID) references M_CENTER(CENTER_ID);

alter table M_BOX_GRP
  add constraint M_BOX_GRP_FK1 foreign key (CENTER_ID) references M_CENTER(CENTER_ID);

alter table M_BOX_GRP
  add constraint M_BOX_GRP_FK2 foreign key (STANDARD_BOX_ID) references M_BOX(BOX_ID);

alter table M_BOX_GRP_DTL
  add constraint M_BOX_GRP_DTL_FK1 foreign key (BOX_GRP_ID) references M_BOX_GRP(BOX_GRP_ID);

alter table M_BOX_GRP_DTL
  add constraint M_BOX_GRP_DTL_FK2 foreign key (BOX_ID) references M_BOX(BOX_ID);

alter table M_CARRIER
  add constraint M_CARRIER_FK1 foreign key (CENTER_ID) references M_CENTER(CENTER_ID);

alter table M_CARRIER
  add constraint M_CARRIER_FK2 foreign key (COMMON_CARRIER_ID) references M_COMMON_CARRIER(COMMON_CARRIER_ID);

alter table M_CARRIER_BOX
  add constraint M_CARRIER_BOX_FK1 foreign key (BOX_ID) references M_BOX(BOX_ID);

alter table M_CARRIER_BOX
  add constraint M_CARRIER_BOX_FK2 foreign key (CARRIER_ID) references M_CARRIER(CARRIER_ID);

alter table M_CARRIER_DECISION
  add constraint M_CARRIER_DECISION_FK1 foreign key (CARRIER_ID1) references M_CARRIER(CARRIER_ID);

alter table M_CARRIER_DECISION
  add constraint M_CARRIER_DECISION_FK2 foreign key (CARRIER_ID2) references M_CARRIER(CARRIER_ID);

alter table M_CARRIER_DECISION
  add constraint M_CARRIER_DECISION_FK3 foreign key (SALES_ORG_ID) references M_SALES_ORG(SALES_ORG_ID);

alter table M_CARRIER_DECISION
  add constraint M_CARRIER_DECISION_FK4 foreign key (CARRIER_ID) references M_CARRIER(CARRIER_ID);

alter table M_CARRIER_DECISION
  add constraint M_CARRIER_DECISION_FK5 foreign key (CUSTOMER_ID) references M_CUSTOMER(CUSTOMER_ID);

alter table M_CARRIER_DECISION
  add constraint M_CARRIER_DECISION_FK6 foreign key (CARRIER_ID3) references M_CARRIER(CARRIER_ID);

alter table M_CARRIER_SLIP_CES
  add constraint M_CARRIER_SLIP_CES_FK1 foreign key (CUSTOMER_ID) references M_CUSTOMER(CUSTOMER_ID);

alter table M_CARRIER_SLIP_SGW
  add constraint M_CARRIER_SLIP_SGW_FK1 foreign key (CENTER_ID) references M_CENTER(CENTER_ID);

alter table M_CARRIER_SLIP_YMT
  add constraint M_CARRIER_SLIP_YMT_FK1 foreign key (CENTER_ID) references M_CENTER(CENTER_ID);

alter table M_CARRIER_SLIP_YUPK
  add constraint M_CARRIER_SLIP_YUPK_FK1 foreign key (CENTER_ID) references M_CENTER(CENTER_ID);

alter table M_CARRIER_ZIP
  add constraint M_CARRIER_ZIP_FK1 foreign key (COMMON_CARRIER_ID) references M_COMMON_CARRIER(COMMON_CARRIER_ID);

alter table M_CARRIER_ZIP
  add constraint M_CARRIER_ZIP_FK2 foreign key (ZIP_ID) references M_ZIP(ZIP_ID);

alter table M_CENTER
  add constraint M_CENTER_FK1 foreign key (CULTURE_ID) references B_CULTURE(CULTURE_ID);

alter table M_CENTER
  add constraint M_CENTER_FK2 foreign key (TIME_ZONE_ID) references B_TIME_ZONE(TIME_ZONE_ID);

alter table M_CENTER_CLASS
  add constraint M_CENTER_CLASS_FK1 foreign key (CENTER_ID) references M_CENTER(CENTER_ID);

alter table M_CENTER_CLASS_DTL
  add constraint M_CENTER_CLASS_DTL_FK1 foreign key (CENTER_CLASS_ID) references M_CENTER_CLASS(CENTER_CLASS_ID);

alter table M_CENTER_CLASS_DTL
  add constraint M_CENTER_CLASS_DTL_FK2 foreign key (DICT_ID) references B_DICT(DICT_ID);

alter table M_CENTER_CLASS_GRP
  add constraint M_CENTER_CLASS_GRP_FK1 foreign key (CENTER_CLASS_ID) references M_CENTER_CLASS(CENTER_CLASS_ID);

alter table M_CENTER_CLASS_GRP_DTL
  add constraint M_CENTER_CLASS_GRP_DTL_FK1 foreign key (CENTER_CLASS_DTL_ID) references M_CENTER_CLASS_DTL(CENTER_CLASS_DTL_ID);

alter table M_CENTER_CLASS_GRP_DTL
  add constraint M_CENTER_CLASS_GRP_DTL_FK2 foreign key (CENTER_CLASS_GRP_ID) references M_CENTER_CLASS_GRP(CENTER_CLASS_GRP_ID);

alter table M_CENTER_COL
  add constraint M_CENTER_COL_FK1 foreign key (DICT_ID) references B_DICT(DICT_ID);

alter table M_CENTER_COL
  add constraint M_CENTER_COL_FK2 foreign key (COL_ID) references B_COL(COL_ID);

alter table M_CENTER_COL
  add constraint M_CENTER_COL_FK3 foreign key (CENTER_ID) references M_CENTER(CENTER_ID);

alter table M_CENTER_CUSTOMER
  add constraint M_CENTER_CUSTOMER_FK1 foreign key (DELIVERY_COURSE_ID) references M_DELIVERY_COURSE(DELIVERY_COURSE_ID);

alter table M_CENTER_CUSTOMER
  add constraint M_CENTER_CUSTOMER_FK2 foreign key (CUSTOMER_ID) references M_CUSTOMER(CUSTOMER_ID);

alter table M_CENTER_CUSTOMER
  add constraint M_CENTER_CUSTOMER_FK3 foreign key (CENTER_ID) references M_CENTER(CENTER_ID);

alter table M_CENTER_ITEM
  add constraint M_CENTER_ITEM_FK1 foreign key (CENTER_ID) references M_CENTER(CENTER_ID);

alter table M_CENTER_ITEM
  add constraint M_CENTER_ITEM_FK2 foreign key (DICT_ID) references B_DICT(DICT_ID);

alter table M_CENTER_ITEM
  add constraint M_CENTER_ITEM_FK3 foreign key (ITEM_ID) references B_ITEM(ITEM_ID);

alter table M_CENTER_SCREEN
  add constraint M_CENTER_SCREEN_FK1 foreign key (DICT_ID) references B_DICT(DICT_ID);

alter table M_CENTER_SCREEN
  add constraint M_CENTER_SCREEN_FK2 foreign key (SCREEN_ID) references B_SCREEN(SCREEN_ID);

alter table M_CENTER_SCREEN
  add constraint M_CENTER_SCREEN_FK3 foreign key (CENTER_ID) references M_CENTER(CENTER_ID);

alter table M_CLIENT
  add constraint M_CLIENT_FK1 foreign key (SHAPE_GRP_ID) references M_SHAPE_GRP(SHAPE_GRP_ID);

alter table M_CLIENT
  add constraint M_CLIENT_FK2 foreign key (CUSTOMER_ID) references M_CUSTOMER(CUSTOMER_ID);

alter table M_CLIENT_CENTER
  add constraint M_CLIENT_CENTER_FK1 foreign key (CLIENT_ID) references M_CLIENT(CLIENT_ID);

alter table M_CLIENT_CENTER
  add constraint M_CLIENT_CENTER_FK2 foreign key (CUSTOMER_ID) references M_CUSTOMER(CUSTOMER_ID);

alter table M_CLIENT_CENTER
  add constraint M_CLIENT_CENTER_FK3 foreign key (CENTER_ID) references M_CENTER(CENTER_ID);

alter table M_CLIENT_COL
  add constraint M_CLIENT_COL_FK1 foreign key (COL_ID) references B_COL(COL_ID);

alter table M_CLIENT_COL
  add constraint M_CLIENT_COL_FK2 foreign key (DICT_ID) references B_DICT(DICT_ID);

alter table M_CLIENT_COL
  add constraint M_CLIENT_COL_FK3 foreign key (CLIENT_ID) references M_CLIENT(CLIENT_ID);

alter table M_CLIENT_ITEM
  add constraint M_CLIENT_ITEM_FK1 foreign key (ITEM_ID) references B_ITEM(ITEM_ID);

alter table M_CLIENT_ITEM
  add constraint M_CLIENT_ITEM_FK2 foreign key (DICT_ID) references B_DICT(DICT_ID);

alter table M_CLIENT_ITEM
  add constraint M_CLIENT_ITEM_FK3 foreign key (CLIENT_ID) references M_CLIENT(CLIENT_ID);

alter table M_CLIENT_SCREEN
  add constraint M_CLIENT_SCREEN_FK1 foreign key (DICT_ID) references B_DICT(DICT_ID);

alter table M_CLIENT_SCREEN
  add constraint M_CLIENT_SCREEN_FK2 foreign key (SCREEN_ID) references B_SCREEN(SCREEN_ID);

alter table M_CLIENT_SCREEN
  add constraint M_CLIENT_SCREEN_FK3 foreign key (CLIENT_ID) references M_CLIENT(CLIENT_ID);

alter table M_CUSTOMER
  add constraint M_CUSTOMER_FK1 foreign key (CLIENT_ID) references M_CLIENT(CLIENT_ID);

alter table M_CUSTOMER
  add constraint M_CUSTOMER_FK2 foreign key (DELIV_CUSTOMER_ID) references M_CUSTOMER(CUSTOMER_ID);

alter table M_CUSTOMER_PICKING
  add constraint M_CUSTOMER_PICKING_FK1 foreign key (CENTER_ID) references M_CENTER(CENTER_ID);

alter table M_CUSTOMER_PICKING
  add constraint M_CUSTOMER_PICKING_FK2 foreign key (SALES_ORG_ID) references M_SALES_ORG(SALES_ORG_ID);

alter table M_CUSTOMER_PICKING
  add constraint M_CUSTOMER_PICKING_FK3 foreign key (CUSTOMER_ID) references M_CUSTOMER(CUSTOMER_ID);

alter table M_DATA_INPUT_TYPE_B
  add constraint M_DATA_INPUT_TYPE_B_FK1 foreign key (DATA_INPUT_TYPE_ID) references M_DATA_INPUT_TYPE(DATA_INPUT_TYPE_ID);

alter table M_DELIVERY_COURSE
  add constraint M_DELIVERY_COURSE_FK1 foreign key (CARRIER_SLIP_YMT_ID) references M_CARRIER_SLIP_YMT(CARRIER_SLIP_YMT_ID);

alter table M_DELIVERY_COURSE
  add constraint M_DELIVERY_COURSE_FK2 foreign key (CARRIER_SLIP_SGW_ID) references M_CARRIER_SLIP_SGW(CARRIER_SLIP_SGW_ID);

alter table M_DELIVERY_COURSE
  add constraint M_DELIVERY_COURSE_FK3 foreign key (CARRIER_SLIP_YUPK_ID) references M_CARRIER_SLIP_YUPK(CARRIER_SLIP_YUPK_ID);

alter table M_DELIVERY_COURSE
  add constraint M_DELIVERY_COURSE_FK4 foreign key (CENTER_ID) references M_CENTER(CENTER_ID);

alter table M_DELIVERY_COURSE
  add constraint M_DELIVERY_COURSE_FK5 foreign key (CARRIER_ID) references M_CARRIER(CARRIER_ID);

alter table M_DEPOSIT_PRODUCT
  add constraint M_DEPOSIT_PRODUCT_FK1 foreign key (SALES_ORG_ID) references M_SALES_ORG(SALES_ORG_ID);

alter table M_DEPOSIT_PRODUCT
  add constraint M_DEPOSIT_PRODUCT_FK2 foreign key (ACCOUNT_ID) references M_CUSTOMER(CUSTOMER_ID);

alter table M_DEPOSIT_PRODUCT
  add constraint M_DEPOSIT_PRODUCT_FK3 foreign key (PRODUCT_ID) references M_PRODUCT(PRODUCT_ID);

alter table M_EDI_COLUMN
  add constraint M_EDI_COLUMN_FK1 foreign key (EDI_ID) references M_EDI(EDI_ID);

alter table M_GENERAL
  add constraint M_GENERAL_FK1 foreign key (CENTER_ID) references M_CENTER(CENTER_ID);

alter table M_HT_DICT
  add constraint M_HT_DICT_FK1 foreign key (DICT_ID) references B_DICT(DICT_ID);

alter table M_HT_DICT_CULTURE
  add constraint M_HT_DICT_CULTURE_FK1 foreign key (DICT_CULTURE_ID) references B_DICT_CULTURE(DICT_CULTURE_ID);

alter table M_HT_MESSAGE
  add constraint M_HT_MESSAGE_FK1 foreign key (MESSAGE_ID) references B_MESSAGE(MESSAGE_ID);

alter table M_IMPORT_TYPE
  add constraint M_IMPORT_TYPE_FK1 foreign key (CLIENT_ID) references M_CLIENT(CLIENT_ID);

alter table M_IMPORT_TYPE
  add constraint M_IMPORT_TYPE_FK2 foreign key (EDI_ID) references M_EDI(EDI_ID);

alter table M_IMPORT_TYPE_B
  add constraint M_IMPORT_TYPE_B_FK1 foreign key (EDI_COLUMN_ID) references M_EDI_COLUMN(EDI_COLUMN_ID);

alter table M_IMPORT_TYPE_B
  add constraint M_IMPORT_TYPE_B_FK2 foreign key (IMPORT_TYPE_ID) references M_IMPORT_TYPE(IMPORT_TYPE_ID);

alter table M_IMPORT_TYPE_B_COPY_B
  add constraint M_IMPORT_TYPE_B_COPY_B_FK1 foreign key (IMPORT_TYPE_B_ID) references M_IMPORT_TYPE_B(IMPORT_TYPE_B_ID);

alter table M_IMPORT_TYPE_B_COPY_H
  add constraint M_IMPORT_TYPE_B_COPY_H_FK1 foreign key (IMPORT_TYPE_B_ID) references M_IMPORT_TYPE_B(IMPORT_TYPE_B_ID);

alter table M_KOGUCHI_DELIVERY
  add constraint M_KOGUCHI_DELIVERY_FK1 foreign key (SERV_SALES_ORG_ID) references M_SALES_ORG(SALES_ORG_ID);

alter table M_KOGUCHI_DELIVERY
  add constraint M_KOGUCHI_DELIVERY_FK2 foreign key (CARRIER_ID) references M_CARRIER(CARRIER_ID);

alter table M_LOCATION
  add constraint M_LOCATION_FK1 foreign key (MAX_STORE_PRODUCT_SHAPE_ID) references M_PRODUCT_SHAPE(PRODUCT_SHAPE_ID);

alter table M_LOCATION
  add constraint M_LOCATION_FK2 foreign key (REPLENISH_P_PRODUCT_SHAPE_ID) references M_PRODUCT_SHAPE(PRODUCT_SHAPE_ID);

alter table M_LOCATION
  add constraint M_LOCATION_FK3 foreign key (REPLENISH_PRODUCT_ID) references M_PRODUCT(PRODUCT_ID);

alter table M_LOCATION
  add constraint M_LOCATION_FK4 foreign key (CENTER_ID) references M_CENTER(CENTER_ID);

alter table M_LOCATION
  add constraint M_LOCATION_FK5 foreign key (REPLENISH_DEPOSIT_ID) references M_CUSTOMER(CUSTOMER_ID);

alter table M_LOCATION
  add constraint M_LOCATION_FK6 foreign key (REPLENISH_STOCK_TYPE_ID) references M_STOCK_TYPE(STOCK_TYPE_ID);

alter table M_LOCATION
  add constraint M_LOCATION_FK7 foreign key (ZONE_ID) references M_ZONE(ZONE_ID);

alter table M_LOCATION_REPLENISH_PRODUCT
  add constraint M_LOCATION_REPLENISH_PRODUCT_FK1 foreign key (REPLENISH_PRODUCT_ID) references M_PRODUCT(PRODUCT_ID);

alter table M_LOCATION_REPLENISH_PRODUCT
  add constraint M_LOCATION_REPLENISH_PRODUCT_FK2 foreign key (LOCATION_ID) references M_LOCATION(LOCATION_ID);

alter table M_LOCATION_REPLENISH_PRODUCT
  add constraint M_LOCATION_REPLENISH_PRODUCT_FK3 foreign key (REPLENISH_STOCK_TYPE_ID) references M_STOCK_TYPE(STOCK_TYPE_ID);

alter table M_LOCATION_REPLENISH_PRODUCT
  add constraint M_LOCATION_REPLENISH_PRODUCT_FK4 foreign key (MAX_STORE_PRODUCT_SHAPE_ID) references M_PRODUCT_SHAPE(PRODUCT_SHAPE_ID);

alter table M_LOCATION_REPLENISH_PRODUCT
  add constraint M_LOCATION_REPLENISH_PRODUCT_FK5 foreign key (REPLENISH_DEPOSIT_ID) references M_CUSTOMER(CUSTOMER_ID);

alter table M_LOCATION_REPLENISH_PRODUCT
  add constraint M_LOCATION_REPLENISH_PRODUCT_FK6 foreign key (REPLENISH_P_PRODUCT_SHAPE_ID) references M_SHAPE(SHAPE_ID);

alter table M_NIZOROE
  add constraint M_NIZOROE_FK1 foreign key (NIZOROE_PATERN_ID) references M_NIZOROE_PATERN(NIZOROE_PATERN_ID);

alter table M_NIZOROE
  add constraint M_NIZOROE_FK2 foreign key (CENTER_ID) references M_CENTER(CENTER_ID);

alter table M_NUMBERING_CENTER
  add constraint M_NUMBERING_CENTER_FK1 foreign key (CENTER_ID) references M_CENTER(CENTER_ID);

alter table M_PARAM
  add constraint M_PARAM_FK1 foreign key (CLIENT_CENTER_ID) references M_CLIENT_CENTER(CLIENT_CENTER_ID);

alter table M_PARAM
  add constraint M_PARAM_FK2 foreign key (PACKING_BOX_GROUP_ID) references M_BOX_GRP(BOX_GRP_ID);

alter table M_PARAM
  add constraint M_PARAM_FK3 foreign key (EM_REPLENISH_ZONE_ID) references M_ZONE(ZONE_ID);

alter table M_PARAM
  add constraint M_PARAM_FK4 foreign key (DEFAULT_BOX_ID) references M_BOX(BOX_ID);

alter table M_PARAM
  add constraint M_PARAM_FK5 foreign key (DELIVERY_COURSE_ID) references M_DELIVERY_COURSE(DELIVERY_COURSE_ID);

alter table M_PROCESS_TYPE
  add constraint M_PROCESS_TYPE_FK1 foreign key (STOCK_TYPE_ID) references M_STOCK_TYPE(STOCK_TYPE_ID);

alter table M_PROCESS_TYPE
  add constraint M_PROCESS_TYPE_FK2 foreign key (DICT_ID) references B_DICT(DICT_ID);

alter table M_PRODUCT
  add constraint M_PRODUCT_FK1 foreign key (CLIENT_ID) references M_CLIENT(CLIENT_ID);

alter table M_PRODUCT
  add constraint M_PRODUCT_FK2 foreign key (SHAPE_GRP_ID) references M_SHAPE_GRP(SHAPE_GRP_ID);

alter table M_PRODUCT_SHAPE
  add constraint M_PRODUCT_SHAPE_FK1 foreign key (PRODUCT_ID) references M_PRODUCT(PRODUCT_ID);

alter table M_PRODUCT_SHAPE
  add constraint M_PRODUCT_SHAPE_FK2 foreign key (SHAPE_GRP_DTL_ID) references M_SHAPE_GRP_DTL(SHAPE_GRP_DTL_ID);

alter table M_SET_PARENT
  add constraint M_SET_PARENT_FK1 foreign key (PRODUCT_ID) references M_PRODUCT(PRODUCT_ID);

alter table M_SET_STRUCTURE
  add constraint M_SET_STRUCTURE_FK1 foreign key (SET_PARENT_ID) references M_SET_PARENT(SET_PARENT_ID);

alter table M_SET_STRUCTURE
  add constraint M_SET_STRUCTURE_FK2 foreign key (PRODUCT_ID) references M_PRODUCT(PRODUCT_ID);

alter table M_SHAPE
  add constraint M_SHAPE_FK1 foreign key (SHAPE_UNIT_DICT_ID) references B_DICT(DICT_ID);

alter table M_SHAPE
  add constraint M_SHAPE_FK2 foreign key (SHAPE_DICT_ID) references B_DICT(DICT_ID);

alter table M_SHAPE_GRP
  add constraint M_SHAPE_GRP_FK1 foreign key (CLIENT_ID) references M_CLIENT(CLIENT_ID);

alter table M_SHAPE_GRP_DTL
  add constraint M_SHAPE_GRP_DTL_FK1 foreign key (SHAPE_GRP_ID) references M_SHAPE_GRP(SHAPE_GRP_ID);

alter table M_SHAPE_GRP_DTL
  add constraint M_SHAPE_GRP_DTL_FK2 foreign key (SHAPE_ID) references M_SHAPE(SHAPE_ID);

alter table M_STOCK_TYPE
  add constraint M_STOCK_TYPE_FK1 foreign key (DICT_ID) references B_DICT(DICT_ID);

alter table M_USER_CENTER
  add constraint M_USER_CENTER_FK1 foreign key (CENTER_ID) references M_CENTER(CENTER_ID);

alter table M_USER_CENTER
  add constraint M_USER_CENTER_FK2 foreign key (USER_ID) references B_USER(USER_ID);

alter table M_USER_CLIENT
  add constraint M_USER_CLIENT_FK1 foreign key (USER_ID) references B_USER(USER_ID);

alter table M_USER_CLIENT
  add constraint M_USER_CLIENT_FK2 foreign key (CLIENT_ID) references M_CLIENT(CLIENT_ID);

alter table M_USER_DEPOSIT
  add constraint M_USER_DEPOSIT_FK1 foreign key (CUSTOMER_ID) references M_CUSTOMER(CUSTOMER_ID);

alter table M_USER_DEPOSIT
  add constraint M_USER_DEPOSIT_FK2 foreign key (USER_ID) references B_USER(USER_ID);

alter table M_USER_LOGIN
  add constraint M_USER_LOGIN_FK1 foreign key (CLIENT_ID) references M_CLIENT(CLIENT_ID);

alter table M_USER_LOGIN
  add constraint M_USER_LOGIN_FK2 foreign key (USER_ID) references B_USER(USER_ID);

alter table M_USER_LOGIN
  add constraint M_USER_LOGIN_FK3 foreign key (CENTER_ID) references M_CENTER(CENTER_ID);

alter table M_WAREHOUSE
  add constraint M_WAREHOUSE_FK1 foreign key (CENTER_ID) references M_CENTER(CENTER_ID);

alter table M_WEB_HT_INFO
  add constraint M_WEB_HT_INFO_FK1 foreign key (WAREHOUSE_ID) references M_WAREHOUSE(WAREHOUSE_ID);

alter table M_WEB_HT_INFO
  add constraint M_WEB_HT_INFO_FK2 foreign key (CENTER_ID) references M_CENTER(CENTER_ID);

alter table M_WEB_HT_INFO
  add constraint M_WEB_HT_INFO_FK3 foreign key (CLIENT_ID) references M_CLIENT(CLIENT_ID);

alter table M_ZONE
  add constraint M_ZONE_FK1 foreign key (WAREHOUSE_ID) references M_WAREHOUSE(WAREHOUSE_ID);

alter table P_LAYOUT_PRINT_SETTING
  add constraint P_LAYOUT_PRINT_SETTING_FK1 foreign key (PRINTER_ID) references P_PRINTER(PRINTER_ID);

alter table P_LAYOUT_PRINT_SETTING
  add constraint P_LAYOUT_PRINT_SETTING_FK2 foreign key (PRINTER_GROUP_ID) references P_PRINTER_GROUP(PRINTER_GROUP_ID);

alter table P_LAYOUT_PRINT_SETTING
  add constraint P_LAYOUT_PRINT_SETTING_FK3 foreign key (REPORT_LAYOUT_ID) references P_REPORT_LAYOUT(REPORT_LAYOUT_ID);

alter table P_LAYOUT_PRINT_SETTING
  add constraint P_LAYOUT_PRINT_SETTING_FK4 foreign key (PRINTER_ATTRIBUTE_ID) references P_PRINTER_ATTRIBUTE(PRINTER_ATTRIBUTE_ID);

alter table P_PRINT_QUEUE
  add constraint P_PRINT_QUEUE_FK1 foreign key (PRINT_REQUEST_ID) references P_PRINT_REQUEST(PRINT_REQUEST_ID);

alter table P_PRINT_REQUEST_BINARY
  add constraint P_PRINT_REQUEST_BINARY_FK1 foreign key (PRINT_REQUEST_ID) references P_PRINT_REQUEST(PRINT_REQUEST_ID);

alter table P_PRINT_REQUEST_DATA
  add constraint P_PRINT_REQUEST_DATA_FK1 foreign key (PRINT_REQUEST_ID) references P_PRINT_REQUEST(PRINT_REQUEST_ID);

alter table P_PRINT_REQUEST_HIST
  add constraint P_PRINT_REQUEST_HIST_FK1 foreign key (PRINT_REQUEST_ID) references P_PRINT_REQUEST(PRINT_REQUEST_ID);

alter table P_PRINTER
  add constraint P_PRINTER_FK1 foreign key (PRINTER_GROUP_ID) references P_PRINTER_GROUP(PRINTER_GROUP_ID);

alter table P_PRINTER_ATTRIBUTE
  add constraint P_PRINTER_ATTRIBUTE_FK1 foreign key (PRINTER_ID) references P_PRINTER(PRINTER_ID);

alter table P_REPORT_LAYOUT
  add constraint P_REPORT_LAYOUT_FK1 foreign key (REPORT_ID) references P_REPORT(REPORT_ID);

alter table P_REPORT_LAYOUT_ITEM
  add constraint P_REPORT_LAYOUT_ITEM_FK1 foreign key (REPORT_LAYOUT_ID) references P_REPORT_LAYOUT(REPORT_LAYOUT_ID);

alter table P_REPORT_LAYOUT_ITEM
  add constraint P_REPORT_LAYOUT_ITEM_FK2 foreign key (DICT_ID) references B_DICT(DICT_ID);

alter table P_SUBREP_LAYOUT
  add constraint P_SUBREP_LAYOUT_FK1 foreign key (REPORT_LAYOUT_ID) references P_REPORT_LAYOUT(REPORT_LAYOUT_ID);

alter table P_SUBREP_LAYOUT_ITEM
  add constraint P_SUBREP_LAYOUT_ITEM_FK1 foreign key (SUBREP_LAYOUT_ID) references P_SUBREP_LAYOUT(SUBREP_LAYOUT_ID);

alter table P_SUBREP_LAYOUT_ITEM
  add constraint P_SUBREP_LAYOUT_ITEM_FK2 foreign key (DICT_ID) references B_DICT(DICT_ID);

alter table T_ALLOC_INST_B
  add constraint T_ALLOC_INST_B_FK1 foreign key (DEPOSIT_ID) references M_CUSTOMER(CUSTOMER_ID);

alter table T_ALLOC_INST_B
  add constraint T_ALLOC_INST_B_FK2 foreign key (SHAPE_ID) references M_SHAPE(SHAPE_ID);

alter table T_ALLOC_INST_B
  add constraint T_ALLOC_INST_B_FK3 foreign key (LOT_ID) references T_LOT(LOT_ID);

alter table T_ALLOC_INST_B
  add constraint T_ALLOC_INST_B_FK4 foreign key (STORE_NO_ID) references T_STORE_NO(STORE_NO_ID);

alter table T_ALLOC_INST_B
  add constraint T_ALLOC_INST_B_FK5 foreign key (ALLOC_INST_H_ID) references T_ALLOC_INST_H(ALLOC_INST_H_ID);

alter table T_ALLOC_INST_B
  add constraint T_ALLOC_INST_B_FK6 foreign key (WAREHOUSE_ID) references M_WAREHOUSE(WAREHOUSE_ID);

alter table T_ALLOC_INST_B
  add constraint T_ALLOC_INST_B_FK7 foreign key (LOCATION_ID) references M_LOCATION(LOCATION_ID);

alter table T_ALLOC_INST_B
  add constraint T_ALLOC_INST_B_FK8 foreign key (PRODUCT_ID) references M_PRODUCT(PRODUCT_ID);

alter table T_ALLOC_INST_B
  add constraint T_ALLOC_INST_B_FK9 foreign key (STOCK_TYPE_ID) references M_STOCK_TYPE(STOCK_TYPE_ID);

alter table T_ALLOC_INST_H
  add constraint T_ALLOC_INST_H_FK1 foreign key (DELIVERY_COURSE_ID) references M_DELIVERY_COURSE(DELIVERY_COURSE_ID);

alter table T_ALLOC_INST_H
  add constraint T_ALLOC_INST_H_FK2 foreign key (SUPPLY_CUSTOMER_ID) references M_CUSTOMER(CUSTOMER_ID);

alter table T_ALLOC_INST_H
  add constraint T_ALLOC_INST_H_FK3 foreign key (CENTER_ID) references M_CENTER(CENTER_ID);

alter table T_ALLOC_INST_H
  add constraint T_ALLOC_INST_H_FK4 foreign key (CLIENT_ID) references M_CLIENT(CLIENT_ID);

alter table T_ALLOC_INST_H
  add constraint T_ALLOC_INST_H_FK5 foreign key (DELIV_CUSTOMER_ID) references M_CUSTOMER(CUSTOMER_ID);

alter table T_ALLOC_INST_H
  add constraint T_ALLOC_INST_H_FK6 foreign key (PROCESS_TYPE_ID) references M_PROCESS_TYPE(PROCESS_TYPE_ID);

alter table T_ALLOC_LOT
  add constraint T_ALLOC_LOT_FK1 foreign key (PRODUCT_ID) references M_PRODUCT(PRODUCT_ID);

alter table T_ALLOC_LOT
  add constraint T_ALLOC_LOT_FK2 foreign key (CUSTOMER_ID) references M_CUSTOMER(CUSTOMER_ID);

alter table T_ALLOC_LOT
  add constraint T_ALLOC_LOT_FK3 foreign key (ALLOC_INST_B_ID) references T_ALLOC_INST_B(ALLOC_INST_B_ID);

alter table T_ALLOC_LOT
  add constraint T_ALLOC_LOT_FK4 foreign key (LOT_ID) references T_LOT(LOT_ID);

alter table T_AMAZON_ORDER
  add constraint T_AMAZON_ORDER_FK1 foreign key (EC_ORDER_B_ID) references T_EC_ORDER_B(EC_ORDER_B_ID);

alter table T_EC_ORDER_B
  add constraint T_EC_ORDER_B_FK1 foreign key (EC_ORDER_H_ID) references T_EC_ORDER_H(EC_ORDER_H_ID);

alter table T_EC_ORDER_H
  add constraint T_EC_ORDER_H_FK1 foreign key (IMPORT_TYPE_ID) references M_IMPORT_TYPE(IMPORT_TYPE_ID);

alter table T_EC_ORDER_H
  add constraint T_EC_ORDER_H_FK2 foreign key (CLIENT_ID) references M_CLIENT(CLIENT_ID);

alter table T_EC_ORDER_H
  add constraint T_EC_ORDER_H_FK3 foreign key (CENTER_ID) references M_CENTER(CENTER_ID);

alter table T_EC_ORDER_H
  add constraint T_EC_ORDER_H_FK4 foreign key (SHIPPING_INST_H_ID) references T_SHIPPING_INST_H(SHIPPING_INST_H_ID);

alter table T_EC_ORDER_R
  add constraint T_EC_ORDER_R_FK1 foreign key (EC_ORDER_H_ID) references T_EC_ORDER_H(EC_ORDER_H_ID);

alter table T_EC_ORDER_R
  add constraint T_EC_ORDER_R_FK2 foreign key (STATEMENT_OUT_USER_ID) references B_USER(USER_ID);

alter table T_INVENTORY_B
  add constraint T_INVENTORY_B_FK1 foreign key (INVENTORY_UPD_USER_ID) references B_USER(USER_ID);

alter table T_INVENTORY_B
  add constraint T_INVENTORY_B_FK2 foreign key (SHAPE_ID) references M_SHAPE(SHAPE_ID);

alter table T_INVENTORY_B
  add constraint T_INVENTORY_B_FK3 foreign key (STORE_NO_ID) references T_STORE_NO(STORE_NO_ID);

alter table T_INVENTORY_B
  add constraint T_INVENTORY_B_FK4 foreign key (PRODUCT_ID) references M_PRODUCT(PRODUCT_ID);

alter table T_INVENTORY_B
  add constraint T_INVENTORY_B_FK5 foreign key (STOCK_TYPE_ID) references M_STOCK_TYPE(STOCK_TYPE_ID);

alter table T_INVENTORY_B
  add constraint T_INVENTORY_B_FK6 foreign key (LOCATION_ID) references M_LOCATION(LOCATION_ID);

alter table T_INVENTORY_B
  add constraint T_INVENTORY_B_FK7 foreign key (INVENTORY_H_ID) references T_INVENTORY_H(INVENTORY_H_ID);

alter table T_INVENTORY_B
  add constraint T_INVENTORY_B_FK8 foreign key (SUPPLIER_ID) references M_CUSTOMER(CUSTOMER_ID);

alter table T_INVENTORY_B
  add constraint T_INVENTORY_B_FK9 foreign key (WAREHOUSE_ID) references M_WAREHOUSE(WAREHOUSE_ID);

alter table T_INVENTORY_B
  add constraint T_INVENTORY_B_FK10 foreign key (DEPOSIT_ID) references M_CUSTOMER(CUSTOMER_ID);

alter table T_INVENTORY_B
  add constraint T_INVENTORY_B_FK11 foreign key (MOVE_INST_H_ID) references T_MOVE_INST_H(MOVE_INST_H_ID);

alter table T_INVENTORY_B
  add constraint T_INVENTORY_B_FK12 foreign key (INVENTORY_USER_ID) references B_USER(USER_ID);

alter table T_INVENTORY_B
  add constraint T_INVENTORY_B_FK13 foreign key (ACCOUNT_ID) references M_CUSTOMER(CUSTOMER_ID);

alter table T_INVENTORY_B
  add constraint T_INVENTORY_B_FK14 foreign key (STOCK_ID) references T_STOCK(STOCK_ID);

alter table T_INVENTORY_B
  add constraint T_INVENTORY_B_FK15 foreign key (LOT_ID) references T_LOT(LOT_ID);

alter table T_INVENTORY_B
  add constraint T_INVENTORY_B_FK16 foreign key (SALES_ORG_ID) references M_SALES_ORG(SALES_ORG_ID);

alter table T_INVENTORY_H
  add constraint T_INVENTORY_H_FK1 foreign key (CENTER_ID) references M_CENTER(CENTER_ID);

alter table T_INVENTORY_H
  add constraint T_INVENTORY_H_FK2 foreign key (CLIENT_ID) references M_CLIENT(CLIENT_ID);

alter table T_INVENTORY_INP_HIST
  add constraint T_INVENTORY_INP_HIST_FK1 foreign key (INVENTORY_B_ID) references T_INVENTORY_B(INVENTORY_B_ID);

alter table T_INVENTORY_INST
  add constraint T_INVENTORY_INST_FK1 foreign key (INVENTORY_H_ID) references T_INVENTORY_H(INVENTORY_H_ID);

alter table T_INVENTORY_INST
  add constraint T_INVENTORY_INST_FK2 foreign key (ZONE_ID) references M_ZONE(ZONE_ID);

alter table T_INVENTORY_INST
  add constraint T_INVENTORY_INST_FK3 foreign key (DEPOSIT_ID) references M_CUSTOMER(CUSTOMER_ID);

alter table T_INVENTORY_INST
  add constraint T_INVENTORY_INST_FK4 foreign key (STOCK_TYPE_ID) references M_STOCK_TYPE(STOCK_TYPE_ID);

alter table T_INVENTORY_R
  add constraint T_INVENTORY_R_FK1 foreign key (STOCK_DIFF_OUT_USER_ID) references B_USER(USER_ID);

alter table T_INVENTORY_R
  add constraint T_INVENTORY_R_FK2 foreign key (INVENTORY_RECORD_LOC_OUT_USER_ID) references B_USER(USER_ID);

alter table T_INVENTORY_R
  add constraint T_INVENTORY_R_FK3 foreign key (INVENTORY_RECORD_OUT_USER_ID) references B_USER(USER_ID);

alter table T_INVENTORY_R
  add constraint T_INVENTORY_R_FK4 foreign key (INVENTORY_DIFF_OUT_USER_ID) references B_USER(USER_ID);

alter table T_INVENTORY_R
  add constraint T_INVENTORY_R_FK5 foreign key (TWL_OUT_USER_ID) references B_USER(USER_ID);

alter table T_INVENTORY_R
  add constraint T_INVENTORY_R_FK6 foreign key (INVENTORY_B_ID) references T_INVENTORY_B(INVENTORY_B_ID);

alter table T_INVENTORY_RECEIVE_LABEL
  add constraint T_INVENTORY_RECEIVE_LABEL_FK1 foreign key (INVENTORY_B_ID) references T_INVENTORY_B(INVENTORY_B_ID);

alter table T_KEEPING_LOT
  add constraint T_KEEPING_LOT_FK1 foreign key (CUSTOMER_ID) references M_CUSTOMER(CUSTOMER_ID);

alter table T_KEEPING_LOT
  add constraint T_KEEPING_LOT_FK2 foreign key (LOT_ID) references T_LOT(LOT_ID);

alter table T_KEEPING_LOT
  add constraint T_KEEPING_LOT_FK3 foreign key (PRODUCT_ID) references M_PRODUCT(PRODUCT_ID);

alter table T_LAST_LOT
  add constraint T_LAST_LOT_FK1 foreign key (LOT_ID) references T_LOT(LOT_ID);

alter table T_LAST_LOT
  add constraint T_LAST_LOT_FK2 foreign key (PRODUCT_ID) references M_PRODUCT(PRODUCT_ID);

alter table T_LAST_LOT
  add constraint T_LAST_LOT_FK3 foreign key (CUSTOMER_ID) references M_CUSTOMER(CUSTOMER_ID);

alter table T_LOT
  add constraint T_LOT_FK1 foreign key (PRODUCT_ID) references M_PRODUCT(PRODUCT_ID);

alter table T_MOVE_INST_B
  add constraint T_MOVE_INST_B_FK1 foreign key (SHAPE_ID) references M_SHAPE(SHAPE_ID);

alter table T_MOVE_INST_B
  add constraint T_MOVE_INST_B_FK2 foreign key (STOCK_TYPE_ID) references M_STOCK_TYPE(STOCK_TYPE_ID);

alter table T_MOVE_INST_B
  add constraint T_MOVE_INST_B_FK3 foreign key (PRODUCT_ID) references M_PRODUCT(PRODUCT_ID);

alter table T_MOVE_INST_B
  add constraint T_MOVE_INST_B_FK4 foreign key (MOVE_INST_H_ID) references T_MOVE_INST_H(MOVE_INST_H_ID);

alter table T_MOVE_INST_B
  add constraint T_MOVE_INST_B_FK5 foreign key (STORE_NO_ID) references T_STORE_NO(STORE_NO_ID);

alter table T_MOVE_INST_B
  add constraint T_MOVE_INST_B_FK6 foreign key (LOCATION_ID) references M_LOCATION(LOCATION_ID);

alter table T_MOVE_INST_B
  add constraint T_MOVE_INST_B_FK7 foreign key (SUPPLIER_ID) references M_CUSTOMER(CUSTOMER_ID);

alter table T_MOVE_INST_B
  add constraint T_MOVE_INST_B_FK8 foreign key (DEPOSIT_ID) references M_CUSTOMER(CUSTOMER_ID);

alter table T_MOVE_INST_B
  add constraint T_MOVE_INST_B_FK9 foreign key (WAREHOUSE_ID) references M_WAREHOUSE(WAREHOUSE_ID);

alter table T_MOVE_INST_B
  add constraint T_MOVE_INST_B_FK10 foreign key (ACCOUNT_ID) references M_CUSTOMER(CUSTOMER_ID);

alter table T_MOVE_INST_B
  add constraint T_MOVE_INST_B_FK11 foreign key (LOT_ID) references T_LOT(LOT_ID);

alter table T_MOVE_INST_H
  add constraint T_MOVE_INST_H_FK1 foreign key (PROCESS_TYPE_ID) references M_PROCESS_TYPE(PROCESS_TYPE_ID);

alter table T_MOVE_INST_H
  add constraint T_MOVE_INST_H_FK2 foreign key (CLIENT_ID) references M_CLIENT(CLIENT_ID);

alter table T_MOVE_INST_H
  add constraint T_MOVE_INST_H_FK3 foreign key (CENTER_ID) references M_CENTER(CENTER_ID);

alter table T_MOVE_INST_R
  add constraint T_MOVE_INST_R_FK1 foreign key (MOVE_INST_H_ID) references T_MOVE_INST_H(MOVE_INST_H_ID);

alter table T_MOVE_INST_R
  add constraint T_MOVE_INST_R_FK2 foreign key (INST_OUT_USER_ID) references B_USER(USER_ID);

alter table T_MOVE_RECORD_B
  add constraint T_MOVE_RECORD_B_FK1 foreign key (MOVE_INST_B_ID) references T_MOVE_INST_B(MOVE_INST_B_ID);

alter table T_MOVE_RECORD_B
  add constraint T_MOVE_RECORD_B_FK2 foreign key (USER_ID) references B_USER(USER_ID);

alter table T_MOVE_RECORD_B
  add constraint T_MOVE_RECORD_B_FK3 foreign key (MOVE_INST_H_ID) references T_MOVE_INST_H(MOVE_INST_H_ID);

alter table T_MOVE_RECORD_B
  add constraint T_MOVE_RECORD_B_FK4 foreign key (LOCATION_ID) references M_LOCATION(LOCATION_ID);

alter table T_NIZOROE_ALARM_LOG
  add constraint T_NIZOROE_ALARM_LOG_FK1 foreign key (OUT_USER_ID) references B_USER(USER_ID);

alter table T_NIZOROE_ALARM_LOG
  add constraint T_NIZOROE_ALARM_LOG_FK2 foreign key (PRODUCT_ID) references M_PRODUCT(PRODUCT_ID);

alter table T_OPERATION_LOG
  add constraint T_OPERATION_LOG_FK1 foreign key (PRODUCT_ID) references M_PRODUCT(PRODUCT_ID);

alter table T_PACKING_B
  add constraint T_PACKING_B_FK1 foreign key (PACKING_H_ID) references T_PACKING_H(PACKING_H_ID);

alter table T_PACKING_B
  add constraint T_PACKING_B_FK2 foreign key (PICKING_B_ID) references T_PICKING_B(PICKING_B_ID);

alter table T_PACKING_B
  add constraint T_PACKING_B_FK3 foreign key (ALLOC_INST_B_ID) references T_ALLOC_INST_B(ALLOC_INST_B_ID);

alter table T_PACKING_H
  add constraint T_PACKING_H_FK1 foreign key (BOX_ID) references M_BOX(BOX_ID);

alter table T_PACKING_H
  add constraint T_PACKING_H_FK2 foreign key (CLIENT_ID) references M_CLIENT(CLIENT_ID);

alter table T_PACKING_H
  add constraint T_PACKING_H_FK3 foreign key (ALLOC_INST_H_ID) references T_ALLOC_INST_H(ALLOC_INST_H_ID);

alter table T_PACKING_H
  add constraint T_PACKING_H_FK4 foreign key (CENTER_ID) references M_CENTER(CENTER_ID);

alter table T_PACKING_H
  add constraint T_PACKING_H_FK5 foreign key (PICKING_H_ID) references T_PICKING_H(PICKING_H_ID);

alter table T_PACKING_H
  add constraint T_PACKING_H_FK6 foreign key (PROCESS_TYPE_ID) references M_PROCESS_TYPE(PROCESS_TYPE_ID);

alter table T_PACKING_LIST
  add constraint T_PACKING_LIST_FK1 foreign key (CLIENT_ID) references M_CLIENT(CLIENT_ID);

alter table T_PACKING_R
  add constraint T_PACKING_R_FK1 foreign key (PACKING_H_ID) references T_PACKING_H(PACKING_H_ID);

alter table T_PACKING_R
  add constraint T_PACKING_R_FK2 foreign key (STW_OUT_USER_ID) references B_USER(USER_ID);

alter table T_PACKING_R
  add constraint T_PACKING_R_FK3 foreign key (INSPECTION_OUT_USER_ID) references B_USER(USER_ID);

alter table T_PACKING_R
  add constraint T_PACKING_R_FK4 foreign key (TAG_OUT_USER_ID) references B_USER(USER_ID);

alter table T_PIC_MTHD_RCMD
  add constraint T_PIC_MTHD_RCMD_FK1 foreign key (CLIENT_ID) references M_CLIENT(CLIENT_ID);

alter table T_PIC_MTHD_RCMD
  add constraint T_PIC_MTHD_RCMD_FK2 foreign key (CENTER_ID) references M_CENTER(CENTER_ID);

alter table T_PIC_MTHD_RCMD_CART
  add constraint T_PIC_MTHD_RCMD_CART_FK1 foreign key (PIC_MTHD_RCMD_ID) references T_PIC_MTHD_RCMD(PIC_MTHD_RCMD_ID);

alter table T_PIC_MTHD_RCMD_CART
  add constraint T_PIC_MTHD_RCMD_CART_FK2 foreign key (PACKING_H_ID) references T_PACKING_H(PACKING_H_ID);

alter table T_PIC_MTHD_RCMD_DATA
  add constraint T_PIC_MTHD_RCMD_DATA_FK1 foreign key (PIC_MTHD_RCMD_ID) references T_PIC_MTHD_RCMD(PIC_MTHD_RCMD_ID);

alter table T_PIC_MTHD_RCMD_DATA
  add constraint T_PIC_MTHD_RCMD_DATA_FK2 foreign key (PICKING_H_ID) references T_PICKING_H(PICKING_H_ID);

alter table T_PICKING_B
  add constraint T_PICKING_B_FK1 foreign key (STOCK_ID) references T_STOCK(STOCK_ID);

alter table T_PICKING_B
  add constraint T_PICKING_B_FK2 foreign key (ALLOC_INST_B_ID) references T_ALLOC_INST_B(ALLOC_INST_B_ID);

alter table T_PICKING_B
  add constraint T_PICKING_B_FK3 foreign key (PICKING_H_ID) references T_PICKING_H(PICKING_H_ID);

alter table T_PICKING_B
  add constraint T_PICKING_B_FK4 foreign key (SHIPPING_INST_B_ID) references T_SHIPPING_INST_B(SHIPPING_INST_B_ID);

alter table T_PICKING_B
  add constraint T_PICKING_B_FK5 foreign key (SHAPE_ID) references M_SHAPE(SHAPE_ID);

alter table T_PICKING_H
  add constraint T_PICKING_H_FK1 foreign key (ALLOC_INST_H_ID) references T_ALLOC_INST_H(ALLOC_INST_H_ID);

alter table T_PICKING_H
  add constraint T_PICKING_H_FK2 foreign key (CENTER_ID) references M_CENTER(CENTER_ID);

alter table T_PICKING_H
  add constraint T_PICKING_H_FK3 foreign key (PROCESS_TYPE_ID) references M_PROCESS_TYPE(PROCESS_TYPE_ID);

alter table T_PICKING_H
  add constraint T_PICKING_H_FK4 foreign key (CLIENT_ID) references M_CLIENT(CLIENT_ID);

alter table T_PICKING_R
  add constraint T_PICKING_R_FK1 foreign key (NIZOROE_OUT_USER_ID) references B_USER(USER_ID);

alter table T_PICKING_R
  add constraint T_PICKING_R_FK2 foreign key (PLL_OUT_USER_ID) references B_USER(USER_ID);

alter table T_PICKING_R
  add constraint T_PICKING_R_FK3 foreign key (DELIV_OUT_USER_ID) references B_USER(USER_ID);

alter table T_PICKING_R
  add constraint T_PICKING_R_FK4 foreign key (PICKING_H_ID) references T_PICKING_H(PICKING_H_ID);

alter table T_PICKING_R
  add constraint T_PICKING_R_FK5 foreign key (INDV_LABEL_OUT_USER_ID) references B_USER(USER_ID);

alter table T_PICKING_R
  add constraint T_PICKING_R_FK6 foreign key (INDV_SUPPLY_OUT_USER_ID) references B_USER(USER_ID);

alter table T_PICKING_R
  add constraint T_PICKING_R_FK7 foreign key (PACKING_OUT_USER_ID) references B_USER(USER_ID);

alter table T_PICKING_R
  add constraint T_PICKING_R_FK8 foreign key (PL2_OUT_USER_ID) references B_USER(USER_ID);

alter table T_PICKING_R
  add constraint T_PICKING_R_FK9 foreign key (PL1_OUT_USER_ID) references B_USER(USER_ID);

alter table T_PICKING_R
  add constraint T_PICKING_R_FK10 foreign key (BOL_OUT_USER_ID) references B_USER(USER_ID);

alter table T_PICKING_R
  add constraint T_PICKING_R_FK11 foreign key (TAG_OUT_USER_ID) references B_USER(USER_ID);

alter table T_PICKING_R
  add constraint T_PICKING_R_FK12 foreign key (PL_OUT_USER_ID) references B_USER(USER_ID);

alter table T_PICKING_R
  add constraint T_PICKING_R_FK13 foreign key (SHIPPING_RECORD_OUT_USER_ID) references B_USER(USER_ID);

alter table T_PICKING_R
  add constraint T_PICKING_R_FK14 foreign key (CASE_OUT_USER_ID) references B_USER(USER_ID);

alter table T_PICKING_R
  add constraint T_PICKING_R_FK15 foreign key (SLIP_OUT_USER_ID) references B_USER(USER_ID);

alter table T_PICKING_RECORD_STOCK
  add constraint T_PICKING_RECORD_STOCK_FK1 foreign key (PICKING_B_ID) references T_PICKING_B(PICKING_B_ID);

alter table T_PICKING_RECORD_STOCK
  add constraint T_PICKING_RECORD_STOCK_FK2 foreign key (STOCK_ID) references T_STOCK(STOCK_ID);

alter table T_RAKUTEN_ORDER
  add constraint T_RAKUTEN_ORDER_FK1 foreign key (EC_ORDER_B_ID) references T_EC_ORDER_B(EC_ORDER_B_ID);

alter table T_RECEIVE_LABEL
  add constraint T_RECEIVE_LABEL_FK1 foreign key (STOCK_ID) references T_STOCK(STOCK_ID);

alter table T_RECEIVE_LABEL
  add constraint T_RECEIVE_LABEL_FK2 foreign key (RCV_LBL_OUT_USER_ID) references B_USER(USER_ID);

alter table T_RECEIVE_LABEL
  add constraint T_RECEIVE_LABEL_FK3 foreign key (RECEIVE_PLAN_B_ID) references T_RECEIVE_PLAN_B(RECEIVE_PLAN_B_ID);

alter table T_RECEIVE_PLAN_B
  add constraint T_RECEIVE_PLAN_B_FK1 foreign key (PLAN_LOCATION_ID) references M_LOCATION(LOCATION_ID);

alter table T_RECEIVE_PLAN_B
  add constraint T_RECEIVE_PLAN_B_FK2 foreign key (RECEIVE_PLAN_H_ID) references T_RECEIVE_PLAN_H(RECEIVE_PLAN_H_ID);

alter table T_RECEIVE_PLAN_B
  add constraint T_RECEIVE_PLAN_B_FK3 foreign key (PLAN_WAREHOUSE_ID) references M_WAREHOUSE(WAREHOUSE_ID);

alter table T_RECEIVE_PLAN_B
  add constraint T_RECEIVE_PLAN_B_FK4 foreign key (PRODUCT_ID) references M_PRODUCT(PRODUCT_ID);

alter table T_RECEIVE_PLAN_DATA_TRANSFER
  add constraint T_RECEIVE_PLAN_DATA_TRANSFER_FK1 foreign key (RECEIVE_PLAN_B_ID) references T_RECEIVE_PLAN_B(RECEIVE_PLAN_B_ID);

alter table T_RECEIVE_PLAN_H
  add constraint T_RECEIVE_PLAN_H_FK1 foreign key (PICKING_H_ID) references T_PICKING_H(PICKING_H_ID);

alter table T_RECEIVE_PLAN_H
  add constraint T_RECEIVE_PLAN_H_FK2 foreign key (CENTER_ID) references M_CENTER(CENTER_ID);

alter table T_RECEIVE_PLAN_H
  add constraint T_RECEIVE_PLAN_H_FK3 foreign key (OLD_RECEIVE_PLAN_H_ID) references T_RECEIVE_PLAN_H(RECEIVE_PLAN_H_ID);

alter table T_RECEIVE_PLAN_H
  add constraint T_RECEIVE_PLAN_H_FK4 foreign key (PLAN_SUPPLIER_ID) references M_CUSTOMER(CUSTOMER_ID);

alter table T_RECEIVE_PLAN_H
  add constraint T_RECEIVE_PLAN_H_FK5 foreign key (PROCESS_TYPE_ID) references M_PROCESS_TYPE(PROCESS_TYPE_ID);

alter table T_RECEIVE_PLAN_H
  add constraint T_RECEIVE_PLAN_H_FK6 foreign key (CLIENT_ID) references M_CLIENT(CLIENT_ID);

alter table T_RECEIVE_PLAN_H
  add constraint T_RECEIVE_PLAN_H_FK7 foreign key (STOCK_TYPE_ID) references M_STOCK_TYPE(STOCK_TYPE_ID);

alter table T_RECEIVE_PLAN_H
  add constraint T_RECEIVE_PLAN_H_FK8 foreign key (PLAN_DEPOSIT_ID) references M_CUSTOMER(CUSTOMER_ID);

alter table T_RECEIVE_PLAN_R
  add constraint T_RECEIVE_PLAN_R_FK1 foreign key (RPL_OUT_USER_ID) references B_USER(USER_ID);

alter table T_RECEIVE_PLAN_R
  add constraint T_RECEIVE_PLAN_R_FK2 foreign key (RECEIVE_PLAN_H_ID) references T_RECEIVE_PLAN_H(RECEIVE_PLAN_H_ID);

alter table T_RECEIVE_PLAN_SPARE
  add constraint T_RECEIVE_PLAN_SPARE_FK1 foreign key (RECEIVE_PLAN_B_ID) references T_RECEIVE_PLAN_B(RECEIVE_PLAN_B_ID);

alter table T_SCM_LABEL
  add constraint T_SCM_LABEL_FK1 foreign key (STOCK_ID) references T_STOCK(STOCK_ID);

alter table T_SERIAL_NO
  add constraint T_SERIAL_NO_FK1 foreign key (CENTER_ID) references M_CENTER(CENTER_ID);

alter table T_SERIAL_NO
  add constraint T_SERIAL_NO_FK2 foreign key (CLIENT_ID) references M_CLIENT(CLIENT_ID);

alter table T_SERIAL_NO
  add constraint T_SERIAL_NO_FK3 foreign key (PRODUCT_ID) references M_PRODUCT(PRODUCT_ID);

alter table T_SHIPPING_INST_B
  add constraint T_SHIPPING_INST_B_FK1 foreign key (LOCATION_ID) references M_LOCATION(LOCATION_ID);

alter table T_SHIPPING_INST_B
  add constraint T_SHIPPING_INST_B_FK2 foreign key (PRODUCT_ID) references M_PRODUCT(PRODUCT_ID);

alter table T_SHIPPING_INST_B
  add constraint T_SHIPPING_INST_B_FK3 foreign key (STOCK_TYPE_ID) references M_STOCK_TYPE(STOCK_TYPE_ID);

alter table T_SHIPPING_INST_B
  add constraint T_SHIPPING_INST_B_FK4 foreign key (ALLOC_INST_B_ID) references T_ALLOC_INST_B(ALLOC_INST_B_ID);

alter table T_SHIPPING_INST_B
  add constraint T_SHIPPING_INST_B_FK5 foreign key (SHIPPING_INST_H_ID) references T_SHIPPING_INST_H(SHIPPING_INST_H_ID);

alter table T_SHIPPING_INST_B
  add constraint T_SHIPPING_INST_B_FK6 foreign key (STORE_NO_ID) references T_STORE_NO(STORE_NO_ID);

alter table T_SHIPPING_INST_B
  add constraint T_SHIPPING_INST_B_FK7 foreign key (LOT_ID) references T_LOT(LOT_ID);

alter table T_SHIPPING_INST_B
  add constraint T_SHIPPING_INST_B_FK8 foreign key (SHAPE_ID) references M_SHAPE(SHAPE_ID);

alter table T_SHIPPING_INST_B
  add constraint T_SHIPPING_INST_B_FK9 foreign key (DEPOSIT_ID) references M_CUSTOMER(CUSTOMER_ID);

alter table T_SHIPPING_INST_B
  add constraint T_SHIPPING_INST_B_FK10 foreign key (WAREHOUSE_ID) references M_WAREHOUSE(WAREHOUSE_ID);

alter table T_SHIPPING_INST_B_PRINT
  add constraint T_SHIPPING_INST_B_PRINT_FK1 foreign key (SHIPPING_INST_B_ID) references T_SHIPPING_INST_B(SHIPPING_INST_B_ID);

alter table T_SHIPPING_INST_DATA_TRANSFER
  add constraint T_SHIPPING_INST_DATA_TRANSFER_FK1 foreign key (SHIPPING_INST_B_ID) references T_SHIPPING_INST_B(SHIPPING_INST_B_ID);

alter table T_SHIPPING_INST_H
  add constraint T_SHIPPING_INST_H_FK1 foreign key (DELIV_CUSTOMER_ID) references M_CUSTOMER(CUSTOMER_ID);

alter table T_SHIPPING_INST_H
  add constraint T_SHIPPING_INST_H_FK2 foreign key (ALLOC_INST_H_ID) references T_ALLOC_INST_H(ALLOC_INST_H_ID);

alter table T_SHIPPING_INST_H
  add constraint T_SHIPPING_INST_H_FK3 foreign key (DELIVERY_COURSE_ID) references M_DELIVERY_COURSE(DELIVERY_COURSE_ID);

alter table T_SHIPPING_INST_H
  add constraint T_SHIPPING_INST_H_FK4 foreign key (PROCESS_TYPE_ID) references M_PROCESS_TYPE(PROCESS_TYPE_ID);

alter table T_SHIPPING_INST_H
  add constraint T_SHIPPING_INST_H_FK5 foreign key (CLIENT_ID) references M_CLIENT(CLIENT_ID);

alter table T_SHIPPING_INST_H
  add constraint T_SHIPPING_INST_H_FK6 foreign key (SUPPLY_CUSTOMER_ID) references M_CUSTOMER(CUSTOMER_ID);

alter table T_SHIPPING_INST_H
  add constraint T_SHIPPING_INST_H_FK7 foreign key (CENTER_ID) references M_CENTER(CENTER_ID);

alter table T_SHIPPING_INST_H_PRINT
  add constraint T_SHIPPING_INST_H_PRINT_FK1 foreign key (SHIPPING_INST_H_ID) references T_SHIPPING_INST_H(SHIPPING_INST_H_ID);

alter table T_SHIPPING_INST_SPARE
  add constraint T_SHIPPING_INST_SPARE_FK1 foreign key (SHIPPING_INST_B_ID) references T_SHIPPING_INST_B(SHIPPING_INST_B_ID);

alter table T_SHIPPING_PLAN_B
  add constraint T_SHIPPING_PLAN_B_FK1 foreign key (SHIPPING_PLAN_H_ID) references T_SHIPPING_PLAN_H(SHIPPING_PLAN_H_ID);

alter table T_SHIPPING_RECORD_B
  add constraint T_SHIPPING_RECORD_B_FK1 foreign key (SHIPPING_RECORD_H_ID) references T_SHIPPING_RECORD_H(SHIPPING_RECORD_H_ID);

alter table T_SHIPPING_RECORD_H
  add constraint T_SHIPPING_RECORD_H_FK1 foreign key (CLIENT_ID) references M_CLIENT(CLIENT_ID);

alter table T_STOCK
  add constraint T_STOCK_FK1 foreign key (DEPOSIT_ID) references M_CUSTOMER(CUSTOMER_ID);

alter table T_STOCK
  add constraint T_STOCK_FK2 foreign key (LOCATION_ID) references M_LOCATION(LOCATION_ID);

alter table T_STOCK
  add constraint T_STOCK_FK3 foreign key (STOCK_TYPE_ID) references M_STOCK_TYPE(STOCK_TYPE_ID);

alter table T_STOCK
  add constraint T_STOCK_FK4 foreign key (STORE_NO_ID) references T_STORE_NO(STORE_NO_ID);

alter table T_STOCK
  add constraint T_STOCK_FK5 foreign key (LOT_ID) references T_LOT(LOT_ID);

alter table T_STOCK
  add constraint T_STOCK_FK6 foreign key (SHAPE_ID) references M_SHAPE(SHAPE_ID);

alter table T_STOCK
  add constraint T_STOCK_FK7 foreign key (CLIENT_ID) references M_CLIENT(CLIENT_ID);

alter table T_STOCK
  add constraint T_STOCK_FK8 foreign key (WAREHOUSE_ID) references M_WAREHOUSE(WAREHOUSE_ID);

alter table T_STOCK
  add constraint T_STOCK_FK9 foreign key (PRODUCT_ID) references M_PRODUCT(PRODUCT_ID);

alter table T_STOCK_BOOK
  add constraint T_STOCK_BOOK_FK1 foreign key (PRODUCT_ID) references M_PRODUCT(PRODUCT_ID);

alter table T_STOCK_INOUT
  add constraint T_STOCK_INOUT_FK1 foreign key (PROCESS_TYPE_ID) references M_PROCESS_TYPE(PROCESS_TYPE_ID);

alter table T_STOCK_INOUT
  add constraint T_STOCK_INOUT_FK2 foreign key (FS_STOCK_INOUT_ID) references T_STOCK_INOUT(STOCK_INOUT_ID);

alter table T_STOCK_INOUT
  add constraint T_STOCK_INOUT_FK3 foreign key (BF_STOCK_INOUT_ID) references T_STOCK_INOUT(STOCK_INOUT_ID);

alter table T_STOCK_INOUT
  add constraint T_STOCK_INOUT_FK4 foreign key (STORE_RECORD_B_ID) references T_STORE_RECORD_B(STORE_RECORD_B_ID);

alter table T_STOCK_INOUT
  add constraint T_STOCK_INOUT_FK5 foreign key (ALLOC_INST_B_ID) references T_ALLOC_INST_B(ALLOC_INST_B_ID);

alter table T_STOCK_INOUT
  add constraint T_STOCK_INOUT_FK6 foreign key (MOVE_RECORD_B_ID) references T_MOVE_RECORD_B(MOVE_RECORD_B_ID);

alter table T_STOCK_INOUT
  add constraint T_STOCK_INOUT_FK7 foreign key (STOCK_ID) references T_STOCK(STOCK_ID);

alter table T_STOCK_RECORD
  add constraint T_STOCK_RECORD_FK1 foreign key (CLIENT_ID) references M_CLIENT(CLIENT_ID);

alter table T_STOCK_REPORT
  add constraint T_STOCK_REPORT_FK1 foreign key (STOCK_ID) references T_STOCK(STOCK_ID);

alter table T_STORE_NO
  add constraint T_STORE_NO_FK1 foreign key (OLD_STORE_NUM_ID) references T_STORE_NO(STORE_NO_ID);

alter table T_STORE_NO
  add constraint T_STORE_NO_FK2 foreign key (SUPPLIER_ID) references M_CUSTOMER(CUSTOMER_ID);

alter table T_STORE_NO_R
  add constraint T_STORE_NO_R_FK1 foreign key (STORE_NO_ID) references T_STORE_NO(STORE_NO_ID);

alter table T_STORE_NO_R
  add constraint T_STORE_NO_R_FK2 foreign key (TWL_OUT_USER_ID) references B_USER(USER_ID);

alter table T_STORE_RECORD_B
  add constraint T_STORE_RECORD_B_FK1 foreign key (STORE_LOCATION_ID) references M_LOCATION(LOCATION_ID);

alter table T_STORE_RECORD_B
  add constraint T_STORE_RECORD_B_FK2 foreign key (RECEIVE_PLAN_B_ID) references T_RECEIVE_PLAN_B(RECEIVE_PLAN_B_ID);

alter table T_STORE_RECORD_B
  add constraint T_STORE_RECORD_B_FK3 foreign key (STORE_RECORD_H_ID) references T_STORE_RECORD_H(STORE_RECORD_H_ID);

alter table T_STORE_RECORD_H
  add constraint T_STORE_RECORD_H_FK1 foreign key (CLIENT_ID) references M_CLIENT(CLIENT_ID);

alter table T_STORE_RECORD_H
  add constraint T_STORE_RECORD_H_FK2 foreign key (CENTER_ID) references M_CENTER(CENTER_ID);

alter table T_STORE_RECORD_H
  add constraint T_STORE_RECORD_H_FK3 foreign key (RECEIVE_PLAN_H_ID) references T_RECEIVE_PLAN_H(RECEIVE_PLAN_H_ID);

alter table T_STORE_RECORD_H
  add constraint T_STORE_RECORD_H_FK4 foreign key (PROCESS_TYPE_ID) references M_PROCESS_TYPE(PROCESS_TYPE_ID);

alter table T_STORE_RECORD_H
  add constraint T_STORE_RECORD_H_FK5 foreign key (DEPOSIT_ID) references M_CUSTOMER(CUSTOMER_ID);

alter table T_STORE_RECORD_H
  add constraint T_STORE_RECORD_H_FK6 foreign key (STOCK_TYPE_ID) references M_STOCK_TYPE(STOCK_TYPE_ID);

alter table T_STORE_RECORD_H
  add constraint T_STORE_RECORD_H_FK7 foreign key (SUPPLIER_ID) references M_CUSTOMER(CUSTOMER_ID);

alter table T_STORE_RECORD_R
  add constraint T_STORE_RECORD_R_FK1 foreign key (RECEIVE_RECORD_OUT_USER_ID) references B_USER(USER_ID);

alter table T_STORE_RECORD_R
  add constraint T_STORE_RECORD_R_FK2 foreign key (STORE_RECORD_H_ID) references T_STORE_RECORD_H(STORE_RECORD_H_ID);

alter table T_TRANSFER
  add constraint T_TRANSFER_FK1 foreign key (CLIENT_ID) references M_CLIENT(CLIENT_ID);

alter table T_WORK_DATA
  add constraint T_WORK_DATA_FK1 foreign key (WORK_LOG_ID) references T_WORK_LOG(WORK_LOG_ID);

alter table T_YAHOO_ORDER
  add constraint T_YAHOO_ORDER_FK1 foreign key (EC_ORDER_B_ID) references T_EC_ORDER_B(EC_ORDER_B_ID);

alter table W_HT_INVENTORY_INPUT_PROD
  add constraint W_HT_INVENTORY_INPUT_PROD_FK1 foreign key (STOCK_TYPE_ID) references M_STOCK_TYPE(STOCK_TYPE_ID);

alter table W_HT_INVENTORY_INPUT_PROD
  add constraint W_HT_INVENTORY_INPUT_PROD_FK2 foreign key (LOC_ID) references M_LOCATION(LOCATION_ID);

alter table W_HT_INVENTORY_INPUT_PROD
  add constraint W_HT_INVENTORY_INPUT_PROD_FK3 foreign key (WAREHOUSE_ID) references M_WAREHOUSE(WAREHOUSE_ID);

alter table W_HT_INVENTORY_INPUT_PROD
  add constraint W_HT_INVENTORY_INPUT_PROD_FK4 foreign key (CLIENT_ID) references M_CLIENT(CLIENT_ID);

alter table W_HT_INVENTORY_INPUT_PROD
  add constraint W_HT_INVENTORY_INPUT_PROD_FK5 foreign key (LOT_ID) references T_LOT(LOT_ID);

alter table W_HT_INVENTORY_INPUT_PROD
  add constraint W_HT_INVENTORY_INPUT_PROD_FK6 foreign key (PRODUCT_ID) references M_PRODUCT(PRODUCT_ID);

alter table W_HT_INVENTORY_INPUT_PROD
  add constraint W_HT_INVENTORY_INPUT_PROD_FK7 foreign key (CONSIGNMENT_CLS_ID) references M_CUSTOMER(CUSTOMER_ID);

alter table W_HT_INVENTORY_INPUT_PROD
  add constraint W_HT_INVENTORY_INPUT_PROD_FK8 foreign key (CENTER_ID) references M_CENTER(CENTER_ID);

alter table W_HT_LOADING
  add constraint W_HT_LOADING_FK1 foreign key (DELIVERY_COURSE_ID) references M_DELIVERY_COURSE(DELIVERY_COURSE_ID);

alter table W_HT_LOADING
  add constraint W_HT_LOADING_FK2 foreign key (CLIENT_ID) references M_CLIENT(CLIENT_ID);

alter table W_HT_LOADING
  add constraint W_HT_LOADING_FK3 foreign key (CENTER_ID) references M_CENTER(CENTER_ID);

alter table W_HT_PICKING
  add constraint W_HT_PICKING_FK1 foreign key (PRODUCT_ID) references M_PRODUCT(PRODUCT_ID);

alter table W_HT_PICKING
  add constraint W_HT_PICKING_FK2 foreign key (CLIENT_ID) references M_CLIENT(CLIENT_ID);

alter table W_HT_PICKING
  add constraint W_HT_PICKING_FK3 foreign key (CENTER_ID) references M_CENTER(CENTER_ID);

alter table W_HT_PICKING
  add constraint W_HT_PICKING_FK4 foreign key (LOT_ID) references T_LOT(LOT_ID);

alter table W_HT_PICKING
  add constraint W_HT_PICKING_FK5 foreign key (LOCATION_ID) references M_LOCATION(LOCATION_ID);

alter table W_HT_RECEIVE_INSPECTION
  add constraint W_HT_RECEIVE_INSPECTION_FK1 foreign key (PRODUCT_ID) references M_PRODUCT(PRODUCT_ID);

alter table W_HT_RECEIVE_INSPECTION
  add constraint W_HT_RECEIVE_INSPECTION_FK2 foreign key (WAREHOUSE_ID) references M_WAREHOUSE(WAREHOUSE_ID);

alter table W_HT_RECEIVE_INSPECTION
  add constraint W_HT_RECEIVE_INSPECTION_FK3 foreign key (STOCK_TYPE_ID) references M_STOCK_TYPE(STOCK_TYPE_ID);

alter table W_HT_RECEIVE_INSPECTION
  add constraint W_HT_RECEIVE_INSPECTION_FK4 foreign key (LOT_ID) references T_LOT(LOT_ID);

alter table W_HT_RECEIVE_INSPECTION
  add constraint W_HT_RECEIVE_INSPECTION_FK5 foreign key (CENTER_ID) references M_CENTER(CENTER_ID);

alter table W_HT_RECEIVE_INSPECTION
  add constraint W_HT_RECEIVE_INSPECTION_FK6 foreign key (RCV_LOC_ID) references M_LOCATION(LOCATION_ID);

alter table W_HT_RECEIVE_INSPECTION
  add constraint W_HT_RECEIVE_INSPECTION_FK7 foreign key (CLIENT_ID) references M_CLIENT(CLIENT_ID);

alter table W_HT_RECEIVE_NO_PLAN_INSP
  add constraint W_HT_RECEIVE_NO_PLAN_INSP_FK1 foreign key (PRODUCT_ID) references M_PRODUCT(PRODUCT_ID);

alter table W_HT_RECEIVE_NO_PLAN_INSP
  add constraint W_HT_RECEIVE_NO_PLAN_INSP_FK2 foreign key (PROCESS_TYPE_ID) references M_PROCESS_TYPE(PROCESS_TYPE_ID);

alter table W_HT_RECEIVE_NO_PLAN_INSP
  add constraint W_HT_RECEIVE_NO_PLAN_INSP_FK3 foreign key (WAREHOUSE_ID) references M_WAREHOUSE(WAREHOUSE_ID);

alter table W_HT_RECEIVE_NO_PLAN_INSP
  add constraint W_HT_RECEIVE_NO_PLAN_INSP_FK4 foreign key (CENTER_ID) references M_CENTER(CENTER_ID);

alter table W_HT_RECEIVE_NO_PLAN_INSP
  add constraint W_HT_RECEIVE_NO_PLAN_INSP_FK5 foreign key (CLIENT_ID) references M_CLIENT(CLIENT_ID);

alter table W_HT_RECEIVE_NO_PLAN_INSP
  add constraint W_HT_RECEIVE_NO_PLAN_INSP_FK6 foreign key (RCV_LOC_ID) references M_LOCATION(LOCATION_ID);

alter table W_HT_RECEIVE_NO_PLAN_INSP
  add constraint W_HT_RECEIVE_NO_PLAN_INSP_FK7 foreign key (LOT_ID) references T_LOT(LOT_ID);

alter table W_HT_RECEIVE_NO_PLAN_INSP
  add constraint W_HT_RECEIVE_NO_PLAN_INSP_FK8 foreign key (SUPPLIER_ID) references M_CUSTOMER(CUSTOMER_ID);

alter table W_HT_RECEIVE_NO_PLAN_INSP
  add constraint W_HT_RECEIVE_NO_PLAN_INSP_FK9 foreign key (STOCK_TYPE_ID) references M_STOCK_TYPE(STOCK_TYPE_ID);

alter table W_HT_RECEIVE_NO_PLAN_INSP
  add constraint W_HT_RECEIVE_NO_PLAN_INSP_FK10 foreign key (DEPOSIT_ID) references M_CUSTOMER(CUSTOMER_ID);

alter table W_HT_RECEIVE_STORE
  add constraint W_HT_RECEIVE_STORE_FK1 foreign key (LOC_ID) references M_LOCATION(LOCATION_ID);

alter table W_HT_RECEIVE_STORE
  add constraint W_HT_RECEIVE_STORE_FK2 foreign key (CENTER_ID) references M_CENTER(CENTER_ID);

alter table W_HT_RECEIVE_STORE
  add constraint W_HT_RECEIVE_STORE_FK3 foreign key (STOCK_TYPE_ID) references M_STOCK_TYPE(STOCK_TYPE_ID);

alter table W_HT_RECEIVE_STORE
  add constraint W_HT_RECEIVE_STORE_FK4 foreign key (PRODUCT_ID) references M_PRODUCT(PRODUCT_ID);

alter table W_HT_RECEIVE_STORE
  add constraint W_HT_RECEIVE_STORE_FK5 foreign key (WAREHOUSE_ID) references M_WAREHOUSE(WAREHOUSE_ID);

alter table W_HT_RECEIVE_STORE
  add constraint W_HT_RECEIVE_STORE_FK6 foreign key (CLIENT_ID) references M_CLIENT(CLIENT_ID);

alter table W_HT_RECEIVE_STORE
  add constraint W_HT_RECEIVE_STORE_FK7 foreign key (LOT_ID) references T_LOT(LOT_ID);

alter table W_HT_SERIAL_RECEIVE_INSP
  add constraint W_HT_SERIAL_RECEIVE_INSP_FK1 foreign key (CLIENT_ID) references M_CLIENT(CLIENT_ID);

alter table W_HT_SERIAL_RECEIVE_INSP
  add constraint W_HT_SERIAL_RECEIVE_INSP_FK2 foreign key (CENTER_ID) references M_CENTER(CENTER_ID);

alter table W_HT_SERIAL_RECEIVE_INSP
  add constraint W_HT_SERIAL_RECEIVE_INSP_FK3 foreign key (CUSTOMER_ID) references M_CUSTOMER(CUSTOMER_ID);

alter table W_HT_SERIAL_SHIPPING_INSP
  add constraint W_HT_SERIAL_SHIPPING_INSP_FK1 foreign key (CENTER_ID) references M_CENTER(CENTER_ID);

alter table W_HT_SERIAL_SHIPPING_INSP
  add constraint W_HT_SERIAL_SHIPPING_INSP_FK2 foreign key (CUSTOMER_ID) references M_CUSTOMER(CUSTOMER_ID);

alter table W_HT_SERIAL_SHIPPING_INSP
  add constraint W_HT_SERIAL_SHIPPING_INSP_FK3 foreign key (CLIENT_ID) references M_CLIENT(CLIENT_ID);

alter table W_HT_SHIPPING
  add constraint W_HT_SHIPPING_FK1 foreign key (CLIENT_ID) references M_CLIENT(CLIENT_ID);

alter table W_HT_SHIPPING
  add constraint W_HT_SHIPPING_FK2 foreign key (CENTER_ID) references M_CENTER(CENTER_ID);

alter table W_HT_SHIPPING
  add constraint W_HT_SHIPPING_FK3 foreign key (BOX_ID) references M_BOX(BOX_ID);

alter table W_HT_SHIPPING
  add constraint W_HT_SHIPPING_FK4 foreign key (PRODUCT_ID) references M_PRODUCT(PRODUCT_ID);

alter table W_HT_SHIPPING_PICKING
  add constraint W_HT_SHIPPING_PICKING_FK1 foreign key (CLIENT_ID) references M_CLIENT(CLIENT_ID);

alter table W_HT_SHIPPING_PICKING
  add constraint W_HT_SHIPPING_PICKING_FK2 foreign key (CENTER_ID) references M_CENTER(CENTER_ID);

alter table W_HT_SHIPPING_PICKING
  add constraint W_HT_SHIPPING_PICKING_FK3 foreign key (PRODUCT_ID) references M_PRODUCT(PRODUCT_ID);

alter table W_HT_SHIPPING_PICKING
  add constraint W_HT_SHIPPING_PICKING_FK4 foreign key (LOT_ID) references T_LOT(LOT_ID);

alter table W_HT_SHIPPING_PICKING
  add constraint W_HT_SHIPPING_PICKING_FK5 foreign key (LOCATION_ID) references M_LOCATION(LOCATION_ID);

alter table W_HT_TOTAL_PICKING
  add constraint W_HT_TOTAL_PICKING_FK1 foreign key (CENTER_ID) references M_CENTER(CENTER_ID);

alter table W_HT_TOTAL_PICKING
  add constraint W_HT_TOTAL_PICKING_FK2 foreign key (CLIENT_ID) references M_CLIENT(CLIENT_ID);

alter table W_HT_TOTAL_PICKING
  add constraint W_HT_TOTAL_PICKING_FK3 foreign key (PRODUCT_ID) references M_PRODUCT(PRODUCT_ID);

alter table W_HT_TOTAL_PICKING
  add constraint W_HT_TOTAL_PICKING_FK4 foreign key (LOCATION_ID) references M_LOCATION(LOCATION_ID);

alter table W_HT_TOTAL_PICKING
  add constraint W_HT_TOTAL_PICKING_FK5 foreign key (LOT_ID) references T_LOT(LOT_ID);

alter table W_SGL_ROW_SHIP_INSP_B
  add constraint W_SGL_ROW_SHIP_INSP_B_FK1 foreign key (SGL_ROW_SHIP_INSP_H_ID) references W_SGL_ROW_SHIP_INSP_H(SGL_ROW_SHIP_INSP_H_ID);

alter table W_SGL_ROW_SHIP_INSP_B
  add constraint W_SGL_ROW_SHIP_INSP_B_FK2 foreign key (PICKING_H_ID) references T_PICKING_H(PICKING_H_ID);

alter table W_SGL_ROW_SHIP_INSP_B
  add constraint W_SGL_ROW_SHIP_INSP_B_FK3 foreign key (USER_ID) references B_USER(USER_ID);

alter table W_SGL_ROW_SHIP_INSP_H
  add constraint W_SGL_ROW_SHIP_INSP_H_FK1 foreign key (CENTER_ID) references M_CENTER(CENTER_ID);

alter table W_SGL_ROW_SHIP_INSP_H
  add constraint W_SGL_ROW_SHIP_INSP_H_FK2 foreign key (PRODUCT_ID) references M_PRODUCT(PRODUCT_ID);

alter table W_SGL_ROW_SHIP_INSP_H
  add constraint W_SGL_ROW_SHIP_INSP_H_FK3 foreign key (BOX_ID) references M_BOX(BOX_ID);

alter table W_SGL_ROW_SHIP_INSP_H
  add constraint W_SGL_ROW_SHIP_INSP_H_FK4 foreign key (CLIENT_ID) references M_CLIENT(CLIENT_ID);

alter table W_SHIPPING_INTERRUPT
  add constraint W_SHIPPING_INTERRUPT_FK1 foreign key (BOX_ID) references M_BOX(BOX_ID);

alter table W_SHIPPING_INTERRUPT
  add constraint W_SHIPPING_INTERRUPT_FK2 foreign key (PRODUCT_ID) references M_PRODUCT(PRODUCT_ID);

alter table W_SHIPPING_INTERRUPT
  add constraint W_SHIPPING_INTERRUPT_FK3 foreign key (CLIENT_ID) references M_CLIENT(CLIENT_ID);

alter table W_SHIPPING_INTERRUPT
  add constraint W_SHIPPING_INTERRUPT_FK4 foreign key (CENTER_ID) references M_CENTER(CENTER_ID);

