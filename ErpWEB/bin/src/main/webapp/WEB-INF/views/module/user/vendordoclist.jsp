
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
 <section class="content" ng-show="vendorDoclistshow">
            <div class="row">
                <div class="col-md-12">
                    <div class="box box-primary">
                        <div class="box-header with-border">
                            <h3 class="box-title">Vendor document list / Report</h3>
                            <div class="box-tools pull-right">
                             
                                
                                
                                   <button type="button"  ng-click="vendorDocaddload()" class="btn btn-box-tool" data-widget="add">
									<i class="fa fa-plus"></i> ADD Vendor Documents
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
												<th>Document Name</th>
												<th>Document Type</th>
												<th>Document Code</th>
												<th>Document URL</th>
												<th>Date of Upload</th>
											</tr>
										</thead>
										<tbody>
											<tr>
												<td>1</td>
												<td>Material List</td>
												<td>Materials</td>
												<td>RW025</td>
												<td>http://ets-techteam.com/user/?invalidLogin=#/vendorListload</td>
												<td>01.01.2019</td>
												<td class="action" width="1">
													<i class="fa fa-eye text-primary" aria-hidden="true"></i>
													<i class="fa fa-pencil-square-o text-success" aria-hidden="true"></i>
													<i class="fa fa-trash-o text-danger" aria-hidden="true"></i>
												</td>
											</tr>
											<tr>
												<td>2</td>
												<td>Material List</td>
												<td>Materials</td>
												<td>RW025</td>
												<td>http://ets-techteam.com/user/?invalidLogin=#/vendorListload</td>
												<td>01.01.2019</td>
												<td class="action" width="1">
													<i class="fa fa-eye text-primary" aria-hidden="true"></i>
													<i class="fa fa-pencil-square-o text-success" aria-hidden="true"></i>
													<i class="fa fa-trash-o text-danger" aria-hidden="true"></i>
												</td>
											</tr>
											<tr>
												<td>3</td>
												<td>Material List</td>
												<td>Materials</td>
												<td>RW025</td>
												<td>http://ets-techteam.com/user/?invalidLogin=#/vendorListload</td>
												<td>01.01.2019</td>
												<td class="action" width="1">
													<i class="fa fa-eye text-primary" aria-hidden="true"></i>
													<i class="fa fa-pencil-square-o text-success" aria-hidden="true"></i>
													<i class="fa fa-trash-o text-danger" aria-hidden="true"></i>
												</td>
											</tr>
											<tr>
												<td>4</td>
												<td>Material List</td>
												<td>Materials</td>
												<td>RW025</td>
												<td>http://ets-techteam.com/user/?invalidLogin=#/vendorListload</td>
												<td>01.01.2019</td>
												<td class="action" width="1">
													<i class="fa fa-eye text-primary" aria-hidden="true"></i>
													<i class="fa fa-pencil-square-o text-success" aria-hidden="true"></i>
													<i class="fa fa-trash-o text-danger" aria-hidden="true"></i>
												</td>
											</tr>
											<tr>
												<td>5</td>
												<td>Material List</td>
												<td>Materials</td>
												<td>RW025</td>
												<td>http://ets-techteam.com/user/?invalidLogin=#/vendorListload</td>
												<td>01.01.2019</td>
												<td class="action" width="1">
													<i class="fa fa-eye text-primary" aria-hidden="true"></i>
													<i class="fa fa-pencil-square-o text-success" aria-hidden="true"></i>
													<i class="fa fa-trash-o text-danger" aria-hidden="true"></i>
												</td>
											</tr>
											<tr>
												<td>6</td>
												<td>Material List</td>
												<td>Materials</td>
												<td>RW025</td>
												<td>http://ets-techteam.com/user/?invalidLogin=#/vendorListload</td>
												<td>01.01.2019</td>
												<td class="action" width="1">
													<i class="fa fa-eye text-primary" aria-hidden="true"></i>
													<i class="fa fa-pencil-square-o text-success" aria-hidden="true"></i>
													<i class="fa fa-trash-o text-danger" aria-hidden="true"></i>
												</td>
											</tr>
											<tr>
												<td>7</td>
												<td>Material List</td>
												<td>Materials</td>
												<td>RW025</td>
												<td>http://ets-techteam.com/user/?invalidLogin=#/vendorListload</td>
												<td>01.01.2019</td>
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
        
        

        <jsp:include page="/WEB-INF/views/module/user/vendordocadd.jsp" />  
        
    