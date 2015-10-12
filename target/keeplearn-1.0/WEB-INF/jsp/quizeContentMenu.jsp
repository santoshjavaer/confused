
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<link href='http://fonts.googleapis.com/css?family=Slabo+27px' rel='stylesheet' type='text/css'>
<link href='http://fonts.googleapis.com/css?family=Glegoo' rel='stylesheet' type='text/css'>
<title>Quize Content Menu</title>
</head>
<body>
	<div class="header fixed">
			<jsp:include page="header.jsp"/>
	</div>
	
	<div  class="bodyContent">
			
			<div class="row margin-top-10 margin-bottom-10">
					<div class="small-12 large-12 columns" align="center">
						<h2 class="topicTitle">Now click on any topic test your knowledge</h2>
					</div>
			</div>
	
	
			<div class="row" data-equalizer>
				<div class="small-12 large-4 columns">
					<div class="boxWrapper panel " data-equalizer-watch>
						<span class="technologyIcon">	
							<img alt="" src="${pageContext.request.contextPath}/foundation/images/javaIcon.png"/>
						</span>
						<h2>Java Technology</h2>
						<p>Go! For Java Related Test</p>
						<a href="quizeTopicContent" class="button small radius">Go Now</a>
					</div>
				</div>
				<div class="small-12 large-4 columns">
					<div class="boxWrapper panel" data-equalizer-watch>
						<span class="technologyIcon">	
							<img alt="" src="${pageContext.request.contextPath}/foundation/images/sql.png"/>
						</span>
						<h2>SQL</h2>
						<p>Go! For SQL Test</p>
						<a class="button small radius">Go Now</a>
					</div>
				</div>
				<div class="small-12 large-4 columns">
					<div class="boxWrapper panel " data-equalizer-watch>
						<span class="technologyIcon">	
							<img alt="" src="${pageContext.request.contextPath}/foundation/images/ds.png"/>
						</span>
						<h2>Data Structure</h2>
						<p>Go! For Data Structure Test</p>
						<a class="button small radius">Go Now</a>
					</div>
				</div>
			</div>
			
			<div class="row" data-equalizer>
				<div class="small-12 large-4 columns">
					<div class="boxWrapper panel " data-equalizer-watch>
						<span class="technologyIcon">	
							<img alt="" src="${pageContext.request.contextPath}/foundation/images/c.png"/>
						</span>
						<h2>C</h2>
						<p>Go! For C Test</p>
						<a class="button small radius">Go Now</a>
					</div>
				</div>
				<div class="small-12 large-4 columns">
					<div class="boxWrapper panel" data-equalizer-watch>
						<span class="technologyIcon">	
							<img alt="" src="${pageContext.request.contextPath}/foundation/images/cpp.png"/>
						</span>
						<h2>C++</h2>
						<p>Go! For C++ Test</p>
						<a class="button small radius">Go Now</a>
					</div>
				</div>
				<div class="small-12 large-4 columns">
					<div class="boxWrapper panel " data-equalizer-watch>
						<span class="technologyIcon">	
							<img alt="" src="${pageContext.request.contextPath}/foundation/images/jquery.png"/>
						</span>
						<h2>JQuery</h2>
						<p>Go! For JQuery Test</p>
						<a class="button small radius">Go Now</a>
					</div>
				</div>
			</div>
			
			<div class="row" data-equalizer>
				<div class="small-12 large-4 columns">
					<div class="boxWrapper panel " data-equalizer-watch>
						<span class="technologyIcon">	
							<img alt="" src="${pageContext.request.contextPath}/foundation/images/javaIcon.png"/>
						</span>
						<h2>Place holder</h2>
						<p>Go! For Place holder Test</p>
						<a class="button small radius">Go Now</a>
					</div>
				</div>
				<div class="small-12 large-4 columns">
					<div class="boxWrapper panel" data-equalizer-watch>
						<span class="technologyIcon">	
							<img alt="" src="${pageContext.request.contextPath}/foundation/images/javaIcon.png"/>
						</span>
						<h2>Place holder</h2>
						<p>Go! For Place holder Test</p>
						<a class="button small radius">Go Now</a>
					</div>
				</div>
				<div class="small-12 large-4 columns">
					<div class="boxWrapper panel " data-equalizer-watch>
						<span class="technologyIcon">	
							<img alt="" src="${pageContext.request.contextPath}/foundation/images/javaIcon.png"/>
						</span>
						<h2>Place holder</h2>
						<p>Go! For Place holder Test</p>
						<a class="button small radius">Go Now</a>
					</div>
				</div>
			</div>
	</div>
	
	<div>
		<jsp:include page="footer.jsp"/>
	</div>
	
	<script src="${pageContext.request.contextPath}/foundation/js/jquery.js"></script>
	<script src="${pageContext.request.contextPath}/foundation/js/foundation.min.js"></script>
	
	<script>
		$(document).foundation();
	</script>
	<!-- <script>
		function mvDropDownSection(elem,divId){
			var group = $(elem).attr("groupID");
	
			if (typeof group  !== "undefined")
			$("*[group="+group+"]").not(elem).slideUp();
			if(typeof divId  !== "undefined"){
				$("#"+divId).stop().slideToggle("fast");
			}
		}


		$(document).on("click","*[mvAcordianDiv]",function(event){
			event.preventDefault();
			mvDropDownSection($(this),$(this).attr("mvAcordianDiv"));
		});
	</script> -->
</body>
</html>