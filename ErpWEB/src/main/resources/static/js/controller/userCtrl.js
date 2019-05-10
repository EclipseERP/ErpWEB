app.controller('userCtrl', function($scope,$http,$route,NgTableParams,$timeout,$uibModal,Upload) {
	  $scope.customerListView = true;
	  $scope.ReferralListView = true;
	  $scope.refNames = ["Add New", "Referral A", "Referral B", "Referral C"];
	  $scope.custDta = {};
	  $scope.tires = ["1","2","3","4","5","6","7","8","9","10"];
	  $scope.tirelayers=["1","2","3","4","5"];
	  $scope.posts=[0,1,2,3,4,5,6,7,8];
	  $scope.measures=["Please Select","Quantity(Cups)","Weight(Pounds)"];
	  $scope.projectlistshow = true;

	  
	  $scope.getCurrentUser = function(){
		  $http.get('/userInit/getCurrentUser').success(function(data) {
			  $scope.currentUserId = data.id;
			  $scope.currentUserName = data.userName;
			  $scope.userDetail = data;
			  console.log("user data ..................... ",data);
			  console.log("theme id found  ",data.thid);
			  $scope.themeId = data.thid;
			  $scope.themeDataBythemeId(data.thid);
			  $scope.colorchangeFn();
			  console.log("CurrentUserID",$scope.currentUserId);
			}, function myError(response) {
				alert("Sorry, Some technical error occur");
			});
	 }

	    function JSONToCSVConvertor(JSONData, ReportTitle, ShowLabel,Title) {
		    // If JSONData is not an object then JSON.parse will parse the JSON
			// string in an Object
		    var arrData = typeof JSONData != 'object' ? JSON.parse(JSONData) : JSONData;
		    var CSV = '';    
		    // Set Report title in first row or line
		    CSV += ReportTitle + '\r\n\n';
		    // This condition will generate the Label/Header
		    if (ShowLabel) {
		        var row = "";
		        // This loop will extract the label from 1st index of on array
		        for (var index in arrData[0]) {
		            // Now convert each value to string and comma-seperated
		            row += index + ',';
		        }
		        row = row.slice(0, -1);
		        // append Label row with line break
		        CSV += row + '\r\n';
		    }
		    
		    // 1st loop is to extract each row
		    for (var i = 0; i < arrData.length; i++) {
		        var row = "";
		        // 2nd loop will extract each column and convert it in string
				// comma-separated
		        for (var index in arrData[i]) {
		            row += '"' + arrData[i][index] + '",';
		        }
		        row.slice(0, row.length - 1);
		        // add a line break after each row
		        CSV += row + '\r\n';
		    }
	
		    if (CSV == '') {        
		        alert("Invalid data");
		        return;
		    }   
		    
		    // Generate a file name
		    var fileName = Title+"_";
		    // this will remove the blank-spaces from the title and replace it
			// with an underscore
		    fileName += ReportTitle.replace(/ /g,"_");   
		    // Initialize file format you want csv or xls
		    var uri = 'data:text/csv;charset=utf-8,' + escape(CSV);
		    // Now the little tricky part.
		    // you can use either>> window.open(uri);
		    // but this will not work in some browsers
		    // or you will not get the correct file extension
		    // this trick will generate a temp <a /> tag
		    var link = document.createElement("a");    
		    link.href = uri;
		    // set the visibility hidden so it will not effect on your
			// web-layout
		    link.style = "visibility:hidden";
		    link.download = fileName + ".csv";
		    // this part will append the anchor tag and remove it after
			// automatic click
		    document.body.appendChild(link);
		    link.click();
		    document.body.removeChild(link);
	}
	  
	  $scope.colorchangeFn =  function(){
		  $http.get('/userInit/getCurrentUserTheme').success(function(data) {
			  console.log("userThemeId",data[0]);
			  $scope.themeFetchByUser(data[0]);
			}, function myError(response) {
				alert("Sorry, Some technical error occur");
			});
	  }
	  
	  $scope.themeFetchByUser = function(id){
		  $http.get('/theme_settings/themedata/'+id).success(function(data) 
			{	
			$scope.colorcodes=data[0].colorcodes;
			  $timeout(function()
			  {
			  $("#exampleAccordion").css("background-color",data[0].colorcodes);
			  $("#mainNav").css("background-color",data[0].colorcodes);
			  $(".btn").css("background-color",data[0].colorcodes);
			  $(".bg-color-first").css("background-color",data[0].colorcodes);
			  $(".fr-toolbar.fr-top").css("background-color",data[0].colorcodes);
			  },400);
			
			}, function myError(response) {
				alert("Sorry, Some technical error occur");
			});
	  }
	 
	  
	  $scope.submitVendor = function(ven){
		    alert("aaaaaaaaaaaaaaa");
	    	console.log("Vendor Data...",ven);
	    	$http.post('/vendorctrl/addVendor/'+$scope.currentUserName,ven).success(function(data) {
				/*$scope.backToVenueList();*/
			}, function myError(response) {
				alert("Sorry, Some technical error occur");
			});
	    }
	  
	  //-----------------------Dash board Function-------------------------------------->
	  
	  $scope.dashboardFn = function(){
		  
		  $scope.totalCustCal();
		  $scope.totalOrdersCal();
		  $scope.totalEventsCal();
		  $scope.totalAppointmentsCal();
	  };

//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//#########################################################################  All JS for ERP Software starts from here #################################################################################################	  
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

	  /**
	  *  Author : Pradipto Roy 
	  *  Designation : SR.Java Developer 
	  */
	  
	  
			$scope.itemaddload=function()
			{
				$scope.itemaddshow=true;
				$scope.itemlistshow=false;
			}
			
			
			$scope.itemlistload=function()
			{
				$scope.itemaddshow=false;
				$scope.itemlistshow=true;
				$scope.getRawMaterialsData();
			}
			
			$scope.projectlistload=function()
			{
				$scope.projectaddshow=false;
				$scope.projectlistshow=true;
				$scope.getProjectData();
			}
			
			$scope.projectaddload=function()
			{
				$scope.projectlistshow=false;
				$http.get('/project/getProjectCode/').success(function(data) 
			  			{
					      var code="PR00"+parseInt(data)
					      console.log("projectcode..",code)
		    	    	  $scope.projectcode=code;
						  $scope.projectaddshow=true;
							
						}, function myError(response) {
							alert("Sorry, Some technical error occur");
				
			
				  $timeout(function()
						  {
					
						
						  },200);
		
				});
				
			}
			
			$scope.itemadd=function()
			{
				$scope.itemaddshow=false;
				$scope.itemaddlistshow=true;
				$scope.getItemData();
			}
			
			$scope.vendoraddload=function()
			{
				alert("aaaaaa");
				$scope.vendoraddshow=true;
				$scope.vendorlistshow=false;
			}
			
			
			$scope.vendorlistload=function()
			{
				alert("bbbbbbbb");
				$scope.vendoraddshow=false;
				$scope.vendorlistshow=true;
				$scope.getvendorData();
			}
			
			$scope.vendorDocaddload=function()
			{
				$scope.vendorDocaddshow=true;
				$scope.vendorDoclistshow=false;
			}
			
			
			$scope.vendorDoclistload=function()
			{
				$scope.vendorDocaddshow=false;
				$scope.vendorDoclistshow=true;
			}
			
			
			$scope.showItemForm=function()
			{
				alert()
			}
			

			$scope.vendorAdd=function(ven)
			{
		    	console.log("Vendor Data...",ven);
		    	console.log("Data...",$scope.currentUserName);
		    	$http.post('/vendorctrl/addVendor/'+$scope.currentUserName,ven).success(function(data) {
				}, function myError(response) {
					alert("Sorry, Some technical error occur");
				});
			}

			
		    $scope.calculateTotal=function()
		    {
		     	var total=0;
	        	var subtotal=0;
	        	var qty=$("#qty").val()
	        	var rate=$("#rate").val();
	        	subtotal=parseFloat(rate) * parseFloat(qty)
	        	$("#subtotal").val(subtotal)
	        	var gstamt=parseFloat(subtotal)* $("#gst").val()/100
	        	var fianltotal=subtotal+gstamt;
	        	$("#grandTotal").val(fianltotal)
		    }
			
		    
		    
		    $scope.submitItem=function(raw)
		    {
		    	console.log(raw)
		    	$http.post('/rawMaterials/saveRawMaterial/'+$scope.currentUserName,raw).success(function(data) {
		    		$scope.itemlistload();
		    		}, function myError(response) {
                   alert("Sorry, Some technical error occur");
				});
		    	
		    }
		    
		    
		    $scope.getRawMaterialsData=function()
		    {
		    	       $http.get('/rawMaterials/getRawMaterials/').success(function(data) 
			  			{
		    	    	   console.log(data)
						   $scope.rowMaterialData = new NgTableParams({}, 
						   { 
					       dataset : data
						   });
							
						}, function myError(response) {
							alert("Sorry, Some technical error occur");
						});
		    }
		    
		    
		    $scope.getvendorData=function()
		    {
		    	alert("cccc");
		    	       $http.get('/vendorctrl/getVendorDetails/').success(function(data) 
			  			{
						   $scope.vendorData = new NgTableParams({}, 
						   { 
					       dataset : data
						   });
							
						}, function myError(response) {
							alert("Sorry, Some technical error occur");
						});
		    }


		    $scope.getProjectData=function()
		    {
		    	       $http.get('/project/getProjects/').success(function(data) 
			  			{
			  		       console.log("Data came ",data)
						   $scope.projectListTable = new NgTableParams({}, 
						   { 
					       dataset : data
						   });
							
						}, function myError(response) {
							alert("Sorry, Some technical error occur");
						});
		    }
		    
		    $scope.getItemData=function()
		    {
		    	       $http.get('/itemctrl/getItem/').success(function(data) 
			  			{
			  		       console.log("Data came ",data)
						   $scope.itemData = new NgTableParams({}, 
						   { 
					       dataset : data
						   });
							
						}, function myError(response) {
							alert("Sorry, Some technical error occur");
						});
		    }
		    
		    $scope.projectAdd=function(p)
			{
				alert("aaaaaaaaaaaaaaa");
		    	console.log("Project Data...",p);
		    	console.log("Data...",$scope.currentUserName);
		    	var creationDate=p.creationDate;
		    	console.log(creationDate);
	    		
		    /*	var dateStr= JSON.parse(creationDate);
		    	console.log(dateStr); */
		    	
		    	var date = new Date(creationDate);
	    		
	    		p.creationDate=date; 
	    		console.log(p.creationDate);
		    	
		    	$http.post('/project/saveProject/'+ $scope.currentUserName,p).success(function(data) {
		    		
		    		
		    		alert("saved");
		    		$scope.projectlistload();
				}, function myError(response) {
					alert("Sorry, Some technical error occur");
				});
			}

		    $scope.itemadd=function()
		    {
		    	$http.get('/itemctrl/getItem/').success(function(data) 
			  			{
			  		       console.log("Data came ",data)
						   $scope.addItemData = new NgTableParams({}, 
						   { 
					       dataset : data
						   });
							
						}, function myError(response) {
							alert("Sorry, Some technical error occur");
						});
		    	
		    }
		    
		  
		    $scope.addItemModal=function()
			{
		    	
		        $scope.getRawMaterialsData();
		        
		        $scope.dynamicColumnHeader();
		        
				$scope.itemShow=true;
				      $("#itemModal").modal(
						{
							backdrop: 'static',
						    keyboard: false  
						}		
						);
			}
		    
		    
		    
		    $scope.dynamicColumnHeader=function()
		    {
		    	
        //--------------------------------------Dynamic table column headings add process-------------------------------------
		        
		        var loc = "";
		        
		        var locations = $("[name=locationfield]");
		       
		        for(var h=0;h<locations.length;h++)
		        	{
		     	
		           loc= loc.concat("<th>("+incloc+")"+locations[h].value+"SCH.QTY.</th>");
		           incloc++
		        	}
		        
		        
		        var ei = "";
		        
		        var eiworks=$("[name=eiworksfield]");
		        alert(eiworks.length)
		        
		        for(var i=0;i<eiworks.length;i++)
	        	{
	     	
	            ei= ei.concat("<th>"+eiworks[i].value+"</th>");
	            incei++
	        	}
		        
		    	var itemHeaddynamicdata="<tr>" +
    			"<th>Item Code</th>"+
				"<th>Description</th>"+loc+ei+
				"<th>INS</th>"+
				"<th>Total</th>"+
				"<th>View full details</th>"+
				"<th>Remove</th>"+
    			"</tr>"
		        
		        $("#materialHead").html(itemHeaddynamicdata)
		        
		    	//--------------------------------------Dynamic table column headings add process ends here-------------------------------------
		    	
		    }
		    
		    
		    var icounter=0;
		    $scope.addItemToProjectCart=function(itemdata,indexno)
		    {
		    	
		    	var insSelected = $("#insindex"+indexno).val();
		    	
		    	if(insSelected=="")
		    		{
		    		alert("Please select INS type")
		    		}
		    	if(insSelected!="")
		    		{
		    	      console.log("itemdata found",itemdata.itemCode)
				    	var dynamicdata="<tr id=it"+icounter+" ><td><input type=text class=form-control name=itemcodes value="+itemdata.itemCode+" readonly=readonly /></td>" +
				    			"<td><textarea name=descriptions rows=2 cols=65 class=form-control> </textarea></td>" +
				    			"<td><input type=text class=form-control value="+insSelected+" readonly=readonly/></td>" +
				    			"<td><a  >View full details</a></td>" +
				    			"<td align=right><a ><img src=/assets/img/del.png width=20px height=20px onclick=removeItem('"+icounter+"','"+itemdata.itemCode+"') style='cursor:pointer' /></a></td>" +
				    			"</tr>"
				    	
				    			
				       if(!itemcodearray.includes(itemdata.itemCode))	
				    	   {		
				      $("#rowgen").append(dynamicdata);
				      icounter=icounter+1;
				    	   }
		    	      if(itemcodearray.includes(itemdata.itemCode))	
			    	   {		
			           alert("You already added this Item in project ")
			    	   }
				  	  
				  	  itemcodearray.push(itemdata.itemCode)
				  	  
		    		}

		    }
		    
		    
		    $scope.closeItemCart=function()
			{
				$scope.itemShow=false;
			}
		    
		    

//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//#########################################################################  All JS for ERP Software starts from here #################################################################################################	  
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++		 
});


$.import_js('/js/moduleJs/project_JS_User.js');  
