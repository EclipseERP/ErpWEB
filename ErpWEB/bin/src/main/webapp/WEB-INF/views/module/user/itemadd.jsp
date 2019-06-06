<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

 <!-- /.box-header -->
                        <div class="box-body">
                            <div class="row">
								<div class="col-md-12">									
									<table id="itemTableID" ng-table="addItemData" class="data-table table table-bordered table-striped table-responsive">
										<thead>
											<tr>
												
												<th>Select Item</th>
												<th>Item Code</th>
												<th>Item Name</th>
													
											</tr>
									
							
						<tr ng-repeat="datas in $data | filter : keyword">
						<td><button type="radio"  ng-click="countnumberofitems()" class="btn btn-box-tool" data-widget="add">
									</button> 
                           </td>
						    <td title="'Item Code'">
									<span ng-if="datas.itemCode == null"> No Data</span>
									<span ng-if="datas.itemCode != null">{{datas.itemCode}}</span>
									</td> 
						    
										</thead>
										
								<div class="box-footer" align="right">
							<button type="save" class="btn btn-primary pad40L pad40R mrg5L">Save</button>
						</div>
<script type="text/javascript">

 function countnumberofitems(){
	 
	  var count=0;
	  
 }
</script>