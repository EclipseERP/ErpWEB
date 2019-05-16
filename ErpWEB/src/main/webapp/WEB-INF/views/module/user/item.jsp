 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
     <!-- Content Header (Page header) -->
               <section class="content" ng-show="itemaddshow">
              
                 
                 <div class="row">
                <div class="col-md-12">
             <form ng-submit="submitItem(data)" class="col-md-12" name="itemForm">
                    <div class="box box-warning">
                        <div class="box-header with-border">
                        <c:import url="/WEB-INF/views/messages/success.jsp"/>	
                    <c:import url="/WEB-INF/views/messages/error.jsp"/>	
                    <c:import url="/WEB-INF/views/messages/processing.jsp"/>
                            <h3 class="box-title">Raw Materials Form</h3>
                            <div class="box-tools pull-right">
                                 <button type="button" ng-click="itemlistload()" class="btn btn-box-tool" data-widget="back">
									<i class="fa fa-reply"> </i> Back
								</button>
                              
                            </div>
                        </div>
                        <!-- /.box-header -->
                        <div class="box-body">
                            <div class="row">
								<div class="col-md-6">									
									<div class="form-group">
										<label for="af1">Item Name</label>
										<input type="text" ng-model="data.name"  class="form-control" id="af1" placeholder=""  required>
									</div>									
								</div>
									<div class="col-md-6">									
									<div class="form-group">
										<label for="af3">Item Code</label>
										<input type="text" value="{{itemcode}}" class="form-control" id="af3" placeholder="" required>
									</div>									
								</div>
								<div class="col-md-6">									
									<div class="form-group">
										<label for="af2">Item Type</label>
										<select ng-model="data.itemType" class="form-control select2" style="width: 100%;">
											<option selected="selected">Select Option</option>
											<option value="1">Electronics</option>
								
										</select>
									</div>									
								</div>
								<div class="col-md-6">									
									<div class="form-group">
										<label for="af10">HSN Number</label>
										<input type="text" class="form-control" ng-model="data.hsno" id="hsn" placeholder="" required>
									</div>									
								</div>
								<div class="col-md-12">									
									<div class="form-group">
										<label for="af11">Description</label>
										<textarea ng-model="data.description" class="form-control" id="description" rows="5" placeholder="" required></textarea>
									</div>									
								</div>
								
								<div class="col-md-6">
								<div class="form-group">
									<label for="af2">Date of Entry </label> 
									
			                            <input type="text" class="form-control" id="tendardate" readonly="readonly" placeholder="Date of Entry" datetime-picker="yyyy-MM-dd " size="3" ng-model="data.dateOfSupply" is-open="ctrl.date.eventTime" /> 									
										<span class="input-group-btn">
										<button type="button" class="btn btn-blue" ng-click="ctrl.date.eventTime = true"> <i class="fa fa-calendar"></i>
									
								</div>
							</div>
								
								
								<!-- <div class="col-md-12">
							 	<a id="schQuantityadd"  class="btn btn-primary pad40L pad40R mrg5L" >
			                  	Add SCH Quantity</a>
							 
												<br/>		
											<br/>
									<div id="schQuantity" class="form-group">
									
									

									</div>
									<hr style="color:red"/>
																	
							    </div>
							    
							    <div class="col-md-12">
							 	<a id="eiworksadd"  class="btn btn-primary pad40L pad40R mrg5L" >
			                  	Add EI-Work</a>
							 
												<br/>		
											<br/>
									<div id="eiworks" class="form-group">
									
									

									</div>
									<hr style="color:red"/>
																	
							    </div>
								
								
								
								
								<div class="col-md-4">									
									<div class="form-group">
										<label for="af3">SCH Quantity 1</label>
										<input type="text" onkeypress="return isNumber(event)" onkeyup="positiveNumberValidation_divid('sch1','number_validation','Please enter only valid integers !!')" ng-model="data.schQuantity1" id="sch1" value="NOS" class="form-control" placeholder="" required>
									</div>									
								</div>
								<div class="col-md-4">									
									<div class="form-group">
										<label for="af3">SCH Quantity 2</label>
										<input type="text" onkeypress="return isNumber(event)" onkeyup="positiveNumberValidation_divid('sch2','number_validation','Please enter only valid integers !!')" ng-model="data.schQuantity2" id="sch2" value="NOS" class="form-control" placeholder="" required>
									</div>									
								</div>
								<div class="col-md-4">									
									<div class="form-group">
										<label for="af3">SCH Quantity 3</label>
										<input type="text" onkeypress="return isNumber(event)" onkeyup="positiveNumberValidation_divid('sch3','number_validation','Please enter only valid integers !!')" ng-model="data.schQuantity3" id="sch3" value="NOS" class="form-control" placeholder="" required>
									</div>									
								</div>
								<div class="col-md-6">									
									<div class="form-group">
										<label for="af4">EI-Work 1</label>
										<input type="text" onkeypress="return isNumber(event)" onkeyup="positiveNumberValidation_divid('eiWork1','number_validation','Please enter only valid integers !!')" id="eiWork1" ng-model="data.eiWork1" ng-keyup="calculateTotal()" value="0" class="form-control" placeholder="" required>
									</div>									
								</div>
								<div class="col-md-6">									
									<div class="form-group">
										<label for="af4">EI-Work 2</label>
										<input type="text" onkeypress="return isNumber(event)" onkeyup="positiveNumberValidation_divid('eiWork2','number_validation','Please enter only valid integers !!')" id="eiWork2" ng-model="data.eiWork2" ng-keyup="calculateTotal()" value="0" class="form-control" placeholder="" required>
									</div>									
								</div>
								
								
								<div class="col-md-6">									
									<div class="form-group">
										<label for="af3">Unit</label>
										<input type="text" onkeypress="return isNumber(event)" onkeyup="positiveNumberValidation_divid('unit','number_validation','Please enter only valid integers !!')" ng-model="data.unit" id="unit" value="NOS" class="form-control" placeholder="" required>
									</div>									
								</div>
										<div class="col-md-6">									
									<div class="form-group">
										<label for="af5">Rate</label>
										<input type="text" onkeypress="return isNumber(event)" onkeyup="positiveNumberValidation_divid('rate','number_validation','Please enter only valid integers !!')" id="rate" ng-model="data.rate" ng-keyup="calculateTotal()"  value="0" class="form-control" placeholder="" required>
									</div>									
								</div>
								<div class="col-md-6">									
									<div class="form-group">
										<label for="af4">Total Quantity</label>
										<input type="text" onkeypress="return isNumber(event)" onkeyup="positiveNumberValidation_divid('totQty','number_validation','Please enter only valid integers !!')" id="totQty" ng-model="data.totalQty" ng-keyup="calculateTotal()" value="0" class="form-control" placeholder="" required>
									</div>									
								</div>
						       <div class="col-md-6">									
									<div class="form-group">
										<label for="af4">INS</label>
										<input type="text" id="ins" ng-model="data.ins" ng-keyup="calculateTotal()" value="0" class="form-control" placeholder="">
									</div>									
								</div>
								<div class="col-md-6">									
									<div class="form-group">
										<label for="af6">Amount</label>
										<input type="text" onkeypress="return isNumber(event)" onkeyup="positiveNumberValidation_divid('amt','number_validation','Please enter only valid integers !!')" ng-model="data.amount" readonly="readonly" class="form-control" id="amt" placeholder="" required>
									</div>									
								</div>
								<div class="col-md-6">									
									<div class="form-group">
										<label for="af7">GST Percentage</label>
										<input type="text" onkeypress="return isNumber(event)" onkeyup="positiveNumberValidation_divid('gst','number_validation','Please enter only valid integers !!')" id="gst" ng-model="data.gst" ng-keyup="calculateTotal()" class="form-control" placeholder="">
									</div>									
								</div>
								<div class="col-md-6">									
									<div class="form-group">
										<label for="af3">% Above</label>
										<input type="text" onkeypress="return isNumber(event)" onkeyup="positiveNumberValidation_divid('above','number_validation','Please enter only valid integers !!')" ng-model="data.percentageAbove" id="above" value="NOS" class="form-control" placeholder="" required>
									</div>									
								</div>
								<div class="col-md-6">									
									<div class="form-group">
										<label for="af3">All Inclusive Rate</label>
										<input type="text" onkeypress="return isNumber(event)" onkeyup="positiveNumberValidation_divid('inclusiveRate','number_validation','Please enter only valid integers !!')" ng-model="data.allInclusiveRate" value="NOS" class="form-control" id="inclusiveRate" placeholder="" required>
									</div>									
								</div>
								
								<div class="col-md-6">									
									<div class="form-group">
										<label for="af8">Total Amount </label>
										<input type="text" onkeypress="return isNumber(event)" onkeyup="positiveNumberValidation_divid('grandTotal','number_validation','Please enter only valid integers !!')" id="grandTotal" ng-model="data.totalAmount" readonly="readonly" class="form-control" placeholder="">
									</div>									
								</div>
								<div class="col-md-6">									
									<div class="form-group">
										<label for="af9">Transportation Code </label>
										<input type="text" class="form-control" ng-model="data.hsNo" id="af9" placeholder="" required>
									</div>									
								</div>
								<div class="col-md-12">									
									<div class="form-group">
										<label for="af11">Supplier With Address</label>
										<input type="text" ng-model="data.supplierWithAddress"  class="form-control" id="af11" placeholder="">
									    <select ng-model="data.supplierWithAddress" class="form-control select2" style="width: 100%;">
											<option selected="selected">Select Option</option>
										</select>
									</div>									
								</div>
								<div class="col-md-6">									
									<div class="form-group">
										<label for="af3">Details of IC</label>
										<input type="text" ng-model="data.icDetails" id="unit" value="NOS" class="form-control" id="af3" placeholder="" required>
									</div>									
								</div>
								<div class="col-md-6">									
									<div class="form-group">
										<label for="af3">Date of Supply</label>
										<input type="text" datetime-picker="MM/dd/yyyy HH:mm" ng-model="data.dateOfSupply" id="dateOfSupply" value="NOS" class="form-control" placeholder="" required>
									</div>									
								</div>
								<div class="col-md-6">									
									<div class="form-group">
										<label for="af4">Supply Quantity</label>
										<input type="text" onkeypress="return isNumber(event)" onkeyup="positiveNumberValidation_divid('qty','number_validation','Please enter only valid integers !!')" id="qty" ng-model="data.supplyQuantity" ng-keyup="calculateTotal()" value="0" class="form-control" id="af4" placeholder="" required>
									</div>									
								</div>
								<div class="col-md-6">									
									<div class="form-group">
										<label for="af3">Balance Quantity</label>
										<input type="text" onkeypress="return isNumber(event)" onkeyup="positiveNumberValidation_divid('unit','number_validation','Please enter only valid integers !!')" ng-model="data.balanceQuantity" id="unit" value="NOS" class="form-control" placeholder="" required>
									</div>									
								</div>
								<div class="col-md-6">									
									<div class="form-group">
										<label for="af3">Place of Delivery</label>
										<input type="text" ng-model="data.placeOfDelivery" id="unit" value="NOS" class="form-control" id="af3" placeholder="" required>
									</div>									
								</div>
								<div class="col-md-6">									
									<div class="form-group">
										<label for="af3">Way Bill No. Date</label>
										<input type="text" ng-model="data.wayBillNoDate" id="unit" value="NOS" class="form-control" id="af3" placeholder="" required>
									</div>									
								</div>
								<div class="col-md-6">									
									<div class="form-group">
										<label for="af3">Truck Number</label>
										<input type="text" ng-model="data.truckNo" id="unit" value="NOS" class="form-control" id="af3" placeholder="" required>
									</div>									
								</div>
								<div class="col-md-6">									
									<div class="form-group">
										<label for="af3">Transporter</label>
										<input type="text" ng-model="data.transporter" id="transporter" value="NOS" class="form-control" placeholder="" required>
									</div>									
								</div>
								<div class="col-md-6">									
									<div class="form-group">
										<label for="af3">Arrival Date at Railway Store</label>
										<input type="text" datetime-picker="MM/dd/yyyy HH:mm" ng-model="data.arrivalDateAtRailwayStore" id="unit" value="NOS" class="form-control" id="af3" placeholder="" required>
									</div>									
								</div>
								<div class="col-md-6">									
									<div class="form-group">
										<label for="af3">Date of Railway Receipt</label>
										<input type="text" datetime-picker="MM/dd/yyyy HH:mm" ng-model="data.dateOfRailwayReceipt" id="unit" value="NOS" class="form-control" id="af3" placeholder="" required>
									</div>									
								</div>
								<div class="col-md-6">									
									<div class="form-group">
										<label for="af3">Bill No.</label>
										<input type="text" ng-model="data.billNo" id="unit" value="NOS" class="form-control" id="af3" placeholder="" required>
									</div>									
								</div>
								<div class="col-md-6">									
									<div class="form-group">
										<label for="af3">Date</label>
										<input type="text" datetime-picker="MM/dd/yyyy HH:mm" ng-model="data.date" id="unit" value="NOS" class="form-control" id="af3" placeholder="" required>
									</div>									
								</div>
								<div class="col-md-6">									
									<div class="form-group">
										<label for="af3">Bill Quantity</label>
										<input type="text" ng-model="data.billQuantity" id="unit" value="NOS" class="form-control" id="af3" placeholder="" required>
									</div>									
								</div>
								<div class="col-md-6">									
									<div class="form-group">
										<label for="af3">Way Bill No. Date</label>
										<input type="text" datetime-picker="MM/dd/yyyy HH:mm" ng-model="data.wayBillNoDate" id="unit" value="NOS" class="form-control" id="af3" placeholder="" required>
									</div>									
								</div> -->
												
                            </div>
                        </div>
						<div class="box-footer" align="right">
							<button type="submit" class="btn btn-primary pad40L pad40R mrg5L">Submit</button>
						</div>
					
                    </div>
                     </form>	

                </div> 
                              
            </div>
            
        </section>
     
                <script type="text/javascript">
        /*
        function calculateTotal()
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
        */
        
        </script>
    











































