<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
button {
	height: 120px;
	width: 240px;
	background: yellow;
	font-size: 40px;
}
</style>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script type="text/javascript">
	// 입력한 결제수단이 1이면 원금 그대로, 2이면 천원 더해서,
	// 3이면 500원 더해서 결제금액을 알려주세요.
	// (div에 결제금액을 보이게 표시) ==> 어디서 000원을 계좌이체로 구매하셨습니다.
	function pay() {
		// 입력
		let pay1 = document.getElementById("pay1").value;
		let pay2 = document.getElementById("pay2").value;
		let pay3 = document.getElementById("pay3").value;
		
		// 처리
		pay2 = parseInt(pay2);
		if (pay3 == 2) {
			pay2 += 1000;
		} else if (pay3 == 3) {
			pay2 += 500;
		}
		
		// 출력
		$("#d1").html(pay1 + "에서 " + pay2 + "원을 " + pay3 + "로 구매하셨습니다.");
	}
	
	
</script>
</head>

<body>
구매 상점 : <input id="pay1"><br>
결제 금액 : <input id="pay2"><br>
결제수단 1)계좌이체, 2)신용카드, 3)휴대폰 결제<br>
<input id="pay3"><br>
<button onclick="pay()">결제 버튼</button>
<hr color="red">
<div id="d1"></div>
</body>
</html>