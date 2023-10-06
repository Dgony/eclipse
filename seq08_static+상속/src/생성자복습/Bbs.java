package 생성자복습;

public class Bbs {
	public int no;
	public String title;
	public String content;
	public String writer;

	public Bbs(int no, String title, String content, String writer) {
		this.no = no;
		this.title = title;
		this.content = content;
		this.writer = writer;
	}

	@Override
	public String toString() {
		return no + "\t" + title + "\t" + content + "\t" + writer;
	}

	// 객체 생성시 4개의 멤버뱐수를 초기화하고 싶은면
	// 클래스와 동일한 대문자로 시작하는 생성자 메서드 생성
	// Contructor(생성자)

}
