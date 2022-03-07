<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Home Page</title>
	</head>
	<body>
		<h1>Home Page</h1>
		<hr />
		<div>
			<sec:authorize access="isAnonymous()"><a href="/login">로그인</a></sec:authorize>
			<sec:authorize access="isAuthenticated()"><a href="/logout">로그아웃</a></sec:authorize>
			<sec:authorize access="isAnonymous()"><a href="/signUp">회원가입</a></sec:authorize>
		</div>
		<hr />
		<div>
			<sec:authorize access="hasAuthority('ROLE_USER')"><a href="/user/userInfo">내 정보</a></sec:authorize>
			<sec:authorize access="hasAuthority('ROLE_ADMIN')"><a href="/admin/adminInfo">내 정보</a></sec:authorize>
			<sec:authorize access="isAuthenticated()"><a href="/user/event">이벤트 조회</a></sec:authorize>
			<sec:authorize access="isAuthenticated()"><a href="/admin/event">이벤트 관리</a></sec:authorize>
		</div>
	</body>
</html>
