package f_oop2;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnonymousClass {

	public static void main(String[] args) {
		Button b = new Button();//버튼들의 기능을 만들때 '익명 클래스'를 사용함
								//ActionListenner는 인터페이스
		//하나의 부모 클래스나 인터페이스를 상속받아
		// 클래스를 선언함과 동시에 객체를 생성하는 클래스
		b.addActionListener(new ActionListener() {
			
			@Override	//ActionListener를 상속받은 자식 클래스
			public void actionPerformed(ActionEvent e) {
				
			}
		});

	}

}
