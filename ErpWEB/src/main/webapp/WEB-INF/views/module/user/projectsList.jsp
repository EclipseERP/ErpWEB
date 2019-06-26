
 <section class="content" ng-init="projectlistload()">
            <div  class="row">
                <div class="col-md-12">
                    <div class="box box-primary">
                        <div class="box-header with-border">
                            <h3 class="box-title">Turnover list </h3>
                            <h3><button class="btn btn-blue pull-left" style="margin-top:-5px; border-radius : 0;" ng-click="exportProjectList()"><i class="fa fa-plus"></i> Export </button></h3>
                            <div class="box-tools pull-right">
                 
                                   
                                   <!--  <button type="button"  ng-click="projectaddload()" class="btn btn-box-tool" data-widget="add">
									<i class="fa fa-plus"></i> ADD Project
									
								  </button>
                            		-->
                            		
                            		
                            		
                            		
                            		
                            			
								</div>
                            </div>
                        </div>
                        
                        <div class="box-body" ng-init="accountsLoad()">
                            <div class="row">
								<div class="col-md-3">
								    <div class="form-group">
										<label for="af2">Search Turnover</label>
										<select ng-model="data.itemType" id="itemType" class="form-control select2" style="width: 100%;">
											<option value="">Select an search type</option>
											<option value="1"  >Project-wise</option>
											<option value="2"  >State-wise</option>
											<option value="3"  >Year-wise</option>
                                        </select>
									</div>
							   </div>
							   
                        <!-- /.box-header -->
                        <div class="box-body">
                            <div class="row">
								
								
								             <input type="text" class="pull-right" placeholder=" search.." id="search"  ng-keyup="search()" ng-model = "keyword">
							<table  ng-table="projectListTable" class="data-table table table-bordered table-striped table-responsive">
										<thead>
											<tr>
											   <th>SL No.</th>
											    <th>LOA Details</th>
											    <th>Project Code</th>												
												
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
												    
									                <td><a ng-click="getProjectDataByProjectCode(datas.project_code,datas.loa_no,datas.date)" style="cursor:pointer; " ><b> {{datas.loa_no}}</b></a></td>
									               <td >
							                     
							                      {{datas.project_code}}
							                      
									                </td> 
												
												
												<td>{{datas.state}}</td>
												<td>{{datas.date |  date:'dd/MM/yyyy'}} </td>
												
<!-- 											    <td>0</td> -->
<!-- 											      <td>0 </td> -->
<!-- 											    <td>0</td> -->
											    
								
												<td class="action" width="1">
													<i class="fa fa-eye text-primary" aria-hidden="true"><a href="#payments/{{datas.id}}">View Payments</a></a></i>		
													<i class="fa fa-eye text-primary" aria-hidden="true"><a href="#addNewturnover/{{datas.project_code}}">Add Payment</a></a></i>
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
				
<!--  				
				 <section class="content" ng-show="pi">
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
                       <!--  <div class="box-body">
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
											    <th>Payment </th>
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
										    <td>  <a    ng-click="viewsupplydetails(datas.project_code,datas.projectname,datas.loa_no,projectlocation,datas.itemname,datas)"   style="cursor: pointer"  > <b>View</b></a>   </td>
										    <td>  <a    href="#addNewturnover"   style="cursor: pointer"  > <b>View</b></a>   </td>
									
										    <td style="color:red"><b>Pending</b></td>
			
												<td class="action" width="1">
