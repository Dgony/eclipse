package 생성자;

public class 수강신청템플릿 {
	
	String title;
	String time;
	String name;
	
	public 수강신청템플릿(String title, String time, String name) {
		this.title = title;
		this.time = time;
		this.name = name;
	}

	@Override
	public String toString() {
		return "수강신청템플릿 [title=" + title + ", time=" + time + ", name=" + name + "]";
	}
	
}
