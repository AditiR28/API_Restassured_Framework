package org.testng; // this is utilites folder
import java.io.File;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;
public class properties {
	//input parameter--file path
	//purpose of the method --to load the properties file
	//output parameter --object of properties  class
	

public static Properties loadpropertiesFile(String filepath) throws IOException   // define class properties
	{
		File f = new File(filepath);
		FileInputStream fi = new FileInputStream(f);
		Properties pr = new Properties(); // creation of object in properties
		pr.load(fi);
		return pr; // return the object of properties class
	}

}
