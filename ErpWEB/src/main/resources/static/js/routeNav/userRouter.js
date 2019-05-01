var app = angular.module("csmApp",["ngRoute","ngTable","angularMoment","ui.bootstrap","ngMessages","ui.bootstrap.datetimepicker","ngFileUpload"]);

app.config(function($routeProvider,$httpProvider) {
	
	$httpProvider.defaults.headers.common["X-Requested-With"] = 'XMLHttpRequest';
	
				$routeProvider.when('/', {
						templateUrl : '/user/dashboard',
						
				   })
					.when('/userDashboard', {
						templateUrl : '/user/dashboard',
						
				   })
				   .when('/customer', {
						templateUrl : '/customer/customerPage',
						controller : 'userCtrl'
				   })
				  .when('/useremailsettings_load', {
						templateUrl : '/emailtemplate/call_email_template_for_user',
						controller : 'userCtrl'
				   })
				   .when('/loadEmailCompose', {
						templateUrl : '/emailtemplate/emailComposeFormLoad',
						controller : 'userCtrl'
				   })
				   .when('/manageLogo_load', {
						templateUrl : '/userInit/manageLogo',
						controller : 'userCtrl'
				   })
				   .when('/theme_settings_load', {
						templateUrl : '/theme_settings/themeLoad',
						controller : 'userCtrl'
				   })
				   .when('/companyDetailsLoad', {
						templateUrl : '/userInit/loadCompanyDetailsForm',
						controller : 'userCtrl'
				   })
		
                   .when('/userprofile', {
                	  
						templateUrl : '/user/user_profile_load',
						controller : 'userCtrl'
				   })

				  .when('/change_password', {
						templateUrl : '/userInit/change_password_display',
						controller : 'userCtrl'
				   })
				   
				 .when('/projectload', {
						templateUrl : '/project/projectPageload',
						controller : 'userCtrl'
				   }) 
				   
				   .when('/projectListload', {
						templateUrl : '/project/projectListPageload',
						controller : 'userCtrl'
				   })
				   
				   	  .when('/itemload', {
						templateUrl : '/itemctrl/itemPageload',
						controller : 'userCtrl'
				   })
				   
				   	   	  .when('/itemListload', {
						templateUrl : '/itemctrl/itemListPageload',
						controller : 'userCtrl'
				   })
				   
				   	   	  .when('/vendorload', {
						templateUrl : '/vendorctrl/vendorPageload',
						controller : 'userCtrl'
				   })
				   
				   	   	  .when('/vendorListload', {
						templateUrl : '/vendorctrl/vendorListPageload',
						controller : 'userCtrl'
				   })
				   
				      	   	  .when('/vendorDocload', {
						templateUrl : '/vendorctrl/vendorDocPageload',
						controller : 'userCtrl'
				   })
				   
				   	   	  .when('/vendorDocListload', {
						templateUrl : '/vendorctrl/vendorDocListPageload',
						controller : 'userCtrl'
				   })
				   
					.otherwise({
						redirectTo : '/'
					})
});