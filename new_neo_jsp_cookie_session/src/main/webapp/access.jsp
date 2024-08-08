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
	
	// b1 버튼을 클릭했을 때 input에 입력한 전화번호에 따라 
	// 일정한 패턴을 가진 랜덤 인증번호 생성
	$('#b1').click(function () {
		let tel = $('#tel1').val();
		
		$.ajax({
			url : 'access_phonenumber.jsp',
			data : {
				tel : tel
			},
			success : function (x) { 
				// x는 access_phonenuber.jsp의 실행 결과가 담겨있다.
				// jsp 페이지의 java 코드 진행이 끝나면 해당 페이지에 남는 정보는 result 뿐이기 떄문에 매개 변수로 활용 가능
				alert('응답받은 내용 : ' + x)
				$('#d1').empty
				$('#d1').html('<font color = red> 도착한 인증 문자 : ' + x + '</font>')
			}
		})
	})
	
	// b2 버튼을 클릭했을 때 input에 입력한 인증 번호에 따라 인증O, 인증X 구분
	$('#b2').click(function () {
		let num = $('#d1').text().slice(-7, -1);
		let tel2 = $('#tel2').val();
		
		let result = "";
		if (num == tel2) {
			result = "<font color = blue> 인증 완료되었습니다!</font>"; 
		} else if (num !== tel2) {
			result = "<font color = blue> 인증 실패했습니다!</font>";
		}
		
		$('#d2').empty();
		$('#d2').html(result);
	})
	
	
	
})
</script>
</head>
<body style="background: pink">
인증받을 전화번호 입력 : <input type="text" id = 'tel1'>
<button id = 'b1' style="background: lime;, color: blue;">인증번호 받기</button>
<br>
<div id ='d1'></div>
<hr color="red" size="5px">
<input type="text" placeholder="인증번호 넣기" id = 'tel2'>
<button id = 'b2' style="background: yellow;, color: blue;">인증번호 확인</button>
<br>
<div id = 'd2'></div>


</body>
</html>