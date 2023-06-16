package mule.model;

import java.util.List;
import java.util.Objects;

public class User {
	
	private String id;
	private String password;
	private String phone;
	private String nickname;
	private String name;
	
	private List<Post> postlist; //근데 여기다가 담아놨는데..

	public User(String id, String password, String phone, String nickname, String name, List<Post> postlist) {
		super();
		this.id = id;
		this.password = password;
		this.phone = phone;
		this.nickname = nickname;
		this.name = name;
		this.postlist = postlist;
	}

	public User(String id, String password) {
		this.id = id;
		this.password=password;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Post> getPostlist() {
		return postlist;
	}

	public void setPostlist(List<Post> postlist) {
		this.postlist = postlist;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, nickname, password, phone, postlist);
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", password=" + password + ", phone=" + phone + ", nickname=" + nickname + ", name="
				+ name + ", postlist=" + postlist + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name)
				&& Objects.equals(nickname, other.nickname) && Objects.equals(password, other.password)
				&& Objects.equals(phone, other.phone) && Objects.equals(postlist, other.postlist);
	}
	
	

}
