package org.testing.testscripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.responsevalidation.validateresponse;
import org.testing.teststeps.postmethod;
import org.testng.jsonhandle;
import org.testng.jsonparsingorgjson;
import org.testng.jsonreplacement;
import org.testng.properties;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC_4Putrequest {
	
	
		static String returnidValue;
@Test
		public  void testcase4() throws IOException {
			Properties pr = properties.loadpropertiesFile("C:\\Users\\Dell\\OneDrive\\Desktop\\API_Restassured_Framework\\url.properties"); // url properties
		String requestBody =jsonhandle.loadJsonFile("C:\\Users\\Dell\\OneDrive\\Desktop\\API_Restassured_Framework\\src\\test\\java\\org\\testing\\resources\\updaterequestpayloadd.json");/// requestpayload json file location
		
		requestBody = jsonreplacement.assignVariableValue(requestBody, "id", TC_1post.returnidValue); // if we want to update particular record then we will pass
		//particular id in return id value...
		postmethod post = new postmethod(pr);
			Response res =post.putmethod(requestBody,"URL_1",TC_1post.returnidValue);
		     returnidValue=  jsonparsingorgjson.jsonprase(res.asString(), "id"); //jsonparsing..
				validateresponse.validatestatusCode(200,res);

			

		}
		

	}


