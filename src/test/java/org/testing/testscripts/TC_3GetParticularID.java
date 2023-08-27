package org.testing.testscripts;
import java.io.IOException;
import java.util.Properties;

import org.testing.responsevalidation.validateresponse;
import org.testing.teststeps.postmethod;
import org.testng.properties;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC_3GetParticularID {
	@Test
	public void testcase3() throws IOException {
		Properties pr = properties.loadpropertiesFile("C:\\Users\\Dell\\OneDrive\\Desktop\\API_Restassured_Framework\\url.properties"); // url properties
		postmethod post = new postmethod(pr);
        Response res= post.getparticularid("URL_1",TC_1post.returnidValue);
		validateresponse.validatestatusCode(200,res);
		validateresponse.ValidateResponseData("Aditiiiiiii", res, "firstname");


        
        
	}

}
