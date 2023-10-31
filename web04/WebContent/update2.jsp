<%@page import="bean.BbsDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <!-- 
    1. 앞 페이지에서 전달된 데이터들을 가방을 만들어서 다 집어넣어주세요.
    2. dao를 이용해서 db처리해주세요
    3. dao로부터 받은 결과가 1이면 alert("수정성공@@@")를 띄워주세요.
     -->
     
    <jsp:useBean id="bag" class="bean.BbsDTO2"></jsp:useBean>
    <jsp:setProperty property="*" name="bag"/>
     
    <%
    BbsDAO dao = new BbsDAO();
    int result = dao.update(bag);
    %> 
    
    <% if(result == 1) {%>
    <script>
    alert("수정성공@@@");
    location.href = "bbs.jsp"
    </script>
    <% } else { %>
    <script>
    alert("수정실패@@@");
    // location href("bbs.jsp")
    </script>
    <% } %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>