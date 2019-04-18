package com.ets.csm.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
import java.util.Map;

public class UrltestGet {

//	public static void main(String[] args) throws IOException
	
	public static void main() throws IOException
	{

		//	public static void getData(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		   String data = "";
		     
	       String request = "https://www.startwriteindia.com/ApiController/payu_hash?price=5000&fname=pradipto&email=royFinal@gmail.com&phone=test2";
	       URL url = new URL(request); 
	       HttpURLConnection con = (HttpURLConnection) url.openConnection();
	       con.setRequestMethod("POST");
	       con.setDoOutput(true);
	       con.getOutputStream().write(data.getBytes("UTF-8"));
	       con.getInputStream();
		
		   BufferedReader in = new BufferedReader(
	       new InputStreamReader(con.getInputStream()));
	       String inputLine;
	       StringBuffer response = new StringBuffer();
           
	       while ((inputLine = in.readLine()) != null) 
           {
	        response.append(inputLine);
           }
	      
           in.close();
	       System.out.println(response.toString());
	}

}
