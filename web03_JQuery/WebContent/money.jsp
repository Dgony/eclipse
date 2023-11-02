<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        
    <% 
    int money = Integer.parseInt(request.getParameter("money"));
    int choice = Integer.parseInt(request.getParameter("choice"));
    
    String pay = "";
    if(choice == 1) {
    	money -= 1000;
    	pay = "계좌이체"; 
    } else if (choice == 2) {
    	money += 1000;
    	pay = "신용카드";
    } else if (choice == 3) {
    	pay = "휴대폰 결제";
    }
    %>
    
결제할 금액은 <%= money %>원 입니다.<br>
결제수단은 <%= pay %>입니다.