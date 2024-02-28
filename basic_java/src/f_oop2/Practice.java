package f_oop2;

interface boy {

}

interface girl {

}

class Paren {

}

class Ch1 extends Paren implements boy {

}

class Ch2 extends Paren implements girl {

}

class Ch3 extends Paren implements girl {

}

class Eat {
	Paren i;

	public Eat() {
	}

	public Eat(Paren i) {
		this.i = i;
	}

	public void Toilet(boy cc) {
		System.out.println("남자화장실을 사용했다");
	}

	public void Toilet(girl cc) {
		System.out.println("여자화장실을 사용했다");
	}
}

public class Practice {

	public static void main(String[] args) {

		Paren cc = new Ch1();
		Paren cc1 = new Ch2();
		Paren cc2 = new Ch3();

		boy bb = new Ch1();
		girl gg = new Ch2();
		girl gg1 = new Ch3();
	}

}
