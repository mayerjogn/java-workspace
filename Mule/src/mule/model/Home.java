package mule.model;

public class Home {

	public String post;
	public String search;
	public String market;
	public String review;
	public String job;
	
	public Home() {
	}

	public Home(String post, String search, String market, String review, String job) {
		this.post = post;
		this.search = search;
		this.market = market;
		this.review = review;
		this.job = job;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}

	public String getMarket() {
		return market;
	}

	public void setMarket(String market) {
		this.market = market;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	@Override
	public String toString() {
		return "Home [post=" + post + ", search=" + search + ", market=" + market + ", review=" + review + ", job="
				+ job + "]";
	}

	

}
