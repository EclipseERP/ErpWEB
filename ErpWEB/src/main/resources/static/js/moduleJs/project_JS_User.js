/**
 * Author : Pradipto Roy Date : 07-01-2019
 */

// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
// ---------------------------------------------------------- Jquery written for
// Calendar functionality--------------------------------------------
function calendarLoad(apdata) {

	// $.get("/appointment/getAppointmentCalendar_Data/user", function(apdatas,
	// status)

	$.get("/appointment/getOrder_data/user", function(apdatas, status) {

		$('#calendar').fullCalendar({
			defaultDate : $('#calendar').fullCalendar('today'),
			editable : true,
			eventLimit : true,

			eventSources : [ apdata, apdatas ],

			eventClick : function(calEvent, jsEvent, view) {
				loaddata(calEvent.id, calEvent.title);

			},
			eventColor : '#ffff1a',
			timeFormat : 'H(:mm)',
			displayEventTime : false,
			dayRender : function(date, cell) {
				if (moment().diff(date, 'days') > 0) {
					cell.css("background-color", "#FFF5EE");
				}
			},

		});
	})

}
/*
 * ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ Calendar Data population load
 * ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
 */
function loaddata(id, title) {
	var titles = title.substring(0, 1);
	if (titles != "D") {
		$.get("/appointment/getAppointmentData_ById/" + id, function(data,
				status) {

			$("#clientname").html(
					data[0].bride_fname + " " + data[0].bride_lname)
			$("#spousename").html(
					data[0].groom_fname + " " + data[0].groom_lname)
			$("#note").html(data[0].note)
			if (data[0].cancel_apoint == 1) {
				$("#cancel_apoint").html("Yes")
			} else {
				$("#cancel_apoint").html("No")
			}
			if (data[0].rescdule_appoint == 1) {
				$("#rescdule_appoint").html("Yes")
			} else {
				$("#rescdule_appoint").html("No")
			}

			$("#address1").html(data[0].address1)
			$("#address2").html(data[0].address2)
			$("#city").html(data[0].city)
			$("#state").html(data[0].state)
			$("#zip").html(data[0].zip)
			$("#email").html(data[0].bride_email)
			$("#phonenumber").html(data[0].phone_number)

			if (data[0].text_to_phone == 1) {
				$("#texttophone").html("Yes")
			} else {
				$("#texttophone").html("No")
			}

			$("#theme").html(data[0].theme)

			$("#wedingdate").html(
					moment(data[0].weeding_date).format('YYYY-MM-DD'))
			$("#noofserving").html(data[0].no_of_servings)
			$("#noofattendconsulatation").html(data[0].no_attend_recption)
			$("#appointmentdate").html(
					moment(data[0].appointment_date).format('YYYY-MM-DD'))
			$("#appointment_time").html(data[0].appointment_time)
			$("#cid").val(data[0].id)

			if (data[0].convertedTocust == 1) {
				$("#convert").hide();
			}

		});

		$("#myModal").modal();
	} else {

		$("#myModal").hide();
		$("#cakedelivery_modal").modal();
		$.get("/appointment/getOrder_data_by_Id/" + id, function(data, status) {
			console.log("order data...", data[0])
			$("#clientname2").html(data[0][1].brideName);
			$("#spousename2").html(data[0][1].groomName);
			$("#address_cust").html(data[0][1].address);
			$("#phonenumber2").html(data[0][1].phoneNumber)
			$("#email2").html(data[0][1].brideEmail)
			$("#deliverydate").html(
					moment(data[0][2].eventDate).format('YYYY-MM-DD'))
			$("#deliveryTime").html(
					moment(data[0][2].eventTime).format('hh:mm:ss A'))

		})

	}

}
/* ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ */

function printDiv() {

	var divToPrint = document.getElementById('myModal');
	var newWin = window.open('', 'Print-Window');
	newWin.document.open();
	newWin.document.write('<html><body onload="window.print()">'
			+ divToPrint.innerHTML + '</body></html>');
	newWin.document.close();
	setTimeout(function() {
		newWin.close();
	}, 10);

}

// ----------------------------------------------------------------------------------------------------------------------------------------------------------------------
/*
 * %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% Apointment Module
 * script ends here
 * %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
 */

function updateData(updatedcontent, tableid, tempheading_get, username_get) {
	$.ajax({
		type : "POST",
		url : "/emailtemplate/updateTemplateTableForUser?",
		data : {
			emailcontent : updatedcontent,
			id : tableid,
			tempheading : tempheading_get,
			username : username_get
		},
		cache : false,
		success : function() {
			alert('save');

		},
		error : function() {
			alert('error');
		}
	});
}

// +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
// ----------------------------------------------------------- Java script
// function to compose email
// ---------------------------------------------------------------
// +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
var g = new Array();

