package 인터페이스;

public class 아이폰잭 implements 이어폰잭{

	@Override
	public void 납작하게만들다() { // 인터페이스가 정의한 반드시 규정해야 하는 메서드
		System.out.println("아이폰의 이어폰잭을 흰색으로 납작하게 만들었다.");
	}

	@Override
	public void 이센치로만들다() {
		System.out.println("아이폰의 이어폰잭을 긴 줄을 사용하여 이센치로 만들었다.");
	}

	
	
}
