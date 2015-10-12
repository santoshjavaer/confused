<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Access Denied!!!</title>
</head>
<body>
		<div class="row">
			<div class="small-12 large-12 columns">
				<c:choose>
					<c:when test="${not empty 'dynamicMessage'}">
						${dynamicMessage}
							<a href="welcome">GO Back....</a>
					</c:when>
					<c:otherwise>
						..
					</c:otherwise>
				</c:choose>
			</div>
		</div>
</body>
</html>