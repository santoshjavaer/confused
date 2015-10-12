<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>First</title>
<link href='http://fonts.googleapis.com/css?family=Slabo+27px' rel='stylesheet' type='text/css'>
<link href='http://fonts.googleapis.com/css?family=Glegoo' rel='stylesheet' type='text/css'>
</head>
<body class="eternity-form scroll-animations-activated">

	<div class="header fixed">
			<jsp:include page="header.jsp"/>
	</div>
	
	<div  class="bodyContent">
			<jsp:include page="bodyContent.jsp"/>
	</div>
	
	<div>
		<jsp:include page="footer.jsp"/>
	</div>
	
	<script src="${pageContext.request.contextPath}/foundation/js/jquery.js"></script>
	<script src="${pageContext.request.contextPath}/foundation/js/foundation.min.js"></script>
	
	<script>
		$(document).foundation();
	</script>
</body>
</html>