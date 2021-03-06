
<!-- Content Header (Page header) -->
<!--Form and Application Button-->
<section class="content"  ng-init="projectaddload()">
	<div class="row">
		<div class="col-md-12">
			<form ng-submit="projectAdd(p)" class="col-md-12" name="ProjectForm">
				<div class="box box-primary" id="projectAdd" >
					<div class="box-header with-border">
						<h3 class="box-title">Project Details Form</h3>
						<div class="box-tools pull-right">
							<button type="button" ng-click="projectlistload()"
								class="btn btn-box-tool" data-widget="back">
								<i class="fa fa-reply"> </i> Back
							</button>
						</div>
					</div>
					<!-- /.box-header -->
					<div  class="box-body">
						<div class="row">
							<div class="col-md-6">
								<div class="form-group">
									<label for="af1">Project Code </label> <input type="text"
										class="form-control" ng-model="p.project_code" readonly="readonly" id="af1"
										 placeholder="">
								</div>
							</div>

                     


                         	<div class="col-md-6">
								<div class="form-group">
									<label for="af2">Date </label> 
			                            <input type="text" class="form-control" id="tendardate" readonly="readonly" placeholder="Project Date" datetime-picker="yyyy-MM-dd " size="3" ng-model="p.creation_date" is-open="ctrl.date.eventTime" /> 									
										<span class="input-group-btn">
										<button type="button" class="btn btn-blue" ng-click="ctrl.date.eventTime = true"> <i class="fa fa-calendar"></i>
									
								</div>
							</div>


                            <div class="col-md-12">
								<div class="form-group">
									<label for="af3">State  </label>
									
									<select class="form-control" ng-model="p.state" id="statewise">
									
									<option value="">---Select state----</option>
									
									<option value="Bihar"> Bihar  </option>
									<option value="Jharkhand"> Jharkhand  </option>
								    <option value="West Bengal"> West Bengal  </option>
									
									</select>
									
									 
								</div>
							</div>


							<div class="col-md-12">
								<div class="form-group">
									<label for="af3">LOA Details  </label> <input type="text"
										class="form-control" ng-model="p.loano" id="af3"
										placeholder="">
								</div>
							</div>

							<div class="col-md-12">
								<a id="locationadd" class="btn btn-primary pad40L pad40R mrg5L">
									Add Project Location</a> <br /> <br />

								<div id="locationfield" class="form-group">

							   <!-- <input type="text" class="form-control" ng-model="p.projectName" id="af3" placeholder="Add Location"> -->

								</div>
							</div>
							
							
						    <div class="col-md-12">
								<a id="eiworkadd" class="btn btn-primary pad40L pad40R mrg5L">
									Add EI Work</a> <br /> <br />
								<div id="eiwork" class="form-group"></div>
								<hr style="color: red" />

							</div>


							<div class="col-md-12">
								<div class="form-group">
									<label for="af4">Details </label>


									<textarea class="form-control" cols="12" id="af4" rows="5"
										required="required"></textarea>



								</div>
							</div>

							<div class="col-md-12">
								<div class="form-group" align="right">

									<a class="btn btn-primary pad40L pad40R mrg5L"
										ng-click="projectSecondPartshow()"> Save and Continue</a>



								</div>
							</div>


						</div>
					</div>
				</div>
				<div ng-show="projectaddSecondPartView">

					<div class="box-footer">

						<div class="col-md-12">
							<div class="form-group">
								<label for="af3">Project Code : </label> <b>{{projectcode}}</b>
							</div>
						</div>

						<div class="col-md-12">
							<div class="form-group">

								<label for="af3">Project Locations : </label> 
								<b>{{projectname}}
								</b>
							</div>
						</div>
						

							<div class="col-md-12">
							<div class="form-group">
								<label for="af3">Date : </label> <b>{{projectdate}}
								</b>

							</div>
						</div>


						<div class="col-md-12">
							<div class="form-group">
								<label for="af3">Loa No : </label> <b>{{details}}</b>
							</div>
						</div>

                    </div>



					

					<div class="box-footer" align="left">
						<a class="btn btn-primary pad40L pad40R mrg5L"
							ng-click="addItemModal()"> Add Item</a>
							
							<a class="btn btn-primary pad40L pad40R mrg5L"
							ng-click="addTransportModal()"> Add Transport</a>

						<div id="ad_cart" class="form-group input-group-sm"
							ng-show="itemShow">
							<div class="col-sm-12 ">

								<table class="table" ng-table="itemMenuTable"
									class="data-table table table-bordered table-striped table-responsive">
									<thead id="materialHead" class="thead-dark" style="width: 100%">
										<tr>

											<th scope="col">Item Code</th>
											<th scope="col">Description</th>
											<th scope="col">INS</th>
											<th scope="col">View full details</th>
											<th scope="col">Remove</th>
										</tr>
									</thead>
									<tbody id="rowgen">

										
										<!-- <tr align="center"
											ng-repeat="datas in $data | filter : keyword">

											<td>Free Style</td>

											<td>

												<div ng-if="datas[3].id==null">
													<input type="text" value="0" /> <input type="hidden"
														name='itemids' value='0' readonly='readonly' />
												</div>

												<div ng-if="datas[3].item_name!=null">
													<input type="text" value=" {{datas[3].item_name}}" /> <input
														type="hidden" name='itemids' value='{{datas[3].id}}'
														readonly='readonly' />
												</div>

											</td>

											<td>

												
												<div ng-if="datas[0].desc==null">
													<input type="text" name='descs' value="0" />
												</div>

												<div ng-if="datas[0].desc!=null">
													<input type="text" name='descs' value=" {{datas[0].desc}}" />
												</div>

											</td>
											<td>


												<div ng-if="datas[2].cat_name==null">
													<input type="text" value="0" /> <input type="hidden"
														name='categoryids' value='0' readonly='readonly' />
												</div>

												<div ng-if="datas[2].cat_name!=null">
													<input type="text" value=" {{datas[2].cat_name}}" /> <input
														type="hidden" name='categoryids' value='{{datas[2].id}}'
														readonly='readonly' />
												</div>

											</td>
											<td><input type="text" name='quantitys'
												value=" {{datas[0].quantity}}" /></td>
											<td><input type="text" name='calcprice'
												onkeyup='totalAdormentCalc()' value=" {{datas[0].price}}" /></td>
											<td><button onclick='deleteCakeRow(this)'>Delete
												</button></td>

										</tr>
