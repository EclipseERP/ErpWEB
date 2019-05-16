
 <section class="content" ng-show="projectlistshow">
         
                <div class="col-md-12">
                    <div class="box box-primary">
                        <div class="box-header with-border">
                            <h3 class="box-title">Turnover List </h3>
                            <h3><button class="btn btn-blue pull-left" style="margin-top:-5px; border-radius : 0;" ng-click="exportTurnoverList()"><i class="fa fa-plus"></i> Export </button></h3>
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
											<option value="1">Project-wise</option>
											<option value="2">State-wise</option>
											<option value="3">Year-wise</option>
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
												<th>Retention Deducted</th>
												<th>Retention Released</th>
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
												<td>1205928</td>
												<td>1205928</td>
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
												<td>5177820</td>
												<td></td>
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
												<td>5177820</td>
												<td></td>
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
												<td>913019</td>
												<td></td>
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
												<td>1522195</td>
												<td></td>
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
    <style>

    .search-table{table-layout: auto; margin:40px auto 0px auto; }
    .search-table, td, th {
        border-collapse: collapse;
    }
      th{padding:20px 7px; font-size:15px; color:#444;}
      td{padding:5px 10px; height:35px;}
      .search-table-outter { overflow-x: auto; }
      th, td { min-width: 200px; }

    </style>
									
				</div>
				</div>
				</div>
				</div>
				</div>
				</section>
				
				<jsp:include page="/WEB-INF/views/module/user/Accounts.jsp" />
				

				

















<%-- 
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