package 상속응용;

public class 카운터스레드 extends Thread{
	@Override
	public void run() {
		// 동시에 처리하고 싶은 내용 집어넣기
		for (int i = 500; i >= 0; i--) {
			System.out.println("카운터 >> " + i);
			try {
				Thread.sleep(1000); // 밀리세컨드, 컴퓨터에겐 1초
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
