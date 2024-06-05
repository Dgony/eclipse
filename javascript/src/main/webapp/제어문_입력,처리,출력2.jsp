<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script type="text/javascript">
	// 입력 과정
	belong = prompt("당신의 소속은?");
	job = prompt("당신의 직책은?");

	// 처리 과정
	result = "당신은 " + belong + "의 " + job + "입니다.";

	// 출력 과정
	alert(result);

	// 입력과정
	age = prompt("당신의 올해 나이는?");

	// 처리과정
	age = parseInt(age);
	age2 = age + 1;
	age3 = age + 2;

	// 출력 과정
	alert(
			"당신의 올해 나이는 " + age + ("\n") +
			"당신의 내년 나이는 " + age2 + ("\n") +
			"당신의 내후년 나이는 " + age3 + ("\n"))
</script>

</head>
<body>

</body>
</html>