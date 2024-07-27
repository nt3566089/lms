package com.oneslogi.base.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import com.oneslogi.base.dbflute.allcommon.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The DB meta of m_general. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MGeneralDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MGeneralDbm _instance = new MGeneralDbm();
    private MGeneralDbm() {}
    public static MGeneralDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public String getProjectName() { return DBCurrent.getInstance().projectName(); }
    public String getProjectPrefix() { return DBCurrent.getInstance().projectPrefix(); }
    public String getGenerationGapBasePrefix() { return DBCurrent.getInstance().generationGapBasePrefix(); }
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    { xsetupEpg(); }
    protected void xsetupEpg() {
        setupEpg(_epgMap, et -> ((MGeneral)et).getGeneralId(), (et, vl) -> ((MGeneral)et).setGeneralId(ctl(vl)), "generalId");
        setupEpg(_epgMap, et -> ((MGeneral)et).getCenterId(), (et, vl) -> ((MGeneral)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((MGeneral)et).getCenterCd(), (et, vl) -> ((MGeneral)et).setCenterCd((String)vl), "centerCd");
        setupEpg(_epgMap, et -> ((MGeneral)et).getGeneralMasterType(), (et, vl) -> ((MGeneral)et).setGeneralMasterType((String)vl), "generalMasterType");
        setupEpg(_epgMap, et -> ((MGeneral)et).getGeneralMasterTypeNm(), (et, vl) -> ((MGeneral)et).setGeneralMasterTypeNm((String)vl), "generalMasterTypeNm");
        setupEpg(_epgMap, et -> ((MGeneral)et).getGeneralCd(), (et, vl) -> ((MGeneral)et).setGeneralCd((String)vl), "generalCd");
        setupEpg(_epgMap, et -> ((MGeneral)et).getGeneralNm(), (et, vl) -> ((MGeneral)et).setGeneralNm((String)vl), "generalNm");
        setupEpg(_epgMap, et -> ((MGeneral)et).getGeneralAbbr(), (et, vl) -> ((MGeneral)et).setGeneralAbbr((String)vl), "generalAbbr");
        setupEpg(_epgMap, et -> ((MGeneral)et).getCharacter1(), (et, vl) -> ((MGeneral)et).setCharacter1((String)vl), "character1");
        setupEpg(_epgMap, et -> ((MGeneral)et).getCharacter2(), (et, vl) -> ((MGeneral)et).setCharacter2((String)vl), "character2");
        setupEpg(_epgMap, et -> ((MGeneral)et).getCharacter3(), (et, vl) -> ((MGeneral)et).setCharacter3((String)vl), "character3");
        setupEpg(_epgMap, et -> ((MGeneral)et).getCharacter4(), (et, vl) -> ((MGeneral)et).setCharacter4((String)vl), "character4");
        setupEpg(_epgMap, et -> ((MGeneral)et).getCharacter5(), (et, vl) -> ((MGeneral)et).setCharacter5((String)vl), "character5");
        setupEpg(_epgMap, et -> ((MGeneral)et).getCharacter6(), (et, vl) -> ((MGeneral)et).setCharacter6((String)vl), "character6");
        setupEpg(_epgMap, et -> ((MGeneral)et).getCharacter7(), (et, vl) -> ((MGeneral)et).setCharacter7((String)vl), "character7");
        setupEpg(_epgMap, et -> ((MGeneral)et).getCharacter8(), (et, vl) -> ((MGeneral)et).setCharacter8((String)vl), "character8");
        setupEpg(_epgMap, et -> ((MGeneral)et).getCharacter9(), (et, vl) -> ((MGeneral)et).setCharacter9((String)vl), "character9");
        setupEpg(_epgMap, et -> ((MGeneral)et).getCharacter10(), (et, vl) -> ((MGeneral)et).setCharacter10((String)vl), "character10");
        setupEpg(_epgMap, et -> ((MGeneral)et).getNum1(), (et, vl) -> ((MGeneral)et).setNum1(ctb(vl)), "num1");
        setupEpg(_epgMap, et -> ((MGeneral)et).getNum2(), (et, vl) -> ((MGeneral)et).setNum2(ctb(vl)), "num2");
        setupEpg(_epgMap, et -> ((MGeneral)et).getNum3(), (et, vl) -> ((MGeneral)et).setNum3(ctb(vl)), "num3");
        setupEpg(_epgMap, et -> ((MGeneral)et).getNum4(), (et, vl) -> ((MGeneral)et).setNum4(ctb(vl)), "num4");
        setupEpg(_epgMap, et -> ((MGeneral)et).getNum5(), (et, vl) -> ((MGeneral)et).setNum5(ctb(vl)), "num5");
        setupEpg(_epgMap, et -> ((MGeneral)et).getNum6(), (et, vl) -> ((MGeneral)et).setNum6(ctb(vl)), "num6");
        setupEpg(_epgMap, et -> ((MGeneral)et).getNum7(), (et, vl) -> ((MGeneral)et).setNum7(ctb(vl)), "num7");
        setupEpg(_epgMap, et -> ((MGeneral)et).getNum8(), (et, vl) -> ((MGeneral)et).setNum8(ctb(vl)), "num8");
        setupEpg(_epgMap, et -> ((MGeneral)et).getNum9(), (et, vl) -> ((MGeneral)et).setNum9(ctb(vl)), "num9");
        setupEpg(_epgMap, et -> ((MGeneral)et).getNum10(), (et, vl) -> ((MGeneral)et).setNum10(ctb(vl)), "num10");
        setupEpg(_epgMap, et -> ((MGeneral)et).getComment1(), (et, vl) -> ((MGeneral)et).setComment1((String)vl), "comment1");
        setupEpg(_epgMap, et -> ((MGeneral)et).getComment2(), (et, vl) -> ((MGeneral)et).setComment2((String)vl), "comment2");
        setupEpg(_epgMap, et -> ((MGeneral)et).getDefaultType(), (et, vl) -> ((MGeneral)et).setDefaultType((String)vl), "defaultType");
        setupEpg(_epgMap, et -> ((MGeneral)et).getSystemType(), (et, vl) -> ((MGeneral)et).setSystemType((String)vl), "systemType");
        setupEpg(_epgMap, et -> ((MGeneral)et).getDelFlg(), (et, vl) -> ((MGeneral)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((MGeneral)et).getVersionNo(), (et, vl) -> ((MGeneral)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((MGeneral)et).getControlNo(), (et, vl) -> ((MGeneral)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((MGeneral)et).getAddDt(), (et, vl) -> ((MGeneral)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((MGeneral)et).getAddUser(), (et, vl) -> ((MGeneral)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((MGeneral)et).getAddProcess(), (et, vl) -> ((MGeneral)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((MGeneral)et).getUpdDt(), (et, vl) -> ((MGeneral)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((MGeneral)et).getUpdUser(), (et, vl) -> ((MGeneral)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((MGeneral)et).getUpdProcess(), (et, vl) -> ((MGeneral)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((MGeneral)et).getMCenter(), (et, vl) -> ((MGeneral)et).setMCenter((MCenter)vl), "MCenter");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "m_general";
    protected final String _tableDispName = "m_general";
    protected final String _tablePropertyName = "MGeneral";
    protected final TableSqlName _tableSqlName = new TableSqlName("m_general", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnGeneralId = cci("GENERAL_ID", "GENERAL_ID", null, null, Long.class, "generalId", null, true, true, true, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, true, "BIGINT", 19, 0, null, null, false, null, null, "MCenter", null, null, false);
    protected final ColumnInfo _columnCenterCd = cci("CENTER_CD", "CENTER_CD", null, null, String.class, "centerCd", null, false, false, false, "VARCHAR", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnGeneralMasterType = cci("GENERAL_MASTER_TYPE", "GENERAL_MASTER_TYPE", null, null, String.class, "generalMasterType", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnGeneralMasterTypeNm = cci("GENERAL_MASTER_TYPE_NM", "GENERAL_MASTER_TYPE_NM", null, null, String.class, "generalMasterTypeNm", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnGeneralCd = cci("GENERAL_CD", "GENERAL_CD", null, null, String.class, "generalCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnGeneralNm = cci("GENERAL_NM", "GENERAL_NM", null, null, String.class, "generalNm", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnGeneralAbbr = cci("GENERAL_ABBR", "GENERAL_ABBR", null, null, String.class, "generalAbbr", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCharacter1 = cci("CHARACTER1", "CHARACTER1", null, null, String.class, "character1", null, false, false, false, "VARCHAR", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCharacter2 = cci("CHARACTER2", "CHARACTER2", null, null, String.class, "character2", null, false, false, false, "VARCHAR", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCharacter3 = cci("CHARACTER3", "CHARACTER3", null, null, String.class, "character3", null, false, false, false, "VARCHAR", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCharacter4 = cci("CHARACTER4", "CHARACTER4", null, null, String.class, "character4", null, false, false, false, "VARCHAR", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCharacter5 = cci("CHARACTER5", "CHARACTER5", null, null, String.class, "character5", null, false, false, false, "VARCHAR", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCharacter6 = cci("CHARACTER6", "CHARACTER6", null, null, String.class, "character6", null, false, false, false, "VARCHAR", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCharacter7 = cci("CHARACTER7", "CHARACTER7", null, null, String.class, "character7", null, false, false, false, "VARCHAR", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCharacter8 = cci("CHARACTER8", "CHARACTER8", null, null, String.class, "character8", null, false, false, false, "VARCHAR", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCharacter9 = cci("CHARACTER9", "CHARACTER9", null, null, String.class, "character9", null, false, false, false, "VARCHAR", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCharacter10 = cci("CHARACTER10", "CHARACTER10", null, null, String.class, "character10", null, false, false, false, "VARCHAR", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNum1 = cci("NUM1", "NUM1", null, null, java.math.BigDecimal.class, "num1", null, false, false, false, "DECIMAL", 14, 4, null, "0.0000", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNum2 = cci("NUM2", "NUM2", null, null, java.math.BigDecimal.class, "num2", null, false, false, false, "DECIMAL", 14, 4, null, "0.0000", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNum3 = cci("NUM3", "NUM3", null, null, java.math.BigDecimal.class, "num3", null, false, false, false, "DECIMAL", 14, 4, null, "0.0000", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNum4 = cci("NUM4", "NUM4", null, null, java.math.BigDecimal.class, "num4", null, false, false, false, "DECIMAL", 14, 4, null, "0.0000", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNum5 = cci("NUM5", "NUM5", null, null, java.math.BigDecimal.class, "num5", null, false, false, false, "DECIMAL", 14, 4, null, "0.0000", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNum6 = cci("NUM6", "NUM6", null, null, java.math.BigDecimal.class, "num6", null, false, false, false, "DECIMAL", 14, 4, null, "0.0000", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNum7 = cci("NUM7", "NUM7", null, null, java.math.BigDecimal.class, "num7", null, false, false, false, "DECIMAL", 14, 4, null, "0.0000", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNum8 = cci("NUM8", "NUM8", null, null, java.math.BigDecimal.class, "num8", null, false, false, false, "DECIMAL", 14, 4, null, "0.0000", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNum9 = cci("NUM9", "NUM9", null, null, java.math.BigDecimal.class, "num9", null, false, false, false, "DECIMAL", 14, 4, null, "0.0000", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNum10 = cci("NUM10", "NUM10", null, null, java.math.BigDecimal.class, "num10", null, false, false, false, "DECIMAL", 14, 4, null, "0.0000", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnComment1 = cci("COMMENT1", "COMMENT1", null, null, String.class, "comment1", null, false, false, false, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnComment2 = cci("COMMENT2", "COMMENT2", null, null, String.class, "comment2", null, false, false, false, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDefaultType = cci("DEFAULT_TYPE", "DEFAULT_TYPE", null, null, String.class, "defaultType", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSystemType = cci("SYSTEM_TYPE", "SYSTEM_TYPE", null, null, String.class, "systemType", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelFlg = cci("DEL_FLG", "DEL_FLG", null, null, String.class, "delFlg", null, false, false, true, "CHAR", 1, 0, null, "0", true, null, null, null, null, CDef.DefMeta.DelFlg, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, null, Long.class, "versionNo", null, false, false, true, "BIGINT", 19, 0, null, "0", true, OptimisticLockType.VERSION_NO, null, null, null, null, false);
    protected final ColumnInfo _columnControlNo = cci("CONTROL_NO", "CONTROL_NO", null, null, Long.class, "controlNo", null, false, false, false, "BIGINT", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddDt = cci("ADD_DT", "ADD_DT", null, null, java.sql.Timestamp.class, "addDt", null, false, false, false, "DATETIME", 19, 0, 3, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddUser = cci("ADD_USER", "ADD_USER", null, null, String.class, "addUser", null, false, false, false, "VARCHAR", 60, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddProcess = cci("ADD_PROCESS", "ADD_PROCESS", null, null, String.class, "addProcess", null, false, false, false, "VARCHAR", 255, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdDt = cci("UPD_DT", "UPD_DT", null, null, java.sql.Timestamp.class, "updDt", null, false, false, false, "DATETIME", 19, 0, 3, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdUser = cci("UPD_USER", "UPD_USER", null, null, String.class, "updUser", null, false, false, false, "VARCHAR", 60, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdProcess = cci("UPD_PROCESS", "UPD_PROCESS", null, null, String.class, "updProcess", null, false, false, false, "VARCHAR", 255, 0, null, null, true, null, null, null, null, null, false);

    /**
     * GENERAL_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGeneralId() { return _columnGeneralId; }
    /**
     * CENTER_ID: {+UQ, IX, NotNull, BIGINT(19), FK to m_center}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterId() { return _columnCenterId; }
    /**
     * CENTER_CD: {VARCHAR(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterCd() { return _columnCenterCd; }
    /**
     * GENERAL_MASTER_TYPE: {UQ+, VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGeneralMasterType() { return _columnGeneralMasterType; }
    /**
     * GENERAL_MASTER_TYPE_NM: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGeneralMasterTypeNm() { return _columnGeneralMasterTypeNm; }
    /**
     * GENERAL_CD: {+UQ, VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGeneralCd() { return _columnGeneralCd; }
    /**
     * GENERAL_NM: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGeneralNm() { return _columnGeneralNm; }
    /**
     * GENERAL_ABBR: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGeneralAbbr() { return _columnGeneralAbbr; }
    /**
     * CHARACTER1: {VARCHAR(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCharacter1() { return _columnCharacter1; }
    /**
     * CHARACTER2: {VARCHAR(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCharacter2() { return _columnCharacter2; }
    /**
     * CHARACTER3: {VARCHAR(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCharacter3() { return _columnCharacter3; }
    /**
     * CHARACTER4: {VARCHAR(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCharacter4() { return _columnCharacter4; }
    /**
     * CHARACTER5: {VARCHAR(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCharacter5() { return _columnCharacter5; }
    /**
     * CHARACTER6: {VARCHAR(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCharacter6() { return _columnCharacter6; }
    /**
     * CHARACTER7: {VARCHAR(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCharacter7() { return _columnCharacter7; }
    /**
     * CHARACTER8: {VARCHAR(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCharacter8() { return _columnCharacter8; }
    /**
     * CHARACTER9: {VARCHAR(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCharacter9() { return _columnCharacter9; }
    /**
     * CHARACTER10: {VARCHAR(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCharacter10() { return _columnCharacter10; }
    /**
     * NUM1: {DECIMAL(14, 4), default=[0.0000]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNum1() { return _columnNum1; }
    /**
     * NUM2: {DECIMAL(14, 4), default=[0.0000]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNum2() { return _columnNum2; }
    /**
     * NUM3: {DECIMAL(14, 4), default=[0.0000]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNum3() { return _columnNum3; }
    /**
     * NUM4: {DECIMAL(14, 4), default=[0.0000]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNum4() { return _columnNum4; }
    /**
     * NUM5: {DECIMAL(14, 4), default=[0.0000]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNum5() { return _columnNum5; }
    /**
     * NUM6: {DECIMAL(14, 4), default=[0.0000]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNum6() { return _columnNum6; }
    /**
     * NUM7: {DECIMAL(14, 4), default=[0.0000]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNum7() { return _columnNum7; }
    /**
     * NUM8: {DECIMAL(14, 4), default=[0.0000]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNum8() { return _columnNum8; }
    /**
     * NUM9: {DECIMAL(14, 4), default=[0.0000]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNum9() { return _columnNum9; }
    /**
     * NUM10: {DECIMAL(14, 4), default=[0.0000]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNum10() { return _columnNum10; }
    /**
     * COMMENT1: {VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnComment1() { return _columnComment1; }
    /**
     * COMMENT2: {VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnComment2() { return _columnComment2; }
    /**
     * DEFAULT_TYPE: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDefaultType() { return _columnDefaultType; }
    /**
     * SYSTEM_TYPE: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSystemType() { return _columnSystemType; }
    /**
     * DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelFlg() { return _columnDelFlg; }
    /**
     * VERSION_NO: {NotNull, BIGINT(19), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVersionNo() { return _columnVersionNo; }
    /**
     * CONTROL_NO: {IX, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnControlNo() { return _columnControlNo; }
    /**
     * ADD_DT: {DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAddDt() { return _columnAddDt; }
    /**
     * ADD_USER: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAddUser() { return _columnAddUser; }
    /**
     * ADD_PROCESS: {VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAddProcess() { return _columnAddProcess; }
    /**
     * UPD_DT: {DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdDt() { return _columnUpdDt; }
    /**
     * UPD_USER: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdUser() { return _columnUpdUser; }
    /**
     * UPD_PROCESS: {VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdProcess() { return _columnUpdProcess; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnGeneralId());
        ls.add(columnCenterId());
        ls.add(columnCenterCd());
        ls.add(columnGeneralMasterType());
        ls.add(columnGeneralMasterTypeNm());
        ls.add(columnGeneralCd());
        ls.add(columnGeneralNm());
        ls.add(columnGeneralAbbr());
        ls.add(columnCharacter1());
        ls.add(columnCharacter2());
        ls.add(columnCharacter3());
        ls.add(columnCharacter4());
        ls.add(columnCharacter5());
        ls.add(columnCharacter6());
        ls.add(columnCharacter7());
        ls.add(columnCharacter8());
        ls.add(columnCharacter9());
        ls.add(columnCharacter10());
        ls.add(columnNum1());
        ls.add(columnNum2());
        ls.add(columnNum3());
        ls.add(columnNum4());
        ls.add(columnNum5());
        ls.add(columnNum6());
        ls.add(columnNum7());
        ls.add(columnNum8());
        ls.add(columnNum9());
        ls.add(columnNum10());
        ls.add(columnComment1());
        ls.add(columnComment2());
        ls.add(columnDefaultType());
        ls.add(columnSystemType());
        ls.add(columnDelFlg());
        ls.add(columnVersionNo());
        ls.add(columnControlNo());
        ls.add(columnAddDt());
        ls.add(columnAddUser());
        ls.add(columnAddProcess());
        ls.add(columnUpdDt());
        ls.add(columnUpdUser());
        ls.add(columnUpdProcess());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnGeneralId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnGeneralMasterType());
        ls.add(columnGeneralCd());
        ls.add(columnCenterId());
        return hpcui(ls);
    }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * m_center by my CENTER_ID, named 'MCenter'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMCenter() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), MCenterDbm.getInstance().columnCenterId());
        return cfi("M_GENERAL_FK1", "MCenter", this, MCenterDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "MGeneralList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasIdentity() { return true; }
    public boolean hasVersionNo() { return true; }
    public ColumnInfo getVersionNoColumnInfo() { return _columnVersionNo; }
    public boolean hasCommonColumn() { return true; }
    public List<ColumnInfo> getCommonColumnInfoList()
    { return newArrayList(columnDelFlg(), columnVersionNo(), columnControlNo(), columnAddDt(), columnAddUser(), columnAddProcess(), columnUpdDt(), columnUpdUser(), columnUpdProcess()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeInsertList()
    { return newArrayList(columnDelFlg(), columnAddDt(), columnAddUser(), columnAddProcess(), columnUpdDt(), columnUpdUser(), columnUpdProcess()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeUpdateList()
    { return newArrayList(columnUpdDt(), columnUpdUser(), columnUpdProcess()); }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.MGeneral"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.MGeneralCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.MGeneralBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<MGeneral> getEntityType() { return MGeneral.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public MGeneral newEntity() { return new MGeneral(); }
    public MGeneral newMyEntity() { return new MGeneral(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((MGeneral)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((MGeneral)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
