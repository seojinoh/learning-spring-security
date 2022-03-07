<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Sign Up Page</title>
	</head>
	<body>
		<h1>Sign Up Page</h1>
		<hr />
		<form action="/api/signUp" method="post">
			<div>
				<input type="text" name="email" placeholder="이메일을 입력해주세요." />
				<input type="password" name="password" placeholder="비밀번호를 입력해주세요." />
				<input type="text" name="name" placeholder="이름을 입력해주세요." />
				<input type="text" name="phoneNumber" placeholder="휴대폰 번호를 입력해주세요." />
				<select name="roles">
					<option value="ROLE_USER" selected>사용자</option>
					<option value="ROLE_ADMIN">관리자</option>
				</select>
				<select name="method">
					<option value="default" selected>일반 회원가입</option>
				</select>
				<button type="submit">가입하기</button>
			</div>
		</form>
	</body>
</html>
