package proxy;

import proxy.cache.Browser;
import proxy.cache.WebPage;
import proxy.cache.WebPageProxy;
import proxy.protection.DatabaseProxy;
import proxy.protection.User;
import proxy.virtual.ImageProxy;

public class Main {

	/*
	 * Proxy is a structural design pattern that lets you provide a substitute or placeholder 
	 * for another object. 
	 * A proxy controls access to the original object, allowing you to perform something 
	 * either before or after the request gets through to the original object.
	 * */

	public Main() {
		
		
		
		// Protection Proxy
		DatabaseProxy admin_dp = new DatabaseProxy(new User("Shido", "admin"));
		DatabaseProxy user_dp = new DatabaseProxy(new User("Haruto", "user"));
		
		admin_dp.executeQuery("select * from msuser");
		admin_dp.executeQuery("insert into msuser value(haruto,123)");

		user_dp.executeQuery("select * from msuser");
		user_dp.executeQuery("insert into msuser value(haruto,123)");
		
		
		// Virtual Proxy
		ImageProxy ip1 = new ImageProxy("watch.png");
		ImageProxy ip2 = new ImageProxy("wall_clock.png");
		
		ip1.displayImage();
		ip1.displayImage();
		ip1.displayImage();

		ip2.displayImage();
		ip2.displayImage();
		ip2.displayImage();		
		
		
		// Cache Proxy
		Browser normalBrowser = new Browser(new WebPage());
		Browser proxyBrowser = new Browser(new WebPageProxy());
		
		System.out.println("Non Proxy Cached call");
		normalBrowser.renderAll();
		System.out.println();
		normalBrowser.renderAll();
		
		System.out.println();
		
		System.out.println("Proxy Cached Call");
		proxyBrowser.renderAll();
		System.out.println("");
		proxyBrowser.renderAll();
	}

	public static void main(String[] args) {
		new Main();
	}

}
