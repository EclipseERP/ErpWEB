
     <!-- Content Header (Page header) -->
                      <!--Form and Application Button-->
        <section class="content" ng-show="projectaddshow">
            <div class="row">
                <div class="col-md-12">
                <form ng-submit="projectAdd(p)" class="col-md-12" name="ProjectForm">
                    <div class="box box-primary">
                        <div class="box-header with-border">
                            <h3 class="box-title">Project Details Form</h3>
                            <div class="box-tools pull-right">
                                    <button type="button" ng-click="projectlistload()" class="btn btn-box-tool" data-widget="back">
									<i class="fa fa-reply"> </i> Back
								</button>
                            </div>
                        </div>
                        <!-- /.box-header -->
                        <div class="box-body">
                            <div class="row">
								<div class="col-md-6">									
									<div class="form-group">
										<label for="af1">Project Code </label>
										<input type="text" class="form-control" ng-model="p.projectCode"af1" placeholder="">
									</div>									
								</div>
								
								<div class="col-md-6">									
									<div class="form-group">
										<label for="af3">Name </label>
										<input type="text" class="form-control" ng-model="p.projectName" id="af3" placeholder="">
									</div>									
								</div>
								<div class="col-md-6">									
									<div class="form-group">
										<label for="af4">Details </label>
										<input type="text" class="form-control" id="af4" placeholder="">
									</div>									
								</div>								
								<div class="col-md-6">									
									<div class="form-group">
										<label for="datepicker">Date </label>
										 <div class="input-group date">
                                            <div class="input-group-addon"> <i class="fa fa-calendar"></i> </div>
										<input type="text" class="form-control" ng-model="p.creationDate" id="af5" placeholder="">
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
        
        
    