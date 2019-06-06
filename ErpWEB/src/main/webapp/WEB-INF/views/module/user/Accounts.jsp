
<!-- Content Header (Page header) -->
<!--Form and Application Button-->
<section class="content" ng-show="projectaddshow">
	<div class="row">
		<div class="col-md-12">
			<form ng-submit="projectAdd(p)" class="col-md-12" name="ProjectForm">
				<div class="box box-primary">
					<div class="box-header with-border">
						<h3 class="box-title">Turnover Details</h3>
						<div class="box-tools pull-right">
							<button type="button" ng-click="projectlistload()"
								class="btn btn-box-tool" data-widget="back">
								<i class="fa fa-reply"> </i> Back
							</button>
						</div>
					</div>
					<!-- /.box-header -->
					<div ng-show="projectaddFirstPartView" class="box-body">
						<div class="row">
						
						
						
						<div class="col-md-6">									
									<div class="form-group">
										<label for="af1">Cont No.</label>
										<input type="text" ng-model="data.name"  class="form-control" id="af1" placeholder=""  required>
									</div>									
								</div>
									<div class="col-md-6">									
									<div class="form-group">
										<label for="af3">Bill No.</label>
										<input type="text" ng-model="data.itemCode" class="form-control" id="af3" placeholder="" required>
									</div>									
								</div>
								
								<div class="col-md-6">									
									<div class="form-group">
										<label for="af10">Bill Passed Date</label>
										<input type="text" onkeypress="return isNumber(event)" onkeyup="positiveNumberValidation_divid('hsn','number_validation','Please enter only valid integers !!')" class="form-control" ng-model="data.hsno" id="hsn" placeholder="" required>
									</div>									
								</div>
								<div class="col-md-6">									
									<div class="form-group">
										<label for="af11">Payment Received Date</label>
										<input textarea ng-model="data.description" class="form-control" id="description" placeholder="" required>
									</div>									
								</div>
								
								
								<div class="col-md-6">									
									<div class="form-group">
										<label for="af3">Gross Amount Including GST</label>
										<input type="text" onkeypress="return isNumber(event)" onkeyup="positiveNumberValidation_divid('unit','number_validation','Please enter only valid integers !!')" ng-model="data.unit" id="unit" value="NOS" class="form-control" placeholder="" required>
									</div>									
								</div>
										<div class="col-md-6">									
									<div class="form-group">
										<label for="af5">Gross Amount Excluding GST</label>
										<input type="text" onkeypress="return isNumber(event)" onkeyup="positiveNumberValidation_divid('rate','number_validation','Please enter only valid integers !!')" id="rate" ng-model="data.rate" ng-keyup="calculateTotal()"  value="0" class="form-control" placeholder="" required>
									</div>									
								</div>
								<div class="col-md-6">									
									<div class="form-group">
										<label for="af4">Retention Deducted</label>
										<input type="text" onkeypress="return isNumber(event)" onkeyup="positiveNumberValidation_divid('totQty','number_validation','Please enter only valid integers !!')" id="totQty" ng-model="data.totalQty" ng-keyup="calculateTotal()" value="0" class="form-control" placeholder="" required>
									</div>									
								</div>
						       <div class="col-md-6">									
									<div class="form-group">
										<label for="af4">Retention Released</label>
										<input type="text" id="ins" ng-model="data.ins" ng-keyup="calculateTotal()" value="0" class="form-control" placeholder="">
									</div>									
								</div>
								<div class="col-md-12">									
									<div class="form-group">
										<label for="af6">Bills Payable</label>
										<input type="text" onkeypress="return isNumber(event)" onkeyup="positiveNumberValidation_divid('amt','number_validation','Please enter only valid integers !!')" ng-model="data.amount" class="form-control" id="amt" placeholder="" required>
									</div>									
								</div>
								<div class="col-md-6">									
									<div class="form-group">
										<label for="af7">S.D. Deducted</label>
										<input type="text" onkeypress="return isNumber(event)" onkeyup="positiveNumberValidation_divid('gst','number_validation','Please enter only valid integers !!')" id="gst" ng-model="data.gst" ng-keyup="calculateTotal()" class="form-control" placeholder="">
									</div>									
								</div>
								<div class="col-md-6">									
									<div class="form-group">
										<label for="af3">S.D. Released</label>
										<input type="text" onkeypress="return isNumber(event)" onkeyup="positiveNumberValidation_divid('above','number_validation','Please enter only valid integers !!')" ng-model="data.percentageAbove" id="above" value="NOS" class="form-control" placeholder="" required>
									</div>									
								</div>
								<div class="col-md-6">									
									<div class="form-group">
										<label for="af3">Income Tax</label>
										<input type="text" onkeypress="return isNumber(event)" onkeyup="positiveNumberValidation_divid('inclusiveRate','number_validation','Please enter only valid integers !!')" ng-model="data.allInclusiveRate" value="NOS" class="form-control" id="inclusiveRate" placeholder="" required>
									</div>									
								</div>
								
								<div class="col-md-6">									
									<div class="form-group">
										<label for="af8">Surcharge</label>
										<input type="text" onkeypress="return isNumber(event)" onkeyup="positiveNumberValidation_divid('grandTotal','number_validation','Please enter only valid integers !!')" id="grandTotal" ng-model="data.totalAmount" class="form-control" placeholder="">
									</div>									
								</div>
								<div class="col-md-6">									
									<div class="form-group">
										<label for="af9">SGST TDS</label>
										<input type="text" class="form-control" ng-model="data.hsNo" id="af9" placeholder="" required>
									</div>									
								</div>
								<div class="col-md-6">									
									<div class="form-group">
										<label for="af9">CGST TDS</label>
										<input type="text" class="form-control" ng-model="data.hsNo" id="af9" placeholder="" required>
									</div>									
								</div>
								<div class="col-md-6">									
									<div class="form-group">
										<label for="af3">Misc Charge</label>
										<input type="text" ng-model="data.icDetails" id="unit" value="NOS" class="form-control" id="af3" placeholder="" required>
									</div>									
								</div>
								<div class="col-md-6">									
									<div class="form-group">
										<label for="af3">Misc Charge Release</label>
										<input type="text" ng-model="data.dateOfSupply" id="dateOfSupply" value="NOS" class="form-control" placeholder="" required>
									</div>									
								</div>
								<div class="col-md-6">									
									<div class="form-group">
										<label for="af4">SGST @6%</label>
										<input type="text" onkeypress="return isNumber(event)" onkeyup="positiveNumberValidation_divid('qty','number_validation','Please enter only valid integers !!')" id="qty" ng-model="data.supplyQuantity" ng-keyup="calculateTotal()" value="0" class="form-control" id="af4" placeholder="" required>
									</div>									
								</div>
								<div class="col-md-6">									
									<div class="form-group">
										<label for="af3">CGST @ 6%</label>
										<input type="text" onkeypress="return isNumber(event)" onkeyup="positiveNumberValidation_divid('unit','number_validation','Please enter only valid integers !!')" ng-model="data.balanceQuantity" id="unit" value="NOS" class="form-control" placeholder="" required>
									</div>									
								</div>
					       </td>
					   </tr>
                  </tbody>
			</table>
								<script type="text/javascript">
									
								</script>

							</div>
						</div>
                     </div>




					<div class="box-footer" align="right">
						<button type="button" ng-click="saveProject(p)" id="btprsave" class="btn btn-primary pad40L pad40R mrg5L">Save Details</button>
					</div>
				</div>
			</form>
		</div>
	</div>

