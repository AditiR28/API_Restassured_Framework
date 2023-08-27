package org.testing.testscripts;
import org.testng.jsonhandle;
import org.testing.responsevalidation.*;
import org.testng.jsonparsingorgjson;
//import org.testng.jsonreplacement;
import  org.testng.properties;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import java.io.IOException;
import java.util.Properties;

import org.testing.responsevalidation.validateresponse;

//import java.util.Random;

import  org.testing.teststeps.postmethod;
public class TC_1post {
	 static String returnidValue;
	@Test

	public  void testcase1() throws IOException {
		Properties pr = properties.loadpropertiesFile("C:\\Users\\Dell\\OneDrive\\Desktop\\API_Restassured_Framework\\url.properties"); // url properties
	String requestBody =jsonhandle.loadJsonFile("C:\\Users\\Dell\\OneDrive\\Desktop\\API_Restassured_Framework\\src\\test\\java\\org\\testing\\resources\\requestpayload.json");/// requestpayload json file location
	//Random r = new Random();
	//Integer idValue = r.nextInt();
	
//	requestBody = jsonreplacement.assignVariableValue(requestBody, "id", idValue.toString())	;
	postmethod post = new postmethod(pr);
		Response res =post.posttmethod(requestBody,"URL_1");
		validateresponse.validatestatusCode(201,res); //validate response
		
	
	     returnidValue=  jsonparsingorgjson.jsonprase(res.asString(), "id"); //jsonparsing...
		

	}

}
