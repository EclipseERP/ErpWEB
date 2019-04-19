 
     <!-- Content Header (Page header) -->
               <section class="content" ng-show="itemaddshow">
              
                 
                 <div class="row">
                <div class="col-md-12">
             <form ng-submit="submitItem(data)" class="col-md-12" name="itemForm">
                    <div class="box box-warning">
                        <div class="box-header with-border">
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
										<label for="af1">Item Name </label>
										<input type="text" ng-model="data.name"  class="form-control" id="af1" placeholder="">
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
										<select ng-model="data.itemType" class="form-control select2" style="width: 100%;">
											<option selected="selected">Select Option</option>
											<option value="1">Electronics</option>
								
										</select>
									</div>									
								</div>
								<div class="col-md-6">									
									<div class="form-group">
										<label for="af3">Unit </label>
										<input type="text" ng-model="data.unit" id="unit" value="NOS" class="form-control" id="af3" placeholder="">
									</div>									
								</div>
										<div class="col-md-6">									
									<div class="form-group">
										<label for="af5">Rate </label>
										<input type="text" id="rate" ng-model="data.rate" ng-keyup="calculateTotal()"  value="0" class="form-control" id="af5" placeholder="">
									</div>									
								</div>
								<div class="col-md-6">									
									<div class="form-group">
										<label for="af4">Quantity </label>
										<input type="text" id="qty" ng-model="data.qty" ng-keyup="calculateTotal()" value="0" class="form-control" id="af4" placeholder="">
									</div>									
								</div>
						
								<div class="col-md-6">									
									<div class="form-group">
										<label for="af6">Amount </label>
										<input type="text" id="subtotal" ng-model="data.amount" readonly="readonly"   class="form-control" id="af6" placeholder="">
									</div>									
								</div>
								<div class="col-md-6">									
									<div class="form-group">
										<label for="af7">GST Percentage </label>
										<input type="text" id="gst" ng-model="data.gst" ng-keyup="calculateTotal()" class="form-control"  id="af7" placeholder="">
									</div>									
								</div>
								<div class="col-md-6">									
									<div class="form-group">
										<label for="af8">Total Amount </label>
										<input type="text" id="grandTotal" ng-model="data.totalAmount" readonly="readonly"  class="form-control" id="af8" placeholder="">
									</div>									
								</div>
								<div class="col-md-6">									
									<div class="form-group">
										<label for="af9">Transportation Code </label>
										<input type="text" class="form-control" ng-model="data.transportationCode" id="af9" placeholder="">
									</div>									
								</div>
								<div class="col-md-6">									
									<div class="form-group">
										<label for="af10">Description  </label>
										<input type="text" class="form-control" ng-model="data.descriptionHSNno" id="af10" placeholder="">
									</div>									
								</div>
								<div class="col-md-12">									
									<div class="form-group">
										<label for="af11">HSN Number </label>
										<input type="text" ng-model="data.hsno"  class="form-control" id="af11" placeholder="">
									</div>									
								</div>
												
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