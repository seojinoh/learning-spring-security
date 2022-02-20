package me.seojinoh.learning.springSecurity.dto;

import me.seojinoh.learning.springSecurity.entity.Member;

public class MemberJoinRequest {

	private String email;
	private String password;
	private String username;
	private String phoneNumber;

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public String getUsername() {
		return username;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Member toEntity() {
		return new Member.Builder(email, password, username, phoneNumber)
				.build();
	}

}
