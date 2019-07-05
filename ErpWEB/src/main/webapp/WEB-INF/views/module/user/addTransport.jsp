
     <!-- Content Header (Page header) -->
                      <!--Form and Application Button-->
        <section class="content" ng-init="getLastId()" ng-show="transport">
            <div class="row">
                <div class="col-md-12">
                <form ng-submit="addTransport()" class="col-md-12"  name="form" novalidate>
                    <div class="box box-primary">
                        <div class="box-header with-border">
                            <h3 class="box-title">Add Transport Details</h3>
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
										<label for="af1">Transport Code</label>
										<input type="text"  class="form-control" id="transportCode" readonly="" ng-model="transport.transportCode" name="transportCode"  placeholder="">
									</div>									
								</div>
								
								<div class="col-md-6">									
									<div class="form-group">

										<label for="af1">Transport No.</label>
										<input type="text"  class="form-control" ng-model="transport.transportNo" name="transportNo" placeholder="Transport No">
										<label for="af1">Destination</label>
										<input type="text"  class="form-control" ng-model="transport.destination" name="destination" placeholder="Destination">
									</div>									
								</div>
								
								
								<div class="col-md-6">
								<div class="form-group">
									<label for="af2">Transport Name </label> 
			                            <input  ng-pattern="[a-zA-Z]+" type="text" class="form-control" id="transport_Name"  name="transport_Name" required  ng-model="transport.transport_Name" placeholder="Transport Name" /> 									
										<span style="color:red" ng-show="form.transport_Name.$error.required 
                    && form.transportName.$dirty">Name is required</span>
                    <span style="color:red" ng-show="form.transport_Name.$error.valid 
                    && form.transportName.$dirty">Name is invalid</span> 
									
								</div>
								</div>
								
								<div class="col-md-6">
								<div class="form-group">
						<label for="payementRecievedDate">Capacity (Ton)</label> 
										<input type="number" class="form-control" id="capacity"  name="capacity"  required ng-model="transport.capacity" placeholder="capacity" />

									<label for="payementRecievedDate">Truck No.</label> 
										<input type="text" class="form-control" id="truckNo"  name="truckNo"  required ng-model="transport.truckNo" placeholder="Truck No" />
									<span style="color:red" ng-show="form.capacity.$error.required 
                    && form.capacity.$dirty">Truck No required</span>
								</div>
								</div>
								
								<div class="col-md-6">
								<div class="form-group">
									<label for="payementRecievedDate">Bill No.</label> 
										<input type="text" class="form-control" id="billNo"  name="billNo"  required ng-model="transport.billNo" placeholder="Bill No" />
									<span style="color:red" ng-show="form.capacity.$error.required 
                    && form.capacity.$dirty">Bill No required</span>
								</div>
								</div>
								
								<div class="col-md-6">
								<div class="form-group">
									<label for="payementRecievedDate">Distance</label> 
										<input type="text" class="form-control" id="distance"  name="distance"  required ng-model="transport.distance" placeholder="Distance" />
									<span style="color:red" ng-show="form.capacity.$error.required 
                    && form.capacity.$dirty">Distance required</span>
								</div>
								</div>
								
								<div class="col-md-6">
								<div class="form-group">
									<label for="payementRecievedDate">Rate</label> 
										<input type="text" class="form-control" id="rate"  name="rate"  required ng-model="transport.rate" placeholder="Rate" />
									<span style="color:red" ng-show="form.capacity.$error.required 
                    && form.capacity.$dirty">Rate required</span>
								</div>
								</div>
								  									
								
                            </div>
                        </div>
						<div class="box-footer" align="right">
							<button type="submit" ng-disabled="!form.$valid"  class="btn btn-primary pad40L pad40R mrg5L" >Save</button>
						</div>
                    </div>
                </div>  
                </form>              
            </div>
        </section>       