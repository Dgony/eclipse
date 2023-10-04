package 부품사용하기;


import 부품만들기.갱얼쥐;
import 부품만들기.전화기;

public class 내방만들기 {

	public static void main(String[] args) {
		// 전화기를 사용하고 싶어요.
		전화기 phone = new 전화기();
		갱얼쥐 puppy = new 갱얼쥐();
		
		phone.카톡하다();
		phone.인터넷하다();
		puppy.짖기();
		puppy.애교부리기();
		
	}

}
