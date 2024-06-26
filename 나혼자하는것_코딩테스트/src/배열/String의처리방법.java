package 배열;

public class String의처리방법 {

	public static void main(String[] args) {
		String q1 = "프로그래머가 될거여!";
		String q2 = "나는 JAVA ";
		String q3 = q2 + q1;
		System.out.println(q3);
		System.out.println(q2 + q1);
		System.out.println(q2.concat(q1));
		System.out.println(q2.charAt(0));
		System.out.println(q1.endsWith("!"));
		System.out.println(q3.substring(3));
		System.out.println(q3.substring(3,6));
		System.out.println(q3.contains("나"));
		System.out.println(q3.lastIndexOf("J"));
		System.out.println(q3.toUpperCase());
		System.out.println(q3.toLowerCase());
		System.out.println(q3.length());
		System.out.println(q3.replace("나", "너"));

	}

}
