package utils;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioFormat.Encoding;

import org.apache.commons.io.FileUtils;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonReader {
	
	
	public static JSONObject getJsonData() throws IOException, ParseException
	
	{
		
		File file=new File("C:\\Users\\ASUS\\eclipse-workspace-Appium\\AppiumDemo\\src\\test\\resources\\testData\\testData.json");
		String json=FileUtils.readFileToString(file, "UTF-8");//convert json file into string
		Object obj= new JSONParser().parse(json);//parse the string into object
		JSONObject jsonObject= (JSONObject)obj;//convert object into json object
		return jsonObject;
		
	}
	
	
	
	
	public static String getTestData(String key) throws IOException, ParseException
	
	{
		String testDataValue;
		
		return testDataValue =	(String) getJsonData().get(key);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