</section>


<!-- <div id="itemModal" class="modal fade">
	<div class="modal-dialog" style="max-width: 100%" role="document">
		<div class="modal-content"
			style="width: 920px; height: 600px; left: -108px; position: relative; top: -14px;">
			<div class="modal-header" style="background-color: #bfa8a3">
				<button type="button" class="close" data-dismiss="modal"
					aria-hidden="true">&times;</button>
				<h4 class="modal-title">Items available</h4>
			</div>
			<div class="modal-body" style="background-color: white;">


				<div class="col-md-12">
					<button type="button" class="btn btn-box-tool" data-widget="add">
						<i class="fa fa-plus"></i> Create Item

					</button>
					<input type="text" class="pull-right" placeholder=" search.."
						ng-model="keyword">
					<table ng-table="rowMaterialData"
						class="data-table table table-bordered table-striped table-responsive"
						style="width: 100%;">
						<thead>
							<tr>
								<th>Item Code</th>
								<th>Item/Material Name</th>
								<th>Description</th>
								<th>INS</th>
								<th>View full details</th>
								<th>Add to Project/Tender</th>

							</tr>
						</thead>
						<tbody>


							<tr ng-repeat="datas in $data | filter : keyword">
								<td>{{datas.itemCode}}</td>
								<td>No name available</td>
								<td>{{datas.descriptionHSNno}}</td>
								<td><select id="insindex{{$index}} ">

										<option value="">--Select INS Types--</option>
										<option value="Consignee (CONS)">Consignee (CONS)</option>
										<option value="RITES">RITES</option>
										<option value="RDSO">RDSO</option>

								</select></td>
								<td><a>View full details</a></td>
								<td><a class="btn btn-primary pad40L pad40R mrg5L"
									ng-click="addItemToProjectCart(datas,$index )"
									style="cursor: pointer">Add to project</a></td>

							</tr>


						</tbody>
					</table>


				</div>
			</div>
		</div>
	</div>
