<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2 style="background: red;">입력 form을 통해 db와 연결</h2>  

<h3>회원 정보 입력</h3>
<form action="one">
	아이디 : <input type="text", id = "#id"><br>
	비밀번호 : <input type="text", id = "#pw"><br>
	이름 : <input type="text", id = "#name"><br>
	연령 : <input type="text", id = "#age"><br>
	성별 : <input type="text", id = "#gender">
	<button type="submit">서버로 전송</button>
</form>

</body>
</html>