<%@ include file="../../base/HTBaseHeader_en.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.receive.ReceiveInspecStoreDto" %>

<!-- 入荷検品格納(終了) -->

<%-- 入荷検品格納を --%>
<text mode="1"
      size="1"
      x="7"
      y="7"
      >${screen.itemNm("msg1")}</text>
<!-- 伝票No -->
<text mode="1"
      size="1"
      x="2"
      y="16"
      adjusty="0"
      >${screen.itemNm("workNo")}:</text>

<text mode="1"
      size="1"
      x="2"
      y="19"
      adjusty="0"
      >${fn:escapeXml(ReceiveInspecStoreDto.TReceivePlanBDto.TReceivePlanH.receiveSlipNo)}</text>
<%@ include file="../../base/HTBaseFooter_en.jsp" %>
