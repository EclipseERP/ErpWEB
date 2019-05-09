/**
 *  Author : Pradipto Roy 
 *  Date : 07-01-2019
 */


// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
// ---------------------------------------------------------- Jquery written for
// Calendar functionality--------------------------------------------
function calendarLoad(apdata)
{

// $.get("/appointment/getAppointmentCalendar_Data/user", function(apdatas,
// status)
	
	   $.get("/appointment/getOrder_data/user", function(apdatas, status)
			    {
    	         
    	    	 	 $('#calendar').fullCalendar({
    	    	 		  defaultDate: $('#calendar').fullCalendar('today'),
    	    	 	      editable: true,
    	    	 	      eventLimit: true,
    	    	 	      
    	    	 	      eventSources:[
    	    	 	    	           apdata,
    	    	 	    	           apdatas
    	    	 	    	           ],
    	    	 	      
    	    	 	      eventClick: function(calEvent, jsEvent, view) 
    	    	 	      {
    	    	 	       loaddata(calEvent.id,calEvent.title);
    	    	 	   
    	    	 	      },
    	    	 	      eventColor: '#ffff1a',
    	    	 	      timeFormat: 'H(:mm)' ,
    	    	 	      displayEventTime: false,
    	    	 	      dayRender: function(date, cell)
    	    	 	      {
    	    	 	      if (moment().diff(date,'days') > 0)
    	    	 	      {
    	    	 	       cell.css("background-color","#FFF5EE");
    	    	 	      }
    	    	 	    },
    	    	 	      
    	    	 	   });
			    })
    	    
	}
/*
 * ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ Calendar Data population load
 * ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
 */
function loaddata(id,title)
{
	  var titles = title.substring(0, 1);
	  if(titles!="D")
		 {
		  $.get("/appointment/getAppointmentData_ById/"+id, function(data, status)
	    	      {
		          
		          $("#clientname").html(data[0].bride_fname+" "+data[0].bride_lname)
		          $("#spousename").html(data[0].groom_fname+" "+data[0].groom_lname)
		          $("#note").html(data[0].note)
		             if(data[0].cancel_apoint==1)
		        	  {
		        	  $("#cancel_apoint").html("Yes")
		        	  }
		             else
		              {
		              $("#cancel_apoint").html("No")
		            }
		          if(data[0].rescdule_appoint==1)
	        	  {
	        	  $("#rescdule_appoint").html("Yes")
	        	  }
	             else
	              {
	              $("#rescdule_appoint").html("No")
	            }
	    	      
		          $("#address1").html(data[0].address1)
		          $("#address2").html(data[0].address2)
		          $("#city").html(data[0].city)
		          $("#state").html(data[0].state)
		          $("#zip").html(data[0].zip)
		          $("#email").html(data[0].bride_email)
		          $("#phonenumber").html(data[0].phone_number)
		      
		             
		            if(data[0].text_to_phone==1)
		        	  {
		        	  $("#texttophone").html("Yes")
		        	  }
		             else
		              {
		              $("#texttophone").html("No")
		            }
		          
		          $("#theme").html(data[0].theme)
		          
		          $("#wedingdate").html(moment(data[0].weeding_date).format('YYYY-MM-DD'))
		          $("#noofserving").html(data[0].no_of_servings)
		          $("#noofattendconsulatation").html(data[0].no_attend_recption)
		          $("#appointmentdate").html(moment(data[0].appointment_date).format('YYYY-MM-DD'))
		          $("#appointment_time").html(data[0].appointment_time)
		          $("#cid").val(data[0].id) 
		          
		            if(data[0].convertedTocust==1)
		        	  {
		        	  $("#convert").hide();
		        	  }
		          
	    	      });
	
	$("#myModal").modal();
		 }
	  else
		  {
		  
		  $("#myModal").hide();  
		  $("#cakedelivery_modal").modal();  
		  $.get("/appointment/getOrder_data_by_Id/"+id, function(data, status)
		  { 
		  console.log("order data...",data[0]) 
		  $("#clientname2").html(data[0][1].brideName);
		  $("#spousename2").html(data[0][1].groomName);
		  $("#address_cust").html(data[0][1].address);
		  $("#phonenumber2").html(data[0][1].phoneNumber)	  
		  $("#email2").html(data[0][1].brideEmail)	  
	      $("#deliverydate").html(moment(data[0][2].eventDate).format('YYYY-MM-DD')) 
		  $("#deliveryTime").html(moment(data[0][2].eventTime).format('hh:mm:ss A')) 	
	      
		  })
				  
		  }

}
/* ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ */

