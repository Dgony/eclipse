package GOF생성패턴;

public class one2_singletone {
	
	static int count;
	static one2_singletone object;
	
	private one2_singletone() {
		System.out.println("싱글톤 객체 생성...");
		count++;
	}
	
	// 싱글톤은 객체를 하나만 만들고, 더 이상 만들지 않는 방법으로,
	// getInstance를 static으로 만들어 객체가 이미 만들어졌는지 체크
	// public static인 클래스는 패키지 모든 곳에서 참조 가능하고 한개의 인스턴스만 존재
	// 또한 모든 곳에서 참조 가능한 만큼 별도의 인스턴스 생성을 필요로 하지 않고,
	// 그에 따라 생성자 메서드의 count ++은 getInstance()를 사용하게 된 최초 한번만 진행되게 됨
	public static one2_singletone getInstance() {
		if (object == null) {
			object = new one2_singletone();
			// object가 null == 객체가 만들어지지 않은 상태이므로 주소값 생성
			// 또한 생성자 메서드로 인해 count ++
		} else {
			// object가 null 이 아님 == 객체가 만들어져 주소값이 들어가 있으므로 있으므로 별도의 행동 x			
		}
		return object;
	}

}
