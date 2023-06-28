/*
 * java.awt 패키지는os 마다 디자인이 틀려지는 문제발생
 * 따라서  디자인을 모든 os 종류와 상관없이 자바에서 지정한 디자인테마로
 * 고정하기위해 Swing이 개발되었고, javax.swing 패키지에서 지원됨.
 * 스위은 기존의 awt 객체명에  접두어로 J를 붙임
 * 
 * 주의)그렇다고하여 awt 가 완전히 사용되지 않는것은 아니다. 
 *      예를 들면 기존의 배치관리자등은 여전히 사용된다. 
 * 결론)자바기반으로 GUI 프로그램 개발시 awt 와 swing 을 조합해서 개발한다.
 * */


package org.sp.project0628.layout;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyWin extends JFrame {  //is a 관계
	JButton bt; //has a 관계
	// 부품이 존재한다면, 초기화를 해야한다.생성자를 마들어야한다
	public MyWin() {
		bt = new JButton("BUTTON");
		//윈도우의 레이아웃을 flowlayout 으로 변경 (디폴트가 보더레이아웃임)
		this.setLayout(new FlowLayout());
		add(bt); // 나에게 버튼 부착
		this.setSize(300,400); // this 생략가능
		setVisible(true);
		// 윈도우 창 닫으면 setVisivle(false) 가 되리 뿐이므로, 실제 프로그램인 즉 프로세서는 
		//여전히 살아있다. 따라서 프로세스마저 죽이는 방법
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		new MyWin();
	}
}