function loadEmailsToCompseTextBox(checkboxname) {
	var valueCheckFlag = 0;

	var emailsbucket = new Array()
	var compaoseTexVal = $("#composetext");

	$("input:checkbox[name=" + checkboxname + "]:checked").each(function() {
		var str = compaoseTexVal.val();

		if (!str.includes($(this).val())) {

			valueCheckFlag = 1;
			emailsbucket.push($(this).val());
		}

	});

	if (valueCheckFlag > 0) {
		pushEmail_in_emailBucket(emailsbucket, compaoseTexVal)

		$("input:checkbox[name=" + checkboxname + "]:not(:checked)").each(
				function() {
					removeEmail_from_emailBucket(emailsbucket, compaoseTexVal,
							$(this).val())
				});

		g = emailsbucket;
	} else {
		alert("You already added this email Id !!");
	}
}

function removeEmail_from_emailBucket(emailsbucket, compaoseTexVal, searchText) {
	for (var inc_r = 0; inc_r < emailsbucket.length - 1; inc_r++) {

		if (emailsbucket[inc_r] === searchText) {
			emailsbucket.splice(inc_r, searchText);
		}
	}
	compaoseTexVal.val("");
	pushEmail_in_emailBucket(emailsbucket, compaoseTexVal);
}

function pushEmail_in_emailBucket(emailsbucket, compaoseTexVal) {
	for (var inc = 0; inc < emailsbucket.length; inc++) {
		compaoseTexVal.val(compaoseTexVal.val() + emailsbucket[inc] + ",");
	}
}

function removeEmail_from_emailBucket_By_SingleUnit(checkboxname) {

	$("input:checkbox[name=" + checkboxname + "]:not(:checked)").each(
			function() {
				var compaoseTexVal = $("#composetext");
				for (var inc_r = 0; inc_r < g.length; inc_r++) {

					if (g[inc_r] === $(this).val()) {

						var indexofvalue_match = g.indexOf($(this).val());
						g.splice(inc_r, indexofvalue_match + 1);

					}
				}
				compaoseTexVal.val("");
				for (var inc = 0; inc < g.length; inc++) {
					compaoseTexVal.val(compaoseTexVal.val() + g[inc] + ",");
				}
			});

}

