<%@page import="bean.BbsDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
    <!--
    1. id들 받아서 dto에 저장
    2. dao db 처리하고
    3. 성공하면 bbs.jsp로 넘어가자.
    bbs.jsp로 넘어가기 전에 alert()를 띄워주자!
     -->
     
     <jsp:useBean id="bag" class="bean.BbsDTO2"></jsp:useBean>
     <jsp:setProperty property="id" name="bag"/>
     
     <%
     // 스크립트릿(코드블록)
     
     BbsDAO dao = new BbsDAO();
     int result = dao.delete(bag); //
     %>
     <% if(result == 1) { %>
     <script>
     alert("삭제가 완료되었습니다!")
     location.href = "bbs.jsp"
     </script>
     <%  } else  { %>
     <script>
     alert("삭제가 실패했습니다!")
     // location.href = "bbs.jsp"
     </script>
     <%  }%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>