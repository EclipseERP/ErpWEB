 
     <!-- Content Header (Page header) -->
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
										<input type="text" id="subtotal" ng-model="data.amount" readonly="readonly"  value="0" class="form-control" id="af6" placeholder="">
									</div>									
								</div>
								<div class="col-md-6">									
									<div class="form-group">
										<label for="af7">GST Percentage </label>
										<input type="text" id="gst" ng-model="data.gst" ng-keyup="calculateTotal()" class="form-control" value="0" id="af7" placeholder="">
									</div>									
								</div>
								<div class="col-md-6">									
									<div class="form-group">
										<label for="af8">Total Amount </label>
										<input type="text" id="grandTotal" ng-model="data.totalAmount" readonly="readonly" value="0" class="form-control" id="af8" placeholder="">
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
                    
                </div> 
                              
            </div>
             </form>	
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
    