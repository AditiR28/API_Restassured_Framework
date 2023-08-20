package org.testing.teststeps;

import java.io.IOException;
import java.util.Properties;

import org.testing.testscripts.TC_1post;
import org.testng.properties;

import io.restassured.response.Response;

public class TC_5Deleterequest {
	public void testcase5()throws IOException {
	
	Properties pr = properties.loadpropertiesFile("url properties"); // url properties
	postmethod post = new postmethod(pr);
    Response res= post.Deletemethod("URL_1",TC_1post.returnidValue);

}
}