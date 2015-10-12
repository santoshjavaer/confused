<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form"  prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create Quiz</title>
</head>
<body>
	<div class="row">
		<div class="small-12 large-7 small-centered large-centered columns">
			<form:form action="createQuiz" method="post" commandName="commonObject">
			  <fieldset>
			    <legend>Create Quiz</legend>
					
				<label>Select Technology
					<form:select path="technologyId" id="technologyId" required="required">
						<form:option value="-1" label="--- Select the technology---"/>
						<form:options items="${technologyMap}"/>
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
</body>
</html>