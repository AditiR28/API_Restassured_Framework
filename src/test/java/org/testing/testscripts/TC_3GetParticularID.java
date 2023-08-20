package org.testing.testscripts;
import java.io.IOException;
import java.util.Properties;
import org.testing.teststeps.postmethod;
import org.testng.properties;
import io.restassured.response.Response;

public class TC_3GetParticularID {
	public void testcase3() throws IOException {
		Properties pr = properties.loadpropertiesFile("url properties"); // url properties
		postmethod post = new postmethod(pr);
        Response res= post.getparticularid("URL_1",TC_1post.returnidValue);
        
        
	}

}
