package facade.model;

public interface PostsManager {

	public void post(String creator, String content);
	public void delete(String creator, String content);
}
