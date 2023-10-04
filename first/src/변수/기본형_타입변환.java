package 변수;

public class 기본형_타입변환 {

	public static void main(String[] args) {
		byte age = 127; // 1바이트
		int age2 = age; // 4바이트
		// 위의 경우 메모리를 쓸데없이 더 잡아먹기는 하지만 들어감
		
		int age3 = 127; // 4바이트
		// byte age34 = age3; 1바이트
		// 127이 byte에 충분히 들어갈 수 있지만  age3은 이미 4byte의 공간이 할당되어 있어서
		// 3byte에 해당하는 공간을 인위적으로 잘라버릴 수 있는 도구가 필요함.
		byte age4 = (byte)age3;
		// 이럴 때 쓰는게 강제 형변환, casting이지

	}

}
