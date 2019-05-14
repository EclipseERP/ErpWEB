
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
							<td title="'Description'">{{datas.descriptionHSNno}}</td>
							<td title="'Unit'">{{datas.unit}}</td>
							<td title="'Quantity'">{{datas.qty}}</td>
							<td title="'Rate'">{{datas.rate}}</td>
							<td title="'GST'">{{datas.gst}}</td>
							
							<td title="'Total Amount(Rs.)'">{{datas.totalAmount}}</td>
							<td title="'dateofentry'">{{datas.dateOfEntry| date : 'yyyy-MM-dd h:mm a'}}</td>
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
        
     
        
        
      
      <jsp:include page="/WEB-INF/views/module/user/item.jsp" />  