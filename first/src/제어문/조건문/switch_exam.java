package 제어문.조건문;

import javax.swing.JOptionPane;

public class switch_exam {

	public static void main(String[] args) {
		JOptionPane jo = new JOptionPane();
		String menu = JOptionPane.showInputDialog("먹고 싶은 메뉴를 입력해주세요.");
		
		switch (menu) {
		case "짜장면":
			System.out.println(menu + "(이)면 중국집으로 가요.");
			break;
		case "라면":
			System.out.println(menu + "(이)면 분식집으로 가요.");
			break;
		case "회":
			System.out.println(menu + "(이)면 횟집으로 가요.");
			break;
		default:
			System.out.println(menu + "(이)면 아니면 그냥 안먹어요.");
			break;
		}
		

	}

}
