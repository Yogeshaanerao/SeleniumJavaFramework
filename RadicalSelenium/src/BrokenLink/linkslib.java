package BrokenLink;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class linkslib {
	
	public static void verifylink (String linkurl) throws IOException
	{
		URL url =  new URL(linkurl);
		
		HttpURLConnection httpcon = (HttpURLConnection) url.openConnection();
		
		httpcon.setConnectTimeout(3000);
		
		httpcon.connect();
		
		if (httpcon.getResponseCode()>=4000)
		{
			System.out.println(url+" is broken");
		}
		else{
			System.out.println(url+" is Valid");
		}
		
	}
	

}