<!--  
     Content Header (Page header)
               <section class="content" ng-show="itemaddshow">
              
                 <form ng-submit="submitItem(data)" class="row" name="itemForm">
                 <div class="row">
                <div class="col-md-12">
             
                    <div class="box box-warning">
                        <div class="box-header with-border">
                            <h3 class="box-title">Raw Materials Form</h3>
                            <div class="box-tools pull-right">
                                 <button type="button" ng-click="itemlistload()" class="btn btn-box-tool" data-widget="back">
									<i class="fa fa-reply"> </i> Back
								</button>
                              
                            </div>
                        </div>
                        /.box-header
                        <form ng-submit="submititemList(itemData)" 
                                class="form-horizontal" name="item_Form">
                        <div class="box-body">
                            <div class="row">
								<div class="col-md-6">									
									<div class="form-group">
<<<<<<< HEAD
										<label for="af1">Raw Material </label>
										<input type="text" class="form-control" id="af1" placeholder="Item name" ng-model="itemData.itemname" ng-minlength="3" rows="3" name="itemname" required>
=======
										<label for="af1">Item Name </label>
										<input type="text" ng-model="data.name"  class="form-control" id="af1" placeholder="">
>>>>>>> branch 'master' of https://github.com/EclipseERP/ErpWEB.git
									</div>									
								</div>
									<div class="col-md-6">									
									<div class="form-group">
										<label for="af3">Item Code </label>
										<input type="text" ng-model="data.itemCode" class="form-control" id="af3" placeholder="">
									</div>									
								</div>
								
									<div class="col-md-12">									
									<div class="form-group">
										<label for="af2">Item Type </label>
