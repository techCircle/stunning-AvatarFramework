package RestAPI_Testing;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class APITesting_Demo {
	
	
	public static void main(String[] args) {
		 HttpClient client = HttpClient.newHttpClient();

	        HttpRequest request = HttpRequest.newBuilder()
	                .uri(URI.create("https://api.trello.com/1/members/me/boards?oauth_consumer_key=763fefcdc906727ada3ff5df172b52fe&oauth_token=ATTA3726bf54ca82fd55e58cbb3850a1d30288afe2da413712e35fff72d29e17d7e408E05A23&oauth_signature_method=HMAC-SHA1&oauth_timestamp=1719450364&oauth_nonce=CWhRRPGmyFb&oauth_version=1.0&oauth_signature=0VaaxJQ%2FPvgqpL2xtqodc25gpUM%3D"))
	                .header("Cookie", "dsc=39c21800cf5dbce7bc16461439c1f8b303cd472616be767b2fec67700dccfff6")
	                .build();

	        try {
	            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
	            System.out.print(response);
	           
	        } catch (IOException | InterruptedException e) {
	            e.printStackTrace();
	        }
	}

}
