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
	
	$("#b3").click(function () {
		let price = $("#b1").val();
		let count = $("#b2").val();
		total = price * count;
		// 분면 입력으로 들어오는 val 값은 문자로 취급될텐데도 total을 만들기 위해 곱할 수 있다.
		// 굳이 형변환을 하지 않아도 곱하기를 쓸 수 있는 모습이다.
		alert("총 결제 금액은 " + total + "원");
	}); // 버튼을 클릭하면 커피를 계산한 값을 출력해주는 함수
	
	$("#d2").click(function () {
		let id = $("#d1").val();
		alert("id의 길이는 " + id.length);
	}); // id의 길이를 val로 가져와서 길이를 판단해주는 함수
	
	$("#d5").click(function () {
		let pw1= $("#d3").val();
		let pw2= $("#d4").val();
		if (pw1 == pw2) {
			alert("비밀번호가 일치합니다!"); 
		} else {
			alert("비밀번호가 일치하지 않습니다!");
		}; // 입력한 비밀번호가 서로 일치하는지 확인해주는 함수
		
	});
})
</script>
</head>
<body>
커피 금액 : <input type="text" id="b1"><br>
커피 갯수 : <input type="text" id="b2"><br>
<button id="b3">결제금액 확인</button>
<hr color="red" size="20px;">

아이디 : <input type="text" id = "d1"><br>
<button id="d2">입력 글자수 확인</button><br>
패스워드1 : <input type="text" id = "d3"><br> 
패스워드2 : <input type="text" id = "d4"><br>
<button id="d5">입력 패스워드 일치 확인</button> 
<hr>
</body>
</html>