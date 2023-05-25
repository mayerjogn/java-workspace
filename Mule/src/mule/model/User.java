package mule.model;



public class User {
	
	public String id;
	public String password;
	public String phone;
	public String nickname;
	public String name;
	public User() {
	}
	public User(String id, String password, String phone, String nickname, String name) {
		this.id = id;
		this.password = password;
		this.phone = phone;
		this.nickname = nickname;
		this.name = name;
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
	@Override
	public String toString() {
		return "User [id=" + id + ", password=" + password + ", phone=" + phone + ", nickname=" + nickname + ", name="
				+ name + "]";
	}
	
	
	

}
