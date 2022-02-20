package me.seojinoh.learning.springSecurity.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import me.seojinoh.learning.springSecurity.dto.MemberJoinResponse;

@Entity
@Table(name = "tb_member")
public class Member {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(length = 80, unique = true, nullable = false)
	private String email;

	@Column(length = 200, nullable = false)
	private String password;

	@Column(length = 200, nullable = false)
	private String username;

	@Column(name = "phone_number", length = 200, unique = true, nullable = false)
	private String phoneNumber;

	@Column(name = "reg_dt")
	private String regDt;

	@Column(name = "last_login_dt")
	private String lastLoginDt;

	private Member() {
	}

	public static class Builder {
		private Integer id;
		private String email;
		private String password;
		private String username;
		private String phoneNumber;
		private String regDt;
		private String lastLoginDt;

		private Builder() {
		}

		public Builder(String email, String password, String username, String phoneNumber) {
			this.email = email;
			this.password = password;
			this.username = username;
			this.phoneNumber = phoneNumber;
		}

		public Builder setRegDt(String regDt) {
			this.regDt = regDt;

			return this;
		}

		public Builder setLastLoginDt(String lastLoginDt) {
			this.lastLoginDt = lastLoginDt;

			return this;
		}

		public Member build() {
			Member member = new Member();
			member.email = email;
			member.password = password;
			member.username = username;
			member.phoneNumber = phoneNumber;
			member.regDt = regDt;
			member.lastLoginDt = lastLoginDt;

			return member;
		}
	}

	public MemberJoinResponse toMemberJoinResponse() {
		return new MemberJoinResponse.Builder(email)
				.build();
	}

	public Integer getId() {
		return id;
	}

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

	public String getRegDt() {
		return regDt;
	}

	public String getLastLoginDt() {
		return lastLoginDt;
	}

}
