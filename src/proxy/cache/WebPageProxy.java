package proxy.cache;

import java.util.HashMap;

public class WebPageProxy implements ICacheable {

	ICacheable webPage;
	HashMap<String, Web> cache;
	
	public WebPageProxy() {
		this.webPage = new WebPage();
		this.cache = new HashMap<String,Web>(); 
	}

	@Override
	public HashMap<String, Web> cachedWeb() {
		
		if(cache.isEmpty()) {
			this.cache = webPage.cachedWeb();
		}
		
		return cache;
	}

	@Override
	public Web getWeb(String url) {
		
		Web web = cache.get(url);
		
		if(web == null) {
			web = webPage.getWeb(url);
			cache.put(url, web);
		} else {
			System.out.println("Fetch data from cache");
		}
		
		return web;
	}

}
