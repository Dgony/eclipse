package leetCodeEasy;

import java.util.HashMap;
import java.util.Map;

public class romanToInteger_swtich {

	public static void main(String[] args) {
		// 로마 숫자는 7가지의 기호 - I V X L C D M 으로 표현되는데 
		// 주어진 로마 숫자를 정수로 바꾸는 법
		
		// 기본 조건 
		// III == 3 하지만 4 == IV
		// 같은 논리로 XXX == 30 but 40 == XL 
		int I = 1;
		int V = 5;
		int X = 10;
		int L = 50;
		int C = 100;
		int D = 500;
		int M = 1000;
		
		int IV = 4;
		int IX = 9;
		int XL = 40;
		int XC = 90;
		int CD = 400;
		int CM = 900;
		
		String s1 = "III";
		String s2 = "LVIII";
		String s3 = "MCMXCTV";
		
		// 1. 그럼 1단위 뒤에 5나 10이 붙는지 아니면 5나 10단위 앞에 1이 붙는지 판단해야함
		// 2. IV / IX / XL / XC / CD / CM
		// 3. 표기 방법에 상관없이 다 분해해도 그냥 합치기 가능 
		// 4. 반복문을 통해 문자열을 순회하다가 1단위를 만나면 바로 뒤쪽까지 탐색 후 결과에 반영
		// 5. 왠지 이것도 map을 사용해야 될 것 같은 기분?

		Map<String, Integer> roman = new HashMap<>();
		roman.put("I", 1);
		roman.put("V", 5);
		roman.put("X", 10);
		roman.put("L", 50);
		roman.put("C", 100);
		roman.put("D", 500);
		roman.put("M", 1000);
		
		int answer = 0 ;
		for (int j = 0; j < s1.length(); j++) {
			if (j+1 < s1.length()) {
				answer += roman.get(s1.charAt(j)+"") < roman.get(s1.charAt(j+1)+"") 
						? -roman.get(s1.charAt(j)+"") : roman.get(s1.charAt(j)+"");
			} else {
				answer += roman.get(s1.charAt(j)+"");
			}
			
		}
		System.out.println(answer);
		
		// 성능 면에서 내가 적은 것보다 압도적으로 좋은 코드
		/*
		 * class Solution { public int romanToInt(String s) { int convertedNum = 0; for
		 * (int i = 0; i < s.length(); i++){ switch(s.charAt(i)){ case 'I': convertedNum
		 * += 1; break;
		 * 
		 * case 'V': if ((i - 1 >= 0)){ if(s.charAt(i-1) == 'I'){ convertedNum += 3; }
		 * else { convertedNum += 5; } } else { convertedNum += 5; } break;
		 * 
		 * case 'X': if ((i - 1 >= 0)){ if(s.charAt(i-1) == 'I'){ convertedNum += 8; }
		 * else { convertedNum += 10; } } else { convertedNum += 10; } break;
		 * 
		 * case 'L': if ((i - 1 >= 0)){ if(s.charAt(i-1) == 'X'){ convertedNum += 30; }
		 * else { convertedNum += 50; }} else { convertedNum += 50; } break;
		 * 
		 * case 'C': if ((i - 1 >= 0)){ if(s.charAt(i-1) == 'X'){ convertedNum += 80; }
		 * else { convertedNum += 100; } } else { convertedNum += 100; } break;
		 * 
		 * case 'D': if ((i - 1 >= 0)){ if(s.charAt(i-1) == 'C'){ convertedNum += 300; }
		 * else { convertedNum += 500; } } else { convertedNum += 500; } break;
		 * 
		 * case 'M': if ((i - 1 >= 0)){ if(s.charAt(i-1) == 'C'){ convertedNum += 800; }
		 * else { convertedNum += 1000; } } else { convertedNum += 1000; } break;
		 * 
		 * default: convertedNum += 0; break; } } return convertedNum; } }
		 */
		
		

	}

}
