
<!-- Content Header (Page header) -->
<script>
	$(function() {
		// For Datatable
		$(document).ready(function() {
			"use strict";
			var table = $('#dataTableID').DataTable({
				"order" : [ [ 0, "desc" ] ],
				responsive : true,
				"pagingType" : "full_numbers",
				"lengthMenu" : [ [ 10, 20, 40, -1 ], [ 10, 20, 40, "All" ] ]
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

						<button type="button" ng-click="vendoraddload()"
							class="btn btn-box-tool" data-widget="add">
							<i class="fa fa-plus"></i> ADD Vendor
						</button>
					</div>
				</div>
				<!-- /.box-header -->
				<div class="box-body">
					<div class="row">
						<div class="col-md-12">
							<table id="vendorDataTable" ng-table="vendorData"
								class="data-table table table-bordered table-striped table-responsive">
								<thead>
									<tr>
										<!-- <th width="1">#</th> -->
										<th>Vendor Code</th>
										<th>Company Name</th>
										<th>Contact Number</th>
										<th>PAN No.</th>
										<th>Address</th>
										<th>State</th>
									</tr>
								</thead>
								<tbody>

									<tr ng-repeat="datas in $data | filter : keyword">
										<td title="'Vendor Code'">{{datas.vendorCode}}</td>
										<td title="'Company Name'">{{datas.companyName}}</td>
										<td title="'Contact Number'">{{datas.primaryContact}}</td>
										<td title="'PAN No.'">{{datas.companyPAN}}</td>
										<td title="'Address'">{{datas.address1}}</td>
										<td title="'State'">{{datas.state}}</td>
											
										<td class="action" width="1"><i
											class="fa fa-eye text-primary" aria-hidden="true"></i> <i
											class="fa fa-pencil-square-o text-success" aria-hidden="true"></i>
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


<jsp:include page="/WEB-INF/views/module/user/vendoradd.jsp" />

