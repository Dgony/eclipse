package 상속응용;

public class 배열스레드 extends Thread{
	@Override
	public void run() {
		// 동시에 처리하고 싶은 내용 집어넣기
		String[] list = {"1.png", "2.png", "3.png", "4.png", "5.png"};
		for (int i = 0; i < list.length ; i++) {
			System.out.println("이미지 >> " + list[i]);
			i = i == 4 ? -1 : i;
			try {
				Thread.sleep(5000); // 밀리세컨드, 컴퓨터에겐 5초
			} catch (InterruptedException e) { // 중단을 실행하는 명령어
				// TODO Auto-generated catch block
				e.printStackTrace(); // 어떤 에러인지 말해주는 명령어
			}
			
			// 외부의 자원(특히 cpu)와 연결하는 
			// 아주 위험한 순간이 발생하기 때문에
			// 이런 순간은 try-catch문으로 감싸주기
		}
	}
}
