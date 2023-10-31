<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    int price1 = (int)session.getAttribute("tennis");
    int price2 = (int)session.getAttribute("swimming");
    
    out.print("내가 테니스에 쓴 돈은 " + price1 + "원이고, 수영에 쓴 돈은 " + price2 + "원이다.<br>");
    out.print("학원에 쓴 돈은 총 " + (price1 + price2) + "원이다.");
    %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
</body>
</html>