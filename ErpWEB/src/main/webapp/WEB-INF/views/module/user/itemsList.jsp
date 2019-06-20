
<script>
$(function () {
	// For Datatable
	$(document).ready(function() {
		"use strict";
		var table = $('#dataTableID').DataTable( {
			"order": [[ 0, "desc" ]],
			responsive: true,
			"pagingType": "full_numbers",
			"lengthMenu": [[10, 20, 40, -1], [10, 20, 40, "All"]]
		});
	});
});
</script>
	 <section class="content" ng-init="viewItemDetailsProject(project_code,locationId)">
				 
            <div class="row">
                <div class="col-md-12">
                    <div class="box box-primary">
                        <div class="box-header with-border">
                       
                         <h3 class="box-title">LOA No :  <b>{{loano}} </b></h3>   &nbsp;&nbsp;    <h3 class="box-title">Location : <b>{{locationId}}</b> </h3> &nbsp;&nbsp;  <h3 class="box-title">Project Date : <b>{{projectdate}}</b> </h3>
                 
                            <div class="box-tools pull-right">
                 
                   
                               	<button type="button" ng-click="projectlistload()"
								class="btn btn-box-tool" data-widget="back">
								 LOA List
						     	</button>
                            	|	
                            	<a 	class="btn btn-box-tool" ng-click="getProjectDataByProjectCode(projectcode,loano,projectdate)" >  Back</a>		
						
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
											       <th>Item Name</th>
											    <th>Description</th>
											      <th>Unit</th>
											    <th>Sch Qty</th>
											    <th>EI work QTY</th>
											    <th>Total Sch Qty  </th>
											    <th>Supply Qty  </th>
											    <th>Balance Qty  </th>
											    <th>Supply Details </th>
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
									                
									              <td >
							                     
							                    {{datas.itemname}}
							                      
									             </td> 
									                
												<td> <textarea cols="10" rows="4">{{datas.desciption}}</textarea></td>
												<td>  <b> {{datas.unit}} </b></td>
												<td>  <b> {{datas.qty}} </b></td>
												<td>  {{datas.eiQuantity }} <br/>  <b><a   ng-click="viewEiWorkQty(datas.itemcode,datas.projectcode,datas.itemname)"  style="cursor: pointer">View Details</a> </b></td>
											<td>   {{datas.totalqty}}</td>
											<td>   {{datas.supplyqty}}</td>
										    <td>   {{datas.balanceqty}}</td>
										    <td>  <a ng-click="viewsupplydetails(datas.project_code,datas.projectname,datas.loa_no,projectlocation,datas.itemname,datas)"   style="cursor: pointer"  > <b>View</b></a>   </td>
									
										    <td>
										    
							              <span ng-if="datas.status == 'Pending'" style="color:red"> <b> Pending </b></span>
							              <span ng-if="datas.status == 'Paid'" style="color:green"><b > Paid </b> </span>
										    
										    
										  </td>
			
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
				
				
			    
