<%@page import="java.util.ArrayList"%>
<%@page import="bean.MemberVO"%>
<%@page import="bean.CarDAO"%>
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
        
        // 2. DAO에 데이터를 주소로 전달하기
        CarDAO dao = new CarDAO();
        ArrayList<MemberVO> list = dao.list();
        
        // 3. HTML로 작성해서 클라이언트에 응답하기
    %> 
     
     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	body{
		background: lime;
	}
	*{
		font-size: 20px;
		text-align: center;
	}
	.left { 
		/* 여러개를 선택해서 지정하고 싶을 때 클래스를 사용. 클래스 중 left에 해당하는 것만 스타일을 지정해라. */
		/* 클래스 선택은 .클래스명 */
		width: 100px;
		background: blue;
		color: white;
	}
	.data { 
		width: 150px;
		background: white;
		color: blue;
	}
	#bottom {
		background: red;
		color: yellow;
	}
	input{
		background: greenyellow;
	}
</style>
</head>
<body bgcolor="red">
<!-- 반복문(for)문 필요! -->
<table border="1" align="center">
<tr>
	<td class="left">아이디</td>
	<td class="left">패스워드</td>
	<td class="left">이름</td>
	<td class="left">전화번호</td>
	<td class="left">상세정보</td>
</tr>
<% //스크립트릿 
	for(MemberVO bag: list){ //{bag, bag, bag, ...}
%>
	<tr>
		<td class="data"><%= bag.getId() %></td>
		<td class="data"><%= bag.getPw()%></td>
		<td class="data"><%= bag.getName() %></td>
		<td class="data"><%= bag.getTel()%></td>
		<td class="data">
		<a href = "one.jsp?id=<%= bag.getId() %>">
		<button style = "background: gold">상세정보 보기</button></a></td>
	</tr>
<% } //for %>
</table>
</body>
</html>