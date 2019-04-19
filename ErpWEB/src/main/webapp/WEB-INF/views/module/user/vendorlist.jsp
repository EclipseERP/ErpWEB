 
     <!-- Content Header (Page header) -->
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
 <section class="content" ng-show="vendorlistshow">
            <div class="row">
                <div class="col-md-12">
                    <div class="box box-primary">
                        <div class="box-header with-border">
                            <h3 class="box-title">Vendor list / Report</h3>
                            <div class="box-tools pull-right">
                        
                               <button type="button"  ng-click="vendoraddload()" class="btn btn-box-tool" data-widget="add">
									<i class="fa fa-plus"></i> ADD Vendor
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
												<th>Name</th>
												<th>Contact Number</th>
												<th>PAN No.</th>
												<th>Address</th>
												<th>State</th>
												<th>Company Type</th>
											</tr>
										</thead>
										<tbody>
											<tr>
												<td>1</td>
												<td>Luminous Steel</td>
												<td>8965744122</td>
												<td>AELPU5278H</td>
												<td>2/G Kottam, Near Gol Gumbaj</td>
												<td>Kerala</td>
												<td>Iron And Steel</td>
												<td class="action" width="1">
													<i class="fa fa-eye text-primary" aria-hidden="true"></i>
													<i class="fa fa-pencil-square-o text-success" aria-hidden="true"></i>
													<i class="fa fa-trash-o text-danger" aria-hidden="true"></i>
												</td>
											</tr>
											<tr>
												<td>2</td>
												<td>Forestry Furniture</td>
												<td> 9898652358</td>
												<td>FFLPU5278H</td>
												<td>Lake Town, Kolkata-700053</td>
												<td>West Bengal</td>
												<td>Furniture</td>
												<td class="action" width="1">
													<i class="fa fa-eye text-primary" aria-hidden="true"></i>
													<i class="fa fa-pencil-square-o text-success" aria-hidden="true"></i>
													<i class="fa fa-trash-o text-danger" aria-hidden="true"></i>
												</td>
											</tr>
											<tr>
												<td>3</td>
												<td>Thread Computers</td>
												<td>9854721589</td>
												<td>DPLPU5368H</td>
												<td>Kankar Bagh, near Golambar, PAtna-800006</td>
												<td>Bihar</td>
												<td>Computer Shop</td>
												<td class="action" width="1">
													<i class="fa fa-eye text-primary" aria-hidden="true"></i>
													<i class="fa fa-pencil-square-o text-success" aria-hidden="true"></i>
													<i class="fa fa-trash-o text-danger" aria-hidden="true"></i>
												</td>
											</tr>
											<tr>
												<td>4</td>
												<td>Biom Plastics</td>
												<td>9898653258</td>
												<td>FDLPU6578H</td>
												<td>Near Shivalik Temple, Bhopal-8</td>
												<td>Madhya Pradesh</td>
												<td>Synthetic Fibres</td>
												<td class="action" width="1">
													<i class="fa fa-eye text-primary" aria-hidden="true"></i>
													<i class="fa fa-pencil-square-o text-success" aria-hidden="true"></i>
													<i class="fa fa-trash-o text-danger" aria-hidden="true"></i>
												</td>
											</tr>
											<tr>
												<td>5</td>
												<td>Potential Electronics</td>
												<td>6969542130</td>
												<td>SFLPU3628H</td>
												<td>Sidhhi Para, Bardhamaan</td>
												<td>West Bengal</td>
												<td>Electronics</td>
												<td class="action" width="1">
													<i class="fa fa-eye text-primary" aria-hidden="true"></i>
													<i class="fa fa-pencil-square-o text-success" aria-hidden="true"></i>
													<i class="fa fa-trash-o text-danger" aria-hidden="true"></i>
												</td>
											</tr>
											<!-- <tr>
												<td>6</td>
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
												<td>7</td>
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
        
        
<jsp:include page="/WEB-INF/views/module/user/vendoradd.jsp" />  
        
