package org.testing.responsevalidation;
import org.testing.assertions.jsonparsingusingjsonpath;
import org.testing.assertions.softassertions;

import org.testng.Assert;

import io.restassured.response.Response;

public class validateresponse {
	public static void validatestatusCode(int expectedStatusCode,Response res) {
		//Assert.assertEquals(res.statusCode(),expectedStatusCode,"Status code is not matching" );
		//System.out.println("Status Code is matching"); //hard assertion
		Boolean response=softassertions.assert1(expectedStatusCode, res)	;
        Assert.assertTrue(response);
		
	}
	public static void ValidateResponseData(String expectedValue,Response res,String jsonpath) {
	String actualValue =	jsonparsingusingjsonpath.jsonparse(res, jsonpath);
		Boolean response=softassertions.assert2(expectedValue,actualValue );
        Assert.assertTrue(response);
		
	}

}
