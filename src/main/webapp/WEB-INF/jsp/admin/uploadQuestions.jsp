<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0" />

</head>
<body>

	<div class="row rowAdjust">
		<div class="large-8 columns large-centered">
			
			<form:form action="uploadQuestion" method="post" commandName="commonObject">
			  <fieldset>
			    <legend>Upload Questions</legend>
					
			    <label>Topic Name
					<form:select path="topicId" id="topicId" class="required">
						<form:option value="-1" label="--- Topic ---" />
						<form:options items="${topicMap}" itemValue="id" itemLabel="topicName"/>
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
			  	
			  	<form:hidden path="technologyId" value = "${commonQuestion.technologyId}"/>
			  	<form:hidden path="seriesId" value="${commonQuestion.seriesId}"/>
			  	<form:hidden path="action" value="uploadQuestion"/>
			    <input type="submit" value="submit" class="button right"/>
			    
			  </fieldset>
			</form:form>
		</div>
	</div>
	
	<script src="${pageContext.request.contextPath}/foundation/js/jquery.js"></script>
	<script src="${pageContext.request.contextPath}/foundation/js/custom.js"></script> 
</body>
</html>