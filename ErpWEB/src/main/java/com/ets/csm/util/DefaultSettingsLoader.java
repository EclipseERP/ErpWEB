package com.ets.csm.util;

import java.util.ArrayList;
import java.util.List;

import com.ets.csm.model.SettingsMaster;
import com.ets.csm.model.User;

public class DefaultSettingsLoader {
	
	public static List getDefaultSettings(User userdata)
	{
		List returSettings=new ArrayList();
		
		SettingsMaster s1=new SettingsMaster();
		s1.setUser(userdata);		
		s1.setSlug("terms_and_condition");
		s1.setTitle("Terms & Condition");
		s1.setDescription("Put your shop Terms & Condition");
		s1.setType("textarea");

		s1.setDefaultText("");
		s1.setValue("10");
		s1.setOptions("");
		s1.setIs_required(1);
		s1.setIs_gui(1);
		s1.setModule("General");
		s1.setRow_order(2);
		returSettings.add(s1);
		
		SettingsMaster s2=new SettingsMaster();
		s2.setUser(userdata);		
		s2.setSlug("tax_rate");
		s2.setTitle("Tax Rate");
		s2.setDescription("Put your shop Terms & Condition");
		s2.setType("text");
		s2.setDefaultText("0.0");
		s2.setValue("25.30");
		s2.setOptions("");
		s2.setIs_required(1);
		s2.setIs_gui(1);
		s2.setModule("Financial");
		s2.setRow_order(2);
		
		returSettings.add(s2);
		
		SettingsMaster s3=new SettingsMaster();
		s3.setUser(userdata);		
		s3.setSlug("vat_registration_number");
		s3.setTitle("VAT Registration Number");
		s3.setDescription("VAT Registration Number");
		s3.setType("text");
		s3.setDefaultText("0.0");
		s3.setValue("10");
		s3.setOptions("");
		s3.setIs_required(1);
		s3.setIs_gui(1);
		s3.setModule("Financial");
		s3.setRow_order(2);
		returSettings.add(s3);
		
		SettingsMaster s4=new SettingsMaster();
		s4.setUser(userdata);		
		s4.setSlug("hourly_rate");
		s4.setTitle("Hourly Rate");
		s4.setDescription("Used to calculate total net cost of cake, estimating 10 hours to do 100 serving.");
		s4.setType("text");
		s4.setDefaultText("0.0");
		s4.setValue("10");
		s4.setOptions("");
		s4.setIs_required(1);
		s4.setIs_gui(1);
		s4.setModule("Financial");
		s4.setRow_order(2);
		returSettings.add(s4);
		
		SettingsMaster s5=new SettingsMaster();
		s5.setUser(userdata);		
		s5.setSlug("price_for_each_icing_per_serving");
		s5.setTitle("Price for each icing per serving");
		s5.setDescription("VAT Registration Number");
		s5.setType("text");
		s5.setDefaultText("0.0");
		s5.setValue("10");
		s5.setOptions("");
		s5.setIs_required(1);
		s5.setIs_gui(1);
		s5.setModule("Icings Price Per Servings");
		s5.setRow_order(2);
		returSettings.add(s5);
		
		SettingsMaster s6=new SettingsMaster();
		s6.setUser(userdata);		
		s6.setSlug("payment_remider_due_day");
		s6.setTitle("Payment Reminder Due Day");
		s6.setDescription("Define the days to send payment reminder to Bride - default to 30 days");
		s6.setType("text");
		s6.setDefaultText("0.0");
		s6.setValue("30");
		s6.setOptions("");
		s6.setIs_required(1);
		s6.setIs_gui(1);
		s6.setModule("Financial");
		s6.setRow_order(2);
		returSettings.add(s6);
		
		SettingsMaster s7=new SettingsMaster();
		s7.setUser(userdata);		
		s7.setSlug("order_archival_span");
		s7.setTitle("Order archival span");
		s7.setDescription("Order archival span (order items will be archived) - default to 10 days");
		s7.setType("text");
		s7.setDefaultText("0.0");
		s7.setValue("10");
		s7.setOptions("");
		s7.setIs_required(1);
		s7.setIs_gui(1);
		s7.setModule("Financial");
		s7.setRow_order(2);
		returSettings.add(s7);
		
		SettingsMaster s8=new SettingsMaster();
		s8.setUser(userdata);		
		s8.setSlug("tax_delivery");
		s8.setTitle("Tax Delivery");
		s8.setDescription("VAT Registration Number");
		s8.setType("checkbox");
		s8.setDefaultText("0.0");
		s8.setValue("10");
		s8.setOptions("1=Yes");
		s8.setIs_required(1);
		s8.setIs_gui(1);
		s8.setModule("Financial");
		s8.setRow_order(2);
		returSettings.add(s8);
		
		
		SettingsMaster s9=new SettingsMaster();
		s9.setUser(userdata);		
		s9.setSlug("baking_time_100_serving");
		s9.setTitle("Hours to do 100 serving cake");
		s9.setDescription("Hours to do 100 serving cake");
		s9.setType("text");
		s9.setDefaultText("10");
		s9.setValue("10");
		s9.setOptions("");
		s9.setIs_required(1);
		s9.setIs_gui(1);
		s9.setModule("Financial");
		s9.setRow_order(2);
		returSettings.add(s9);
		
		
		SettingsMaster s10=new SettingsMaster();
		s10.setUser(userdata);		
		s10.setSlug("price_per_100_serving");
		s10.setTitle("Price per serving");
		s10.setDescription("Price per 100 serving cake");
		s10.setType("text");
		s10.setDefaultText("10");
		s10.setValue("10");
		s10.setOptions("");
		s10.setIs_required(1);
		s10.setIs_gui(1);
		s10.setModule("Financial");
		s10.setRow_order(2);
		returSettings.add(s10);
		

		SettingsMaster s11=new SettingsMaster();
		s11.setUser(userdata);		
		s11.setSlug("Hours to do 100 serving cake");
		s11.setTitle("Hours to do 100 serving cake");
		s11.setDescription("Hours to do 100 serving cake");
		s11.setType("text");
		s11.setDefaultText("10");
		s11.setValue("10");
		s11.setOptions("");
		s11.setIs_required(1);
		s11.setIs_gui(1);
		s11.setModule("Financial");
		s11.setRow_order(2);
		returSettings.add(s11);
		
		
		SettingsMaster s12=new SettingsMaster();
		s12.setUser(userdata);		
		s12.setSlug("Time to do 24 cupcakes");
		s12.setTitle("Time to do 24 cupcakes");
		s12.setDescription("Time to do 24 cupcakes");
		s12.setType("text");
		s12.setDefaultText("10");
		s12.setValue("10");
		s12.setOptions("");
		s12.setIs_required(1);
		s12.setIs_gui(1);
		s12.setModule("Financial");
		s12.setRow_order(2);
		returSettings.add(s12);
		
		
		SettingsMaster s13=new SettingsMaster();
		s13.setUser(userdata);		
		s13.setSlug("Vat tax rate");
		s13.setTitle("Vat tax rate");
		s13.setDescription("Vat tax rate");
		s13.setType("text");
		s13.setDefaultText("10");
		s13.setValue("10");
		s13.setOptions("");
		s13.setIs_required(1);
		s13.setIs_gui(1);
		s13.setModule("Financial");
		s13.setRow_order(2);
		returSettings.add(s13);
		
		SettingsMaster s14=new SettingsMaster();
		s14.setUser(userdata);		
		s14.setSlug("Quote archival span");
		s14.setTitle("Quote archival span");
		s14.setDescription("Quote archival span");
		s14.setType("text");
		s14.setDefaultText("10");
		s14.setValue("10");
		s14.setOptions("");
		s14.setIs_required(1);
		s14.setIs_gui(1);
		s14.setModule("Financial");
		s14.setRow_order(2);
		returSettings.add(s14);
		
		SettingsMaster s15=new SettingsMaster();
		s15.setUser(userdata);		
		s15.setSlug("Retails Markup");
		s15.setTitle("Retails Markup");
		s15.setDescription("Retails Markup");
		s15.setType("text");
		s15.setDefaultText("10");
		s15.setValue("10");
		s15.setOptions("");
		s15.setIs_required(1);
		s15.setIs_gui(1);
		s15.setModule("Financial");
		s15.setRow_order(2);
		returSettings.add(s15);
		
		return returSettings;

	}

}
