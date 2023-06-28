package org.sp.project0628.layout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class SelfTest2 extends JFrame {
	JMenuBar bar;//메뉴바
	
	JMenu m_1;//메뉴
	JMenu m_2;//메뉴
	JMenu m_3;//메뉴
	JMenu m_4;//메뉴

	JMenuItem i_1;//메뉴아이템
	JMenuItem i_2;//메뉴아이템
	JMenuItem i_3;//메뉴아이템
	JMenuItem i_4;//메뉴아이템
	JMenuItem i_5;//메뉴아이템
	
	JTextArea area; //텍스트 영역
	JScrollPane scroll; // 스크롤
	
	
	public SelfTest2() {
		bar = new JMenuBar();
		area = new JTextArea();
		scroll = new JScrollPane(area);
		
		m_1 = new JMenu("가나");
		m_2 = new JMenu("다라");
		m_3 = new JMenu("마바");
		m_4 = new JMenu("사아");
		
		i_1 = new JMenuItem("1");
		i_2 = new JMenuItem("2");
		i_3 = new JMenuItem("3");
		i_4 = new JMenuItem("4");
		i_5 = new JMenuItem("5");
		
		m_1.add(i_1);
		m_1.add(i_2);
		m_1.add(i_3);
		m_1.addSeparator();
		m_1.add(i_4);
		m_1.add(i_5);
		
		bar.add(m_1);
		bar.add(m_2);
		bar.add(m_3);
		bar.add(m_4);
		
		
		
		this.setJMenuBar(bar);
		this.add(scroll);
		
		
		
		
		
		
		setSize(600,600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	
	public static void main(String[] args) {
		new SelfTest2();
	}
}
