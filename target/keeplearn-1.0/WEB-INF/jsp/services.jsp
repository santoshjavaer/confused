<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>service</title>
<link href='http://fonts.googleapis.com/css?family=Slabo+27px' rel='stylesheet' type='text/css'>
<link href='http://fonts.googleapis.com/css?family=Glegoo' rel='stylesheet' type='text/css'>
</head>
<body class="eternity-form scroll-animations-activated">

	<div class="header fixed">
			<jsp:include page="header.jsp"/>
	</div>
	
	<div  class="bodyContent">
		<div class="row maxWidth margin-top paddingAdjust" data-equalizer>
			<div class="small-12 large-4 columns">
				<div class="boxWrapper" data-equalizer-watch>
					<span class="circleIcon">	
							<img alt="" src="${pageContext.request.contextPath}/foundation/images/book.png"/>
					</span>
					<h2>Academic Project</h2>
					<p>We provide training for engineering students on live project</p>
					<a class="button small radius">Click here for enquire....</a>
				</div>
			</div>
			<div class="small-12 large-4 columns">
				<div class="boxWrapper" data-equalizer-watch>
					<span class="circleIcon">	
							<img alt="" src="${pageContext.request.contextPath}/foundation/images/blog.png"/>
					</span>
					<h2>WebSite For Every Bussiness</h2>
					<p>We Understand the need of website go grow up bussiness contact us to make your website</p>
					<a class="button small radius">Click here for enquire....</a>
				</div>
			</div>
			<div class="small-12 large-4 columns">
				<div class="boxWrapper" data-equalizer-watch>
					<span class="circleIcon">	
							<img alt="" src="${pageContext.request.contextPath}/foundation/images/test.png"/>
					</span>
					<h2>Learn Computer Language.</h2>
					<p>We also provide the traning for computer languages</p>
					<a href="quizeContentMenu" class="button small radius">Click here for enquire....</a>
				</div>
			</div>
		</div>
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