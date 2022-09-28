package com.springproject;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Service;

@Service
public class JsonFile {
	JSONParser jsonparser = new JSONParser();

	public String fetchData(String name) throws IOException, ParseException
	{
		FileReader reader = new FileReader(".//src/main/resources/data.json");
		
		Object obj = jsonparser.parse(reader);
		
		JSONObject jsonObject = (JSONObject)obj;
		
		JSONArray jArray = (JSONArray)jsonObject.get("States");
		
		String result = "Not Present";
		
		for(int i = 0; i < jArray.size(); i++)
		{
			JSONObject obj1 = (JSONObject) jArray.get(i);
			String stateName = (String) obj1.get("StateName");
			String webContent = (String) obj1.get("WebContent");
			if(stateName.equals(name))
				result = webContent;
		}
		
		return result;
		
	}

}
