app.controller('adminCtrl', function($scope,$http,$route,NgTableParams,$timeout,$uibModal) {
	
	$scope.signShow=false;
	$scope.subsForm=false;
	$scope.userListShow = true;
	$scope.allDetailsShow = false;
	$scope.addSubsShow = false;
	$scope.subsPlanListShow = true;
	$scope.pwdMatch=false;
	$scope.userDetailsEditShow = true;
	$scope.fillingsRecipeMasterListShow = true;
	$scope.addFillingRecipeMasterFormShow = false;
	$scope.fillingPurchaseShow = true;
	
	$scope.ingredients = {};
	$scope.units = {};
	$scope.ingrData = {};
	$scope.unitData = {};
	$scope.completeUnit = ["","Weight(Pounds)","Quantity(Cups)"]
	
	$scope.getCurrentUser = function(){
		  $http.get('/userInit/getCurrentUser').success(function(data) {
			  $scope.currentUserId = data.id;
			  $scope.currentUserName = data.userName;
			  console.log(data);
			  console.log("CurrentUserID",$scope.currentUserId);
			}, function myError(response) {
				alert("Sorry, Some technical error occur");
			});
		  
		  $http.get('/customer/totalCustomers').success(function(data) {
			  $scope.totalCustomers = data; 	  
			}, function myError(response) {
				alert("Sorry, Some technical error occur");
			});
		  
	 }
	
	$scope.showSignup = function(){
		$timeout( function(){ 
			
			 console.log();
			
			 $scope.signShow=true; 
			 $scope.paymentDiv = true;
			 document.getElementById("customButton").disabled = true;
			 $scope.accountDiv = true;
			 $scope.signUpForm=true;
			 $scope.user = null;
			 var elem;
			 if (document.getElementById &&
			    (elem=document.getElementById("customButton")) ) {
			    if (elem.style) elem.style.cursor='no-drop';
			 }
		 }, 500);
		
		
		$http.get('/subs/view/').success(function(data) {
			$scope.subsPlan = data;
			for(i=0;i<data.length;i++){
				var today = new Date();
				var dateTill=new Date();
				//$scope.subsPlan[i].dateTill=today.getDate()+'/'+Number(today.getMonth()+data[i].month)+'/'+today.getFullYear();
				$scope.subsPlan[i].dateTill=moment().add(data[i].month , "months").format("MMMM Do, YYYY");
			}
		});
		 
	}

	$scope.getUserData = function(){
		$http({
			method:"get",
			url:'/admin/getUserData'
		}).success(function(data) {
			
			console.log("User data list-------------------------------------", data);
			$scope.userDataList = data;
			$scope.usersTable = new NgTableParams({}, {
				dataset : $scope.userDataList
			});
		}, function myError(data) {
			alert("Sorry, Some technical error occur");
		
		});
	}
	
	    $scope.addDeatils = function(user){

	    	if($('#phone_validation').css('display') != 'none'|| $('#email_validation').css('display') != 'none' ||  $('#zipcode_validation').css('display') != 'none' 
	    		|| $('#pass_validation').css('display') != 'none' || $('#repass_validation').css('display') != 'none' ) 
			{
			

			}
	    	else
	    		{
	    		
	    		console.log("User Details",user);
	    	    $("#processing").show();
	    	    $("#processing").html("<strong> Processing your request please wait !! </strong>");
	    		
	    		    $http.post('/subs/save/',user).success(function(data) 
	    		    {
	    			
	    			$("#processing").fadeOut(2000);
	    			console.log("data found..."+data)
	    			if(parseInt(data)>0)
	    				{
	    		        $("#email_validation").show();
	    		        $("#email_validation").html("<b>Email id already registered !!</b>");
	    		        $("#email_validation").fadeIn();
	    				}
	    			if(parseInt(data)==0)
	    				{
	    				$scope.signUpForm=false;
		    			$scope.userName = user.userName;
		    			$scope.email = user.email;
		    			$scope.accountDiv = false;
		    			document.getElementById("customButton").disabled = false;
		    			
		    			 if (document.getElementById &&
		    				(elem=document.getElementById("customButton")) ) {
		    					    if (elem.style) elem.style.cursor='auto';
		    					    if (elem.style) elem.style.disabled=false;
		    					 }

	    				}
	    				
	    	}, function myError(response) {
	    		
	    		$("#processing").fadeOut(2000);
	    		alert("Sorry, Some technical error occur");
	    	});
	    		}	    	
	
	}
	
	    
	        $scope.addDeatils_fromSuperadmin = function(user)
	        {
	        	
	    	if($('#phone_validation').css('display') != 'none'|| $('#email_validation').css('display') != 'none' || $('#zipcode_validation').css('display')!= 'none' 
	    	|| $('#pass_validation').css('display') != 'none' || $('#repass_validation').css('display') != 'none' ) 
			{
			
			}
	    	else
	    		{
	    		console.log("User Details",user);
	    	   
	    		$("#processing").show();
	    	    $("#processing").html("<strong> Processing your request please wait !! </strong>");
	    		$http.post('/subs/save/',user).success(function(data) {
	    		$("#processing").fadeOut(2000);
	    		console.log("data found..."+data)
	    		
	    		if(parseInt(data)>0)
	    				{
	    		        $("#email_validation").show();
	    		        $("#email_validation").html("<b>Email id already registered !!</b>");
	    		        $("#email_validation").fadeIn();
	    				}
	    			if(parseInt(data)==0)
	    				{
	    				$scope.getReloadUserData();
	    				}
	    	}, function myError(response) {
	    		
	    		$("#processing").fadeOut(2000);
	    		alert("Sorry, Some technical error occur");
	    	});
	    		}	    	
	
	} 
	    
	   
	//----------------------User Edit Modal Start------------------------>
	
	$scope.editUserModal = function(datas){	
		
		console.log("Data found...",datas)
		
		$scope.userData = datas;
		$scope.userName = datas[6];
		$scope.fName = datas[0];
		$scope.lName = datas[1];
		$scope.phone_s = datas[3];
		$scope.email_s = datas[2];
		$scope.country = datas[4];
		$scope.address = datas[12];
		$scope.city = datas[13];
		$scope.id = datas[14];
		
		
    	
		$scope.modalEditUserInstance=$uibModal.open({
		    animation: false,
		    scope : $scope,
		    controller : 'adminCtrl',
		    templateUrl: '/admin/editUserModal',	  
		    size : 'lg'
		});
	 }
	
	$scope.closeUserEditModal = function(){
		$scope.getUserData();
		$scope.modalEditUserInstance.dismiss();
		
	}
	
	$scope.editeduserSubmit = function(){
	if ($scope.fName == null) {
		fName = "none";
	} else {
		fName = $scope.fName;
	}
	if ($scope.lName == null) {
		lName = "none";
	} else {
		lName = $scope.lName;
	}
	if ($scope.phone == null) {
		phone = "none";
	} else {
		phone = $scope.phone;
	}
	if ($scope.email == null) {
		email = "none";
	} else {
		email = $scope.email;
	}
	if ($scope.address == null) {
		address = "none";
	} else {
		address = $scope.address;
	}
	if ($scope.city == null) {
		city = "none";
	} else {
		city = $scope.city;
	}
	if ($scope.country == null) {
		country = "none";
	} else {
		country = $scope.country;
	}
	
	$http.post('/admin/updateUser/'+$scope.userName+'/'+fName+'/'+lName+'/'+phone+'/'+email+'/'+address+'/'+city+'/'+country).success(function(data) {
		//$scope.data=null;
		$scope.closeUserEditModal();
	}, function myError(response) {
		alert("Sorry, Some technical error occur");
	});
	}
	
	//---------------------------User Edit Modal End---------------->
	
	$scope.viewAllUserdetails = function(datas){
		$scope.userListShow = false;
		$scope.allDetailsShow = true;
		$scope.datas = datas;
	}
	
	$scope.backToUserList = function(){
		$scope.userListShow = true;
		$scope.allDetailsShow = false;
	}
	
	$scope.subsChange= function(value, amt, subsName,subsData){
		$scope.subsName=subsName;
		$scope.cSubsPlan=value;
		$scope.version = subsData.version;
		$scope.emailOn = subsData.email;
		$scope.cCakeOn = subsData.cupcake;
		$scope.chooseSubs=moment().add(value , "months").format("MMMM Do, YYYY");
		console.log($scope.chooseSubs);
		$scope.amount=amt;
	}
	 
	$scope.checkUser = function(userName){
		if(userName!=""){
			$http.get('/subs/getUserByUserName/'+userName).success(function(data) {
				$scope.sameUsername=data;
				});	
		}
	}
	
	$scope.enableUser = function(){
	$scope.endDate=moment().add($scope.cSubsPlan , "months").format("YYYY-MM-DD");
	$scope.startDate=moment().format("YYYY-MM-DD");
	 
	    $("#processing").show();
	    $("#processing").fadeIn(2000);
	    $("#processing").html("<strong> Processing your request please wait !! </strong>");
	
		$http({
			method:"post",
			url:'subs/enableUser/'+$scope.userName+'/'+$scope.startDate+'/'+$scope.endDate+'/'+$scope.amount+'/'+$scope.cSubsPlan+'/'+$scope.subsName+'/'+$scope.email+'/'+$scope.enable+'/'+$scope.version+'/'+$scope.emailOn+'/'+$scope.cCakeOn
		}).then(function mySucces(response) {
			
			$("#processing").fadeOut(2000);
			
			
			$scope.paymentDiv=false;
			
			console.log("Payement Complete!");
			
		}, function myError(response) {
			alert("Sorry, Some technical error occur");
		});
	}

	$scope.editUserDetails = function(data){
		console.log(data);
		$scope.userDetailsEditShow = false;
		$scope.userName = data[6];
		$scope.fName = data[0];
		$scope.lName = data[1];
		$scope.phone = data[3];
		$scope.email = data[2];
		$scope.address = 'kolkata';
		$scope.city = 'Newtown';
		$scope.country = 'India';

	}

	$scope.updateUserDetails = function(){
		$scope.userName = "Demo";
		$http({
			method:"post",
			url:'/admin/updateUser/'+$scope.userName
		}).success(function(data) {
			alert("Update completed");
		}, function myError(data) {
			alert("Sorry, Some technical error occur");
		});
	}
	
	$scope.backToUserDetails = function(){
		$scope.userDetailsEditShow = true;
	}

	
	/**to save subscription plan***/
	$scope.addSubsPlan = function(){
		if($scope.subs!=null && $scope.subs!=undefined){
		$scope.subs.id=null;
		$scope.subs.planName="";
		$scope.subs.month="";
		$scope.subs.cost=0;
		$scope.subs.version="";
		$scope.subs.description="";
		$scope.subs.cupcake="";
		$scope.subs.email="";
		}
		$scope.subsPlanListShow=false;
		$scope.addSubsShow=true;
		$scope.editSubsShow=false;
		/*$Scope.SubscriptionPlanadd=true;
		$scope.SubscriptionPlanedit=false;*/
	}
	
	$scope.saveSubPlan = function(subs){
			$http.post('/subs/saveSubsc/',subs).success(function(data) {	
				$scope.viewSubsc();
				$scope.subsPlanListShow=true;
				$scope.addSubsShow=false;
				$scope.editSubsShow=false;
			}, function myError(response) {
				alert("Sorry, Some technical error occur");
			});
	}
	
	/****back to Subscription Management***/
	$scope.backButton = function(){
		$scope.subsPlanListShow=true;
		$scope.addSubsShow=false;
		$scope.editSubsShow=false;
		$scope.viewSubsc();
	}
	$scope.EditSubPlan = function(subs)
	{
		//alert($scope.subs.id);
		if(subs.id!=null){
			//alert("if block//update");
			$scope.editSubsc(subs);
		}
	}
	
	/***to edit user details****/
	$scope.editUsert = function(){
		
		if ($scope.fName == null) {
			fName = "none";
		} else {
			fName = $scope.fName;
		}
		if ($scope.lName == null) {
			lName = "none";
		} else {
			lName = $scope.lName;
		}
		if ($scope.phone == null) {
			phone = "none";
		} else {
			phone = $scope.phone;
		}
		if ($scope.email == null) {
			email = "none";
		} else {
			email = $scope.email;
		}
		if ($scope.address == null) {
			address = "none";
		} else {
			address = $scope.address;
		}
		if ($scope.city == null) {
			city = "none";
		} else {
			city = $scope.city;
		}
		if ($scope.country == null) {
			country = "none";
		} else {
			country = $scope.country;
		}
		$http.post('/admin/updateUser/'+$scope.userName+'/'+fName+'/'+lName+'/'+phone+'/'+email+'/'+address+'/'+city+'/'+country).success(function(data) {
			//$scope.data=null;
			$scope.getUserData();
			$scope.backToUserList();
		}, function myError(response) {
			alert("Sorry, Some technical error occur");
		});
	}
	/**to edit cupcake for user in user management*/
	$scope.editCupCakePermission = function(datas){
	
		console.log(datas[8]+"hufyugubj");
		if(datas[8]=='No'){
				var cupCake = 'Yes';
				$http.post('/admin/updateUserCupcake/'+datas[6]+'/'+cupCake).success(function(data) {
					//$scope.data=null;
//					$scope.getUserData();
					datas[8]='Yes'
				}, function myError(response) {
					alert("Sorry, Some technical error occur");
				});
		}
		else {
			var cupCake = 'No';
			$http.post('/admin/updateUserCupcake/'+datas[6]+'/'+cupCake).success(function(data) {
				//$scope.data=null;
//				$scope.getUserData();
				
				datas[8]='No'
			}, function myError(response) {
				alert("Sorry, Some technical error occur");
			});
		}
	}
	
	/**to edit Version for user in user management*/
	$scope.editVersion = function(datas){
		if(datas[9]=="Pro"){
				var userVersion = "Basic";
				$http.post('/admin/updateUserVersion/'+datas[6]+'/'+userVersion).success(function(data) {
					//$scope.data=null;
					datas[9]="Basic"
//					$scope.getUserData();
				}, function myError(response) {
					alert("Sorry, Some technical error occur");
				});
		}
		else {
			var userVersion = "Pro";
			$http.post('/admin/updateUserVersion/'+datas[6]+'/'+userVersion).success(function(data) {
				//$scope.data=null;
//				$scope.getUserData();
				
				datas[9]="Pro"
				
			}, function myError(response) {
				alert("Sorry, Some technical error occur");
			});
		}		
	}
	
	/**to edit Email Accessibility for user in user management*/
	$scope.editEmail = function(datas){
		if(datas[10]=="Yes"){
				var userEmail = "No";
				$http.post('/admin/updateUserEmail/'+datas[6]+'/'+userEmail).success(function(data) {
					//$scope.data=null;
					datas[10]='No'
//					$scope.getUserData();
				}, function myError(response) {
					alert("Sorry, Some technical error occur");
				});
		}
		else {
			var userEmail = "Yes";
			$http.post('/admin/updateUserEmail/'+datas[6]+'/'+userEmail).success(function(data) {
				//$scope.data=null;
//				$scope.getUserData();
				
				datas[10]='Yes'
			}, function myError(response) {
				alert("Sorry, Some technical error occur");
			});
		}		
	}
	
	
	/*****to  edit status of user*****/
	$scope.EditStatus = function(datas){
		//console.log(datas[0]);
		if(datas[5]==0){
				var activeStat = 1;
				$http.post('/admin/updateUserStat/'+datas[6]+'/'+activeStat).success(function(data) {
					//$scope.data=null;
					$scope.getUserData();
				}, function myError(response) {
					alert("Sorry, Some technical error occur");
				});
		}
		else {
			var activeStat = 0;
			$http.post('/admin/updateUserStat/'+datas[6]+'/'+activeStat).success(function(data) {
				//$scope.data=null;
				$scope.getUserData();
			}, function myError(response) {
				alert("Sorry, Some technical error occur");
			});
		}
				
				
	}
	
	/**to view subscription list**/
	$scope.viewSubsc = function(){
		$http({
			method:"get",
			url:'/subs/view'
		}).success(function(data) {
			console.log("Subscription data list", data);
			$scope.subscDataList = data;
			$scope.subscTable = new NgTableParams({}, {
				dataset : $scope.subscDataList
			});
		}, function myError(data) {
			alert("Sorry, Some technical error occur");
		});
	}
	

	/**to edit subscription list**/
	$scope.editSubsPlan = function(data){
		$scope.select = data.month;
		$scope.subs=data;
		$scope.subs.id=data.id;
		$scope.subs.month=data.month;
		$scope.subs.version=data.version;
		$scope.subs.cupcake=data.cupcake;
		$scope.subs.email=data.email;
		$scope.subsPlanListShow=false;
		$scope.addSubsShow=false;
		$scope.editSubsShow=true;
		/*$Scope.SubscriptionPlanadd=false;
		$scope.SubscriptionPlanedit=true;*/
	}
	
	$scope.reTypePwd = function(pwd,rePwd){
		if(pwd===rePwd||rePwd==undefined){
			$scope.pwdMatch=false;
			
		}else{
			$scope.pwdMatch=true;
		}
	}
	
	
	$scope.editSubsc = function(data){
		$http.post('/subs/update',data).success(function(data) {
			$scope.viewSubsc();
			$scope.subsPlanListShow=true;
	  	    $scope.addSubsShow=false;
	   	    $scope.editSubsShow=false;
		
	}, function myError(response) {
		alert("Sorry, Some technical error occur");
	});
	}
	
	/**to delete subscription**/
	$scope.deleteSubsc = function(data){
		console.log(data);
		$http.post('/subs/delSubs',data).success(function(data) {
			//$scope.data=null;
			$scope.viewSubsc();
			/*$scope.subsPlanListShow=true;
		$scope.addSubsShow=false;*/
		//$scope.viewSubsc();
	}, function myError(response) {
		alert("Sorry, Some technical error occur");
	});
	}
	
	/**to delete user**/
	$scope.deleteUser = function(data){
		$http.get('/admin/delUserdeatils/'+data[6]).success(function(data) {
			//$scope.data=null;
			$scope.getUserData();
			//$scope.viewSubsc();
			/*$scope.subsPlanListShow=true;
		$scope.addSubsShow=false;*/
		//$scope.viewSubsc();
	}, function myError(response) {
		alert("Sorry, Some technical error occur");
	});
	}
	// Close Checkout on page navigation
	
	var handler = StripeCheckout.configure({
	    key: 'pk_test_1TVfWa7t5yITUgDDVtnElrdT',
	    locale: 'auto',
	    email: 'stripey@mcstripeface.com', //change with customber id in production
	    token: function (token,args) {
	    	console.log(token);
	    	console.log("ghjkghk  ",args);
	        $scope.enable=1;
	    	$scope.enableUser();
	    }
	});

	$('#customButton').on('click', function (e) {
	    var stripeAmount = 1000; // integer, in the smallest currency unit
	    var displayAmount = Number($scope.amount).toFixed(2);
	    var panelLabel = "Buy for $" + displayAmount;
	    // Open Checkout with further options
	    handler.open({
	        name: 'Stripe.com',
	        description: '2 widgets',
	        panelLabel: panelLabel
	    });
	    e.preventDefault();
	},stripeResponseHandler);
	var stripeResponseHandler = function(status, response) {
		  if (response.error) { 
		   alert("error");
		  } else {
			  alert("success");
		    var token = response.id;
		    // Save token mapping it to customer for all future payment activities
		  }
	}
	
	// Close Checkout on page navigation
	$(window).on('popstate', function () {
	    handler.close();
	});
	//----------Wrapper Management Starts------------------->/
	/**to view Wrapper List**/
	$scope.wrapperListTable = function()
	{
		$scope.WrapperListView = true;
		$scope.addwrapperForm = false;
		$scope.editwrapperForm = false;
      $http.get('/wrappers/allWrappers').success(function(data) {
			$scope.wrapperData = data;
			console.log(data);
			$scope.wrapperTable = new NgTableParams({}, {
				dataset : $scope.wrapperData
			});
		}, function myError(response) {
			alert("Sorry, Some technical error occur");
		});
	}
	
	
	
	/**To open Wrapper form from add button **/
	$scope.addWrapper = function(){
		$scope.addwrapperForm = true;
		$scope.WrapperListView = false;
		$scope.editwrapperForm = false;
	    $scope.wrapData=null;
	}
	
	/**for back button of wrapper list**/
	$scope.backToWrapList = function(){
		$scope.WrapperListView = true;
		$scope.addwrapperForm = false;
		$scope.editwrapperForm = false;
		$scope.wrapperListTable();
	}
	
	/**to save a new wrapper**/
	$scope.submitWrap = function(data){
		$http.post('/wrappers/addWraps',data).success(function(data) {
			$scope.backToWrapList();
		}, function myError(response) {
			alert("Sorry, Some technical error occur");
		});
	}
	
	//edit button
    $scope.editWraps = function(data){
    	$scope.editwrapperForm = true;
    	$scope.WrapperListView = false;
		$scope.addwrapperForm = false;
    	$scope.editWrapData = data;
    	$scope.editWrapData.wrapperName = data.wrapperName;
    }
	
  //delete items
    $scope.deleteWraps = function(datas){
    	$http.post('/wrappers/deleteWraps',datas).success(function(data) {
    		 $scope.backToWrapList();
		}, function myError(response) {
			alert("Sorry, Some technical error occur");
		});
    } 
    
  //edit 
    $scope.updateWraps = function(data){
    	$http.post('/wrappers/updateWraps',data).success(function(data) {
			$scope.backToWrapList();
		}, function myError(response) {
			alert("Sorry, Some technical error occur");
		});
    }
    
    //------------------Topping Management Start-------------->
    
    /**to view Topping List**/
	$scope.toppngListTable = function()
	{
		$scope.ToppingListView = true;
		$scope.addToppingsform = false;
		$scope.editToppingsform = false;
      $http.get('/toppings/allToppings').success(function(data) {
			$scope.TopingData = data;
			console.log(data);
			$scope.toppingTable = new NgTableParams({}, {
				dataset : $scope.TopingData
			});
		}, function myError(response) {
			alert("Sorry, Some technical error occur");
		});
	}
    
	
	/**To open Topping form from add button **/
	$scope.addTopp = function(){
		$scope.addToppingsform = true;
		$scope.ToppingListView = false;
		$scope.editToppingsform = false;
	    $scope.topData=null;
	}
	
	/**for back button of wrapper list**/
	$scope.backToToppList = function(){
		$scope.ToppingListView = true;
		$scope.addToppingsform = false;
		$scope.editToppingsform = false;
		$scope.toppngListTable();
	}
    
	/**to save a new wrapper**/
	$scope.submitTopp = function(data){
		$http.post('/toppings/addTopps',data).success(function(data) {
			$scope.backToToppList();
		}, function myError(response) {
			alert("Sorry, Some technical error occur");
		});
	}
    
	/**edit button*/
    $scope.editTopps = function(data){
    	$scope.editToppingsform = true;
    	$scope.ToppingListView = false;
		$scope.addToppingsform = false;
    	$scope.edittopData = data;
    	$scope.edittopData.toppingName = data.toppingName;
    }
	
  /**delete top*/
    $scope.deleteTopps = function(datas){
    	$http.post('/toppings/deleteTopps',datas).success(function(data) {
    		 $scope.backToToppList();
		}, function myError(response) {
			alert("Sorry, Some technical error occur");
		});
    } 
    
  /**edit **/
    $scope.updateTops = function(data){
    	$http.post('/toppings/updateTopps',data).success(function(data) {
			$scope.backToToppList();
		}, function myError(response) {
			alert("Sorry, Some technical error occur");
		});
    }
    //----------------Cupcake Pricing start-------------------------->
  
	$scope.viewcupCakeSizetable = function(){
	    	$scope.cupCakePricingListShow = true;
			$scope.addcupCakePricingForm = false;
          $http.get('/cupCakePricing/allcupCakeSize').success(function(data) {
				$scope.cupCakepricing = data;
				console.log(data);
				$scope.cupCakeTable = new NgTableParams({}, {
					dataset : $scope.cupCakepricing
				});
			}, function myError(response) {
				alert("Sorry, Some technical error occur");
			});
	 }
    
    $scope.addCpCkPricingFrm = function(){
    	$scope.addcupCakePricingForm = true;
    	$scope.cupCakePricingListShow = false;
    	$scope.cupCakePricingpageTitle = "Cup Cake Create Form";
    	$scope.cpCkPrc = null;
    }
    
    $scope.editCpCkPricingFrm = function(cpckPrcData){
    	$scope.addcupCakePricingForm = true;
    	$scope.cupCakePricingListShow = false;
    	$scope.cpCkPrc = cpckPrcData;
    	$scope.cupCakePricingpageTitle = "CupCake Update Form";
    }
    
	 $scope.backToCpCkPrcList = function(){
		 $scope.addcupCakePricingForm = false;
	 	$scope.cupCakePricingListShow = true;
	 }   
    
    $scope.submitCpCkPricing = function(cpCkPrc){
    	$http.post('/cupCakePricing/addcupCakePrice/'+$scope.currentUserName,cpCkPrc).success(function(data) {
			$scope.backToCpCkPrcList();
			$scope.cpCkPrc = null;
			$scope.viewcupCakeSizetable();
		}, function myError(response) {
			alert("Sorry, Some technical error occur");
		});
    }
    
    $scope.deleteCpCkPricing = function(cpCkPrc){
    	$http.post('/cupCakePricing/deleteCupCakePrice',cpCkPrc).success(function(data) {
			$scope.viewcupCakeSizetable();
		}, function myError(response) {
			alert("Sorry, Some technical error occur");
		});
    }
  

/***-----------------------recipPricing management starts----------------------**/
	/**to view recipePricng List**/
	$scope.viewRecipePricingTable = function(){
		$scope.recipePricingListShow = true;
		$scope.addrecipePricingForm = false;
		//$scope.editwrapperForm = false;
	  $http.get('/recipePrice/allrecipePrice').success(function(data) {
			$scope.recipeData = data;
			console.log(data);
			$scope.recipeTable = new NgTableParams({}, {
				dataset : $scope.recipeData
			});
		}, function myError(response) {
			alert("Sorry, Some technical error occur");
		});
	}


	$scope.addRecipePricingFrm = function(){
		$scope.addrecipePricingForm = true;
		$scope.recipePricingListShow = false;
		$scope.recipePricingpageTitle = "Recipe Create Form";
		$scope.recPrc = null;
	}
	
	 $scope.editrecipePricingFrm = function(data){
	    	$scope.addrecipePricingForm = true;
	    	$scope.recipePricingListShow = false;
	    	$scope.recPrc = data;
	    	$scope.recipePricingpageTitle = "Recipe Update Form";
	}
	
	 $scope.backTorecipePrcList = function(){
		 $scope.addrecipePricingForm = false;
	 	$scope.recipePricingListShow = true;
	 }   
	
	$scope.submitrecipePricing = function(data){
		$http.post('/recipePrice/addrecipePrice/'+$scope.currentUserName,data).success(function(data) {
	$scope.backTorecipePrcList();
	//$scope.recPrc = null;
		$scope.viewRecipePricingTable();
	}, function myError(response) {
		alert("Sorry, Some technical error occur");
		});
	}
	
	$scope.deleterecipePricing = function(recPrc){
		$http.post('/recipePrice/deleteRecipePrice',recPrc).success(function(data) {
		$scope.viewRecipePricingTable();
	}, function myError(response) {
		alert("Sorry, Some technical error occur");
		});
	}
	
/**-------------------Filling Pricing starts---------------------------**/
	/**to view fillingPricng List**/
	$scope.viewFillingPricingTable = function(){
		$scope.fillingPricingListShow = true;
		$scope.addfillingPricingForm = false;
		//$scope.editwrapperForm = false;
	  $http.get('/fillingPrice/allfillingPrice').success(function(data) {
		$scope.fillngData = data;
		console.log(data);
		$scope.fillingTable = new NgTableParams({}, {
			dataset : $scope.fillngData
		});
	}, function myError(response) {
		alert("Sorry, Some technical error occur");
		});
	}
	
	$scope.addFillingPricingFrm = function(){
		$scope.addfillingPricingForm = true;
		$scope.fillingPricingListShow = false;
		$scope.fillingPricingpageTitle = "Filling Create Form";
		$scope.fill = null;
	}
	
	 $scope.editfillingPricingFrm = function(data){
	    	$scope.addfillingPricingForm = true;
	    	$scope.fillingPricingListShow = false;
	    	$scope.fill = data;
	    	$scope.fillingPricingpageTitle = "Filling Update Form";
	}
	
	 $scope.backTofillingPrcList = function(){
		 $scope.addfillingPricingForm = false;
	 	$scope.fillingPricingListShow = true;
	 }   
	
	$scope.submitfillingPricing= function(data){
		$http.post('/fillingPrice/addfillingPrice/'+$scope.currentUserName,data).success(function(data) {
	$scope.backTofillingPrcList();
	//$scope.recPrc = null;
		$scope.viewFillingPricingTable();
	}, function myError(response) {
		alert("Sorry, Some technical error occur");
		});
	}
	
	$scope.deletefillingPricing = function(fill){
		$http.post('/fillingPrice/deleteFillingPrice',fill).success(function(data) {
		$scope.viewFillingPricingTable();
	}, function myError(response) {
		alert("Sorry, Some technical error occur");
		});
	}
	
/***----------------------ToppingPricing management starts--------------------**/
	/**to view toppingPricng List**/
	$scope.viewtoppingPricingTable = function(){
		$scope.toppingPricingListShow = true;
		$scope.addtoppingPricingForm = false;
		//$scope.editwrapperForm = false;
	  $http.get('/toppingPricing/alltoppingPricing').success(function(data) {
		$scope.toppingpricingData = data;
		console.log(data);
		$scope.toppingpriceTable = new NgTableParams({}, {
			dataset : $scope.toppingpricingData
		});
	}, function myError(response) {
		alert("Sorry, Some technical error occur");
		});
	}


		$scope.addToppingPricingFrm = function(){
			$scope.addtoppingPricingForm = true;
			$scope.toppingPricingListShow = false;
			$scope.toppingPricingpageTitle = "Topping Create Form";
			$scope.topr = null;
		}
		
		 $scope.edittoppingPricingFrm = function(data){
		    	$scope.addtoppingPricingForm = true;
		    	$scope.toppingPricingListShow = false;
		    	$scope.topr = data;
		    	$scope.toppingPricingpageTitle = "Topping Update Form";
		}
		
		 $scope.backTotoppingPriceList = function(){
			 $scope.addtoppingPricingForm = false;
		 	$scope.toppingPricingListShow = true;
		 }   
		
		$scope.submittoppingPricing
		= function(data){
			$http.post('/toppingPricing/addtoppingPricing/'+$scope.currentUserName,data).success(function(data) {
				$scope.backTotoppingPriceList();
				//$scope.recPrc = null;
				$scope.viewtoppingPricingTable();
			}, function myError(response) {
				alert("Sorry, Some technical error occur");
			});
		}
		
		$scope.deletetoppingPricing = function(topr){
			$http.post('/toppingPricing/deletetoppingPricing',topr).success(function(data) {
				$scope.viewtoppingPricingTable();
			}, function myError(response) {
				alert("Sorry, Some technical error occur");
			});
		}
		
		
/***-----------WrapperPricing management starts-----------------------------**/
		/**to view wrapperPricng List**/
		$scope.viewWrapperPricingTable = function(){
			$scope.wrapperPricingListShow = true;
			$scope.addwrapperPricingForm = false;
			//$scope.editwrapperForm = false;
		  $http.get('/wrapperPricing/allwrapperPricing').success(function(data) {
				$scope.wrapperpricingData = data;
				console.log(data);
				$scope.wrapperpriceTable = new NgTableParams({}, {
					dataset : $scope.wrapperpricingData
				});
			}, function myError(response) {
				alert("Sorry, Some technical error occur");
			});
		}


		$scope.addWrapperPricingFrm = function(){
			$scope.addwrapperPricingForm = true;
			$scope.wrapperPricingListShow = false;
			$scope.wrapperPricingpageTitle = "Wrapper Create Form";
			$scope.wrapr = null;
		}

		 $scope.editwrapperPricingFrm = function(data){
		    	$scope.addwrapperPricingForm = true;
		    	$scope.wrapperPricingListShow = false;
		    	$scope.wrapr = data;
		    	$scope.wrapperPricingpageTitle = "Wrapper Update Form";
		    }
		    
			 $scope.backTowrapperPrcList = function(){
				 $scope.addwrapperPricingForm = false;
			 	$scope.wrapperPricingListShow = true;
			 }   
		    
		    $scope.submitwrapperPricing = function(data){
		    	$http.post('/wrapperPricing/addwrapperPricing/'+$scope.currentUserName,data).success(function(data) {
					$scope.backTowrapperPrcList();
					//$scope.recPrc = null;
					$scope.viewWrapperPricingTable();
				}, function myError(response) {
					alert("Sorry, Some technical error occur");
				});
		    }
		    
		    $scope.deletewrapperPricing = function(wrapr){
		    	$http.post('/wrapperPricing/deletewrapperPricing',wrapr).success(function(data) {
					$scope.viewWrapperPricingTable();
				}, function myError(response) {
					alert("Sorry, Some technical error occur");
				});
		    }
										    
/***-------------CakePan Master management starts-------------------------**/
/**to view CakePan Master List**/
		$scope.viewcakePanListTable = function(){
			$scope.cakePanMasterListShow = true;
			$scope.addcakePanMasterForm = false;
			//$scope.editwrapperForm = false;
		  $http.get('/cakePanMaster/allcakePanMaster').success(function(data) {
			$scope.cakePanMasterData = data;
			console.log(data);
			$scope.cakePanMasterTable = new NgTableParams({}, {
				dataset : $scope.cakePanMasterData
			});
		}, function myError(response) {
			alert("Sorry, Some technical error occur");
			});
		}
		
		
	    $scope.addcakePanMasterFrm = function(){
			$scope.addcakePanMasterForm = true;
			$scope.cakePanMasterListShow = false;
			$scope.cakePanMasterpageTitle = "CakePan Create Form";
			$scope.cakePan = null;
		}
		
		 $scope.editcakePanMasterFrm = function(data){
		    	$scope.addcakePanMasterForm = true;
		    	$scope.cakePanMasterListShow = false;
		    	$scope.cakePan = data;
		    	$scope.cakePanMasterpageTitle = "CakePan Update Form";
		}
		
		 $scope.backTocakePanMasterList = function(){
			 $scope.addcakePanMasterForm = false;
		 	$scope.cakePanMasterListShow = true;
		 }   
		
		$scope.submitcakePanMaster = function(data){
			$http.post('/cakePanMaster/addcakePanMaster/',data).success(function(data) {
		$scope.backTocakePanMasterList();
		//$scope.recPrc = null;
			$scope.viewcakePanListTable();
		}, function myError(response) {
			alert("Sorry, Some technical error occur");
			});
		}
		
		$scope.deletecakePanMaster = function(wrapr){
			$http.post('/cakePanMaster/deletecakePanMaster',wrapr).success(function(data) {
			$scope.viewcakePanListTable();
		}, function myError(response) {
			alert("Sorry, Some technical error occur");
			});
		}
		/**CakePan Master Ends**/
		
		
/***---------------------Materials Master management starts--------------------------**/
		/**to view Materials Master List**/
		$scope.viewmaterialsMasterTable = function(){
			$scope.materialsMasterListShow = true;
			$scope.addmaterialsMasterForm = false;
			//$scope.editwrapperForm = false;
		  $http.get('/materialsMaster/allmaterialsMaster').success(function(data) {
			$scope.materialsMasterData = data;
			console.log(data);
			$scope.materialsMasterTable = new NgTableParams({}, {
				dataset : $scope.materialsMasterData
			});
		}, function myError(response) {
			alert("Sorry, Some technical error occur");
			});
		}
		
		
				$scope.addmaterialsMasterFrm = function(){
					$scope.addmaterialsMasterForm = true;
					$scope.materialsMasterListShow = false;
					$scope.materialsMasterpageTitle = "Materials Create Form";
			$scope.matMas = null;
		}
		
		 $scope.editmaterialsMaster = function(data){
		    	$scope.addmaterialsMasterForm = true;
		    	$scope.materialsMasterListShow = false;
		    	$scope.matMas = data;
		    	$scope.materialsMasterpageTitle = "Materials Update Form";
		}
		
		 $scope.backTomaterialsMasterList = function(){
			 $scope.addmaterialsMasterForm = false;
		 	$scope.materialsMasterListShow = true;
		 }   
		
		 
		 
		$scope.submitmaterialsMaster = function(data){
			$http.post('/materialsMaster/addmaterialsMaster/',data).success(function(data) {
		$scope.backTomaterialsMasterList();
		//$scope.recPrc = null;
			$scope.viewmaterialsMasterTable();
		}, function myError(response) {
			alert("Sorry, Some technical error occur");
			});
		}
		
		$scope.deletematerialsMaster = function(matMas){
			$http.post('/materialsMaster/deletematerialsMaster',matMas).success(function(data) {
			$scope.viewmaterialsMasterTable();
		}, function myError(response) {
			alert("Sorry, Some technical error occur");
			});
		}
		
/***---------------------Ingredients Master management starts--------------------------------------**/
		/**to view Ingredients Master List**/
		$scope.viewingredientsMasterTable = function(){
			$scope.ingredientsMasterListShow = true;
			$scope.addingredientsMasterForm = false;
			//$scope.editwrapperForm = false;
		  $http.get('/ingredientsMaster/allingredientsMaster').success(function(data) {
			$scope.ingredientsMasterData = data;
			console.log(data);
			$scope.ingredientsMasterTable = new NgTableParams({}, {
				dataset : $scope.ingredientsMasterData
			});
		}, function myError(response) {
			alert("Sorry, Some technical error occur");
			});
		}
		
		$scope.addingredientsMasterFrm = function(){
			$scope.addingredientsMasterForm = true;
			$scope.ingredientsMasterListShow = false;
			$scope.ingredientsMasterpageTitle = "Ingredients Create Form";
	        $scope.ingMas = null;
		}
		
		 $scope.editingredientsMaster = function(data){
		    	$scope.addingredientsMasterForm = true;
		    	$scope.ingredientsMasterListShow = false;
		    	$scope.ingMas = data;
		    	$scope.ingredientsMasterpageTitle = "Ingredients Update Form";
		}
		
		 $scope.backToingredientsMasterList = function(){
			 $scope.addingredientsMasterForm = false;
		 	$scope.ingredientsMasterListShow = true;
		 }   
		 
		$scope.submitingredientsMaster = function(data){
			$http.post('/ingredientsMaster/addingredientsMaster/',data).success(function(data) {
				$scope.backToingredientsMasterList();
				//$scope.recPrc = null;
				$scope.viewingredientsMasterTable();
			}, function myError(response) {
				alert("Sorry, Some technical error occur");
			});
		}
		
		$scope.deleteingredientsMaster = function(ingMas){
			$http.post('/ingredientsMaster/deleteingredientsMaster',ingMas).success(function(data) {
				$scope.viewingredientsMasterTable();
			}, function myError(response) {
				alert("Sorry, Some technical error occur");
			});
		}
		
		
/***------------------Recipe Master management starts---------------------------**/
/**to view Recipe Master List**/
		$scope.viewrecipeMasterTable = function(){
			$scope.recipeMasterListShow = true;
			$scope.addrecipeMasterForm = false;
			
		  $http.get('/recipeMaster/allrecipeMaster').success(function(data) {
				$scope.recipeMasterData = data;
				console.log(data);
				$scope.recipeMasterTable = new NgTableParams({}, {
					dataset : $scope.recipeMasterData
				});
			}, function myError(response) {
				alert("Sorry, Some technical error occur");
			});
		}


		$scope.addrecipeMasterFrm = function(){
			$scope.addrecipeMasterForm = true;
			$scope.recipeMasterListShow = false;
			$scope.editrecipeFrm = false;
			$scope.recipeMasterpageTitle = "Recipe Create Form";
			$scope.rcm = null;
		}

		 $scope.editrecipeMasterFrm = function(data){
			    $scope.editrecipeFrm = true;
			    $scope.addrecipeMasterForm = false;
		    	$scope.recipeMasterListShow = false;
		    	$scope.rcm = data;
		    	$scope.recipeMasterpageTitle = "Recipe Update Form";
		    	$scope.ingredientsChoice();
		    	$scope.unitChoice();
		    	$scope.recipe = data.recipeName;
		    	$scope.viewrecipeIngredientsTable(data.id);
		    }
		 
		    $scope.ingredientsChoice = function(){
		    	$http.get('/ingredientsMaster/allingredientsMaster').success(function(ings){
		    		$scope.ingredients = ings;
		    		$scope.ingrData.x = $scope.ingredients[0];
		    		
		    	 }, function myError(response) {
					alert("Sorry, Some technical error occur");
				});
		    }
		    $scope.unitChoice = function(){
		    	$http.get('/unit/allunits').success(function(unit){
		    		$scope.units = unit;
		    		$scope.unitData.y = $scope.units[0];
		    	 }, function myError(response) {
					alert("Sorry, Some technical error occur");
				});	
		    }
		    
			 $scope.backTorecipeMasterList = function(){
				$scope.addrecipeMasterForm = false;
			 	$scope.recipeMasterListShow = true;
			 	$scope.editrecipeFrm = false;
			 }   
			 
		    $scope.submitrecipeMaster = function(data){
		    	$http.post('/recipeMaster/addrecipeMaster/',data).success(function(data) {
		    		 $http.get('/recipeMaster/getRecipeMasterByMaxid').success(function(dataByMaxId) {
							$scope.editrecipeMasterFrm(dataByMaxId[0]);
						}, function myError(response) {
							alert("Sorry, Some technical error occur");
						});
				}, function myError(response) {
					alert("Sorry, Some technical error occur");
				});
		    }
		    $scope.updaterecipeMaster = function(data){
		    	$http.post('/recipeMaster/updaterecipeMaster/',data).success(function(data) {
					$scope.backTorecipeMasterList();
				}, function myError(response) {
					alert("Sorry, Some technical error occur");
				});
		    }
		    
		    $scope.deleterecipeMaster = function(rcm){
		    	$http.post('/recipeMaster/deleterecipeMaster',rcm).success(function(data) {
					$scope.viewrecipeMasterTable();
				}, function myError(response) {
					alert("Sorry, Some technical error occur");
				});
		    }
              /**to view Recipe Master List**/
		$scope.viewrecipeIngredientsTable = function(recipeId){
		  $http.get('/recipeIngredients/allrecipeIngredientsByRecipe/'+recipeId).success(function(data) {
			  console.log("gvvygughughuhu",data);
				$scope.recipeIngredientsData = data;
				$scope.recipeIngredientsTable = new NgTableParams({}, {
					dataset : $scope.recipeIngredientsData
				});
			}, function myError(response) {
				alert("Sorry, Some technical error occur");
			});
		}
		
		$scope.updateingredientsRecipe = function(data,ingrdId,unitId,recipeId){
			$http.post('/recipeIngredients/addrecipeIngredients/'+ingrdId+'/'+unitId+'/'+recipeId,data).success(function(data) {
				console.log(data);
				$scope.viewrecipeIngredientsTable(recipeId);
				$scope.ingr = null;
				alert("Ingredient added!");
			}, function myError(response) {
				alert("Sorry, Some technical error occur");
			});
		}
		
	    $scope.deleterecipeingredients = function(rcpIng,recipeId){
	    	$http.post('/recipeIngredients/deleterecipeIngredients',rcpIng).success(function(data) {
	    		$scope.viewrecipeIngredientsTable(recipeId);
			}, function myError(response) {
				alert("Sorry, Some technical error occur");
			});
	    }

	//--------------------Fillings Start------------------------------------------>
		 
		 $scope.addfillingsRecipeMasterFrm = function(){
			 $scope.fillingsRecipeMasterListShow = false;
			 $scope.addFillingRecipeMasterFormShow = true;
			 $scope.fillingsRecipeMasterpageTitle = "Filling Recipe Create Form";
		 }
		 
			$scope.viewfillingsrecipeMasterTable = function(){
				$scope.fillingsRecipeMasterListShow = true;
				$scope.addFillingRecipeMasterFormShow = false;
				
			  $http.get('/fillingRecipeIngrd/getAllFillingsRecipe').success(function(data) {
					$scope.fillingsrecipeMasterData = data;
					
					$scope.fillingRecipeMasterTable = new NgTableParams({}, {
						dataset : $scope.fillingsrecipeMasterData
					});
				}, function myError(response) {
					alert("Sorry, Some technical error occur");
				});
			}
		 
		 
		 $scope.submitFillingRecipeMaster = function(data){
				$http.post('/fillingRecipeIngrd/addFillingrecipeMaster/',data).success(function(data) {
		    		$http.get('/fillingRecipeIngrd/getFillingRecipeMasterByMaxid').success(function(dataByMaxId) {
							$scope.editFillingRecipeMasterFrm(dataByMaxId[0]);
						}, function myError(response) {
							alert("Sorry, Some technical error occur");
						});
				}, function myError(response) {
					alert("Sorry, Some technical error occur");
				});
		 }
		 
		 $scope.editFillingRecipeMasterFrm = function(data){
			    $scope.editfillingrecipeshow = true;
			    $scope.fillingsRecipeMasterListShow = false;
				$scope.addFillingRecipeMasterFormShow = false;
				$scope.fillingRecipeMasterpageTitle = "Update Filling Recipe Name";
				$scope.fircm = data;
				$scope.ingredientsChoice();
		    	$scope.unitChoice();
		    	$scope.fillinRecipegName = data.fillingName;
		    	$scope.viewfillingRecipeIngredientsTable(data.id);
		    }
		 
		 $scope.viewfillingRecipeIngredientsTable = function(recipeId){
			  $http.get('/fillingRecipeIngrd/fillingrecipeIngredientsByRecipe/'+recipeId).success(function(data) {
					$scope.fillingRecipeIngredientsData = data;
					$scope.fillingRecipeIngredientsTable = new NgTableParams({}, {
					dataset : $scope.fillingRecipeIngredientsData
					});
				}, function myError(response) {
					alert("Sorry, Some technical error occur");
				});
			}
		 
		 $scope.updateingredientsFillingRecipe = function(data,ingrdId,unitId,recipeId){
				$http.post('/fillingRecipeIngrd/addFillingRecipeIngredients/'+ingrdId+'/'+unitId+'/'+recipeId,data).success(function(data) {
					$scope.viewfillingRecipeIngredientsTable(recipeId);
					$scope.ingr = null;
					alert("Ingredient added!");
				}, function myError(response) {
					alert("Sorry, Some technical error occur");
				});
			}
		 
		 $scope.deleteFillingrecipeingredients = function(frcpIng,recipeId){
		    	$http.post('/fillingRecipeIngrd/deletefillingRecipeIngr',frcpIng).success(function(data) {
		    		$scope.viewfillingRecipeIngredientsTable(recipeId);
				}, function myError(response) {
					alert("Sorry, Some technical error occur");
				});
		    }
		 
		 $scope.deleteFillingRecipeMaster = function(data){
			 $http.post('/fillingRecipeIngrd/deleteFillingRecipeMaster',data).success(function(data) {
		    		$scope.viewfillingsrecipeMasterTable();
				}, function myError(response) {
					alert("Sorry, Some technical error occur");
				});
		 }
		 
		 
		 $scope.backTofillingrecipeMasterList = function(){
			    $scope.editfillingrecipeshow = false;
			    $scope.fillingsRecipeMasterListShow = true;
				$scope.addFillingRecipeMasterFormShow = false;
				$scope.viewfillingsrecipeMasterTable();
			 } 
		 
		 //---------------------------Filling Purchased Strat----------------------------------------->
		 
		 $scope.getFillingPurchaseMasterList = function(){
			  $http.get('/fillingPurchaseMaster/fillingPurchaseMasterList').success(function(data) {
					$scope.fillingPurchaseData = data;
					$scope.fillingPurchaseTable = new NgTableParams({}, {
					dataset : $scope.fillingPurchaseData
					});
				}, function myError(response) {
					alert("Sorry, Some technical error occur");
				});
		 } 
		 
		 
		 $scope.addFillingPurchaseForm = function(){
			 $scope.fillingPurchaseShow = false;
			 $scope.addFillingPurchaseShow = true;
			 $scope.pageTitleFillingPurchase = "Fillings Purchase Create Form";
			 $scope.unitChoice();
		 }
		 
		 $scope.editFillingPurchase = function(data){
			 $scope.pageTitleFillingPurchase = "Fillings Purchase Upadte Form";
			 $scope.fillingPurchaseShow = false;
			 $scope.addFillingPurchaseShow = true;
			 $scope.unitChoice();
			 $scope.ven = data;
		 }
		 
		$scope.submitFillingPurchase = function(data,unitId){
			$http.post('/fillingPurchaseMaster/addFillingPurchaseMaster/'+unitId,data).success(function(data) {
				$scope.backTOFillingPurchaseLst();
				$scope.ven = null;
			}, function myError(response) {
				alert("Sorry, Some technical error occur");
			});
		} 
		
		$scope.backTOFillingPurchaseLst = function(){
			 $scope.fillingPurchaseShow = true;
			 $scope.addFillingPurchaseShow = false;
			 $scope.getFillingPurchaseMasterList();
		}
		
		$scope.delFillingPurchase = function(data){
			$http.post('/fillingPurchaseMaster/delFillingPurchaseMaster/',data).success(function(data) {
				$scope.backTOFillingPurchaseLst();
			}, function myError(response) {
				alert("Sorry, Some technical error occur");
			});
		}
	
		 /**********************Icing master starts*************/
		/**to view Icing Master List**/
		$scope.viewicingsrecipeMasterTable = function(){
			$scope.icingrecipeMasterListShow = true;
			$scope.addicingrecipeMasterForm = false;
			
		  $http.get('/icingsMaster/allicingsMaster').success(function(data) {
				$scope.icingrecipeMasterData = data;
				console.log(data);
				$scope.icingrecipeMasterTable = new NgTableParams({}, {
					dataset : $scope.icingrecipeMasterData
				});
			}, function myError(response) {
				alert("Sorry, Some technical error occur");
			});
		}
		
		$scope.addicingMasterFrm = function(){
			 $scope.icingrecipeMasterListShow = false;
			 $scope.addicingrecipeMasterForm = true;
			 $scope.icingMasterpageTitle = "Icing Recipe Create Form";
		 }
		
		 $scope.submiticingrecipeMaster = function(data){
				$http.post('/icingsMaster/addicingsMaster',data).success(function(data) {
		    		$http.get('/icingsMaster/geticingsMasterByMaxid').success(function(dataByMaxId) {
							$scope.editicingMasterFrm(dataByMaxId[0]);
						}, function myError(response) {
							alert("Sorry, Some technical error occur");
						});
				}, function myError(response) {
					alert("Sorry, Some technical error occur");
				});
		 }
		
		 $scope.editicingMasterFrm = function(data){
			    $scope.editIcingFrm = true;
			    $scope.icingrecipeMasterListShow = false;
				$scope.addicingrecipeMasterForm = false;
				$scope.icingMasterpageTitle = "Update Icing Recipe Name";
				$scope.icm = data;
				$scope.ingredientsChoice();
		    	$scope.unitChoice();
		    	$scope.icingrecipeName = data.icingName;
		    	$scope.viewicingRecipeIngredientsTable(data.id);
		    }
		 $scope.viewicingRecipeIngredientsTable = function(icingId){
			  $http.get('/icingRecipeIngredients/IcingsRecipeIngredientsByIcing/'+icingId).success(function(data) {
					$scope.icingRecipeIngredientsData = data;
					$scope.icingrecipeIngreTable = new NgTableParams({}, {
					dataset : $scope.icingRecipeIngredientsData
					});
				}, function myError(response) {
					alert("Sorry, Some technical error occur");
				});
			}
		 
		 $scope.updateicingingredRecipe = function(data,ingrdId,unitId,icingId){
				$http.post('/icingRecipeIngredients/addIcingsRecipeIngredients/'+ingrdId+'/'+unitId+'/'+icingId,data).success(function(data) {
					$scope.viewicingRecipeIngredientsTable(icingId);
					$scope.icin = null;
					alert("Ingredient added!");
				}, function myError(response) {
					alert("Sorry, Some technical error occur");
				});
			}
		 
		 $scope.deleteicingrecipeingredients= function(inrcpIng,icingId){
		    	$http.post('/icingRecipeIngredients/deleteIcingsRecipeIngredients',inrcpIng).success(function(data) {
		    		$scope.viewicingRecipeIngredientsTable(icingId);
				}, function myError(response) {
					alert("Sorry, Some technical error occur");
				});
		    }
		 
		 $scope.deleteicingMaster = function(data){
			 $http.post('/icingsMaster/deleteicingsMaster',data).success(function(data) {
		    		$scope.viewicingsrecipeMasterTable();
				}, function myError(response) {
					alert("Sorry, Some technical error occur");
				});
		 }
		 
		 
		 $scope.backToicingMasterList = function(){
			    $scope.editIcingFrm = false;
			    $scope.icingrecipeMasterListShow = true;
				$scope.addicingrecipeMasterForm = false;
				$scope.viewicingsrecipeMasterTable();
			 } 
		
		/***Icing Purchase starts**/
		 
		 
		 $scope.viewicingspurchaseMasterTable = function(){
			  $http.get('/icingPurchaseMaster/icingPurchaseMasterList').success(function(data) {
				  $scope.icingPurchaseShow = true;
					 $scope.addIcingPurchaseShow = false;
					$scope.icingPurchaseData = data;
					$scope.icingPurchaseTable = new NgTableParams({}, {
					dataset : $scope.icingPurchaseData
					});
				}, function myError(response) {
					alert("Sorry, Some technical error occur");
				});
		 } 
		 
		 
		 $scope.addIcingPurchaseForm = function(){
			 $scope.icingPurchaseShow = false;
			 $scope.addIcingPurchaseShow = true;
			 $scope.pageTitleIcingPurchase = "Icing Purchase Create Form";
			 $scope.unitChoice();
		 }
		 
		 $scope.editIcingPurchase = function(data){
			 $scope.pageTitleIcingPurchase = "Icing Purchase Upadte Form";
			 $scope.icingPurchaseShow = false;
			 $scope.addIcingPurchaseShow = true;
			 $scope.unitChoice();
			 $scope.ipm = data;
		 }
		 
		$scope.submitIcingPurchase = function(data,unitId){
			$http.post('/icingPurchaseMaster/addicingPurchaseMaster/'+unitId,data).success(function(data) {
				$scope.backToIcingPurchaseList();
				$scope.ipm = null;
			}, function myError(response) {
				alert("Sorry, Some technical error occur");
			});
		} 
		
		$scope.backToIcingPurchaseList = function(){
			 $scope.icingPurchaseShow = true;
			 $scope.addIcingPurchaseShow = false;
			 $scope.viewicingspurchaseMasterTable();
		}
		
		$scope.delIcingPurchase = function(data){
			$http.post('/icingPurchaseMaster/delicingPurchaseMaster/',data).success(function(data) {
				$scope.backToIcingPurchaseList();
			}, function myError(response) {
				alert("Sorry, Some technical error occur");
			});
		}
	//----------------Icing Price----------------//
		//----------------Icing Price Manage starts------------------//
		$scope.viewIcingPricingManage = function(){
			$scope.icingPriceMasterListShow = true;
			$scope.editicingPriceMasterForm = false;
			 $http.get('/icingsMaster/allicingsMaster').success(function(data) {
				$scope.icingpriceMasterData = data;
				$scope.icingMasterTable = new NgTableParams({}, {
					dataset : $scope.icingpriceMasterData
				});
			}, function myError(response) {
				alert("Sorry, Some technical error occur");
			});
		}
		$scope.editicingPriceMasterFrm = function(data){
		   
		    $scope.icingPriceMasterListShow = false;
			$scope.editicingPriceMasterForm = true;
			$scope.NameOficing = data.icingName;
			$scope.icpm = data;
			
	    }
		$scope.submiticingPriceMaster = function(data){
			$http.post('/icingsMaster/addicingsMaster',data).success(function(data) {
				$scope.backToicingPriceMasterList();
			}, function myError(response) {
				alert("Sorry, Some technical error occur");
			});
		}
		 $scope.backToicingPriceMasterList = function(){
			    $scope.icingPriceMasterListShow = true;
				$scope.editicingPriceMasterForm = false;
				$scope.viewIcingPricingManage();
			 }
		 
//*********************************************************************************************************************************************************		 
//************************************************  Email template  functions starts from here ********************************************************************			 
//*********************************************************************************************************************************************************		 
		 $scope.orderTemplateLoad=function()
		 {
			
			 $scope.loadEmailTemplates();
			 $scope.orderTemplate = true;
			 $scope.paymentTemplate = false;
			 $scope.quoteTemplate = false;
			 $scope.appointmentTemplate = false;
			 $scope.eventTemplate = false;
			 $scope.birthdayTemplate = false;
			 $scope.aniversaryTemplate = false;
			 $scope.admininfoTemplate = false;
			 $scope.cancelTemplate = false;
			 $scope.rescheduleTemplate = false;
			 
		 }
		 $scope.paymentTemplateLoad=function()
		 {
			 $scope.paymentTemplate = true;
			 $scope.orderTemplate = false;
			 $scope.quoteTemplate = false;
			 $scope.appointmentTemplate = false;
			 $scope.eventTemplate = false;
			 $scope.birthdayTemplate = false;
			 $scope.aniversaryTemplate = false;
			 $scope.admininfoTemplate = false;
			 $scope.cancelTemplate = false;
			 $scope.rescheduleTemplate = false;
			 
		 }
		 
		 $scope.quoteTemplateLoad=function()
		 {
			 $scope.paymentTemplate = false;
			 $scope.orderTemplate = false;
			 $scope.quoteTemplate = true;
			 $scope.appointmentTemplate = false;
			 $scope.eventTemplate = false;
			 $scope.birthdayTemplate = false;
			 $scope.aniversaryTemplate = false;
			 $scope.admininfoTemplate = false;
			 $scope.cancelTemplate = false;
			 $scope.rescheduleTemplate = false;

		 }
		 
		 $scope.appointmentTemplateLoad=function()
		 {
			 $scope.appointmentTemplate = true;
			 $scope.orderTemplate = false;
			 $scope.quoteTemplate = false;
			 $scope.paymentTemplate = false;
			 $scope.eventTemplate = false;
			 $scope.birthdayTemplate = false;
			 $scope.aniversaryTemplate = false;
			 $scope.admininfoTemplate = false;
			 $scope.cancelTemplate = false;
			 $scope.rescheduleTemplate = false;

		 }
		 
		 $scope.eventTemplateLoad=function()
		 {
			 $scope.appointmentTemplate = false;
			 $scope.orderTemplate = false;
			 $scope.quoteTemplate = false;
			 $scope.paymentTemplate = false;
			 $scope.eventTemplate = true;
			 $scope.birthdayTemplate = false;
			 $scope.aniversaryTemplate = false;
			 $scope.admininfoTemplate = false;
			 $scope.cancelTemplate = false;
			 $scope.rescheduleTemplate = false;
		 }
		 
		 $scope.birthdaydayTemplateLoad=function()
		 {
			 $scope.appointmentTemplate = false;
			 $scope.orderTemplate = false;
			 $scope.quoteTemplate = false;
			 $scope.paymentTemplate = false;
			 $scope.eventTemplate = false;
			 $scope.birthdayTemplate = true;
			 $scope.aniversaryTemplate = false;
			 $scope.admininfoTemplate = false;
			 $scope.cancelTemplate = false;
			 $scope.rescheduleTemplate = false;
		 }
		 
		 $scope.aniversaryTemplateLoad=function()
		 {
			 $scope.appointmentTemplate = false;
			 $scope.orderTemplate = false;
			 $scope.quoteTemplate = false;
			 $scope.paymentTemplate = false;
			 $scope.eventTemplate = false;
			 $scope.birthdayTemplate = false
			 $scope.aniversaryTemplate = true;
			 $scope.admininfoTemplate = false;
			 $scope.cancelTemplate = false;
			 $scope.rescheduleTemplate = false;
		 }
		 
		 $scope.admininfoTemplateLoad=function()
		 {
			 $scope.appointmentTemplate = false;
			 $scope.orderTemplate = false;
			 $scope.quoteTemplate = false;
			 $scope.paymentTemplate = false;
			 $scope.eventTemplate = false;
			 $scope.birthdayTemplate = false
			 $scope.aniversaryTemplate = false;
			 $scope.admininfoTemplate = true;
			 $scope.cancelTemplate = false;
			 $scope.rescheduleTemplate = false;
		 }
		 
		 $scope.cancelTemplateLoad=function()
		 {
			 $scope.appointmentTemplate = false;
			 $scope.orderTemplate = false;
			 $scope.quoteTemplate = false;
			 $scope.paymentTemplate = false;
			 $scope.eventTemplate = false;
			 $scope.birthdayTemplate = false
			 $scope.aniversaryTemplate = false;
			 $scope.admininfoTemplate = false;
			 $scope.cancelTemplate = true;
			 $scope.rescheduleTemplate = false;
			 
		 }
		 
		 $scope.rescheduleTemplateLoad=function()
		 {
			 $scope.appointmentTemplate = false;
			 $scope.orderTemplate = false;
			 $scope.quoteTemplate = false;
			 $scope.paymentTemplate = false;
			 $scope.eventTemplate = false;
			 $scope.birthdayTemplate = false
			 $scope.aniversaryTemplate = false;
			 $scope.admininfoTemplate = false;
			 $scope.cancelTemplate = false;
			 $scope.rescheduleTemplate = true;
			 
		 }
		   
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++		 
		 $scope.loadEmailTemplates=function()
		 {
					 $http.get('/emailtemplate/loadEmailTemplates').success(function(data) 
							    {
					
								 console.log("data fetch ",data)
								 $scope.templatedata=data;

								 $('#orderheader').val(data[0].tempheading)
								 $('#paymentheader').val(data[1].tempheading)
								 $('#quoteTemplateheader').val(data[2].tempheading)
								 $('#appointmentTemplateheader').val(data[3].tempheading)
								 $('#eventTemplateheader').val(data[4].tempheading)
								 $('#birthdayTemplateheader').val(data[5].tempheading)
								 $('#aniversaryTemplateheader').val(data[6].tempheading)
								 $('#admininfoTemplateheader').val(data[7].tempheading)
								 $('#cancelTemplateheader').val(data[8].tempheading)
								 $('#rescheduledTemplateheader').val(data[9].tempheading)      
								 $('#ordertemp').froalaEditor('html.set', data[0].tempcontent);
								 $('#paymenttemp').froalaEditor('html.set', data[1].tempcontent);
								 $('#quoteTemplate').froalaEditor('html.set', data[2].tempcontent);
								 $('#appointmentTemplate').froalaEditor('html.set', data[3].tempcontent);
								 $('#eventTemplate').froalaEditor('html.set', data[4].tempcontent);
								 $('#birthdayTemplate').froalaEditor('html.set', data[5].tempcontent);
								 $('#aniversaryTemplate').froalaEditor('html.set', data[6].tempcontent);
								 $('#admininfoTemplate').froalaEditor('html.set', data[7].tempcontent);
								 $('#cancelTemplate').froalaEditor('html.set', data[8].tempcontent);
								 $('#rescheduleTemplate').froalaEditor('html.set', data[9].tempcontent);

								}, function myError(response) {
									alert("Sorry, Some technical error occur");
								}); 
		 }
		 
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++			 
		 $scope.saveTemplateData=function(tempobject,id_name,tempheading_name)
		 {
		 
		  var updatedcontent=$("#"+id_name+"").froalaEditor('html.get');
		  var tempheading=$("#"+tempheading_name+"").val();
		  
	      console.log("tempobject..",tempobject.sid)
		  
		  updateData(updatedcontent,tempobject.sid,tempheading);
		  		 
		 }
		 
 //*********************************************************************************************************************************************************		 
	
			$scope.checkUserMail = function(mail){
				
				  var email=mail;
				  console.log(email)
				if(mail!=""){
					$http.get('/userInit/getUserDetailsByEmail/'+mail).success(function(data) {
						
						$scope.sameUserMail=data

					      });	
				}
			}
			
			
			
			$scope.changePasswordforAdmin=function()
			{
			$scope.adminProfileView=true;
				
			}
			
			
			
			$scope.updateAdminProfile=function()
			{
				var newpassword=$("#newPassword").val();
				var retypepassword=$("#re_newPassword").val();
				var currentpassword=$("#currentPassword").val();
				
			 	if($('#newPassword_validation').css('display') != 'none'|| $('#newPassword_validation').css('display') != 'none') 
				{

				}
			 	else
			 	{
					$http.get('/userPasswordChanage?username='+$scope.currentUserName+"&currentpassword="+currentpassword+"&newpassword="+newpassword).success(function(data) 
				  			{
					
				  		     if(parseInt(data)==1)
				  		    	 {
				  		    	    $("#div2").show();
				                    $("#div2").html("Current password is wrong !!");
				                    $("#div2").fadeIn();
				                    $("#div2").fadeOut(2000); 
				                   
				  		    	 }
				  		     
				  		   if(parseInt(data)==0)
			  		    	 {
			  		    	    $("#div1").show();
			                    $("#div1").html("Updated sucesfully !!");
			                    $("#div1").fadeIn();
			                    $("#div1").fadeOut(2000); 
			                   
			  		    	 }
				  		        
							}, function myError(response) {
								alert("Sorry, Some technical error occur");
					});	
			 		
			 	}	
				
				
			}
			
			  $scope.showAdminDetails=function()
				{
		     
		            $scope.adminProfile=true;
					$http.get('/admin/allAdminDetails/'+$scope.currentUserName).success(function(data) {
						$scope.comp=data;
						console.log('dat',comp);
			    	 }, function myError(response) {
						alert("Sorry, Some technical error occur");
					});

			    }
			  
			  $scope.submitAndUpdateAdminDetails= function(comp)
				{
				   $http.post('/admin/updateAdminDetails/'+$scope.currentUserName,comp).success(function(data) 
				   {
					    $("#div1").show();
	                    $("#div1").html("Updated sucesfully !!");
	                    $("#div1").fadeIn();
	                    $("#div1").fadeOut(2000); 
						
						}, function myError(response) {
							alert("Sorry, Some technical error occur");
						});
				  }

				$scope.settings = function()
				{
					
		
				
					$scope.getAllHelpSettingDetails();
				 	$scope.settingsDisplay = true;
					$scope.paymentTemplate = false;
					$scope.profileSuccessful=true;
					$('#settingsMyAccount_content').froalaEditor('html.set', $scope.settingdata[45].settingcontent);
				    $timeout( function(){ 
				    	
				   
						 console.log($scope.settingdata);
						  $('#settingsMyAccount_content').froalaEditor({
						    })
						 $('#settingsMyAccount_content').froalaEditor({
                            initOnClick: true
                          })
					
					 }, 200);
						
				}
				
				$scope.companyInfo= function()
				{
					
					$scope.companyInfoDisplay = true;	
					$scope.paymentTemplate = false;
					$scope.companyinfos=true;
				    $scope.address1Display=true;
				    $scope.address2Dsiplay=true;
				    $scope.cityDisplay=true;
				    $scope.countryDisplay=true;
				    $scope.stateDisplay=true;
				    $scope.postalCodeDisplay=true;
				    $scope.contactNameDisplay=true;
				    $scope.phoneNoDisplay=true;
				    $scope.websiteDisplay=true;
				    
				    $scope.getAllHelpSettingDetails();
					
				    $timeout( function(){ 
						 console.log("asd",$scope.settingdata[75].settingheader);
						 
						 $('#companyNameHeader').val($scope.settingdata[75].settingheader)
						 $('#company_name').froalaEditor('html.set', $scope.settingdata[75].settingcontent);
						 
						 $('#addressNameHeader').val($scope.settingdata[76].settingheader)
						 $('#address_1').froalaEditor('html.set', $scope.settingdata[76].settingcontent);
						 
						 $('#addressNameHeader2').val($scope.settingdata[77].settingheader)
						 $('#address_2').froalaEditor('html.set', $scope.settingdata[77].settingcontent);
						 
						 $('#city_newHeader').val($scope.settingdata[78].settingheader)
						 $('#city_new').froalaEditor('html.set', $scope.settingdata[78].settingcontent);
						 
						 $('#country_newHeader').val($scope.settingdata[79].settingheader)
						 $('#country_new').froalaEditor('html.set', $scope.settingdata[79].settingcontent);
						 
						 $('#state_newHeader').val($scope.settingdata[80].settingheader)
						 $('#state_new').froalaEditor('html.set', $scope.settingdata[80].settingcontent);
						 
						 $('#postal_newHeader').val($scope.settingdata[81].settingheader)
						 $('#postal_code').froalaEditor('html.set', $scope.settingdata[81].settingcontent);
						 
						 $('#contact_newHeader').val($scope.settingdata[82].settingheader)
						 $('#contact_name').froalaEditor('html.set', $scope.settingdata[82].settingcontent);
						 
						 $('#phoneno_newHeader').val($scope.settingdata[83].settingheader)
						 $('#phone_No').froalaEditor('html.set', $scope.settingdata[83].settingcontent);
						 
						 $('#websiteurl_newHeader').val($scope.settingdata[84].settingheader)
						 $('#website_url').froalaEditor('html.set', $scope.settingdata[84].settingcontent);
						 
					 }, 200);
				    

				}
				
				
				

				$scope.logo= function()
				{
					
					$scope.settingsDisplay = true;
					$scope.paymentTemplate = false;
					
				
					$scope.getAllHelpSettingDetails();
				    $timeout( function(){ 
						 console.log($scope.settingdata);
						 $('#logo').val($scope.settingdata[5].settingheader)
						 $('#logo_content').froalaEditor('html.set', $scope.settingdata[5].settingcontent);
					 }, 200);
				
				}
				
				
				
				
				
				
				$scope.social= function()

				{
					
					$scope.settingsDisplay = true;
					$scope.paymentTemplate = false;	
					$scope.profileSuccessful=true;
					
					$scope.getAllHelpSettingDetails();
				    $timeout( function(){ 
						 console.log($scope.settingdata);
						 $('#socailProfile').val($scope.settingdata[3].settingheader)
						 $('#socialProfile_content').froalaEditor('html.set', $scope.settingdata[3].settingcontent);
					 }, 200);
				}
				
				
				
				
				 $scope.editCupCake = function(data){
					    
						console.log("check",data)
					    $scope.allDetailsShow = true;
						$scope.userListShow=false;
						/*$scope.customerListView = false;
						$scope.addCustform = false;*/
						$scope.editUserData = data;
					}
				
				 
				 $scope.updateUserDetails = function(data){
					 
					console.log("Data .... ",data)
						$http.post('/adminController/updateUserStat/'+$scope.currentUserName,data).success(function(data){
								   $scope.socialsettingView();
						}, function myError(response) {
							alert("Sorry, Some technical error occur");
						});
						}
				
				
				$scope.theme = function()
				{
				
					$scope.settingsDisplay = true;
					$scope.paymentTemplate = false;	
					$scope.profileSuccessful=true;
					
					$scope.getAllHelpSettingDetails();
				    $timeout( function(){ 
						 console.log($scope.settingdata);
						 $('#theme').val($scope.settingdata[4].settingheader)
						 $('#theme_content').froalaEditor('html.set', $scope.settingdata[4].settingcontent);
					 }, 200);
				}
			
				
				$scope.payment = function()
				{
					
					$scope.settingsDisplay = true;
					$scope.paymentTemplate = false;
                    $scope.profileSuccessful=true;
					
					$scope.getAllHelpSettingDetails();
				    $timeout( function(){ 
						 console.log($scope.settingdata);
						 $('#payment').val($scope.settingdata[6].settingheader)
						 $('#payment_content').froalaEditor('html.set', $scope.settingdata[6].settingcontent);
					 }, 200);
				
				}
				
				$scope.paymentPrior = function()
				{
					
					$scope.settingsDisplay = true;
					$scope.paymentTemplate = false;
                    $scope.profileSuccessful=true;
					
					$scope.getAllHelpSettingDetails();
				    $timeout( function(){ 
						 console.log($scope.settingdata);
						 $('#paymentPrior').val($scope.settingdata[7].settingheader)
						 $('#paymentPrior_content').froalaEditor('html.set', $scope.settingdata[7].settingcontent);
					 }, 200);
				
				}
				
				
				$scope.order = function()
				{
					
					$scope.settingsDisplay = true;
					$scope.paymentTemplate = false;
                    $scope.profileSuccessful=true;
					
					$scope.getAllHelpSettingDetails();
				    $timeout( function(){ 
						 console.log($scope.settingdata);
						 $('#order').val($scope.settingdata[8].settingheader)
						 $('#order_content').froalaEditor('html.set', $scope.settingdata[8].settingcontent);
					 }, 200);
				
				}
				
				
				$scope.orderPrior = function()
				{
					$scope.settingDisplay = true;
					$scope.paymentTemplate = false;
                    $scope.profileSuccessful=true;
					
					$scope.getAllHelpSettingDetails();
				    $timeout( function(){ 
						 console.log($scope.settingdata);
						 $('#orderPrior').val($scope.settingdata[9].settingheader)
						 $('#orderPrior_content').froalaEditor('html.set', $scope.settingdata[9].settingcontent);
					 }, 200);
				
				}
				
				$scope.quote = function()
				{
					
					$scope.quoteDisplay = true;
					$scope.paymentTemplate = false;
                    $scope.profileSuccessful=true;
					
					$scope.getAllHelpSettingDetails();
				    $timeout( function(){ 
						 console.log($scope.settingdata);
						 $('#quote').val($scope.settingdata[10].settingheader)
						 $('#quote_content').froalaEditor('html.set', $scope.settingdata[10].settingcontent);
					 }, 200);
				
				}
				
				
			  
				$scope.quotePrior = function()
				{
					
					$scope.quotePriorDisplay = true;
					$scope.paymentTemplate = false;
                    $scope.profileSuccessful=true;
					
					$scope.getAllHelpSettingDetails();
				    $timeout( function(){ 
						 console.log($scope.settingdata);
						 $('#quotePrior').val($scope.settingdata[11].settingheader)
						 $('#quotePrior_content').froalaEditor('html.set', $scope.settingdata[11].settingcontent);
					 }, 200);
				
				}
				
				$scope.appointment = function()
				{
					
					$scope.appointmentDisplay = true;
					$scope.paymentTemplate = false;
                    $scope.profileSuccessful=true;
					
					$scope.getAllHelpSettingDetails();
				    $timeout( function(){ 
						 console.log($scope.settingdata);
						 $('#appointment').val($scope.settingdata[12].settingheader)
						 $('#appointment_content').froalaEditor('html.set', $scope.settingdata[12].settingcontent);
					 }, 200);
				
				}
				
				$scope.appointmentPrior = function()
				{
					
					$scope.appointmentPriorDisplay = true;
					$scope.paymentTemplate = false;
                    $scope.profileSuccessful=true;
					
					$scope.getAllHelpSettingDetails();
				    $timeout( function(){ 
						 console.log($scope.settingdata);
						 $('#appointmentPrior').val($scope.settingdata[13].settingheader)
						 $('#appointmentPrior_content').froalaEditor('html.set', $scope.settingdata[13].settingcontent);
					 }, 200);
				
				}
				
				$scope.event = function()
				{
					
					$scope.eventDisplay = true;
					$scope.paymentTemplate = false;
                    $scope.profileSuccessful=true;
					
					$scope.getAllHelpSettingDetails();
				    $timeout( function(){ 
						 console.log($scope.settingdata);
						 $('#event').val($scope.settingdata[14].settingheader)
						 $('#event_content').froalaEditor('html.set', $scope.settingdata[14].settingcontent);
					 }, 200);
				
				}
				
				$scope.eventPrior = function()
				{
					
					$scope.eventPriorDisplay = true;
					$scope.paymentTemplate = false;
                    $scope.profileSuccessful=true;
					
					$scope.getAllHelpSettingDetails();
				    $timeout( function(){ 
						 console.log($scope.settingdata);
						 $('#eventPrior').val($scope.settingdata[15].settingheader)
						 $('#eventPrior_content').froalaEditor('html.set', $scope.settingdata[15].settingcontent);
					 }, 200);
				
				}
				
				$scope.customerList = function()
				{
					
					$scope.custDisplay = true;
					$scope.paymentTemplate = false;
                    $scope.profileSuccessful=true;
					
					$scope.getAllHelpSettingDetails();
				    $timeout( function(){ 
						 console.log($scope.settingdata);
						 $('#cust').val($scope.settingdata[16].settingheader)
						 $('#cust_content').froalaEditor('html.set', $scope.settingdata[16].settingcontent);
					 }, 200);
				}
				
		
				
				$scope.venueList = function()
				{
					
					$scope.venueListDisplay = true;
					$scope.paymentTemplate = false;
                    $scope.profileSuccessful=true;
					
					$scope.getAllHelpSettingDetails();
				    $timeout( function(){ 
						 console.log($scope.settingdata);
						 $('#venue').val($scope.settingdata[18].settingheader)
						 $('#venue_content').froalaEditor('html.set', $scope.settingdata[18].settingcontent);
					 }, 200);
				
				}
				
				$scope.addVenue = function()
				{
					
					$scope.addVenuesDisplay = true;
					$scope.paymentTemplate = false;
                    $scope.profileSuccessful=true;
                    $scope.addVenueAddress = true;
                    
					
					$scope.getAllHelpSettingDetails();
				    $timeout( function(){ 
						 console.log($scope.settingdata);
						 $('#addVenue').val($scope.settingdata[19].settingheader)
						 $('#addVenue_content').froalaEditor('html.set', $scope.settingdata[19].settingcontent);
						 
						 $('#addVenueAddress').val($scope.settingdata[98].settingheader)
						 $('#venueAddress').froalaEditor('html.set', $scope.settingdata[98].settingcontent);
						 
						 $('#addVenueContact').val($scope.settingdata[99].settingheader)
						 $('#venueContact').froalaEditor('html.set', $scope.settingdata[99].settingcontent);
						 
						 $('#addVenuePhone').val($scope.settingdata[100].settingheader)
						 $('#venuePhone').froalaEditor('html.set', $scope.settingdata[100].settingcontent);
										 
						 $('#addVenueDeliveryCharge').val($scope.settingdata[101].settingheader)
						 $('#venueDeliveryCharge').froalaEditor('html.set', $scope.settingdata[101].settingcontent);
					 }, 200);
				
				}
				
				$scope.eventLists = function()
				{
					
					$scope.eventListsDisplay = true;
					$scope.paymentTemplate = false;
                    $scope.profileSuccessful=true;
					
					$scope.getAllHelpSettingDetails();
				    $timeout( function(){ 
						 console.log($scope.settingdata);
						 $('#event').val($scope.settingdata[20].settingheader)
						 $('#event_content').froalaEditor('html.set', $scope.settingdata[20].settingcontent);
					 }, 200);
				
				}
				
				$scope.addEvents = function()
				{
					
					$scope.addEventsDisplay = true;
					$scope.paymentTemplate = false;
                    $scope.profileSuccessful=true;
                    $scope.addOtherVendorsDisplay = true;
					
					$scope.getAllHelpSettingDetails();
				    $timeout( function(){ 
						 console.log($scope.settingdata);
						 $('#addEvent').val($scope.settingdata[21].settingheader)
						 $('#addEvent_content').froalaEditor('html.set', $scope.settingdata[21].settingcontent);
						 
						 $('#addEventName').val($scope.settingdata[102].settingheader)
						 $('#EventName').froalaEditor('html.set', $scope.settingdata[102].settingcontent);
						 
						 $('#addEventDate').val($scope.settingdata[103].settingheader)
						 $('#EventDate').froalaEditor('html.set', $scope.settingdata[103].settingcontent);
						 
						 $('#addEventTime').val($scope.settingdata[104].settingheader)
						 $('#EventTime').froalaEditor('html.set', $scope.settingdata[104].settingcontent);
						 
						 $('#addCakeDeliveryTime').val($scope.settingdata[105].settingheader)
						 $('#CakeDeliveryTime').froalaEditor('html.set', $scope.settingdata[105].settingcontent);
						 
						 $('#addOtherVendors').val($scope.settingdata[106].settingheader)
						 $('#otherVendorsContent').froalaEditor('html.set', $scope.settingdata[106].settingcontent);
					 }, 200);
				
				}
				
				$scope.cakeList = function()
				{
					
					$scope.addCakeDisplay = true;
					$scope.paymentTemplate = false;
                    $scope.profileSuccessful=true;
					
					$scope.getAllHelpSettingDetails();
				    $timeout( function(){ 
						 console.log($scope.settingdata);
						 $('#allCakeList').val($scope.settingdata[22].settingheader)
						 $('#allCakeList_content').froalaEditor('html.set', $scope.settingdata[22].settingcontent);
					 }, 200);
				
				}
				
				$scope.weddingCake = function()
				{
					
					$scope.addWeddingCakeDisplay = true;
				
				    $scope.paymentTemplate = false;
                    $scope.profileSuccessful=true;
				    $scope.getAllHelpSettingDetails();
			    $timeout( function(){ 
					 console.log($scope.settingdata);
					 $('#weddingCakeBuilder').val($scope.settingdata[23].settingheader)
					 $('#weddingCakeBuilder_content').froalaEditor('html.set', $scope.settingdata[23].settingcontent);
				 }, 200);
				
				}
				
				$scope.partyCake = function()
				{
					
					$scope.addPartyCakeDisplay = true;
					
					$scope.paymentTemplate = false;
                    $scope.profileSuccessful=true;
				    $scope.getAllHelpSettingDetails();
			    $timeout( function(){ 
					 console.log($scope.settingdata);
					 $('#allPartyCakeList').val($scope.settingdata[24].settingheader)
					 $('#allPartyCakeList_content').froalaEditor('html.set', $scope.settingdata[24].settingcontent);
				 }, 200);
				
				}
				
				$scope.orderType = function()
				{
					
					$scope.orderTypeDisplay = true;
				
					$scope.paymentTemplate = false;
                    $scope.profileSuccessful=true;
				    $scope.getAllHelpSettingDetails();
			    $timeout( function(){ 
					 console.log($scope.settingdata);
					 $('#orderTypeAddNew').val($scope.settingdata[25].settingheader)
					 $('#orderTypeAddNew_content').froalaEditor('html.set', $scope.settingdata[25].settingcontent);
				 }, 200);
				}
				
				$scope.cakeType = function()
				{
					
					$scope.cakeTypeDisplay = true;
					
					$scope.paymentTemplate = false;
                    $scope.profileSuccessful=true;
				    $scope.getAllHelpSettingDetails();
			    $timeout( function(){ 
					 console.log($scope.settingdata);
					 $('#cakeType').val($scope.settingdata[26].settingheader)
					 $('#cakeType_contents').froalaEditor('html.set', $scope.settingdata[26].settingcontent);
				 }, 200);
				
				
				}
				
				
				$scope.predefined = function()
				{
					
					$scope.predefinedTypeDisplay = true;
					
					$scope.paymentTemplate = false;
                    $scope.profileSuccessful=true;
				    $scope.getAllHelpSettingDetails();
			    $timeout( function(){ 
					 console.log($scope.settingdata);
					 $('#predefinedType').val($scope.settingdata[27].settingheader)
					 $('#predefinedType_contents').froalaEditor('html.set', $scope.settingdata[27].settingcontent);
				 }, 200);
				
				}
				
				
				$scope.buildCake = function()
				{
					
					$scope.buildCakeDisplay = true;
					
					$scope.paymentTemplate = false;
                    $scope.profileSuccessful=true;
				    $scope.getAllHelpSettingDetails();
			    $timeout( function(){ 
					 console.log($scope.settingdata);
					 $('#buildCake').val($scope.settingdata[28].settingheader)
					 $('#buildCake_content').froalaEditor('html.set', $scope.settingdata[28].settingcontent);
				 }, 200);
				
				}
				
				
				$scope.selectPredefinedCake = function()
				{
					
					$scope.selectPredefinedCakeDisplay = true;
					
					$scope.paymentTemplate = false;
                    $scope.profileSuccessful=true;
				    $scope.getAllHelpSettingDetails();
			    $timeout( function(){ 
					 console.log($scope.settingdata);
					 $('#selectPredefinedCake').val($scope.settingdata[29].settingheader)
					 $('#selectPredefinedCake_content').froalaEditor('html.set', $scope.settingdata[29].settingcontent);
				 }, 200);
				
				}
				
				$scope.eventsAdd = function()
				{
					
					$scope.eventsDisplay = true;
					
					$scope.paymentTemplate = false;
                    $scope.profileSuccessful=true;
				    $scope.getAllHelpSettingDetails();
			    $timeout( function(){ 
					 console.log($scope.settingdata);
					 $('#event').val($scope.settingdata[30].settingheader)
					 $('#event_content').froalaEditor('html.set', $scope.settingdata[30].settingcontent);
				 }, 200);
				
				}
				
				
				$scope.cupCake = function()
				{
					
					$scope.cupCakeListDisplay = true;
					
					$scope.paymentTemplate = false;
                    $scope.profileSuccessful=true;
					
					$scope.getAllHelpSettingDetails();
				    $timeout( function(){ 
						 console.log($scope.settingdata);
						 $('#cupCakeList').val($scope.settingdata[32].settingheader)
						 $('#cupCakeListContent').froalaEditor('html.set', $scope.settingdata[32].settingcontent);
					 }, 200);
					
					
				
				}
				
				
				$scope.cupCakeAdd = function()
				{
					
					$scope.cupCakeAddDisplay = true;
					
					$scope.paymentTemplate = false;
                    $scope.profileSuccessful=true;
					
					$scope.getAllHelpSettingDetails();
				    $timeout( function(){ 
						 console.log($scope.settingdata);
						 $('#addCupCake').val($scope.settingdata[33].settingheader)
						 $('#addCupCakeContents').froalaEditor('html.set', $scope.settingdata[33].settingcontent);
					 }, 200);
				
				}
				
				
				
				$scope.cakePansList = function()
				{
					
					$scope.cakePansListDisplay = true;
					
					$scope.paymentTemplate = false;
                    $scope.profileSuccessful=true;
					
					$scope.getAllHelpSettingDetails();
				    $timeout( function(){ 
						 console.log($scope.settingdata);
						 $('#cakePansList').val($scope.settingdata[34].settingheader)
						 $('#cakePansListContents').froalaEditor('html.set', $scope.settingdata[34].settingcontent);
					 }, 200);
				
				}
				
				
				
				$scope.addNewCakePansList = function()
				{
					
					$scope.addNewCakePansListDisplay = true;
					
					$scope.paymentTemplate = false;
                    $scope.profileSuccessful=true;
					
					$scope.getAllHelpSettingDetails();
				    $timeout( function(){ 
						 console.log($scope.settingdata);
						 $('#addNewCakePansList').val($scope.settingdata[35].settingheader)
						 $('#addNewCakePansListContents').froalaEditor('html.set', $scope.settingdata[35].settingcontent);
						 
						 $('#addPanShape').val($scope.settingdata[107].settingheader)
						 $('#addNewCakePansPanShape').froalaEditor('html.set', $scope.settingdata[107].settingcontent);
						 
						 $('#addNewCakePanWeddingCakeServingPerLayer').val($scope.settingdata[108].settingheader)
						 $('#addNewCakePansWeddingCakeServingPerLayer').froalaEditor('html.set', $scope.settingdata[108].settingcontent);
						 
						 $('#addNewCakePanPartyCakeServingPerLayer').val($scope.settingdata[109].settingheader)
						 $('#addNewCakePansPartyCakeServingPerLayer').froalaEditor('html.set', $scope.settingdata[109].settingcontent);
						 
						 $('#addNewCakePanCupsBatterPerLayer').val($scope.settingdata[110].settingheader)
						 $('#addNewCakePansCupsBatterPerLayer').froalaEditor('html.set', $scope.settingdata[110].settingcontent);
						 
						 $('#addNewCakePanCupsIcingPerLayer').val($scope.settingdata[111].settingheader)
						 $('#addNewCakePansCupsIcingPerLayer').froalaEditor('html.set', $scope.settingdata[111].settingcontent);
						 
						 $('#addNewCakePanCupsFillingPerLayer').val($scope.settingdata[112].settingheader)
						 $('#addNewCakePansCupsFillingPerLayer').froalaEditor('html.set', $scope.settingdata[112].settingcontent);
						 
						 $('#addNewCakePanCupsLBSPerLayer').val($scope.settingdata[113].settingheader)
						 $('#addNewCakePansCupsLBSPerLayer').froalaEditor('html.set', $scope.settingdata[113].settingcontent);
					 }, 200);
				
				}
				
				
				$scope.priceList = function()
				{
					
					$scope.priceListDisplay = true;
					
					$scope.paymentTemplate = false;
                    $scope.profileSuccessful=true;
					
					$scope.getAllHelpSettingDetails();
				    $timeout( function(){ 
						 console.log($scope.settingdata);
						 $('#priceList').val($scope.settingdata[36].settingheader)
						 $('#priceListContents').froalaEditor('html.set', $scope.settingdata[36].settingcontent);
					 }, 200);
				
				}
				
				

				$scope.priceAdd = function()
				{
					
					$scope.priceAddDisplay = true;
					
					$scope.paymentTemplate = false;
                    $scope.profileSuccessful=true;
					
					$scope.getAllHelpSettingDetails();
				    $timeout( function(){ 
						 console.log($scope.settingdata);
						 $('#priceAdd').val($scope.settingdata[37].settingheader)
						 $('#priceAddContents').froalaEditor('html.set', $scope.settingdata[37].settingcontent);
						 
						 $('#addPriceAddBasePricePerDozen').val($scope.settingdata[114].settingheader)
						 $('#priceAddBasePricePerDozen').froalaEditor('html.set', $scope.settingdata[114].settingcontent);
						 
						 $('#addPriceAddServing').val($scope.settingdata[115].settingheader)
						 $('#priceAddServing').froalaEditor('html.set', $scope.settingdata[115].settingcontent);
					 }, 200);
				
				}
				

				$scope.recipePriceList = function()
				{
					
					$scope.recipePriceListDisplay = true;
					
					$scope.paymentTemplate = false;
                    $scope.profileSuccessful=true;
					
					$scope.getAllHelpSettingDetails();
				    $timeout( function(){ 
						 console.log($scope.settingdata);
						 $('#recipePriceList').val($scope.settingdata[38].settingheader)
						 $('#recipePriceListContents').froalaEditor('html.set', $scope.settingdata[38].settingcontent);
						 
					 }, 200);
				
				}
				
				$scope.recipePriceAdd = function()
				{
					
					$scope.recipePriceAddDisplay = true;
					
					$scope.paymentTemplate = false;
                    $scope.profileSuccessful=true;
					
					$scope.getAllHelpSettingDetails();
				    $timeout( function(){ 
						 console.log($scope.settingdata);
						 $('#recipePriceAdd').val($scope.settingdata[39].settingheader)
						 $('#recipePriceAddContents').froalaEditor('html.set', $scope.settingdata[39].settingcontent);
						 
						 $('#recipePriceAddRecipes').val($scope.settingdata[116].settingheader)
						 $('#recipePriceAddRecipe').froalaEditor('html.set', $scope.settingdata[116].settingcontent);
						 
						 $('#recipePriceAddPriceDozen').val($scope.settingdata[117].settingheader)
						 $('#recipePriceAddPricePerDozen').froalaEditor('html.set', $scope.settingdata[117].settingcontent);
					 }, 200);
				
				}
				
				
				$scope.icingPriceList = function()
				{
					
					$scope.icingPriceListDisplay = true;
					
					$scope.paymentTemplate = false;
                    $scope.profileSuccessful=true;
					
					$scope.getAllHelpSettingDetails();
				    $timeout( function(){ 
						 console.log($scope.settingdata);
						 $('#icingPriceList').val($scope.settingdata[40].settingheader)
						 $('#icingPriceListContents').froalaEditor('html.set', $scope.settingdata[40].settingcontent);
					 }, 200);
				
				}
				
				
				$scope.icingPriceAdd = function()
				{
					
					$scope.icingPriceAddDisplay = true;
					
					$scope.paymentTemplate = false;
                    $scope.profileSuccessful=true;
					
					$scope.getAllHelpSettingDetails();
				    $timeout( function(){ 
						 console.log($scope.settingdata);
						 $('#icingPriceAdd').val($scope.settingdata[41].settingheader)
						 $('#icingPriceAddContents').froalaEditor('html.set', $scope.settingdata[41].settingcontent);
						 
						 $('#icingPriceAddIcings').val($scope.settingdata[118].settingheader)
						 $('#icingPriceAddIcing').froalaEditor('html.set', $scope.settingdata[118].settingcontent);
						 
						 $('#icingPriceAddPriceDozen').val($scope.settingdata[119].settingheader)
						 $('#icingPriceAddPricePerDozen').froalaEditor('html.set', $scope.settingdata[119].settingcontent);
					 }, 200);
				
				}
				
				$scope.fillingPriceList = function()
				{
					
					$scope.fillingsPriceListDisplay = true;
					
					$scope.paymentTemplate = false;
                    $scope.profileSuccessful=true;
					
					$scope.getAllHelpSettingDetails();
				    $timeout( function(){ 
						 console.log($scope.settingdata);
						 $('#fillingsPriceList').val($scope.settingdata[42].settingheader)
						 $('#fillingsPriceListContents').froalaEditor('html.set', $scope.settingdata[42].settingcontent);
					 }, 200);
				
				}
				
				
				$scope.fillingPriceAdd = function()
				{
					
					$scope.fillingsPriceAddDisplay = true;
					
					$scope.paymentTemplate = false;
                    $scope.profileSuccessful=true;
					
					$scope.getAllHelpSettingDetails();
				    $timeout( function(){ 
						 console.log($scope.settingdata);
						 $('#fillingsPriceAdd').val($scope.settingdata[43].settingheader)
						 $('#fillingsPriceAddContents').froalaEditor('html.set', $scope.settingdata[43].settingcontent);
						 
						 $('#fillingPriceAddFillings').val($scope.settingdata[120].settingheader)
						 $('#fillingPriceAddFilling').froalaEditor('html.set', $scope.settingdata[120].settingcontent);
						 
						 $('#fillingPriceAddPriceDozen').val($scope.settingdata[121].settingheader)
						 $('#fillingPriceAddPricePerDozen').froalaEditor('html.set', $scope.settingdata[121].settingcontent);
					 }, 200);
				
				}
				
				$scope.toppingPriceList = function()
				{
					
					$scope.toppingPriceListDisplay = true;
					
					$scope.paymentTemplate = false;
                    $scope.profileSuccessful=true;
					
					$scope.getAllHelpSettingDetails();
				    $timeout( function(){ 
						 console.log($scope.settingdata);
						 $('#toppingPriceList').val($scope.settingdata[44].settingheader)
						 $('#toppingPriceListContents').froalaEditor('html.set', $scope.settingdata[44].settingcontent);
					 }, 200);
				
				}
				
				$scope.toppingPriceAdd = function()
				{
					
					$scope.toppingPriceAddDisplay = true;
					
					$scope.paymentTemplate = false;
                    $scope.profileSuccessful=true;
					
					$scope.getAllHelpSettingDetails();
				    $timeout( function(){ 
						 console.log($scope.settingdata);
						 $('#toppingPriceAdd').val($scope.settingdata[45].settingheader)
						 $('#toppingPriceAddContents').froalaEditor('html.set', $scope.settingdata[45].settingcontent);
						 
						 $('#topping').val($scope.settingdata[122].settingheader)
						 $('#toppingContents').froalaEditor('html.set', $scope.settingdata[122].settingcontent);
						 
						 $('#pricePerDozen').val($scope.settingdata[123].settingheader)
						 $('#pricePerDozenContents').froalaEditor('html.set', $scope.settingdata[123].settingcontent);
					 }, 200);
				
				}
				
				$scope.wrapperPriceList = function()
				{
					
					$scope.wrapperPriceListDisplay = true;
					
					$scope.paymentTemplate = false;
                    $scope.profileSuccessful=true;
					
					$scope.getAllHelpSettingDetails();
				    $timeout( function(){ 
						 console.log($scope.settingdata);
						 $('#wrapperPriceList').val($scope.settingdata[46].settingheader)
						 $('#wrapperPriceListContents').froalaEditor('html.set', $scope.settingdata[46].settingcontent);
					 }, 200);
				
				}
				
				$scope.wrapperPriceAdd = function()
				{
					
					$scope.wrapperPriceAddDisplay = true;
					
					$scope.paymentTemplate = false;
                    $scope.profileSuccessful=true;
					
					$scope.getAllHelpSettingDetails();
				    $timeout( function(){ 
						 console.log($scope.settingdata);
						 $('#wrapperPriceAdd').val($scope.settingdata[47].settingheader)
						 $('#wrapperPriceAddContent').froalaEditor('html.set', $scope.settingdata[47].settingcontent);
						 
						 $('#wrapper').val($scope.settingdata[124].settingheader)
						 $('#wrapperContent').froalaEditor('html.set', $scope.settingdata[124].settingcontent);
						 
						 $('#wrapperPricePerDozen').val($scope.settingdata[125].settingheader)
						 $('#wrapperPricePerDozenContent').froalaEditor('html.set', $scope.settingdata[125].settingcontent);
					 }, 200);
				
				}
				
				$scope.materialsList = function()
				{
					
					$scope.materialsPriceListDisplay = true;
					
					$scope.paymentTemplate = false;
                    $scope.profileSuccessful=true;
					
					$scope.getAllHelpSettingDetails();
				    $timeout( function(){ 
						 console.log($scope.settingdata);
						 $('#materialList').val($scope.settingdata[48].settingheader)
						 $('#materialListContent').froalaEditor('html.set', $scope.settingdata[48].settingcontent);
					 }, 200);
				
				}
				$scope.materialsAdd = function()
				{
					
					$scope.materialsAddDisplay = true;
					
					$scope.paymentTemplate = false;
                    $scope.profileSuccessful=true;
					
					$scope.getAllHelpSettingDetails();
				    $timeout( function(){ 
						 console.log($scope.settingdata);
						 $('#addMaterialListContent').val($scope.settingdata[49].settingheader)
						 $('#addMaterialListContent').froalaEditor('html.set', $scope.settingdata[49].settingcontent);
					 }, 200);
				
				}
				
				$scope.ingredientsList = function()
				{
					
					$scope.ingredientsListDisplay = true;
					
					$scope.paymentTemplate = false;
                    $scope.profileSuccessful=true;
					
					$scope.getAllHelpSettingDetails();
				    $timeout( function(){ 
						 console.log($scope.settingdata);
						 $('#ingredientsList').val($scope.settingdata[50].settingheader)
						 $('#ingredientsListContent').froalaEditor('html.set', $scope.settingdata[50].settingcontent);
					 }, 200);
				
				}
				
				$scope.ingredientsAdd = function()
				{
					
					$scope.ingredientsAddDisplay = true;
					
					$scope.paymentTemplate = false;
                    $scope.profileSuccessful=true;
					
					$scope.getAllHelpSettingDetails();
				    $timeout( function(){ 
						 console.log($scope.settingdata);
						 $('#addIngredientsListContent').val($scope.settingdata[51].settingheader)
						 $('#addIngredientsListContent').froalaEditor('html.set', $scope.settingdata[51].settingcontent);
						 
						 $('#purchaseQuantity').val($scope.settingdata[126].settingheader)
						 $('#purchaseQuantityContent').froalaEditor('html.set', $scope.settingdata[126].settingcontent);
						 
						 $('#purchasePrice').val($scope.settingdata[127].settingheader)
						 $('#purchasePriceContent').froalaEditor('html.set', $scope.settingdata[127].settingcontent);
					 }, 200);
				
				}
				
				$scope.recipeeList = function()
				{
					
					$scope.recipeeListDisplay = true;
					
					$scope.paymentTemplate = false;
                    $scope.profileSuccessful=true;
					
					$scope.getAllHelpSettingDetails();
				    $timeout( function(){ 
						 console.log($scope.settingdata);
						 $('#recipeList').val($scope.settingdata[52].settingheader)
						 $('#recipeListContent').froalaEditor('html.set', $scope.settingdata[52].settingcontent);
					 
					 }, 200);
				
				}
				
				$scope.recipeeAdd = function()
				{
					
					$scope.recipeeAddDisplay = true;
					
					$scope.paymentTemplate = false;
                    $scope.profileSuccessful=true;
					
					$scope.getAllHelpSettingDetails();
				    $timeout( function(){ 
						 console.log($scope.settingdata);
						 $('#addRecipeListContent').val($scope.settingdata[53].settingheader)
						 $('#addRecipeListContent').froalaEditor('html.set', $scope.settingdata[53].settingcontent);
						 
						 $('#pricePerServing').val($scope.settingdata[128].settingheader)
						 $('#pricePerServingContent').froalaEditor('html.set', $scope.settingdata[128].settingcontent);
					 }, 200);
				
				}
				
				$scope.ordersList = function()
				{
					
					$scope.ordersListDisplay = true;
					
					$scope.paymentTemplate = false;
                    $scope.profileSuccessful=true;
					
					$scope.getAllHelpSettingDetails();
				    $timeout( function(){ 
						 console.log($scope.settingdata);
						 $('#orderList').val($scope.settingdata[54].settingheader)
						 $('#orderListContent').froalaEditor('html.set', $scope.settingdata[54].settingcontent);
					 }, 200);
				
				}
				

				$scope.ordersAdd = function()
				{
					
					$scope.ordersAddDisplay = true;
					
					$scope.paymentTemplate = false;
                    $scope.profileSuccessful=true;
					
					$scope.getAllHelpSettingDetails();
				    $timeout( function(){ 
						 console.log($scope.settingdata);
						 $('#addOrderListContent').val($scope.settingdata[55].settingheader)
						 $('#addOrderListContent').froalaEditor('html.set', $scope.settingdata[55].settingcontent);
					 }, 200);
				
				}
				

				$scope.financial=function()
				 {
				
				   $scope.paymentTemplate = true;
				   $scope.vatRegTemplate= true;
				   $scope.settingsDisplay = false;
				   $scope.vatTaxRateshow= true;
				   $scope.hourlyRateshow= true;
				   $scope.paymentreminderDueDay= true;
				   $scope.Quotearchivalspan= true;
				   $scope.taxDeliveryshow= true;
				   $scope.hourstodo100servingcakee= true;
				   $scope.retail_Markup= true;
				   $scope.timetodo24cakesshow= true;
				   $scope.getAllHelpSettingDetails();
				   
				    $timeout( function(){ 
						 console.log($scope.settingdata[54].settingcontent);
						
						 $('#taxrateheader').val($scope.settingdata[64].settingheader)
						 $('#paymenttemp').froalaEditor('html.set', $scope.settingdata[64].settingcontent);
					 
						 $('#vattaxheader').val($scope.settingdata[65].settingheader)
						 $('#vatRegistration').froalaEditor('html.set', $scope.settingdata[65].settingcontent);
					 
						 $('#vattaxrateheader').val($scope.settingdata[66].settingheader)
						 $('#vatTaxRate').froalaEditor('html.set', $scope.settingdata[66].settingcontent);
					 
						 $('#hourleyRateheader').val($scope.settingdata[67].settingheader)
						 $('#hourlyRate').froalaEditor('html.set', $scope.settingdata[67].settingcontent);
					 
						 $('#paymentreminderheader').val($scope.settingdata[68].settingheader)
						 $('#paymentReminder').froalaEditor('html.set', $scope.settingdata[68].settingcontent);
						 
						 $('#quoteArchivalspanheader').val($scope.settingdata[69].settingheader)
						 $('#quoteArchival').froalaEditor('html.set', $scope.settingdata[69].settingcontent);
						 
						 $('#taxDeliveryheader').val($scope.settingdata[70].settingheader)
						 $('#taxDelivery').froalaEditor('html.set', $scope.settingdata[70].settingcontent);
						 
						 $('#hourstodoservingcakeheader').val($scope.settingdata[71].settingheader)
						 $('#hourstodo100servingcake').froalaEditor('html.set', $scope.settingdata[71].settingcontent);
						 
						 $('#retailMarkupheader').val($scope.settingdata[72].settingheader)
						 $('#retailMarkup').froalaEditor('html.set', $scope.settingdata[72].settingcontent);
						 
						 $('#timetodo24cupcakesheader').val($scope.settingdata[73].settingheader)
						 $('#timetodo24cupCakes').froalaEditor('html.set', $scope.settingdata[73].settingcontent);
						 
				    
				    }, 200);
				   
				 }
				 
				 $scope.general=function()
				 {
					
					   $scope.settingsDisplay = true;
					   $scope.vatRegTemplate = false;
				       $scope.paymentTemplate = false;
					   $scope.vatTaxRateshow= false;
					   $scope.hourlyRateshow= false;
					   $scope.paymentreminderDueDay= false;
					   $scope.Quotearchivalspan= false;
					   $scope.taxDeliveryshow= false;
					   $scope.hourstodo100servingcakee= false;
					   $scope.retail_Markup= false;
					   $scope.timetodo24cakesshow= false;
				    
				 }
				 
				 $scope.themeHelpContent=function()
				 {
					$scope.settingsDisplay = true;
				 } 
			  
			
				 $scope.signupsuccessfully=function()
				 {
					 $scope.signupSuccessfully_Template=true;
					 $scope.psu_Template=false;
					 $scope.pscA_Template=false;
					 $scope.getAllHelpSettingDetails();
					 
						$timeout( function(){ 
							 console.log($scope.settingdata);
							 $('#sighnupsucessfully').val($scope.settingdata[0].settingheader)
							 $('#sighnupsucessfully_content').froalaEditor('html.set', $scope.settingdata[0].settingcontent);
						 }, 200);
					 
		 
				 }
				 
				 $scope.pscU=function()
				 {
					 $scope.psu_Template=true;
					 $scope.pscA_Template=false;
					 $scope.signupSuccessfully_Template=false;
					 $scope.getAllHelpSettingDetails();
					 
						$timeout( function(){ 
							 console.log($scope.settingdata);
							 $('#paymentdoneconfirmationmail_user').val($scope.settingdata[1].settingheader)
							 $('#paymentdoneconfirmationmail_user_content').froalaEditor('html.set', $scope.settingdata[1].settingcontent);
						 }, 200);
				 }
				 
				 
				 $scope.pscA=function()
				 {
					 $scope.pscA_Template=true;
					 $scope.psu_Template=false;
					 $scope.signupSuccessfully_Template=false;
					 $scope.getAllHelpSettingDetails();
					 
						$timeout( function(){ 
							 console.log($scope.settingdata);
							 $('#paymentdoneconfirmationmail_admin').val($scope.settingdata[2].settingheader)
							 $('#paymentdoneconfirmationmail_admin_content').froalaEditor('html.set', $scope.settingdata[2].settingcontent);
						 }, 200);
				 }
				 

				 
				 $scope.saveSettingData=function(idvalue,headerid,headercontent)
				 {
				
					 var settingheader=$("#"+headerid).val();
					 var headercontent_d=$("#"+headercontent).froalaEditor('html.get');
					 var headercontent_Text= $(headercontent_d).text()
				
					 $http.post('/admin/updateALLHelpSettingDetail?id='+parseInt(idvalue)+'&settinghead='+settingheader+'&headercont='+headercontent_Text).success(function(data) {
						
				    	 }, function myError(response) {
							alert("Sorry, Some technical error occur");
						}); 
					  
				 }
				 
				 

				/* $scope.saveSocialData = function(templatedata[0],'ordertemp','orderheader')
				 {
					 var templatedata=$("#"+headerid).val();
					 var headercontent_d=$("#"+headercontent).froalaEditor('html.get');

					 var headercontent_Text= $(headercontent_d).text()
					 
					 $http.post('/admin/updateALLHelpSettingDetail?id='+parseInt(idvalue)+'&settinghead='+settingheader+'&headercont='+headercontent_Text).success(function(data) {
						
						 alert("Updated")

				    	 }, function myError(response) {
							alert("Sorry, Some technical error occur");
						}); 
					 
				 }*/
				 
				 
				 

				 $scope.addCust = function()
					{
					    $scope.addCustomerform = true;
					    $scope.getRefferal();
					    $scope.userListShow = false;
					}
				 

				 $scope.submitCust = function(custData){
					 alert('aaaaaaaaaaaaaaaaaa');
						console.log("Edit user Data...",custData);
						custData.userName = $scope.currentUserName;
						var bridename=$("#clientFname").val()+$("#clientLname").val();
						var refferalid=$("#refferalId").val();
					       
						
					  	/*if($('#phone_validation').css('display') != 'none'|| $('#email_validation').css('display') != 'none' ||  $('#zip_validation').css('display') != 'none' ) 
						{

						}
					  	else
					  		{*/
							$http.post('/customer/addCustomer/'+$scope.currentUserName+'/'+bridename+'/'+refferalid,custData).success(function(data) {
								
						        $("#div1").show();
			    		        $("#div1").html("Save successfully !!");
			    		        $("#div1").fadeIn();
			    		        $("#div1").fadeOut(7000);
								
								
								$scope.backToCustomerList();
							}, function myError(response) {
								alert("Sorry, Some technical error occur");
							});
					  	/*	}*/
						
					
					}
				 
				    $scope.getRefferal=function()
				    {
				    
				          $http.get('/referral/allReferral').success(function(data) {
								$scope.referralData2 = data;
								console.log("Referral",data);
								$scope.referralTable = new NgTableParams({}, 
								{
									dataset : $scope.referralData2
								});
							}, function myError(response) {
								alert("Sorry, Some technical error occur");
							});
				    }	 

                   
				    $scope.getReloadUserData=function()
				    {
				    	$scope.addCustomerform=false;
				    	$scope.userListShow=true;
				    	$scope.userDataList=null;
				    	
						$timeout( function(){ 
						$scope.getUserData();	
					
						 }, 500);
				    	
				    	
				    	
				    }
				    
				    
				    $scope.submitCustFromSuperadmin=function(custData)
				    {
						console.log("Edit user Data...",custData);
						custData.userName = $scope.currentUserName;
						
						var bridename=$("#clientFname").val()+$("#clientLname").val();
						var groomname=$("#groomfirtsName").val()+$("#groomlastName").val();
				
						var refferalid=$("#refferalId").val();
					       
					  	if($('#phone_validation').css('display') != 'none'|| $('#email_validation').css('display') != 'none' ||  $('#zip_validation').css('display') != 'none' ) 
						{

						}
					  	else
					  		{
							$http.post('/customer/addCustomer/'+$scope.currentUserName+'/'+bridename+'/'+refferalid+'/'+groomname,custData).success(function(data) {
								
						        $("#div1").show();
			    		        $("#div1").html("Save successfully !!");
			    		        $("#div1").fadeIn();
			    		        $("#div1").fadeOut(7000);
								
			    		        $scope.getReloadUserData()
							}, function myError(response) {
								alert("Sorry, Some technical error occur");
							});
					  		}

				    }
				    
					           $scope.updateUserDetails = function(data){
						 
							   console.log("Data .... ",data)
							
								$http.post('/adminController/updateUserStat/'+$scope.currentUserName,data).success(function(data){
										   $scope.socialsettingView();
								}, function myError(response) {
									alert("Sorry, Some technical error occur");
								});
								}
					           
					           
					               $scope.updateUserDetailsFormSuperAdmin = function(data2)
					               {
								
								    console.log("phone details"+$scope.email_s)
								    
					            	$http.post("/admin/updateUserDetailsFromSuperAdmin/"
									+$scope.currentUserName+"?fname="+$scope.fName+"&lname="+$scope.lName+"&id="+$scope.id+"&emailid="+$scope.email_s+"&phoneno="+$scope.phone_s
									+"&address="+$scope.address+"&city="+$scope.city+"&country="+$scope.country).success(function(data)				
					            	{
										$scope.getReloadUserData()
										alert("Updated Successfully !!")
	
									}, function myError(response) {
										alert("Sorry, Some technical error occur");
									});
								  
								   
									}
					               
					               
					               
					       		$scope.addCustomer = function()
								{
									
									$scope.customerFirstNameView = true;
									$scope.clientLastnameheader = true;
				                    $scope.client2firstnameview=true;
				                    $scope.client2lastnameview=true;
				                    $scope.addressview=true;
				                    $scope.address2view=true;
				                    $scope.cityviewload=true;
				                    $scope.statecontentview=true;
				                    $scope.zipcontentview=true;
				                    $scope.telephoneview=true;
				                    $scope.acceptTextMessageview=true;
				                    $scope.emailTextView=true;
				                    $scope.dateofbirthview=true;
				             
									$scope.getAllHelpSettingDetails();
								

								    $timeout( function(){ 
										 console.log($scope.settingdata[54].settingcontent);
										
										 $('#customerfirstnameheader').val($scope.settingdata[85].settingheader)
										 $('#customerfirstnamecontent').froalaEditor('html.set', $scope.settingdata[85].settingcontent);
									 
										 $('#customerlastnameheader').val($scope.settingdata[86].settingheader)
										 $('#customerlastnamecontent').froalaEditor('html.set', $scope.settingdata[86].settingcontent);
									 
										 $('#client2forstnameheader').val($scope.settingdata[87].settingheader)
										 $('#client2firstnamecontent').froalaEditor('html.set', $scope.settingdata[87].settingcontent);
									 
										 $('#client2lastnameheader').val($scope.settingdata[88].settingheader)
										 $('#client2lastnamecontent').froalaEditor('html.set', $scope.settingdata[88].settingcontent);
									 
										 $('#addressheader').val($scope.settingdata[89].settingheader)
										 $('#addresscontent').froalaEditor('html.set', $scope.settingdata[89].settingcontent);
										 
										 $('#address2header').val($scope.settingdata[90].settingheader)
										 $('#address2content').froalaEditor('html.set', $scope.settingdata[90].settingcontent);
										 
										 $('#cityheader').val($scope.settingdata[91].settingheader)
										 $('#citycontent').froalaEditor('html.set', $scope.settingdata[91].settingcontent);
										 
										 $('#stateheader').val($scope.settingdata[92].settingheader)
										 $('#statecontent').froalaEditor('html.set', $scope.settingdata[92].settingcontent);
										 
										 $('#zipcontentheader').val($scope.settingdata[93].settingheader)
										 $('#zipcontent').froalaEditor('html.set', $scope.settingdata[93].settingcontent);
										 
										 $('#telephoneheader').val($scope.settingdata[94].settingheader)
										 $('#telephonecontent').froalaEditor('html.set', $scope.settingdata[94].settingcontent);
										 
										 $('#acceptmessageheader').val($scope.settingdata[95].settingheader)
										 $('#acceptcontent').froalaEditor('html.set', $scope.settingdata[95].settingcontent);
										 
										 $('#emailheader').val($scope.settingdata[96].settingheader)
										 $('#emailheadercontent').froalaEditor('html.set', $scope.settingdata[96].settingcontent);
										 
								     
										 $('#dateofbirthheader').val($scope.settingdata[97].settingheader)
										 $('#dateofbirthcontent').froalaEditor('html.set', $scope.settingdata[97].settingcontent);
										 
								     
								     
										 
								    }, 200);
									

									
								}
					               
	               
					               
			//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
           //********************************************************************* Settings data pull and save central method starts here ************************************					               
		   //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
					      		 $scope.getAllHelpSettingDetails=function()
								 {
					      			 
					      		
					      			 
										$http.get('/admin/getALLHelpSettingDetail/'+$scope.currentUserName).success(function(data) {
											$scope.settingdata=data;
											console.log('Setting list ..',data);
											
										
											
								    	 }, function myError(response) {
											alert("Sorry, Some technical error occur");
										});
								 }
					      		  					      		 
					      		 
								 $scope.saveSettingData=function(idvalue,headerid,headercontent)
								 {
									  
									     var settingheader=$("#"+headerid).val();
									     var headercontent_d=$("#"+headercontent).froalaEditor('html.get');
									     var headercontent_Text= $(headercontent_d).text()
					                      
									      $http.post('/admin/updateALLHelpSettingDetail?id='+parseInt(idvalue)+'&settinghead='+settingheader+'&headercont='+headercontent_Text).success(function(data) {
										  

											$("#saveMessageModal").modal(
													{
														backdrop: 'static',
													    keyboard: false  
													}		
													);
										  
								    	 }, function myError(response) {
								    			$("#saveMessageModalError").modal(
														{
															backdrop: 'static',
														    keyboard: false  
														}		
														);
								    		 
										}); 
									  
								 }
					               
		 //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		 //********************************************************************* Settings data pull and save central method ends  here ************************************					               
		//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++		               
					               
});

//*************************************     Save and update data to Email template Azax and Jquery functions  ***********************************************************************

function updateData(updatedcontent,tableid,tempheading_get)
{

	  $.ajax({
	         type: "POST",
	         url: "/emailtemplate/updateEmilContents?",
	         data: {
	             emailcontent: updatedcontent,
	             id:tableid,
	             tempheading:tempheading_get  
	             
	         },
	         cache: false,
	         success:function()
	         {
	        
	        	 alert("Save succesfully !!")
	          
	         },
	         error: function(){
	             alert('error');
	             }
	     });
	    
}
