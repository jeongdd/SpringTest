<%@page import="com.itbank.mvcSpring.MusicDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h1>ID 검색 결과입니다.</h1>
		<form action="musicUpdate">
			아이디 : <input type="text" name="id" value="${musicDTO2.id }" readonly="readonly"><br>
			가격 : <input type="text" name="price" value="${musicDTO2.price }">
			<button type="submit">수정</button><br>
		</form>
		이름 : ${musicDTO2.name }<br>
		가수 : ${musicDTO2.singer }<br>
		<hr>
		<form action="musicDelete">
			<input type="hidden" name="id" value="${musicDTO2.id }"><br>
			<button type="submit">삭제하기</button><br>
		</form>
	</body>
</html>