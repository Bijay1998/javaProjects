/*
 * import java.io.IOException;
 * 
 * 
 * import org.json.JSONArray; import org.json.JSONException; import
 * org.json.JSONObject;
 * 
 * import java.net.URI; import java.net.http.HttpClient; import
 * java.net.http.HttpRequest; import java.net.http.HttpResponse;
 * 
 * 
 * 
 *//**
	* 
	*/
/*


*//**
	 * @author lokesh
	 *
	 *//*
		 * public class api { HttpRequest request = HttpRequest.newBuilder()
		 * .uri(URI.create("https://covid-19-data.p.rapidapi.com/country/code?code=np"))
		 * .header("x-rapidapi-host", "covid-19-data.p.rapidapi.com")
		 * .header("x-rapidapi-key",
		 * "5b7cc87dc6msh99e6cf1c05a513ep1e7443jsn4bbb5b0ec14f") .method("GET",
		 * HttpRequest.BodyPublishers.noBody()) .build(); { HttpResponse<String>
		 * response; try { response = HttpClient.newHttpClient().send(request,
		 * HttpResponse.BodyHandlers.ofString()); //System.out.println(response.body());
		 * //Login.parse(response.body().toString());
		 * System.out.println(response.body().toString());
		 * 
		 * } catch (IOException ex) { ex.printStackTrace(); }catch(InterruptedException
		 * ex) { ex.printStackTrace();} }
		 * 
		 * public static String parse(String response) throws JSONException{ JSONArray
		 * albums = new JSONArray(response); for(int i=0;i<albums.length(); i++){
		 * JSONObject album = albums.getJSONObject(i); String country =
		 * album.getString("country"); int confirmed = album.getInt("confirmed"); int
		 * recovered = album.getInt("recovered");
		 * System.out.println("For the Country"+" "+ country + " " +
		 * "the total cases Confirmed is  " +confirmed + " "
		 * +"The total recovered are  " +recovered);
		 * 
		 * }
		 * 
		 * return null; }
		 * 
		 * }
		 */

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.Builder;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * 
 */

/**
 * @author lokesh
 *
 */


public class ApiMain {{
	try {
		String url = "https://freegeoip.app/json/";
		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();
		HttpResponse<String> response=client.send(request, BodyHandlers.ofString());
		System.out.println(response.body());
		//Login.parse(response.body().toString());
		
		
	}catch(Exception e) {
		e.printStackTrace();
	}
	
	
	

}public String parse(String response)throws JSONException{
	JSONArray albums = new JSONArray(response);
	for(int i =0; i<albums.length();i++) {
		JSONObject album = albums.getJSONObject(i);
		String country_code = album.getString("country_code");
		System.out.println(country_code);
	}
	return null;
}
}

