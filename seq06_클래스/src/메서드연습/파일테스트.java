package 메서드연습;

import java.io.File;

public class 파일테스트 {

	public static void main(String[] args) {
		File file = new File("test.txt"); // 폴더와 파일을 다루는 메서드, 그냥 존재만 확인
		boolean result = file.exists(); // void가 아니면 return값이 있다.
		System.out.println(result);
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
		
		File folder = new File("."); // folder == directory
		System.out.println(folder.isDirectory());
		String[] list = folder.list();
		
	}

}
