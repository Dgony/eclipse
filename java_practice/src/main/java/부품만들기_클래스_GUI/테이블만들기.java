package 부품만들기_클래스_GUI;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class 테이블만들기 {

	public static void main(String[] args) {
		String[] arr1 = {"과목1", "과목2", "과목3"};
		Integer[][] arr2 = { // 만약 int형태로 데이터를 집어넣고 싶으면 Integer로 선언해야 한다.
				{11, 22, 33},
				{44, 55, 66},
				{77, 88, 99}
		};
		// JTable은 object 타입의 이차원 배열을 사용한다. 그렇기 때문에 래퍼 클래스가 필요하다.
		// String - String / int - Integer / double - Double
		// float - Float / long - Long / boolean - Boolean 
		// byte - Byte / char - Character 의 형태로 래퍼 클래스로 선언해야 한다.
		
		
		JFrame f = new JFrame();
		JTable table1 = new JTable(arr2, arr1);
		JScrollPane scroll = new JScrollPane(table1);
		// FlowLayout flow = new FlowLayout(); 이번 코드에선 필수 아님
		
		f.setSize(500, 500);
		f.getContentPane().setBackground(Color.green);
		// f.getContentPane().setLayout(flow);
		
		f.add(scroll);
		
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
