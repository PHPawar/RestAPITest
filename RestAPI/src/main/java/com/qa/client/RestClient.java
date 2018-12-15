package com.qa.client;

import java.io.IOException;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class RestClient {
	public int statuscode;
	
	public void get(String url) throws ClientProtocolException, IOException
	{
	CloseableHttpClient httpClient=	HttpClients.createDefault();
	HttpGet httpget = new HttpGet(url);
	CloseableHttpResponse httpresponse= httpClient.execute(httpget);
	statuscode = httpresponse.getStatusLine().getStatusCode();
	System.out.println("Statuc code = "+   statuscode);
	Header header[]= httpresponse.getAllHeaders();
	for (int i = 0; i < header.length; i++) {
		System.out.println(header[i]);
	} 
	
	
	
	}

}
