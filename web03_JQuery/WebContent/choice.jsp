<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        
    <% 
    int choice = Integer.parseInt(request.getParameter("choice"));
    
    String pay = "";
    if(choice == 1) {
    	pay = "계좌이체"; 
    } else if (choice == 2) {
    	pay = "신용카드";
    } else if (choice == 3) {
    	pay = "휴대폰결제";
    }
    %>
    
결제 수단은 <%= pay %>입니다.