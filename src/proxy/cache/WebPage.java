package proxy.cache;

import java.util.HashMap;

public class WebPage implements ICacheable{

	
	public HashMap<String,Web> getInitialCache(){
		HashMap<String, Web> cache = new HashMap<>();
		
		cache.put("facebook.com", new Web("facebook.com", "facebook"));
		cache.put("google.com", new Web("google.com", "google"));
		
		return cache;
	}
	
	public void getContent(String url) {
		System.out.println("Fetching data from: " + url);
		System.out.println("Time fetched " + (int)(Math.random()*10) + " second's");
	}
	
	@Override
	public HashMap<String, Web> cachedWeb() {
		return getInitialCache();
	}

	@Override
	public Web getWeb(String url) {
		getContent(url);
		return new Web(url, url);
	}


}
