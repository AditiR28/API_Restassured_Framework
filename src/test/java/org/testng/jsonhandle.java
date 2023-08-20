package org.testng;
import java.io.File;
import org.json.JSONTokener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import org.json.JSONObject;
 
//input parameter --Json file path
//purpose of the method -- to read the json file
//outputparamter ---json data in string format

public class jsonhandle {

			
		public static String loadJsonFile (String Filepath) throws FileNotFoundException 
		{
			File f = new File(Filepath);
			FileInputStream fi = new FileInputStream(f);
			JSONTokener js = new JSONTokener(fi);
			JSONObject j = new JSONObject(js);
			return j.toString();
		}
	

}
