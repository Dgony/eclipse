<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	// 배열, array
	names = ["롱길동", "김길동", "송길동", "백길동"];
	alert(names.length);
	alert(names);
	
	// 위치값은 0부터 시작, 배열 이름[위치값], index
	alert("첫번쨰 이름은 " + names[0]);
	alert("두번쨰 이름은 " + names[1]);
	alert("세번쨰 이름은 " + names[2]);
	alert("네번쨰 이름은 " + names[3]);
	
	// 반복문으로 꺼내기
	for (var i = 0; i < names.length; i++) {
		alert(i+1 + "번 이름은 " + names[i]);
	}
	
</script>
</head>

<body>

</body>
</html>