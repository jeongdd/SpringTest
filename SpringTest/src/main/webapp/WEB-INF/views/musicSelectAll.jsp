<%@page import="com.itbank.mvcSpring.MusicDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h1 style="color: salmon">전체검색 목록입니다.</h1>
		<%
			List<MusicDTO> list = (List<MusicDTO>)request.getAttribute("list");
			for(int i = 0; i < list.size(); i++){
				MusicDTO musicDTO = list.get(i);
		%>
		<hr color="yellow" size="5">
		아이디 : <a href="musicSelect?id=<%= musicDTO.getId() %>"><%= musicDTO.getId() %></a><br>
		이름 : <%= musicDTO.getName() %><br>
		가격 : <%= musicDTO.getPrice() %>	<br> 
		가수 : <%= musicDTO.getSinger() %> <br>
		
		<%
			}
		%>
		
	</body>
</html>