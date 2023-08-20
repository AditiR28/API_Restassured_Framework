package org.testng;
import org.json.JSONArray;
import org.json.JSONObject;
//input parameter -->> complete responsebody,keyname

public class jsonparsingorgjson {
	

	public static String jsonprase(String responseData,String keyname) {
		{
			if(responseData.startsWith("["))
			{
		JSONArray array = new JSONArray(responseData);
		int L = array.length();
		for(int i=0;i<L;i=i+1)
		{
			JSONObject ob = array.getJSONObject(i) ;
			System.out.println(ob.get(keyname));
		}
        return null;
	}
		else if(responseData.startsWith("{")) {
			JSONObject j = new JSONObject(responseData);
			String responseId=j.getString(keyname);
			return responseId;
		}
			
		}
		return null;
		
	
	}
	}


