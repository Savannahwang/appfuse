<%@ include file="/common/taglibs.jsp" %>

<cache:flush />
<div class="message" style="font-size: 12px">
    <img src="<c:url value="/images/iconInformation.gif"/>"
        alt="<fmt:message key="icon.information"/>" class="icon" />
    <fmt:message key="flushCache.message"/>
</div>
<script type="text/javascript">
window.setTimeout("history.back()", 2000);
</script>