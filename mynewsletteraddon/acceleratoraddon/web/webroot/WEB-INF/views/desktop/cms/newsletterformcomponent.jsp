<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="col-md-6 pull-right">
<h3>NEWSLETTER SIGNUP</h3>
<!-- <form action="" class="text-right">
<p>
<label>FirstName</label><input type="text" value="firstname">
</p>
<p>
<label>LastName</label><input type="text" value="firstname">
</p>
<p>
<label>Email id</label><input type="text" value="firstname">
</p>
<button type="submit" value="Submit">Submit</button>
</form> -->

*************************
<a href="https://localhost:9002/store/hybris/en/newsletterSubscription/subscribe">Sample Submit</a>
***************************

        <c:url value="/newsletterSubscription/subscribe" var="newsletterSubscribeUrl"/>
        
        


  <form:form method="post" id="newsletteremailSubscription" action="${pageContext.request.contextPath}/newsletterSubscription/subscribe" 
             modelAttribute="newsletterSubscribeForm" >
            
            
<p><label>FirstName</label><form:input path="fname" /></p>
<p><label>LastName</label><form:input path="lname" /></p>
<p><label>Email</label><form:input path="email" /></p>

<%-- <form:input path="lastName" />
<form:input path="userN" />
            
                <formElement:formInputBox idKey="newsletter.subscribe.email"
                                          labelKey=""
                                          path="email"
                                          inputCSS="form-control bottom-margin-fix"
                                          placeholder="${email}"
                                          mandatory="true" />
	              <formElement:formInputBox idKey="newsletter.subscribe.lastName"
                                          labelKey=""
                                          path="lastName"
                                          inputCSS="form-control bottom-margin-fix"
                                          placeholder="${lastName}"
                                          mandatory="true" />
                  <formElement:formInputBox idKey="newsletter.subscribe.firstName"
                                          labelKey=""
                                          path="firstName"
                                          inputCSS="form-control bottom-margin-fix"
                                          placeholder="${firstName}"
                                          mandatory="true" /> --%>
                <button type="submit" class="btn btn-primary btn-eublue pull-right"><spring:theme code="submit" /></button>
            </form:form>

</div>
</body>
</html>