<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script type="text/javascript">

// 사과결제금액 3000원, 배결제금액 2000원
// 총 결제금액을 계산해주세요
// 함계가 5000원 초과이면 1000원을 빼서 4000원만  계산
// 합계가 5000원 이하이면 5000원을 그냥 계산

// 1. 입력
let apple = 3000;
let fear = 2000;

// 2. 처리
total = apple + fear;
if (total > 5000) {
	total -= 1000;
}

// 3. 출력
alert("계산해야 될 총 금액은 " + total + "원");

</script>

</head>
<body>

</body>
</html>