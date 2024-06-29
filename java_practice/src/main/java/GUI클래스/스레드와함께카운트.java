package GUI클래스;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 스레드와함께카운트 extends Thread{

	JLabel l1;
	
	public void run() {
		JFrame f = 스레드와함께.f;
		for (int i = 0; i < 15; i++) {
			l1.setText("카운트         >>>         " + (i+1));
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			if (i == 14) {
				JOptionPane.showMessageDialog(f, "시간이 다 되었습니다.");
			}
		}
	}
	
}
