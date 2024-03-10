package coreUtilities.utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;

public class FileOperations 
{
	public JSONParser jsonParser;
	public JSONObject jsonObject;
	public Fillo fillo;
	public Connection connection;
	public Properties properties;
	
	
	

	@SuppressWarnings("unchecked")
	public Map<String, String> readJson(String file, String jsonNode) throws FileNotFoundException, IOException, ParseException
	{
		return null;
	}
	
	
}