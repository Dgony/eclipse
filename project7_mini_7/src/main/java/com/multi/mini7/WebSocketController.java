package com.multi.mini7;

import java.util.Date;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class WebSocketController {

	@MessageMapping("/chat")
	@SendTo("/topic/messages") //채팅방이름 messages
	public Message send(Message message) {
		//from, text만 messages채팅방에 가입한 브라우저로 그대로 보내고 싶은 경우 
		Date date = new Date();
		message.setDate(date.getHours() + "시 " + date.getMinutes() + "분");
		return message; 
		//return에 뒤에 있는vo가 가입한 브라우저에 도착
	}
	
	@MessageMapping("/chat2")
	@SendTo("/topic/messages2") //채팅방이름 messages2
	public Message2 send2(Message2 message) {
		//from, text만 messages채팅방에 가입한 브라우저로 그대로 보내고 싶은 경우 
		String menu = "";
		
		switch (message.getText()) { //1
		case "1":
			menu = "챗 봇>>  10) 관광지 소개	11) 여행 정보		12) 커뮤니티	13) 나의 여행	14) 공지 건의 신고";
			break;
		case "2":
			menu = "챗 봇>>  20) 공지사항 ";
			break;
		case "3":
			menu = "챗 봇>>  30) 관광지 추천 키워드 입력 ex)가족, 신혼, 월별";
			break;
		case "10":
			menu = "챗 봇>>  관광지 소개 탭 문구 출력";
			break;
		case "11":
			menu = "챗 봇>>  여행정보 탭 문구 출력";
			break;
		case "12":
			menu = "챗 봇>>  커뮤니티 탭 문구 출력";
			break;
		case "13":
			menu = "챗 봇>>  나의 여행 탭 문구 출력";
			break;
		case "14":
			menu = "챗 봇>>  공지 건의 신고 탭 문구 출력";
			break;
		case "20":
			menu = "챗 봇>> 업데이트 사항 나열";
			break;
		case "가족":
			menu = "챗 봇>> 가족 여행 추천 관광지 출력";
			break;
		case "신혼":
			menu = "챗 봇>> 신혼 여행 추천 관광지 출력";
			break;
		case "1월":
			menu = "챗 봇>> 1월 여행 추천 관광지 출력";
			break;
		case "2월":
			menu = "챗 봇>> 2월 여행 추천 관광지 출력";
			break;
		default:
			menu = "챗 봇>>선택한 번호는 없는 메뉴입니다. 다시 입력해주세요.";
			break;
		}
		message.setMenu(menu);
		return message; 
		//return에 뒤에 있는vo가 가입한 브라우저에 도착
	}
}
