package 생성자;

public class 컴퓨터 {
	public int price;
	public String company;
	public int monitor;
	
	// 멤버변수 값 초기화 역할
	public 컴퓨터(int price, String company, int monitor) {
		this.price = price;
		this.company = company;
		this.monitor = monitor;
	}

	@Override
	public String toString() {
		return "컴퓨터 [price=" + price + ", company=" + company + ", monitor=" + monitor + "]";
	}
	
}
