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
    String title = request.getParameter("title"); // input 안에 name = ""에 입력한 데이터를 받아옴
    String content = request.getParameter("content");
    String no = request.getParameter("no");
    
    // 2. DAO에 데이터를 주소로 전달하기
    BbsDAO dao = new BbsDAO();
    BbsVO bag = new BbsVO();
    bag.setTitle(title);
    bag.setContent(content);
    bag.setNo(Integer.parseInt(no));
    
    int result = dao.update(bag);
    
    // 3. HTML로 작성해서 클라이언트에 응답하기
    String resultText = "게시판정보 수정에 실패했습니다!";
    if(result == 1){
    	resultText = "게시판정보 수정에 성공했습니다!";
    }  
    %> 
     
     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="lime">
<h5>당신이 입력한 회원 정보를 확인해주세요</h5>
<hr color="green">
<%= resultText %> <!-- id 변수에 있는 것을 프린트해줘 -->

</body>
</html>