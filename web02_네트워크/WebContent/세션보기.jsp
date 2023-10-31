<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String name = (String)session.getAttribute("name");
    // if(session.getAttribute("age") != null) 이런 조건이 들어가야 에러 방지 가능
    int age = (int)session.getAttribute("age");
    out.print("저장된 세션 이름은 " + name + "이고, " + "나이는 " + age + "살이다.");
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
저장된 세션 이름은 ${name}이고, 나이는 ${age}살<br>
내년의 나이는<%= age + 1 %>살
</body>
</html>