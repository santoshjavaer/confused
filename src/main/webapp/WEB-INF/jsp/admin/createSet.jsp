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
			
			<form:form action="createSet" method="post" commandName="commonObject">
			  <fieldset>
			    <legend>Create Set</legend>
					
			    <label>Topic Name
					<form:select path="quizTopicModel.id" id="topicId" class="required">
						<form:option value="-1" label="--- Topic ---" />
						<form:options items="${topicMap}"/>
					</form:select>
			    </label>
			    
			    <label>Set Name
					<form:input path="seriesName" required="required"/>
				</label>
			  	
			    <input type="submit" value="Continue" class="button right"/>
			    
			  </fieldset>
			</form:form>
		</div>
	</div>

	<script src="${pageContext.request.contextPath}/foundation/js/jquery.js"></script>
	<script src="${pageContext.request.contextPath}/foundation/js/custom.js"></script> 
</body>
</html>