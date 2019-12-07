package BrokenLink;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class link {
	
	public static void verifylink(String Linkurl) throws IOException{
		
		try {
			URL url = new URL(Linkurl);
			
			HttpURLConnection httpcon = (HttpURLConnection)url.openConnection();
			httpcon.setConnectTimeout(3000);
			
			httpcon.connect();
			
			if(httpcon.getResponseCode()>=400){
				System.out.println(url+" Broken link");
				
			}
			else{
				System.out.println(url+" valid link");
			}

		} catch (MalformedURLException e) {
			
			e.printStackTrace();
		}
	}

}