<!-- 											<i class="fa fa-eye text-primary" aria-hidden="true"></i> -->
													<i class="fa fa-pencil-square-o text-success" aria-hidden="true"></i>
													<i class="fa fa-trash-o text-danger" aria-hidden="true"></i>
											<!-- 	</td>
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
                      <!--   <div class="box-body">
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
                        <div class="box-body">
            <div class="box box-primary">
			
					<!-- /.box-header -->
			<!--		<div  class="box-body">
						<div class="row">
							<div class="col-md-6">
								<div class="form-group">
									<label for="af1">SCH Unit Rate </label> <input type="text"
										class="form-control"  id="af1"
										value="{{projectcode}}" placeholder="">
								</div>
							</div>

                     


                       	<div class="col-md-6">
								<div class="form-group">
									<label for="af1">Amount </label> <input type="text"
										class="form-control"  id="af1"
										value="{{projectcode}}" placeholder="">
								</div>
							</div>




                       	<div class="col-md-6">
								<div class="form-group">
									<label for="af1">% Above </label> <input type="text"
										class="form-control"  id="af1"
										value="{{projectcode}}" placeholder="">
								</div>
							</div>
							
							 	<div class="col-md-6">
								<div class="form-group">
									<label for="af1">All inclusive rate </label> <input type="text"
										class="form-control" readonly="readonly" id="af1"
										value="{{projectcode}}" placeholder="">
								</div>
							</div>
							
							
							<div class="col-md-6">
								<div class="form-group">
									<label for="af1">Supplier Name  </label> <input type="text"
										class="form-control"  id="af1"
										value="{{projectcode}}" placeholder="">
								</div>
							</div>
							
							
									<div class="col-md-6">
								<div class="form-group">
									<label for="af1">Supplier Address </label> <input type="text"
										class="form-control"  id="af1"
										value="{{projectcode}}" placeholder="">
								</div>
							</div>
							
									<div class="col-md-6">
								<div class="form-group">
									<label for="af1">Rate </label> <input type="text"
										class="form-control" readonly="readonly" id="af1"
										value="{{projectcode}}" placeholder="">
								</div>
							</div>
							
							
							<div class="col-md-6">
								<div class="form-group">
									<label for="af1">Details of IC </label> <input type="text"
										class="form-control"  id="af1"
										value="{{projectcode}}" placeholder="">
								</div>
							</div>
					


                              <div class="col-md-6">
								<div class="form-group">
									<label for="af1">Date of Supply </label> 
									<input type="text"
										class="form-control"  id="af1"
										value="{{projectcode}}" datetime-picker="yyyy-MM-dd " size="3" ng-model="creation_date" is-open="ctrl.date.eventTimee" /> 									
										<span class="input-group-btn">
										<button type="button" class="btn btn-blue" ng-click="ctrl.date.eventTimee = true"> <i class="fa fa-calendar"></i>
								</div>
							</div>
							
							
							

                              <div class="col-md-6">
								<div class="form-group">
									<label for="af1">Supply qty </label> <input type="text"
										class="form-control"  id="af1"
										value="{{projectcode}}" placeholder="">
								</div>
							</div>
							
							          <div class="col-md-6">
								<div class="form-group">
									<label for="af1">Balance QTY </label> <input type="text"
										class="form-control"  id="af1"
										value="{{projectcode}}" placeholder="">
								</div>
							</div>
							
						  <div class="col-md-6">
								<div class="form-group">
									<label for="af1">Place of Delivery </label> <input type="text"
										class="form-control"  id="af1"
										value="{{projectcode}}" placeholder="">
								</div>
							</div>
							
							
							  <div class="col-md-6">
								<div class="form-group">
									<label for="af1">Way Bill No Date </label> <input type="text"
										class="form-control"  id="af1"
										value="{{projectcode}}" datetime-picker="yyyy-MM-dd " size="3" ng-model="creation_date" is-open="ctrl.date.eventTimen" /> 									
										<span class="input-group-btn">
										<button type="button" class="btn btn-blue" ng-click="ctrl.date.eventTimen = true"> <i class="fa fa-calendar"></i>
								</div>
							</div>
							
							 <div class="col-md-6">
								<div class="form-group">
									<label for="af1">Truck no. </label> <input type="text"
										class="form-control"  id="af1"
										value="{{projectcode}}" placeholder="">
								</div>
							</div>
							
							
							
							<div class="col-md-6">
								<div class="form-group">
									<label for="af1">Transporter </label> <input type="text"
										class="form-control"  id="af1"
										value="{{projectcode}}" placeholder="">
								</div>
							</div>
							
								<div class="col-md-6">
								<div class="form-group">
									<label for="af1">Date of arrival at Rly Store </label> <input type="text"
										class="form-control"  id="afy"
										value="{{projectcode}}" datetime-picker="yyyy-MM-dd " size="3" ng-model="creation_datek" is-open="ctrl.date.eventTimep" /> 									
										<span class="input-group-btn">
										<button type="button" class="btn btn-blue" ng-click="ctrl.date.eventTimep = true"> <i class="fa fa-calendar"></i>
								</div>
							</div>
							
								<div class="col-md-6">
								<div class="form-group">
									<label for="af1">Date of Rly receipt </label> <input type="text"
										class="form-control"  id="afo"
										value="{{projectcode}}" datetime-picker="yyyy-MM-dd " size="3" ng-model="creation_datet" is-open="ctrl.date.eventTimek" /> 									
										<span class="input-group-btn">
										<button type="button" class="btn btn-blue" ng-click="ctrl.date.eventTimek = true"> <i class="fa fa-calendar"></i>
								</div>
							</div>
							
							<div class="col-md-6">
								<div class="form-group">
									<label for="af1">Date of Rly receipt </label> <input type="text"
										class="form-control"  id="afr"
										value="{{projectcode}}" datetime-picker="yyyy-MM-dd " size="3" ng-model="creation_datey" is-open="ctrl.date.eventTimel" /> 									
										<span class="input-group-btn">
										<button type="button" class="btn btn-blue" ng-click="ctrl.date.eventTimel = true"> <i class="fa fa-calendar"></i>
								</div>
							</div>
							
							<div class="col-md-6">
								<div class="form-group">
									<label for="af1">Bill no </label> <input type="text"
										class="form-control"  id="af1"
										value="{{projectcode}}" placeholder="">
								</div>
							</div>
							
							
								<div class="col-md-6">
								<div class="form-group">
									<label for="af1">Date </label> <input type="text"
										class="form-control"  id="afv"
										value="{{projectcode}}" datetime-picker="yyyy-MM-dd " size="3" ng-model="creation_date" is-open="ctrl.date.eventTimeh" /> 									
										<span class="input-group-btn">
										<button type="button" class="btn btn-blue" ng-click="ctrl.date.eventTimeh = true"> <i class="fa fa-calendar"></i>
								</div>
							</div>
							
							
								<div class="col-md-6">
								<div class="form-group">
									<label for="af1">Bill QTY </label> <input type="text"
										class="form-control"  id="af1"
										value="{{projectcode}}" placeholder="">
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

				</div>
				</div>
				</div>
				</div>
			

            </div>
        </div>
    </div>
    -->
    <!--  
    	 <div ng-show="showProjectDetailslistByLoaNO">
    	 <jsp:include page="/WEB-INF/views/module/user/loalist.jsp" />
	    </div> 
	-->    
	   <!--   
	     <div ng-show="showSupplyDetailslistByItemcode">
    	 <jsp:include page="/WEB-INF/views/module/user/supplydetails.jsp" />
	    </div>   
    -->
    
				


























