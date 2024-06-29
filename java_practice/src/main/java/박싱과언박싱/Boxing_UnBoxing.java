package 박싱과언박싱;

public class Boxing_UnBoxing {

	public static void main(String[] args) {
		// Boxing
		int x = 100;
		Integer y = Integer.valueOf(x);
		
		// Auto Boxing (JAVA 5 이후)
		Integer z = x;
		
		System.out.println(y);
		System.out.println(z);
		
		// UnBoxing
		Integer a = Integer.valueOf(200);
		int b = a.intValue();
		int c = (int)a;
		
		// Auto UnBoxing (JAVA 5 이후)
		int d = a;
		
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);

	}

}
