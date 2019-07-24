<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h1>Music Insert</h1>
		<form action="musicInsert">
			아이디 : <input type="text" name="id"><br>
			이름 : <input type="text" name="name"><br>
			가격 : <input type="text" name="price"><br>
			가수 : <input type="text" name="singer"><br>
			<button type="submit">서버로 전송</button>
		</form>
	</body>
</html>