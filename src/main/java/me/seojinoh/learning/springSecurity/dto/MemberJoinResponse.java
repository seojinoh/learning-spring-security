package me.seojinoh.learning.springSecurity.dto;

public class MemberJoinResponse {

	private String email;

	public static class Builder {
		private String email;

		private Builder() {
		}

		public Builder(String email) {
			this.email = email;
		}

		public MemberJoinResponse build() {
			MemberJoinResponse memberJoinResponse = new MemberJoinResponse();
			memberJoinResponse.email = email;

			return memberJoinResponse;
		}
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
