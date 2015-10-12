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
<title>Add Technology Topic</title> --%>
</head>
<body>

	<div class="row rowAdjust">
		<div class="large-8 columns large-centered">
			
			<form:form action="addTopic" method="post" commandName="addQuizTopic" enctype="multipart/form-data">
			  <fieldset>
			    <legend>Add New Topic</legend>
					
				<label>Technology Name
					<form:select path="technologyId" required="required">
						<form:option value="-1" label="--- Select the technology---"/>
						<form:options items="${technologyMap}"/>
					</form:select>
				</label>
					
			    <label>Upload Your Image
			    	<input type="file" value="Upload image" name="multipartFile" required="required">
			    </label>

			    <label>Topic Name
			    	<form:input path="topicName" placeholder="Core Java" required="required" />
			    </label>
			    
			    <label>Image Name
			    	<form:input path="topicImage" placeholder="/webapp/foundation/images/abc.jpg" required="required"/>
			    </label>
			    
			    <label>Short Details
			    	<form:textarea path="shortDetails" placeholder="Test Your Knowledge" required="required"/>
			    </label>
			    
			  	<div align="center">
			  		<h2>Quiz Configuration Details.</h2>
			  	</div>  
			  	
			  	<label>Number of questions
			  		<form:input path="questions" placeholder="10" required="required"/>
			  	</label>
			  	
			  	<label>Quiz Time
			  		<form:input path="time" placeholder="10" required="required"/>
			  	</label>
			  	
			  	<label>Start Button Name
			  		<form:input path="buttonName" placeholder="10" required="required"/>
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