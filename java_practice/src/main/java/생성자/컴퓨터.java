package 생성자;

public class 컴퓨터 {
	
	int price;
	String company;
	int monitor;
	
	public 컴퓨터(int x, String y, int z) { // 생성자, void도 데이터 타입도 없음, only public
		this.price = x;
		this.company = y;
		this.monitor = z;
	}

	@Override
	public String toString() {
		return "컴퓨터 [price=" + price + ", company=" + company + ", monitor=" + monitor + "]";
	}
	
	

}
