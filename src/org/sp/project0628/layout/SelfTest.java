package org.sp.project0628.layout;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SelfTest extends JFrame {
	Label la;
	TextField txt;
	JButton bt;
	Panel p;
	Panel r;
	
	public SelfTest() {
		la = new Label("BLA BLA");
		txt = new TextField();
		bt = new JButton("CLICK");
		p = new Panel();
		r = new Panel();
		
		p.setLayout(new GridLayout(1,2));
		p.add(la);
		p.add(txt);
		
		r.add(bt);
		
		this.add(p);
		this.add(r, BorderLayout.SOUTH);
		
		
		setSize(300, 200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	
	public static void main(String[] args) {
		new SelfTest();
	}
}
