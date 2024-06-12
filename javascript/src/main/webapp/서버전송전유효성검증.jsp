<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script type="text/javascript">
$(function () {
	$("#b1").click(function () { // id길이 유효성 검증 (5글자)
		// 입력
		let id = $("#id1").val();
		
		// 처리, 출력
		let idLen = id.length;
		if (id.length < 5) {
			$("#d2").html("<font color=red>5글자 이상 적어주세요.</font>")
			// font 태그를 이용해 글자를 집어넣는 코드
		} else {
			$("#d2").html("<font color=blue>올바른 길이의 id입니다.</font>")
		};
	});
	
	$("#pw2").keyup(function () { // 비밀번호 확인의 유효성을 검증해주는 함수
		// keyup 객체는 id pw2에 값이 올라가 있을때 작동한다.
		let pw1 = $("#pw1").val();
		let pw2 = $("#pw2").val();
		if (pw1 == pw2) {
			$("#d1").html("<font color = blue>같아요!</font>");
		} else {
			$("#d1").html("<font color = red>달라요!</font>");
		}
	});
});
</script>
</head>
<body>
패스워드 : <input type="text" id="pw1"><br>
패스워드 확인 : <input type="text" id="pw2"><br>
<hr>
<div id="d1"></div>
<hr>
사용자 아이디 : <input type="text" id="id1"><br>
<button id="b1">로그인 아이디 확인</button><br>
<div id="d2"></div>
<hr>

</body>
</html>