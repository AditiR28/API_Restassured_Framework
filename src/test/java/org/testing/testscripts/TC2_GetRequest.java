package org.testing.testscripts;
import java.io.IOException;

import java.util.Properties;

import org.testing.teststeps.postmethod;
import org.testng.jsonparsingorgjson;
import org.testng.properties;

import io.restassured.response.Response;

public class TC2_GetRequest {
	public void testcase2() throws IOException {
		Properties pr = properties.loadpropertiesFile("url folder location"); // url properties
		postmethod post = new postmethod(pr);
        Response res= post.getmethod("URL_1");
       jsonparsingorgjson.jsonprase(res.asString(), "id"); //jsonparsing...
     


	}

}
