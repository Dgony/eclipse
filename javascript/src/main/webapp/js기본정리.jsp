<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script type="text/javascript">
// 화면에 다음과 같이 반복해서 출력하세요 ==> @@@ 세줄
function print() {
	for (var i = 0; i < 3; i++) {
		console.log("@@@\n");
	}
}
print();
console.log("@@@\n");
console.log("@@@\n");
console.log("@@@");

// prompt("당신이 자주 가는 사이트")인 경우, naver이면 www.naver.com으로 이동,
// daum이면 www.daum.net로 자동 이동, 다른 사이트이면 www.google.com으로 이동
var site = prompt("당신이 자주 가는 사이트를 입력해주세요. (naver 아니면 daum)");
if (site == "naver") {
	location.href = "https://www.naver.com/";
	} else if (site == "daum") {
		location.href = "https://www.daum.net/";
	};

</script>
</head>

<body>

</body>
</html>