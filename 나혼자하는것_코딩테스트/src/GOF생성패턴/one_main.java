package GOF생성패턴;

public class one_main {

	public static void main(String[] args) {
		one1_prototype o1 = new one1_prototype();
		one1_prototype o2 = new one1_prototype();
		one1_prototype o3 = new one1_prototype();
		
		one2_singletone o4 = one2_singletone.getInstance();
		one2_singletone o5 = one2_singletone.getInstance();
		one2_singletone o6 = one2_singletone.getInstance();
		one2_singletone o7 = one2_singletone.getInstance();
		one2_singletone o8 = one2_singletone.getInstance();
		one2_singletone o9 = one2_singletone.getInstance();
		
		
		System.out.println(o1);
		System.out.println(o2);
		System.out.println(o3);
		System.out.println(o4);
		System.out.println(o4.count);
		System.out.println(o5);
		System.out.println(o5.count);
		System.out.println(o6);
		System.out.println(o6.count);
		
		
	}

}