function printDiv() 
{

  var divToPrint=document.getElementById('myModal');
  var newWin=window.open('','Print-Window');
  newWin.document.open();
  newWin.document.write('<html><body onload="window.print()">'+divToPrint.innerHTML+'</body></html>');
  newWin.document.close();
  setTimeout(function(){newWin.close();},10);

}

// ----------------------------------------------------------------------------------------------------------------------------------------------------------------------
/*
 * %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% Apointment Module
 * script ends here
 * %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
 */  


function updateData(updatedcontent,tableid,tempheading_get,username_get)
{
	  $.ajax({
	         type: "POST",
	         url: "/emailtemplate/updateTemplateTableForUser?",
	         data: {
	             emailcontent: updatedcontent,
	             id:tableid,
	             tempheading:tempheading_get ,
	             username:username_get
	         },
	         cache: false,
	         success:function()
	         {
	          alert('save');
	          
	         },
	         error: function(){
	             alert('error');
	             }
	     });
}

// +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
// ----------------------------------------------------------- Java script
// function to compose email
// ---------------------------------------------------------------
// +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
var g=new Array();

function loadEmailsToCompseTextBox(checkboxname)
{
	var valueCheckFlag=0;
	
	var emailsbucket = new Array()
	var compaoseTexVal = $("#composetext");
	
	$("input:checkbox[name="+checkboxname+"]:checked").each(function()
	{
	var str = compaoseTexVal.val();
   
	if(!str.includes($(this).val()))
	{
		
    valueCheckFlag=1;	
	emailsbucket.push($(this).val());
	}

	});

	if(valueCheckFlag>0)
	{
	pushEmail_in_emailBucket(emailsbucket,compaoseTexVal)
	
	$("input:checkbox[name="+checkboxname+"]:not(:checked)").each(function()
	{
	removeEmail_from_emailBucket(emailsbucket,compaoseTexVal,$(this).val())
	});
	
	g=emailsbucket;
	}
	else
	{
		alert("You already added this email Id !!");
	}
}

function removeEmail_from_emailBucket(emailsbucket,compaoseTexVal,searchText)
{
	   for( var inc_r = 0; inc_r < emailsbucket.length-1; inc_r++)
	   { 

	   if ( emailsbucket[inc_r] === searchText) 
	   {
		emailsbucket.splice(inc_r, searchText); 
	   }
	   } 
	   compaoseTexVal.val("");
	   pushEmail_in_emailBucket(emailsbucket,compaoseTexVal);
}


function pushEmail_in_emailBucket(emailsbucket,compaoseTexVal)
{
	for(var inc=0;inc<emailsbucket.length;inc++ )
	{
	compaoseTexVal.val(compaoseTexVal.val() + emailsbucket[inc]+"," );
	}
}

function removeEmail_from_emailBucket_By_SingleUnit(checkboxname)
{
	
	$("input:checkbox[name="+checkboxname+"]:not(:checked)").each(function()
	 {	
		   var compaoseTexVal = $("#composetext");
		   for( var inc_r = 0; inc_r < g.length; inc_r++)
		   { 
    
		   if ( g[inc_r] === $(this).val()) 
		   {
			
		   var indexofvalue_match = g.indexOf($(this).val());	   
		   g.splice(inc_r, indexofvalue_match+1); 

		   }
		   } 
		   compaoseTexVal.val("");
		   for(var inc=0;inc<g.length;inc++ )
		   {
		   compaoseTexVal.val(compaoseTexVal.val() + g[inc]+"," );
		   }
	 });

}

function selectAllFireEvent(checkboxnames,evt)
{
	if(evt.checked)
	{
	$('input:checkbox[name='+checkboxnames+']').not(evt).prop('checked', evt.checked);
	}
    else
    {
    	var compaoseTexVal = $("#composetext");
    	$('input:checkbox[name='+checkboxnames+']').prop('checked',evt.checked);
    	removeEmail_from_emailBucket_By_SingleUnit(checkboxnames);
    }
}

