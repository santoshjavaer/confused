<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
</head>
<body>
	<div class="row margin-top-13">
		<div class="small-12 large-12 columns">
			<div class="panel callout panelLayout radius">
			  <div class="row">
				<div class="large-6 small-6 columns"><label class="right"><b>Technology</b></h3></div>
				<div class="large-6 small-6 columns"><label></label>${quizComfirmation.technologyName}</div>
			</div>
			<div class="row">
			
				<c:set var="setIdentity" value="${quizComfirmation.seriesName}"></c:set>
				<c:if test="${empty 'seriesName'}">
					<c:set var="setIdentity" value="${quizComfirmation.seriesId}"></c:set>
				</c:if>
				
				<div class="large-6 small-6 columns"><label class="right"><b>Set Name</b></label></div>
				<div class="large-6 small-6 columns"><label>${setIdentity}</label></div>
			</div>
			<div class="row">
				<div class="samll-12 large-6 large-centered small-centered columns">
				
					<form:form action="uploadQuestion" method="GET" commandName="commonObject">
						<form:hidden path="seriesId" value="${quizComfirmation.seriesId}"/>
						<form:hidden path="technologyId" value="${quizComfirmation.technologyId}" />
						<input type="submit" value="Continue" class="button success right"/>
					</form:form>
				</div>
			</div>
			</div>
			
		</div>
	</div>
</body>
</html>