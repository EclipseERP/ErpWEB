
     <!-- Content Header (Page header) -->
                      <!--Form and Application Button-->
        <section class="content" ng-show="vendoraddshow">
            <div class="row">
             <form  name="vendorForm">
                <div class="col-md-12">
                    <div class="box box-primary">
                        <div class="box-header with-border">
                            <h3 class="box-title">Vendor Form</h3>
                            <div class="box-tools pull-right">
                                    <button type="button" ng-click="vendorlistload()" class="btn btn-box-tool" data-widget="back">
									<i class="fa fa-reply"> </i> Back
								</button>
                            </div>
                        </div>
                        <!-- /.box-header -->
                        <div class="box-body">
                            <div class="row">
<!--                             <form ng-submit="submitVendor(ven)" name="vendorForm"> -->
                            
                           
                            
								<div class="col-md-6">	
																
									<div class="form-group">
										<label for="af1">Company Name </label>
										<input type="text" class="form-control" ng-model="ven.companyName" id="af1" placeholder="">
									</div>									
								</div>
								<div class="col-md-6">									
									<div class="form-group">
										<label for="af2">Company Type </label>
										<select class="form-control select2" style="width: 100%;">
											<option selected="selected">Select Option</option>
											<option>Alaska</option>
											<option>California</option>
											<option>Delaware</option>
											<option>Tennessee</option>
											<option>Texas</option>
											<option>Washington</option>
										</select>
									</div>									
								</div>
								<div class="col-md-6">									
									<div class="form-group">
										<label for="af3">Primary Contact Number </label>
										<input type="text" ng-model="ven.primaryContact" class="form-control" id="af3" placeholder="">
									</div>									
								</div>
								<div class="col-md-6">									
									<div class="form-group">
										<label for="af4">Secondary Contact Number </label>
										<input type="text" ng-model="ven.secondaryContact" class="form-control" id="af4" placeholder="">
									</div>									
								</div>								
								<div class="col-md-6">									
									<div class="form-group">
										<label for="af5">Permanent Address </label>
										<input type="text" ng-model="ven.address1" class="form-control" id="af5" placeholder="">
									</div>									
								</div>
								<div class="col-md-6">									
									<div class="form-group">
										<label for="af6">Residential Address </label>
										<input type="text" ng-model="ven.address2" class="form-control" id="af6" placeholder="">
									</div>									
								</div>
								<div class="col-md-6">									
									<div class="form-group">
										<label for="af61">Vendor PAN </label>
										<input type="text" ng-model="ven.companyPAN" class="form-control" id="af61" placeholder="">
									</div>									
								</div>
								<div class="col-md-6">									
									<div class="form-group">
										<label for="af7">Bank Details ID </label>
										<input type="text" ng-model="ven.bankDetailsID" class="form-control" id="af7" placeholder="">
									</div>									
								</div>
								<div class="col-md-4">									
									<div class="form-group">
										<label for="af8">Vendor Type </label>
										<input type="text" ng-model="ven.vendorType" class="form-control" id="af8" placeholder="">
									</div>									
								</div>
								<div class="col-md-4">									
									<div class="form-group">
										<label for="af9">Vendor Code </label>
										<input type="text" ng-model="ven.vendorCode" class="form-control" id="af9" placeholder="">
									</div>									
								</div>
								<div class="col-md-4">									
									<div class="form-group">
										<label for="af91">Vendor Document ID</label>
										<input type="text" ng-model="ven.vendorDocID" class="form-control" id="af91" placeholder="">
									</div>									
								</div>
								<div class="col-md-6">									
									<div class="form-group">
										<label for="af611">PIN Code </label>
										<input type="text" ng-model="ven.zip" class="form-control" id="af611" placeholder="">
									</div>									
								</div>
								<div class="col-md-6">									
									<div class="form-group">
										<label for="af62">City </label>
										<input type="text" ng-model="ven.city" class="form-control" id="af62" placeholder="">
									</div>									
								</div>
								<div class="col-md-6">									
									<div class="form-group">
										<label for="af63">State </label>
										<input type="text" ng-model="ven.state" class="form-control" id="af63" placeholder="">
									</div>									
								</div>
								<div class="col-md-6">									
									<div class="form-group">
										<label for="af64">Country </label>
										<input type="text" ng-model="ven.country" class="form-control" id="af64" placeholder="">
									</div>									
								</div>
							
                            </div>
                        </div>
						<div class="box-footer" align="right">
							<button type="submit" ng-click="vendorDetailsADD(ven)"  class="btn btn-primary pad40L pad40R mrg5L">Submit</button>
						</div>
                    </div>
                </div>  
                </form>              
            </div>
        </section>
        
        
    