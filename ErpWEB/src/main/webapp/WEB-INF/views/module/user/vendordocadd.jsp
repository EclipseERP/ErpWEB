<script type="text/javascript">
$document.ready( function(){
	$("#upload_date").datepicker(
			{
				dateFormat: 'yy-mm-dd',
			});
})
</script>
     <!-- Content Header (Page header) -->
                      <!--Form and Application Button-->
        <section class="content" ng-show="vendorDocaddshow">
            <div class="row">
                <div class="col-md-12">
                 <form name="VendorDocForm" class="col-md-12" ng-submit="submitVendorDocForm(venData)">
                    <div class="box box-primary">
                        <div class="box-header with-border">
                            <h3 class="box-title">Vendor Document Form</h3>
                            <div class="box-tools pull-right">
                                      <button type="button" ng-click="vendorDoclistload()" class="btn btn-box-tool" data-widget="back">
									<i class="fa fa-reply"> </i> Back
								</button>
                            </div>
                        </div>
                       
                        <!-- /.box-header -->
                        <div class="box-body">
                            <div class="row">
								<div class="col-md-6">									
									<div class="form-group">
										<label for="af1">Document Name </label>
										<input type="text" ng-model="venData.documentName" class="form-control" id="docname" placeholder="docname" ng-model="vendordoc.name">
									</div>									
								</div>
								<div class="col-md-6">									
									<div class="form-group">
										<label for="af2">Document Type </label>
										<select class="form-control select2" id="doctype" ng-model="vendordoc.type" style="width: 100%;">
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
                                        <label for="datepicker">Date of Upload </label>
                                        <input type="text" class="form-control" id="turnoverDate" readonly="readonly" placeholder="Date of Entry" datetime-picker="yyyy-MM-dd " size="3" ng-model="venData.dataOfUpload" is-open="ctrl.date.eventTime" /> 									
										<span class="input-group-btn">
										<button type="button" class="btn btn-blue" ng-click="ctrl.date.eventTime = true"> <i class="fa fa-calendar"></i>
                                        </div> 
                                    </div>									
								</div>
								<div class="col-md-6">									
									<div class="form-group">
										<label for="af3">Document Code </label>
										<input type="text" ng-model="venData.documentCode" class="form-control" id="doccode" placeholder="doccode">
									</div>									
								</div>								
								<div class="col-md-6">									
									<div class="form-group">
										<label for="customFile">Document URL </label>
										<div class="custom-file">							
											<label class="custom-file-label" for="customFile">Choose file</label>
											<input type="file" ng-model="venData.documentUrl" class="custom-file-input" id="customFile">
										</div>
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
        
        
