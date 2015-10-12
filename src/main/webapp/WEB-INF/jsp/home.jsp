<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="${pageContext.request.contextPath}/foundation/css/foundation.min.css" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/foundation/css/first.css" />
<title>Home Page</title>
</head>
<body>

	<div class="contentWrapper">
		<c:forEach items="${Contents}" var="item">
			<div class="row">
				
				<div class="large-4 small-5 columns">
						<img alt="" src="${pageContext.request.contextPath}/${item.image_url}"/>
				</div>
				<div class="large-8 small-7 columns">
						<h3>${item.id}&nbsp;&nbsp;${item.image_name}</h3>
						<div>
							${item.image_description}	
						</div>				
				</div>
			</div>
			<div class="row">
				<hr>
			</div>
		</c:forEach>
	</div>
		<div class="row" style="background: none;">
			<div class="left">
				<a href="${pageContext.request.contextPath}/home?startIndex=${startIndex}&endIndex=${endIndex}">Previous</a>
			</div>
			<div class="right">
				<a href="${pageContext.request.contextPath}/home?startIndex=${startIndex}&endIndex=${endIndex}">Next</a>
			</div>
		</div>
		
	<script src="${pageContext.request.contextPath}/foundation/js/jquery.js"></script>
	<script src="${pageContext.request.contextPath}/foundation/js/foundation.min.js"></script>
	
	<script>
		$(document).foundation();
	</script>
</body>
</html>