
     <!-- Content Header (Page header) -->
                      <!--Form and Application Button-->
        <section class="content" ng-show="vendorDocaddshow">
            <div class="row">
                <div class="col-md-12">
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
										<input type="text" class="form-control" id="af1" placeholder="">
									</div>									
								</div>
								<div class="col-md-6">									
									<div class="form-group">
										<label for="af2">Document Type </label>
										<select class="form-control select2" id="af2" style="width: 100%;">
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
                                        <div class="input-group date">
                                            <div class="input-group-addon"> <i class="fa fa-calendar"></i> </div>
                                            <input type="text" class="form-control pull-right" id="datepicker">
                                        </div> 
                                    </div>									
								</div>
								<div class="col-md-6">									
									<div class="form-group">
										<label for="af3">Document Code </label>
										<input type="text" class="form-control" id="af3" placeholder="">
									</div>									
								</div>								
								<div class="col-md-6">									
									<div class="form-group">
										<label for="customFile">Document URL </label>
										<div class="custom-file">							
											<label class="custom-file-label" for="customFile">Choose file</label>
											<input type="file" class="custom-file-input" id="customFile">
										</div>
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
        </section>
        
        