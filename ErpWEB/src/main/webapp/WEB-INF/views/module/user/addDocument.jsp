
<!-- Content Header (Page header) -->
<!--Form and Application Button-->
<section class="content" >
	<div class="row">
		<div class="col-md-12">
			<form ng-submit="projectAdd(f)" class="col-md-12" name="ProjectForm" enctype="multipart/formData">
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
										class="form-control" ng-model="f.documentName" no-validate id="af2"
										placeholder="">
								</div>
							</div>


							<div class="col-md-12">
								<div class="form-group">
									<label for="af4">Document  </label>
									<input type="text"
										class="form-control"id="fileContent"  ng-model="f.document" id="af3"
										placeholder="">
									 <input type="file"
										class="form-control"  onChange="angular.element(this).scope().fileUpload(this)"  name="file" id="file"  id="af4"
										placeholder="">
										
								</div>
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