package org.testing.teststeps;

import java.util.Properties;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

//input parameter --//request body,uri ==>> uri from properties

public class postmethod {
	
	Properties pr; //global variable 

	public postmethod(Properties pr) { //local variable
		this .pr=pr;
		
	}
	public Response posttmethod(String requestbody,String urikeyname) {
		String uriValue = pr.getProperty(urikeyname);
		Response res=
		given()
		.contentType(ContentType.JSON)
		.body(requestbody)
		.when()
		.post(uriValue);
		System.out.println("Status code is");
	    System.out.println(res.statusCode());
	    System.out.println("Response status is");
	    System.out.println(res.asString());
	    return res;

	}
	public Response getmethod(String urikeyname) {
		String uriValue = pr.getProperty(urikeyname);
		Response res=
		given()
		.contentType(ContentType.JSON)
		.when()
		.get(uriValue);
		System.out.println("Status code is");
	    System.out.println(res.statusCode());
	    System.out.println("Response status is");
	    System.out.println(res.asString());
	    return res;

	}
	public Response getparticularid(String urikeyname,String endPoint) {
		String uriValue = pr.getProperty(urikeyname)+"/"+endPoint;
		Response res=
		given()
		.contentType(ContentType.JSON)
		.when()
		.get(uriValue);
		System.out.println("Status code is");
	    System.out.println(res.statusCode());
	    System.out.println("Response status is");
	    System.out.println(res.asString());
	    return res;

	}


}
