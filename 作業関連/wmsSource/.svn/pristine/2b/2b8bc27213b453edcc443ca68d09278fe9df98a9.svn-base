package com.oneslogi.base.dbflute.cbean.cq.bs;

import java.util.*;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.ordering.*;
import org.dbflute.cbean.scoping.*;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.dbmeta.DBMetaProvider;
import com.oneslogi.base.dbflute.allcommon.*;
import com.oneslogi.base.dbflute.cbean.*;
import com.oneslogi.base.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of t_picking_record_stock.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTPickingRecordStockCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTPickingRecordStockCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    @Override
    protected DBMetaProvider xgetDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider();
    }

    public String asTableDbName() {
        return "t_picking_record_stock";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_RECORD_STOCK_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param pickingRecordStockId The value of pickingRecordStockId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingRecordStockId_Equal(Long pickingRecordStockId) {
        doSetPickingRecordStockId_Equal(pickingRecordStockId);
    }

    protected void doSetPickingRecordStockId_Equal(Long pickingRecordStockId) {
        regPickingRecordStockId(CK_EQ, pickingRecordStockId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_RECORD_STOCK_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param pickingRecordStockId The value of pickingRecordStockId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingRecordStockId_NotEqual(Long pickingRecordStockId) {
        doSetPickingRecordStockId_NotEqual(pickingRecordStockId);
    }

    protected void doSetPickingRecordStockId_NotEqual(Long pickingRecordStockId) {
        regPickingRecordStockId(CK_NES, pickingRecordStockId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_RECORD_STOCK_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param pickingRecordStockId The value of pickingRecordStockId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingRecordStockId_GreaterThan(Long pickingRecordStockId) {
        regPickingRecordStockId(CK_GT, pickingRecordStockId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_RECORD_STOCK_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param pickingRecordStockId The value of pickingRecordStockId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingRecordStockId_LessThan(Long pickingRecordStockId) {
        regPickingRecordStockId(CK_LT, pickingRecordStockId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_RECORD_STOCK_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param pickingRecordStockId The value of pickingRecordStockId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingRecordStockId_GreaterEqual(Long pickingRecordStockId) {
        regPickingRecordStockId(CK_GE, pickingRecordStockId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_RECORD_STOCK_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param pickingRecordStockId The value of pickingRecordStockId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingRecordStockId_LessEqual(Long pickingRecordStockId) {
        regPickingRecordStockId(CK_LE, pickingRecordStockId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_RECORD_STOCK_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of pickingRecordStockId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of pickingRecordStockId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPickingRecordStockId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePickingRecordStockId(), "PICKING_RECORD_STOCK_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICKING_RECORD_STOCK_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param pickingRecordStockIdList The collection of pickingRecordStockId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingRecordStockId_InScope(Collection<Long> pickingRecordStockIdList) {
        doSetPickingRecordStockId_InScope(pickingRecordStockIdList);
    }

    protected void doSetPickingRecordStockId_InScope(Collection<Long> pickingRecordStockIdList) {
        regINS(CK_INS, cTL(pickingRecordStockIdList), xgetCValuePickingRecordStockId(), "PICKING_RECORD_STOCK_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICKING_RECORD_STOCK_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param pickingRecordStockIdList The collection of pickingRecordStockId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingRecordStockId_NotInScope(Collection<Long> pickingRecordStockIdList) {
        doSetPickingRecordStockId_NotInScope(pickingRecordStockIdList);
    }

    protected void doSetPickingRecordStockId_NotInScope(Collection<Long> pickingRecordStockIdList) {
        regINS(CK_NINS, cTL(pickingRecordStockIdList), xgetCValuePickingRecordStockId(), "PICKING_RECORD_STOCK_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PICKING_RECORD_STOCK_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setPickingRecordStockId_IsNull() { regPickingRecordStockId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PICKING_RECORD_STOCK_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setPickingRecordStockId_IsNotNull() { regPickingRecordStockId(CK_ISNN, DOBJ); }

    protected void regPickingRecordStockId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePickingRecordStockId(), "PICKING_RECORD_STOCK_ID"); }
    protected abstract ConditionValue xgetCValuePickingRecordStockId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_B_ID: {IX, BIGINT(19), FK to t_picking_b}
     * @param pickingBId The value of pickingBId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingBId_Equal(Long pickingBId) {
        doSetPickingBId_Equal(pickingBId);
    }

    protected void doSetPickingBId_Equal(Long pickingBId) {
        regPickingBId(CK_EQ, pickingBId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_B_ID: {IX, BIGINT(19), FK to t_picking_b}
     * @param pickingBId The value of pickingBId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingBId_NotEqual(Long pickingBId) {
        doSetPickingBId_NotEqual(pickingBId);
    }

    protected void doSetPickingBId_NotEqual(Long pickingBId) {
        regPickingBId(CK_NES, pickingBId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_B_ID: {IX, BIGINT(19), FK to t_picking_b}
     * @param pickingBId The value of pickingBId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingBId_GreaterThan(Long pickingBId) {
        regPickingBId(CK_GT, pickingBId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_B_ID: {IX, BIGINT(19), FK to t_picking_b}
     * @param pickingBId The value of pickingBId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingBId_LessThan(Long pickingBId) {
        regPickingBId(CK_LT, pickingBId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_B_ID: {IX, BIGINT(19), FK to t_picking_b}
     * @param pickingBId The value of pickingBId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingBId_GreaterEqual(Long pickingBId) {
        regPickingBId(CK_GE, pickingBId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_B_ID: {IX, BIGINT(19), FK to t_picking_b}
     * @param pickingBId The value of pickingBId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingBId_LessEqual(Long pickingBId) {
        regPickingBId(CK_LE, pickingBId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_B_ID: {IX, BIGINT(19), FK to t_picking_b}
     * @param minNumber The min number of pickingBId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of pickingBId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPickingBId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePickingBId(), "PICKING_B_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICKING_B_ID: {IX, BIGINT(19), FK to t_picking_b}
     * @param pickingBIdList The collection of pickingBId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingBId_InScope(Collection<Long> pickingBIdList) {
        doSetPickingBId_InScope(pickingBIdList);
    }

    protected void doSetPickingBId_InScope(Collection<Long> pickingBIdList) {
        regINS(CK_INS, cTL(pickingBIdList), xgetCValuePickingBId(), "PICKING_B_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICKING_B_ID: {IX, BIGINT(19), FK to t_picking_b}
     * @param pickingBIdList The collection of pickingBId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingBId_NotInScope(Collection<Long> pickingBIdList) {
        doSetPickingBId_NotInScope(pickingBIdList);
    }

    protected void doSetPickingBId_NotInScope(Collection<Long> pickingBIdList) {
        regINS(CK_NINS, cTL(pickingBIdList), xgetCValuePickingBId(), "PICKING_B_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select PICKING_B_ID from t_picking_b where ...)} <br />
     * t_picking_b by my PICKING_B_ID, named 'TPickingB'.
     * @param subCBLambda The callback for sub-query of TPickingB for 'in-scope'. (NotNull)
     */
    public void inScopeTPickingB(SubQuery<TPickingBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPickingBCB cb = new TPickingBCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepPickingBId_InScopeRelation_TPickingB(cb.query());
        registerInScopeRelation(cb.query(), "PICKING_B_ID", "PICKING_B_ID", pp, "tPickingB", false);
    }
    public abstract String keepPickingBId_InScopeRelation_TPickingB(TPickingBCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select PICKING_B_ID from t_picking_b where ...)} <br />
     * t_picking_b by my PICKING_B_ID, named 'TPickingB'.
     * @param subCBLambda The callback for sub-query of TPickingB for 'not in-scope'. (NotNull)
     */
    public void notInScopeTPickingB(SubQuery<TPickingBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPickingBCB cb = new TPickingBCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepPickingBId_NotInScopeRelation_TPickingB(cb.query());
        registerInScopeRelation(cb.query(), "PICKING_B_ID", "PICKING_B_ID", pp, "tPickingB", true);
    }
    public abstract String keepPickingBId_NotInScopeRelation_TPickingB(TPickingBCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PICKING_B_ID: {IX, BIGINT(19), FK to t_picking_b}
     */
    public void setPickingBId_IsNull() { regPickingBId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PICKING_B_ID: {IX, BIGINT(19), FK to t_picking_b}
     */
    public void setPickingBId_IsNotNull() { regPickingBId(CK_ISNN, DOBJ); }

    protected void regPickingBId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePickingBId(), "PICKING_B_ID"); }
    protected abstract ConditionValue xgetCValuePickingBId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_ID: {IX, BIGINT(19), FK to t_stock}
     * @param stockId The value of stockId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockId_Equal(Long stockId) {
        doSetStockId_Equal(stockId);
    }

    protected void doSetStockId_Equal(Long stockId) {
        regStockId(CK_EQ, stockId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_ID: {IX, BIGINT(19), FK to t_stock}
     * @param stockId The value of stockId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockId_NotEqual(Long stockId) {
        doSetStockId_NotEqual(stockId);
    }

    protected void doSetStockId_NotEqual(Long stockId) {
        regStockId(CK_NES, stockId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_ID: {IX, BIGINT(19), FK to t_stock}
     * @param stockId The value of stockId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockId_GreaterThan(Long stockId) {
        regStockId(CK_GT, stockId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_ID: {IX, BIGINT(19), FK to t_stock}
     * @param stockId The value of stockId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockId_LessThan(Long stockId) {
        regStockId(CK_LT, stockId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_ID: {IX, BIGINT(19), FK to t_stock}
     * @param stockId The value of stockId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockId_GreaterEqual(Long stockId) {
        regStockId(CK_GE, stockId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_ID: {IX, BIGINT(19), FK to t_stock}
     * @param stockId The value of stockId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockId_LessEqual(Long stockId) {
        regStockId(CK_LE, stockId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_ID: {IX, BIGINT(19), FK to t_stock}
     * @param minNumber The min number of stockId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of stockId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setStockId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueStockId(), "STOCK_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STOCK_ID: {IX, BIGINT(19), FK to t_stock}
     * @param stockIdList The collection of stockId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockId_InScope(Collection<Long> stockIdList) {
        doSetStockId_InScope(stockIdList);
    }

    protected void doSetStockId_InScope(Collection<Long> stockIdList) {
        regINS(CK_INS, cTL(stockIdList), xgetCValueStockId(), "STOCK_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STOCK_ID: {IX, BIGINT(19), FK to t_stock}
     * @param stockIdList The collection of stockId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockId_NotInScope(Collection<Long> stockIdList) {
        doSetStockId_NotInScope(stockIdList);
    }

    protected void doSetStockId_NotInScope(Collection<Long> stockIdList) {
        regINS(CK_NINS, cTL(stockIdList), xgetCValueStockId(), "STOCK_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select STOCK_ID from t_stock where ...)} <br />
     * t_stock by my STOCK_ID, named 'TStock'.
     * @param subCBLambda The callback for sub-query of TStock for 'in-scope'. (NotNull)
     */
    public void inScopeTStock(SubQuery<TStockCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TStockCB cb = new TStockCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepStockId_InScopeRelation_TStock(cb.query());
        registerInScopeRelation(cb.query(), "STOCK_ID", "STOCK_ID", pp, "tStock", false);
    }
    public abstract String keepStockId_InScopeRelation_TStock(TStockCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select STOCK_ID from t_stock where ...)} <br />
     * t_stock by my STOCK_ID, named 'TStock'.
     * @param subCBLambda The callback for sub-query of TStock for 'not in-scope'. (NotNull)
     */
    public void notInScopeTStock(SubQuery<TStockCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TStockCB cb = new TStockCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepStockId_NotInScopeRelation_TStock(cb.query());
        registerInScopeRelation(cb.query(), "STOCK_ID", "STOCK_ID", pp, "tStock", true);
    }
    public abstract String keepStockId_NotInScopeRelation_TStock(TStockCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STOCK_ID: {IX, BIGINT(19), FK to t_stock}
     */
    public void setStockId_IsNull() { regStockId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STOCK_ID: {IX, BIGINT(19), FK to t_stock}
     */
    public void setStockId_IsNotNull() { regStockId(CK_ISNN, DOBJ); }

    protected void regStockId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStockId(), "STOCK_ID"); }
    protected abstract ConditionValue xgetCValueStockId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_NUM: {BIGINT(19)}
     * @param pickingNum The value of pickingNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingNum_Equal(Long pickingNum) {
        doSetPickingNum_Equal(pickingNum);
    }

    protected void doSetPickingNum_Equal(Long pickingNum) {
        regPickingNum(CK_EQ, pickingNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_NUM: {BIGINT(19)}
     * @param pickingNum The value of pickingNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingNum_NotEqual(Long pickingNum) {
        doSetPickingNum_NotEqual(pickingNum);
    }

    protected void doSetPickingNum_NotEqual(Long pickingNum) {
        regPickingNum(CK_NES, pickingNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_NUM: {BIGINT(19)}
     * @param pickingNum The value of pickingNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingNum_GreaterThan(Long pickingNum) {
        regPickingNum(CK_GT, pickingNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_NUM: {BIGINT(19)}
     * @param pickingNum The value of pickingNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingNum_LessThan(Long pickingNum) {
        regPickingNum(CK_LT, pickingNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_NUM: {BIGINT(19)}
     * @param pickingNum The value of pickingNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingNum_GreaterEqual(Long pickingNum) {
        regPickingNum(CK_GE, pickingNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_NUM: {BIGINT(19)}
     * @param pickingNum The value of pickingNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingNum_LessEqual(Long pickingNum) {
        regPickingNum(CK_LE, pickingNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_NUM: {BIGINT(19)}
     * @param minNumber The min number of pickingNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of pickingNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPickingNum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePickingNum(), "PICKING_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICKING_NUM: {BIGINT(19)}
     * @param pickingNumList The collection of pickingNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingNum_InScope(Collection<Long> pickingNumList) {
        doSetPickingNum_InScope(pickingNumList);
    }

    protected void doSetPickingNum_InScope(Collection<Long> pickingNumList) {
        regINS(CK_INS, cTL(pickingNumList), xgetCValuePickingNum(), "PICKING_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICKING_NUM: {BIGINT(19)}
     * @param pickingNumList The collection of pickingNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingNum_NotInScope(Collection<Long> pickingNumList) {
        doSetPickingNum_NotInScope(pickingNumList);
    }

    protected void doSetPickingNum_NotInScope(Collection<Long> pickingNumList) {
        regINS(CK_NINS, cTL(pickingNumList), xgetCValuePickingNum(), "PICKING_NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PICKING_NUM: {BIGINT(19)}
     */
    public void setPickingNum_IsNull() { regPickingNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PICKING_NUM: {BIGINT(19)}
     */
    public void setPickingNum_IsNotNull() { regPickingNum(CK_ISNN, DOBJ); }

    protected void regPickingNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePickingNum(), "PICKING_NUM"); }
    protected abstract ConditionValue xgetCValuePickingNum();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * 在庫調整済フラグ: {CHAR(1)}
     * @param 在庫調整済フラグ The value of 在庫調整済フラグ as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void set在庫調整済フラグ_Equal(String 在庫調整済フラグ) {
        doSet在庫調整済フラグ_Equal(fRES(在庫調整済フラグ));
    }

    protected void doSet在庫調整済フラグ_Equal(String 在庫調整済フラグ) {
        reg在庫調整済フラグ(CK_EQ, 在庫調整済フラグ);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * 在庫調整済フラグ: {CHAR(1)}
     * @param 在庫調整済フラグ The value of 在庫調整済フラグ as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void set在庫調整済フラグ_NotEqual(String 在庫調整済フラグ) {
        doSet在庫調整済フラグ_NotEqual(fRES(在庫調整済フラグ));
    }

    protected void doSet在庫調整済フラグ_NotEqual(String 在庫調整済フラグ) {
        reg在庫調整済フラグ(CK_NES, 在庫調整済フラグ);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * 在庫調整済フラグ: {CHAR(1)}
     * @param 在庫調整済フラグ The value of 在庫調整済フラグ as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void set在庫調整済フラグ_GreaterThan(String 在庫調整済フラグ) {
        reg在庫調整済フラグ(CK_GT, fRES(在庫調整済フラグ));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * 在庫調整済フラグ: {CHAR(1)}
     * @param 在庫調整済フラグ The value of 在庫調整済フラグ as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void set在庫調整済フラグ_LessThan(String 在庫調整済フラグ) {
        reg在庫調整済フラグ(CK_LT, fRES(在庫調整済フラグ));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * 在庫調整済フラグ: {CHAR(1)}
     * @param 在庫調整済フラグ The value of 在庫調整済フラグ as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void set在庫調整済フラグ_GreaterEqual(String 在庫調整済フラグ) {
        reg在庫調整済フラグ(CK_GE, fRES(在庫調整済フラグ));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * 在庫調整済フラグ: {CHAR(1)}
     * @param 在庫調整済フラグ The value of 在庫調整済フラグ as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void set在庫調整済フラグ_LessEqual(String 在庫調整済フラグ) {
        reg在庫調整済フラグ(CK_LE, fRES(在庫調整済フラグ));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * 在庫調整済フラグ: {CHAR(1)}
     * @param 在庫調整済フラグList The collection of 在庫調整済フラグ as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void set在庫調整済フラグ_InScope(Collection<String> 在庫調整済フラグList) {
        doSet在庫調整済フラグ_InScope(在庫調整済フラグList);
    }

    protected void doSet在庫調整済フラグ_InScope(Collection<String> 在庫調整済フラグList) {
        regINS(CK_INS, cTL(在庫調整済フラグList), xgetCValue在庫調整済フラグ(), "在庫調整済フラグ");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * 在庫調整済フラグ: {CHAR(1)}
     * @param 在庫調整済フラグList The collection of 在庫調整済フラグ as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void set在庫調整済フラグ_NotInScope(Collection<String> 在庫調整済フラグList) {
        doSet在庫調整済フラグ_NotInScope(在庫調整済フラグList);
    }

    protected void doSet在庫調整済フラグ_NotInScope(Collection<String> 在庫調整済フラグList) {
        regINS(CK_NINS, cTL(在庫調整済フラグList), xgetCValue在庫調整済フラグ(), "在庫調整済フラグ");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * 在庫調整済フラグ: {CHAR(1)} <br>
     * <pre>e.g. set在庫調整済フラグ_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param 在庫調整済フラグ The value of 在庫調整済フラグ as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void set在庫調整済フラグ_LikeSearch(String 在庫調整済フラグ, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(在庫調整済フラグ), xgetCValue在庫調整済フラグ(), "在庫調整済フラグ", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * 在庫調整済フラグ: {CHAR(1)}
     * @param 在庫調整済フラグ The value of 在庫調整済フラグ as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void set在庫調整済フラグ_NotLikeSearch(String 在庫調整済フラグ, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(在庫調整済フラグ), xgetCValue在庫調整済フラグ(), "在庫調整済フラグ", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * 在庫調整済フラグ: {CHAR(1)}
     * @param 在庫調整済フラグ The value of 在庫調整済フラグ as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void set在庫調整済フラグ_PrefixSearch(String 在庫調整済フラグ) {
        set在庫調整済フラグ_LikeSearch(在庫調整済フラグ, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * 在庫調整済フラグ: {CHAR(1)}
     */
    public void set在庫調整済フラグ_IsNull() { reg在庫調整済フラグ(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * 在庫調整済フラグ: {CHAR(1)}
     */
    public void set在庫調整済フラグ_IsNullOrEmpty() { reg在庫調整済フラグ(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * 在庫調整済フラグ: {CHAR(1)}
     */
    public void set在庫調整済フラグ_IsNotNull() { reg在庫調整済フラグ(CK_ISNN, DOBJ); }

    protected void reg在庫調整済フラグ(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValue在庫調整済フラグ(), "在庫調整済フラグ"); }
    protected abstract ConditionValue xgetCValue在庫調整済フラグ();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg}
     * @param delFlg The value of delFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelFlg_Equal(String delFlg) {
        doSetDelFlg_Equal(fRES(delFlg));
    }

    /**
     * Equal(=). As DelFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setDelFlg_Equal_AsDelFlg(CDef.DelFlg cdef) {
        doSetDelFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未削除
     */
    public void setDelFlg_Equal_$0() {
        setDelFlg_Equal_AsDelFlg(CDef.DelFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 削除済
     */
    public void setDelFlg_Equal_$1() {
        setDelFlg_Equal_AsDelFlg(CDef.DelFlg.$1);
    }

    protected void doSetDelFlg_Equal(String delFlg) {
        regDelFlg(CK_EQ, delFlg);
    }

    protected void regDelFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelFlg(), "DEL_FLG"); }
    protected abstract ConditionValue xgetCValueDelFlg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * VERSION_NO: {NotNull, BIGINT(19), default=[0]}
     * @param versionNo The value of versionNo as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setVersionNo_Equal(Long versionNo) {
        doSetVersionNo_Equal(versionNo);
    }

    protected void doSetVersionNo_Equal(Long versionNo) {
        regVersionNo(CK_EQ, versionNo);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * VERSION_NO: {NotNull, BIGINT(19), default=[0]}
     * @param minNumber The min number of versionNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of versionNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setVersionNo_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueVersionNo(), "VERSION_NO", rangeOfOption);
    }

    protected void regVersionNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueVersionNo(), "VERSION_NO"); }
    protected abstract ConditionValue xgetCValueVersionNo();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CONTROL_NO: {IX, BIGINT(19)}
     * @param controlNo The value of controlNo as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setControlNo_Equal(Long controlNo) {
        doSetControlNo_Equal(controlNo);
    }

    protected void doSetControlNo_Equal(Long controlNo) {
        regControlNo(CK_EQ, controlNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CONTROL_NO: {IX, BIGINT(19)}
     * @param controlNo The value of controlNo as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setControlNo_NotEqual(Long controlNo) {
        doSetControlNo_NotEqual(controlNo);
    }

    protected void doSetControlNo_NotEqual(Long controlNo) {
        regControlNo(CK_NES, controlNo);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CONTROL_NO: {IX, BIGINT(19)}
     * @param minNumber The min number of controlNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of controlNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setControlNo_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueControlNo(), "CONTROL_NO", rangeOfOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CONTROL_NO: {IX, BIGINT(19)}
     */
    public void setControlNo_IsNull() { regControlNo(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CONTROL_NO: {IX, BIGINT(19)}
     */
    public void setControlNo_IsNotNull() { regControlNo(CK_ISNN, DOBJ); }

    protected void regControlNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueControlNo(), "CONTROL_NO"); }
    protected abstract ConditionValue xgetCValueControlNo();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADD_DT: {DATETIME(19)}
     * @param addDt The value of addDt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAddDt_Equal(java.sql.Timestamp addDt) {
        regAddDt(CK_EQ,  addDt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADD_DT: {DATETIME(19)}
     * @param addDt The value of addDt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAddDt_LessEqual(java.sql.Timestamp addDt) {
        regAddDt(CK_LE, addDt);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ADD_DT: {DATETIME(19)}
     */
    public void setAddDt_IsNull() { regAddDt(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ADD_DT: {DATETIME(19)}
     */
    public void setAddDt_IsNotNull() { regAddDt(CK_ISNN, DOBJ); }

    protected void regAddDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAddDt(), "ADD_DT"); }
    protected abstract ConditionValue xgetCValueAddDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADD_USER: {VARCHAR(60)}
     * @param addUser The value of addUser as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddUser_Equal(String addUser) {
        doSetAddUser_Equal(fRES(addUser));
    }

    protected void doSetAddUser_Equal(String addUser) {
        regAddUser(CK_EQ, addUser);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ADD_USER: {VARCHAR(60)}
     */
    public void setAddUser_IsNull() { regAddUser(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ADD_USER: {VARCHAR(60)}
     */
    public void setAddUser_IsNullOrEmpty() { regAddUser(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ADD_USER: {VARCHAR(60)}
     */
    public void setAddUser_IsNotNull() { regAddUser(CK_ISNN, DOBJ); }

    protected void regAddUser(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAddUser(), "ADD_USER"); }
    protected abstract ConditionValue xgetCValueAddUser();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADD_PROCESS: {VARCHAR(255)}
     * @param addProcess The value of addProcess as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddProcess_Equal(String addProcess) {
        doSetAddProcess_Equal(fRES(addProcess));
    }

    protected void doSetAddProcess_Equal(String addProcess) {
        regAddProcess(CK_EQ, addProcess);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ADD_PROCESS: {VARCHAR(255)}
     */
    public void setAddProcess_IsNull() { regAddProcess(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ADD_PROCESS: {VARCHAR(255)}
     */
    public void setAddProcess_IsNullOrEmpty() { regAddProcess(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ADD_PROCESS: {VARCHAR(255)}
     */
    public void setAddProcess_IsNotNull() { regAddProcess(CK_ISNN, DOBJ); }

    protected void regAddProcess(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAddProcess(), "ADD_PROCESS"); }
    protected abstract ConditionValue xgetCValueAddProcess();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * UPD_DT: {DATETIME(19)}
     * @param updDt The value of updDt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdDt_Equal(java.sql.Timestamp updDt) {
        regUpdDt(CK_EQ,  updDt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UPD_DT: {DATETIME(19)}
     * @param updDt The value of updDt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdDt_LessEqual(java.sql.Timestamp updDt) {
        regUpdDt(CK_LE, updDt);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * UPD_DT: {DATETIME(19)}
     */
    public void setUpdDt_IsNull() { regUpdDt(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * UPD_DT: {DATETIME(19)}
     */
    public void setUpdDt_IsNotNull() { regUpdDt(CK_ISNN, DOBJ); }

    protected void regUpdDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdDt(), "UPD_DT"); }
    protected abstract ConditionValue xgetCValueUpdDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPD_USER: {VARCHAR(60)}
     * @param updUser The value of updUser as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdUser_Equal(String updUser) {
        doSetUpdUser_Equal(fRES(updUser));
    }

    protected void doSetUpdUser_Equal(String updUser) {
        regUpdUser(CK_EQ, updUser);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * UPD_USER: {VARCHAR(60)}
     */
    public void setUpdUser_IsNull() { regUpdUser(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * UPD_USER: {VARCHAR(60)}
     */
    public void setUpdUser_IsNullOrEmpty() { regUpdUser(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * UPD_USER: {VARCHAR(60)}
     */
    public void setUpdUser_IsNotNull() { regUpdUser(CK_ISNN, DOBJ); }

    protected void regUpdUser(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdUser(), "UPD_USER"); }
    protected abstract ConditionValue xgetCValueUpdUser();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPD_PROCESS: {VARCHAR(255)}
     * @param updProcess The value of updProcess as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdProcess_Equal(String updProcess) {
        doSetUpdProcess_Equal(fRES(updProcess));
    }

    protected void doSetUpdProcess_Equal(String updProcess) {
        regUpdProcess(CK_EQ, updProcess);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * UPD_PROCESS: {VARCHAR(255)}
     */
    public void setUpdProcess_IsNull() { regUpdProcess(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * UPD_PROCESS: {VARCHAR(255)}
     */
    public void setUpdProcess_IsNullOrEmpty() { regUpdProcess(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * UPD_PROCESS: {VARCHAR(255)}
     */
    public void setUpdProcess_IsNotNull() { regUpdProcess(CK_ISNN, DOBJ); }

    protected void regUpdProcess(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdProcess(), "UPD_PROCESS"); }
    protected abstract ConditionValue xgetCValueUpdProcess();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO = (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TPickingRecordStockCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TPickingRecordStockCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO &lt;&gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TPickingRecordStockCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TPickingRecordStockCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br>
     * {where FOO &gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TPickingRecordStockCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TPickingRecordStockCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br>
     * {where FOO &lt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TPickingRecordStockCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TPickingRecordStockCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br>
     * {where FOO &gt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TPickingRecordStockCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TPickingRecordStockCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TPickingRecordStockCB&gt;() {
     *     public void query(TPickingRecordStockCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TPickingRecordStockCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TPickingRecordStockCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TPickingRecordStockCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TPickingRecordStockCQ sq);

    protected TPickingRecordStockCB xcreateScalarConditionCB() {
        TPickingRecordStockCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TPickingRecordStockCB xcreateScalarConditionPartitionByCB() {
        TPickingRecordStockCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TPickingRecordStockCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPickingRecordStockCB cb = new TPickingRecordStockCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "PICKING_RECORD_STOCK_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TPickingRecordStockCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TPickingRecordStockCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TPickingRecordStockCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPickingRecordStockCB cb = new TPickingRecordStockCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "PICKING_RECORD_STOCK_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TPickingRecordStockCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TPickingRecordStockCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPickingRecordStockCB cb = new TPickingRecordStockCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TPickingRecordStockCQ sq);

    // ===================================================================================
    //                                                                        Manual Order
    //                                                                        ============
    /**
     * Order along manual ordering information.
     * <pre>
     * ManualOrderOption mop = new ManualOrderOption();
     * mop.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     * cb.query().addOrderBy_Birthdate_Asc().<span style="color: #CC4747">withManualOrder(mop)</span>;
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when BIRTHDATE &gt;= '2000/01/01' then 0</span>
     * <span style="color: #3F7E5E">//     else 1</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     *
     * ManualOrderOption mop = new ManualOrderOption();
     * mop.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Withdrawal);
     * mop.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Formalized);
     * mop.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Provisional);
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #CC4747">withManualOrder(mop)</span>;
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * <p>This function with Union is unsupported!</p>
     * <p>The order values are bound (treated as bind parameter).</p>
     * @param option The option of manual-order containing order values. (NotNull)
     */
    public void withManualOrder(ManualOrderOption option) { // is user public!
        xdoWithManualOrder(option);
    }

    // ===================================================================================
    //                                                                    Small Adjustment
    //                                                                    ================
    /**
     * Order along the list of manual values. #beforejava8 <br>
     * This function with Union is unsupported! <br>
     * The order values are bound (treated as bind parameter).
     * <pre>
     * MemberCB cb = new MemberCB();
     * List&lt;CDef.MemberStatus&gt; orderValueList = new ArrayList&lt;CDef.MemberStatus&gt;();
     * orderValueList.add(CDef.MemberStatus.Withdrawal);
     * orderValueList.add(CDef.MemberStatus.Formalized);
     * orderValueList.add(CDef.MemberStatus.Provisional);
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #CC4747">withManualOrder(orderValueList)</span>;
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * @param orderValueList The list of order values for manual ordering. (NotNull)
     */
    public void withManualOrder(List<? extends Object> orderValueList) { // is user public!
        assertObjectNotNull("withManualOrder(orderValueList)", orderValueList);
        final ManualOrderOption option = new ManualOrderOption();
        option.acceptOrderValueList(orderValueList);
        withManualOrder(option);
    }

    @Override
    protected void filterFromToOption(String columnDbName, FromToOption option) {
        option.allowOneSide();
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected TPickingRecordStockCB newMyCB() {
        return new TPickingRecordStockCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TPickingRecordStockCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