<<<<<<< HEAD
										<select class="form-control select2" id="itemtype" name="itemtype"  ng-model="itemData.itemtype" style="width: 100%;">
=======
										<select ng-model="data.itemType" class="form-control select2" style="width: 100%;">
>>>>>>> branch 'master' of https://github.com/EclipseERP/ErpWEB.git
											<option selected="selected">Select Option</option>
											<option value="1">Electronics</option>
								
										</select>
									</div>									
								</div>
								<div class="col-md-6">									
									<div class="form-group">
<<<<<<< HEAD
										<label for="af3">Item Code </label>
										<input type="text" class="form-control" id="af3" placeholder="Item code" ng-model="itemData.itemcode"name="itemcode" required">
=======
										<label for="af3">Unit </label>
										<input type="text" ng-model="data.unit" id="unit" value="NOS" class="form-control" id="af3" placeholder="">
									</div>									
								</div>
										<div class="col-md-6">									
									<div class="form-group">
										<label for="af5">Rate </label>
										<input type="text" id="rate" ng-model="data.rate" ng-keyup="calculateTotal()"  value="0" class="form-control" id="af5" placeholder="">
>>>>>>> branch 'master' of https://github.com/EclipseERP/ErpWEB.git
									</div>									
								</div>
								<div class="col-md-6">									
									<div class="form-group">
										<label for="af4">Quantity </label>
