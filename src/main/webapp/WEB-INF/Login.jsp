<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Login Page</title>
	</head>
	<body>
		<h1>Login Page</h1>
		<hr />
		<form action="/api/login" method="post">
			<div>
				<input type="text" name="email" placeholder="이메일을 입력해주세요." />
				<input type="password" name="password" placeholder="비밀번호를 입력해주세요." />
				<button type="submit">로그인</button>
			</div>
		</form>
	</body>
</html>
