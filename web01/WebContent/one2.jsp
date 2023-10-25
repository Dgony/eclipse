<%@page import="bean.BbsVO"%>
<%@page import="bean.BbsDAO"%>
<%@page import="com.sun.xml.internal.ws.encoding.XMLHTTPBindingCodec"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!--
    jsp에서 해야 하는 작업 3가지
    1. form안에 입력한 데이터 받아서 저장해두자. ==> java
    2. 받은 데이터를 DAO에게 주자. ==> java
    3. 결과를 html로 만들자. ==> html/css/js
    -->
    <%
    // 여기에 자바 코드를 쭉 쓰면 됨
    // 톰캣에서 자주 사용하는 객체는 내장함수로 미리 만들어 놓았음.
    // String 처럼 사용하면 된다는 얘기인듯.
    // 클라이언트로부터 데이터를 받아오는 객체 ==> request
    // 1. 클라이언트로부터 요청 받아오기
    String no = request.getParameter("no"); // input 안에 name = ""에 입력한 데이터를 받아옴
    
    // 2. DAO에 데이터를 주소로 전달하기
    BbsDAO dao = new BbsDAO();
    BbsVO bag = dao.one(Integer.parseInt(no));
    
    // 3. HTML로 작성해서 클라이언트에 응답하기
    %> 
    
     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
body {
	background: lime;
	align-content: center;
}

button {
	width: 150px;
	height: 30px;
	color: blue;
	background: yellow;
}

td {
	width: 150px;
	height: 30px;
	background: cyan;
}

.left {
width: 100px;
background: skyblue;
text-align: center;
}

#bottom {
background: yellow;
}
</style>
</head>
<body bgcolor="lime">
<h5>당신이 요청한 게시글 정보를 확인해주세요</h5>
<hr color="green">
<table align = "center" border=1>
			<tr>
				<td class = "left">번호 : </td>
				<td><%= bag.getNo() %></td>
			</tr>
			<tr>
				<td class = "left">제목 : </td>
				<td><%= bag.getTitle() %></td>
			</tr>
			<tr>
				<td class = "left">내용 : </td>
				<td>
				<%= bag.getContent() %></td>
			</tr>
			<tr>
				<td class = "left">작성자 :</td>
				<td><%= bag.getWriter() %></td>
			</tr>
		</table>
</body>
</html>