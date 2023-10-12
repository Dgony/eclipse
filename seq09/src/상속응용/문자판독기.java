package 상속응용;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class 문자판독기 extends JFrame {

	JLabel ch, words, chCount, wordsCount;
	JTextArea field;
	JButton click, pad, text;

	public 문자판독기() {
		setTitle("글자/단어 길이 판독기");
		setSize(425, 600);
		
		Random r = new Random();
		
		ch = new JLabel("문자수 >> ");
		chCount = new JLabel("문자");
		words = new JLabel("단어수 >> ");
		wordsCount = new JLabel("단어");

		field = new JTextArea(5, 10);
		field.setBackground(Color.black);
		field.setForeground(Color.white);
		
		click = new JButton("글자수 카운트");
		pad = new JButton("배경색 변경");
		text = new JButton("글자색 변경");
		
		setLayout(new FlowLayout());
		
		Font font = new Font("맑은 고딕", Font.BOLD, 35);
		
		ch.setFont(font);
		chCount.setFont(font);
		chCount.setForeground(Color.red);
		words.setFont(font);
		wordsCount.setFont(font);
		wordsCount.setForeground(Color.red);
		field.setFont(font);
		click.setFont(font);
		pad.setFont(font);
		text.setFont(font);
		
		add(ch);
		add(chCount);
		add(words);
		add(wordsCount);
		add(field);
		add(click);
		add(pad);
		add(text);

		getContentPane().setBackground(Color.green);
		
		// 인터페이스, 익명클래스
		click.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 버튼을 클릭했을 때 처리할 내용
				// pseudo code
				// 입력한 문자열을 가지
				String filedCount = field.getText();
				int filedcCoutn2 = filedCount.length();
				String[] s2 =  filedCount.split(" ");
				// 아쉽게도 단어를 측정하는 메서드가 없어서 띄어쓰기를 기준으로 판단할 수밖에 없음.
				chCount.setText(String.valueOf(filedcCoutn2));
				wordsCount.setText(String.valueOf(s2.length));
				
			}
		});
		
		pad.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int c = r.nextInt(256) + 1;
				int d = r.nextInt(256) + 1;
				int f = r.nextInt(256) + 1;
				
				Color randomcolor = new Color(c,d,f); 
				field.setBackground(randomcolor);
				
			}
		});
		
		text.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int c = r.nextInt(256) + 1;
				int d = r.nextInt(256) + 1;
				int f = r.nextInt(256) + 1;
				Color randomcolor = new Color(c,d,f);
				field.setForeground(randomcolor);
				
			}
		});
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		문자판독기 name = new 문자판독기();
	}

}
