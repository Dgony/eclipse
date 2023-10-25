<%@page import="bean.ProductVO"%>
<%@page import="bean.ProductDAO"%>
<%@page import="java.util.ArrayList"%>
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
    ProductDAO dao = new ProductDAO();
    ArrayList<ProductVO> list = dao.list();
    
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
		width: 100px;
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
	<td class="left">상품번호</td>
	<td class="left">상품명</td>
	<td class="left">상품정보</td>
	<td class="left">상품가격</td>
	<td class="left">상품제조사</td>
	<td class="left">상품이미지</td>
</tr>
<% //스크립트릿 
	for(ProductVO bag: list){ //{bag, bag, bag, ...}
%>
	<tr>
		<td class="data"><%= bag.getId() %></td>>
		<td class="data"><%= bag.getName() %></td>>
		<td class="data"><%= bag.getContent() %></td>>
		<td class="data"><%= bag.getPrice() %></td>>
		<td class="data"><%= bag.getCompany() %></td>>
		<td class="data"><img src = "img/<%= bag.getImg() %>"></td>>
	</tr>
<% } //for %>
</table>
</body>
</html>