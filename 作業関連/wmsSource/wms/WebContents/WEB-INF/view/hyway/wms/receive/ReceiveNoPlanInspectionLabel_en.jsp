<%@ include file="../../base/HTBaseHeader_en.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.receive.ReceiveNoPlanInspectionDto" %>

<!-- 予定無し入荷(ラベル選択)-->

<%-- button1 --%>
<button type="1"
        key="1"
        x="1"
        y="5"
        width="28"
        size="21"
        url="ReceiveNoPlanInspectionLabel/select?labelKbn=1"
        >1:${screen.itemNm("button1")}</button>

<%-- button2 --%>
<button type="1"
        key="2"
        x="1"
        y="10"
        width="28"
        size="21"
        url="ReceiveNoPlanInspectionLabel/select?labelKbn=2"
        >2:${screen.itemNm("button2")}</button>

<%@ include file="../../base/HTBaseFooter_en.jsp" %>