function selectAllFireEvent(checkboxnames, evt) {
	if (evt.checked) {
		$('input:checkbox[name=' + checkboxnames + ']').not(evt).prop(
				'checked', evt.checked);
	} else {
		var compaoseTexVal = $("#composetext");
		$('input:checkbox[name=' + checkboxnames + ']').prop('checked',
				evt.checked);
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
	var br = ((txtarea.selectionStart || txtarea.selectionStart == '0') ? "ff"
			: (document.selection ? "ie" : false));
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

	$('#emailtempdata')
			.froalaEditor('html.set', strip_html_tags(txtarea.value));
}

function strip_html_tags(str) {
	if ((str === null) || (str === ''))
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

function totalAdormentCalc() {
	var pricevalue = document.getElementsByName("calcprice")
	var totaladorment = 0;
	for (var i = 0; i < pricevalue.length; i++) {
		totaladorment = parseFloat(totaladorment)
				+ parseFloat(pricevalue[i].value)
	}

	document.getElementById("totaladorment").value = totaladorment;
}

function deleteRow(x) {

	var index = $(x).closest('tr').index();
	var price = document.getElementsByName("calcprice")[index].value;
	var totaladr = document.getElementById("totaladorment").value;
	document.getElementById("totaladorment").value = totaladr - price;
	$(x).closest('tr').remove();
}

function deleteRowTemp(x) {

	$(x).closest('tr').remove();
}

// +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
// ERP JAVA ,JQuery
// codes++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
// +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

var counter = 0;
$("#locationadd")
		.click(
				function() {
					var locations = $("[name=locationfield]");
					var flagloc = 0

					for (var h = 0; h < locations.length; h++) {

						if (locations[h].value == "") {
							alert("Please enter location name !!")
							flagloc = 0;
							break;
						}
						if (locations[h].value != "") {
							flagloc = 1
						}

					}

					if (counter == 0) {
						locationaddarray.push(counter)
						$("#locationfield")
								.append(
										" <div id=c"
												+ counter
												+ "><input  type=text class=form-control name=locationfield id=af"
												+ counter
												+ " placeholder='Add location' > <a id=r"
												+ counter
												+ " onclick=remove('"
												+ counter
												+ "') style = cursor:pointer >Remove</a> <hr/></div>");
						counter = counter + 1;
					}
					if (counter > 0) {
						if (flagloc > 0) {
							locationaddarray.push(counter)
							$("#locationfield")
									.append(
											" <div id=c"
													+ counter
													+ "><input  type=text class=form-control name=locationfield id=af"
													+ counter
													+ " placeholder='Add location' > <a id=r"
													+ counter
													+ " onclick=remove('"
													+ counter
													+ "') style = cursor:pointer >Remove</a> <hr/></div>");
							counter = counter + 1;
						}
					}

				});

function remove(count) {

	locationaddarray.splice(locationaddarray.indexOf(count), 1);

	var locations = $("[name=locationfield]");
	var flagloc = 0

	for (var h = 0; h < locations.length; h++) {

		if (locations[h].value == "") {
			alert("One of your loaction field is blank !!")
			flagloc = 0;
			break;
		}
		if (locations[h].value != "") {
			flagloc = 1;
		}

	}

	if (flagloc > 0) {

		// --------------------------------------Dynamic table column headings
		// add process-------------------------------------
		var ei = "";
		var loc = "";
		var locations = $("[name=locationfield]");
		var inb = 1
		for (var h = 0; h < locations.length; h++) {

			loc = loc.concat("<th>(" + inb + ") <br/>" + locations[h].value
					+ " <br/> SCH.QTY.</th>");

			inb++
		}

		var eiworks = $("[name=eiworksfield]");
		var eib = 1
		for (var i = 0; i < eiworks.length; i++) {

			ei = ei.concat("<th>" + eiworks[i].value + "</th>");
			eib++
		}

		// --------------------------------------Dynamic table column headings
		// add process ends here-------------------------------------

		var itemHeaddynamicdata = "<tr>" + "<th>Item Code</th>"
				+ "<th>Description</th>" + loc + ei + "<th>INS</th>"
				+ "<th>Total</th>" + "<th>View full details</th>"
				+ "<th>Remove</th>" + "</tr>"

		$("#materialHead").empty();

		$("#rowgen").empty()

		$('#c' + count).remove();
		counter = counter - 1;

		alert("Location removed please click the  'Add item' button to reload changes")

	}

}

var counterei = 0;
$("#eiworkadd")
		.click(
				function() {
					var eiworksfileds = $("[name=eiworksfield]");
					var flagloc = 0

					var eiworkslength = eiworksfileds.length;
					for (var n = 0; n < parseInt(eiworkslength); n++) {

						if (eiworksfileds[n].value == "") {
							alert("Please enter eiworks name !!")
							flagloc = 0;
							break;
						}
						if (eiworksfileds[n].value != "") {
							flagloc = 1
						}

					}

					if (counterei == 0) {
						eiworkarray.push(counterei)
						$("#eiwork")
								.append(
										" <div id=cc"
												+ counterei
												+ "><input  type=text  class=form-control name=eiworksfield id=af"
												+ counterei
												+ " placeholder='Add EI work details' > <a id=r"
												+ counterei
												+ " onclick=removeEiworks('"
												+ counterei
												+ "') style = cursor:pointer >Remove</a> <hr/></div>");
						counterei = counterei + 1;
					}
					if (counterei > 0) {
						if (flagloc > 0) {
							eiworkarray.push(counterei)
							$("#eiwork")
									.append(
											" <div id=cc"
													+ counterei
													+ "><input  type=text  class=form-control name=eiworksfield id=af"
													+ counterei
													+ " placeholder='Add EI work details' > <a id=r"
													+ counterei
													+ " onclick=removeEiworks('"
													+ counterei
													+ "') style = cursor:pointer >Remove</a> <hr/></div>");
							counterei = counterei + 1;
						}
					}
				});

function removeEiworks(count) {
	eiworkarray.splice(eiworkarray.indexOf(count), 1);
	$('#cc' + count).remove();
	$("#materialHead").empty();
	$("#rowgen").empty()
}








var counters=0;
$("#schQuantityadd").click(function()
{
	  $("#schQuantity").append(" <div id=ccc"+counters+"><input  type=text name=SCHQuantityadd class=form-control ng-model=p.projectName id=af"+counters+" placeholder='Add SCH Quantity details' > <a id=r"+counters+" onclick=removeSCHworks('"+counters+"') style = cursor:pointer >Remove</a> <hr/></div>");
	  counters=counters+1;
}); 

function removeSCHworks(count)
{
	  $('#ccc'+count).remove();
	
}




var count=0;
$("#eiworksadd").click(function()
{
	  $("#eiworks").append(" <div id=cccc"+count+"><input  type=text name=SCHQuantityadd class=form-control ng-model=p.projectName id=af"+count+" placeholder='Add EI Work details' > <a id=r"+count+" onclick=removeEIwork('"+count+"') style = cursor:pointer >Remove</a> <hr/></div>");
	  count=count+1;
}); 

function removeEIwork(count)
{
	  $('#cccc'+count).remove();
	
}






//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ ERP JAVA ,JQuery codes++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

var incloc = 1;
var incei = 1;
var itemcodearray = new Array()
var eiworkarray = new Array()
var locationaddarray = new Array()
function removeItem(count, itemcode) {
	itemcodearray.splice(itemcodearray.indexOf(itemcode), 1);

	$('#it' + count).remove();

}

function calculationItemtotal(inccounter_calc, icounterSingle) {
	var eiwal = 0;
	var locval = 0;
	var locations = $("[name=locationfield]");
	for (var h = 0; h < locations.length; h++) {

		locval = locval + parseInt($("#locationvalueid" + icounterSingle + h).val())
	}

	var eiworks = $("[name=eiworksfield]");
	for (var i = 0; i < eiworks.length; i++) {

		eiwal = eiwal + parseInt($("#eiworksvalueid" + icounterSingle + i).val())
	}

	$("#totalvalid" + icounterSingle).val(parseInt(locval) + parseInt(eiwal));
}

// +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
// ERP JAVA ,JQuery
// codes++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
// +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++