-->
									</tbody>
									<tfoot>
										<tr>
											<td colspan="2"><input type="button"
												class="btn btn-blue pull-left" ng-click="closeItemCart()"
												value="close" /></td>
									</tfoot>
								</table>
								<script type="text/javascript">
									
								</script>

							</div>
						</div>

							<div id="ad_cart" class="form-group input-group-sm"
							ng-show="transportShow">
							<div class="col-sm-12 ">

								<table class="table" ng-table="transportMenuTable"
									class="data-table table table-bordered table-striped table-responsive">
									<thead  class="thead-dark" style="width: 100%">
										<tr>
											<th scope="col">Serial No</th>
											<th scope="col">Transport Id</th>
											<th scope="col">Transport No</th>
											
											<th scope="col">Transport Name</th>
											<th scope="col">Capacity</th>
											
											<th scope="col">Remove</th>
										</tr>
									</thead>
									<tbody id="rowgen">

										
										<tr align="center"
											ng-repeat="datas in $data | filter : keyword">

											<td>

												<div>
													{{$index}}
												</div>
											</td>
																									

											<td>

												<div>
													<input type="hidden"  ng-model="p.transports[($index)].id"  /> <input type="hidden"
														name='itemids' value='0' readonly='readonly' />
												</div>

												<div>
													<input type="text"   ng-model="p.transports[($index)].transportCode" class="form-control" readonly  /> 
												</div>

											</td>
											<td>

												<div>
													<input type="text"  ng-model="p.transports[($index)].transportNo" class="form-control" readonly  />
												</div>
											</td>
											
											<td>

												<div>
													<input type="text"  ng-model="p.transports[($index)].transportName" readonly class="form-control" />
												</div>
											</td>
											<td>
												<div>
													<input type="text" ng-model="p.transports[($index)].capacity" readonly class="form-control"  />
												</div>

											</td>
											
											<td><img src="/assets/img/del.png" width="20px" height="20px" onclick="removeItem($index,datas.transportCode)"  style="cursor:pointer" />
												</td>

										</tr>

									</tbody>
									<tfoot>
										<tr>
											<td colspan="2"><input type="button"
												class="btn btn-blue pull-left" ng-click="closeItemCart()"
												value="close" /></td>
									</tfoot>
								</table>
								<script type="text/javascript">
									
								</script>

							</div>
						</div>

						
					</div>




					<div class="box-footer" align="right">
						<button type="button" ng-click="saveProject(p)" id="btprsave" class="btn btn-primary pad40L pad40R mrg5L">Save project</button>
					</div>
				</div>
				
			</form>
		</div>
	</div>

