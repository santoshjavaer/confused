<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<link rel="stylesheet" href="${pageContext.request.contextPath}/foundation/css/foundation.min.css" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/foundation/css/commonStyle.css" />


<nav class="top-bar headerHight" data-topbar role="navigation">
		  <ul class="title-area">
		    <li class="name">
		      <h1><a href="welcome">Place Holder</a></h1>
		    </li>
		    <!-- <li class="toggle-topbar menu-icon"><a href="#"><span>Menu</span></a></li> -->
		  </ul>
		
		  <section class="top-bar-section">
		    <ul class="right">
		    
		    <c:choose>
		    	<c:when test="${not empty 'userDetails'}">
		    		<li><a href="${pageContext.request.contextPath}/j_spring_security_logout" data-reveal-id="signUpForm">${userDetails}</a></li>
		    	</c:when>
		    	<c:otherwise>
		     		<li><a href="#" data-reveal-id="loginForm">Login</a></li>
		    	</c:otherwise>	
		    </c:choose>
		    
		    </ul>
		  </section>
</nav>