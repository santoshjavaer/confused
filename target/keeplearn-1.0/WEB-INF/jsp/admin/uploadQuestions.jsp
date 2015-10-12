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
<title>Upload Questions</title> --%>
</head>
<body>

	<div class="row rowAdjust">
		<div class="large-8 columns large-centered">
			
			<form:form action="uploadJavaQuestion" method="post" commandName="javaTechnologyModel">
			  <fieldset>
			    <legend>Upload Questions</legend>
					
				<label>Technology Name
					<form:select path="technologyId" id="technologyId" required="required">
						<form:option value="-1" label="--- Select the technology---"/>
						<form:options items="${technologyMap}"/>
					</form:select>
				</label>
					
			    <label>Topic Name
					<form:select path="topicId" id="topicId" class="required">
						<form:option value="-1" label="--- Topic ---" />
						<form:options items="${topic}"/>
					</form:select>
			    </label>
			  	
			  	<label>Question
			  		<form:textarea path="questions" placeholder="question..........." required="required"/>
			  	</label>
			  	
			  	<label>Option
			  		<form:textarea path="options" placeholder="option1/options2/options3....." required="required"/>
			  	</label>
			  	
			  	<label>Answer
			  		<form:textarea path="answer" placeholder="answer....." required="required"/>
			  	</label>
			  	
			    <input type="submit" value="submit" class="button right"/>
			    
			  </fieldset>
			</form:form>
		</div>
	</div>
	
		
	<%-- <script src="${pageContext.request.contextPath}/foundation/js/jquery.js"></script>
	<script src="${pageContext.request.contextPath}/foundation/js/foundation.min.js"></script>
	<script src="${pageContext.request.contextPath}/foundation/js/custom.js"></script> 
	--%>
	<script src="${pageContext.request.contextPath}/foundation/js/jquery.js"></script>
	<script src="${pageContext.request.contextPath}/foundation/js/custom.js"></script> 
</body>
</html>