
 <section class="content" >
            <div  class="row" ng-init="projectlistload()">
                <div class="col-md-12">
                    <div class="box box-primary">
                        <div class="box-header with-border">
                            <h3 class="box-title">Project list </h3>
                            <h3><button class="btn btn-blue pull-left" style="margin-top:-5px; border-radius : 0;" ng-click="exportProjectList()"><i class="fa fa-plus"></i> Export </button></h3>
                            <div class="box-tools pull-right">
                 
                                   
                                   <button type="button"   class="btn btn-box-tool" data-widget="add">
									<i class="fa fa-plus"></i><a href="#projectload">ADD Project</a> 
									
								  </button>
								  
								  <button type="button"   class="btn btn-box-tool" data-widget="add">
									<i class="fa fa-plus"></i><a href="#uploadDocument">Upload Document</a> 
									
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
											    <th>LOA Details</th>
											    <th>Project Code</th>												
												
												<th>Sate</th>
												<th>Date of Supply </th>
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
												    
									                <td><a  href="#projects/{{datas.project_code}}" style="cursor:pointer; " ><b> {{datas.loa_no}}</b></a></td>
									               <td >
							                     
							                      {{datas.project_code}}
							                      
									                </td> 
												
												
												<td> {{datas.state}}</td>
												<td>{{datas.date |  date:'dd/MM/yyyy' }} </td>
												
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
				
				
	<!-- 			 <section class="content" ng-show="pi">
				 
             <div class="row">
                <div class="col-md-12">
                    <div class="box box-primary">
                        <div class="box-header with-border">
                       
                         <h3 class="box-title">LOA No :  <b>{{loano}} </b></h3>   &nbsp;&nbsp;    <h3 class="box-title">Location : <b>{{projectlocation}}</b> </h3> &nbsp;&nbsp;  <h3 class="box-title">Project Date : <b>{{projectdate}}</b> </h3>
                 
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
                  <!--        <div class="box-body">
                            <div class="row">
								
								<a class="btn btn-primary pad40L pad40R mrg5L" data-toggle="tooltip" title="Add Items to LOA No : {{loano}} " >Add Items</a>
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
 											<i class="fa fa-eye text-primary" aria-hidden="true"></i> 
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
				
		-->		
				
			
<!--  				
<div id="eiworkqty" class="modal fade">
    <div class="modal-dialog" style="max-width: 70%"  role="document">
        <div class="modal-content" style="width: 915px;height:100px">
            <div class="modal-header" style="background-color: #bfa8a3">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                <h4 class="modal-title">EI work details of ItemCode : <b> {{itemcode}} </b> &nbsp;&nbsp; Item name : <b> {{itemname}} </b>  </h4>
            </div>
            <div class="modal-body" style="background-color: white">
			
             					 <section class="content" ng-show="pi">
            <div class="row">
                <div class="col-md-12">
                  
                        <!-- /.box-header -->
                    <!--      <div class="box-body">
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
-->    
   <!--   
    <div id="supplydetailsupdate" class="modal fade">
    <div class="modal-dialog" style="max-width: 70%"  role="document">
        <div class="modal-content" style="width: 915px;height:100px">
            <div class="modal-header" style="background-color: #bfa8a3">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                <h4 class="modal-title">Supply Details of ItemCode : <b> {{itemcode}} </b>  &nbsp;&nbsp; Item name : <b> {{itemname}} </b>  </h4> 
            </div>
            <div class="modal-body" style="background-color: white">
			
             					 
            <div class="row">
                <div class="col-md-12">
                  
                        <!-- /.box-header -->
<!--                          <div class="box-body">
            <div class="box box-primary">
		-->	
		
	    
	     <!--  <div ng-show="showSupplyDetailslistByItemcode">
    	 <jsp:include page="/WEB-INF/views/module/user/supplydetails.jsp" />
	    </div> -->  
    
    

	
	
				