package RestAPI_Testing;

import org.json.simple.JSONObject;
import org.testng.Assert;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssured_POST {

	public static void main(String[] args) {


		//set the base URL
		RestAssured.baseURI = "https://reqres.in/api/user?page=2";
				
		//create request object
	    RequestSpecification httpRequest = RestAssured.given();
		
		
	    //request post request
	    //add data and body using json
	    JSONObject myJson = new JSONObject();
		
	    myJson.put("page", 2);
	    myJson.put("per_page", 36);
		myJson.put("total", 10);
		myJson.put("total_pages", 2022);
		
		httpRequest.header("Content-Type", "application/json");
		httpRequest.body(myJson.toJSONString());
		
		JSONObject dataJson = new JSONObject();
		
		dataJson.put("id", 4);
		dataJson.put("name", "TechCircle");
		dataJson.put("year", 2024);
		dataJson.put("color", "yellow");
		dataJson.put("pantone_value", "14-2025");
		
		
		myJson.put("data", dataJson);
		
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		//convert the JSONObject to a formatted json string
		String prettyJson = gson.toJson(myJson);
		
		//print the formatted JSOn
		System.out.println(prettyJson);
		
		//send the post request
		
		Response res = httpRequest.request(Method.POST);
		
		int statusCode = res.getStatusCode();
		
		Assert.assertEquals(statusCode, 201);
	
	}

}
