<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<section class="content" >
            <div class="row">
                <div class="col-md-12">
                    <div class="box box-primary">
                        <div class="box-header with-border">
                           <h3 class="box-title">LOA No :  <b>{{loano}}  </b><br/> <br/> Project Location :  <b>{{projectlocation}}  </b> <br/> <br/> 
                         
                         Item name : <b>{{itemname}}  </b>
                         
                         <br/><br/> Project Date :  <b>{{projectdate}}</b>
                         
                            </h3>
                            <div class="box-tools pull-right">
                 	

						      <button type="button" ng-click="projectlistload()"
								class="btn btn-box-tool" data-widget="back">
								LOA List
						     	</button>
						     	|
						     	  <button type="button" ng-click="getProjectDataByProjectCode(projectcode,loano,projectdate)"
								class="btn btn-box-tool" data-widget="back">
								 Project Location details
						     	</button>
                            	|	
                            	
                            	<a 	class="btn btn-box-tool" ng-click="viewItemDetailsProject(projectcode,projectlocation,loano)" >  Back</a>		
						
								</div>
						     	
								</div>
                            </div>
                             
                                <div class="box box-primary">
                                <div class="box-header with-border">
                            <div class="row">
                           		
                           		
                           	<div class="col-md-12">
								<div         class="form-group">
									<h4>Supply details</h4>
								</div>
							</div>	
                           						
							<div class="col-md-6">
								<div class="form-group">
									<label for="af1">SCH Unit Rate </label> <input type="text"
										class="form-control"  id="af1" ng-model="itemdata.schUnitRate"
										 placeholder="">
								</div>
							</div>

                     


                       	<div class="col-md-6">
								<div class="form-group">
									<label for="af1">Amount </label> <input type="text"
										class="form-control"  id="af1"
										ng-model="itemdata.supplyqty" placeholder="">
								</div>
							</div>




                       	<div class="col-md-6">
								<div class="form-group">
									<label for="af1">% Above </label> <input type="text"
										class="form-control"  id="af1"
										ng-model="itemdata.percentageAbove" placeholder="">
								</div>
							</div>
							
							 	<div class="col-md-6">
								<div class="form-group">
									<label for="af1">All inclusive rate </label> <input type="text"
										class="form-control"  id="af1"
										ng-model="itemdata.allInclusiveRate" placeholder="">
								</div>
							</div>
							
							
							<div class="col-md-6">
								<div class="form-group">
									
									<label for="af1"> </label>
									
									<select ng-model="custData.referral" class="form-control" ng-options="x.name for x in referralData1 track by x.id" ng-change = "addnewReferral(x)" name="refferalId" id="refferalId"  required>
									<option ng-click="newCustomerAddModal()" value="">--Supplier Name  --</option>
									
									</select>
								</div>
							</div>
							
							
									<div class="col-md-12">
								<div class="form-group">
									<label for="af1">Supplier Address </label> 
									
									<textarea rows="2" class="form-control"></textarea>
									
									
								</div>
							</div>
							
									<div class="col-md-6">
								<div class="form-group">
									<label for="af1">Rate </label> <input type="text"
										class="form-control"  id="af1"
										ng-model="itemdata.rate" placeholder="">
								</div>
							</div>
							
							
							<div class="col-md-6">
								<div class="form-group">
									<label for="af1">Details of IC </label> <input type="text"
										class="form-control"  id="af1"
										ng-model="itemdata.detailsofic" placeholder="">
								</div>
							</div>
					


                              <div class="col-md-6">
								<div class="form-group">
									<label for="af1">Date of Supply </label> 
									<input type="text"
										class="form-control"  id="af1"
										ng-model="itemdata.dateofsupply" datetime-picker="yyyy-MM-dd " size="3" ng-model="creation_date" is-open="ctrl.date.eventTimee" /> 									
										<span class="input-group-btn">
										<button type="button" class="btn btn-blue" ng-click="ctrl.date.eventTimee = true"> <i class="fa fa-calendar"></i>
								</div>
							</div>
							
							
							

                              <div class="col-md-6">
								<div class="form-group">
									<label for="af1">Supply qty </label> <input type="text"
										class="form-control"  id="af1"
										ng-model="itemdata.supplyqty"  placeholder="">
								</div>
							</div>
							
							          <div class="col-md-6">
								<div class="form-group">
									<label for="af1">Balance QTY </label> <input type="text"
										class="form-control"  id="af1"
										ng-model="itemdata.balanceqty" placeholder="">
								</div>
							</div>
							
						  <div class="col-md-6">
								<div class="form-group">
									<label for="af1">Place of Delivery </label> <input type="text"
										class="form-control"  id="af1"
										ng-model="itemdata.placeofdelivery" placeholder="">
								</div>
							</div>
							
							
							  <div class="col-md-6">
								<div class="form-group">
									<label for="af1">Way Bill No Date </label> <input type="text"
										class="form-control"  id="af1"
										ng-model="itemdata.waybillnodate" datetime-picker="yyyy-MM-dd " size="3" ng-model="creation_date" is-open="ctrl.date.eventTimen" /> 									
										<span class="input-group-btn">
										<button type="button" class="btn btn-blue" ng-click="ctrl.date.eventTimen = true"> <i class="fa fa-calendar"></i>
								</div>
							</div>
							
					
							
							
							
							<div class="col-md-6">
								<div class="form-group">
									<label for="af1"> </label> 
									<select ng-model="custData.referral" class="form-control" ng-options="x.name for x in referralData1 track by x.id" ng-change = "addnewReferral(x)" name="refferalId" id="refferalId"  required>
									<option ng-click="newCustomerAddModal()" value="">--Transporter Name  --</option>
									</select>
								</div>
							</div>
							
									 <div class="col-md-6">
								<div class="form-group">
									<label for="af1">Truck no. </label> <input type="text"
										class="form-control"  id="af1"
										ng-model="itemdata.trukno" placeholder="">
								</div>
							</div>
							
								<div class="col-md-6">
								<div class="form-group">
									<label for="af1">Date of arrival at Rly Store </label> <input type="text"
										class="form-control"  id="afy"
										ng-model="itemdata.dateofarrivalrlyreceipt" datetime-picker="yyyy-MM-dd " size="3" ng-model="creation_datek" is-open="ctrl.date.eventTimep" /> 									
										<span class="input-group-btn">
										<button type="button" class="btn btn-blue" ng-click="ctrl.date.eventTimep = true"> <i class="fa fa-calendar"></i>
								</div>
							</div>
							
								<div class="col-md-6">
								<div class="form-group">
									<label for="af1">Date of Rly receipt </label> <input type="text"
										class="form-control"  id="afo"
										ng-model="itemdata.dateofrlyreceipt" datetime-picker="yyyy-MM-dd " size="3" ng-model="creation_datet" is-open="ctrl.date.eventTimek" /> 									
										<span class="input-group-btn">
										<button type="button" class="btn btn-blue" ng-click="ctrl.date.eventTimek = true"> <i class="fa fa-calendar"></i>
								</div>
							</div>
							
						
							
							<div class="col-md-6">
								<div class="form-group">
									<label for="af1">Bill no </label> <input type="text"
										class="form-control"  id="af1"
										ng-model="itemdata.billno" placeholder="">
								</div>
							</div>
							
							
					
							
							
								<div class="col-md-6">
								<div class="form-group">
									<label for="af1">Bill QTY </label> <input type="text"
										class="form-control"  id="af1"
										ng-model="itemdata.billqty" placeholder="">
								</div>
							</div>
							
							<div class="col-md-12">
								<div class="form-group" align="right">

									<a class="btn btn-primary pad40L pad40R mrg5L"
										ng-click="updateSupplyData(itemdata)"> Save and Continue</a>


								</div>
							</div>


						</div>
                            </div>
                            </div>
                            </div>
                            
                        </div>
                        
				</div>
				
				</section>
