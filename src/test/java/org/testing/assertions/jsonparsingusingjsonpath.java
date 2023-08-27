package org.testing.assertions;

import io.restassured.response.Response;
//input parameter --response object and the jsonpath
//purpose ==it will extract value from the response path
//the jsonpath that we are giving
//output parameter -- it will return string value

public class jsonparsingusingjsonpath {
	public static String jsonparse(Response res,String Jsonpath) {
	return	res.jsonPath().get(Jsonpath);
		
	}

}
