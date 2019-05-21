<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<section class="content" >
            <div class="row">
                <div class="col-md-12">
                    <div class="box box-primary">
                        <div class="box-header with-border">
                           <h3 class="box-title">LOA No :  <b>{{loano}}  </b> &nbsp; Date :  <b>{{projectdate}}  </b> </h3>
                            <div class="box-tools pull-right">
                 
                            			
							   <button type="button" ng-click="projectlistload()"
								class="btn btn-box-tool" data-widget="back">
								 Back
						     	</button>
						     	
								
								</div>
                            </div>
                        </div>
                        <!-- /.box-header -->
                        <div class="box-body">
                            <div class="row">
							
								
								             <input type="text" class="pull-right" placeholder=" search.." ng-model = "keyword">
							<table  ng-table="projectListTableByProjectcode" class="data-table table table-bordered table-striped table-responsive">
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
												
												  
									
												<th>Action</th>
										
											</tr>
										</thead>
										<tbody>
												<tr ng-repeat="datas in $data | filter : keyword">

												<td>
												
												{{ $index + 1 }}
												
												</td>
												    <td >
							                     
							                      <a ng-click="viewItemDetailsProject(datas.project_code,datas.projectname,datas.loa_no)" style="cursor:pointer; " > <b>{{datas.projectname}} </b></a>
							                      
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
