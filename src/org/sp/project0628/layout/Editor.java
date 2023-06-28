package org.sp.project0628.layout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

//메모장을 만들어 보자
public class Editor extends JFrame{
	JMenuBar bar;//메뉴바
	//메뉴
	JMenu m_file; //파일
	JMenu m_edit;//편진
	JMenu m_style;//스타일
	JMenu m_view;//보기
	JMenu m_help;//도움말
	
	//8개의 메뉴 아이템
	JMenuItem i_new;//
	JMenuItem i_win;//
	JMenuItem i_open;//
	JMenuItem i_save;//
	JMenuItem i_saveas;//
	JMenuItem i_page;//
	JMenuItem i_print;//
	JMenuItem i_exit;//

	//text area 와 오른쪽 스크롤바
	JTextArea area;
	JScrollPane scroll;
	
	
	public Editor() {
		bar = new JMenuBar(); //메뉴바생성
		m_file = new JMenu("파일(F)");
		m_edit = new JMenu("편집(E)");
		m_style = new JMenu("서식(O)");
		m_view = new JMenu("보기(V)");
		m_help = new JMenu("도움말(H)");
		
		//파일 메뉴에 하위 아이템들 부착
		i_new = new JMenuItem("새로만들기");
		i_win = new JMenuItem("새창");
		i_open = new JMenuItem("열기");
		i_save = new JMenuItem("저장하기");
		i_saveas = new JMenuItem("다른이름으로저장하기");
		i_page = new JMenuItem("페이지설정");
		i_print = new JMenuItem("인쇄");
		i_exit = new JMenuItem("끝");
		
		//area 생성 과 스크롤 생성
		area = new JTextArea();
		scroll = new JScrollPane(area); //area에 스크롤 적용됨.
		
		
		m_file.add(i_new);
		m_file.add(i_win);
		m_file.add(i_open);
		m_file.add(i_save);
		m_file.add(i_saveas);
		//선 긋기---------------
		m_file.addSeparator();//구분선 긋기
		m_file.add(i_page);
		m_file.add(i_print);		
		m_file.addSeparator();//구분선 긋기
		m_file.add(i_exit);

		
		
		//바에 메뉴들 부착
		bar.add(m_file);
		bar.add(m_edit);
		bar.add(m_style);
		bar.add(m_view);
		bar.add(m_help);
		
		
		//바를 프레임에 부착
		this.setJMenuBar(bar);
		
		this.add(scroll); // center에 area부착, center 는 디폴트라 명시할필요 없다. (,BorderLayout.CENTER) 생략됨
		// area 지우고 스크롤로 교체 이유는 area 가 스크롤 안으로 들어가버림.
		this.setSize(800,700);
		this.setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		new Editor();
	}
}
