<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="${pageContext.request.contextPath}/foundation/css/foundation.min.css" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/foundation/css/commonStyle.css" />
<title>Login Page</title>

</head>
<body class="background">


<div class="row">
	<div class="small-12 large-7 columns large-centered">
	  <div class="container">
		  <div class = "loginHeader" align="center">
		  	<h3>Admin Panel Login</h3>	
		  </div>
		  <div class="loginPanelDesign" align="center">
		  
		  		<c:if test="${not empty error}">
					<div class="error padding-bottom-10 padding-top-10" align="center">${error}</div>
				</c:if>
				<c:if test="${not empty msg}">
					<div class="msg">${msg}</div>
				</c:if>
				<c:if test="${not empty urlHit}">
					<div class="msg padding-bottom-10 padding-top-10" align="center">${urlHit}</div>
				</c:if>
				
				
				<form id="adminForm" action="${pageContext.request.contextPath}/login" method="POST" id="check" autocomplete="off">
			      	<input type="text" name="username" placeholder='<spring:message code="label.placeholderforusername"/>' autocomplete="off" required="required"/>
			      	<input type="password" name="password" placeholder='<spring:message code="label.placeholderforpassword"/>' autocomplete="off" required="required"/>
			    	<a href="#" class="forgotPwd" >Forgot Password?</a>
			    	<input type="submit" value="Login" id="submitID" class="button radius btnMgn"/>
			    	
			    	<input type="hidden" name="${_csrf.parameterName}"   value="${_csrf.token}" />
			    	
				</form> 
				
				
				
				
				
		 		<%-- <form id="adminForm" action="j_spring_security_check" method="POST" id="check" autocomplete="off">
			      	<input type="text" name="j_username" id="username" placeholder='<spring:message code="label.placeholderforusername"/>' autocomplete="off" required="required"/>
			      	<input type="password" name="j_password" id="password" placeholder='<spring:message code="label.placeholderforpassword"/>' autocomplete="off" required="required"/>
			    	<a href="#" class="forgotPwd" >Forgot Password?</a>
			    	<input type="submit" value="Login" id="submitID" class="button radius btnMgn"/>
				</form>  --%>
		   </div>
	   </div>
	</div>
</div>


	<script src="${pageContext.request.contextPath}/foundation/js/jquery.js"></script>
	<script src="${pageContext.request.contextPath}/foundation/js/foundation.min.js"></script>
	
</body>
</html>