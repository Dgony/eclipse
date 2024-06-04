<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script type="text/javascript">

var name; // 변수 선언(RAM에 저장공간 생성)
name = "홍길동"; // 변수 할당(저장공간에 데이터 집어넣음)
alert(name);
console.log(name);

var name = "김길동" // 변수 재선언, 재할당 가능
alert(name);
console.log(name);

let tel = 12345678; // 변수 선언
alert(tel);
console.log(tel);

// let tel = 111111; 변수 재선언불가, 오류 발생
tel = 11111111; // 재선언은 불가능하지만 변수 재할당은 가능\
alert(tel);
console.log(tel);

const pi = 3.14; // 변수 재선언, 재할당 모두 불가
alert(pi);
console.log(pi);

</script>

</head>
<body>

</body>
</html>