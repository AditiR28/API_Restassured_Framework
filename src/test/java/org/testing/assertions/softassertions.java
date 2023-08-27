package org.testing.assertions;


import io.restassured.response.Response;

public class softassertions {
	
	public static Boolean assert1(int expectedStatusCode,Response res)
	{
		if(expectedStatusCode ==res.getStatusCode())
		{
			System.out.println("Status code is matching");
			return true;
		}
		else {
			System.out.println("Status code is not matching");


			return false;

		}
	}
		public static Boolean assert2(String expectedValue,String actualValue)
		{
			if(expectedValue.equals(actualValue))
			{
				System.out.println("Data is matching");
				return true;
			}
			else {
				System.out.println("Data is not matching");


				return false;

			}

}
}
