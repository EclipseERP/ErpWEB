package com.ets.csm.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class DateUtility {
	
	public static String getDate() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = new Date();
		String d = dateFormat.format(date);
		return d;
	}
	
	
	/*public static String getOnlyDate() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
		Date date = new Date();
		String d = dateFormat.format(date);
		return d;
	}*/
	
	
	public static Date strindtoMysql(String dates)throws Exception
	{

		DateFormat formatter = new SimpleDateFormat("yyyy-mm-dd");
		Date date = formatter.parse(dates);
		return date;
		
	}
	
	
	
	public static String getOnlyDateWithMySQLFORMAT() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		String d = dateFormat.format(date);
		
		return d;
		
	}
	
	public static java.sql.Date mysqlDateConvertor(String s)
	{
		java.sql.Date sqlDate=null;
		String lastCrawlDate = s;
		Date utilDate;
		try {
			 utilDate = new SimpleDateFormat("yyyy-MM-dd").parse(lastCrawlDate);
			 sqlDate = new java.sql.Date(utilDate.getTime()); 
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		return  sqlDate;
}
	
	
	
	public static java.sql.Timestamp getTimeStamp(String s)
	{
	
		java.sql.Timestamp sqlTime=null;
		java.util.Date date=new java.util.Date();
		
		java.sql.Date sqlDate=new java.sql.Date(date.getTime());
		sqlTime=new java.sql.Timestamp(date.getTime());
		
		return  sqlTime;
}
	
	
	
	public static java.sql.Timestamp getTimeStamp_To_Mysql(String times)
	{
		
		//hh:mm:s tt
		DateFormat dateFormat = new SimpleDateFormat("h:mm:ss");
		java.sql.Timestamp sqlTime=null;
		java.util.Date date;
		try {
			date = dateFormat.parse(times);
			sqlTime=new java.sql.Timestamp(date.getTime());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return  sqlTime;
}
	
	public static Date getCurrentDateWithTime()
	{
		Date date = new Date();
		return date;
	}

}
