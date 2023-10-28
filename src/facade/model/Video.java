package facade.model;

public class Video implements PostsManager {

	public Video() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void post(String creator, String content) {
		System.out.println(creator + " just posted a video: " + content);
	}

	@Override
	public void delete(String creator, String content) {
		System.out.println(creator + " just deleted " + content + " from video");
	}

}
