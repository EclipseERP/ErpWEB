
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
								<div class="col-md-12">									
									<table id="dataTableID" class="data-table table table-bordered table-striped table-responsive">
										<thead>
											<tr>
												<th width="1">#</th>
												<th>Raw Material</th>
												<th>Description</th>
												<th>Unit</th>
												<th>Quantity</th>
												<th>Rate</th>
												<th>GST</th>
												<th>Total Amount(Rs.)</th>
												<th>Date of Entry</th>
											</tr>
										</thead>
										<tbody>
											<tr>
												<td>1</td>
												<td>Supply Relay Rack</td>
												<td>Without PVC Wire</td>
												<td>NOS</td>
												<td>2.0</td>
												<td>76404.00</td>
												<td>18.0</td>
												<td>180313.44</td>
												<td>12.02.2019</td>
												<td class="action" width="1">
													<i class="fa fa-eye text-primary" aria-hidden="true"></i>
													<i class="fa fa-pencil-square-o text-success" aria-hidden="true"></i>
													<i class="fa fa-trash-o text-danger" aria-hidden="true"></i>
												</td>
											</tr>
											<tr>
												<td>2</td>
												<td>Fault Tolerant</td>
												<td>1 KVA, on line ups</td>
												<td>NOS</td>
												<td>2.0</td>
												<td>76404.00</td>
												<td>18.0</td>
												<td>180313.44</td>
												<td>30.12.2018</td>
												<td class="action" width="1">
													<i class="fa fa-eye text-primary" aria-hidden="true"></i>
													<i class="fa fa-pencil-square-o text-success" aria-hidden="true"></i>
													<i class="fa fa-trash-o text-danger" aria-hidden="true"></i>
												</td>
											</tr>
											<tr>
												<td>3</td>
												<td>Offset bracket</td>
												<td>For position  light shunt signal(90mm)</td>
												<td>NOS</td>
												<td>2.0</td>
												<td>76404.00</td>
												<td>18.0</td>
												<td>180313.44</td>
												<td>16.05.2018</td>
												<td class="action" width="1">
													<i class="fa fa-eye text-primary" aria-hidden="true"></i>
													<i class="fa fa-pencil-square-o text-success" aria-hidden="true"></i>
													<i class="fa fa-trash-o text-danger" aria-hidden="true"></i>
												</td>
											</tr>
											<tr>
												<td>4</td>
												<td>Supply Relay Rack</td>
												<td>Without PVC Wire</td>
												<td>NOS</td>
												<td>2.0</td>
												<td>76404.00</td>
												<td>18.0</td>
												<td>180313.44</td>
												<td>12.02.2019</td>
												<td class="action" width="1">
													<i class="fa fa-eye text-primary" aria-hidden="true"></i>
													<i class="fa fa-pencil-square-o text-success" aria-hidden="true"></i>
													<i class="fa fa-trash-o text-danger" aria-hidden="true"></i>
												</td>
											</tr>
											<tr>
												<td>5</td>
												<td>Ladder</td>
												<td>5.5 meter</td>
												<td>NOS</td>
												<td>2.0</td>
												<td>76404.00</td>
												<td>18.0</td>
												<td>180313.44</td>
												<td>20.09.2018</td>
												<td class="action" width="1">
													<i class="fa fa-eye text-primary" aria-hidden="true"></i>
													<i class="fa fa-pencil-square-o text-success" aria-hidden="true"></i>
													<i class="fa fa-trash-o text-danger" aria-hidden="true"></i>
												</td>
											</tr>
											<tr>
												<td>6</td>
												<td>Supply of CLS Post</td>
												<td>5.6 meter</td>
												<td>NOS</td>
												<td>2.0</td>
												<td>76404.00</td>
												<td>18.0</td>
												<td>180313.44</td>
												<td>28.11.2018</td>
												<td class="action" width="1">
													<i class="fa fa-eye text-primary" aria-hidden="true"></i>
													<i class="fa fa-pencil-square-o text-success" aria-hidden="true"></i>
													<i class="fa fa-trash-o text-danger" aria-hidden="true"></i>
												</td>
											</tr>
											<tr>
												<td>7</td>
												<td>Full Size location Box</td>
												<td>Without PVC Wire</td>
												<td>NOS</td>
												<td>2.0</td>
												<td>76404.00</td>
												<td>18.0</td>
												<td>180313.44</td>
												<td>25.06.2018</td>
												<td class="action" width="1">
													<i class="fa fa-eye text-primary" aria-hidden="true"></i>
													<i class="fa fa-pencil-square-o text-success" aria-hidden="true"></i>
													<i class="fa fa-trash-o text-danger" aria-hidden="true"></i>
												</td>
											</tr>
											<!-- <tr>
												<td>8</td>
												<td>Lorem ipsum dolor</td>
												<td> sit amet, consectetur</td>
												<td>adipisicing</td>
												<td>elit. Ullam</td>
												<td>Fuga sunt</td>
												<td class="action" width="1">
													<i class="fa fa-eye text-primary" aria-hidden="true"></i>
													<i class="fa fa-pencil-square-o text-success" aria-hidden="true"></i>
													<i class="fa fa-trash-o text-danger" aria-hidden="true"></i>
												</td>
											</tr>
											<tr>
												<td>9</td>
												<td>Lorem ipsum dolor</td>
												<td> sit amet, consectetur</td>
												<td>adipisicing</td>
												<td>elit. Ullam</td>
												<td>Fuga sunt</td>
												<td class="action" width="1">
													<i class="fa fa-eye text-primary" aria-hidden="true"></i>
													<i class="fa fa-pencil-square-o text-success" aria-hidden="true"></i>
													<i class="fa fa-trash-o text-danger" aria-hidden="true"></i>
												</td>
											</tr>
											<tr>
												<td>10</td>
												<td>Lorem ipsum dolor</td>
												<td> sit amet, consectetur</td>
												<td>adipisicing</td>
												<td>elit. Ullam</td>
												<td>Fuga sunt</td>
												<td class="action" width="1">
													<i class="fa fa-eye text-primary" aria-hidden="true"></i>
													<i class="fa fa-pencil-square-o text-success" aria-hidden="true"></i>
													<i class="fa fa-trash-o text-danger" aria-hidden="true"></i>
												</td>
											</tr> -->
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