</div> -->

<script type="text/javascript" src="/js/moduleJs/project_JS_User.js"></script>




























<%-- <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
     <!-- Content Header (Page header) -->
               <section class="content" ng-show="turnoverAddShow">
              
                <div class="row">
                <div class="col-md-12">
             <form ng-submit="submitTurnover(data)" class="col-md-12" name="itemForm">
                    <div class="box box-warning">
                        <div class="box-header with-border">
                        <c:import url="/WEB-INF/views/messages/success.jsp"/>	
                        <c:import url="/WEB-INF/views/messages/error.jsp"/>	
                        <c:import url="/WEB-INF/views/messages/processing.jsp"/>
                            <h3 class="box-title">Param Enterprises (P) Ltd. Turnover</h3>
                            <div class="box-tools pull-right">
                                 <button type="button" ng-click="itemlistload()" class="btn btn-box-tool" data-widget="back">
									<i class="fa fa-reply"> </i> Back
								</button>
                              
                            </div>
                        </div>
                        <!-- /.box-header -->
                        <div class="box-body">
                            <div class="row">
								<div class="col-md-6">									
									<div class="form-group">
										<label for="af1">Cont No.</label>
										<input type="text" ng-model="data.name"  class="form-control" id="af1" placeholder=""  required>
									</div>									
								</div>
									<div class="col-md-6">									
									<div class="form-group">
										<label for="af3">BIll No.</label>
										<input type="text" ng-model="data.itemCode" class="form-control" id="af3" placeholder="" required>
									</div>									
								</div>
								
								<div class="col-md-6">									
									<div class="form-group">
										<label for="af10">Bill Passed Date</label>
										<input type="text" onkeypress="return isNumber(event)" onkeyup="positiveNumberValidation_divid('hsn','number_validation','Please enter only valid integers !!')" class="form-control" ng-model="data.hsno" id="hsn" placeholder="" required>
									</div>									
								</div>
								<div class="col-md-12">									
									<div class="form-group">
										<label for="af11">Payment Received Date</label>
										<input textarea ng-model="data.description" class="form-control" id="description" placeholder="" required>
									</div>									
								</div>
								
								
								<div class="col-md-6">									
									<div class="form-group">
										<label for="af3">Gross Amount Including GST</label>
										<input type="text" onkeypress="return isNumber(event)" onkeyup="positiveNumberValidation_divid('unit','number_validation','Please enter only valid integers !!')" ng-model="data.unit" id="unit" value="NOS" class="form-control" placeholder="" required>
									</div>									
								</div>
										<div class="col-md-6">									
									<div class="form-group">
										<label for="af5">Gross Amount Excluding GST</label>
										<input type="text" onkeypress="return isNumber(event)" onkeyup="positiveNumberValidation_divid('rate','number_validation','Please enter only valid integers !!')" id="rate" ng-model="data.rate" ng-keyup="calculateTotal()"  value="0" class="form-control" placeholder="" required>
									</div>									
								</div>
								<div class="col-md-6">									
									<div class="form-group">
										<label for="af4">Retention Deducted</label>
										<input type="text" onkeypress="return isNumber(event)" onkeyup="positiveNumberValidation_divid('totQty','number_validation','Please enter only valid integers !!')" id="totQty" ng-model="data.totalQty" ng-keyup="calculateTotal()" value="0" class="form-control" placeholder="" required>
									</div>									
								</div>
						       <div class="col-md-6">									
									<div class="form-group">
										<label for="af4">Retention Released</label>
										<input type="text" id="ins" ng-model="data.ins" ng-keyup="calculateTotal()" value="0" class="form-control" placeholder="">
									</div>									
								</div>
								<div class="col-md-6">									
									<div class="form-group">
										<label for="af6">Bills Payable</label>
										<input type="text" onkeypress="return isNumber(event)" onkeyup="positiveNumberValidation_divid('amt','number_validation','Please enter only valid integers !!')" ng-model="data.amount" readonly="readonly" class="form-control" id="amt" placeholder="" required>
									</div>									
								</div>
								<div class="col-md-6">									
									<div class="form-group">
										<label for="af7">S.D Deducted</label>
										<input type="text" onkeypress="return isNumber(event)" onkeyup="positiveNumberValidation_divid('gst','number_validation','Please enter only valid integers !!')" id="gst" ng-model="data.gst" ng-keyup="calculateTotal()" class="form-control" placeholder="">
									</div>									
								</div>
								<div class="col-md-6">									
									<div class="form-group">
										<label for="af3">S.D. Released</label>
										<input type="text" onkeypress="return isNumber(event)" onkeyup="positiveNumberValidation_divid('above','number_validation','Please enter only valid integers !!')" ng-model="data.percentageAbove" id="above" value="NOS" class="form-control" placeholder="" required>
									</div>									
								</div>
								<div class="col-md-6">									
									<div class="form-group">
										<label for="af3">Income Tax</label>
										<input type="text" onkeypress="return isNumber(event)" onkeyup="positiveNumberValidation_divid('inclusiveRate','number_validation','Please enter only valid integers !!')" ng-model="data.allInclusiveRate" value="NOS" class="form-control" id="inclusiveRate" placeholder="" required>
									</div>									
								</div>
								
								<div class="col-md-6">									
									<div class="form-group">
										<label for="af8">Surcharge</label>
										<input type="text" onkeypress="return isNumber(event)" onkeyup="positiveNumberValidation_divid('grandTotal','number_validation','Please enter only valid integers !!')" id="grandTotal" ng-model="data.totalAmount" readonly="readonly" class="form-control" placeholder="">
									</div>									
								</div>
								<div class="col-md-6">									
									<div class="form-group">
										<label for="af9">SGST TDS</label>
										<input type="text" class="form-control" ng-model="data.hsNo" id="af9" placeholder="" required>
									</div>									
								</div>
								<div class="col-md-6">									
									<div class="form-group">
										<label for="af9">CGST TDS</label>
										<input type="text" class="form-control" ng-model="data.hsNo" id="af9" placeholder="" required>
									</div>									
								</div>
								<div class="col-md-6">									
									<div class="form-group">
										<label for="af3">Misc Charge</label>
										<input type="text" ng-model="data.icDetails" id="unit" value="NOS" class="form-control" id="af3" placeholder="" required>
									</div>									
								</div>
								<div class="col-md-6">									
									<div class="form-group">
										<label for="af3">Misc Charge Release</label>
										<input type="text" ng-model="data.dateOfSupply" id="dateOfSupply" value="NOS" class="form-control" placeholder="" required>
									</div>									
								</div>
								<div class="col-md-6">									
									<div class="form-group">
										<label for="af4">SGST @6%</label>
										<input type="text" onkeypress="return isNumber(event)" onkeyup="positiveNumberValidation_divid('qty','number_validation','Please enter only valid integers !!')" id="qty" ng-model="data.supplyQuantity" ng-keyup="calculateTotal()" value="0" class="form-control" id="af4" placeholder="" required>
									</div>									
								</div>
								<div class="col-md-6">									
									<div class="form-group">
										<label for="af3">CGST @ 6%</label>
										<input type="text" onkeypress="return isNumber(event)" onkeyup="positiveNumberValidation_divid('unit','number_validation','Please enter only valid integers !!')" ng-model="data.balanceQuantity" id="unit" value="NOS" class="form-control" placeholder="" required>
									</div>									
								</div>
								
								
						<div class="box-footer" align="right">
							<button type="submit" class="btn btn-primary pad40L pad40R mrg5L">Submit</button>
						</div>
					
                    </div>
                     </form>	

                </div> 
                              
            </div>
            
        </section>
     
                <script type="text/javascript">
      


     
      <script type="text/javascript" src="/js/moduleJs/project_JS_User.js"></script> --%>