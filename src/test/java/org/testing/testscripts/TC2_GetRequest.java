package org.testing.testscripts;
import java.io.IOException;


import java.util.Properties;

import org.testing.responsevalidation.validateresponse;
import org.testing.teststeps.postmethod;
import org.testng.properties;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC2_GetRequest {
	@Test
	public void testcase2() throws IOException {
		Properties pr = properties.loadpropertiesFile("C:\\Users\\Dell\\OneDrive\\Desktop\\API_Restassured_Framework\\url.properties"); // url properties
		postmethod post = new postmethod(pr);
        Response res= post.getmethod("URL_1");
		validateresponse.validatestatusCode(200,res);


     


	}

}
