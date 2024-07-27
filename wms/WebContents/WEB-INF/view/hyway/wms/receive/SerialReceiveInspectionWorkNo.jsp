<%@ include file="../../base/HTBaseHeader.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.receive.SerialReceiveInspectionWorkNoDto" %>
<%-- シリアル登入(伝票No) --%>
<%-- 伝票No --%>
<text mode="1"
      size="2"
      x="1"
      y="4"
      >${screen.itemNm("workNo")}:</text>
<input mode="1"
       size="2"
       x="1"
       y="8"
       ${screen.inputTextAttr("workNo")}
       width="30"
       param="receiveSlipNo" default="${fn:escapeXml(SerialReceiveInspectionDto.receiveSlipNo)}"></input>
<%-- 仕入先 --%>
<text mode="1"
      size="2"
      x="1"
      y="12"
      >${screen.itemNm("supplierCd")}:</text>

<input mode="1"
       size="2"
       x="1"
       y="16"
        ${screen.inputTextAttr("supplierCd")}
       width="30"
       param="supplierCd" default="${fn:escapeXml(SerialReceiveInspectionDto.supplierCd)}"></input>

<text mode="1"
      size="2"
      x="1"
      y="20"
      adjusty="0"
      >${fn:escapeXml(SerialReceiveInspectionDto.supplierNm)}</text>

<!-- [#5935][v3.1]仕入先ボタン表示不正を修正 2019.01.23 kawana Start -->
<!-- 仕入先ボタン -->
<button y="32"
        x="15"
        size="2"
        width="16"
        url="SerialReceiveInspectionWorkNo/selectSupplier"
        key="d"
        type="2">F4:${screen.itemNm("supplier")}</button>
<!-- [#5935][v3.1]仕入先ボタン表示不正を修正 2019.01.23 kawana End -->
<%@ include file="../../base/HTBaseFooter.jsp" %>