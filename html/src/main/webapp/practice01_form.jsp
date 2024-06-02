<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>검색할 단어를 입력하세요.</h2>
<hr>
검색할 단어 : 
<input type="text">
<input type="submit", value="검색 시작">
<hr>
<h2>로그인 화면</h2>
아이디 : <input type="text"><br>
패스워드 : <input type="text"><br>
<input type="submit", value="로그인 처리">
<hr>
<h2>회원가입 화면</h2>
가입할 id : <input type="text"><Br>
가입할 pw : <input type="text"><br>
가입할 이름 : <input type="text"><br>
성별
<input type="radio", name="male">남
<input type="radio", name="female">여<br>
취미
<input type="checkbox", name="hobby1">달리기
<input type="checkbox", name="hobby2">동영상보기
<input type="checkbox", name="hobby3">인터넷서핑<br>
전화번호 통신사 
<select>
<option>알뜰폰</option>
<option>lg</option>
<option>skt</option>
<option>kt</option>
</select><br>
하고 싶은 말
<textarea rows="10" cols="30", placeholder="100글자로 써주세요."></textarea>
</body>
</html>