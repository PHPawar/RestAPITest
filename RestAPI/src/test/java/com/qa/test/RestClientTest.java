package com.qa.test;
import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.client.RestClient;

public class RestClientTest extends TestBase {
	TestBase testbase;
	String appurl;
	String serviceurl;
	 String url;
	 RestClient restclient;
	 
	
	@BeforeTest
	public void setup()
	{
		testbase = new TestBase();
        appurl=prop.getProperty("url");
        serviceurl=prop.getProperty("serviceUrl");
        url=appurl+serviceurl;
        System.out.println(url);
        
	}
   @Test
   public void getAPITest() throws ClientProtocolException, IOException
   {
	   restclient = new RestClient();
	   restclient.get(url);
	   Assert.assertEquals(restclient.statuscode, 200);
   }
}
