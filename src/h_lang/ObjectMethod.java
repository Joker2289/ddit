package h_lang;

public class ObjectMethod extends Object{

	public static void main(String[] args) {
		//toString() : 객체에 대한 정보를 문자열로 제공한다.
		
		ObjectMethod om = new ObjectMethod();
		System.out.println(om);	//주소값이 나옴 h_lang.ObjectMethod@15db9742
								//           |     메서드 풀네임   |@| 해시코드(16진수)
		//객체를 String으로 사용하려할때 toString을 자동으로 사용함 - Object를 상속받았기때문에
		System.out.println(om.toString());	// 같은 결과
		
	}
	
	@Override
	public String toString(){
		return "toString() 메서드호출";
	}
	
}
