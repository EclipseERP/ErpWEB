<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<section class="content" >
            <div class="row">
                <div class="col-md-12">
                    <div class="box box-primary">
                        <div class="box-header with-border">
                           <h3 class="box-title">LOA No :  <b>{{loano}}  </b> &nbsp; Date :  <b>{{projectdate}}  </b> </h3>
                            <div class="box-tools pull-right">
                 
                   
                           
                            			
							   <button type="button" ng-click="projectlistload()"
								class="btn btn-box-tool" data-widget="back">
								 Back
						     	</button>
		
				
					
								
								</div>
                            </div>
                            
                                <div class="box-body">
                            <div class="row">
                           						
							<div class="col-md-6">
								<div class="form-group">
									<label for="af1">SCH Unit Rate </label> <input type="text"
										class="form-control"  id="af1"
										value="{{projectcode}}" placeholder="">
								</div>
							</div>

                     


                       	<div class="col-md-6">
								<div class="form-group">
									<label for="af1">Amount </label> <input type="text"
										class="form-control"  id="af1"
										value="{{projectcode}}" placeholder="">
								</div>
							</div>




                       	<div class="col-md-6">
								<div class="form-group">
									<label for="af1">% Above </label> <input type="text"
										class="form-control"  id="af1"
										value="{{projectcode}}" placeholder="">
								</div>
							</div>
							
							 	<div class="col-md-6">
								<div class="form-group">
									<label for="af1">All inclusive rate </label> <input type="text"
										class="form-control" readonly="readonly" id="af1"
										value="{{projectcode}}" placeholder="">
								</div>
							</div>
							
							
							<div class="col-md-6">
								<div class="form-group">
									<label for="af1">Supplier Name  </label> <input type="text"
										class="form-control"  id="af1"
										value="{{projectcode}}" placeholder="">
								</div>
							</div>
							
							
									<div class="col-md-6">
								<div class="form-group">
									<label for="af1">Supplier Address </label> <input type="text"
										class="form-control"  id="af1"
										value="{{projectcode}}" placeholder="">
								</div>
							</div>
							
									<div class="col-md-6">
								<div class="form-group">
									<label for="af1">Rate </label> <input type="text"
										class="form-control" readonly="readonly" id="af1"
										value="{{projectcode}}" placeholder="">
								</div>
							</div>
							
							
							<div class="col-md-6">
								<div class="form-group">
									<label for="af1">Details of IC </label> <input type="text"
										class="form-control"  id="af1"
										value="{{projectcode}}" placeholder="">
								</div>
							</div>
					


                              <div class="col-md-6">
								<div class="form-group">
									<label for="af1">Date of Supply </label> 
									<input type="text"
										class="form-control"  id="af1"
										value="{{projectcode}}" datetime-picker="yyyy-MM-dd " size="3" ng-model="creation_date" is-open="ctrl.date.eventTimee" /> 									
										<span class="input-group-btn">
										<button type="button" class="btn btn-blue" ng-click="ctrl.date.eventTimee = true"> <i class="fa fa-calendar"></i>
								</div>
							</div>
							
							
							

                              <div class="col-md-6">
								<div class="form-group">
									<label for="af1">Supply qty </label> <input type="text"
										class="form-control"  id="af1"
										value="{{projectcode}}" placeholder="">
								</div>
							</div>
							
							          <div class="col-md-6">
								<div class="form-group">
									<label for="af1">Balance QTY </label> <input type="text"
										class="form-control"  id="af1"
										value="{{projectcode}}" placeholder="">
								</div>
							</div>
							
						  <div class="col-md-6">
								<div class="form-group">
									<label for="af1">Place of Delivery </label> <input type="text"
										class="form-control"  id="af1"
										value="{{projectcode}}" placeholder="">
								</div>
							</div>
							
							
							  <div class="col-md-6">
								<div class="form-group">
									<label for="af1">Way Bill No Date </label> <input type="text"
										class="form-control"  id="af1"
										value="{{projectcode}}" datetime-picker="yyyy-MM-dd " size="3" ng-model="creation_date" is-open="ctrl.date.eventTimen" /> 									
										<span class="input-group-btn">
										<button type="button" class="btn btn-blue" ng-click="ctrl.date.eventTimen = true"> <i class="fa fa-calendar"></i>
								</div>
							</div>
							
							 <div class="col-md-6">
								<div class="form-group">
									<label for="af1">Truck no. </label> <input type="text"
										class="form-control"  id="af1"
										value="{{projectcode}}" placeholder="">
								</div>
							</div>
							
							
							
							<div class="col-md-6">
								<div class="form-group">
									<label for="af1">Transporter </label> <input type="text"
										class="form-control"  id="af1"
										value="{{projectcode}}" placeholder="">
								</div>
							</div>
							
								<div class="col-md-6">
								<div class="form-group">
									<label for="af1">Date of arrival at Rly Store </label> <input type="text"
										class="form-control"  id="afy"
										value="{{projectcode}}" datetime-picker="yyyy-MM-dd " size="3" ng-model="creation_datek" is-open="ctrl.date.eventTimep" /> 									
										<span class="input-group-btn">
										<button type="button" class="btn btn-blue" ng-click="ctrl.date.eventTimep = true"> <i class="fa fa-calendar"></i>
								</div>
							</div>
							
								<div class="col-md-6">
								<div class="form-group">
									<label for="af1">Date of Rly receipt </label> <input type="text"
										class="form-control"  id="afo"
										value="{{projectcode}}" datetime-picker="yyyy-MM-dd " size="3" ng-model="creation_datet" is-open="ctrl.date.eventTimek" /> 									
										<span class="input-group-btn">
										<button type="button" class="btn btn-blue" ng-click="ctrl.date.eventTimek = true"> <i class="fa fa-calendar"></i>
								</div>
							</div>
							
							<div class="col-md-6">
								<div class="form-group">
									<label for="af1">Date of Rly receipt </label> <input type="text"
										class="form-control"  id="afr"
										value="{{projectcode}}" datetime-picker="yyyy-MM-dd " size="3" ng-model="creation_datey" is-open="ctrl.date.eventTimel" /> 									
										<span class="input-group-btn">
										<button type="button" class="btn btn-blue" ng-click="ctrl.date.eventTimel = true"> <i class="fa fa-calendar"></i>
								</div>
							</div>
							
							<div class="col-md-6">
								<div class="form-group">
									<label for="af1">Bill no </label> <input type="text"
										class="form-control"  id="af1"
										value="{{projectcode}}" placeholder="">
								</div>
							</div>
							
							
								<div class="col-md-6">
								<div class="form-group">
									<label for="af1">Date </label> <input type="text"
										class="form-control"  id="afv"
										value="{{projectcode}}" datetime-picker="yyyy-MM-dd " size="3" ng-model="creation_date" is-open="ctrl.date.eventTimeh" /> 									
										<span class="input-group-btn">
										<button type="button" class="btn btn-blue" ng-click="ctrl.date.eventTimeh = true"> <i class="fa fa-calendar"></i>
								</div>
							</div>
							
							
								<div class="col-md-6">
								<div class="form-group">
									<label for="af1">Bill QTY </label> <input type="text"
										class="form-control"  id="af1"
										value="{{projectcode}}" placeholder="">
								</div>
							</div>
							
							<div class="col-md-12">
								<div class="form-group" align="right">

									<a class="btn btn-primary pad40L pad40R mrg5L"
										ng-click="projectSecondPartshow()"> Save and Continue</a>


								</div>
							</div>


						</div>
                            </div>
                            </div>
                            
                        </div>
                        
				</div>
				
				</section>
