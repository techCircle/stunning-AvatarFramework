package RestAPI_Testing;

import org.testng.Assert;

import com.github.javafaker.Faker;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssured_API_Trello_CreateBoard {

	public static void main(String[] args) {
		
		Faker faker = new Faker();

//Rest assured Base URL
		RestAssured.baseURI = "https://api.trello.com/1/boards";
		
		String Kvalue = "763fefcdc906727ada3ff5df172b52fe";
		String token = "ATTA3726bf54ca82fd55e58cbb3850a1d30288afe2da413712e35fff72d29e17d7e408E05A23";
		String randomBoardName  = faker.university().name();
		
// create request object
		RequestSpecification httpRequest = RestAssured.given();
		
		httpRequest.header("Content-Type", "application/json");
		
		
		Response res = httpRequest.post(RestAssured.baseURI+"/?name="+randomBoardName+"&key="+Kvalue+"&token="+token);
		
		//'https://api.trello.com/1/boards/?name={name}&key=APIKey&token=APIToken'
		
		int statusCode = res.getStatusCode();
		
		Assert.assertEquals(statusCode, 200);
		
		
	}

}
