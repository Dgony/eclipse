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
	$('#b1').click(function (event) {
		event.preventDefault(); // 기본 폼 제출 동작을 막음
		alert("서버로 전송");
		
		var id = $('#id').val();
		var password = $('#password').val();
		var name = $('#name').val();
		var tel1 = $('#tel1').val();
		var tel2 = $('#tel2').val();
		var gender = $('input[name="gender"]:checked').val();
		var hobbies = [];
		$('input[name="hobby"]:checked').each(function() {
			hobbies.push($(this).val());
		});
		var text = $('#text').val();
		
		// 데이터를 HTML 요소로 생성하여 삽입
		$('#d1').empty(); // 기존 내용을 지움
		$('#d1').append(
				'<p>아이디: ' + id + '</p>' + 
				'<p>패스워드: ' + password + '</p>' + 
				'<p>이름: ' + name + '</p>' +
				'<p>연락처: ' + tel1 + '-' + tel2 + '</p>' +
				'<p>성별: ' + gender + '</p>' +
				'<p>취미: ' + hobbies.join(', ') + '</p>' +
				'<p>하고 싶은 말: ' + text + '</p>');
	})
	
	
	
})


</script>
</head>
<body>

	<h2>회원가입 화면입니다.</h2>
	<hr style="background: red" size="10px">

	<div>
		<form id="signupForm">
		아이디 : <input type="text" id="id"><br>
		패스워드 : <input type="text" name = "password"><br>
		이름 : <input type="text" name = "name"><br>
		연락처 : 
		<select name = "tel1">
		<option>010</option>
		<option>011</option>
		<option>019</option>
		</select>
		<input type="text" name = "tel2">
		</form><br>
		성별 : 
		<input type="radio" name = "gender">남
		<input type="radio" name = "gender">여 <br>
		체크 :  
		<input type="checkbox" name = "hobby">운동
		<input type="checkbox" name = "hobby">독서
		<input type="checkbox" name = "hobby">등산
		<input type="checkbox" name = "hobby">여행<br>
		하고 싶은 말 : <textarea rows="10" cols="10" name = "text"></textarea><br>
		<input type="button" id="b1" value="회원가입 처리">
	</div>
	<hr>
	<div id = "d1">
	
	</div>


</body>
</html>