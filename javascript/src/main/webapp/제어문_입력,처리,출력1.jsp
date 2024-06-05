<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script type="text/javascript">

// 1. 입력을 받아보자 (입력)
// 나이를 입력받아서 age변수에 넣어보세요.
age = prompt("나이를 입력해주세요.");
// age라는 RAM의 변수 공간에 입력한 데이터가 저장되게 된다.
// 모든 입력에 의한 값은 문자로 취급된다. 숫자로 연산하려면 타입을 변환해야 한다.

// 2. 숫자로 연산하기 위해서는 문자를 숫자로 바꾸기 (처리)
age2 = parseInt(age);
age3 = age2 + 1;
age4 = age2 + 2;
// 처리 과정은 cpu에 의해 이루어진다

// 3. 입력한 값을 프린트해보자 (출력)
console.log(age);
console.log(age2);
console.log(age3);
console.log(age4);
// 항상 어떤 프로그래밍이든 입력 ==> 처리 ==> 출력을 이해하고 있는 것이 중요하다.

</script>

</head>
<body>

</body>
</html>