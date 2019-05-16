
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
<!-- 												<th>Total Qty </th> -->
<!-- 												<th>Supply Qty </th> -->
<!-- 												<th>Balance Qty </th> -->
												<th>View Item details</th>
												  <th>View Supply details </th>
									
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
												
<!-- 											    <td>0</td> -->
<!-- 											      <td>0 </td> -->
<!-- 											    <td>0</td> -->
											    		<td>
												
												<a   ng-click="viewItemDetailsProject(datas.project_code,datas.projectname,datas.loa_no)"   style="cursor: pointer"  > <b>View item details</b></a>
												
												</td>
											           		<td>
												
												<a   ng-click="viewItemDetailsProject()"    ><b> View item details</b></a>
												
												</td>
						
												
										
								
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
                       
                             <h3 class="box-title">Location : <b>{{projectlocation}}</b> </h3> &nbsp;&nbsp;  <h3 class="box-title">LOA No :  <b>{{loano}} </b></h3>
                 
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
							<table  ng-table="itemData" class="data-table table table-bordered table-striped table-responsive">
										<thead>
											<tr>
											   <th>SL No.</th>
											    <th>Item codes</th>
											    <th>Description</th>
											    <th>Sch Qty</th>
											    <th>EI work QTY</th>
											    <th>Total Sch Qty  </th>
											    <th>Supply Qty  </th>
											    <th>Balance Qty  </th>
											    <th>View and update supply qty </th>
											    <th>Status </th>
											    <th>Actions</th>
											
										
											</tr>
										</thead>
										<tbody>
												<tr ng-repeat="datas in $data | filter : keyword">
												
												<td>
												
												{{ $index + 1 }}
												
												</td>
												    <td >
							                     
							                    {{datas.itemcode}}
							                      
									                </td> 
									                
												<td> <textarea cols="14" rows="2">{{datas.desciption}}</textarea></td>
												<td>   {{datas.qty}}</td>
												<td>  0 &nbsp; <b> <a   ng-click="viewEiWorkQty(datas.itemcode,datas.projectcode)"  style="cursor: pointer">View Details</a> </b></td>
											<td>   {{datas.totalqty}}</td>
											<td>   {{datas.supplyqty}}</td>
										    <td>   {{datas.balanceqty}}</td>
										    <td>  <a    ng-click="viewItemDetailsProject(datas.project_code,datas.projectname,datas.loa_no)"   style="cursor: pointer"  > <b>View and Update</b></a>   </td>
									
										    <td style="color:red"><b>Pending</b></td>
			
												<td class="action" width="1">
<!-- 											<i class="fa fa-eye text-primary" aria-hidden="true"></i> -->
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
				
<div id="eiworkqty" class="modal fade">
    <div class="modal-dialog" style="max-width: 70%"  role="document">
        <div class="modal-content" style="width: 915px;height:100px">
            <div class="modal-header" style="background-color: #bfa8a3">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                <h4 class="modal-title">EI work details of ItemCode : <b> {{itemcode}} </b></h4>
            </div>
            <div class="modal-body" style="background-color: white">
			
             					 <section class="content" ng-show="pi">
            <div class="row">
                <div class="col-md-12">
                  
                        <!-- /.box-header -->
                        <div class="box-body">
                            <div class="row">
								
								
								             <input type="text" class="pull-right" placeholder=" search.." ng-model = "keyword">
							<table  ng-table="itemData2" class="data-table table table-bordered table-striped table-responsive">
										<thead>
											<tr>
											   <th>SL No.</th>
											    <th>Ei Works details</th>
											    <th>Qty</th>
										
											
										
											</tr>
										</thead>
										<tbody>
												<tr ng-repeat="datas in $data | filter : keyword">
												
												<td>
												
												{{ $index + 1 }}
												
												</td>
												    <td >
							                     
							                    {{datas.eiWorks}}
							                      
									                </td> 
									                
									                <td>
									               {{datas.quantity}}
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

            </div>
        </div>
    </div>
</div>
				