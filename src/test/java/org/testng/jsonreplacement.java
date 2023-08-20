package org.testng;
//input parameter -->> complete request body,variable name,variable value
//purpose of the method ->>> to assign the value to the variable
//output --> replace value

import java.util.regex.Pattern;

public class jsonreplacement {

	public static String assignVariableValue(String requestBody,String variableName,String variableValue ) {
	 requestBody=	requestBody.replaceAll(Pattern.quote("{{"+"variableName"+"}}"),variableValue);
	 return requestBody;
	 
		

	}

}
