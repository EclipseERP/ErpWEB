
package com.ets.csm.util;

import java.util.ArrayList;
import java.util.List;

import com.ets.csm.model.SettingsMaster;
import com.ets.csm.model.SuperAdminHelpSetting;
import com.ets.csm.model.User;

public class DefaultHelpSettingsLoader {
	
	public static List<SuperAdminHelpSetting> getDefaultHelpSettings(User userdata)
	{
		List returSettings=new ArrayList();
		
		SuperAdminHelpSetting sighnupdata=new SuperAdminHelpSetting();
		sighnupdata.setSettingname("signupsucessfully");
		sighnupdata.setSettingtype("Email");
		sighnupdata.setAdminrole("");
		sighnupdata.setSettingcontent("sign up sucessfully");
		sighnupdata.setSettingheader("account created successfully");
		sighnupdata.setUser(userdata);
		returSettings.add(sighnupdata);
		
		SuperAdminHelpSetting data2=new SuperAdminHelpSetting();
		data2.setSettingname("paymentsuccessfull_for_user");
		data2.setSettingtype("Email");
		data2.setAdminrole("");
		data2.setSettingcontent("payment complted");
		data2.setSettingheader("payement complted");
		data2.setUser(userdata);
		returSettings.add(data2);
		
		SuperAdminHelpSetting data3=new SuperAdminHelpSetting();
		data3.setSettingname("paymentsuccessfull_for_admin");
		data3.setSettingtype("Email");
		data3.setAdminrole("");
		data3.setSettingcontent("payment complted");
		data3.setSettingheader("payement complted");
		data3.setUser(userdata);
		returSettings.add(data3);
		

		SuperAdminHelpSetting data4=new SuperAdminHelpSetting();
		data4.setSettingname("SocialProfileSuccessfull_for_Admin");
		data4.setSettingtype("Email");
		data4.setAdminrole("");
		data4.setSettingcontent("Profile Completed");
		data4.setSettingheader("Profile Completed");
		data4.setUser(userdata);
		returSettings.add(data4);
		
		SuperAdminHelpSetting data5=new SuperAdminHelpSetting();
		data5.setSettingname("ThemeSuccessfull_for_Admin");
		data5.setSettingtype("Email");
		data5.setAdminrole("");
		data5.setSettingcontent("Theme Completed");
		data5.setSettingheader("Theme Completed");
		data5.setUser(userdata);
		returSettings.add(data5);
		
		
		SuperAdminHelpSetting data6=new SuperAdminHelpSetting();
		data6.setSettingname("LogoSuccessfull_for_Admin");
		data6.setSettingtype("Email");
		data6.setAdminrole("");
		data6.setSettingcontent("Logo Completed");
		data6.setSettingheader("Logo Completed");
		data6.setUser(userdata);
		returSettings.add(data6);
		
		SuperAdminHelpSetting data7=new SuperAdminHelpSetting();
		data7.setSettingname("Payment Successfull_for_Admin");
		data7.setSettingtype("Settings");
		data7.setAdminrole("");
		data7.setSettingcontent("Payment Successfull_for_Admin");
		data7.setSettingheader("Payment Successfull_for_Admin");
		data7.setUser(userdata);
		returSettings.add(data7);
		
		SuperAdminHelpSetting data8=new SuperAdminHelpSetting();
		data8.setSettingname("Payment Prior Successfull_for_Admin");
		data8.setSettingtype("Settings");
		data8.setAdminrole("");
		data8.setSettingcontent("Payment Prior is Completed");
		data8.setSettingheader("Payment Prior is Completed");
		data8.setUser(userdata);
		returSettings.add(data8);
		
		SuperAdminHelpSetting data9=new SuperAdminHelpSetting();
		data9.setSettingname("Order Successfull_for_Admin");
		data9.setSettingtype("Settings");
		data9.setAdminrole("");
		data9.setSettingcontent("Order Completed");
		data9.setSettingheader("Order Completed");
		data9.setUser(userdata);
		returSettings.add(data9);
		
		SuperAdminHelpSetting data10=new SuperAdminHelpSetting();
		data10.setSettingname("Order Prior Successfull_for_Admin");
		data10.setSettingtype("Settings");
		data10.setAdminrole("");
		data10.setSettingcontent("Order Prior Completed");
		data10.setSettingheader("Order Prior Completed");
		data10.setUser(userdata);
		returSettings.add(data10);
		
		
		SuperAdminHelpSetting data11=new SuperAdminHelpSetting();
		data11.setSettingname("Quote Successfull_for_Admin");
		data11.setSettingtype("Settings");
		data11.setAdminrole("");
		data11.setSettingcontent("Quote Completed");
		data11.setSettingheader("Quote Completed");
		data11.setUser(userdata);
		returSettings.add(data11);
		
		SuperAdminHelpSetting data12=new SuperAdminHelpSetting();
		data12.setSettingname("Quote Prior Successfull_for_Admin");
		data12.setSettingtype("Settings");
		data12.setAdminrole("");
		data12.setSettingcontent("Quote Prior Completed");
		data12.setSettingheader("Quote Prior Completed");
		data12.setUser(userdata);
		returSettings.add(data12);
		
		SuperAdminHelpSetting data13=new SuperAdminHelpSetting();
		data13.setSettingname("Appointment Successfull_for_Admin");
		data13.setSettingtype("Settings");
		data13.setAdminrole("");
		data13.setSettingcontent("Appointment Completed");
		data13.setSettingheader("Appointment Completed");
		data13.setUser(userdata);
		returSettings.add(data13);
		
		SuperAdminHelpSetting data14=new SuperAdminHelpSetting();
		data14.setSettingname("Appointment Prior Successfull_for_Admin");
		data14.setSettingtype("Settings");
		data14.setAdminrole("");
		data14.setSettingcontent("Appointment Prior Completed");
		data14.setSettingheader("Appointment Prior Completed");
		data14.setUser(userdata);
		returSettings.add(data14);
		
		SuperAdminHelpSetting data15=new SuperAdminHelpSetting();
		data15.setSettingname("Event Successfull_for_Admin");
		data15.setSettingtype("Settings");
		data15.setAdminrole("");
		data15.setSettingcontent("Event Completed");
		data15.setSettingheader("Event Completed");
		data15.setUser(userdata);
		returSettings.add(data15);
		
		
		SuperAdminHelpSetting data16=new SuperAdminHelpSetting();
		data16.setSettingname("Event Prior Successfull_for_Admin");
		data16.setSettingtype("Settings");
		data16.setAdminrole("");
		data16.setSettingcontent("Event Prior Completed");
		data16.setSettingheader("Event Prior Completed");
		data16.setUser(userdata);
		returSettings.add(data16);
		
		SuperAdminHelpSetting data17=new SuperAdminHelpSetting();
		data17.setSettingname("Customer Successfull_for_Admin");
		data17.setSettingtype("Settings");
		data17.setAdminrole("");
		data17.setSettingcontent("Customer Completed");
		data17.setSettingheader("Customer Completed");
		data17.setUser(userdata);
		returSettings.add(data17);
		
		SuperAdminHelpSetting data18=new SuperAdminHelpSetting();
		data18.setSettingname("Add Customer Successfull_for_Admin");
		data18.setSettingtype("Settings");
		data18.setAdminrole("");
		data18.setSettingcontent("Add Customer Completed");
		data18.setSettingheader("Add Customer Completed");
		data18.setUser(userdata);
		returSettings.add(data18);

		SuperAdminHelpSetting data19=new SuperAdminHelpSetting();
		data19.setSettingname("Venue Successfull_for_Admin");
		data19.setSettingtype("Settings");
		data19.setAdminrole("");
		data19.setSettingcontent("Venue Completed");
		data19.setSettingheader("Venue Completed");
		data19.setUser(userdata);
		returSettings.add(data19);
		
		
		
		SuperAdminHelpSetting data20=new SuperAdminHelpSetting();
		data20.setSettingname("Venue Name Completed");
		data20.setSettingtype("Settings");
		data20.setAdminrole("");
		data20.setSettingcontent("Venue Name Completed");
		data20.setSettingheader("Venue Name Completed");
		data20.setUser(userdata);
		returSettings.add(data20);
		
		
		
		SuperAdminHelpSetting data21=new SuperAdminHelpSetting();
		data21.setSettingname("Event Successfull_for_Admin");
		data21.setSettingtype("Settings");
		data21.setAdminrole("");
		data21.setSettingcontent("Event Completed");
		data21.setSettingheader("Event Completed");
		data21.setUser(userdata);
		returSettings.add(data21);
		

		SuperAdminHelpSetting data22=new SuperAdminHelpSetting();
		data22.setSettingname("Add Event Successfull_for_Admin");
		data22.setSettingtype("Settings");
		data22.setAdminrole("");
		data22.setSettingcontent("Add Event Completed");
		data22.setSettingheader("Add Event Completed");
		data22.setUser(userdata);
		returSettings.add(data22);
		
		SuperAdminHelpSetting data23=new SuperAdminHelpSetting();
		data23.setSettingname("All Cake List Cake Builder Successfull_for_Admin");
		data23.setSettingtype("Settings");
		data23.setAdminrole("");
		data23.setSettingcontent("All Cake List Cake Builder Completed");
		data23.setSettingheader("All Cake List Cake Builder Completed");
		data23.setUser(userdata);
		returSettings.add(data23);
		
		SuperAdminHelpSetting data24=new SuperAdminHelpSetting();
		data24.setSettingname("Wedding Cake List Cake Builder Successfull_for_Admin");
		data24.setSettingtype("Settings");
		data24.setAdminrole("");
		data24.setSettingcontent("Wedding Cake List Cake Builder Completed");
		data24.setSettingheader("Wedding Cake List Cake Builder Completed");
		data24.setUser(userdata);
		returSettings.add(data24);
		
		SuperAdminHelpSetting data25=new SuperAdminHelpSetting();
		data25.setSettingname("Party Cake List Cake Builder Successfull_for_Admin");
		data25.setSettingtype("Settings");
		data25.setAdminrole("");
		data25.setSettingcontent("Party Cake List Cake Builder Completed");
		data25.setSettingheader("Party Cake List Cake Builder Completed");
		data25.setUser(userdata);
		returSettings.add(data25);
		
		SuperAdminHelpSetting data26=new SuperAdminHelpSetting();
		data26.setSettingname("Order Type Successfull_for_Admin");
		data26.setSettingtype("Settings");
		data26.setAdminrole("");
		data26.setSettingcontent("Order Type Completed");
		data26.setSettingheader("Order Type Completed");
		data26.setUser(userdata);
		returSettings.add(data26);
		
		SuperAdminHelpSetting data27=new SuperAdminHelpSetting();
		data27.setSettingname("Cake Type Successfull_for_Admin");
		data27.setSettingtype("Settings");
		data27.setAdminrole("");
		data27.setSettingcontent("Cake Type Completed");
		data27.setSettingheader("Cake Type Completed");
		data27.setUser(userdata);
		returSettings.add(data27);
		
		SuperAdminHelpSetting data28=new SuperAdminHelpSetting();
		data28.setSettingname("Predefined or Custom Successfull_for_Admin");
		data28.setSettingtype("Settings");
		data28.setAdminrole("");
		data28.setSettingcontent("Predefined or Custom Completed");
		data28.setSettingheader("Predefined or Custom Completed");
		data28.setUser(userdata);
		returSettings.add(data28);
		

		SuperAdminHelpSetting data51=new SuperAdminHelpSetting();
		data51.setSettingname("SettingsSuccessfull_for_Admin");
		data51.setSettingtype("Settings");
		data51.setAdminrole("");
		data51.setSettingcontent("Cup Cake List Completed");
		data51.setSettingheader("Cup Cake List Completed");
		data51.setUser(userdata);
		returSettings.add(data51);
		
		
		
		SuperAdminHelpSetting data52=new SuperAdminHelpSetting();
		data52.setSettingname("SettingsSuccessfull_for_Admin");
		data52.setSettingtype("Settings");
		data52.setAdminrole("");
		data52.setSettingcontent("Cup Cake add Completed");
		data52.setSettingheader("Cup Cake add Completed");
		data52.setUser(userdata);
		returSettings.add(data52);
		
		SuperAdminHelpSetting data53=new SuperAdminHelpSetting();
		data53.setSettingname("SettingsSuccessfull_for_Admin");
		data53.setSettingtype("Settings");
		data53.setAdminrole("");
		data53.setSettingcontent("Price List Completed");
		data53.setSettingheader("Price List Completed");
		data53.setUser(userdata);
		returSettings.add(data53);
		
		SuperAdminHelpSetting data54=new SuperAdminHelpSetting();
		data54.setSettingname("SettingsSuccessfull_for_Admin");
		data54.setSettingtype("Settings");
		data54.setAdminrole("");
		data54.setSettingcontent("Price Add Completed");
		data54.setSettingheader("Price Add Completed");
		data54.setUser(userdata);
		returSettings.add(data54);
		
		SuperAdminHelpSetting data55=new SuperAdminHelpSetting();
		data55.setSettingname("Recipe Price List Completed");
		data55.setSettingtype("Settings");
		data55.setAdminrole("");
		data55.setSettingcontent("Recipe Price List Completed");
		data55.setSettingheader("Recipe Price List Completed");
		data55.setUser(userdata);
		returSettings.add(data55);
		
		
		SuperAdminHelpSetting data56=new SuperAdminHelpSetting();
		data56.setSettingname("SettingsSuccessfull_for_Admin");
		data56.setSettingtype("Settings");
		data56.setAdminrole("");
		data56.setSettingcontent("Recipe Price Add Completed");
		data56.setSettingheader("Recipe Price Add Completed");
		data56.setUser(userdata);
		returSettings.add(data56);
		
		SuperAdminHelpSetting data57=new SuperAdminHelpSetting();
		data57.setSettingname("SettingsSuccessfull_for_Admin");
		data57.setSettingtype("Settings");
		data57.setAdminrole("");
		data57.setSettingcontent("Icing Price List Completed");
		data57.setSettingheader("Icing Price List Completed");
		data57.setUser(userdata);
		returSettings.add(data57);
		
		SuperAdminHelpSetting data58=new SuperAdminHelpSetting();
		data58.setSettingname("SettingsSuccessfull_for_Admin");
		data58.setSettingtype("Settings");
		data58.setAdminrole("");
		data58.setSettingcontent("Icing Price Add Completed");
		data58.setSettingheader("Icing Price Add Completed");
		data58.setUser(userdata);
		returSettings.add(data58);
		
		SuperAdminHelpSetting data59=new SuperAdminHelpSetting();
		data59.setSettingname("Fillings Price List Completed");
		data59.setSettingtype("Settings");
		data59.setAdminrole("");
		data59.setSettingcontent("Fillings Price List Completed");
		data59.setSettingheader("Fillings Price List Completed");
		data59.setUser(userdata);
		returSettings.add(data59);
		
		SuperAdminHelpSetting data60=new SuperAdminHelpSetting();
		data60.setSettingname("Fillings Price Add Completed");
		data60.setSettingtype("Settings");
		data60.setAdminrole("");
		data60.setSettingcontent("Fillings Price Add Completed");
		data60.setSettingheader("Fillings Price Add Completed");
		data60.setUser(userdata);
		returSettings.add(data60);
		
		SuperAdminHelpSetting data61=new SuperAdminHelpSetting();
		data61.setSettingname("Topping Price List Completed");
		data61.setSettingtype("Settings");
		data61.setAdminrole("");
		data61.setSettingcontent("Topping Price List Completed");
		data61.setSettingheader("Topping Price List Completed");
		data61.setUser(userdata);
		returSettings.add(data61);
		
		SuperAdminHelpSetting data62=new SuperAdminHelpSetting();
		data62.setSettingname("Topping Price Add Completed");
		data62.setSettingtype("Settings");
		data62.setAdminrole("");
		data62.setSettingcontent("Topping Price Add Completed");
		data62.setSettingheader("Topping Price Add Completed");
		data62.setUser(userdata);
		returSettings.add(data62);
		
		SuperAdminHelpSetting data63=new SuperAdminHelpSetting();
		data63.setSettingname("Wrapper Price List Completed");
		data63.setSettingtype("Settings");
		data63.setAdminrole("");
		data63.setSettingcontent("Wrapper Price List Completed");
		data63.setSettingheader("Wrapper Price List Completed");
		data63.setUser(userdata);
		returSettings.add(data63);
		
		SuperAdminHelpSetting data64=new SuperAdminHelpSetting();
		data64.setSettingname("Wrapper Price Add Completed");
		data64.setSettingtype("Settings");
		data64.setAdminrole("");
		data64.setSettingcontent("Wrapper Price Add Completed");
		data64.setSettingheader("Wrapper Price Add Completed");
		data64.setUser(userdata);
		returSettings.add(data64);
		

		SuperAdminHelpSetting data29=new SuperAdminHelpSetting();
		data29.setSettingname("Build Cake Successfull_for_Admin");
		data29.setSettingtype("Settings");
		data29.setAdminrole("");
		data29.setSettingcontent("Build Cake Completed");
		data29.setSettingheader("Build Cake Completed");
		data29.setUser(userdata);
		returSettings.add(data29);
		
		SuperAdminHelpSetting data30=new SuperAdminHelpSetting();
		data30.setSettingname("Select Predefined Cake Successfull_for_Admin");
		data30.setSettingtype("Settings");
		data30.setAdminrole("");
		data30.setSettingcontent("Select Predefined Cake Completed");
		data30.setSettingheader("Select Predefined Cake Completed");
		data30.setUser(userdata);
		returSettings.add(data30);
		
		SuperAdminHelpSetting data31=new SuperAdminHelpSetting();
		data31.setSettingname("Event Successfull_for_Admin");
		data31.setSettingtype("Settings");
		data31.setAdminrole("");
		data31.setSettingcontent("Event Completed");
		data31.setSettingheader("Event Completed");
		data31.setUser(userdata);
		returSettings.add(data31);
		
		SuperAdminHelpSetting data32=new SuperAdminHelpSetting();
		data32.setSettingname("Terms and Condition");
		data32.setSettingtype("Terms_and_condition");
		data32.setAdminrole("");
		data32.setSettingcontent("Terms and Condition");
		data32.setSettingheader("Terms and Condition");
		data32.setUser(userdata);
		returSettings.add(data32);
		

		
		SuperAdminHelpSetting data33=new SuperAdminHelpSetting();
		data33.setSettingname("Cup Cake List Successfull_for_Admin");
		data33.setSettingtype("Settings");
		data33.setAdminrole("");
		data33.setSettingcontent("Cup Cake List Completed");
		data33.setSettingheader("Cup Cake List Completed");
		data33.setUser(userdata);
		returSettings.add(data33);
		
		
		
		SuperAdminHelpSetting data34=new SuperAdminHelpSetting();
		data34.setSettingname("Cup Cake add Successfull_for_Admin");
		data34.setSettingtype("Settings");
		data34.setAdminrole("");
		data34.setSettingcontent("Cup Cake add Completed");
		data34.setSettingheader("Cup Cake add Completed");
		data34.setUser(userdata);
		returSettings.add(data34);
		
		
		SuperAdminHelpSetting data35=new SuperAdminHelpSetting();
		data35.setSettingname("Cake Pans List Successfull_for_Admin");
		data35.setSettingtype("Settings");
		data35.setAdminrole("");
		data35.setSettingcontent("Cake Pans List Completed");
		data35.setSettingheader("Cake Pans List Completed");
		data35.setUser(userdata);
		returSettings.add(data35);
		
		
		
		SuperAdminHelpSetting data36=new SuperAdminHelpSetting();
		data36.setSettingname("Add New Cake Pans List Successfull_for_Admin");
		data36.setSettingtype("Settings");
		data36.setAdminrole("");
		data36.setSettingcontent("Add New Cake Pans List Completed");
		data36.setSettingheader("Add New Cake Pans List Completed");
		data36.setUser(userdata);
		returSettings.add(data36);
		
		
		
		SuperAdminHelpSetting data37=new SuperAdminHelpSetting();
		data37.setSettingname("Price List Successfull_for_Admin");
		data37.setSettingtype("Settings");
		data37.setAdminrole("");
		data37.setSettingcontent("Price List Completed");
		data37.setSettingheader("Price List Completed");
		data37.setUser(userdata);
		returSettings.add(data37);
		
		
		
		SuperAdminHelpSetting data38=new SuperAdminHelpSetting();
		data38.setSettingname("Price Add Successfull_for_Admin");
		data38.setSettingtype("Settings");
		data38.setAdminrole("");
		data38.setSettingcontent("Price Add Completed");
		data38.setSettingheader("Price Add Completed");
		data38.setUser(userdata);
		returSettings.add(data38);
		
		
		
		SuperAdminHelpSetting data39=new SuperAdminHelpSetting();
		data39.setSettingname("Recipe Price List Successfull_for_Admin");
		data39.setSettingtype("Settings");
		data39.setAdminrole("");
		data39.setSettingcontent("Recipe Price List Completed");
		data39.setSettingheader("Recipe Price List Completed");
		data39.setUser(userdata);
		returSettings.add(data39);
		
		
		SuperAdminHelpSetting data40=new SuperAdminHelpSetting();
		data40.setSettingname("Recipe Price Add Successfull_for_Admin");
		data40.setSettingtype("Settings");
		data40.setAdminrole("");
		data40.setSettingcontent("Recipe Price Add Completed");
		data40.setSettingheader("Recipe Price Add Completed");
		data40.setUser(userdata);
		returSettings.add(data40);
		
		
		
		SuperAdminHelpSetting data41=new SuperAdminHelpSetting();
		data41.setSettingname("Icing Price List Successfull_for_Admin");
		data41.setSettingtype("Settings");
		data41.setAdminrole("");
		data41.setSettingcontent("Icing Price List Completed");
		data41.setSettingheader("Icing Price List Completed");
		data41.setUser(userdata);
		returSettings.add(data41);
		
		
		SuperAdminHelpSetting data42=new SuperAdminHelpSetting();
		data42.setSettingname("Icing Price Add Successfull_for_Admin");
		data42.setSettingtype("Settings");
		data42.setAdminrole("");
		data42.setSettingcontent("Icing Price Add Completed");
		data42.setSettingheader("Icing Price Add Completed");
		data42.setUser(userdata);
		returSettings.add(data42);
		
		
		SuperAdminHelpSetting data43=new SuperAdminHelpSetting();
		data43.setSettingname("Fillings Price List Successfull_for_Admin");
		data43.setSettingtype("Settings");
		data43.setAdminrole("");
		data43.setSettingcontent("Fillings Price List Completed");
		data43.setSettingheader("Fillings Price List Completed");
		data43.setUser(userdata);
		returSettings.add(data43);
		
		
		
		SuperAdminHelpSetting data44=new SuperAdminHelpSetting();
		data44.setSettingname("Fillings Price Add Successfull_for_Admin");
		data44.setSettingtype("Settings");
		data44.setAdminrole("");
		data44.setSettingcontent("Fillings Price Add Completed");
		data44.setSettingheader("Fillings Price Add Completed");
		data44.setUser(userdata);
		returSettings.add(data44);
		
		
		SuperAdminHelpSetting data45=new SuperAdminHelpSetting();
		data45.setSettingname("Topping Price List Successfull_for_Admin");
		data45.setSettingtype("Settings");
		data45.setAdminrole("");
		data45.setSettingcontent("Topping Price List Completed");
		data45.setSettingheader("Topping Price List Completed");
		data45.setUser(userdata);
		returSettings.add(data45);
		
		
		SuperAdminHelpSetting data46=new SuperAdminHelpSetting();
		data46.setSettingname("Topping Price Add Successfull_for_Admin");
		data46.setSettingtype("Settings");
		data46.setAdminrole("");
		data46.setSettingcontent("Topping Price Add Completed");
		data46.setSettingheader("Topping Price Add Completed");
		data46.setUser(userdata);
		returSettings.add(data46);
		
		
		SuperAdminHelpSetting data47=new SuperAdminHelpSetting();
		data47.setSettingname("Wrapper Price List Successfull_for_Admin");
		data47.setSettingtype("Settings");
		data47.setAdminrole("");
		data47.setSettingcontent("Wrapper Price List Completed");
		data47.setSettingheader("Wrapper Price List Completed");
		data47.setUser(userdata);
		returSettings.add(data47);
		
		
		SuperAdminHelpSetting data48=new SuperAdminHelpSetting();
		data48.setSettingname("Wrapper Price Add Successfull_for_Admin");
		data48.setSettingtype("Settings");
		data48.setAdminrole("");
		data48.setSettingcontent("Wrapper Price Add Completed");
		data48.setSettingheader("Wrapper Price Add Completed");
		data48.setUser(userdata);
		returSettings.add(data48);
		
		
		SuperAdminHelpSetting data49=new SuperAdminHelpSetting();
		data49.setSettingname("Materials List Successfull_for_Admin");
		data49.setSettingtype("Settings");
		data49.setAdminrole("");
		data49.setSettingcontent("Materials List Completed");
		data49.setSettingheader("Materials List Completed");
		data49.setUser(userdata);
		returSettings.add(data49);
		
		
		SuperAdminHelpSetting data50=new SuperAdminHelpSetting();
		data50.setSettingname("Add Materials List Successfull_for_Admin");
		data50.setSettingtype("Settings");
		data50.setAdminrole("");
		data50.setSettingcontent("Add Materials List Completed");
		data50.setSettingheader("Add Materials List Completed");
		data50.setUser(userdata);
		returSettings.add(data50);
		
		
		SuperAdminHelpSetting data65=new SuperAdminHelpSetting();
		data65.setSettingname("TaxRate");
		data65.setSettingtype("Financial");
		data65.setAdminrole("");
		data65.setSettingcontent("Tax rate data");
		data65.setSettingheader("Tax Rate");
		data65.setUser(userdata);
		returSettings.add(data65);
		
		
		SuperAdminHelpSetting data66=new SuperAdminHelpSetting();
		data66.setSettingname("Vat Registration number");
		data66.setSettingtype("Financial");
		data66.setAdminrole("");
		data66.setSettingcontent("Vat registration data");
		data66.setSettingheader("Vat Registration number");
		data66.setUser(userdata);
		returSettings.add(data66);
		
		SuperAdminHelpSetting data67=new SuperAdminHelpSetting();
		data67.setSettingname("Vat Tax Rate");
		data67.setSettingtype("Financial");
		data67.setAdminrole("");
		data67.setSettingcontent("Vat Tax Rate data");
		data67.setSettingheader("Vat Tax Rate");
		data67.setUser(userdata);
		returSettings.add(data67);
		

		
		SuperAdminHelpSetting data69=new SuperAdminHelpSetting();
		data69.setSettingname("Hourly Rate");
		data69.setSettingtype("Financial");
		data69.setAdminrole("");
		data69.setSettingcontent("Hourly Rate data");
		data69.setSettingheader("Hourly Rate");
		data69.setUser(userdata);
		returSettings.add(data69);
		
		SuperAdminHelpSetting data70=new SuperAdminHelpSetting();
		data70.setSettingname("Payment Reminder Due Day");
		data70.setSettingtype("Financial");
		data70.setAdminrole("");
		data70.setSettingcontent("Payment Reminder Due data");
		data70.setSettingheader("Payment Reminder Due Day");
		data70.setUser(userdata);
		returSettings.add(data70);
		
		
		SuperAdminHelpSetting data71=new SuperAdminHelpSetting();
		data71.setSettingname("Quote archival span");
		data71.setSettingtype("Financial");
		data71.setAdminrole("");
		data71.setSettingcontent("Quote archival span data");
		data71.setSettingheader("Quote archival span");
		data71.setUser(userdata);
		returSettings.add(data71);
		
		SuperAdminHelpSetting data72=new SuperAdminHelpSetting();
		data72.setSettingname("Tax Delivery");
		data72.setSettingtype("Financial");
		data72.setAdminrole("");
		data72.setSettingcontent("Tax Delivery data");
		data72.setSettingheader("Tax Delivery ");
		data72.setUser(userdata);
		returSettings.add(data72);
		
		SuperAdminHelpSetting data73=new SuperAdminHelpSetting();
		data73.setSettingname("Hours to do 100 serving cake");
		data73.setSettingtype("Financial");
		data73.setAdminrole("");
		data73.setSettingcontent("Hours to do 100 serving cake data");
		data73.setSettingheader("Hours to do 100 serving cake");
		data73.setUser(userdata);
		returSettings.add(data73);
		
		SuperAdminHelpSetting data74=new SuperAdminHelpSetting();
		data74.setSettingname("Retail Markup");
		data74.setSettingtype("Financial");
		data74.setAdminrole("");
		data74.setSettingcontent("Retail Markup data");
		data74.setSettingheader("Retail Markup");
		data74.setUser(userdata);
		returSettings.add(data74);
		
		SuperAdminHelpSetting data75=new SuperAdminHelpSetting();
		data75.setSettingname("Time to do 24 cupcakes");
		data75.setSettingtype("Financial");
		data75.setAdminrole("");
		data75.setSettingcontent("Time to do 24 cupcakes data");
		data75.setSettingheader("Time to do 24 cupcakes");
		data75.setUser(userdata);
		returSettings.add(data75);
		
		SuperAdminHelpSetting data76=new SuperAdminHelpSetting();
		data76.setSettingname("Company Info Completed");
		data76.setSettingtype("Settings");
		data76.setAdminrole("");
		data76.setSettingcontent("Company Info Completed");
		data76.setSettingheader("Company Info Completed");
		data76.setUser(userdata);
		returSettings.add(data76);
		
		SuperAdminHelpSetting data77=new SuperAdminHelpSetting();
		data77.setSettingname("Company Name Completed");
		data77.setSettingtype("Settings");
		data77.setAdminrole("");
		data77.setSettingcontent("Company Name Completed");
		data77.setSettingheader("Company Name Completed");
		data77.setUser(userdata);
		returSettings.add(data77);
		
		SuperAdminHelpSetting data78=new SuperAdminHelpSetting();
		data78.setSettingname("Address 1 Completed");
		data78.setSettingtype("Settings");
		data78.setAdminrole("");
		data78.setSettingcontent("Addres 1  Completed");
		data78.setSettingheader("Address 1 Completed");
		data78.setUser(userdata);
		returSettings.add(data78);
		
		SuperAdminHelpSetting data79=new SuperAdminHelpSetting();
		data79.setSettingname("Address 2 Completed");
		data79.setSettingtype("Settings");
		data79.setAdminrole("");
		data79.setSettingcontent("Address 2 Completed");
		data79.setSettingheader("Address 2 Completed");
		data79.setUser(userdata);
		returSettings.add(data79);
		
		SuperAdminHelpSetting data80=new SuperAdminHelpSetting();
		data80.setSettingname("City Completed");
		data80.setSettingtype("Settings");
		data80.setAdminrole("");
		data80.setSettingcontent("City Completed");
		data80.setSettingheader("City Completed");
		data80.setUser(userdata);
		returSettings.add(data80);
		
		SuperAdminHelpSetting data81=new SuperAdminHelpSetting();
		data81.setSettingname("Country Completed");
		data81.setSettingtype("Settings");
		data81.setAdminrole("");
		data81.setSettingcontent("Country Completed");
		data81.setSettingheader("Country Completed");
		data81.setUser(userdata);
		returSettings.add(data81);
		
		SuperAdminHelpSetting data82=new SuperAdminHelpSetting();
		data82.setSettingname("State Completed");
		data82.setSettingtype("Settings");
		data82.setAdminrole("");
		data82.setSettingcontent("State Completed");
		data82.setSettingheader("State Completed");
		data82.setUser(userdata);
		returSettings.add(data82);
		
		SuperAdminHelpSetting data83=new SuperAdminHelpSetting();
		data83.setSettingname("Postal Code Completed");
		data83.setSettingtype("Settings");
		data83.setAdminrole("");
		data83.setSettingcontent("Postal Code Completed");
		data83.setSettingheader("Postal Code Completed");
		data83.setUser(userdata);
		returSettings.add(data83);
		
		SuperAdminHelpSetting data84=new SuperAdminHelpSetting();
		data84.setSettingname("Contact Name Completed");
		data84.setSettingtype("Settings");
		data84.setAdminrole("");
		data84.setSettingcontent("Contact Name Completed");
		data84.setSettingheader("Contact Name Completed");
		data84.setUser(userdata);
		returSettings.add(data84);
		
		SuperAdminHelpSetting data85=new SuperAdminHelpSetting();
		data85.setSettingname("Phone No Completed");
		data85.setSettingtype("Settings");
		data85.setAdminrole("");
		data85.setSettingcontent("Phone No Completed");
		data85.setSettingheader("Phone No Completed");
		data85.setUser(userdata);
		returSettings.add(data85);
		
		SuperAdminHelpSetting data86=new SuperAdminHelpSetting();
		data86.setSettingname("Website URL Completed");
		data86.setSettingtype("Settings");
		data86.setAdminrole("");
		data86.setSettingcontent("Website URL Completed");
		data86.setSettingheader("Website URL Completed");
		data86.setUser(userdata);
		returSettings.add(data86);
		
		SuperAdminHelpSetting data87=new SuperAdminHelpSetting();
		data87.setSettingname("customerfirstnamehelp");
		data87.setSettingtype("Settings");
		data87.setAdminrole("");
		data87.setSettingcontent("Customer fist name content ");
		data87.setSettingheader("Customer first name header");
		data87.setUser(userdata);
		returSettings.add(data87);
		
		SuperAdminHelpSetting data88=new SuperAdminHelpSetting();
		data88.setSettingname("Customerlastnamehelp");
		data88.setSettingtype("Settings");
		data88.setAdminrole("");
		data88.setSettingcontent("customer last help content");
		data88.setSettingheader("customer last name header ");
		data88.setUser(userdata);
		returSettings.add(data88);
		
		
		SuperAdminHelpSetting data89=new SuperAdminHelpSetting();
		data89.setSettingname("customer2firstname");
		data89.setSettingtype("Settings");
		data89.setAdminrole("");
		data89.setSettingcontent("customer2firstcontent");
		data89.setSettingheader("customer2firstheader");
		data89.setUser(userdata);
		returSettings.add(data89);
		

		SuperAdminHelpSetting data90=new SuperAdminHelpSetting();
		data90.setSettingname("customer2lastname");
		data90.setSettingtype("Settings");
		data90.setAdminrole("");
		data90.setSettingcontent("customer2lastcontent");
		data90.setSettingheader("customer2lastheader");
		data90.setUser(userdata);
		returSettings.add(data90);
		
		SuperAdminHelpSetting data91=new SuperAdminHelpSetting();
		data91.setSettingname("address1help");
		data91.setSettingtype("Settings");
		data91.setAdminrole("");
		data91.setSettingcontent("address1content");
		data91.setSettingheader("address1header");
		data91.setUser(userdata);
		returSettings.add(data91);
		
		SuperAdminHelpSetting data92=new SuperAdminHelpSetting();
		data92.setSettingname("address2help");
		data92.setSettingtype("Settings");
		data92.setAdminrole("");
		data92.setSettingcontent("address2content");
		data92.setSettingheader("address2header");
		data92.setUser(userdata);
		returSettings.add(data92);
		
		SuperAdminHelpSetting data93=new SuperAdminHelpSetting();
		data93.setSettingname("citycontentsetting");
		data93.setSettingtype("Settings");
		data93.setAdminrole("");
		data93.setSettingcontent("citycontent");
		data93.setSettingheader("cityheader");
		data93.setUser(userdata);
		returSettings.add(data93);
		
		SuperAdminHelpSetting data94=new SuperAdminHelpSetting();
		data94.setSettingname("statecontentsetting");
		data94.setSettingtype("Settings");
		data94.setAdminrole("");
		data94.setSettingcontent("statecontent");
		data94.setSettingheader("stateheader");
		data94.setUser(userdata);
		returSettings.add(data94);
		
		SuperAdminHelpSetting data95=new SuperAdminHelpSetting();
		data95.setSettingname("zipcontentsetting");
		data95.setSettingtype("Settings");
		data95.setAdminrole("");
		data95.setSettingcontent("zipcontent");
		data95.setSettingheader("zipheader");
		data95.setUser(userdata);
		returSettings.add(data95);
	
		SuperAdminHelpSetting data96=new SuperAdminHelpSetting();
		data96.setSettingname("telephonesetting");
		data96.setSettingtype("Settings");
		data96.setAdminrole("");
		data96.setSettingcontent("telephonecontent");
		data96.setSettingheader("telephoneheader");
		data96.setUser(userdata);
		returSettings.add(data96);
		
		SuperAdminHelpSetting data97=new SuperAdminHelpSetting();
		data97.setSettingname("acceptmessagesetting");
		data97.setSettingtype("Settings");
		data97.setAdminrole("");
		data97.setSettingcontent("acceptcontent");
		data97.setSettingheader("acceptheader");
		data97.setUser(userdata);
		returSettings.add(data97);
		
		SuperAdminHelpSetting data98=new SuperAdminHelpSetting();
		data98.setSettingname("emailsettingforcustomer");
		data98.setSettingtype("Settings");
		data98.setAdminrole("");
		data98.setSettingcontent("emailsettingcontent");
		data98.setSettingheader("emailsettingheader");
		data98.setUser(userdata);
		returSettings.add(data98);
		
		SuperAdminHelpSetting data99=new SuperAdminHelpSetting();
		data99.setSettingname("dateofbirthsetting");
		data99.setSettingtype("Settings");
		data99.setAdminrole("");
		data99.setSettingcontent("dateofbirthcontent");
		data99.setSettingheader("dateofbirthheader");
		data99.setUser(userdata);
		returSettings.add(data99);
		
		SuperAdminHelpSetting data100=new SuperAdminHelpSetting();
		data100.setSettingname("Venue Address Successfull_for_Admin");
		data100.setSettingtype("Settings");
		data100.setAdminrole("");
		data100.setSettingcontent("Venue Address Completed");
		data100.setSettingheader("Venue Address Completed");
		data100.setUser(userdata);
		returSettings.add(data100);
		
		
		
		SuperAdminHelpSetting data101=new SuperAdminHelpSetting();
		data101.setSettingname("Venue Contact Successfull_for_Admin");
		data101.setSettingtype("Settings");
		data101.setAdminrole("");
		data101.setSettingcontent("Venue Contact Completed");
		data101.setSettingheader("Venue Contact Completed");
		data101.setUser(userdata);
		returSettings.add(data101);
		
		SuperAdminHelpSetting data102=new SuperAdminHelpSetting();
		data102.setSettingname("Venue Phone No. Successfull_for_Admin");
		data102.setSettingtype("Settings");
		data102.setAdminrole("");
		data102.setSettingcontent("Venue Phone No. Completed");
		data102.setSettingheader("Venue Phone No. Completed");
		data102.setUser(userdata);
		returSettings.add(data102);
		
		SuperAdminHelpSetting data103=new SuperAdminHelpSetting();
		data103.setSettingname("Delivery Charge Successfull_for_Admin");
		data103.setSettingtype("Settings");
		data103.setAdminrole("");
		data103.setSettingcontent("Delivery Charge Completed");
		data103.setSettingheader("Delivery Charge Completed");
		data103.setUser(userdata);
		returSettings.add(data103);
		
		
		SuperAdminHelpSetting data104=new SuperAdminHelpSetting();
		data104.setSettingname("Event Name Successfull_for_Admin");
		data104.setSettingtype("Settings");
		data104.setAdminrole("");
		data104.setSettingcontent("Event Name Completed");
		data104.setSettingheader("Event Name Completed");
		data104.setUser(userdata);
		returSettings.add(data104);
		
		SuperAdminHelpSetting data105=new SuperAdminHelpSetting();
		data105.setSettingname("Event Date Successfull_for_Admin");
		data105.setSettingtype("Settings");
		data105.setAdminrole("");
		data105.setSettingcontent("Event Date Completed");
		data105.setSettingheader("Event Date Completed");
		data105.setUser(userdata);
		returSettings.add(data105);
		
		
		SuperAdminHelpSetting data106=new SuperAdminHelpSetting();
		data106.setSettingname("Event Time Successfull_for_Admin");
		data106.setSettingtype("Settings");
		data106.setAdminrole("");
		data106.setSettingcontent("Event Time Completed");
		data106.setSettingheader("Event Time Completed");
		data106.setUser(userdata);
		returSettings.add(data106);
		
		SuperAdminHelpSetting data107=new SuperAdminHelpSetting();
		data107.setSettingname("Cake Delivery Time Successfull_for_Admin");
		data107.setSettingtype("Settings");
		data107.setAdminrole("");
		data107.setSettingcontent("Cake Delivery Time Completed");
		data107.setSettingheader("Cake Delivery Time Completed");
		data107.setUser(userdata);
		returSettings.add(data107);
		
		SuperAdminHelpSetting data108=new SuperAdminHelpSetting();
		data108.setSettingname("Other Vendors Successfull_for_Admin");
		data108.setSettingtype("Settings");
		data108.setAdminrole("");
		data108.setSettingcontent("Other Vendors Completed");
		data108.setSettingheader("Other Vendors Completed");
		data108.setUser(userdata);
		returSettings.add(data108);
		
		
		SuperAdminHelpSetting data109=new SuperAdminHelpSetting();
		data109.setSettingname("Pan Shape Successfull_for_Admin");
		data109.setSettingtype("Settings");
		data109.setAdminrole("");
		data109.setSettingcontent("Pan Shape Completed");
		data109.setSettingheader("Pan Shape Completed");
		data109.setUser(userdata);
		returSettings.add(data109);
		
		
		SuperAdminHelpSetting data110=new SuperAdminHelpSetting();
		data110.setSettingname("Wedding Cake Serving Per Laye Successfull_for_Admin");
		data110.setSettingtype("Settings");
		data110.setAdminrole("");
		data110.setSettingcontent("Wedding Cake Serving Per Layer Completed");
		data110.setSettingheader("Wedding Cake Serving Per Laye Completed");
		data110.setUser(userdata);
		returSettings.add(data110);
		
		
		
		
		SuperAdminHelpSetting data111=new SuperAdminHelpSetting();
		data111.setSettingname("Party Cake Serving Per Layer Successfull_for_Admin");
		data111.setSettingtype("Settings");
		data111.setAdminrole("");
		data111.setSettingcontent("Party Cake Serving Per Layer Completed");
		data111.setSettingheader("Party Cake Serving Per Layer Completed");
		data111.setUser(userdata);
		returSettings.add(data111);
		
		SuperAdminHelpSetting data112=new SuperAdminHelpSetting();
		data112.setSettingname("Cups Batter Per Layer Successfull_for_Admin");
		data112.setSettingtype("Settings");
		data112.setAdminrole("");
		data112.setSettingcontent("Cups Batter Per Layer Completed");
		data112.setSettingheader("Cups Batter Per Layer Completed");
		data112.setUser(userdata);
		returSettings.add(data112);
		
		
		
		SuperAdminHelpSetting data113=new SuperAdminHelpSetting();
		data113.setSettingname("Cups Icing Per Layer Successfull_for_Admin");
		data113.setSettingtype("Settings");
		data113.setAdminrole("");
		data113.setSettingcontent("Cups Icing Per Layer Completed");
		data113.setSettingheader("Cups Icing Per Layer Completed");
		data113.setUser(userdata);
		returSettings.add(data113);
		
		SuperAdminHelpSetting data114=new SuperAdminHelpSetting();
		data114.setSettingname("Cups Filling Per Layer Successfull_for_Admin");
		data114.setSettingtype("Settings");
		data114.setAdminrole("");
		data114.setSettingcontent("Cups Filling Per Layer Completed");
		data114.setSettingheader("Cups Filling Per Layer Completed");
		data114.setUser(userdata);
		returSettings.add(data114);
		
		SuperAdminHelpSetting data115=new SuperAdminHelpSetting();
		data115.setSettingname("LBS Fondant Per Layer Successfull_for_Admin");
		data115.setSettingtype("Settings");
		data115.setAdminrole("");
		data115.setSettingcontent("LBS Fondant Per Layer");
		data115.setSettingheader("LBS Fondant Per Layer");
		data115.setUser(userdata);
		returSettings.add(data115);
		
		
		SuperAdminHelpSetting data116=new SuperAdminHelpSetting();
		data116.setSettingname("Base Price Per Dozen Price Add Successfull_for_Admin");
		data116.setSettingtype("Settings");
		data116.setAdminrole("");
		data116.setSettingcontent("Base Price Per Dozen Price Add Completed");
		data116.setSettingheader("Base Price Per Dozen Price Add Completed");
		data116.setUser(userdata);
		returSettings.add(data116);
		
		
		
		
		SuperAdminHelpSetting data117=new SuperAdminHelpSetting();
		data117.setSettingname("Serving Price Add Successfull_for_Admin");
		data117.setSettingtype("Settings");
		data117.setAdminrole("");
		data117.setSettingcontent("Serving Price Add Completed");
		data117.setSettingheader("Serving Price Add Completed");
		data117.setUser(userdata);
		returSettings.add(data117);
		
		
		SuperAdminHelpSetting data118=new SuperAdminHelpSetting();
		data118.setSettingname("Base Price Per Dozen Recipe Price Add Successfull_for_Admin");
		data118.setSettingtype("Settings");
		data118.setAdminrole("");
		data118.setSettingcontent("Base Price Per Dozen Recipe Price Add Completed");
		data118.setSettingheader("Base Price Per Dozen Recipe Price Add Completed");
		data118.setUser(userdata);
		returSettings.add(data118);
		
		SuperAdminHelpSetting data119=new SuperAdminHelpSetting();
		data119.setSettingname("Serving Recipe Price Add Successfull_for_Admin");
		data119.setSettingtype("Settings");
		data119.setAdminrole("");
		data119.setSettingcontent("Serving Recipe Price Add Completed");
		data119.setSettingheader("Serving Recipe Price Add Completed");
		data119.setUser(userdata);
		returSettings.add(data119);
		
		
		
		SuperAdminHelpSetting data120=new SuperAdminHelpSetting();
		data120.setSettingname("Serving Icing Price Add Successfull_for_Admin");
		data120.setSettingtype("Settings");
		data120.setAdminrole("");
		
		data120.setSettingcontent("Serving Icing Price Add Completed");
		data120.setSettingheader("Serving Icing Price Add Completed");
		data120.setUser(userdata);
		returSettings.add(data120);
		
		
		
		SuperAdminHelpSetting data121=new SuperAdminHelpSetting();
		data121.setSettingname(" Base Price Per Dozen Icing Price Add Successfull_for_Admin");
		data121.setSettingtype("Settings");
		data121.setAdminrole("");
		data121.setSettingcontent("Base Price Per Dozen Icing Price Add Completed");
		data121.setSettingheader("Base Price Per Dozen Icing Price Add Completed");
		data121.setUser(userdata);
		returSettings.add(data121);
		
	
		
		SuperAdminHelpSetting data122=new SuperAdminHelpSetting();
		data122.setSettingname("Serving Fillings Price Add Successfull_for_Admin");
		data122.setSettingtype("Settings");
		data122.setAdminrole("");
		data122.setSettingcontent("Serving Fillings Price Add Completed");
		data122.setSettingheader("Serving Fillings Price Add Completed");
		data122.setUser(userdata);
		returSettings.add(data122);
		
		
		
		
		SuperAdminHelpSetting data123=new SuperAdminHelpSetting();
		data123.setSettingname("Base Price Per Dozen Fillings Price Add Successfull_for_Admin");
		data123.setSettingtype("Settings");
		data123.setAdminrole("");
		
		data123.setSettingcontent("Base Price Per Dozen Fillings Price Add Completed");
		data123.setSettingheader("Base Price Per Dozen Fillings Price Add Completed");
		data123.setUser(userdata);
		returSettings.add(data123);
		
		
		
		SuperAdminHelpSetting data124=new SuperAdminHelpSetting();
		data124.setSettingname("Serving Topping Price Add Completed Successfull_for_Admin");
		data124.setSettingtype("Settings");
		data124.setAdminrole("");
		data124.setSettingcontent("Serving Topping Price Add Completed");
		data124.setSettingheader("Serving Topping Price Add Completed");
		data124.setUser(userdata);
		returSettings.add(data124);
		
		
		
		SuperAdminHelpSetting data125=new SuperAdminHelpSetting();
		data125.setSettingname("Base Price Per Dozen Topping Price Add Completed");
		data125.setSettingtype("Settings");
		data125.setAdminrole("");
		data125.setSettingcontent("Base Price Per Dozen Topping Price Add Completed");
		data125.setSettingheader("Base Price Per Dozen Topping Price Add Completed");
		data125.setUser(userdata);
		returSettings.add(data125);
		
	
		SuperAdminHelpSetting data126=new SuperAdminHelpSetting();
		data126.setSettingname("Serving Wrapper Price Add Completed");
		data126.setSettingtype("Settings");
		data126.setAdminrole("");
		data126.setSettingcontent("Serving Wrapper Price Add Completed");
		data126.setSettingheader("Serving Wrapper Price Add Completed");
		data126.setUser(userdata);
		returSettings.add(data126);
		
		SuperAdminHelpSetting data127=new SuperAdminHelpSetting();
		data127.setSettingname("Base Price Per Dozen Wrapper Price Add Successfull_for_Admin");
		data127.setSettingtype("Settings");
		data127.setAdminrole("");
		data127.setSettingcontent("Base Price Per Dozen Wrapper Price Add Completed");
		data127.setSettingheader("Base Price Per Dozen Wrapper Price Add Completed");
		data127.setUser(userdata);
		returSettings.add(data127);
		
		
		
		SuperAdminHelpSetting data128=new SuperAdminHelpSetting();
		data128.setSettingname("Ingredients' Purchase Quantity Successfull_for_Admin");
		data128.setSettingtype("Settings");
		data128.setAdminrole("");
		data128.setSettingcontent("Ingredients' Purchase Quantity Completed");
		data128.setSettingheader("Ingredients' Purchase Quantity Completed");
		data128.setUser(userdata);
		returSettings.add(data128);
		
		SuperAdminHelpSetting data129=new SuperAdminHelpSetting();
		data129.setSettingname("Ingredients' Purchase Price Successfull_for_Admin");
		data129.setSettingtype("Settings");
		data129.setAdminrole("");
		data129.setSettingcontent("Ingredients' Purchase Price Completed");
		data129.setSettingheader("Ingredients' Purchase Price Completed");
		data129.setUser(userdata);
		returSettings.add(data129);
		
		
		SuperAdminHelpSetting data130=new SuperAdminHelpSetting();
		data130.setSettingname("Recipe Price Per Serving Successfull_for_Admin");
		data130.setSettingtype("Settings");
		data130.setAdminrole("");
		data130.setSettingcontent("Recipe Price Per Serving Completed");
		data130.setSettingheader("Recipe Price Per Serving Completed");
		data130.setUser(userdata);
		returSettings.add(data130);
		
		
		
		
		return returSettings;
		
	}

}
























