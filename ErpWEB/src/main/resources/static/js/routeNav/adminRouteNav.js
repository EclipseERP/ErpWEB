var app = angular.module("adminApp",["ngRoute","ngTable","angularMoment","ui.bootstrap","ngMessages"]);

app.directive('pwCheck', [function () {
    return {
        require: 'ngModel',
        link: function (scope, elem, attrs, ctrl) {
          var firstPassword = '#' + attrs.pwCheck;
          elem.add(firstPassword).on('keyup', function () {
            scope.$apply(function () {
              var v = elem.val()===$(firstPassword).val();
              ctrl.$setValidity('pwmatch', v);
            });
          });
        }
      }
    }]);


app.config(function($routeProvider,$httpProvider) {
	
	
	$httpProvider.defaults.headers.common["X-Requested-With"] = 'XMLHttpRequest';
	

				$routeProvider.when('/', {
						templateUrl : '/admin/dashboard',
						controller : 'adminCtrl'
						
				   })
					.when('/userDashboard', {
						templateUrl : '/admin/dashboard',
						/*controller : 'adminCtrl'*/
						
				   })
				   .when('/userManagement', {
						templateUrl : '/admin/userManagement',
						controller : 'adminCtrl'
						
				   
				   })

				   .when('/subscription', {
						templateUrl : '/admin/subscription',
						controller : 'adminCtrl'
						
				   })
				    .when('/cupcakesPricing', {
						templateUrl : '/cupCakePricing/cpCakePricePage',
						controller : 'adminCtrl'
						
				   })
				   .when('/recipePricingList', {
						templateUrl : '/recipePrice/recipePricePage',
						controller : 'adminCtrl'
						
				   })
				   .when('/fillingPricingList', {
						templateUrl : '/fillingPrice/fillingPricePage',
						controller : 'adminCtrl'
						
				   })
				   .when('/toppingPricingList', {
						templateUrl : '/toppingPricing/toppingPricingPage',
						controller : 'adminCtrl'
						
				   })
				   .when('/wrapperPricingList', {
						templateUrl : '/wrapperPricing/wrapperPricingPage',
						controller : 'adminCtrl'
						
				   })
				   .when('/wrapperList', {
						templateUrl : '/wrappers/wrapperPage',
						controller : 'adminCtrl'
						
				   })
				   .when('/toppingList', {
						templateUrl : '/toppings/toppingPage',
						controller : 'adminCtrl'
						
				   })
				   .when('/materials', {
						templateUrl : '/materialsMaster/materialsMasterPage',
						controller : 'adminCtrl'
						
				   })
				   .when('/cakePans', {
						templateUrl : '/cakePanMaster/cakePanMasterPage',
						controller : 'adminCtrl'
						
				   })
				   .when('/ingredients', {
						templateUrl : '/ingredientsMaster/ingredientsMasterPage',
						controller : 'adminCtrl'
						
				   })
				   .when('/recipe', {
						templateUrl : '/recipeMaster/recipeMasterPage',
						controller : 'adminCtrl'
						
				   })
				   .when('/fillingsRecipe', {
						templateUrl : '/fillingRecipeIngrd/fillingRecipeMasterPage',
						controller : 'adminCtrl'
				   })
				   
				   .when('/fillingPurchase', {
						templateUrl : '/fillingPurchaseMaster/fillingPurchasePage',
						controller : 'adminCtrl'
				   })
				   
				   .when('/icingRecipe', {
						templateUrl : '/icingsMaster/icingMasterPage',
						controller : 'adminCtrl'
				   })
				   .when('/icingPurchase', {
						templateUrl : '/icingPurchaseMaster/icingPurchasePage',
						controller : 'adminCtrl'
				   })
				   .when('/icingPricingManage', {
						templateUrl : '/icingsMaster/icingsPricingManagePage',
						controller : 'adminCtrl'
				   })
				  .when('/icingPricingManage', {
						templateUrl : '/icingsMaster/icingsPricingManagePage',
						controller : 'adminCtrl'
				   })
				   .when('/load_email_template', { 
						templateUrl : '/emailtemplate/load_email_template',
						controller : 'adminCtrl'
				   })

				   .when('/change_password', {
						templateUrl : '/admin/change_password_display',
						controller : 'adminCtrl'
				   })
				   .when('/adminprofile', {
                	    templateUrl : '/admin/admin_profile_load',
						controller : 'adminCtrl'
				   })
				   .when('/settingsHelpContent', {
                	    templateUrl : '/adminHelp/addSettings',
						controller : 'adminCtrl'
				   })
				   .when('/themeHelpContent', {
                	    templateUrl : '/adminHelp/addTheme',
						controller : 'adminCtrl'
				   })

				   .when('/logoHelpContent', {
                	    templateUrl : '/adminHelp/addLogo',
						controller : 'adminCtrl'
				   })
				   
				   .when('/socialHelpContent', {
                	    templateUrl : '/adminHelp/addSocial',
						controller : 'adminCtrl'
				   })
				   
				   
				   .when('/paymentHelpContent', {
                	    templateUrl : '/adminHelp/addPayment',
						controller : 'adminCtrl'
				   })
				   
				      .when('/paymentpriorHelpContent', {
                	    templateUrl : '/adminHelp/addPaymentPrior',
						controller : 'adminCtrl'
				   })
				   
				   
				    .when('/orderHelpContent', {
                	    templateUrl : '/adminHelp/addOrder',
						controller : 'adminCtrl'
				   })
				   
				   
				    .when('/orderPriorHelpContent', {
                	    templateUrl : '/adminHelp/addOrderPrior',
						controller : 'adminCtrl'
				   })
				   
				   
				   .when('/quoteHelpContent', {
                	    templateUrl : '/adminHelp/addQuote',
						controller : 'adminCtrl'
				   })
				   
				   .when('/quotePriorHelpContent', {
                	    templateUrl : '/adminHelp/addQuotePrior',
						controller : 'adminCtrl'
				   })
				   
				   .when('/appointmentHelpContent', {
                	    templateUrl : '/adminHelp/addAppointment',
						controller : 'adminCtrl'
				   })
				   
				   .when('/appointmentPriorHelpContent', {
                	    templateUrl : '/adminHelp/addAppointmentPrior',
						controller : 'adminCtrl'
				   })
				   
				   .when('/eventHelpContent', {
                	    templateUrl : '/adminHelp/addEvent',
						controller : 'adminCtrl'
				   })
				   
				    .when('/eventPriorHelpContent', {
                	    templateUrl : '/adminHelp/addEventPrior',
						controller : 'adminCtrl'
				   })
				   
				   .when('/customerListHelpContent', {
                	    templateUrl : '/adminHelp/addCustomerList',
						controller : 'adminCtrl'
				   })
				   
				   .when('/addCustomerHelpContent', {
                	    templateUrl : '/adminHelp/addCustomer',
						controller : 'adminCtrl'
				   })
				   
				    .when('/venueListHelpContent', {
                	    templateUrl : '/adminHelp/addVenueList',
						controller : 'adminCtrl'
				   })
				   
				    .when('/addVenueHelpContent', {
                	    templateUrl : '/adminHelp/addVenue',
						controller : 'adminCtrl'
				   })
				   
				   .when('/eventListsHelpContent', {
                	    templateUrl : '/adminHelp/addEventLists',
						controller : 'adminCtrl'
				   })
				   
				   .when('/addEventsHelpContent', {
                	    templateUrl : '/adminHelp/addEvents',
						controller : 'adminCtrl'
				   })
				   
				   .when('/cakeListHelpContent', {
                	    templateUrl : '/adminHelp/addCake',
						controller : 'adminCtrl'
				   })
				   
				   .when('/weddingCakeHelpContent', {
                	    templateUrl : '/adminHelp/addWeddingCake',
						controller : 'adminCtrl'
				   })
				   
				   .when('/partyCakeHelpContent', {
                	    templateUrl : '/adminHelp/addPartyCake',
						controller : 'adminCtrl'
				   })
				   
				    .when('/orderTypeHelpContent', {
                	    templateUrl : '/adminHelp/addOrderType',
						controller : 'adminCtrl'
				   })
				   
				   .when('/cakeTypeBuildContent', {
                	    templateUrl : '/adminHelp/addCakeType',
						controller : 'adminCtrl'
				   })
				   
				   .when('/predefinedBuildContent', {
                	    templateUrl : '/adminHelp/predefinedType',
						controller : 'adminCtrl'
				   })
				   
				    .when('/buildCakeBuildContent', {
                	    templateUrl : '/adminHelp/buildCake',
						controller : 'adminCtrl'
				   })
				   
				   
				    .when('/selectPredefinedCakeBuildContent', {
                	    templateUrl : '/adminHelp/selectPredefinedCake',
						controller : 'adminCtrl'
				   })
				   
				   .when('/eventAddBuildContent', {
                	    templateUrl : '/adminHelp/eventsAdd',
						controller : 'adminCtrl'
				   })
				   
				   
				   
				    .when('/cupCakeListBildContent', {
                	    templateUrl : '/adminHelp/cupCakeList',
						controller : 'adminCtrl'
				   })
				   
				   .when('/cupCakeAdd', {
                	    templateUrl : '/adminHelp/cupCakeAdd',
						controller : 'adminCtrl'
				   })
				   
				   
				   .when('/priceListBuildContent', {
                	    templateUrl : '/adminHelp/priceList',
						controller : 'adminCtrl'
				   })
				   
				   
				   
				   .when('/priceAddBuildContent', {
                	    templateUrl : '/adminHelp/priceAdd',
						controller : 'adminCtrl'
				   })
				   
				   
				   
				   .when('/recipePriceListBuildContent', {
                	    templateUrl : '/adminHelp/recipePriceList',
						controller : 'adminCtrl'
				   })
				   
				   
				   .when('/recipePriceAddBuildContent', {
                	    templateUrl : '/adminHelp/recipePriceAdd',
						controller : 'adminCtrl'
				   })
				   
				   
				   .when('/icingPriceListBuildContent', {
                	    templateUrl : '/adminHelp/icingPriceList',
						controller : 'adminCtrl'
				   })
				   
				   .when('/icingPriceAddBuildContent', {
                	    templateUrl : '/adminHelp/icingPriceAdd',
						controller : 'adminCtrl'
				   })
				   
				   
				   .when('/fillingsPriceListBuildContent', {
                	    templateUrl : '/adminHelp/fillingsPriceList',
						controller : 'adminCtrl'
				   })
				   
				   
				   .when('/fillingsPriceAddBuildContent', {
                	    templateUrl : '/adminHelp/fillingsPriceAdd',
						controller : 'adminCtrl'
				   })
				   
				     .when('/toppingPriceListBuildContent', {
                	    templateUrl : '/adminHelp/toppingPriceList',
						controller : 'adminCtrl'
				   })
				   
				   .when('/toppingPriceAddBuildContent', {
                	    templateUrl : '/adminHelp/toppingPriceAdd',
						controller : 'adminCtrl'
				   })
				   
				    .when('/wrapperPriceListBuildContent', {
                	    templateUrl : '/adminHelp/wrapperPriceList',
						controller : 'adminCtrl'
				   })
				   
				    .when('/wrapperPriceAddBuildContent', {
                	    templateUrl : '/adminHelp/wrapperPriceAdd',
						controller : 'adminCtrl'
				   })
				   
				    .when('/materialsListBuildContent', {
                	    templateUrl : '/adminHelp/materialsList',
						controller : 'adminCtrl'
				   })
				   
				    .when('/materialsAddBuildContent', {
                	    templateUrl : '/adminHelp/materialsAdd',
						controller : 'adminCtrl'
				   })
				   
				    .when('/ingredientsListBuildContent', {
                	    templateUrl : '/adminHelp/ingredientsList',
						controller : 'adminCtrl'
				   })
				   
				   .when('/ingredientsAddBuildContent', {
                	    templateUrl : '/adminHelp/ingredientsAdd',
						controller : 'adminCtrl'
				   })
				   
				    .when('/recipeeListBuildContent', {
                	    templateUrl : '/adminHelp/recipeeList',
						controller : 'adminCtrl'
				   })
				   
				   .when('/recipeeAddBuildContent', {
                	    templateUrl : '/adminHelp/recipeeAdd',
						controller : 'adminCtrl'
				   })
				   
				   .when('/ordersListBuildContent', {
                	    templateUrl : '/adminHelp/ordersList',
						controller : 'adminCtrl'
				   })
				   
				    .when('/ordersAddBuildContent', {
                	    templateUrl : '/adminHelp/ordersAdd',
						controller : 'adminCtrl'
				   })

				   .when('/mailBodyload', {
                	    templateUrl : '/admin/mailbodyLoad',
						controller : 'adminCtrl'
				   })
				   
				    .when('/companyInfoHelpContent', {
                	    templateUrl : '/adminHelp/companyInfo',
						controller : 'adminCtrl'
				   })
				   
				   .when('/cakePansList', {
                	    templateUrl : '/adminHelp/cakePansLists',
						controller : 'adminCtrl'
				   })
				   
				   .when('/addNewCakePansList', {
                	    templateUrl : '/adminHelp/addNewCakePansLists',
						controller : 'adminCtrl'
				   })
				   .when('/addNewturnover', {
                	    templateUrl : '/accounts/turnover',
						controller : 'adminCtrl'
				   })
				 /*  .when('/accountsListload', {
                	    templateUrl : '/adminHelp/openTenderList',
						controller : 'adminCtrl'
				   })*/
				   
				   .otherwise({
						redirectTo : '/'
					})
});