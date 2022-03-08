<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Admin Info Page</title>
	</head>
	<body>
		<h1>Admin Info Page</h1>
		<hr />
		<div>
			관리자 정보 화면입니다.
			<p>principal : <sec:authentication property="principal" /></p>
			<p>이메일 : <sec:authentication property="principal.email" /></p>
			<p>이름 : <sec:authentication property="principal.name" /></p>
			<p>휴대폰 번호 : <sec:authentication property="principal.phoneNumber" /></p>
			<p>권한 목록 : <sec:authentication property="principal.roles" /></p>
			<p>가입 유형 : <sec:authentication property="principal.method" /></p>
		</div>
	</body>
</html>
