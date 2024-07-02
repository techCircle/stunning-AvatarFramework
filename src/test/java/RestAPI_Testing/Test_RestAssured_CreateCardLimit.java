package RestAPI_Testing;

import org.json.simple.JSONObject;

import com.github.javafaker.Faker;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Test_RestAssured_CreateCardLimit {

	public static void main(String[] args) {

		Faker faker = new Faker();

		// Rest assured Base URL
		RestAssured.baseURI = "https://api.trello.com/1/cards";
		String Kvalue = "763fefcdc906727ada3ff5df172b52fe";
		String token = "ATTA3726bf54ca82fd55e58cbb3850a1d30288afe2da413712e35fff72d29e17d7e408E05A23";
//                String boardID  = "667a18de4ffb6fda6a592e47";
		String ListID = "667cb875584917719b823577";
		String randomCardInformation = faker.ancient().hero();

		RequestSpecification httpRequest = RestAssured.given();
		httpRequest.header("Content-Type", "application/json");

		int maxCards = 10001;
		int numCards = 0;

		// --url
		// 'https://api.trello.com/1/cards?idList=5abbe4b7ddc1b351ef961414&key=APIKey&token=APIToken'
		// \

		while (numCards < maxCards) {
			// Response myRes = httpRequest.post(RestAssured.baseURI
			// +"?name="+randomListName+"&idBoard="+boardID+"&key="+Kvalue+"&token="+token);
			JSONObject requestBody = new JSONObject();
			requestBody.put("name", "Card for Silent Avatar - " + randomCardInformation + (numCards + 1));
//                    requestBody.put("boardID", boardID);
			requestBody.put("idList", ListID);
			requestBody.put("key", Kvalue);
			requestBody.put("token", token);

			Response myRes = httpRequest.body(requestBody.toString()).post();

			int statusCode = myRes.getStatusCode();

			if (statusCode == 200) {
				numCards++;
				System.out.println("Card " + numCards + " created");
			} else {
				System.out.println("Failed to create Card");
				myRes.prettyPrint();
				break;
			}
		}

		System.out.println("Number of Cards created " + numCards);

	}

}
