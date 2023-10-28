package facade;

import facade.model.*;

public class InstaFacade {

	public Feeds feeds;
	public Video video;
	public Story story;
	
	public InstaFacade() {
		this.feeds = new Feeds();
		this.video = new Video();
		this.story = new Story();
	}

	public void postFeed(String creator, String content) {
		feeds.post(creator, content);
	}
	
	public void deleteFeed(String creator, String content) {
		feeds.delete(creator, content);
	}
	
	public void postVideo(String creator, String content) {
		video.post(creator, content);
	}
	
	public void deleteVideo(String creator, String content) {
		video.delete(creator, content);
	}
	
	public void postStory(String creator, String content) {
		story.post(creator, content);
	}
	
	public void deleteStory(String creator, String content) {
		story.delete(creator, content);
	}
	
	
}
