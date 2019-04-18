 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html>
<html lang="en" ng-app="adminApp" ng-controller="adminCtrl">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">
<title>Cake Shop Manager</title>
<link href="http://fonts.googleapis.com/css?family=Open+Sans:400,800italic,800,700italic,700,600italic,600,400italic,300italic,300" rel="stylesheet" type="text/css">
<link rel="stylesheet" type="text/css" href="/css/font-awesome.css">
<link rel="stylesheet" type="text/css" href="/css/icofont.css">

<!-- Bootstrap core CSS-->
<!-- <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet"> -->
<link rel="stylesheet" type="text/css" href="/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="/css/owl.carousel.css">
<link rel="stylesheet" type="text/css" href="/css/owl.theme.css">
<link rel="stylesheet" type="text/css" href="/css/highcharts.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/ng-table/1.0.0/ng-table.css">
<link rel="stylesheet" type="text/css" href="/css/dataTables.bootstrap.min.css"> 
<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/fixedheader/3.1.2/css/fixedHeader.bootstrap.css">
<link rel="stylesheet" type="text/css" href="/css/responsive.bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="/css/style.css">
<link rel="stylesheet" type="text/css" href="/css/theme.css">


<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.4.0/css/font-awesome.min.css">
<link rel="stylesheet" href="/css/flora/froala_editor.css">
<link rel="stylesheet" href="/css/flora/froala_style.css">
<link rel="stylesheet" href="/css/flora/plugins/code_view.css">
<link rel="stylesheet" href="/css/flora/plugins/colors.css">
<link rel="stylesheet" href="/css/flora/plugins/emoticons.css">
<link rel="stylesheet" href="/css/flora/plugins/image_manager.css">
<link rel="stylesheet" href="/css/flora/plugins/image.css">
<link rel="stylesheet" href="/css/flora/plugins/line_breaker.css">
<link rel="stylesheet" href="/css/flora/plugins/table.css">
<link rel="stylesheet" href="/css/flora/plugins/char_counter.css">
<link rel="stylesheet" href="/css/flora/plugins/video.css">
<link rel="stylesheet" href="/css/flora/plugins/fullscreen.css">
<link rel="stylesheet" href="/css/flora/plugins/file.css">
<link rel="stylesheet" href="/css/flora/plugins/quick_insert.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/codemirror/5.3.0/codemirror.min.css">

</head>

<style>

 [ng\:cloak], [ng-cloak], .ng-cloak {
  display: none !important;
}

.full .modal-dialog{
    width:auto;
    margin-left:20px;
    margin-right:20px;
     -webkit-transform: translate(0,0) !important;
  -ms-transform: translate(0,0) !important;
  transform: translate(0,0) !important;
}
.modal{
overflow : auto;
}
.modal  {
    background-color: rgba(4, 4, 4, 0.8); 
    }
    .modal-dialog.modal-lg {
  -webkit-transform: translate(0,0) !important;
  -ms-transform: translate(0,0) !important;
  transform: translate(0,0) !important;
}



  .modal-dialog.modal-sm {
  -webkit-transform: translate(0,0) !important;
  -ms-transform: translate(0,0) !important;
  transform: translate(0,0) !important;
}

 .modal-dialog {
  -webkit-transform: translate(0,0) !important;
  -ms-transform: translate(0,0) !important;
  transform: translate(0,0) !important;
}
   .redFont {
	color: red;
}        
</style>

<script type="text/ng-template" id="error-messages">
					<div ng-message ="required">
						This field is Mandatory
					</div>
					<div ng-message ="email">
						Enter Valid Email ID
					</div>
					<div ng-message ="number">
						Enter Valid Number
					</div>
					<div ng-message  = "minlength">
						Please Enter atleast 3 Character
					</div>
					<div ng-message  = "maxlength">
						Please Enter atleast 1 Character
					</div>
</script>


<script type="text/javascript">

history.pushState(null, null, location.href);
window.onpopstate = function () {
    history.go(1);
};


</script>