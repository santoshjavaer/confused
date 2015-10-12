<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="${pageContext.request.contextPath}/foundation/css/commonStyle.css" />
<title>Login Page</title>
</head>
<body>
	<div id="myModal" class="reveal-modal loginPanelDesign" data-reveal>
		
			<c:if test="${not empty error}">
				<div class="error">${error}</div>
			</c:if>
			<c:if test="${not empty msg}">
				<div class="msg">${msg}</div>
			</c:if>
			<c:if test="${not empty urlHit}">
				<div class="msg">${urlHit}</div>
			</c:if>
	
			<form:form action="j_spring_security_check" method="POST">
				<label><spring:message code="label.userName"/></label>
		      	<form:input path="j_spring_security_check" placeholder='<spring:message code="label.placeholderforusername"/>'/>
		    	<label><spring:message code="label.password"/>
		      	<form:password path="j_password" placeholder='<spring:message code="label.placeholderforpassword"/>'/>
		    	</label>
		    	<input type="submit" class="button expand"/>
			</form:form>
			
			<a class="close-reveal-modal">&#215;</a>
		</div>
	
</body>
</html>