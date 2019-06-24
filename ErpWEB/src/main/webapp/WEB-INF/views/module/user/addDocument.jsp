
<!-- Content Header (Page header) -->
<!--Form and Application Button-->
<section class="content" >
	<div class="row">
		<div class="col-md-12">
			<form ng-submit="saveDocument()" class="col-md-12" name="ProjectForm" enctype="multipart/formData">
				<div class="box box-primary">
					<div class="box-header with-border">
						<h3 class="box-title">Upload Document</h3>
						<div class="box-tools pull-right">
							<button type="button" ng-click="projectlistload()"
								class="btn btn-box-tool" data-widget="back">
								<i class="fa fa-reply"> </i> Back
							</button>
						</div>
					</div>
					<!-- /.box-header -->
					<div  class="box-body">
						<div class="row">
                            <div class="col-md-12">
								<div class="form-group">
									<label for="af3">Document Name</label>
									<input type="text"
										class="form-control" ng-model="file.documentName" no-validate id="af2"
										placeholder="">
								</div>
							</div>


							<div class="col-md-12">
								<div class="form-group">
									<label for="af4">Document  </label>
									
									 <button class="button"
										class="form-control"  ngf-select ng-model="file.document"  name="file" id="file"  id="af4"
										placeholder="">Document</button>
										<input type="text"
										class="form-control"id="fileContent"  ng-model="file.document" id="fileName"
										placeholder="">
										
								</div>
							</div>
							
							<div class="box-footer" align="right">
									<button type="submit" id="btprsave" class="btn btn-primary pad40L pad40R mrg5L">Save project</button>
							</div>
							<div class="col-md-12" id="progress">
								
							</div>
		

						</div>
					</div>
				</div>
			
			</form>
		</div>
	</div>

</section>


<script type="text/javascript" src="/js/moduleJs/project_JS_User.js"></script>