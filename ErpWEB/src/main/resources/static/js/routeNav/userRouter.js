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
		
                   .when('/userprofile', 
                   {
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
				   .when('/accountsListload', {
						templateUrl : '/accounts/accountsListPageload',
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
				   
				     .when('/viewProjectItem', {
						templateUrl : '/project/projectItemViewload',
						controller : 'userCtrl'
				   })
				   
				   
				   .when('/addNewturnover/:project_code', {
						templateUrl : '/accounts/turnover',
						controller : 'userCtrl'
				   })
				    .when('/payments', {
						templateUrl : '/accounts/allPaymentsPage',
						controller : 'userCtrl'
				   })
				   .when('/payments/:projectId', {
						templateUrl : '/accounts/paymentsPage',
						controller : 'userCtrl'
				   })
				   .when('/projects/:projectCode', {
						templateUrl : '/project/projectLocationsPage',
						controller : 'userCtrl'
				   })
				   .when('/uploadDocument', {
						templateUrl : '/project/document',
						controller : 'userCtrl'
				   })
				   .when('/transport', {
						templateUrl : '/transport',
						controller : 'userCtrl'
				   })
				   .when('/addtransport', {
						templateUrl : '/transport/add',
						controller : 'userCtrl'
				   })
				   .when('/project/:projectCode/:locationId', {
						templateUrl : '/project/items/itemsPage',
						controller : 'userCtrl'
				   })
				   
				   

					.otherwise({
						redirectTo : '/'
					})
});