<<<<<<< HEAD
										<input type="text" class="form-control" id="qty" placeholder="quantity" onkeyup="calculateTotal()" ng-model="itemData.quantity"name="quantity" required">
=======
										<input type="text" id="qty" ng-model="data.qty" ng-keyup="calculateTotal()" value="0" class="form-control" id="af4" placeholder="">
>>>>>>> branch 'master' of https://github.com/EclipseERP/ErpWEB.git
									</div>									
								</div>
<<<<<<< HEAD
								<div class="col-md-6">									
									<div class="form-group">
										<label for="af5">Unit </label>
										<input type="text" class="form-control" id="unit" placeholder="unit" value="NOS" ng-model="itemData.rate"name="rate" required>
									</div>									
								</div>
=======
						
>>>>>>> branch 'master' of https://github.com/EclipseERP/ErpWEB.git
								<div class="col-md-6">									
									<div class="form-group">
										<label for="af6">Amount </label>
<<<<<<< HEAD
										<input type="text" class="form-control" id="subtotal" placeholder="amount" ng-model="itemData.amount">
=======
										<input type="text" id="subtotal" ng-model="data.amount" readonly="readonly"  value="0" class="form-control" id="af6" placeholder="">
>>>>>>> branch 'master' of https://github.com/EclipseERP/ErpWEB.git
									</div>									
								</div>
								<div class="col-md-6">									
									<div class="form-group">
										<label for="af7">GST Percentage </label>
