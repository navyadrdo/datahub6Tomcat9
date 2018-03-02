<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<div class="modal-content">

	<div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">×</span></button>
        <h4 class="modal-title"><i class="fa fa-envelope-o fa-lg" style="padding: 10px;"></i><spring:theme code="newsletter.subscription"/></h4>
    </div>

finally it's comming 
	<div class="modal-body">
		<div class="cart_popup_error_msg">
<%-- 		<c:if test="${not empty errorMsgList}">
			<c:forEach items="${errorMsgList}" var="msg">
				<br/><spring:theme code="${msg}"/>		
			</c:forEach>
		</c:if> --%>
		<spring:theme code="${errorMsg}" />
	</div>
	<span class="cart_popup_success_mess">
	<%-- 	<spring:theme code="${successMessage}" /> --%>
	</span>
	</div>

</div>
