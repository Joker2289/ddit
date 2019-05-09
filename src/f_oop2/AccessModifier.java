package f_oop2;

public class AccessModifier {

	public String publicVar = "public : 접근제한이 없음";
	protected String protectedVar = "protected : 같은 패키지 내에서, 그리고 다른 패키지의 자손클래스에서 접근가능";
	String defaultVar = "default : 같은 패키지에서 접근 가능";
	private String privateVar = "private : 클래스 내에서만 접근 가능";
	
	public void publicMethod(){
		System.out.println(publicVar);
	}
	protected void protectedMethod(){
		System.out.println(protectedVar);
	}
	void defaultMethod(){
		System.out.println(defaultVar);
	}
	
	private void privateVar(){
		System.out.println(privateVar);
	}
	
}
