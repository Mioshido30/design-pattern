package facade.model;

public class Story implements PostsManager {

	public Story() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void post(String creator, String content) {
		System.out.println(creator + " just posted a new story: " + content);
	}

	@Override
	public void delete(String creator, String content) {
		System.out.println(creator + " just deleted " + content + " from story");
	}

}
