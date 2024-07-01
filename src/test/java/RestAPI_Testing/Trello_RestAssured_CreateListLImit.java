package RestAPI_Testing;

import org.json.simple.JSONObject;

import com.github.javafaker.Faker;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Trello_RestAssured_CreateListLImit {

	public static void main(String[] args) {

		Faker faker = new Faker();

		//Rest assured Base URL
				RestAssured.baseURI = "https://api.trello.com/1/lists";
				String Kvalue = "763fefcdc906727ada3ff5df172b52fe";
				String token = "ATTA3726bf54ca82fd55e58cbb3850a1d30288afe2da413712e35fff72d29e17d7e408E05A23";
				String boardID  = "667e0f4988ede1b2df2e9628";
				String randomListName = faker.food().ingredient();
				int numList = 0;

				RequestSpecification httpRequest = RestAssured.given();				
				httpRequest.header("Content-Type", "application/json");
				
				
				while(true) {
				//	Response myRes = httpRequest.post(RestAssured.baseURI +"?name="+randomListName+"&idBoard="+boardID+"&key="+Kvalue+"&token="+token);		
					JSONObject  requestBody = new JSONObject();
					requestBody.put("name", "SilentWarriors"+ (numList+1)+" - randomListName");
					requestBody.put("idBoard", boardID);
					requestBody.put("key", Kvalue);
					requestBody.put("token", token);

					Response myRes = httpRequest.body(requestBody.toString()).post();
					
					int statusCode = myRes.getStatusCode();
					
					
					if(statusCode == 200) {
						numList++;
						System.out.println("List " + numList + " created");
					}else {
						System.out.println("Failed to create List");
						myRes.prettyPrint();
						break;
					}	
				}
				

				System.out.println("Number of lists created " + numList);
		//'https://api.trello.com/1/lists?name={name}&idBoard=5abbe4b7ddc1b351ef961414&key=APIKey&token=APIToken'
		
		
		
	}

}
