/**
 *  Jquery Validation for Input textboxes
 *  Date :28-02-2019
 *  Author : Pradipto Roy (Sr.Java Developer)   
 */


// Only Number Validation +++++++++++++++++++++++++++++++++++++++++++++++++
function onlyNumberValidation(id,message)
{
	id="#"+id;
	var z = $(id).val();
	if(!/^[0-9]+$/.test(z))
	{
	 $(id).val("")
     $("#error").show();
     $("#error").html("<strong>"+message+"</strong>");
     $("#error").fadeIn();
     $("#error").fadeOut(8000);  
   
	}
}

// Phone number validation ++++++++++++++++++++++++++++++++++++++++++++++++++
function phoneNumberValidation(id,message)
{
	    var phoneno = /^\d{10}$/;  
	    var phone_val=$('#'+id).val();
	    if((phoneno.test(phone_val)))
	    {
	     return true;  
	    }  
	    else  
	    { 
	    	$('#'+id).val("")
	        $("#error").show();
	        $("#error").html("<strong>"+message+"</strong>");
	        $("#error").fadeIn();
	        $("#error").fadeOut(8000);  
	     return false;  
	    }
}

// Email Validation ++++++++++++++++++++++++++++++++++++++++++++++++++++++++

function emailValidation(id,message)
{
	id="#"+id;
	var z = $(id).val();

	if(!/^([\w-\.]+@([\w-]+\.)+[\w-]{2,4})?$/.test(z))
	{
	 $(id).val("")
     $("#error").show();
     $("#error").html("<strong>"+message+"</strong>");
     $("#error").fadeIn();
     $("#error").fadeOut(8000);  
   
	}

}

// Zip code validation +++++++++++++++++++++++++++++++++++++++++++++++++++++++

function zipCodeValidation(id,message,type)
{

	id="#"+id;
	var z = $(id).val();
	if(type=="indian")
	{
		if(!/^[1-9][0-9]{5}$/.test(z))
		{
		 $(id).val("")
	     $("#error").show();
	     $("#error").html("<strong>"+message+"</strong>");
	     $("#error").fadeIn();
	     $("#error").fadeOut(8000);  
	   
		}
	}
	if(type=="us")
	{
	// to be written later...	
	}
	
	
}


//Only Number and decimal Validation +++++++++++++++++++++++++++++++++++++++++++++++++
var validNumber = new RegExp(/^\d*\.?\d*$/);
var lastValid = document.getElementById("test1").value;
function validateNumber(elem) {
  if (validNumber.test(elem.value)) {
    lastValid = elem.value;
  } else {
    elem.value = lastValid;
  }
}



function isNumber(evt) {
    evt = (evt) ? evt : window.event;
    var charCode = (evt.which) ? evt.which : evt.keyCode;
    if (charCode > 31 && (charCode < 48 || charCode > 57)) {
        return false;
    }
    return true;
}



//Zip code validation +++++++++++++++++++++++++++++++++++++++++++++++++++++++

function zipCodeValidation_Divid(id,divid,message,type)
{
	id="#"+id;
	divid="#"+divid
	var z = $(id).val();
	
    var num = z;
    var  str = num.toString(),
    len = str.length;

    console.log("number length",len);
	
	if(type=="indian")
	{
		if(len>=3 && len<=9)
		{
	     $(divid).hide();
	   
		}
		else
			{
			 $(divid).css('height: 40px') 
		     $(divid).show();
		     $(divid).html("<strong>"+message+"</strong>");
		     $(divid).fadeIn();
			}
	}

	
	if(type=="us")
	{
	// to be written later...	
	}
	
	
}

//Email Validation With Div ++++++++++++++++++++++++++++++++++++++++++++++++++++++++

function emailValidation_Divid(id,divid,message)
{
	id="#"+id;
	divid="#"+divid;
	var z = $(id).val();

	if(!/^([\w-\.]+@([\w-]+\.)+[\w-]{2,4})?$/.test(z))
	{

     $(divid).show();
     $(divid).html("<strong>"+message+"</strong>");
     $(divid).fadeIn();
	}
	
	else
	{
	 $(divid).hide();
	}

}


//Phone number validation ++++++++++++++++++++++++++++++++++++++++++++++++++
function phoneNumberValidation_Divid(id,divid,message)
{
	    divid="#"+divid
	    var phoneno = /^\d{15}$/;  
	    var phone_val=$('#'+id).val();
	    
	    var num = phone_val
	    var  str = num.toString(),
	    len = str.length;

	    console.log("number length",len);
	    
	    if((phoneno.test(phone_val)))
	    {
	    $(divid).hide();
	     return true;  
	    } 
	    else if(len>=10 && len<15)
	    {
	    $(divid).hide();
	     return true;  
	    } 
	    else  
	    { 
	        $(divid).show();
	        $(divid).html("<strong>"+message+"</strong>");
	        $(divid).fadeIn();
	       
	     return false;  
	    }
}
	
//Only Number Validation +++++++++++++++++++++++++++++++++++++++++++++++++
function onlyNumberValidation_divid(id,divid,message)
{
	id="#"+id;
	divid="#"+divid
	var z = $(id).val();
	if(!/^[0-9]+$/.test(z))
	{
	 
     $(divid).show();
     $(divid).html("<strong>"+message+"</strong>");
     $(divid).fadeIn();
   
   
	}
	else
		{
		$(divid).hide();
		}
}

//+++++++++++++++++++++++++++++++++Only Positive Number Validation +++++++++++++++++++++++++++++++++++++++++++++++++
function positiveNumberValidation_divid(id,divid,message)
{

	id="#"+id;
	divid="#"+divid
	var z = $(id).val();
	if(!/^[0-9]+$/.test(z))
	{
	 
     
	 $(divid).show();
     $(divid).html("<strong>"+message+"</strong>");
     $(divid).fadeIn();
   
   
	}
	else
		{
		$(divid).hide();
		}
}


//+++++++++++++++++++++++++++++++++No Space Validation +++++++++++++++++++++++++++++++++++++++++++++++++

function noSpace(evt) 
{
    evt = (evt) ? evt : window.event;
    var charCode = (evt.which) ? evt.which : evt.keyCode;
    if (charCode !== 32) 
    { 
    return true;
    }
    return false;
    
}
