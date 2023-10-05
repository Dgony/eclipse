package 생성자;

public class 영화포스터 {
	public String 제목;
	public double 평점;
	public String 이미지;;

	public 영화포스터(String 제목, double 평점, String 이미지) {
		this.제목 = 제목;
		this.평점 = 평점;
		this.이미지 = 이미지;
	}

	@Override
	public String toString() {
		return "영화포스터 [제목=" + 제목 + ", 평점=" + 평점 + ", 이미지=" + 이미지 + "]";
	}

}
