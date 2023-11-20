package proxy.cache;

import java.util.HashMap;

public interface ICacheable {

	public HashMap<String,Web> cachedWeb();
	public Web getWeb(String url);
}
