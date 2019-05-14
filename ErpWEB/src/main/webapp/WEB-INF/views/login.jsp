<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html ng-app="adminApp" ng-controller="adminCtrl" ng-cloak>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>Login Page</title>
<!-- Tell the browser to be responsive to screen width -->
<meta
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no"
	name="viewport">
<!-- Bootstrap 3.3.7 -->
<link rel="stylesheet" href="/css/bootstrap.min.css">
<!-- Font Awesome -->
<link rel="stylesheet" href="/css/font-awesome.css">
<!-- Ionicons -->
<link rel="stylesheet" href="/css/ionicons.css">
<!-- Icofonts -->
<link rel="stylesheet" href="/css/icofont.css">
<!-- Select2 -->
<link rel="stylesheet" href="/css/select2.min.css">
<!-- Theme style -->
<link rel="stylesheet" href="/css/AdminLTE.css">
<!-- AdminLTE Skins. Choose a skin from the css/skins
       folder instead of downloading all of them to reduce the load. -->
<link rel="stylesheet" href="/css/all-skins.min.css">
<!-- Morris chart -->
<link rel="stylesheet" href="/css/morris.css">
<!-- jvectormap -->
<link rel="stylesheet" href="/css/jquery-jvectormap.css">
<!-- Date Picker -->
<link rel="stylesheet" href="/css/bootstrap-datepicker.min.css">
<!-- Daterange picker -->
<link rel="stylesheet" href="/css/daterangepicker.css">
<!-- Bootstrap Color Picker -->
<link rel="stylesheet" href="/css/bootstrap-colorpicker.min.css">
<!-- Bootstrap time Picker -->
<link rel="stylesheet" href="/css/bootstrap-timepicker.min.css">
<!-- bootstrap wysihtml5 - text editor -->
<link rel="stylesheet" href="/css/wysihtml5.min.css">
<!-- iCheck for checkboxes and radio inputs -->
<link rel="stylesheet" href="/css/iCheck/all.css">
<!-- Text Editor -->
<link rel="stylesheet" href="/css/text-editor.css">

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
  <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
  <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
  <![endif]-->


<!-- Google Font -->
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700,300italic,400italic,600italic">



<script type="text/javascript">
	history.pushState(null, null, location.href);
	window.onpopstate = function() {
		history.go(1);
	};
</script>
</head>

