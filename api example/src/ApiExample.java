import java.io.IOException;


import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.net.URI;
import java.net.http.HttpClient; 
import java.net.http.HttpRequest; 
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import com.mysql.cj.xdevapi.JsonParser;


public class ApiExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub		
		
		
		
		  String url = "https://freegeoip.app/json/"; HttpClient client =
		  HttpClient.newHttpClient(); 
		  HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build(); 
		  HttpResponse<String> response=client.send(request, BodyHandlers.ofString());
		  System.out.println(response.body());
		 
		  
		  
			/*
			 * JsonParser parse = new JsonParser(); JSONObject jobj = new
			 * JSONObject(response); JSONArray arr = new jobj.getJSONArray("country_code");
			 * System.out.println(jobj.getDouble("country_code")); for (int i = 0;
			 * i<response.length();i++) { String country_code =
			 * response.getJsonObject(i).getString("country_code");
			 * System.out.println(country_code); }
			 */
		/*String addr  = "";
		String s = "https://freegeoip.app/json/"; s += URLEncoder.encode(addr, "UTF-8"); URL url = new
				  URL(s);
				  
				  // read from the URL
				  Scanner scan = new Scanner(url.openStream()); String str
				  = new String(); while (scan.hasNext()) str += scan.nextLine(); scan.close();
				  
				  // build a JSON object 
				  JSONObject obj = new JSONObject(str); if (!
				  obj.getString("status").equals("OK")) return;
				  
				  // get the first result 
				  JSONObject res =
				  obj.getJSONArray("results").getJSONObject(0);
				  System.out.println(res.getString("country_name")); 
				  JSONObject loc =res.getJSONObject("ip").getJSONObject("ip");
				  System.out.println("lat: " + loc.getString("country_code") + ", lng: " + loc.getDouble("ip")); }
		*/
		
		  

		
		
		
		
	}
	public static String parse(String response) throws JSONException{
	      JSONArray albums = new JSONArray(response);
	      for(int i=0;i<albums.length(); i++){
	          JSONObject album = albums.getJSONObject(i);
	          String country_code = album.getString("country_code");
	         // int confirmed = album.getInt("confirmed");
	          //int recovered = album.getInt("recovered");
	          System.out.println("For the Country"+" "+ country_code);
	           
	      }
	     
	       return null;
	  }	
}
	
	
	 /* public static void geocoding(String addr) throws Exception { // build a URL
	  String s = "https://freegeoip.app/json/"; s += URLEncoder.encode(addr, "UTF-8"); URL url = new
	  URL(s);
	  
	  // read from the URL
	  Scanner scan = new Scanner(url.openStream()); String str
	  = new String(); while (scan.hasNext()) str += scan.nextLine(); scan.close();
	  
	  // build a JSON object 
	  JSONObject obj = new JSONObject(str); if (!
	  obj.getString("status").equals("OK")) return;
	  
	  // get the first result 
	  JSONObject res =
	  obj.getJSONArray("results").getJSONObject(0);
	  System.out.println(res.getString("country_name")); 
	  JSONObject loc =res.getJSONObject("ip").getJSONObject("ip");
	  System.out.println("lat: " + loc.getString("country_code") + ", lng: " + loc.getDouble("ip")); }
	 */
	
		

