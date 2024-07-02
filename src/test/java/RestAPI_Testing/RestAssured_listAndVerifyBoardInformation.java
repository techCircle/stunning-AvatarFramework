package RestAPI_Testing;

import Utilities.BaseClass;
import io.restassured.RestAssured;
import static org.hamcrest.Matchers.*;

public class RestAssured_listAndVerifyBoardInformation {

	public static void main(String[] args) {
		
		
		RestAssured.given()
		.param("key", BaseClass.getProperty("key"))
		.param("token", BaseClass.getProperty("token"))
		.get(BaseClass.getProperty("baseURL"))
		.then().statusCode(200)   //checks for status code.. if it fails, it will break and stop
		.body("id[0]", equalTo("667a18de4ffb6fda6a592e47"))
		.body("name", hasItems("Ali Family","El-Khatib Family")); //if it fails to verify, it will break
	
	}

}