<%-- 
 <section class="content" ng-show="projectlistshow">
         
                <div class="col-md-12">
                    <div class="box box-primary">
                        <div class="box-header with-border">
                            <h3 class="box-title">Turnover List </h3>
                            <h3><button class="btn btn-blue pull-left" style="margin-top:-5px; border-radius : 0;" ng-click="exportProjectList()"><i class="fa fa-plus"></i> Export </button></h3>
                            <div class="box-tools pull-right">
                 
                   
                                   <button type="button"  ng-click="projectaddload()" class="btn btn-box-tool" data-widget="add">
								   <i class="fa fa-plus"></i> ADD Turnover Details
									
								   </button>
                            			
						
					
								
								</div>
                            </div>
                        </div>
                        <div class="box-body">
                            <div class="row">
								<div class="col-md-3">
								    <div class="form-group">
										<label for="af2">Search Turnover</label>
										<select ng-model="data.itemType" class="form-control select2" style="width: 100%;">
											<option value="1" ng-click="projectWiseload()" >Project-wise</option>
											<option value="2" ng-click="stateWiseload()" >State-wise</option>
											<option value="3" ng-click="yearWiseload()" >Year-wise</option>
                                        </select>
									</div>
							   </div>
							<table  ng-table="projectListTable" class="data-table table table-bordered table-striped table-responsive">
										<thead>
											<tr>
												<th>Cont No.</th>
												<th>BIll No.</th>
												<th>Bill Passed Date</th>
												<th>Payment Received Date</th>
												<th>Gross Amount Including GST</th>
												<th>Gross Amount Excluding GST</th>
												<th>Retention Deducted</th><!-- 
												<th>Retention Released</th> -->
												<!-- <th>Bills Payable</th> -->
												<th>S.D Deducted</th>
												<th>S.D. Released</th>
												<th>Income Tax</th>
											<!-- 	<th>Surcharge</th> -->
												<th>SGST TDS</th>
												<th>CGST TDS</th>
												<th>Misc Charge</th>
												<th>Misc Charge Release</th>
												<th>SGST @6%</th>
												<th>CGST @ 6%</th>
										
											</tr>
										</thead>
									<tbody>
									
									<tr>
												<td>Janai Road</td>
												<td>3RD</td>
												<td>18.12.2018</td>
												<td>20.11.2018</td>
												<td>12059280</td>
												<td>10767214</td>
												<td>1205928</td><!-- 
												<td>1205928</td> -->
												<td>12059280</td>
												<td>215344</td>
												<td>107672</td>
												<td>107672</td>
												<td>136578</td>
												<td>1</td>
												<td>646033</td>
												<td>646033</td>
												<td>9216735</td>
												<td class="action" width="1">
													<i class="fa fa-eye text-primary" aria-hidden="true"></i>
													<i class="fa fa-pencil-square-o text-success" aria-hidden="true"></i>
													<i class="fa fa-trash-o text-danger" aria-hidden="true"></i>
												</td>
											</tr>
											
											
											
											
											<tr>
												<td>Naihati Ranaghat</td>
												<td>2ND</td>
												<td>09.03.2019</td>
												<td>12.03.2019</td>
												<td>51778202</td>
												<td>46230538</td>
												<td>5177820</td><!-- 
												<td></td> -->
												<td></td>
												<td>46600382</td>
												<td>5177820</td>
												<td>107672</td>
												<td></td>
												<td>924610</td>
												<td>462306</td>
												<td>462306</td>
												<td>2773832</td>
												<td class="action" width="1">
													<i class="fa fa-eye text-primary" aria-hidden="true"></i>
													<i class="fa fa-pencil-square-o text-success" aria-hidden="true"></i>
													<i class="fa fa-trash-o text-danger" aria-hidden="true"></i>
												</td>
											</tr>
											
											
											
											<tr>
												<td>Kahalgaon</td>
												<td>6TH</td>
												<td>24.03.2019</td>
												<td></td>
												<td></td>
												<td>46230538</td>
												<td>5177820</td><!-- 
												<td></td> -->
												<td></td>
												<td>46600382</td>
												<td>5177820</td>
												<td>107672</td>
												<td></td>
												<td>924610</td>
												<td>462306</td>
												<td>462306</td>
												<td>2773832</td>
												<td class="action" width="1">
													<i class="fa fa-eye text-primary" aria-hidden="true"></i>
													<i class="fa fa-pencil-square-o text-success" aria-hidden="true"></i>
													<i class="fa fa-trash-o text-danger" aria-hidden="true"></i>
												</td>
											</tr>
											
											
											<tr>
												<td>Ballygunge Sonarpur</td>
												<td>5TH</td>
												<td></td>
												<td>05.10.2018</td>
												<td>9130190</td>
												<td>8151955</td>
												<td>913019</td><!-- 
												<td></td> -->
												<td>8217171</td>
												<td>913019</td>
												<td></td>
												<td>163019</td>
												<td></td>
												<td>81520</td>
												<td>81520</td>
												<td>49117</td>
												<td>489117</td>
												<td class="action" width="1">
													<i class="fa fa-eye text-primary" aria-hidden="true"></i>
													<i class="fa fa-pencil-square-o text-success" aria-hidden="true"></i>
													<i class="fa fa-trash-o text-danger" aria-hidden="true"></i>
												</td>
											</tr>
											
											
											
											
											
											<tr>
												<td>Bandel EI</td>
												<td>2ND</td>
												<td></td>
												<td>16.01.2019</td>
												<td>15221948</td>
												<td>13591025</td>
												<td>1522195</td><!-- 
												<td></td> -->
												<td>13699753</td>
												<td>1522195</td>
												<td></td>
												<td>271821</td>
												<td></td>
												<td>135911</td>
												<td>135911</td>
												<td>815642</td>
												<td>815642</td>
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
				
				<jsp:include page="/WEB-INF/views/module/user/Accounts.jsp" />
				

				


















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
 <section class="content" ng-show="turnoverListshow">
            <div class="row">
                <div class="col-md-12">
                    <div class="box box-primary">
                        <div class="box-header with-border">
                            <h3 class="box-title">Turnover List</h3>
                            <div class="box-tools pull-right">
                                <button type="button"  ng-click="itemaddload()" class="btn btn-box-tool" data-widget="add">
									<i class="fa fa-plus"></i> ADD Item
								</button>
                            </div>
                        </div>
                        <!-- /.box-header -->
                        <div class="box-body">
                            <div class="row">
								<div class="col-md-12">									
									<table id="dataTableID" ng-table="rowMaterialData" class="data-table table table-bordered table-striped table-responsive">
										<thead>
											<tr>
												
												<th>Cont No.</th>
												<th>BIll No.</th>
												<th>Bill Passed Date</th>
												<th>Payment Received Date</th>
												<th>Gross Amount Including GST</th>
												<th>Gross Amount Excluding GST</th>
												<th>Retention Deducted</th>
												<th>Retention Released</th>
												<th>Bills Payable</th>
												<th>S.D Deducted</th>
												<th>S.D. Released</th>
												<th>Income Tax</th>
												<th>Surcharge</th>
												<th>SGST TDS</th>
												<th>CGST TDS</th>
												<th>Misc Charge</th>
												<th>Misc Charge Release</th>
												<th>SGST @6%</th>
												<th>CGST @ 6%</th>
											</tr>
										</thead>
										<tbody>
							<tr ng-repeat="datas in $data | filter : keyword">
							<td title="'Cont No.'">{{datas.name}}</td>
							<td title="'BIll No.'">{{datas.descriptionHSNno}}</td>
							<td title="'Bill Passed Date'">{{datas.unit}}</td>
							<td title="'Gross Amount Including GST'">{{datas.qty}}</td>
							<td title="'Gross Amount Excluding GST'">{{datas.rate}}</td>
							<td title="'Retention Deducted'">{{datas.gst}}</td>
							<td title="'Retention Released'">{{datas.name}}</td>
							<td title="'Bills Payable">{{datas.descriptionHSNno}}</td>
							<td title="'S.D Deducted'">{{datas.unit}}</td>
							<td title="'S.D. Released'">{{datas.qty}}</td>
							<td title="'Surcharge'">{{datas.rate}}</td>
							<td title="'SGST TDS'">{{datas.gst}}</td>
							<td title="'CGST TDS'">{{datas.name}}</td>
							<td title="'Misc Charge">{{datas.descriptionHSNno}}</td>
							<td title="'Misc Charge Release'">{{datas.unit}}</td>
							<td title="'SGST @6%'">{{datas.qty}}</td>
							<td title="'CGST @ 6%'">{{datas.rate}}</td>
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
            </div>
        </section>
        
     
        
        
      
      <jsp:include page="/WEB-INF/views/module/user/Accounts.jsp" />   --%>