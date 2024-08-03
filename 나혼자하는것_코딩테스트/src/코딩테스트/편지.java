package 코딩테스트;

public class 편지 {

	public static void main(String[] args) {
		// 머쓱이는 할머니께 생신 축하 편지를 쓰려고 합니다.
		// 할머니가 보시기 편하도록 글자 한 자 한 자를
		// 가로 2cm 크기로 적으려고 하며, 편지를 가로로만 적을 때,
		// 축하 문구 message를 적기 위해 필요한 편지지의 최소 가로 길이를 return 하는 함수 완성
		// 공백도 하나의 문자로 취급합니다. 
		// 편지지의 여백은 생각하지 않습니다.
		String message = "happy birthday!";
		int answer = 0;
		
		// 한 글자를 적기 위해 2cm미터가 필요함 == 한 글자다 2의 크기를 잡아먹음
		// 즉 String이 10글자라면 20의 크기를 가지는 편지지 필요함
		
		// 1. String 글자 갯수 측정
		int messagelen = message.length();
		
		// 2. answer에 2배에 해당하는 크기를 할당
		answer = messagelen*2;
		
		System.out.println(answer);
		
		
		

	}

}
