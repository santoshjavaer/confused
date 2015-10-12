<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/foundation/css/foundation.min.css" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/foundation/css/commonStyle.css" />
<link href='http://fonts.googleapis.com/css?family=Slabo+27px' rel='stylesheet' type='text/css'>
<link href='http://fonts.googleapis.com/css?family=Glegoo' rel='stylesheet' type='text/css'>
<title>Add Technology</title>
</head>
<body>

	<div class="header fixed">
			<jsp:include page="../header.jsp"/>
	</div>

	<div class="row rowAdjust">
		<div class="large-10 columns large-centered">
			
			  <fieldset>
			    <legend>Your Add New Technology</legend>
			    
			    
			    
			    <c:if test="${not empty 'javaQuestion'}">
				    <div class="row">
						<div class="large-4 columns"><label>Question id</label></div>
						<div class="large-8 columns">${javaQuestion.id}</div>
					</div>
					
					<div class="row">
						<div class="large-4 columns"><label>Question</label></div>
						<div class="large-8 columns">
							<pre>${javaQuestion.questions}</pre>
							
						</div>
					</div>
					
					<div class="row">
						<div class="large-4 columns"><label>Option</label></div>
						<div class="large-8 columns">${javaQuestion.options}</div>
					</div>
					
					<div class="row">
						<div class="large-4 columns"><label>Answer</label></div>
						<div class="large-8 columns">${javaQuestion.answer}</div>
					</div>
					
					<div class="row">
						<div class="large-4 columns"><label>Set</label></div>
						<div class="large-8 columns">${javaQuestion.questionSet}</div>
					</div>
					
			    </c:if>
			    
			    
			    
					
				<div class="row">
					<div class="large-6 columns"><label>Technology Name</label></div>
					<div class="large-6 columns">${quizTechModel.technologyName}</div>
				</div>
				
				<div class="row">
					<div class="large-6 columns"><label>Image Name</label></div>
					<div class="large-6 columns">${quizTechModel.imageName}</div>
				</div>
				
				<div class="row">
					<div class="large-6 columns"><label>Details</label></div>
					<div class="large-6 columns">${quizTechModel.shortDetails}</div>
				</div>
				
				
			
									
			    <label>Short Details </label>
			    <a href="addTopic" class="button right">Continue...</a>
			  </fieldset>
		</div>
	</div>
	
	<div>
		<jsp:include page="../footer.jsp"/>
	</div>
		
	<script src="${pageContext.request.contextPath}/foundation/js/jquery.js"></script>
	<script src="${pageContext.request.contextPath}/foundation/js/foundation.min.js"></script>
		
</body>
</html>