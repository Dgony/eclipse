<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src = "js/jquery-3.7.1.js"></script>
<script type="text/javascript">
$(function() {
	$('#b1').click(function() {
		let testValue = $('#hong').val();
		
		$.ajax({
			url : "test.jsp",
			data : {
				test : testValue
			},
			success : function(x) {
				$('#d1').html(x)
			}
		}) // ajax
	}) // click
	
	$('#b2').click(function() {
		let moneyValue = $('#money').val();
		let choiceValue = $('#choice').val();
		
		$.ajax({
			url : "money.jsp",
			data : {
				money : moneyValue,
				choice : choiceValue
			},
			success : function(x) {
				$('#d1').html(x)
			}
		}) // ajax
		
	}) // click
	
	$('#b3').click(function() {
		let idValue = $('#id').val();
		
		$.ajax({
			url : "idCheck.jsp",
			data : {
				id : idValue
			},
			success : function(x) {
				$('#d1').html(x)
			}
		}) // ajax
	}) // click
	
	$('#b4').click(function() {
		let telValue = $('#tel').val();
		
		$.ajax({
			url : "phone.jsp",
			data : {
				tel : telValue
			},
			success : function(x) {
				$('#d1').html(x)
			}
		}) // ajax
	}) // click
})
</script>
</head>

<body bgcolor="pink">
<h3>비동기통신으로 서버와 통신하기</h3>

ajax테스트 : <input type="text" id='hong'>
<button id='b1'>ajax테스트(test.jsp)</button>
<br>

결제금액 : <input type="text" id="money"> <br>
1)계좌이체, 2)신용카드, 3)휴대폰결제 <br>

결제수단 : <input type="text" id="choice">
<button style="color: blue; background: lime;" id='b2'>결제하기</button>

<hr color="red">

회원가입할 id입력 : <input type="text" id="id">
<button style="color: blue; background: yellow;" id='b3'>회원가입시 id중복 체크</button>

<hr color="red">

인증받을 전화번호 입력 : <input type="text" id="tel">
<button style="color: blue; background: fuchsia;" id='b4'>인증번호 받기</button>

<hr color="green">

<div id="d1" style="background: yellow" >결과 들어가는 곳</div>
</body>
</html>