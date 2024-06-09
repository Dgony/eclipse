<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- c언어적 코딩-${path}-같은 것을 사용하기 위함 --%>
<c:set var="path" value="${pageContext.request.contextPath}" />
<!-- Path의 기준 경로 설정 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">

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