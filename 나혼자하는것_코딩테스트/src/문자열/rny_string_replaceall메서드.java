package 문자열;

public class rny_string_replaceall메서드 {

	public static void main(String[] args) {
		// 'm'과 "rn"이 모양이 비슷하게 생긴 점을 활용해 문자열에 장난을 하려고 합니다. 
		// 문자열 rny_string이 주어질 때, rny_string의 모든 'm'을 "rn"으로 바꾼 문자열을 return 하는 solution 함수를 작성해 주세요.
		// 1 ≤ rny_string의 길이 ≤ 100
		// rny_string은 영소문자로만 이루어져 있습니다.
		
		String rny_string = "masterpiece";
		
		// 1. 모든 'm'을 바꾸기 위해 replaceAll 메서드를 사용하면 될 듯
		
		rny_string.replaceAll("m", "rn");
		
		System.out.println(rny_string);
		


	}

}
