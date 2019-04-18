<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div class="outer-wrapper">

	<div class="inner-wrapper">
		<div class="row pad30A">
			<div class="well login-well mrg10T" align="left">
				<div class="col-sm-12" style="border: 1px solid #4CAF50">
					

					<div class="col-sm-6" style="border-right: 1px solid green;" ng-show="accountDiv">
					
					<c:import url="/WEB-INF/views/messages/success.jsp"/>	
                    <c:import url="/WEB-INF/views/messages/error.jsp"/>	
                 	
                    
						<form class="form-horizontal"  id="signUpForm"  ng-submit="addDeatils(user)">
							<div class="form-group input-group-sm">
	<label for="">User Name</label>
	 <input type="text" class="form-control" placeholder="Enter Username" id="username" ng-change="checkUser(user.userName)"   ng-model="user.userName" onkeypress="return noSpace(event)"   required="required">
								<div style="color: red;" class="text-red" ng-show="sameUsername">
									Username already registered!</div>
							</div>
							<div class="form-group input-group-sm">
								<label for="">Password</label> <input type="password"
									ng-model="user.password" placeholder="Enter Password" id="firstpassword" onkeyup="checkSignupPassword()"
									class="form-control" required="required"> 
						     		
						     		<div id="pass_validation"  style='display:none;color: red'  >
                                       
                                    </div>
							</div>
							<div class="form-group input-group-sm">
								<label for="">Retype Password</label> <input type="password"
									id="reTypePassword"
									ng-model="user.retypePassword" class="form-control"   onkeyup="checkSignupPassword()"
									placeholder="Retype-password" required="required">
									<div id="repass_validation"  style='display:none;color: red'  >
                                       
                                    </div>

							</div>
							<div class="form-group input-group-sm">
								<label for="">Email</label> <input type="text"
									ng-model="user.email" ng-change="checkUserMail(user.email)" id='mail' onkeyup="emailValidation_Divid('mail','email_validation','Valid email required !! ')"   class="form-control"
									placeholder="Enter email" required="required">
									<div style="color: red;" class="text-red" ng-show="sameUserMail">
									Email  already registered!</div>
									
									<div id="email_validation"  style='display:none;color: red'  >
                                       
                                    </div>
							</div>
							<div class="form-group input-group-sm">
								
								
								<label for="">Phone</label> <input type="text"
									ng-model="user.phone" onkeypress="return isNumber(event)"  onkeyup="phoneNumberValidation_Divid('phone','phone_validation','Valid phone number required only !!')" id="phone" maxlength="15" class="form-control"
									placeholder="Enter phone" required="required">
									
									<div id="phone_validation"  style='display:none;color: red' >
                                       
                                    </div>
							</div>
							
							<div class="form-group input-group-sm">
								<label for="">First Name</label> <input type="text"
									ng-model="user.firstName" class="form-control"
									placeholder="Enter First Name" required="required">
							</div>
				
							<div class="form-group input-group-sm">
								<label for="">Last Name</label> <input type="text"
									ng-model="user.lastName" class="form-control"
									placeholder="Enter Last Name" required="required">
							</div>
							<div class="form-group input-group-sm">
								<label for="">Address</label> 
								
								<textarea rows="2" 		ng-model="user.address" class="form-control"
									placeholder="Enter address" required="required" ></textarea>
								
							
							</div>
							<div class="form-group input-group-sm">
								<label for="">City</label> <input type="text"
									ng-model="user.city" class="form-control"
									placeholder="Enter City" required="required">
							</div>
							<div class="row">
								<div class="col-sm-6">
									<div class="form-group input-group-sm">
										<label for="">State</label> <input type="text"
											ng-model="user.state" class="form-control"
											placeholder="Enter State" required="required">
									</div>
								</div>
								<div class="col-sm-6">
									<div class="form-group input-group-sm">
										<label for="">Zip</label>
						<input type="text"
											ng-model="user.zipCode" id="zipcode" onkeypress="return isNumber(event)"  onkeyup="zipCodeValidation_Divid('zipcode','zipcode_validation','Valid zip code required','indian')" maxlength="9" class="form-control"
											placeholder="Enter Zip" >

									</div>
									
										<div id="zipcode_validation"  style='display:none;color: red'  >
                                       
                                        </div>
								</div>
							</div>
							<div class="row">
								<div class="col-sm-6">
									<button type="submit"  class="btn btn-info btn-block mrg15B">Create
										Account</button>
								</div>
								<div class="col-sm-6">
									<button ng-click="signShow=false"
										class="btn btn-secondary btn-block mrg15B">Cancel</button>
								</div>
							</div>
							
						 <div class="row">
								
								<div class="col-sm-12">
									  <div id="processing" class="alert alert-info" style=' display:none'>

