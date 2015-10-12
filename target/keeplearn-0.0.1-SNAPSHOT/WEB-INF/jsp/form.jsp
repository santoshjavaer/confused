<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<div class="row">
		<div class="large-7 columns large-centered show-for-large-only">
			<div id="loginForm" class="reveal-modal tiny" data-reveal aria-labelledby="modalTitle" aria-hidden="true" role="dialog">
				<div id="formLayout">
                    <%-- <form action="login"> --%>
                    <form:form action="login" commandName="command" method="post">
                    		<div>
                    			<h1> Sign In </h1> 
                    		</div>
                       		<div>
                      			    <label for="emailsignup" class="youmail" data-icon="e" > Your email</label>
                                   	<form:input path="userEmail" required="required" type="email" placeholder="santoshkumar@gmail.com"/>
                       		</div> 
                       		<div>
                                   <label for="passwordsignup" class="youpasswd" data-icon="p">Your password </label>
                                   <form:input path="userPassword" required="required" type="password" placeholder="xyz777"/>
                       		</div> 
                       		<div align="right">
								<input type="submit" value="Login" class="button"/> 
                       		</div>
                    </form:form>
                    		<%-- <div>
                    			<h1> Sign In </h1> 
                    		</div>
                       		<div>
                      			    <label for="emailsignup" class="youmail" data-icon="e" > Your email</label>
                                   <!-- <input id="email" name="emailId" required="required" type="email" placeholder="santoshkumar@mail.com"/>  -->
                                   
                       		</div> 
                       		<div>
                                   <label for="passwordsignup" class="youpasswd" data-icon="p">Your password </label>
                                   <input id="password" name="password" required="required" type="password" placeholder="eg. X8df!90EO"/>
                       		</div> 
                       		<div align="right">
								<input type="submit" value="Login" class="button"/> 
                       		</div>
                    </form> --%>
				</div>
                <a class="close-reveal-modal" aria-label="Close">&#215;</a>
			</div>
			
			<div id="signUpForm" class="reveal-modal tiny signUpLayout" data-reveal aria-labelledby="modalTitle" aria-hidden="true" role="dialog">
                        <div id="formLayout">
                            <form  action="" autocomplete="on"> 
                                <h1> Sign up </h1> 
                                <p> 
                                    <label for="usernamesignup" class="formLevel" data-icon="u">Your username</label>
                                    <input id="usernamesignup" name="usernamesignup" required="required" type="text" placeholder="santoshkumar" />
                                </p>
                                <p> 
                                    <label for="emailsignup" class="youmail" data-icon="e" > Your email</label>
                                    <input id="emailsignup" name="emailsignup" required="required" type="email" placeholder="santoshkumar@mail.com"/> 
                                </p>
                                <p> 
                                    <label for="passwordsignup" class="youpasswd" data-icon="p">Your password </label>
                                    <input id="passwordsignup" name="passwordsignup" required="required" type="password" placeholder="eg. X8df!90EO"/>
                                </p>
                                <p> 
                                    <label for="passwordsignup_confirm" class="youpasswd" data-icon="p">Please confirm your password </label>
                                    <input id="passwordsignup_confirm" name="passwordsignup_confirm" required="required" type="password" placeholder="eg. X8df!90EO"/>
                                </p>
                                <div align="right">
									<input type="submit" value="Sign up" class="button"/> 
                                </div>
                            </form>
                        </div>
                <a class="close-reveal-modal" aria-label="Close">&#215;</a>
			</div>
			
		</div>
</div>