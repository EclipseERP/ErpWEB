
 <section class="content" ng-show="pi">
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
												<th>View full details</th>
												<th>Action</th>
										
											</tr>
										</thead>
										<tbody>
												<tr ng-repeat="datas in $data | filter : keyword">
												
												<td>
												
												{{ $index + 1 }}
												
												</td>
												    <td >
							                     
							                       {{datas.projectname}}
							                      
									                </td> 
									                
									               <td >
							                     
							                      {{datas.project_code}}
							                      
									                </td> 
												<td> {{datas.loa_no}}</td>
												
												<td> West Bengal</td>
												<td>{{datas.date}} </td>
												<td>
												
												<a id="viewProjectItem"  class="btn btn-primary pad40L pad40R mrg5L"  > View Details</a>
												
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
				
				<jsp:include page="/WEB-INF/views/module/user/projectadd.jsp" />
				

				