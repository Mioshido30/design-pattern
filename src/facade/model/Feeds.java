package facade.model;

public class Feeds implements PostsManager {

	public Feeds() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void post(String creator, String content) {
		System.out.println(creator + " just posted a new feed: "+ content);
	}

	@Override
	public void delete(String creator, String content) {
		System.out.println(creator + " just deleted " + content + " from feed");
	}

}
