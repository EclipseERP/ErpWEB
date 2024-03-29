app
		.controller(
				'userCtrl',
				function($scope, $http, $route, NgTableParams, $timeout,
						$uibModal, Upload,$routeParams) {
					
					$scope.customerListView = true;
					$scope.ReferralListView = true;
					$scope.projectCode =  $routeParams.project_code;
					$scope.project_code =  $routeParams.projectCode;
					$scope.locationId =  $routeParams.locationId;
					$scope.projectId =  $routeParams.projectId;
					$scope.turnOver = {};
					$scope.p={};
					$scope.p.transports=[];
					$scope.p.projectStockRecords=[];
					$scope.p.locations=[];
					$scope.p.project_code='';
					$scope.progress=false;
					$scope.turnOver.project={};
					$scope.data={};
					$scope.file={};
					$scope.data.itemType='';
					$scope.transport={};
					$scope.keyword;
					$scope.refNames = [ "Add New", "Referral A", "Referral B",
							"Referral C" ];
					$scope.custDta = {};
					$scope.tires = [ "1", "2", "3", "4", "5", "6", "7", "8",
							"9", "10" ];
					$scope.tirelayers = [ "1", "2", "3", "4", "5" ];
					$scope.posts = [ 0, 1, 2, 3, 4, 5, 6, 7, 8 ];
					$scope.measures = [ "Please Select", "Quantity(Cups)",
							"Weight(Pounds)" ];
					$scope.projectlistshow = true;

					$scope.getCurrentUser = function() {
						$http.get('/userInit/getCurrentUser').success(
								function(data) {
									$scope.currentUserId = data.id;
									$scope.currentUserName = data.userName;
									$scope.userDetail = data;
									console.log(
											"user data ..................... ",
											data);
									console.log("theme id found  ", data.thid);
									$scope.themeId = data.thid;
									$scope.themeDataBythemeId(data.thid);
									$scope.colorchangeFn();
									console.log("CurrentUserID",
											$scope.currentUserId);
								}, function myError(response) {
									alert("Sorry, Some technical error occur");
								});
					}
					$scope.search=function(){
						if(angular.element('#search').val()==''){
							keyword="none";
						}else{
							keyword=angular.element('#search').val();
				
						}
						
						if(angular.element('#itemType').val()=='3'){
							var regex = new RegExp('\([0-9]+)');
							if(regex.test(keyword)){
								alert("number");
								
										$http.get('/project/'+keyword+'/'+angular.element('#itemType').val()).success(function(data) {
											console.log("Data came ", data)
											$scope.projectListTable = new NgTableParams(
													{}, {
														dataset : data
													});
									
										},
										function myError(response) {
											alert("Sorry, Some technical error occur");
										});

								
						}else{
							alert("Enter a valid search item");
							
						}
						}else{
							var regex1 = new RegExp('\([a-zA-z]+)');
							if(angular.element('#itemType').val()=='2'){
							if(regex1.test(keyword)){
								alert("string");
								
								$http.get('/project/'+keyword+'/'+angular.element('#itemType').val()).success(function(data) {
									console.log("Data came ", data)
									$scope.projectListTable = new NgTableParams(
											{}, {
												dataset : data
											});
							
								},
								function myError(response) {
									alert("Sorry, Some technical error occur");
								});

							}else{
								alert("Enter a valid search item");
							}
							}else{
								if(angular.element('#itemType').val()=='1'){
									
								alert("sdsd");
								$http.get('/project/'+keyword+'/'+angular.element('#itemType').val()).success(function(data) {
									console.log("Data came ", data)
									$scope.projectListTable = new NgTableParams(
											{}, {
												dataset : data
											});
							
								},
								function myError(response) {
									alert("Sorry, Some technical error occur");
								});

							}else{
								console.log(angular.element('#itemType').val());
								if(angular.element('#itemType').val() == ''){
									
									var itemType='0';
									$http.get('/project/'+keyword+'/'+itemType).success(function(data) {
										console.log("Data came ", data)
										$scope.projectListTable = new NgTableParams(
												{}, {
													dataset : data
												});
								
									});
								
							}
							}
						}


					}
					}
					$scope.getLastId = function(){
						$http.get('/transport/getLastId').success(function(data){
							$scope.transport.transportCode='TR00'+data;
							angular.element('#transportCode').val($scope.transport.transportCode);
						},
						function myError(response) {
							alert("Sorry, Some technical error occur");
						});
					}
					$scope.addTransport = function(){
						$http.post('/transport/saveTransport',$scope.transport).success(function(data){
							alert("Data Saved Successfully");
						},
						function myError(response) {
							alert("Sorry, Some technical error occur");
						});
					}
					$scope.checkValid= function(){
						alert("in--");
						if($scope.transport.form.transportNo.$error.required ||$scope.transport.form.transportName.$error.required ||$scope.transport.form.capacity.$error.required){
							alert("Please enter the required feilds");
						}
					}
					function JSONToCSVConvertor(JSONData, ReportTitle,
							ShowLabel, Title) {
						// If JSONData is not an object then JSON.parse will
						// parse the JSON
						// string in an Object
						var arrData = typeof JSONData != 'object' ? JSON
								.parse(JSONData) : JSONData;
						var CSV = '';
						// Set Report title in first row or line
						CSV += ReportTitle + '\r\n\n';
						// This condition will generate the Label/Header
						if (ShowLabel) {
							var row = "";
							// This loop will extract the label from 1st index
							// of on array
							for ( var index in arrData[0]) {
								// Now convert each value to string and
								// comma-seperated
								row += index + ',';
							}
							row = row.slice(0, -1);
							// append Label row with line break
							CSV += row + '\r\n';
						}

						// 1st loop is to extract each row
						for (var i = 0; i < arrData.length; i++) {
							var row = "";
							// 2nd loop will extract each column and convert it
							// in string
							// comma-separated
							for ( var index in arrData[i]) {
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
						var fileName = Title + "_";
						// this will remove the blank-spaces from the title and
						// replace it
						// with an underscore
						fileName += ReportTitle.replace(/ /g, "_");
						// Initialize file format you want csv or xls
						var uri = 'data:text/csv;charset=utf-8,' + escape(CSV);
						// Now the little tricky part.
						// you can use either>> window.open(uri);
						// but this will not work in some browsers
						// or you will not get the correct file extension
						// this trick will generate a temp <a /> tag
						var link = document.createElement("a");
						link.href = uri;
						// set the visibility hidden so it will not effect on
						// your
						// web-layout
						link.style = "visibility:hidden";
						link.download = fileName + ".csv";
						// this part will append the anchor tag and remove it
						// after
						// automatic click
						document.body.appendChild(link);
						link.click();
						document.body.removeChild(link);
					}

					$scope.colorchangeFn = function() {
						$http.get('/userInit/getCurrentUserTheme').success(
								function(data) {
									console.log("userThemeId", data[0]);
									$scope.themeFetchByUser(data[0]);
								}, function myError(response) {
									alert("Sorry, Some technical error occur");
								});
					}
					$scope.saveDocument = function(){
						var formData =  new FormData();
						console.log($scope.file.document);
						formData.append("document",$scope.file.document);
						formData.append("documentName",$scope.file.documentName);
						$http.post("/project/documents",formData,{
							transformRequest: angular.identity,
		                    headers : {
		                        'Content-Type' : undefined
		                    }}).success(function(data){
							alert("file uploaded successfully");
						},
						
						function myError(response) {
							alert("Sorry, Some technical error occur");
						});
					}

					$scope.themeFetchByUser = function(id) {
						$http.get('/theme_settings/themedata/' + id).success(
								function(data) {
									$scope.colorcodes = data[0].colorcodes;
									$timeout(function() {
										$("#exampleAccordion").css(
												"background-color",
												data[0].colorcodes);
										$("#mainNav").css("background-color",
												data[0].colorcodes);
										$(".btn").css("background-color",
												data[0].colorcodes);
										$(".bg-color-first").css(
												"background-color",
												data[0].colorcodes);
										$(".fr-toolbar.fr-top").css(
												"background-color",
												data[0].colorcodes);
									}, 400);

								}, function myError(response) {
									alert("Sorry, Some technical error occur");
								});
					}

					$scope.submitVendor = function(ven) {

						console.log("Vendor Data...", ven);
						$http.post(
								'/vendorctrl/addVendor/'
										+ $scope.currentUserName, ven).success(
								function(data) {
									/* $scope.backToVenueList(); */
								}, function myError(response) {
									alert("Sorry, Some technical error occur");
								});
					}

					// -----------------------Dash board
					// Function-------------------------------------->

					$scope.dashboardFn = function() {

						$scope.totalCustCal();
						$scope.totalOrdersCal();
						$scope.totalEventsCal();
						$scope.totalAppointmentsCal();
					};

					// +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
					// #########################################################################
					// All JS for ERP Software starts from here
					// #################################################################################################
					// +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

					/**
					 * Author : Pradipto Roy Designation : SR.Java Developer
					 */

					$scope.itemaddload = function() {
						$scope.itemaddshow = true;
						$scope.itemlistshow = false;

						$http.get('/rawMaterials/getItemCode/').success(
								function(data) {
									var code = "ITEM0" + parseInt(data)
									console.log("itemcode..", code)
									$scope.itemcode = code;
									$scope.itemlistshow = false;

								}, function myError(response) {
									alert("Sorry, Some technical error occur");

									$timeout(function() {

									}, 200);

								});
					}

					$scope.itemlistload = function() {
						$scope.itemaddshow = false;
						$scope.itemlistshow = true;
						$scope.getRawMaterialsData();
					}

					$scope.projectlistload = function() {

						$scope.getProjectData();
						$scope.projectaddshow = false;
						$scope.projectlistshow = true;
					   	$scope.showSupplyDetailslistByItemcode=false;
						$scope.showProjectDetailslistByLoaNO = false;
						$scope.pi=false;
						
						
						/*
						$timeout(function() {
							$route.reload();
						}, 200);
                       */
					}

					
					
					
					
					
					
					
					
					
					
					
					    $scope.accountsLoad = function() {

						$scope.getProjectData();
						$scope.projectaddshow = false;
						$scope.turnoverListShow = true;
					   	$scope.showSupplyDetailslistByItemcode=false;
						$scope.showProjectDetailslistByLoaNO = false;
						$scope.pi=false;
						
					}
					
					
					    
					    
					    
					    $scope.getAccountsData = function() {
						$http.get('/accounts/getProjectDetailsForTurnoverPageGroupByProjectCode/').success(function(data) {console.log("Data came ", data)
							$scope.projectListTable = new NgTableParams({}, {
							dataset : data
							});
                        },
						  function myError(response) {
						  alert("Sorry, Some technical error occur");
						  });
						}
					    
					    
					    
					    $scope.genCode=function(num){
					    	if(num.toString().length==1){
								return "PR00"+num;
								
							}
							if(num.toString().length==2){
								return "PR0"+num;
							}
							if(num.toString().length==3||num.toString().length>3){
								return "PR"+num;
							}
					    }
					
					$scope.projectaddload = function() {
						loc = "";
						ei = "";
						//$scope.projectlistshow = false;
						//$scope.projectaddFirstPartView = true;
						$scope.projectaddSecondPartView = false;
						
						$http.get('/project/getProjectCode/').success(
								function(data) {
									var code = $scope.genCode(data);
									//var code = "PR00" + parseInt(data);
									
									$scope.p.project_code=code;
									console.log($scope.p.project_code);
								//console.log("projectcode..", code)
									
									
									//$scope.projectaddshow = true;

								}, function myError(response) {
									alert("Sorry, Some technical error occur");

									$timeout(function() {

									}, 200);

								});

					}

					$scope.itemadd = function() {
						$scope.itemaddshow = false;
						$scope.itemaddlistshow = true;
						$scope.getItemData();
					}

					$scope.vendoraddload = function() {
						$scope.vendoraddshow = true;
						$scope.vendorlistshow = false;
						$http.get('/vendorctrl/getVendorCode/').success(function(data) {
									var code = "VEN0" + parseInt(data)
									console.log("Vendor Code..", code)
									$scope.vendorCode = code;
									$scope.turnoverListShow = false;

							}, function myError(response) {
							   alert("Sorry, Some technical error occur");
                               $timeout(function() {
                              }, 200);
                          });
                      }

					$scope.vendorlistload = function() {
						$scope.vendoraddshow = false;
						$scope.vendorlistshow = true;
						$scope.getvendorData();
					}

					$scope.vendorDocaddload = function() {
						$scope.vendorDocaddshow = true;
						$scope.vendorDoclistshow = false;
					}

					$scope.vendorDoclistload = function() {
						$scope.vendorDocaddshow = false;
						$scope.vendorDoclistshow = true;
						$scope.getvendorDocData();
					}

					$scope.showItemForm = function() {
					}

					$scope.vendorAdd = function(ven) {
						console.log("Vendor Data...", ven);
						console.log("Data...", $scope.currentUserName);
						var v=$("#vCode").val();
						console.log("vdata",v);
						$scope.ven.vendorCode=v;
						$http.post('/vendorctrl/addVendor/'+ $scope.currentUserName, ven).success(function(data) {
								}, function myError(response) {
									alert("Sorry, Some technical error occur");
								});
					}

					
					
					
					$scope.submitVendorDocForm = function(ven) {
						console.log("Vendor Data...", ven);
						console.log("Data...", $scope.currentUserName);
						$http.post('/vendorDocCtrl/addVendorDoc/'+ $scope.currentUserName, ven).success(
								function(data) {
								}, function myError(response) {
									alert("Sorry, Some technical error occur");
								});
					}
					
					$scope.calulatecgst = function(){
						var amount =    angular.element('#amountExcgst').val();
				 		var cGstAmount=(6/100)*amount ;
				 		if(Number.isNaN(cGstAmount)){
				 			GstAmount=0;
				 		}
				 		var roundedValue=Math.round(cGstAmount);
				 		
				 		angular.element('#cgst').val(roundedValue);
				 		angular.element('#sgst').val(roundedValue);
				 		$scope.turnOver.cgst=roundedValue;
				 		$scope.turnOver.sgst=roundedValue;
					}	
					$scope.calBillsPayable	 = function(){
				          
		                var retDeducted =    angular.element('#RetDeducted').val();
		                var retReleased =    angular.element('#retentionReleased').val();
						var amount =    angular.element('#amountIncludinggst').val();
						var deductions = retDeducted - retReleased;
				 		var billsPayable =  amount - deductions;
				 		
				 		if(Number.isNaN(billsPayable)){
				 			billsPayable=0;
				 		}
				 		
				 		angular.element('#billsPayable').val(billsPayable);
				 		$scope.turnOver.billsPayable=billsPayable;
					}	
					
					$scope.calulateAmountWithgst = function(){
					         
			                var gst =    angular.element('#gst').val();
							var amount =    angular.element('#amountExcgst').val();
					 		var GstAmount=((gst/100)+1)*amount ;
					 		if(Number.isNaN(GstAmount)){
					 			GstAmount=0;
					 		}
					 		var gstIncAmount = Math.round(GstAmount);
					 		
					 		angular.element('#amountIncludinggst').val(gstIncAmount);
					 		$scope.turnOver.grossAmountIncludingGst=gstIncAmount;
					 		$scope.calBillsPayable();
					 		$scope.calulatecgst();
					}
					
					
				
					
					$scope.calculateTotal = function() {
						var total = 0;
						var subtotal = 0;
						var qty = $("#qty").val()
						var rate = $("#rate").val();
						subtotal = parseFloat(rate) * parseFloat(qty)
						$("#subtotal").val(subtotal)
						var gstamt = parseFloat(subtotal) * $("#gst").val()
								/ 100
						var fianltotal = subtotal + gstamt;
						$("#grandTotal").val(fianltotal)
					}

					$scope.submitItem = function(raw) {
						
					var itemcode = $("#af3").val();
						
						console.log(raw)
						$http.post(
								'/rawMaterials/saveRawMaterial/'
										+ $scope.currentUserName+"?itemcode="+itemcode, raw).success(
								function(data) {
									$scope.itemlistload();
								}, function myError(response) {
									alert("Sorry, Some technical error occur");
								});
					}

					$scope.getRawMaterialsData = function() {
						$http.get('/rawMaterials/getRawMaterials/').success(function(data) {
									console.log(data)
									$scope.rowMaterialData = new NgTableParams({}, 
											{
												dataset : data
											});

								}, function myError(response) {
									alert("Sorry, Some technical error occur");
								});
					}

					    $scope.getvendorData = function() {
						$http.get('/vendorctrl/getVendorDetails/').success(function(data) {
									console.log("Supply data",data)
									$scope.vendorDatas=data;
									$scope.vendorData = new NgTableParams({}, {
								    dataset : data
									});

								}, function myError(response) {
									alert("Sorry, Some technical error occur");
								});
					}
					
					
					
					$scope.getvendorDocData = function() {
						$http.get('/vendorDocCtrl/getVendorDocDetails/').success(function(data) {
						$scope.vendorDocData = new NgTableParams({}, {
						dataset : data
						});
                        }, function myError(response) {
						   alert("Sorry, Some technical error occur");
						});
					}
					$scope.getPaymentsData = function(id) {
						if(id!=null){
							
							$http.get('/accounts/payments/'+parseInt(id)).success(function(data) {
								console.log("Data came ", data)
								$scope.projectListTable = new NgTableParams(
										{}, {
											dataset : data
										});

							},
							function myError(response) {
								alert("Sorry, Some technical error occur");
							});
						}else{
							$http.get('/accounts/payments').success(function(data) {
								console.log("Data came ", data)
								$scope.projectListTable = new NgTableParams(
										{}, {
											dataset : data
										});

							},
							function myError(response) {
								alert("Sorry, Some technical error occur");
							});

						}
					}
					$scope.getDeletePaymentsData = function(id) {
							
							$http.get('/accounts/payments/delete/'+parseInt(id)).success(function(data) {
								console.log("Data came ", data)
								$scope.projectListTable = new NgTableParams(
										{}, {
											dataset : data
										});

							},
							function myError(response) {
								alert("Sorry, Some technical error occur");
							});
					}		

					$scope.getProjectData = function() {
						$http.get('/project/getProjects').success(function(data) {
											console.log("Data came ", data)
											$scope.projectListTable = new NgTableParams(
													{}, {
														dataset : data
													});

										},
										function myError(response) {
											alert("Sorry, Some technical error occur");
										});
					}
					$scope.getProjectDataByPCode = function(projectCode){
						$http.get('/project/getProjectDetailsbyProjectCode?projectcode='+projectCode).success(function(data){
							$scope.turnOver.project = data[0];
							angular.element('projectCode').val($scope.turnOver.project.project_code);
							console.log(data[0]);
						}, function myError(response) {
							alert("Sorry, Some technical error occur");
						});
					}

					$scope.getItemData = function() {
						$http.get('/itemctrl/getItem/').success(function(data) {
							console.log("Data came ", data)
							$scope.itemData = new NgTableParams({}, {
								dataset : data
							});

						}, function myError(response) {
							alert("Sorry, Some technical error occur");
						});
					}

					$scope.projectAdd = function(p) {

						console.log("Project Data...", p);
						console.log("Data...", $scope.currentUserName);
						var creationDate = p.creationDate;
						console.log(creationDate);

						/*
						 * var dateStr= JSON.parse(creationDate);
						 * console.log(dateStr);
						 */

						var date = new Date(creationDate);

						p.creationDate = date;
						console.log(p.creationDate);

						$http.post(
								'/project/saveProject/'
										+ $scope.currentUserName, p).success(
								function(data) {

									alert("saved");
									$scope.projectlistload();
								}, function myError(response) {
									alert("Sorry, Some technical error occur");
								});
					}

					$scope.itemadd = function() {
						$http.get('/itemctrl/getItem/').success(function(data) {
							console.log("Data came ", data)
							$scope.addItemData = new NgTableParams({}, {
								dataset : data
							});

						}, function myError(response) {
							alert("Sorry, Some technical error occur");
						});

					}
					$scope.validatePaymentForm = function(){
						if($scope.turnOver.billPassedDate==null || $scope.turnOver.paymentRecievedDate==null || $scope.turnOver.gst==null || $scope.turnOver.grossAmountExcludinggst==null || $scope.turnOver.checkRecievedAmount==null ){
							alert("Please enter bill Passed date or Payment recieved date or check recieved amount or amount excluding gst");
							return false;
						}
						
						return true;
						
					}
					$scope.validateNumber=function(event){
					var text = 	String.fromCharCode(event.keyCode);
					
						if((event.keyCode>=65 && event.keyCode<=90) || (event.keyCode>=97&& event.keyCode<=122)){
							alert("Please entera number");
						}
						
					}
					$scope.addTurnover = function(){
						if($scope.validatePaymentForm()){
							$http.post("/accounts/saveturnover",$scope.turnOver).success(function(data){
								alert("Data Saved Successfully!");
							}, function myError(response) {
					    		
					    		$("#processing").fadeOut(2000);
					    		alert("Sorry, Some technical error occur");
					    	});
						}else{
							alert("Please enter the required fields");
						}
						
						
						
					}

					
					    $scope.projectWiseload = function() {
						   $scope.projectlistshow = false;
						   $scope.turnovewrlistshow = true;
					    }

					
/*$scope.accountslistload = function() {
						
						$route.reload();
						
						$scope.turnoveraddshow = false;
						$scope.turnoverlistshow = true;
						
						
						$timeout(function() {
						$scope.getProjectData();
						}, 200);
						
						
						
					}*/
					
					
					
					
					// *************************************************************************************************************************************************
					// *******************************************************************
					// Item add method to project
					// **************************************************
					// *************************************************************************************************************************************************
					$scope.addItemModal = function() {

						$scope.getRawMaterialsData();

						var locations = $("[name=locationfield]");
						var flagloc = 0

						for (var h = 0; h < locations.length; h++) {

							if (locations[h].value == "") {
								alert("One of your loaction field is blank !!")
								flagloc = 0;
								break;
							}
							if (locations[h].value != "") {
								flagloc = 1;
							}

						}

						var eiworksfileds = $("[name=eiworksfield]");
						var flagloc2 = 0

						var eiworkslength = eiworksfileds.length;
						for (var n = 0; n < parseInt(eiworkslength); n++) {

							if (eiworksfileds[n].value == "") {
								alert("Please enter eiworks name !!")
								flagloc2 = 0;
								break;
							}
							if (eiworksfileds[n].value != "") {
								flagloc2 = 1
							}

						}

						if (flagloc > 0 && flagloc2 > 0) {

							// --------------------------------------Dynamic
							// table column headings add
							// process-------------------------------------
							var ei = "";
							var loc = "";
							var locations = $("[name=locationfield]");
							var inb = 1
							for (var h = 0; h < locations.length; h++) {

								loc = loc.concat("<th>(" + inb + ") <br/>"
										+ locations[h].value
										+ " <br/> SCH.QTY.</th>");

								inb++
							}

							var eiworks = $("[name=eiworksfield]");

							for (var i = 0; i < eiworks.length; i++) {

								ei = ei.concat("<th>" + eiworks[i].value
										+ "</th>");
								incei++
							}

							// --------------------------------------Dynamic
							// table column headings add process ends
							// here-------------------------------------

							var itemHeaddynamicdata = "<tr>"
									+ "<th>Item Code</th>"
									+ "<th>Item Name</th>"
									+ "<th>Description</th><th>Unit</th>" + loc
									+ ei + "<th>Total</th>" + "<th>INS</th>"
									+ "<th>Remove</th>" + "</tr>"
							var locations=loc+ei;
							$("#materialHead").html(itemHeaddynamicdata)
							//$("#loc").next().html(locations).next().html("<td>Total</td>");
							$scope.itemShow = true;

							$("#itemModal").modal({
								backdrop : 'static',
								keyboard : false
							});
						}
					}
					$scope.addTransportModal = function() {

													$scope.transportShow = true;

							$("#projectModal").modal({
								backdrop : 'static',
								keyboard : false
							});
						}
					

					// ************************************************************
					// Item add to project method ends here
					// *********************************************************
					// ***********************************************************************************************************************************************************

					var icounter = 0;
					var data = [];
					$scope.addTransportToProjectCart = function(transportData,indexno){
						alert("transport added");
						
						
							data.push(transportData);
							$scope.p.transports=data;
							console.log($scope.p.transports);
							$scope.transportMenuTable = new NgTableParams({}, { dataset: data });
							
																$scope.transportShow=true;
//							if (!itemcodearray.includes(itemdata.itemCode)) {
//								$("#rowgen").append(dynamicdata);
//								icounter = icounter + 1;
//							}
//							if (itemcodearray.includes(itemdata.itemCode)) {
//								alert("You already added this Item in project ")
//							}
							$scope.transportShow=true;
							//itemcodearray.push(itemdata.itemCode)

						}

					var itemData=[];
					$scope.addItemToProjectCart = function(itemdata, indexno) {
						
						
						console.log("Item data...",itemdata)
						
						var insSelected = $("#insindex" + indexno).val();
						itemdata.ins=insSelected;
						
						itemData.push(itemdata);
						$scope.p.projectStockRecords=itemData;
						//$scope.p.projectStockRecords[indexno].billquantity=
						console.log($scope.p.projectStockRecords);
//						$scope.itemMenuTable = new NgTableParams({}, { dataset: itemData });
						if (insSelected == "") {
							alert("Please select INS type")
						}
						if (insSelected != "") {
							console.log("itemdata found", itemdata.itemCode)
							
							// --------------------------------------Dynamic
							// table column headings add
							// process-------------------------------------
							var ei = "";
							var loc = "";
							var location = "";
							var locations = $("[name=locationfield]");
							var inb = 1
							for (var h = 0; h < locations.length; h++) {

								loc = loc.concat("<td><input type=text name=locationvalue"
												+ " size=4 value=0 onkeyup=calculationItemtotal('"+ icounter + h + "','"+ icounter+ "',"+indexno+")" +
												" id=locationvalueid"
												+ icounter
												+ h
												+ " /><input type=hidden name=locflag value='"
												+ locations[h].value
												+ "' ></td>");
								

								inb++
							}

							var eiworks = $("[name=eiworksfield]");
							for (var i = 0; i < eiworks.length; i++) {

								ei = ei
										.concat("<td><input type=text name=eiworksvalue size=4 value=0 onkeyup=calculationItemtotal('" + icounter + i + "','"+ icounter+ "',"+indexno+") id=eiworksvalueid"
												+ icounter
												+ i
												+ " /><input type=hidden name=eiflag value='"
												+ eiworks[i].value + "'/><input type=hidden name=itemcodeflag value='"+itemdata.itemCode+"' /></td>");
								//$("#locations").next().next().html(ei);
								incei++
							}
							
							// --------------------------------------Dynamic
							// table column headings add process ends
							// here-------------------------------------

							var dynamicdata = "<tr id=it"
									+ icounter
									+ " ><td><input type=text class=form-control ng-model=p.projectStockRecords["+icounter+"].itemCode value="+itemdata.itemCode+" name=itemcodes readonly=readonly />" +
											"<input type=hidden name=totalval ng-model=p.projectStockRecords["+icounter+"].billQuantity id=billQuantity"+indexno+" size=4 value=0 />" +
													"<input type=hidden name=totalval ng-model=p.projectStockRecords["+icounter+"].balanceQuantity id=balanceQuantity"+indexno+" size=4 value=0 /></td>"
									+"<td>"+itemdata.name+"</td>"
									+ "<td><textarea name=descriptions rows=2 cols=65 ng-model=p.projectStockRecords["+icounter+"].description class=form-control>"+itemdata.description+" </textarea></td>"
									+ "<td><input type=text name=unit ng-model=p.projectStockRecords["+icounter+"].unit size=4 value="+itemdata.unit+"  /></td>"
									+ loc
									+ ei
									+ "<td><input type=text name=totalval ng-model=p.projectStockRecords["+icounter+"].total size=4 value=0 id=totalvalid"
									+ icounter
									+ " /></td>"
									+ "<td><input type=text class=form-control ng-model=p.projectStockRecords["+icounter+"].ins name=ins value="
									+ insSelected
									+ " readonly=readonly/></td>"
									+ "<td align=right><a ><img src=/assets/img/del.png width=20px height=20px onclick=removeItem('"
									+ icounter + "','" + itemdata.itemCode
									+ "') style='cursor:pointer'/></a></td>"
									+ "</tr>";
								 //locations=loc+ei;
								 //$("#locations").rows[4];
								 
								 //angular.element("#first").append(""+itemdata.name);
							if (!itemcodearray.includes(itemdata.itemCode)) {
								$("#rowgen").append(dynamicdata);
								
								
								icounter = icounter + 1;
							}
							if (itemcodearray.includes(itemdata.itemCode)) {
								alert("You already added this Item in project ")
							}

							itemcodearray.push(itemdata.itemCode)

						}
					}

					$scope.closeItemCart = function() {
						$scope.itemShow = false;
					}
					$scope.uploadFile = function(event){
						console.log(event.target.files[0]);
						//angular.element("#fileName").val(fileName);
						
					}
					$scope.addTransport = function (){
						$http.post('/transport/saveTransport',$scope.transport).success(function(data){
							alert("Data Saved Successfully!");
						},
						function myerror(){
							alert("Sorry Some technichal error has occured");
						});
					}
					$scope.getAllTransport = function(){
						$http.get('/transport/all').success(function(data){
							$scope.transportData = new NgTableParams({}, 
									{
										
										dataset : data
									});
						},
						function myerror(){
							alert("some technical error ocurred!")
						});
						console.log(data);
						
					}

					$scope.projectSecondPartshow = function() {

			
						var locations = $("[name=locationfield]");
						var flagloc = 0
						var projectDetails = "";
						var inb = 1

						for (var h = 0; h < locations.length; h++) {

							if (locations[h].value == "") {
								alert("One of your loaction field is blank !!")
								flagloc = 0;
								break;
							}
							

							if (locations[h].value != "") {

								projectDetails = projectDetails.concat(inb
										+ " : " + locations[h].value + "  ,  "
										+ "   ");
								inb++;
								flagloc = 1;
							}

						}

						var eiworksfileds = $("[name=eiworksfield]");
						var flagloc2 = 0

						var eiworkslength = eiworksfileds.length;
						for (var n = 0; n < parseInt(eiworkslength); n++) {

							if (eiworksfileds[n].value == "") {
								alert("Please enter eiworks name !!")
								flagloc2 = 0;
								break;
							}
							if (eiworksfileds[n].value != "") {
								flagloc2 = 1
							}

						}

						if (flagloc > 0 && flagloc2 > 0
								&& $("#af3").val() != ""
								&& $("#af4").val() != ""
								&& $("#tendardate").val() != "") {

							if (confirm('Before continue please check once. The data save at this process cannot be revert. !!')) {

								$scope.projectcode = $("#af1").val();
								$scope.projectname = projectDetails;
								$scope.details = $("#af4").val();
								$scope.projectdate = $("#tendardate").val();
								angular.element("#projectAdd").hide();	
								//$scope.projectaddFirstPartView = false;
								$scope.projectaddSecondPartView = true;
							} else {
								// Do nothing!
							}

						}
						if ($("#af3").val() == "") {
							alert("LOA details found blank !!")
						}
						if ($("#af4").val() == "") {
							alert("Details found blank !!")
						}

						if ($("#tendardate").val() == "") {
							alert("Project Date Required !!")
						}

					}

					// ********************************************* Project
					// Save method starts here
					// ****************************************************

					$scope.saveProject = function(data) {
						console.log("any...", $scope.p)
						
						// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

						var projectLocationlist = new Array(); // Project
						var projectLocationlistSCHQTY = new Array();// Project
						// quantity
						var addEiworklist = new Array();
						var addEiworklistQTY = new Array();
						var itemcodeslist = new Array();
						var unitlist = new Array();
						var locationvaluelist = new Array();
						var eiworksvaluelist = new Array();
						var descriptionlist = new Array();
						var totallist = new Array();
						var inslist = new Array();
						var locflaglist = new Array();
						var eiflaglist = new Array();
						var itemcodeflagslist = new Array();
						// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

						var projectcode = $("#af1").val();
						var tendername = $("#af3").val();
						var projectdetails = $("#af4").val();
						var tendardate=$("#tendardate").val();

						var locations = $("[name=locationfield]");
						var eiworksfileds = $("[name=eiworksfield]");
						var eiqtyval = $("[name=eiworksvalue]");

						var locval = $("[name=locationvalue]");
						var locflag = $("[name=locflag]");
						var eiflag = $("[name=eiflag]");

						var itemcodes = $("[name=itemcodes]");
						var descriptions = $("[name=descriptions]");
						var totals = $("[name=totalval]");
						var ins = $("[name=ins]");
						var units = $("[name=unit")
						var itemcodeflags = $("[name=itemcodeflag")
						

						// alert("length of local val " + locval.length)

						// ---------------------------------------------------------------------------
						for (var h = 0; h < locations.length; h++) {

							projectLocationlist.push(locations[h].value)

						}
						// -----------------------------------------------------------------------------

						// ---------------------------------------------------------------------------
						for (var p = 0; p < locval.length; p++) {
							projectLocationlistSCHQTY.push(locval[p].value)
						}
						// ---------------------------------------------------------------------------

						// ---------------------------------------------------------------------------
						var eiworkslength = eiworksfileds.length;
						for (var n = 0; n < parseInt(eiworkslength); n++) {
							addEiworklist.push(eiworksfileds[n].value)
						}
						// ---------------------------------------------------------------------------

						// ---------------------------------------------------------------------------
						for (var q = 0; q < eiqtyval.length; q++) {

							addEiworklistQTY.push(eiqtyval[q].value);

						}
						// ---------------------------------------------------------------------------

						// ---------------------------------------------------------------------------
						for (var l = 0; l < locflag.length; l++) {
							locflaglist.push(locflag[l].value);

						}
						// ---------------------------------------------------------------------------

						// ---------------------------------------------------------------------------
						for (var m = 0; m < eiflag.length; m++) {

							eiflaglist.push(eiflag[m].value);

						}
						// ---------------------------------------------------------------------------

						// ---------------------------------------------------------------------------
						for (var r = 0; r < itemcodes.length; r++) {

							itemcodeslist.push(itemcodes[r].value);

						}
						// ---------------------------------------------------------------------------

						// ---------------------------------------------------------------------------
						for (var a = 0; a < descriptions.length; a++) {

							descriptionlist.push(descriptions[a].value);

						}
						// ---------------------------------------------------------------------------

						// ---------------------------------------------------------------------------
						for (var a = 0; a < ins.length; a++) {

							inslist.push(ins[a].value);

						}
						// ---------------------------------------------------------------------------

						// ---------------------------------------------------------------------------
						for (var b = 0; b < units.length; b++) {

							unitlist.push(units[b].value);

						}
						// ---------------------------------------------------------------------------

						// ---------------------------------------------------------------------------
						for (var c = 0; c < totals.length; c++) {

							totallist.push(totals[c].value);

						}
						// ---------------------------------------------------------------------------
						
						
						// ---------------------------------------------------------------------------
						for (var d = 0; d < itemcodeflags.length; d++) {

							itemcodeflagslist.push(itemcodeflags[d].value);

						}
						// ---------------------------------------------------------------------------
						
						$("#btprsave").attr('value', 'Please wait !!');
						$('#btprsave').prop('disabled', true);

						
						var state=$("#statewise").val();
						
						alert(state)
						
						var url = "/project/saveProject/"
								+ $scope.currentUserName;

						var params = "?projectLocationlist="
								+ projectLocationlist
								+ "&projectLocationlistSCHQTY="
								+ projectLocationlistSCHQTY + "&addEiworklist="
								+ addEiworklist + "&addEiworklistQTY="
								+ addEiworklistQTY + "&itemcodeslist="
								+ itemcodeslist + "&unitlist=" + unitlist
								+ "&locationvaluelist=" + locationvaluelist
								+ "&descriptionlist=" + descriptionlist
								+ "&totallist=" + totallist + "&inslist="
								+ inslist + "&locflaglist=" + locflaglist
								+ "&eiflaglist=" + eiflaglist + "&projectcode="
								+ projectcode + "&loa_details=" + tendername
								+ "&projectdetails=" + projectdetails
								+ "&eiworksvaluelist=" + eiworksvaluelist+"&tendardate="+tendardate+"&itemcodeflagslist="+itemcodeflagslist+"&state="+state;
							console.log($scope.p);
							//$scope.p.transports.project=$scope.p;
						$http.post(url + params,
									$scope.p).success(function(data) {
							$('#btprsave').prop('disabled', false);
							$("#btprsave").attr('value', 'Save project');

							$scope.projectlistload();

						}, function myError(response) {
							alert("Sorry, Some technical error occur");
						});

					}
					
					$scope.save = function(){
						$http.post('project/document',$scope.file).success(function(data){
							alert("data saved successfully");
						});
					}
					
					$scope.exportProjectList = function() {
					  $http.get('/project/getProjectCode/').success(function(data) {
					  JSONToCSVConvertor(data, "Details", true,"Project");
                        }, function myError(response) {
						  alert("Sorry, Some technical error occur");
                        });
                        }
					
					$scope.fileUpload=function(element){
						var file = element.files[0];
						var reader= new FileReader();
						
						reader.onloadend  = function(e){
							angular.element('#progress').html();
							
					//	var data=	e.target.result();
							angular.element('#fileContent').val(reader.result);
							
							
						}
						reader.onloadstart = function(e){
							//angular.element('#progress').html("Uploading----");
							
						}
						reader.onprogress  = function(e){
							
						
									
								}
						
						reader.onerror = error => console.log(error)
					reader.readAsBinaryString(file);
						
					}
					$scope.viewItemDetailsProject=function(projectcode,projectlocation)
					{
					
	                    $scope.projectlocation=projectlocation;
	                   // $scope.loano=loa;
//	                	$scope.showProjectDetailslistByLoaNO=false;	
//	                	$scope.showSupplyDetailslistByItemcode=false;
//						$scope.pi=true;
						$scope.projectcode=projectcode;
					
						$http.post('/project/getProjectItemDetailsByProjectcode?projectcode='+projectcode+"&projectlocation="+projectlocation).success(function(data) 
						{
						console.log("Data came ", data)
						$scope.itemData = new NgTableParams({}, 
						{
							dataset : data
						});
							
						}, function myError(response) {
							alert("Sorry, Some technical error occur");
						});	
											
					}

					
					$scope.viewEiWorkQty=function(itemcodes,projectcode,itemname)
					{
						
						$scope.itemcode=itemcodes;
						$scope.itemname=itemname;
						
						    $http.get('/project/getProjectEIWorksDataByProjectcode?projectcode='+projectcode+"&itemcode="+itemcodes).success(function(data) 
								{
								console.log("Data came ", data)
								$scope.itemData2 = new NgTableParams({}, 
								{
									dataset : data
								});
									
								}, function myError(response) {
									alert("Sorry, Some technical error occur");
								});
						
						
						$("#eiworkqty").modal({
							backdrop : 'static',
							keyboard : false
						});
						
					}
					
					$scope.viewsupplydetails=function(projectcode,projectname,loano,projectlocation,itemname,itemobj)
					{
						
						console.log("Item object",itemobj);
						
						$scope.projectlocation=projectlocation;
						$scope.itemname=itemname;
						$scope.showSupplyDetailslistByItemcode=true;
						$scope.showProjectDetailslistByLoaNO=false;
						$scope.projectlistshow=false;
						$scope.pi=false;
						$scope.itemdata=itemobj;

						$scope.getvendorData();

						/*
						
						$("#supplydetailsupdate").modal({
							backdrop : 'static',
							keyboard : false
						});
						*/
					}
					
					$scope.getProjectLocationDetails = function(projectCode,projectLocation){
						$http.get('/project/projectLocation/'+projectLocation+'/'+projectCode).success(function(data) 
								{
								console.log("Data came ", data)
								$scope.itemData = new NgTableParams({}, 
								{
									dataset : data
								});
									
								}, function myError(response) {
									alert("Sorry, Some technical error occur");
								});
						
					}
					$scope.getProjectDataByProjectCode=function(projectcode)
					{
					
					    $http.get('/project/getProjectDetailsbyProjectCode?projectcode='+projectcode).success(function(data) 
								{
								console.log("Data came ", data)
								$scope.projectListTableByProjectcode = new NgTableParams({}, 
								{
									dataset : data
								});
									
								}, function myError(response) {
									alert("Sorry, Some technical error occur");
								});
						
//						$scope.loano=loano;
//						$scope.projectdate=projectdate;
//						$scope.projectcode=projectcode;
//						$scope.showProjectDetailslistByLoaNO=true;
//						$scope.showSupplyDetailslistByItemcode=false;
//						$scope.projectlistshow=false;
//						$scope.pi=false;
					}
					
					
					$scope.updateSupplyData=function(itemdata)
					{				

					console.log("Itemdata found ",itemdata)
					$('#supplysavebutton').prop('disabled', true);
					
					$http.post('/project/updateSupplyData',itemdata).success(function(data) 
				   {
			
					 $('#supplysavebutton').prop('disabled', false);    
					
					 alert("save");

					}, function myError(response) 
					{
					alert("Sorry, Some technical error occur");
					});
					
					}
					
					$scope.supplyDetailsFetch=function(itemdata)
					{
						var supplyid=$("#vendorid").val();
						$scope.supplyDetailsWithVendorid(supplyid,itemdata);
					}
					
					
					$scope.supplyDetailsWithVendorid=function(vendorid,itemdata)
					{
						

						console.log("Item data ",itemdata)
						
						
					    $http.get('/vendorctrl/getVendorDetailsByVendorid/'+vendorid).success(function(data) 
								{
								console.log("Data came ----------", data)
					
							    $scope.itemdata.supplieraddress=data.address1;

								}, function myError(response) {
									alert("Sorry, Some technical error occur");
								});
					}

					
					// *************************************************************************************************************************************

					// +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
					// #########################################################################
					// All JS for ERP Software starts from here
					// #########################################################################
					// +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
				});

$.import_js('/js/moduleJs/project_JS_User.js');
