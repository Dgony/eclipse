package GUI클래스;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class GUI만들기연습 {
	
	public static void main(String[] args) {
		// 연습단계라 한 눈에 보기 위해 GUI의 컴포넌트(GUI를 만들기 위한 클래스)들을 지역변수로 선언하는 중
		// GUI를 만들기 위한 단계로,
		// 컴포넌트 생성 - 컴포넌트 설정 - 컴포넌트 추가 의 단계로 나눌 수 있다.
		
		// ----------------------------------------------------------------
		// 컴포넌트 생성
		 
		JFrame f = new JFrame();
		// 각종 객체들을 표시할 수 있는 창을 만드는 객체 f
		
		FlowLayout flow = new FlowLayout();
		// 객체들이 물흐르는듯한 배치를 가질 수 있도록 하는 객체 flow
		// 얘가 없으면 모든 객체들이 한곳에 몰려 겹쳐보이는 현상 발생
		BorderLayout border = new BorderLayout();
		GridLayout grid = new GridLayout();
		// BoxLayout box = new BoxLayout(arg0, arg1);
		GridBagLayout bag = new GridBagLayout();
		
		// flowlayout 매니저를 사용하면 setsize를 비롯한 설정이 잘 먹히지 않음
		// 그렇기 때문에 미리 설정된 객체를 만들어서 설정에 적용하는 것으로 대체 가능
		Font font = new Font("맑은 고딕", 1, 50); // 글꼴, 굵기, 글자 크기 순서
		
		
		JButton b1 = new JButton("더하기"); // f에 올려놓을 버튼을 만드는 jbutton시리즈의 버튼 객체1
		JButton b2 = new JButton("빼기"); // f에 올려놓을 버튼을 만드는 jbutton시리즈의 버튼 객체2
		
		JLabel l1 = new JLabel("숫자 1");
		JLabel l2 = new JLabel("숫자 2");
		JLabel l3 = new JLabel("");
		
		JTextField t1 = new JTextField(5); // 입력창 한 줄을 만드는 클래스
		JTextField t2 = new JTextField(5);
		// JTextField t2 = new JTextField("안녕하세요"); int 혹은 String을 매개하는 오버로딩의 예
		
		JTextArea a1 = new JTextArea("여러줄 입력창`");
		JTextArea a2 = new JTextArea("여러줄 입력창`");
		
		JPanel contentpane = (JPanel) f.getContentPane(); // 코드의 가독성을 위해 떄론 생략 가능
		
		
		// ----------------------------------------------------------------
		// 컴포넌트 설정
		
		f.setSize(500, 500); // f의 크기를 정하는 메서드
		contentpane.setBackground(Color.ORANGE); // f의 배경색을 정하는 메섣,
		contentpane.setLayout(flow); // f에 레이아웃 flow를 적용시키는 메서드
		// 보통 flowlayout은 또 쓸일이 없을 수 있기 떄문에 매개변수 위치에서 new로 객체를 즉시 생성하는 방법도 있다.
		
		l1.setFont(font);
		l2.setFont(font);
		l3.setFont(font);
		
		t1.setFont(font);
		t2.setFont(font);
		
		b1.setBackground(Color.pink);
		b2.setBackground(Color.cyan);
		b1.setFont(font);
		b2.setFont(font);
		
		b1.addActionListener(new ActionListener() { // b1을 클릭했을 때 발생하는 이벤트
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "더하기 버튼을 누르셨군요!");
				
				int num1 = Integer.parseInt(t1.getText());
				int num2 = Integer.parseInt(t2.getText());
				int result = num1 + num2;
				t1.setText(""); // t1과 t2의 값을 초기화해서 비우기 위함
				t2.setText("");
				
				JOptionPane.showMessageDialog(f, "더하기 결과는 " + result);
				l3.setText("더하기 결과는 " + result);
				// JFrame 프로그램이 실행된 이후의 이벤트처리 결과는
				// 컴포넌트를 추가하는 것이 아니라 미리 추가된 컴포넌트의 내용을 변경하는 방향으로 간다.
				// 그렇기 떄문에 add대신 settext를 사용
				
			}
		});
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(f, "뺴기 버튼을 누르셨군요!"); 
				
				int num3 = Integer.parseInt(t1.getText());
				int num4 = Integer.parseInt(t2.getText());
				int result = num3 - num4;
				
				JOptionPane.showMessageDialog(f, "빼기 결과는 " + result); 
				l3.setText("빼기 결과는 " + result);
				
			}
		});
		
		// ----------------------------------------------------------------
		// 컴포넌트 추가
		
		// 만든 객체를 f에 추가해주는 add메서드
		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(t2);
		f.add(b1); 
		f.add(b2);
		f.add(l3);
		
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// JFrame 창을 끌 때 메모리에서 제외하고 프로그램을 종료시키는 코드

	}

}