</section>

<div id="itemModal" class="modal fade">
	<div class="modal-dialog" style="max-width: 100%" role="document">
		<div class="modal-content"
			style="width: 920px; height: 600px; left: -108px; position: relative; top: -14px;">
			<div class="modal-header" style="background-color: #bfa8a3">
				<button type="button" class="close" data-dismiss="modal"
					aria-hidden="true">&times;</button>
				<h4 class="modal-title">Items available</h4>
			</div>
			<div class="modal-body" style="background-color: white;">

				<div class="col-md-12">
					<button type="button" class="btn btn-box-tool" data-widget="add">
						<i class="fa fa-plus"></i> Create Item

					</button>
					<input type="text" class="pull-right" placeholder=" search.."
						ng-model="keyword">
					<table ng-table="rowMaterialData"
					
						style="width: 100%;">
						<thead>
							<tr>
								<th>Item Code</th>
								
								<th>Description</th>
								<th>INS</th>
								
								<th>Add to Project/Tender</th>

							</tr>
						</thead>
						<tbody>
						
							<tr ng-repeat="datas in $data | filter : keyword">
								<td>{{datas.itemCode}}</td>
								
								<td><textarea cols="34" rows="1">{{datas.description}}</textarea></td>
								<td><select id="insindex{{$index}} ">

										<option value="">--Select INS Types--</option>
										<option value="Consignee (CONS)">Consignee (CONS)</option>
										<option value="RITES">RITES</option>
										<option value="RDSO">RDSO</option>

								</select></td>
								<td><a class="btn btn-primary pad40L pad40R mrg5L"
									ng-click="addItemToProjectCart(datas,$index )"
									style="cursor: pointer">Add to project</a></td>

							</tr>


						</tbody>
					</table>


				</div>
			</div>
		</div>
	</div>
</div>
<div id="projectModal" class="modal fade">
	<div class="modal-dialog" style="max-width: 100%" role="document">
		<div class="modal-content"
			style="width: 920px; height: 600px; left: -108px; position: relative; top: -14px;">
			<div class="modal-header" style="background-color: #bfa8a3">
				<button type="button" class="close" data-dismiss="modal"
					aria-hidden="true">&times;</button>
				<h4 class="modal-title">Transport available</h4>
			</div>
			<div class="modal-body" style="background-color: white;" ng-init="getAllTransport()">

				<div class="col-md-12">
					<button type="button" class="btn btn-box-tool" data-widget="add">
						<i class="fa fa-plus"></i> Create Transport

					</button>
					<input type="text" class="pull-right" placeholder=" search.."
						ng-model="keyword">
					<table ng-table="transportData"
					
						style="width: 100%;">
						<thead>
							<tr>
								<th>Transport Code</th>
								<th>Transport No</th>
								
								<th>Transport Name</th>
								<th>capacity</th>
								
								<th>Add to Project/Tender</th>

							</tr>
						</thead>
						<tbody>
						
							<tr ng-repeat="datas in $data | filter : keyword">
								<td>{{datas.transportCode}}</td>
								<td>{{datas.transportNo}}</td>
								
								<td><textarea cols="34" rows="1">{{datas.transportName}}</textarea></td>
								<td>{{datas.capacity}}</td>
								<td><button class="btn btn-primary pad40L pad40R mrg5L"
									ng-click="addTransportToProjectCart(datas,$index)"
									style="cursor: pointer">Add to project</button></td>

							</tr>


						</tbody>
					</table>


				</div>
			</div>
		</div>
	</div>
</div>

<script type="text/javascript" src="/js/moduleJs/project_JS_User.js"></script>