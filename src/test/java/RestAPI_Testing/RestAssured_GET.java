package RestAPI_Testing;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssured_GET {

	public static void main(String[] args) {
		
		//set the base URL
		RestAssured.baseURI = "https://reqres.in/api/user?page=2";
		
		//create request object
		RequestSpecification httpRequest = RestAssured.given();
		
		//response object
		Response myResponse = httpRequest.request(Method.GET);
		
		//prints a single format
	//	String myStringResponse = myRespone.getBody().asString();
		
		//print in json format
		String myStringResponsePretty = myResponse.getBody().asPrettyString();
		System.out.println(myStringResponsePretty); //gets the response body in pretty format
		
		System.out.println(myResponse.getStatusCode()); //gets the status code
		Assert.assertEquals(myResponse.getStatusCode(), 200); //asserts the status code
		
		
	}

}
