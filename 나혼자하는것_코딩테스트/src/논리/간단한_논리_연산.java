package 논리;

public class 간단한_논리_연산 {
	
	public static void main(String[] args) {
		// 문제 설명
		// boolean 변수 x1, x2, x3, x4가 매개변수로 주어질 때, 다음의 식의 true/false를 return 하는 solution 함수를 작성해 주세요.
		// (x1 ∨ x2) ∧ (x3 ∨ x4)
		
		// 입출력 예
		// x1	x2	x3	x4	result
		// false	true	true	true	true
		// true	false	false	false	false
		
		// 입출력 예 설명
		// 입출력 예 #1
		// 예제 1번의 x1, x2, x3, x4로 식을 계산하면 다음과 같습니다.
		// (x1 ∨ x2) ∧ (x3 ∨ x4) ≡ (F ∨ T) ∧ (T ∨ T) ≡ T ∧ T ≡ T
		// 따라서 true를 return 합니다.

		// 입출력 예 #2
		// 예제 2번의 x1, x2, x3, x4로 식을 계산하면 다음과 같습니다.
		// (x1 ∨ x2) ∧ (x3 ∨ x4) ≡ (T ∨ F) ∧ (F ∨ F) ≡ T ∧ F ≡ F
		//따라서 false를 return 합니다.
		
		// ∨과 ∧의 진리표는 다음과 같습니다.
		// x	y	x ∨ y	x ∧ y
		// T	T	  T		  T
		// T	F	  T		  F
		// F	T	  T		  F
		// 		F	  F	  	  F
		
		boolean x1 = false;
		boolean x2 = true;
		boolean x3 = true;
		boolean x4 = true;
		
		// 아래 식의 true/false를 return 해야 함  
		// (x1 ∨ x2) ∧ (x3 ∨ x4)
		// 근데 아무리봐도 결과가 || && || 계산 같은데  
		
	}

}
