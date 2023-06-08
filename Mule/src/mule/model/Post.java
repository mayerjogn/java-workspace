package mule.model;

public class Post {

	private String post;
	private String title;
	private String search;
	public Post() {}
	public Post(String post, String title, String search) {
		this.post = post;
		this.title = title;
		this.search = search;
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
	public String getSearch() {
		return search;
	}
	public void setSearch(String search) {
		this.search = search;
	}

	
	
	

}
