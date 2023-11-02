<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <% 
    String tel = request.getParameter("tel");
    
    String result = "";
    String pre = tel.substring(0, 3); // 0번부터 3번 '이전'index까지 추출
    
    switch(pre) {
    case "010" : result = "111"; break;
    case "011" : result = "222"; break;
    default : result = "333";
    }
    
    Random r = new Random();
    result += r.nextInt(999) + 100;
    %>
    
<%= tel %>번호로 받을 인증번호는 <%= result %>