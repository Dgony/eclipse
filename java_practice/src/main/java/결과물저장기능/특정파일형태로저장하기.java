package 결과물저장기능;

import java.io.FileWriter;
import java.io.IOException;

public class 특정파일형태로저장하기 {
	
	public static void main(String[] args) {
		// txt 형태로 저장하기, String만 가능
			try {
				FileWriter f = new FileWriter("C:\\eclipseworkspace\\java_practice\\src\\main\\java\\결과물저장기능\\임의저장.txt");
				f.write("1번 저장내용\n");
				f.write("2번 저장내용\n");
				f.write("3번 저장내용\n");
				f.write("4번 저장내용\n");
				f.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
