 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
 
 
 </div>
 
 
 
  <div id="saveMessageModal" class="modal fade">
    <div class="modal-dialog" style="max-width: 70%"  role="document">
        <div class="modal-content" style="width: 300px; height:110px">
             <div class="modal-header" align="right" style="background-color: #bfa8a3">
             <h1></h1>
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
               
            </div>
            <div class="modal-body" style="background-color: white">
			
             		<div align="center" class="mater">
				<div class="col-sm-12">
					
					<b style="color:green; font:large;" >	Updated Successfully !!</b>

				</div>
			</div>

            </div>
        </div>
    </div>
</div>
 
   <div id="saveMessageModalError" class="modal fade">
    <div class="modal-dialog" style="max-width: 70%"  role="document">
        <div class="modal-content" style="width: 300px; height:110px">
             <div class="modal-header" align="right" style="background-color: #bfa8a3">
             <h1></h1>
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
               
            </div>
            <div class="modal-body" style="background-color: white">
			
             		<div align="center" class="mater">
				<div class="col-sm-12">
					
					<b style="color:red; font:large;" >	Sorry, Some technical error occur !!</b>

				</div>
			</div>

            </div>
        </div>
    </div>
</div>





 

  <script src="/lib/jquery.1.11.3.min.js"></script> 
    <script src="/lib/popper.min.js"></script> 
    <script src="/lib/bootstrap.min.js"></script> 
   
    <script src="/lib/css3-animate-it.js"></script> 
    <script src="/lib/docs.min.js"></script> 
    <script src="/lib/owl.carousel.js"></script>    
    <script src="/lib/jquery.dataTables.min.js"></script> 
    <script src="/lib/dataTables.bootstrap.min.js"></script> 
    <script src="/lib/dataTables.fixedHeader.min.js"></script> 
    <script src="/lib/dataTables.responsive.min.js"></script> 
    <script src="/lib/responsive.bootstrap.min.js"></script> 
    <script src="/lib/jquery.raty-fa.js"></script>
	<script src="/lib/highcharts.js"></script> 
    <script src="/lib/theme.js"></script> 
    <script src="/lib/ie10-viewport-bug-workaround.js"></script> 
     <script src="/lib/angular.js"></script>
      <script src="/lib/ng-table.min.js"></script>
      <script src="/lib/angular-route.min.js"/></script>
      <script src="/lib/moment.js"/></script>
      <script src="/lib/angular-model.js"/></script>
      <script src="/lib/angular-moment.min.js"/></script>
      <script src="/lib/ng-file-upload-all.min.js"/></script>
      <script src="/lib/ng-file-upload-shim.min.js"/></script>
    <script src="/js/routeNav/adminRouteNav.js"></script>
     <script src="/js/controller/adminCtrl.js"/></script>
     	<script src="/lib/checkout.js"></script>	
     	 <script src="/lib/boostrap-UI.js"></script>
     	 <script src="/lib/angular-messages.js"/></script>
     	  <script src='/lib/jsPdf.min.js'></script>
    <!-- <script>
		$(document).ready( function() {
			$(document).on('change', '.btn-file :file', function() {
			var input = $(this),
				label = input.val().replace(/\\/g, '/').replace(/.*\//, '');
			input.trigger('fileselect', [label]);
			});

			$('.btn-file :file').on('fileselect', function(event, label) {

				var input = $(this).parents('.input-group').find(':text'),
					log = label;

				if( input.length ) {
					input.val(log);
				} else {
					if( log ) alert(log);
				}

			});
			function readURL(input) {
				if (input.files && input.files[0]) {
					var reader = new FileReader();

					reader.onload = function (e) {
						$('#img-upload').attr('src', e.target.result);
					}

					reader.readAsDataURL(input.files[0]);
				}
			}

			$("#imgInp").change(function(){
				readURL(this);
			}); 	
		});
	</script> 
	<script>
		$(function(){
			Highcharts.chart('orderAndPayment', {
				chart: {
					type: 'column',
					height: 383,
					borderWidth: 1,
					borderColor: '#d8d8d8',
					margin: [45, 0, 0, 0]
				},
				title: {
					text: false
				},
				subtitle: {
					text: false
				},
				legend: {
					align: 'center',
					verticalAlign: 'top',
					layout: 'horizontal',
					y: -15,
					symbolHeight:20,
            		borderWidth: 0,
					symbolHeight: 12,
					symbolWidth: 12,
					symbolRadius: 0
				},
				xAxis: {
					categories:false,
					crosshair: false,
					 labels: {
						enabled: false
					},
				},
				yAxis: {
					min: 0,
					title: {
						text: false
					},
					gridLineWidth: 1,
				},
				tooltip: {
					headerFormat: '<span style="font-size:10px">{point.key}</span><table>',
					pointFormat: '<tr><td style="color:{series.color};padding:0">{series.name}: </td>' +
						'<td style="padding:0"><b>{point.y:.1f} mm</b></td></tr>',
					footerFormat: '</table>',
					shared: true,
					useHTML: true
				},
				plotOptions: {
					column: {
						pointPadding: 0.06,
						borderWidth: 0
					},
					series: {
						groupPadding: 0.06
					}
				},
				series: [{
					name: 'Tokyo',
					data: [49.9, 71.5, 106.4, 129.2]

				}, {
					name: 'New York',
					data: [83.6, 78.8, 98.5, 93.4]

				}, {
					name: 'London',
					data: [48.9, 38.8, 39.3, 41.4]

				}, {
					name: 'Berlin',
					data: [42.4, 33.2, 34.5, 39.7]

				}]
			});
		});
	</script> -->
	
	 <c:url value="/logout" var="logoutUrl" />
	<form action="${logoutUrl}" method="post" id="logoutForm">
		<input type="hidden" name="${_csrf.parameterName}"
			value="${_csrf.token}" />
	</form>
	<script>
		function formSubmit() {
			document.getElementById("logoutForm").submit();
		} 
	</script>
	
	
	
<!--   <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script> -->

  <script type="text/javascript" src="/lib/flora/froala_editor.min.js"></script>
  <script type="text/javascript" src="/lib/flora/plugins/align.min.js"></script>
  <script type="text/javascript" src="/lib/flora/plugins/char_counter.min.js"></script>
  <script type="text/javascript" src="/lib/flora/plugins/code_beautifier.min.js"></script>
  <script type="text/javascript" src="/lib/flora/plugins/code_view.min.js"></script>
  <script type="text/javascript" src="/lib/flora/plugins/colors.min.js"></script>
  <script type="text/javascript" src="/lib/flora/plugins/draggable.min.js"></script>
  <script type="text/javascript" src="/lib/flora/plugins/emoticons.min.js"></script>
  <script type="text/javascript" src="/lib/flora/plugins/entities.min.js"></script>
  <script type="text/javascript" src="/lib/flora/plugins/file.min.js"></script>
  <script type="text/javascript" src="/lib/flora/plugins/font_size.min.js"></script>
  <script type="text/javascript" src="/lib/flora/plugins/font_family.min.js"></script>
  <script type="text/javascript" src="/lib/flora/plugins/fullscreen.min.js"></script>
  <script type="text/javascript" src="/lib/flora/plugins/image.min.js"></script>
  <script type="text/javascript" src="/lib/flora/plugins/image_manager.min.js"></script>
  <script type="text/javascript" src="/lib/flora/plugins/line_breaker.min.js"></script>
  <script type="text/javascript" src="/lib/flora/plugins/inline_style.min.js"></script>
  <script type="text/javascript" src="/lib/flora/plugins/link.min.js"></script>
  <script type="text/javascript" src="/lib/flora/plugins/lists.min.js"></script>
  <script type="text/javascript" src="/lib/flora/plugins/paragraph_format.min.js"></script>
  <script type="text/javascript" src="/lib/flora/plugins/paragraph_style.min.js"></script>
  <script type="text/javascript" src="/lib/flora/plugins/quick_insert.min.js"></script>
  <script type="text/javascript" src="/lib/flora/plugins/quote.min.js"></script>
  <script type="text/javascript" src="/lib/flora/plugins/table.min.js"></script>
  <script type="text/javascript" src="/lib/flora/plugins/save.min.js"></script>
  <script type="text/javascript" src="/lib/flora/plugins/url.min.js"></script>
  <script type="text/javascript" src="/lib/flora/plugins/video.min.js"></script>
  <script type="text/javascript" src="/lib/flora/plugins/code_view.min.js"></script>

<script type="text/javascript" src="/js/moduleJs/project_JS_User.js"></script>
<script type="text/javascript" src="/js/moduleJs/projectValidation.js"></script>

<script src="/lib/wysihtml/dist/wysihtml.min.js"></script>
<script src="/lib/wysihtml/parser_rules/advanced_unwrap.js"></script>


</body>
</html>