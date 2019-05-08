
     <!-- Content Header (Page header) -->
                      <!--Form and Application Button-->
        <section class="content" ng-show="projectaddshow">
            <div class="row">
                <div class="col-md-12">
                <form ng-submit="projectAdd(p)" class="col-md-12" name="ProjectForm">
                    <div class="box box-primary">
                        <div class="box-header with-border">
                            <h3 class="box-title">Project Details Form</h3>
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
										<label for="af1">Project Code </label>
										<input type="text" class="form-control" ng-model="p.projectCode"af1" placeholder="">
									</div>									
								</div>
								
								<div class="col-md-6">									
									<div class="form-group">
										<label for="af3">Tender Name </label>
										<input type="text" class="form-control" ng-model="p.projectName" id="af3" placeholder="">
									</div>									
								</div>
								
								
							 <div class="col-md-12">
							  <a id="eiworkadd" style = "cursor: pointer" >EI Work</a>									
									<div id="eiwork" class="form-group">
									
									 <input type="text" class="form-control" ng-model="p.projectName" id="af3" placeholder="Add Location"> 

									</div>									
							</div>
								
								
							  <div class="col-md-12">
							  <a id="locationadd" style = "cursor: pointer" >Add Location</a>									
									<div id="locationfield" class="form-group">
									
<!-- 									 <input type="text" class="form-control" ng-model="p.projectName" id="af3" placeholder="Add Location"> -->
										
										
									</div>									
								</div>
								
								
								<div class="col-md-6">									
									<div class="form-group">
										<label for="af4">Details </label>
										
										
										
										<input type="text" class="form-control" id="af4" placeholder="">
										
										
									</div>									
								</div>								
								<div class="col-md-6">									
									<div class="form-group">
										<label for="datepicker">Date </label>
										 <div class="input-group date">
                                            <div class="input-group-addon"> <i class="fa fa-calendar"></i> </div>
										<input type="text" class="form-control" ng-model="p.creationDate" id="af5" placeholder="">
										</div>
									</div>									
								</div>
								
								
								
                            </div>
                        </div>
                        <div >
							<div class="box-footer" align="left">
								<button class="btn btn-primary pad40L pad40R mrg5L" ng-click="addItemModal()" >
			                  	Add Item</button>
							</div>
							
							<div id="ad_cart" class="form-group input-group-sm" ng-show="itemShow">
							<div class="col-sm-12 ">
							
							<table class="table" ng-table="itemMenuTable" >
  <thead class="thead-dark" style="width: 100%">
    <tr>
      <th scope="col">Sl No.</th>
      <th scope="col">Item Name</th>
      <th scope="col">Item Type</th>
      <th scope="col">Select</th>
    </tr>
  </thead>
  <tbody id="rowgen">
	                             <tr align="center" ng-repeat="datas in $data | filter : keyword">
				
									<td   >Free Style</td>
									
									<td  > 
									
									<div ng-if="datas[3].id==null" >
									<input type="text" value="0"/>
									<input type="hidden" name='itemids' value='0' readonly='readonly' />
									</div>
									
									<div ng-if="datas[3].item_name!=null" >
									<input type="text" value=" {{datas[3].item_name}}"/>
									<input type="hidden" name='itemids' value='{{datas[3].id}}' readonly='readonly' />
									</div>
									
								   </td>
						
									<td  >  
									
									<div ng-if="datas[0].desc==null" >
									<input type="text" name='descs' value="0"/>
									</div>
									
									<div ng-if="datas[0].desc!=null" >
									<input type="text" name='descs' value=" {{datas[0].desc}}"/>
									</div>
									
									</td>
									<td   > 
									
									
									<div ng-if="datas[2].cat_name==null" >
									<input type="text" value="0"/>
									<input type="hidden" name='categoryids' value='0' readonly='readonly'/>
									</div>
									
									<div ng-if="datas[2].cat_name!=null" >
									<input type="text" value=" {{datas[2].cat_name}}"/>
									<input type="hidden" name='categoryids' value='{{datas[2].id}}' readonly='readonly'/>
									</div>
									
									</td>
									<td   >  <input type="text" name='quantitys' value=" {{datas[0].quantity}}"/></td>
									<td   >  <input type="text" name='calcprice' onkeyup='totalAdormentCalc()' value=" {{datas[0].price}}"/></td>
									<td   ><button onclick='deleteCakeRow(this)' >Delete </button></td>
								
								 </tr>

 

  </tbody>
  <tfoot>
  <tr>
  <td colspan="2"> <input type="button" class="btn btn-blue pull-left" ng-click="closeItemCart()"  value="close"/>
  </td>
  </tfoot>
</table>
							<script type="text/javascript">
							</script>
							
							</div>
							</div>
							
							
							
							
							
							
							
							
							
							
							
							
							
							
							
							
							
							
							
							
						    <div class="box-footer" align="right">
							<button type="submit" class="btn btn-primary pad40L pad40R mrg5L">Submit</button>
						    </div>
                    </div>
                </div>                
            </div>
        </section>
        
        <script type="text/javascript">
        var counter=0;
        $("#locationadd").click(function()
        {
        	  $("#locationfield").append(" <div id=c"+counter+"><input  type=text class=form-control ng-model=p.projectName id=af3 placeholder='Add location' > <a id=r"+counter+" onclick=remove('"+counter+"') style = cursor:pointer >Remove</a> <hr/></div>");
        	  counter=counter+1;
        }); 
        
        
        function remove(count)
        {
        	  $('#c'+count).remove();
        	
        }
        
        
        
        
        $("#locationadd").click(function()
                {
                	  $("#locationfield").append(" <div id=c"+counter+"><input  type=text class=form-control ng-model=p.projectName id=af3 placeholder='Add location' > <a id=r"+counter+" onclick=remove('"+counter+"') style = cursor:pointer >Remove</a> <hr/></div>");
                	  counter=counter+1;
                }); 
                
                
                function remove(count)
                {
                	  $('#c'+count).remove();
                	
                }
        

        </script>
        
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    <div id="itemModal" class="modal fade" >
    <div class="modal-dialog" style="max-width: 70%" role="document"  >
        <div class="modal-content" style="width: 864px;height:300px">
            <div class="modal-header" style="background-color: #bfa8a3">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                <h4 class="modal-title">Items</h4>
            </div>
            <div class="modal-body" style="background-color: white; ">
			
         

             
		                                       
            </div>
        </div>
    </div>
</div>