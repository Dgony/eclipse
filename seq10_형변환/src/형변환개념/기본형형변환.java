package 형변환개념;

public class 기본형형변환 {

	public static void main(String[] args) {
		// 정수형 1,    2,    4,    8  (byte 차지 수)
		//     byte, short, int, long
		byte x = 127; // 0110
		int y = x; // 0000000000000110
		// 자동형 형변환(byte[작은] => int[큰])
		// 내가 그냥 int y에 집어넣기만 했는데 자동으로 byte가 int로 바뀌면서 들어감
		
		byte z = (byte)y; // 0110
		// 강제형 형변환(byte[작은] <= int[큰])

	}

}
