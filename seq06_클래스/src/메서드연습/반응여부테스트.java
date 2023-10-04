package 메서드연습;

import javax.swing.JOptionPane;

public class 반응여부테스트 {

	public static void main(String[] args) {
		int x = Integer.parseInt("100"); // 100
		System.out.println(x); // void이다.
		String data = JOptionPane.showInputDialog("이름을 입력"); // void가 아님
		// 입력한 데이터를 여기 가져다주기 때문에 void가 아님
		JOptionPane.showMessageDialog(null, data);
	}

}
