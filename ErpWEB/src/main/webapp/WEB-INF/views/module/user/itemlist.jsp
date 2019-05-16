
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
 <section class="content" ng-show="itemlistshow">
            <div class="row">
                <div class="col-md-12">
                    <div class="box box-primary">
                        <div class="box-header with-border">
                            <h3 class="box-title">Item List / Report</h3>
                            <div class="box-tools pull-right">
                
                                
                          
								<button type="button"  ng-click="itemaddload()" class="btn btn-box-tool" data-widget="add">
									<i class="fa fa-plus"></i> ADD Item
								</button>
                            </div>
                        </div>
                        <!-- /.box-header -->
                        <div class="box-body">
                            <div class="row">
                            <input type="text" class="pull-right" placeholder=" search.." ng-model = "keyword">
								<div class="col-md-12">									
									<table ng-table="rowMaterialData" class="data-table table table-bordered table-striped table-responsive">
										<thead>
											<tr>
												
												<th>Raw Material</th>
												<!-- <th>Item Code</th> -->
												<!-- <th>Item Type</th> -->
												<th>HSN No.</th>
												<th>Description</th>
											<!-- 	<th>Unit</th>
												<th>Quantity</th>
												<th>Rate</th>
												<th>GST</th>
												<th>Total Amount(Rs.)</th> -->
												<th>Date of Entry</th>
											</tr>
										</thead>
										<tbody>
										
										
							<tr ng-repeat="datas in $data | filter : keyword">
							<td title="'Item Name'">{{datas.name}}</td>
							<!-- <td title="'Item Code'">{{datas.itemCode}}</td> -->
							<!-- <td title="'Quantity'">{{datas.qty}}</td> -->
							<td title="'HSN No.'">{{datas.hsno}}</td>
							<td title="'Description'">{{datas.description}}</td>
							<!-- <td title="'Description'">{{datas.descriptionHSNno}}</td> -->
							<!-- <td title="'Unit'">{{datas.unit}}</td>
							<td title="'Quantity'">{{datas.qty}}</td>
							<td title="'Rate'">{{datas.rate}}</td>
							<td title="'GST'">{{datas.gst}}</td>
							<td title="'Total Amount(Rs.)'">{{datas.totalAmount}}</td> -->
							<td title="'Date of Entry'">{{datas.dateOfEntry| date : 'yyyy-MM-dd h:mm a'}}</td>
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
						<!--<div class="box-footer" align="right">
							<button type="submit" class="btn btn-primary pad40L pad40R mrg5L">Submit</button>
						</div>-->
                    </div>
                </div>                
            </div>
        </section>
        
     
        
        
      
      <jsp:include page="/WEB-INF/views/module/user/item.jsp" />  
