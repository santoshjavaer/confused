<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<link href='http://fonts.googleapis.com/css?family=Slabo+27px' rel='stylesheet' type='text/css'>
<link href='http://fonts.googleapis.com/css?family=Glegoo' rel='stylesheet' type='text/css'>
<title>Quize View</title>
</head>
<body>
	<div class="header fixed">
			<jsp:include page="header.jsp"/>
	</div>
	
	<div  class="bodyContent">
			
			
			<div class="row margin-top-10 margin-bottom-10">
				<div class="small-12 large-8 columns large-centered" align="center">
					<ul class="stack-for-small radius secondary button-group custom right">
					  <li><div class="button">10 &nbsp;/&nbsp;30</div></li>
					  <li><div id="ms_timer" class="button">Button 2</div></li>
					</ul>
					
				</div>
			</div>
			
			<div class="row margin-top-10">
				<div class="small-12 large-12 columns">
					<div class="">
						<div class="row margin-top-10 margin-bottom-10">
							<div class="small-12 large-10 large-centered columns">
								<div class="questionPanel panel">
									<p><b>Ques:</b> Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.?</p>
									
									<div class="codeWrapperDiv">
										<div class="quesCode">class Abc implements Runable{</div>
												
										<div class="quesCode">  pubilc void run(){</div>
												
										<div class="quesCode">	  System.out.println("Hi, Naveen");</div>
												
										<div class="quesCode"> }</div>
																				
										<div class="quesCode">}</div>
									</div>
									<hr>
									
									<p>Choose your answer</p>
									<label><input type="radio" name="santosh"> Santosh</label>
									<label><input type="radio" name="santosh"> Santosh</label>
									<label><input type="radio" name="santosh"> Santosh</label>
									<label><input type="radio" name="santosh"> Santosh</label>
									
									<div align="right">
										<input type="submit" name="next" value="next" class="button small">							
									</div>
								</div>
							</div>
						</div>
						
					</div>
				</div>
			</div>
	</div>
	
	<div>
		<jsp:include page="footer.jsp"/>
	</div>
	
	<script src="${pageContext.request.contextPath}/foundation/js/jquery.js"></script>
	<script src="${pageContext.request.contextPath}/foundation/js/foundation.min.js"></script>
	<script src="${pageContext.request.contextPath}/foundation/js/jquery.countdownTimer.min.js"></script>
	
	<script>
		$(document).foundation();
		
		$( document ).ready(function() {
		    console.log( "ready!" );
		    
		    $("#ms_timer").countdowntimer({
		    	minutes	: 30,
		    	second	: 0,
		    	size	: "lg",
		    	pauseButton	: "pauseBtnhms",
		    	stopButton	: "stopBtnhms"
		    });
		    
		});
		
	</script>
	
	
	
	</body>
</html>