<<<<<<< HEAD
										<input type="text" class="form-control" id="gst" placeholder="gst" ng-model="itemData.gst">
=======
										<input type="text" id="gst" ng-model="data.gst" ng-keyup="calculateTotal()" class="form-control" value="0" id="af7" placeholder="">
>>>>>>> branch 'master' of https://github.com/EclipseERP/ErpWEB.git
									</div>									
								</div>
								<div class="col-md-6">									
									<div class="form-group">
										<label for="af8">Total Amount </label>
<<<<<<< HEAD
										<input type="text" class="form-control" id="grandTotal" placeholder="totalAmount" ng-model="itemData.totalAmount">
=======
										<input type="text" id="grandTotal" ng-model="data.totalAmount" readonly="readonly" value="0" class="form-control" id="af8" placeholder="">
>>>>>>> branch 'master' of https://github.com/EclipseERP/ErpWEB.git
									</div>									
								</div>
								<div class="col-md-6">									
									<div class="form-group">
										<label for="af9">Transportation Code </label>
<<<<<<< HEAD
										<input type="text" class="form-control" id="af9" placeholder="tCode"ng-model="itemData.tCode">
=======
										<input type="text" class="form-control" ng-model="data.transportationCode" id="af9" placeholder="">
>>>>>>> branch 'master' of https://github.com/EclipseERP/ErpWEB.git
									</div>									
								</div>
								<div class="col-md-6">									
									<div class="form-group">
