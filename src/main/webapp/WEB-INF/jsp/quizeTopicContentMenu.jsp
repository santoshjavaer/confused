<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<link href='http://fonts.googleapis.com/css?family=Slabo+27px'
	rel='stylesheet' type='text/css'>
<link href='http://fonts.googleapis.com/css?family=Glegoo'
	rel='stylesheet' type='text/css'>
<title>Quize Content Topic</title>
</head>
<body>
	<div class="header fixed">
		<jsp:include page="header.jsp" />
	</div>

	<div class="bodyContent">
 
				<div class="row margin-top-10 margin-bottom-10">
					<div class="small-12 large-12 columns quizeContentTitle" align="center">
						<h2 class="topicTitle">Now click on any topic test your knowledge</h2>
					</div>
				</div>
				
				
				<div class="row">
					<div class="small-12 large-12 columns quizeContentTitle">
						<a href="quizeView" class="topicRow" mvAcordianDiv="quizeView1" groupID="group1">
							<div class="row">
								<div class="small-3 large-3 columns" align="right">
									<span> 
										<img class="indicator" alt="" src="${pageContext.request.contextPath}/foundation/images/finger.png" width="45" height="45"/>
									</span>
								</div>
								<div class="small-9 large-9 columns">
									<h2>Oracle Certified Java Programmer Test (OCJP)</h2>
								</div>
							</div>
						</a>
						
						
						
						<div id="quizeView1" class="panel hide" group="group1" align="center">
							<div>
								<h2>Quiz Details</h2>
							</div>
							<div class="row collapse">
								<div class="small-4 columns">
									<h2>Questions</h2><p>20</p>
								</div>
								<div class="small-4 columns">
									<h2>Time</h2><p>30 Minutes</p>
								</div>
								<div class="small-4 columns">
									<h2>Level</h2><p>As</p>
								</div>
							</div>
						
							<a href="quizeView" class="button Tiny"> Start Quiz</a>
						</div>
						
					</div>
				</div>
				
				<div class="row">
					<div class="small-12 large-12 columns quizeContentTitle">
						<a href="quizeView" class="topicRow">
							<div class="row">
								<div class="small-3 large-3 columns" align="right">
									<span> 
										<img class="indicator" alt="" src="${pageContext.request.contextPath}/foundation/images/finger.png" width="45" height="45"/>
									</span>
								</div>
								<div class="small-9 large-9 columns">
									<h2>Oracle Certified Web Component Developer Test (OCWCD)</h2>
								</div>
							</div>
						</a>
					</div>
				</div>
				
				<div class="row">
					<div class="small-12 large-12 columns quizeContentTitle">
						<a href="quizeView" class="topicRow">
							<div class="row">
								<div class="small-3 large-3 columns" align="right">
									<span> 
										<img class="indicator" alt="" src="${pageContext.request.contextPath}/foundation/images/finger.png" width="45" height="45"/>
									</span>
								</div>
								<div class="small-9 large-9 columns">
									<h2>Core Java Test (JSE)</h2>
								</div>
							</div>
						</a>
					</div>
				</div>
						
				<div class="row">
					<div class="small-12 large-12 columns quizeContentTitle">
						<a href="quizeView" class="topicRow">
							<div class="row">
								<div class="small-3 large-3 columns" align="right">
									<span> 
										<img class="indicator" alt="" src="${pageContext.request.contextPath}/foundation/images/finger.png" width="45" height="45"/>
									</span>
								</div>
								<div class="small-9 large-9 columns">
									<h2>Advance Java Test (JEE)</h2>
								</div>
							</div>
						</a>
					</div>
				</div>
				
				<div class="row">
					<div class="small-12 large-12 columns quizeContentTitle">
						<a href="quizeView" class="topicRow">
							<div class="row">
								<div class="small-3 large-3 columns" align="right">
									<span> 
										<img class="indicator" alt="" src="${pageContext.request.contextPath}/foundation/images/finger.png" width="45" height="45"/>
									</span>
								</div>
								<div class="small-9 large-9 columns">
									<h2>Spring Framework Test</h2>
								</div>
							</div>
						</a>
					</div>
				</div>
				<div class="row">
					<div class="small-12 large-12 columns quizeContentTitle">
						<a href="#" class="topicRow" mvAcordianDiv="quizeView1" groupID="group1">
							<div class="row">
								<div class="small-3 large-3 columns" align="right">
									<span> 
										<img class="indicator" alt="" src="${pageContext.request.contextPath}/foundation/images/finger.png" width="45" height="45"/>
									</span>
								</div>
								<div class="small-9 large-9 columns">
									<h2>Hibernate Test</h2>
								</div>
							</div>
						</a>
						<!-- <div id="quizeView1" class="panel" group="group1">
							<a href="quizeView" class="button Tiny"> Start Quize</a>
						</div> -->
					</div>
				</div>
				<div class="row">
					<div class="small-12 large-12 columns quizeContentTitle">
						<a href="#" class="topicRow" mvAcordianDiv="quizeView" groupID="group1">
							<div class="row">
								<div class="small-3 large-3 columns" align="right">
									<span> 
										<img class="indicator" alt="" src="${pageContext.request.contextPath}/foundation/images/finger.png" width="45" height="45"/>
									</span>
								</div>
								<div class="small-9 large-9 columns">
									<h2>Web Services Test</h2>
								</div>
							</div>
						</a>
						<!-- <div id="quizeView" class="panel" group="group1">
							<a href="quizeView" class="button Tiny"> quizeView</a>
						</div> -->
					</div>
				</div>
	</div>

	<div>
		<jsp:include page="footer.jsp" />
	</div>

	<script
		src="${pageContext.request.contextPath}/foundation/js/jquery.js"></script>
	<script
		src="${pageContext.request.contextPath}/foundation/js/foundation.min.js"></script>

	<script>
		$(document).foundation();
	</script>
	
	<script>
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
	</script>

</body>
</html>