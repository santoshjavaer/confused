<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Add Technology</title>
</head>
<body>

	<div class="row rowAdjust">
		<div class="large-10 columns large-centered">
			
			
			 <c:if test="${not empty dynamicMessage}">
					<div data-alert class="alert-box success radius margin-top-10">
					  ${dynamicMessage}
					  <a href="#" class="close">&times;</a>
					</div>
			</c:if>
			
			  <fieldset>
			    <legend>Your Action Information</legend>
			    
			    <c:if test="${not empty commonAttribute}">
			       
			       <c:choose>
			       		<c:when test="${describe eq 'TECHNOLOGY'}">
			       		
			       			<div class="row">
									<div class="large-4 columns"><label>Technology</label></div>
									<div class="large-8 columns">${commonAttribute.technologyName}</div>
							</div>
							
							<div class="row">
								<div class="large-4 columns"><label>Image</label></div>
								<div class="large-8 columns">${commonAttribute.multipartFile.originalFilename}</div>
							</div>
							
							<div class="row">
								<div class="large-4 columns"><label>Detail</label></div>
								<div class="large-8 columns">${commonAttribute.shortDetails}</div>
							</div>	
							
							<c:set var="complete" value="getTechnologyList"/>
							<c:set var="more" value="addQuizTech"></c:set>	
			       		
			       				
			       		</c:when>
			       		
			       		<c:when test="${describe eq 'TOPIC'}">
			       		
			       			 <c:if test="${not empty quizTopic}">
								<div class="row">
									<div class="large-4 columns"><label>Topic Name</label></div>
									<div class="large-8 columns">${quizTopic.topicName}</div>
								</div>
								
								<div class="row">
									<div class="large-4 columns"><label>Technology Id</label></div>
									<div class="large-8 columns">${quizTopic.technology.id}</div>
								</div>
								
								<div class="row">
									<div class="large-4 columns"><label>Topic Detail</label></div>
									<div class="large-8 columns">${quizTopic.shortDetails}</div>
								</div>	
								
							</c:if> 
							<c:set var="more" value="addTopic"></c:set>
							<c:set var="complete" value="getTopicList"/>
			       		
			       		</c:when>
			       		
			       		<c:when test="${describe eq 'QUESTION'}">
			       			
								<div class="row">
									<div class="large-4 columns"><label>Question</label></div>
									<div class="large-8 columns">${commonAttribute.questions}</div>
								</div>
								
								<div class="row">
									<div class="large-4 columns"><label>Option</label></div>
									<div class="large-8 columns">${commonAttribute.options}</div>
								</div>
								
								<div class="row">
									<div class="large-4 columns"><label>Answer</label></div>
									<div class="large-8 columns">${commonAttribute.answer}</div>
								</div>
								
								<div class="row">
									<div class="large-4 columns"><label>Series</label></div>
									<div class="large-8 columns">${commonAttribute.seriesId}</div>
								</div>
								
								<c:set var="more" value="uploadQuestion?technologyId=${commonAttribute.technologyId}&seriesId=${commonAttribute.seriesId}"></c:set>
								<c:set var="complete" value="getSetList"></c:set>
			       				
			       		</c:when>
			       </c:choose>
			    
			    </c:if>
			   
			    	<div class="row">
			    		<div class="small-6 large-6 columns">
				    		<a href="${complete}" class="button right">Done</a>
			    		</div>
			    		<div class="small-6 large-6 columns">
			    			<a href="${more}" class="button right">Continue..</a>
			    		</div>
			    	</div>
			  </fieldset>
		</div>
	</div>
	
</body>
</html>