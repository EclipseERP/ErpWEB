
<!-- Content Header (Page header) -->
     <script>
$(function () {
	// For Datatable
	$(document).ready(function() {
		"use strict";
		var table = $('#projectListTable').DataTable( {
			"project_master": [[ 0, "desc" ]],
			responsive: true,
			"pagingType": "full_numbers",
			"lengthMenu": [[10, 20, 40, -1], [10, 20, 40, "All"]]
		});
	});
});
</script>
 <section class="content" ng-show="projectlistshow">
            <div class="row">
                <div class="col-md-12">
                    <div class="box box-primary">
                        <div class="box-header with-border">
                            <h3 class="box-title">Project list </h3>
                            <div class="box-tools pull-right"><button type="button"  ng-click="projectaddload()" class="btn btn-box-tool" data-widget="add">
									<i class="fa fa-plus"></i> ADD Project
								</button></div>
                            </div>
                        </div>
                        <!-- /.box-header -->
                        <div class="box-body">
                            <div class="row">
								<div class="col-md-12">		
								
<table ng-table="projectListTable" class="data-table table table-bordered table-striped table-responsive"
						style="text-align: center">
						<tr ng-repeat="datas in $data | filter : keyword">
						
						    <td title="'Project Code'">
									<span ng-if="datas.projectCode == null"> No Data</span>
									<span ng-if="datas.projectCode != null">{{datas.projectCode}}</span>
									</td> 
						    <td title="'Name'">{{datas.loanumber}}</td> 
							<td title="'Number of Items'"> 0 </td>
							<td title="'Date of Creation'">{{datas.creationDate | date : 'yyyy-MM-dd h:mm a'}}</td>
							<td title="'Update Date'"><span ng-if="datas.updateDate ==null">No Data</span>
							                          <span ng-if="datas.updateDate !=null">{{datas.updateDate | date : 'yyyy-MM-dd h:mm a'}}</span></td>
							<td title="'Company ID'">{{datas.companyID}}</td>
							<td> 
                
                            <button type="button"  ng-click="itemadd()" class="btn btn-box-tool" data-widget="add">
									<i class="fa fa-plus"></i> ADD Item
								</button> 
                           </td>
					</tr>
				</table>
				</div>
				</div>
				</div>
				</div>
				</div>
				</section>
				
				<jsp:include page="/WEB-INF/views/module/user/projectadd.jsp" />
				