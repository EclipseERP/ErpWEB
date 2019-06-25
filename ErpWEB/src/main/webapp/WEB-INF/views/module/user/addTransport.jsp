
     <!-- Content Header (Page header) -->
                      <!--Form and Application Button-->
        <section class="content" ng-init="getLastId()">
            <div class="row">
                <div class="col-md-12">
                <form ng-submit="addTransport()" class="col-md-12"  name="form" novalidate>
                    <div class="box box-primary">
                        <div class="box-header with-border">
                            <h3 class="box-title">Add Transport</h3>
                            <div class="box-tools pull-right">
                                    <button type="button" href="#accountsListload" class="btn btn-box-tool" data-widget="back">
									<i class="fa fa-reply"> </i> Back To Transport List
								</button>
                            </div>
                        </div>
                        <!-- /.box-header -->
                        <div class="box-body">
                            <div class="row">
                            	<div class="col-md-12">									
									<div class="form-group">
										<label for="af1">Transport Id</label>
										<input type="text"  class="form-control" id="transportId" readonly="" ng-model="transport.transportId" name="transportId" ng-value="{{id}}" placeholder="">
									</div>									
								</div>
								
								<div class="col-md-6">									
									<div class="form-group">
										<label for="af1">Transport No</label>
										<input type="text"  class="form-control" ng-model="transport.transportNo" name="transportNo" placeholder="Transport No">
									</div>									
								</div>
								
								
								<div class="col-md-6">
								<div class="form-group">
									<label for="af2">Transport Name </label> 
			                            <input  ng-pattern="[a-zA-Z]+" type="text" class="form-control" id="transportName"  name="transportName" required  ng-model="transport.transportName" placeholder="transport Name" /> 									
										<span style="color:red" ng-show="form.transportName.$error.required 
                    && form.transportName.$dirty">Name is required</span>
                    <span style="color:red" ng-show="form.transportName.$error.valid 
                    && form.transportName.$dirty">Name is invalid</span> 
									
								</div>
								</div>
								
								<div class="col-md-6">
								<div class="form-group">
									<label for="payementRecievedDate">capacity </label> 
										<input type="number" class="form-control" id="capacity"  name="capacity"  required ng-model="transport.capacity" placeholder="capacity" />
									<span style="color:red" ng-show="form.capacity.$error.required 
                    && form.capacity.$dirty">capacity is required</span>
                    <span style="color:red" ng-show="form.capacity.$error.number
                    && form.capacity.$dirty">inavlid capacity </span> 
								</div>
								</div>
								  									
								
                            </div>
                        </div>
						<div class="box-footer" align="right">
							<button type="submit" ng-disabled="!form.$valid"  class="btn btn-primary pad40L pad40R mrg5L" >Submit</button>
						</div>
                    </div>
                </div>  
                </form>              
            </div>
        </section>       