</div>
								</div>
							
							</div>
							
							
							
							
							
						</form>
					</div>
					
					<div class="col-sm-6" style="border-right: 1px solid green;" ng-hide="accountDiv">
					<br><br><br><br><br><br><br><br><br><br><br><br><div class="alert alert-success" >
					<h4 class="alert-heading">Well done!</h4>
		 			 <p>Your Account Successfully Created. Choose any subscription plan and make payment.</p>
					</div><br><br><br><br><br><br><br><br><br><br><br><br>
					</div>
					
					<div class="col-sm-6" ng-show="paymentDiv">
						<label class="control-label-small text-left">Please Choose
							Your Plan or Update it to a New One:</label>
						<div class="row">
							<div class="col-sm-4 pad15T pad15B" ng-repeat="palns in subsPlan">
								<div class="subs-container" align="center">
									<div class="header ng-binding">{{palns.planName}}</div>
									<div class="head-sub">Subscription</div>
									<div class="radio">
										<input type="radio" ng-model="user.subs"
											+{{$index}}  name="radio"
											+{{$index}} ng-click="subsChange(palns.month,palns.cost,palns.planName,palns)"
											class="styled ng-pristine ng-untouched ng-valid ng-not-empty"
											id={{$index}} checked=""> <label for={{$index}}
											class="text-warning"><span></span></label>
									</div>
									<div class="priceTop ng-binding">
										<small>TOTAL COST:</small>{{palns.cost|currency}}
									</div>
									<div class="priceBot ng-binding">({{palns.cost/palns.month
										|currency}} per Month)</div>
									<hr>
									<div class="expiresTop">Your Account Will Be Active
										Until:</div>
									<div class="expiresBot ng-binding">{{palns.dateTill}}</div>
								</div>
							</div>
						</div>
						
						<div class="row">
							<div class="col-sm-12">
								<br><br><br><br><br>
								<div class="plan-container">
									<div class="acc-header">Payment:</div>
									<div class="acc-mater">
										<!-- <button class="btn btn-info mrg15B" id="paypal-button-container">Connect With Stripe</button> -->
										<button id="customButton" class="stripe-button-el"
											style="padding-left: 28px; margin-left: 186px; margin-top: -36px; opacity: 0.65;"></button>
										<div style="opacity: 0.65; pointer-events: none;"
											id="paypal-button-container"></div>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="col-sm-6" ng-hide="paymentDiv">
			<br><br><br><br><br><br><br><br><br><br><br><br><div class="alert alert-success" >
			<h4 class="alert-heading">Success!</h4>
 			 <p>Your Payment Was Successfully. Now, <a href="" style="color : #f55555" ng-click="signShow=false">Login</a> to your account and start using application!</p>
			</div><br><br><br><br><br><br><br><br><br><br><br><br>
			</div>
				</div>
			</div>
		</div>
	</div>
</div>

<style>
.stripe-button-el {
	width: 194px;
	border-radius: 0;
	height: 36px;
	background-image: url(/img/blue-on-light.png);
}

h2 {
	text-align: center;
}

.fontCt {
	font-family: Arial, Helvetica, sans-serif;
}

.inputF {
	background: #f1f1f1;
}
</style>

<script type="text/javascript">
function checkEmailDuplicate()
{
$.get('userInit/getUserDetailsByEmail/'+$("#mail").val()).success(function(data) 
 	    {
 		console.log("Data....",data)	
 		var flag=parseFloat(data)
 		if(flag>0)
 			{
 			 $("#error").fadeIn(2000);
 		     $("#error").show();
	 	     $("#error").html("Email already registered !!"); 
	 	     $("#mail").val("");
	 	     $("#error").fadeOut(5000);
 			}

			});  	
}			



function checkSignupPassword()
{


var firstpassword=  document.getElementById("firstpassword").value
var spassword=  document.getElementById("reTypePassword").value




if(firstpassword!=spassword)
	{
	
	if(firstpassword!="" && spassword!="" )
		{
	     $("#pass_validation").show();
	     $("#pass_validation").html("<b>Password not matched !!</b>"); 
	     
	     $("#repass_validation").show();
	     $("#repass_validation").html("<b> Re Password not matched !!</b>"); 
		}
	
	
	}
if(firstpassword==spassword)
	{
	
	 $("#pass_validation").hide()
     $("#pass_validation").html(""); 
	 
	 $("#repass_validation").hide()
     $("#repass_validation").html(""); 
	
	}

}


function signup()
{
	
	  if($('#phone_validation').css('display') != 'none') 
		{
		alert()
		}
	
	
// 	  $( "#signUpForm").submit(); 
	
}

</script>
