package org.testing.testscripts;
import org.testng.jsonhandle;
import org.testng.jsonparsingorgjson;
//import org.testng.jsonreplacement;
import  org.testng.properties;

import io.restassured.response.Response;

import java.io.IOException;
import java.util.Properties;

//import java.util.Random;

import  org.testing.teststeps.postmethod;
public class TC_1post {
	public static String returnidValue;

	public  void testcase1() throws IOException {
		Properties pr = properties.loadpropertiesFile("url properties"); // url properties
	String requestBody =jsonhandle.loadJsonFile(" url properties");/// requestpayload json file location
	//Random r = new Random();
	//Integer idValue = r.nextInt();
	
//	requestBody = jsonreplacement.assignVariableValue(requestBody, "id", idValue.toString())	;
	postmethod post = new postmethod(pr);
		Response res =post.posttmethod(requestBody,"URL_1");
	     returnidValue=  jsonparsingorgjson.jsonprase(res.asString(), "id"); //jsonparsing...
		

	}

}
