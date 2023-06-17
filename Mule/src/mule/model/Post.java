package mule.model;

public class Post {

	private String post;
	private String title;
	public Post() {}
	public Post(String post, String title) {
		this.post = post;
		this.title = title;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return "Post [post=" + post + ", title=" + title + "]";
	}
	
	}

	
	
	


