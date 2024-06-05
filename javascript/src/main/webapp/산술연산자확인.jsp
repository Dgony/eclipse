<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script type="text/javascript">

// 물건이 하나당 1000
// 물건의 개수 5
// 물건의 전체 가격은?
p1 = 1000;
count1 = 5;
price = p1 * count1;
alert(price);
		
// 전체 구매 금액이 1000
// 물건 하나당 가격이 200
// 물건의 개수는?
total = 1000;
p2 = 200;
count2 = total / p2;
alert(count2);

// 가로, 세로를 실수로 입력받으세요!
// 입력받은 가로, 세로를 지니는 사각형의 면적을 구해서 출력
x = prompt("가로 길이를 입력해주세요.");
y = prompt("세로 길이를 입력해주세요.");
result1 = x * y;
alert("사각형의 면적은 " + result1);

// 커피 한잔 가격, 커피구매 갯수를 입력받으세요!
// 전체 결제금액을 구해서 출력
coffee1 = prompt("커피 한잔 가격을 입력해주세요.");
count1 = prompt("커피 구매 갯수를 입력해주세요.");
total1 = coffee1 * count1;
alert("총 결제금액은 " + total1 + "입니다.");

// 사과의 가격이 2000, 배의 가격이 3000
// 사과 구매 개수 3, 배 구매 개수 2
// 전체 결제 금액은?
apple1 = 2000;
fear1 = 3000;
apple2 = 3;
fear2 = 2;
total = (apple1 * apple2) + (fear1 * fear2);
alert("과일 총 결제 금액은 " + total + "입니다.");
		
// 어제 온도 25도, 오늘 온도 10동
// 어제와 오늘 온도의 평균은?
// 소수점 자르기 ==> 변수명.toFixed(x), x자리만큼 남기고 소수점 자르기
tem1 = 25;
tem2 = 10;
average1 = (tem1 + tem2) / 2
alert("오늘의 날씨는 " + average1.toFixed(1) + "도 입니다.");

</script>

</head>
<body>

</body>
</html>