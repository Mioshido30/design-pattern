package proxy.cache;

public class Browser {

	ICacheable wp;

	public Browser(ICacheable wp) {
		super();
		this.wp = wp;
	}
	
	public void renderWebPage(String url) {
		Web web = wp.getWeb(url);
		
		System.out.println("Web url: " + web.getUrl());
		System.out.println("Title: " + web.getTitle());
	}
	
	public void renderAll() {
		renderWebPage("google.com");
		renderWebPage("instagram.com");
		renderWebPage("facebook.com");
		renderWebPage("youtube.com");
	}

}
