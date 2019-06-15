
     <!-- Content Header (Page header) -->
                      <!--Form and Application Button-->
        <section class="content" ng-init="getProjectDataByPCode(projectCode)">
            <div class="row">
                <div class="col-md-12">
                <form ng-submit="addTurnover()" class="col-md-12" name="PaymentForm">
                    <div class="box box-primary">
                        <div class="box-header with-border">
                            <h3 class="box-title">Payments Form</h3>
                            <div class="box-tools pull-right">
                                    <button type="button" ng-click="projectlistload()" class="btn btn-box-tool" data-widget="back">
									<i class="fa fa-reply"> </i> Back
								</button>
                            </div>
                        </div>
                        <!-- /.box-header -->
                        <div class="box-body">
                            <div class="row">
								<div class="col-md-6">									
									<div class="form-group">
										<label for="af1">Bill No</label>
										<input type="text"  class="form-control" ng-model="turnOver.billNo" name="billNo" placeholder="Bill No">
									</div>									
								</div>
								
								
								<div class="col-md-6">
								<div class="form-group">
									<label for="af2">Bill Passed Date </label> 
			                            <input type="text" class="form-control" id="billPasseddate" readonly="readonly" name="billPasseddate" placeholder="Bill Passed Date" datetime-picker="yyyy-MM-dd " size="3" ng-model="turnOver.billPassedDate" is-open="ctrl.billPaseddate.eventTime" /> 									
										<span class="input-group-btn">
										<button type="button"  class="btn btn-blue" ng-click="ctrl.billPaseddate.eventTime = true"> <i class="fa fa-calendar"></i>
									
								</div>
								</div>
								<div class="col-md-6">
								<div class="form-group">
									<label for="payementRecievedDate">Payment Received Date </label> 
			                            <input type="text"  id="payementRecievedDate" name="payementRecievedDate" class="form-control" id="paymentRecieveddate" readonly="readonly" placeholder="Payment Recieved  Date" datetime-picker="yyyy-MM-dd "  ng-model="turnOver.paymentRecievedDate" is-open="ctrl.date.eventTime" /> 									
										<span class="input-group-btn">
										<button type="button" class="btn btn-blue" ng-click="ctrl.date.eventTime = true"> <i class="fa fa-calendar"></i>
									
								</div>
								</div>
								  									
									<div class="col-md-6">									
									<div class="form-group">
										<label for="projectCode">Project Code </label>
										<input type="text" class="form-control" readonly="readonly"  ng-model="turnOver.project.project_code" id="projectCode" placeholder="">
                                        <input type="hidden"   ng-model="turnOver.project.company_id" id="companyId" placeholder="">
                                        <input type="hidden"   ng-model="turnOver.project.id" id="projectId" placeholder="">
                                        <input type="hidden"   ng-model="turnOver.project.ins" id="ins" placeholder="">
                                        <input type="hidden"   ng-model="turnOver.project.eiwork" id="eiWork" placeholder="">
                                        <input type="hidden"   ng-model="turnOver.project.creation_date" id="creation_date" placeholder="">
                                        <input type="hidden"   ng-model="turnOver.project.update_date" id="update_date" placeholder="">
                                        <input type="hidden"   ng-model="turnOver.project.schUnitRate" id="schUnitRate" placeholder="">
                                        <input type="hidden"   ng-model="turnOver.project.amount" id="amount" placeholder="">
                                        <input type="hidden"   ng-model="turnOver.project.billQuantity" id="billQuantity" placeholder="">
                                        <input type="hidden"   ng-model="turnOver.project.wayBillNoDate" id="wayBillNoDate" placeholder="">
                                        <input type="hidden"   ng-model="turnOver.project.billNo" id="billNo" placeholder="">
                                        <input type="hidden"   ng-model="turnOver.project.date" id="date" placeholder="">
                                        <input type="hidden"   ng-model="turnOver.project.arrivalDateAtRailwayStore" id="arrivalDateAtRailwayStore" placeholder="">
                                        <input type="hidden"   ng-model="turnOver.project.truckNumber" id="truckNumber" placeholder="">
                                        <input type="hidden"   ng-model="turnOver.project.transporter" id="transporter" placeholder="">
                                        <input type="hidden"   ng-model="turnOver.project.supplyQuantity" id="supplyQuantity" placeholder="">
                                        <input type="hidden"   ng-model="turnOver.project.icDetails" id="icDetails" placeholder="">
                                        <input type="hidden"   ng-model="turnOver.project.dateOfSupply" id="dateOfSupply" placeholder="">
                                        <input type="hidden"   ng-model="turnOver.project.supplierWithAddress" id="supplierWithAddress" placeholder="">
                                        <input type="hidden"   ng-model="turnOver.project.percentageAbove" id="percentageAbove" placeholder="">
                                        <input type="hidden"   ng-model="turnOver.project.allInclusiveRate" id="allInclusiveRate" placeholder="">
                                        <input type="hidden"   ng-model="turnOver.project.user" id="user" placeholder="">
                                        <input type="hidden"   ng-model="turnOver.project.itemcodes" id="itemcodes" placeholder="">
                                        <input type="hidden"   ng-model="turnOver.project.projectname" id="projectname" placeholder="">
                                        <input type="hidden"   ng-model="turnOver.project.projectdetails" id="projectdetails" placeholder="">
                                        <input type="hidden"   ng-model="turnOver.project.totalqty" id="totalqty" placeholder="">
                                        <input type="hidden"   ng-model="turnOver.project.units" id="units" placeholder="">
                                        <input type="hidden"   ng-model="turnOver.project.state" id="state" placeholder="">
                                		
									</div>									
								</div>						
								
								
								<div class="col-md-6">									
									<div class="form-group">
										<label for="amountIncludinggst">Gross Amount Including gst </label>
										 <div class="input-group date">
                                        <input type="text" class="form-control" name="grossAmountIncludingGst" readonly="readonly" ng-model="turnOver.grossAmountIncludingGst" id="amountIncludinggst" placeholder="">
										</div>
									</div>									
								</div>
								<div class="col-md-6">									
									<div class="form-group">
										<label for="amountExcgst">Gross Amount excluding gst </label>
										 <div class="input-group date">
                                      
										<input type="text" class="form-control"  name="grossAmountExcludinggst" ng-blur="calulateAmountWithgst()"  ng-model="turnOver.grossAmountExcludinggst" id="amountExcgst" placeholder="Gross Amount excluding gst">
										</div>
									</div>									
								</div>
								<div class="col-md-6">									
									<div class="form-group">
										<label for="gst">Gst </label>
										 <div class="input-group date">
                                            
										<select id="gst"  name="gst" ng-model="turnOver.gst" ng-change="calulateAmountWithgst()">
											<option >Please Select</option>
											<option value="5">5%</option>
											<option value="12">12%</option>
											<option value="18">18%</option>
											<option value="28">28%</option>
										</select>
										</div>
									</div>									
								</div>
								<div class="col-md-6">									
									<div class="form-group">
										<label for="RetDeducted">retention deducted </label>
										 <div class="input-group date">
                                           
										<input type="text" class="form-control" name="retentionDeducted" ng-blur="calBillsPayable()" ng-model="turnOver.retentionDeducted" id="RetDeducted" placeholder="retention deducted">
										</div>
									</div>									
								</div>
								
								<div class="col-md-6">									
									<div class="form-group">
										<label for="retentionReleased">retention released </label>
										 <div class="input-group date">
                                        <input type="text" class="form-control" name="retensionReleased" ng-model="turnOver.retensionReleased" ng-blur="calBillsPayable()" id="retentionReleased" placeholder="retention released">
										</div>
									</div>									
								</div>
								<div class="col-md-6">									
									<div class="form-group">
										<label for="billsPayable">bills payable </label>
										 <div class="input-group date">
                                        <input type="text" class="form-control" name="billsPayable" ng-model="turnOver.billsPayable" readonly="readonly" id="billsPayable" placeholder="bills payable">
										</div>
									</div>									
								</div>
								<div class="col-md-6">									
									<div class="form-group">
										<label for="sdDeducted">sd deducted </label>
										 <div class="input-group date">
                                      <input type="text" class="form-control" name="sdDeducted" ng-model="turnOver.sdDeducted" id="sdDeducted" placeholder="sd deducted">
										</div>
									</div>									
								</div>
								<div class="col-md-6">									
									<div class="form-group">
										<label for="sdReleased">sd released </label>
										 <div class="input-group date">
                                     	<input type="text" class="form-control" name="sdReleased" ng-model="turnOver.sdReleased" id="sdReleased" placeholder="sd released">
										</div>
									</div>									
								</div>
								<div class="col-md-6">									
									<div class="form-group">
										<label for="incomeTax">income tax </label>
										 <div class="input-group date">
                                           
										<input type="text" class="form-control" name="incomeTax" ng-model="turnOver.incomeTax" id="incomeTax" placeholder="income tax">
										</div>
									</div>									
								</div>
								<div class="col-md-6">									
									<div class="form-group">
										<label for="surcharge">surcharge </label>
										 <div class="input-group date">
                            			<input type="text" class="form-control" name="surcharge" ng-model="turnOver.surcharge" id="surcharge" placeholder="surcharge">
										</div>
									</div>									
								</div>
								<div class="col-md-6">									
									<div class="form-group">
										<label for="sgsttds">sgst tds </label>
										 <div class="input-group date">
                            			<input type="text" class="form-control" name="sgsttds" ng-model="turnOver.sgsttds" id="sgsttds" placeholder="sgst tds">
										</div>
									</div>									
								</div>
									<div class="col-md-6">									
									<div class="form-group">
										<label for="cgsttds">cgst tds </label>
										 <div class="input-group date">
                            			<input type="text" class="form-control" name="cgsttds" ng-model="turnOver.cgsttds" id="cgsttds"  placeholder="cgst tds">
										</div>
									</div>									
								</div>
									<div class="col-md-6">									
									<div class="form-group">
										<label for="miscchg">misg chg </label>
										 <div class="input-group date">
                                           
										<input type="text" class="form-control" name="miscchg" ng-model="turnOver.miscchg" id="miscchg" placeholder="misg chg">
										</div>
									</div>									
								</div>
																
								<div class="col-md-6">									
									<div class="form-group">
										<label for="miscchgRelease">misg chg release </label>
										 <div class="input-group date">
                                    	 <input type="text" class="form-control" name="miscchgRelease" ng-model="turnOver.miscchgRelease" id="miscchgRelease" placeholder="misg chg release">
										</div>
									</div>									
								</div>
								<div class="col-md-6">									
									<div class="form-group">
										<label for="sgst">sgst at 6%</label>
										 <div class="input-group date">
                                    	<input type="text" class="form-control" name="readonly" readonly="readonly" ng-model="turnOver.sgst" id="sgst" placeholder="sgst at 6%">
										</div>
									</div>									
								</div>
								<div class="col-md-6">									
									<div class="form-group">
										<label for="cgst">cgst at 6%</label>
										 <div class="input-group date">
                                    	<input type="text" class="form-control" name="cgst"  readonly="readonly" ng-model="turnOver.cgst" id="cgst" placeholder="cgst at 6%">
										</div>
									</div>									
								</div>
								<div class="col-md-6">									
									<div class="form-group">
										<label for="cgst">check received</label>
										 <div class="input-group date">
                                    	<input type="text" class="form-control" name="checkRecievedAmount"  ng-model="turnOver.checkRecievedAmount" id="checkRecievedAmount" placeholder="checkRecievedAmount">
										</div>
									</div>									
								</div>
                            </div>
                        </div>
						<div class="box-footer" align="right">
							<button type="submit"  class="btn btn-primary pad40L pad40R mrg5L" >Submit</button>
						</div>
                    </div>
                </div>  
                </form>              
            </div>
        </section>       