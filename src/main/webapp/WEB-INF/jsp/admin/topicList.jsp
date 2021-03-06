<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Topic List</title>

<link rel="stylesheet" href="${pageContext.request.contextPath}/foundation/css/foundation.min.css" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/foundation/css/commonStyle.css" />

</head>
<body>
	<div class="row">
		<div class="small-12 large-12 columns">
			<div class="row questionSetHeader">
				<div class="small-2 large-2  columns">
					<h5 class="setlistFontStyle">TOPIC-ID</h5>
				</div>
				<div class="small-3 large-3 columns">
					<h5 class="setlistFontStyle">TOPIC-NAME</h5>	
				</div>
				
				<div class="small-3 large-3 columns">
					<h5 class="setlistFontStyle">TECHNOLOGY-NAME</h5>	
				</div>
				
				<div class="small-3 large-3 columns">
					<h5 class="setlistFontStyle" align="center">ACTION</h5>
				</div>
			</div>
			
			
			<c:forEach items="${commonAttribute}" var="topicModel">
				<div class="row setRowContainer">
					<div class="small-2 large-2  columns">
						<h5 class="setlistFontStyle">${topicModel.id}</h5>
					</div>
					<div class="small-2 large-2  columns">
						<h5 class="setlistFontStyle">${topicModel.topicName}</h5>
					</div>
					<div class="small-3 large-3 columns">
						<h5 class="setlistFontStyle">${topicModel.technology.technologyName}</h5>
					</div>

					<div class="small-3 large-3 columns">
						<div class="" align="right">
							<a title="edit" href="#" class="buttons edit"></a> <a
								title="delete" href="#" class="buttons delete"></a>
						</div>
					</div>
				</div>
			</c:forEach>
			
		</div>
	</div>
</body>
</html>