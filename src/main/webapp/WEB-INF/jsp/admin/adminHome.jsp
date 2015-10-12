<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Admin Home</title>
<link href='http://fonts.googleapis.com/css?family=Slabo+27px' rel='stylesheet' type='text/css'>
<link href='http://fonts.googleapis.com/css?family=Glegoo' rel='stylesheet' type='text/css'>
<link rel="stylesheet" href="${pageContext.request.contextPath}/foundation/css/menu.css" />

<script src="${pageContext.request.contextPath}/foundation/js/modernizr.js"></script>
</head>
<body class="eternity-form scroll-animations-activated">

	<div class="header fixed">
			<jsp:include page="../header.jsp"/>
	</div>
	
	<div  class="bodyContent">
	
		<div class="row maxWidth">
			<div class="small-12 large-3 columns">
			
				<div id='cssmenu'>
					<ul>
					   <li class='active'><a href='#'><span>Home</span></a></li>
					   <li class='has-sub'><a href='#'><span>Products</span></a>
					      <ul>
					         <li><a href='#'><span>Product 1</span></a></li>
					         <li><a ><span>Product 2</span></a></li>
					         <li class='last'><a href='#'><span>Product 3</span></a></li>
					      </ul>
					   </li>
					   <li class='has-sub'><a><span>Quiz Configuration</span></a>
					      <ul>
					         <li><a href='addQuizTech'><span>Add Technology</span></a></li>
					         <li><a href='addTopic'><span>Add Topic</span></a></li>
					         <li><a href='createQuiz'><span>Create Quiz</span></a></li>
					         <li><a href='updateQuiz'><span>Update Quiz</span></a></li>
					         <li><a href='viewQuiz'><span>View Set</span></a></li>
					         <li class='last'><a href='uploadQuestion'><span>Upload Question</span></a></li>
					      </ul>
					   </li>
					   <li class='has-sub'><a href='#'><span>About</span></a>
					      <ul>
					         <li><a href='#'><span>Company</span></a></li>
					         <li class='last'><a href='#'><span>Contact</span></a></li>
					      </ul>
					   </li>
					   <li class='last'><a href='#'><span>Contact</span></a></li>
					</ul>
				</div>
			
				
				<!-- <ul class="menuWrapper">
					<li mvAcordianDiv groupID="group1" class="selected">
						<a href="dashboard">DashBoard</a>
					</li>
					
					<li>
	                    <span mvAcordianDiv="div2" groupID="group1">Topic</span>
	                    <ul class="hide menuWrapper" id="div2" group="group1">
	                    	<li><a href="#">Java</a></li>
	                    	<li><a href="#">SQL</a></li>
	                    	<li><a href="#">DS</a></li>
	                    	<li><a href="#">C++</a></li>
	                    	<li><a href="#">C</a></li>
	                    </ul>
					</li>
					<li mvAcordianDiv groupID="group1">
						<a href="#">Tables</a>
					</li>
					<li>
	                    <span mvAcordianDiv="div3" groupID="group1">Quiz Configuration</span>
	                    <ul class="hide menuWrapper" id="div3" group="group1">
	                    	<li><a href="addQuizTech">Add Technology</a></li>
	                    	<li><a href="addTopic">Add Topic</a></li>
	                    	<li><a href="uploadJavaQuestion">Add Questions</a></li>
	                    </ul>
					</li>
				</ul> -->
			</div>
			<div class="small-12 large-9 columns">
				 <jsp:include page="/WEB-INF/jsp/admin/${dynamicPage}.jsp"/>
			</div>
		</div>
			
	</div>
	
	<div>
		<jsp:include page="../footer.jsp"/>
	</div>
	
	<script src="${pageContext.request.contextPath}/foundation/js/jquery.js"></script>
	<script src="${pageContext.request.contextPath}/foundation/js/foundation.min.js"></script>
	<script src="${pageContext.request.contextPath}/foundation/js/menu.js"></script>
	
	
	<script>
		$(document).foundation();
		
		
		/* $(document).ready(function() {
			
			$('ul li a').click(function(){
				$('ul').children().removeClass('selected');
				$(this).closest('li').addClass('selected');
			});
			
			
			$(document).on('click',"*[mvAcordianDiv]",function(event){
				event.preventDefault();
				mvDropDownSection($(this),$(this).attr("mvAcordianDiv"));
			});
			
			function mvDropDownSection(elem, divId){
				var group = $("#"+divId).attr("group");
				
				if(typeof group !== "undefined")
					$("*[group="+group+"]").not(elem).slideUp();
				
				if(typeof group !== "undefined"){
					$("#"+divId).stop().slideToggle("fast");
				}
			}
		}); */
		
		
	</script>
</body>
</html>