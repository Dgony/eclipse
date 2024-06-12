<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- JSTL 코어 태그를 사용하기 위함(c타입 반복문 등) -->
<!-- 즉 위의 JSTL 코어태그 사용이 있어야 아래의 Path 기준 경로 설정을 쉽게 할 수 있다. -->
<c:set var="path" value="${pageContext.request.contextPath}" />
<!-- Path의 기준 경로 설정 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script type="text/javascript">
	$(function() {
		$("#b1").click(function() { // 결제수단에 따른 할인율을 적용하는 함수 만들기
			// 입력
			let price = $("#id1").val();
			let pay = $("#id2").val();
			
			// 처리
			let total = price;
			if (pay == "계좌이체") {
				total *= 0.8;
			} else if (pay == "신용카드") {
				total *= 0.9;
			}
			
			// 출력
			$("#d1").append("총 결제 금액은 " + total + "원 입니다.<br>");
		});
		
		$("#b2").click(function () { // 회원가입 id의 중복체크 메시지를 출력하는 함수
			// 입력
			let id = $("#id3").val();
			
			// 처리
			let result = "사용 가능한 id입니다.";
			if (id == "apple" || id == "root") {
				result = "중복된 id입니다."; 
			};
			
			// 출력
			$("#d1").append(result + "<br>");
		});
		
		$("#b3").click(function () { // 전화번호에 따라 인증번호를 할당하는 함수
			// 입력
			let number = $("#id4").val();
			
			// 처리
			let check = "";
			if (number.slice(0, 3) == "011") {
				check = "01";
			} else if (number.slice(0, 3) == "010") {
				check = "02";
			} else {
				check = "03";				
			}
			
			// 출력
			$("#d1").append(check + "234<br>");
		});
	});
</script>
</head>
<body style="background: pink">
	결제 금액 :
	<input type="text" id="id1">
	<br>
	<select id="id2">
		<option>계좌이체</option>
		<option>신용카드</option>
		<option>휴대폰결제</option>
	</select>
	<br>
	<button id="b1" style="background: lime;">결제하기</button>
	<hr color="red">
	회원가입할 id 입력 :
	<input type="text" id="id3">
	<button id="b2" style="background: yellow;">회원가입시 id 중복 체크</button>
	<hr color="red">
	인증받을 전화번호 입력 :
	<input type="text" id="id4">
	<button id="b3" style="background: magenta;">인증번호 받기</button>
	<hr color="red">
	<div id="d1"></div>
</body>
</html>