function insert_merge_field(text) {
	 
	  var txtarea = document.getElementById("emailtempdata");
	  if (!txtarea) {
	    return;
	  }

	  var scrollPos = txtarea.scrollTop;
	  
	  var strPos = 0;
	  var br = ((txtarea.selectionStart || txtarea.selectionStart == '0') ?
	    "ff" : (document.selection ? "ie" : false));
	  if (br == "ie") {
	    txtarea.focus();
	    var range = document.selection.createRange();
	    range.moveStart('character', -strip_html_tags(txtarea.value).length);
	    strPos = range.text.length;
	  } else if (br == "ff") {
	    strPos = txtarea.selectionStart;
	  }

	  var front = (txtarea.value).substring(0, strPos);
	  var back = (txtarea.value).substring(strPos, txtarea.value.length);
	  txtarea.value = front + text + back;
	  
	  strPos = strPos + text.length;
	  if (br == "ie") {
	    txtarea.focus();
	    var ieRange = document.selection.createRange();
	    ieRange.moveStart('character', -txtarea.value.length);
	    ieRange.moveStart('character', strPos);
	    ieRange.moveEnd('character', 0);
	    ieRange.select();
	  } else if (br == "ff") {
	    txtarea.selectionStart = strPos;
	    txtarea.selectionEnd = strPos;
	    txtarea.focus();
	  }

	  txtarea.scrollTop = scrollPos;
	 
	  $('#emailtempdata').froalaEditor('html.set', strip_html_tags(txtarea.value));
	}



function strip_html_tags(str)
{
   if ((str===null) || (str===''))
       return false;
  else
   str = str.toString();
  return str.replace(/<[^>]*>/g, '');
}



// +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
// ----------------------------------------------------------- Java script
// function to compose email
// -----------------------------------------------------------
// +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++


/*---------------------------------------------------- Text validation here ---------------------------------------------------------------------------------------------*/
function isNumber(evt) {
    evt = (evt) ? evt : window.event;
    var charCode = (evt.which) ? evt.which : evt.keyCode;
    if (charCode > 31 && (charCode < 48 || charCode > 57)) {
        return false;
    }
    return true;
}

function totalAdormentCalc()
{
    var pricevalue=document.getElementsByName("calcprice")
    var totaladorment=0;
    for(var i=0;i<pricevalue.length;i++)
    	{
    totaladorment=parseFloat(totaladorment)	+ parseFloat(pricevalue[i].value)
    	}
    
    document.getElementById("totaladorment").value=totaladorment;
}

function deleteRow(x)
{
	
	 var index=$(x).closest('tr').index();
	 var price=document.getElementsByName("calcprice")[index].value;
	 var totaladr=document.getElementById("totaladorment").value;
	 document.getElementById("totaladorment").value=totaladr-price;
	 $(x).closest('tr').remove();
}


function deleteRowTemp(x)
{
	
	 $(x).closest('tr').remove();
}

//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ ERP JAVA ,JQuery codes++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

var counter=0;
$("#locationadd").click(function()
{
	  $("#locationfield").append(" <div id=c"+counter+"><input  type=text class=form-control ng-model=p.projectName id=af"+counter+" placeholder='Add location' > <a id=r"+counter+" onclick=remove('"+counter+"') style = cursor:pointer >Remove</a> <hr/></div>");
	  counter=counter+1;
}); 


function remove(count)
{
	  $('#c'+count).remove();
	
}

function removeItem(count)
{
	  $('#it'+count).remove();
	
}
var counterei=0;
$("#eiworkadd").click(function()
{
	  $("#eiwork").append(" <div id=cc"+counterei+"><input  type=text name=eiworks class=form-control ng-model=p.projectName id=af"+counterei+" placeholder='Add EI work details' > <a id=r"+counterei+" onclick=removeEiworks('"+counterei+"') style = cursor:pointer >Remove</a> <hr/></div>");
	  counterei=counterei+1;
}); 

function removeEiworks(count)
{
	  $('#cc'+count).remove();
	
}

//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ ERP JAVA ,JQuery codes++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

