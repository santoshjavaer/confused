<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<%-- <link rel="stylesheet" href="${pageContext.request.contextPath}/foundation/css/foundation.min.css" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/foundation/css/commonStyle.css" />
<link href='http://fonts.googleapis.com/css?family=Slabo+27px' rel='stylesheet' type='text/css'>
<link href='http://fonts.googleapis.com/css?family=Glegoo' rel='stylesheet' type='text/css'>
<title>Add Technology</title> --%>
</head>
<body>

	<div class="row rowAdjust">
		<div class="large-8 columns large-centered">
			
			<form:form action="addQuizTech" method="post" commandName="addQuizTech" enctype="multipart/form-data">
			  <fieldset>
			    <legend>Add New Technology</legend>
					
				<label>Technology Name
					<form:input path="technologyName" placeholder="Technology Name" required="required"/>
				
				</label>
					
			    <label>Image URL
			    	<input type="file" value="Upload image" name="multipartFile" required="required">
			    </label>

			    <label>Image Name
			    	<form:input path="imageName" placeholder="/webapp/foundation/images/abc.jpg" required="required"/>
			    </label>
			    
			    <label>Short Details
			    	<form:textarea path="shortDetails" placeholder="Test Your Knowledge" required="required"/>
			    </label>
			    
			    <div align="center">
			  		<h2>For Quiz</h2>
			  	</div>  
			  	
			  	<label>Question Table Name
			  		<form:input path="questionTable" placeholder="table name..." required="required"/>
			  	</label>
			    
			    <input type="submit" value="submit" class="button right"/>
			    
			  </fieldset>
			</form:form>
		</div>
	</div>
		
	<%-- <script src="${pageContext.request.contextPath}/foundation/js/jquery.js"></script>
	<script src="${pageContext.request.contextPath}/foundation/js/foundation.min.js"></script> --%>
		
</body>
</html>