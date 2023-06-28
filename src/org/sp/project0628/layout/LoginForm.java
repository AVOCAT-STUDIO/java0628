package org.sp.project0628.layout;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
// 상속은
//1)부모의 재산을 내것처럼 접근할수있다
//2)상속관계에 있는 객체들은 서로 같은 종류
public class LoginForm extends Frame{
	             //loginform is a frame
	
	//만들것을 먼저 다 정의해보자
	//Frame f;// 익스텐즈로 위로 올려버리자 그래야 로그인폼자체가 프레임 자체가 되어버리니까.....
	Label la_id;//라벨 (글자)
	Label la_pass;
	TextField t_id;
	TextField t_pass;
	Button bt_login;
	Button bt_join;
	Panel p_center; // 가운데 영역에서별도의 레이아웃을 적용하기 위한 패널
	//패널은 디폴트가flowlayout 이다 오늘은 그리드 레이아웃으로 바꾸어서 해보자
	Panel p_south; //플로우 레이아웃을 가진 페널이 하나 필요함 디폴트 값이이 플로우레이아웃임
	
	//프레임과 프레임이 가지고 있는 재료드을 초기화 하자!
	//로그인 폼이 곧 윈도우 이고 , 이 윈도우가 생성될때 이윈도우가 보유한 부품들도
	//함께 메모리에 생성되어야 하므로, 초기화할 이유가 있따.
	
	
	public LoginForm() {
		//부품생성하기
		la_id = new Label("ID");
		la_pass = new Label("Password");
		t_id = new TextField();
		t_pass = new TextField();
		bt_login = new Button("log-in");
		bt_join = new Button("Join");
		p_center = new Panel();
		p_south = new Panel(); 
		
		//배경색 지정
		la_id.setBackground(Color.YELLOW);
		
		//패널의 레이아웃 변경
		p_center.setLayout(new GridLayout(2,2));
		
		//센터 패널에 각종 폼 요소들 부착
		p_center.add(la_id); //0.0
		p_center.add(t_id); //0.1
		p_center.add(la_pass); //1.0
		p_center.add(t_pass); //1.1
		
		//패널을 센터에 부착하자.
		this.add(p_center, BorderLayout.CENTER);// 프레임에 패널부착
		
		//페널에 버튼 부착
		p_south.add(bt_login);
		p_south.add(bt_join);
		
		//버튼이 든 페널을 프레임 남쪽에 부착하자
		this.add(p_south, BorderLayout.SOUTH);
		
	
		//나의 사이즈와 비지블을 설정하자
		this.setSize(300,120); //this. 생략가능
		this.setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		LoginForm form = new LoginForm();
		
	}
	
	
	
}
