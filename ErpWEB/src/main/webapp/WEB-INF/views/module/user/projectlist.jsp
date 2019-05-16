
 <section class="content" ng-show="projectlistshow">
            <div class="row">
                <div class="col-md-12">
                    <div class="box box-primary">
                        <div class="box-header with-border">
                            <h3 class="box-title">Project list </h3>
                            <div class="box-tools pull-right">
                 
                   
                                   <button type="button"  ng-click="projectaddload()" class="btn btn-box-tool" data-widget="add">
									<i class="fa fa-plus"></i> ADD Project
									
								  </button>
                            			
						
					
								
								</div>
                            </div>
                        </div>
                        <!-- /.box-header -->
                        <div class="box-body">
                            <div class="row">
								
								
								             <input type="text" class="pull-right" placeholder=" search.." ng-model = "keyword">
							<table  ng-table="projectListTable" class="data-table table table-bordered table-striped table-responsive">
										<thead>
											<tr>
											   <th>SL No.</th>
											   <th>Project Location</th>
											    <th>Project Code</th>												
												<th>LOA Details</th>
												<th>Sate</th>
												<th>Date of Apply </th>
												<th>Total Qty </th>
												<th>Supply Qty </th>
												<th>Balance Qty </th>
												<th>View Item details</th>
												  <th>View Supply details </th>
												  <th>Status</th>
												<th>Action</th>
										
											</tr>
										</thead>
										<tbody>
												<tr ng-repeat="datas in $data | filter : keyword">
												
												<td>
												
												{{ $index + 1 }}
												
												</td>
												    <td >
							                     
							                     <b>  {{datas.projectname}}</b>
							                      
									                </td> 
									                
									               <td >
							                     
							                      {{datas.project_code}}
							                      
									                </td> 
												<td> {{datas.loa_no}}</td>
												
												<td> West Bengal</td>
												<td>{{datas.date}} </td>
												
											    <td>0</td>
											      <td>0 </td>
											    <td>0</td>
											    		<td>
												
												<a   ng-click="viewItemDetailsProject()"    > View item details</a>
												
												</td>
											           		<td>
												
												<a   ng-click="viewItemDetailsProject()"    > View item details</a>
												
												</td>
											    <td style="color:red"><b>Pending</b></td>
												
										
								
												<td class="action" width="1">
<!-- 													<i class="fa fa-eye text-primary" aria-hidden="true"></i> -->
													<i class="fa fa-pencil-square-o text-success" aria-hidden="true"></i>
													<i class="fa fa-trash-o text-danger" aria-hidden="true"></i>
												</td>
											</tr>
								
											
										</tbody>
										
							
										
									</table>
									
									
									

				</div>
				</div>
				</div>
				</div>
				</div>
				</section>
				
				
				 <section class="content" ng-show="pi">
            <div class="row">
                <div class="col-md-12">
                    <div class="box box-primary">
                        <div class="box-header with-border">
                            <h3 class="box-title">Item list </h3>
                            <div class="box-tools pull-right">
                 
                   
                               	<button type="button" ng-click="projectlistload()"
								class="btn btn-box-tool" data-widget="back">
								<i class="fa fa-reply"> </i> Back
						     	</button>
                            			
						
					
								
								</div>
                            </div>
                        </div>
                        <!-- /.box-header -->
                        <div class="box-body">
                            <div class="row">
								
								
								             <input type="text" class="pull-right" placeholder=" search.." ng-model = "keyword">
							<table  ng-table="projectListTable" class="data-table table table-bordered table-striped table-responsive">
										<thead>
											<tr>
											   <th>SL No.</th>
											   <th>Item code</th>
											    <th>Item name</th>
											    <th>Description</th>
											    <th>Qty</th>
											
											      <th>Actions</th>
											
										
											</tr>
										</thead>
										<tbody>
												<tr ng-repeat="datas in $data | filter : keyword">
												
												<td>
												
												{{ $index + 1 }}
												
												</td>
												    <td >
							                     
							                    itemcode
							                      
									                </td> 
									                
									               <td >
							                     
							                     itemname
							                      
									                </td> 
												<td> description</td>
												
											<td> qty</td>
												
							
										
								
												<td class="action" width="1">
<!-- 													<i class="fa fa-eye text-primary" aria-hidden="true"></i> -->
													<i class="fa fa-pencil-square-o text-success" aria-hidden="true"></i>
													<i class="fa fa-trash-o text-danger" aria-hidden="true"></i>
												</td>
											</tr>
								
											
										</tbody>
										
							
										
									</table>

				</div>
				</div>
				</div>
				</div>
				</div>
				</section>
				
				
				
				<jsp:include page="/WEB-INF/views/module/user/projectadd.jsp" />
				

				