<<<<<<< HEAD
										<label for="af10">Description Number </label>
										<input type="text" class="form-control" id="af10" placeholder="descnumber" ng-model="itemData.descnumber">
=======
										<label for="af10">Description  </label>
										<input type="text" class="form-control" ng-model="data.descriptionHSNno" id="af10" placeholder="">
>>>>>>> branch 'master' of https://github.com/EclipseERP/ErpWEB.git
									</div>									
								</div>
								<div class="col-md-12">									
									<div class="form-group">
										<label for="af11">HSN Number </label>
<<<<<<< HEAD
										<input type="text" class="form-control" id="af11" placeholder="hsnnumber" ng-model="itemData.hsnnumber">
=======
										<input type="text" ng-model="data.hsno"  class="form-control" id="af11" placeholder="">
>>>>>>> branch 'master' of https://github.com/EclipseERP/ErpWEB.git
									</div>									
								</div>
<<<<<<< HEAD
								<div class="col-md-6">									
									<div class="form-group">
										<label for="af12">Date of Entry </label>
										<input type="text" class="form-control" id="af12" placeholder="entryDate"
									datetime-picker="MM/dd/yyyy HH:mm" ng-model="itemData.entryDate"
										 name="entryDate" 
										 is-open="ctrl.date.showFlag" />
									</div>									
								</div>						
=======
												
>>>>>>> branch 'master' of https://github.com/EclipseERP/ErpWEB.git
                            </div>
                        </div>
						<div class="box-footer" align="right">
						<table ng-table="itemTable" class="table" style="text-align : center">
							    <tr ng-repeat="datas in $data | filter : keyword">
							     <td title="'Item Name'" >
							           {{datas.itemname}}</td> 
							     <td title="'Item Type'" >
							           {{datas.itemtype}}</td> 
							     <td title="'Item Code'" >
							           {{datas.itemcode}}</td> 
							     <td title="'Unit'" >
							           {{datas.quantity}}</td>           
							     <td title="'GST'">
							            {{datas.gst}}</td>
							     <td title="'Action'">
							         <a type="button" class="btn btn-danger" style="width: 40px; border-radius: 0px;" ng-click="deleteVenue(datas)"><i class="fa fa-remove" aria-hidden="true"></i></a> <a  type="button" class="btn btn-info" style="width: 40px; border-radius: 0px;" ng-click="editVenueForm(datas)"><i class="fa fa-pencil-square" aria-hidden="true"></i></a> 
							    </tr>
						    </table>
							<button type="submit" class="btn btn-primary pad40L pad40R mrg5L">Submit</button>
						</div>
<<<<<<< HEAD
                    </form>
=======
					
>>>>>>> branch 'master' of https://github.com/EclipseERP/ErpWEB.git
                    </div>
                    
>>>>>>> branch 'master' of https://github.com/EclipseERP/ErpWEB.git
                </div> 
                              
            </div>
            
        </section>
     
                <script type="text/javascript">
        /*
        function calculateTotal()
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
        */
        
<<<<<<< HEAD
        <script type="text/javascript">
        
        function calculateTotal()
        {
        	var total=0;
        	var qty=$("#qty").val()
        	alert(qty)
        	var 
        	total=
        	
        	
        }
        
        
        </script>
        
        
=======
        </script>
>>>>>>> branch 'master' of https://github.com/EclipseERP/ErpWEB.git
     -->
     
      <script type="text/javascript" src="/js/moduleJs/project_JS_User.js"></script>