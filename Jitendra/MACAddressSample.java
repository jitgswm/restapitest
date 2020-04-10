import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class MACAddressSample {


	public static void main(String[] args) throws IOException {
		
		//MACAddressSample.MyGETRequest();
		
		String macaddress = args[0];
		System.out.println("macaddress " + macaddress);
		MACAddressSample.MyGETRequest(macaddress);
		
	}
	
	
   	
	public static void MyGETRequest(String macaddress) throws IOException {
		//MAC Address 44:38:39:ff:ef:57
	    URL urlForGetRequest = new URL(" \r\n" + 
	    		"https://api.macaddress.io/v1?apiKey=at_5V3HU7anDCjRgfXcB6lyKkyuabuGB&output=json&search="+ macaddress);
	    String readLine = null;
	    HttpURLConnection conection = (HttpURLConnection) urlForGetRequest.openConnection();
	    conection.setRequestMethod("GET");
	    //conection.setRequestProperty("search", "44:38:39:ff:ef:57");
	    conection.setRequestProperty("output", "json");
	    //conection.setRequestProperty("search", macaddress);
	    // set userId its a sample here
	    int responseCode = conection.getResponseCode();
	    System.out.println("response code " + responseCode);
	    if (responseCode == HttpURLConnection.HTTP_OK) {
	        BufferedReader in = new BufferedReader(
	            new InputStreamReader(conection.getInputStream()));
	        StringBuffer response = new StringBuffer();
	        while ((readLine = in .readLine()) != null) {
	            response.append(readLine);
	        } in .close();
	        // print result
	        System.out.println("JSON String Result " + response.toString());
	        //GetAndPost.POSTRequest(response.toString());
	    } else {
	        System.out.println("GET NOT WORKED");
	    }

	}
	
	
	


}
