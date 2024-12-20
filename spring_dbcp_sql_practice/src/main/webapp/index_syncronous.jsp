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
<form action="insert">
	아이디 : <input name = "id"><br>
	비밀번호 : <input name = "pw"><br>
	이름 : <input name = "name"><br>
	연령 : <input name = "age"><br>
	성별 : <input name = "gender"><br>
	<button type="submit">서버로 전송</button>  
</form>

<hr>
<button>DB 내용 조회하기 </button>

</body>
</html>