<body class="hold-transition login-page">
	<div class="login-box">
		<div class="login-logo">
			<a > <b>Param Enterprises Pvt.Ltd.</b></a>
		</div>

		<div class="login-box-body">
			<p class="login-box-msg">Sign in to start your session</p>
			<form name='loginForm' action="<c:url value='/login' />"
				id="loginform" method='POST'>
				<div class="form-group has-feedback">
					<select id="usertype" class="custom-select form-control">
						<option value="">User Type</option>
						<option value="1">Admin</option>
						<option value="2">User</option>

					</select>

					<div id="usertype_validation" style='display: none; color: red'>

					</div>
				</div>

				<div class="form-group has-feedback">
					<div id="success2"
						style="position: fixed; left: 50%; transform: translate(-50%, 0); display: none">
						<img src="/img/processing.gif" height="130px" width="130px">
					</div>

					<div id="processing2"
						style="position: fixed; left: 50%; transform: translate(-50%, 0); display: none">

						<img src="/img/processing.gif">

					</div>
				</div>


				<div class="form-group has-feedback">

					<input type="text" name="email" class="form-control" id="email"
						placeholder="Login ID" required>

					<div id="login_validation" style='display: none; color: red'>

					</div>




					<span class="glyphicon glyphicon-user form-control-feedback"></span>
				</div>
				<div class="form-group has-feedback">
					<input type="password" class="form-control" name="password"
						id="password" placeholder="Password" required>


					<div id="password_validation" style='display: none; color: red'>

					</div>

					<input type="hidden" class="form-control"
						name="${_csrf.parameterName}" value="${_csrf.token}"> <span
						class="glyphicon glyphicon-lock form-control-feedback"></span>
				</div>
				<div class="row">
					<div class="col-xs-8">
						<div class="checkbox">
							<input type="checkbox" class="styled" id="1" /> <label for="1"
								class="text-default">Remember Me</label>
						</div>
					</div>
					<div class="col-xs-4">
						<button type="button" id="btlogin" onclick="logionValidation()"
							ng-disabled="loginForm.$invalid"
							class="btn btn-info btn-block btn-flat">Sign In</button>
					</div>






				</div>
				<div class="row">
					<div id="error2" class="col-xs-12" style="color: red"></div>
				</div>
			</form>
			<!--<a href="forgot.html">I forgot my password</a><br>
        <a href="register.html" class="text-center">Register a new membership</a> </div>-->
		</div>

		<!-- jQuery 3 -->
		<script src="assets/js/jquery-3.3.1.js"></script>
		<!-- jQuery UI 1.11.4 -->
		<script src="assets/js/jquery-ui.min.js"></script>
		<!-- Resolve conflict in jQuery UI tooltip with Bootstrap tooltip -->
		<script>
			$.widget.bridge('uibutton', $.ui.button);
		</script>
		<!-- Bootstrap 3.3.7 -->
		<script src="/lib/js/bootstrap.min.js"></script>
		<!-- Select2 -->
		<script src="/lib/js/select2.full.min.js"></script>
		<!-- Morris.js charts -->
		<script src="/lib/js/raphael.min.js"></script>

		<!-- Sparkline -->
		<script src="/lib/js/jquery.sparkline.min.js"></script>
		<!-- jvectormap -->
		<script src="/lib/js/jquery-jvectormap-1.2.2.min.js"></script>
		<script src="/lib/js/jquery-jvectormap-world-mill-en.js"></script>
		<!-- jQuery Knob Chart -->
		<script src="/lib/js/jquery.knob.min.js"></script>
		<!-- daterangepicker -->
		<script src="/lib/js/moment.min.js"></script>
		<script src="/lib/js/daterangepicker.js"></script>
		<!-- datepicker -->
		<script src="/lib/js/bootstrap-datepicker.min.js"></script>
		<!-- bootstrap color picker -->
		<script src="/lib/js/bootstrap-colorpicker.min.js"></script>
		<!-- bootstrap time picker -->
		<script src="/lib/js/bootstrap-timepicker.min.js"></script>
		<!-- Bootstrap WYSIHTML5 -->
		<script src="/lib/js/wysihtml5.all.min.js"></script>
		<!-- Slimscroll -->
		<script src="/lib/js/jquery.slimscroll.min.js"></script>
		<!-- Text Editor -->
		<script src="/lib/js/text-editor.js"></script>
		<!-- FastClick -->
		<script src="/lib/js/fastclick.js"></script>
		<!-- AdminLTE App -->
		<script src="/lib/js/adminlte.min.js"></script>
		<!-- AdminLTE dashboard demo (This is only for demo purposes) -->
		<script src="/lib/js/dashboard.js"></script>



		<script src="/lib/angular.js" /></script>
		<script src="/lib/angular-route.min.js" /></script>
		<!-- <script src="/lib/angular.js"/></script> -->
		<!-- <script src="/lib/angular-route.min.js"/></script> -->
		<script src="/lib/ng-table.min.js"></script>
		<script src="/lib/moment.js" /></script>
		<script src="/lib/angular-model.js" /></script>
		<script src="/lib/angular-moment.min.js" /></script>
		<script src="/lib/ng-file-upload-all.min.js" /></script>
		<script src="/lib/ng-file-upload-shim.min.js" /></script>
		<script src="/js/routeNav/adminRouteNav.js" /></script>
		<script src="/js/controller/adminCtrl.js" /></script>
		<script src="/lib/checkout.js"></script>
		<script src="/lib/boostrap-UI.js"></script>
		<script src="/lib/angular-messages.js" /></script>
		<script src='/lib/jsPdf.min.js'></script>
		<script type="text/javascript" src="/js/moduleJs/projectValidation.js"></script>

		<script type="text/javascript"
			src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js">
			
		</script>

		<script type="text/javascript">
			// login  validation +++++++++++++++++++++++++++++++++++++++++++++++++++++++	
			function logionValidation() {

				var flag = 0;
				if ($("#email").val() == "") {
					$("#success2").fadeOut();
					$("#login_validation").show();
					$("#login_validation").html("Email/ User name required !!");

				}

				if ($("#email").val() != "") {
					$("#success2").fadeOut();
					$("#login_validation").hide();

				}

				if ($("#password").val() == "") {

					$("#success2").fadeOut();
					$("#password_validation").show();
					$("#password_validation").html("Password required !!");

				}

				if ($("#usertype").val() == "") {

					$("#success2").fadeOut();
					$("#usertype_validation").show();
					$("#usertype_validation").html("User Type Required !!");

				}

				if ($("#usertype").val() != "") {

					$("#success2").fadeOut();
					$("#usertype_validation").hide();

				}

				if ($("#password").val() != "") {
					$("#success2").fadeOut();
					$("#password_validation").hide();

				}

				if ($("#email").val() != "" && $("#password").val() != ""
						&& $("#usertype").val() != "") {
					$("#error2").fadeOut();
					$("#login_validation").hide();
					$("#password_validation").hide();

					$
							.post(
									'/loginValidation?email='
											+ $("#email").val() + '&password='
											+ $("#password").val())
							.success(
									function(data) {
										console.log("Data....", data)
										flag = parseFloat(data)
										if (flag == 1) {

											var email = $("#email").val();
											var url = '/userInit/getUserDetailsByUsername?email='
													+ email;

											$
													.post(url)
													.success(
															function(userdetail) {

																$("#email")
																		.val(
																				userdetail[0].userName)

																$("#btlogin")
																		.text(
																				"Signing in ...")

																$("#loginform")
																		.submit();

															});
										}
										if (flag == 0) {
											$("#error2").show();
											$("#error2")
													.html(
															"Invalid credentials found !!");
											$("#error2").fadeOut(8000);
											$("#success2").fadeOut();
										}

										if (flag == 2) {
											$("#error2").show();
											$("#error2")
													.html(
															"Your account is de-activated !!");
											$("#error2").fadeOut(8000);
											$("#success2").fadeOut();
										}

									});
				}
			}
		</script>
</body>
</html>
