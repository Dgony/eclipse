package 비선형구조;

import java.util.ArrayList;
import java.util.Arrays;

public class 완주하지못한선수 {

	public static void main(String[] args) {

		Solution6 s = new Solution6();
		String[] all = {"leo", "kiki", "eden"};
		String[] com = {"eden", "kiki"};
		String result = s.solution(all, com);
		System.out.println(result);
	}
}

class Solution6 {
    public String solution(String[] participant, String[] completion) {
    	// 마라톤 참여 선수 목록중 완주선수 목록을 제외한 인원을 return
    	// 1. 임의의 컬렉션에 전부 집어넣고
    	ArrayList<String> list = new ArrayList<String>();
    	for (int i = 0; i < participant.length; i++) {
			list.add(participant[i]);
		}
    	
    	// 2. 이중 for문으로 제거하기   
    	String answer = "";
    	
    	// 3. 제거 후 남은 인원을 answer에 집어넣어서 return하기
        
        return answer;
    }
}