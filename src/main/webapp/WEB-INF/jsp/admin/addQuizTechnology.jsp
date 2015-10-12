<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0" />

</head>
<body>

	<div class="row rowAdjust">
		<div class="large-8 columns large-centered">
			
			<form:form action="addQuizTech" method="post" commandName="addQuizTech" enctype="multipart/form-data">
			  <fieldset>
			    <legend>Add New Technology</legend>
					
					
				<c:if test="${not empty dynamicMessage}">
					<div data-alert class="alert-box alert radius">
					  ${dynamicMessage}
					  <a href="#" class="close">&times;</a>
					</div>
				</c:if>
				
				
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
			    
			    <input type="submit" value="submit" class="button right"/>
			    
			  </fieldset>
			</form:form>
		</div>
	</div>
</body>
</html>