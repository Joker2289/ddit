package ch5;

public class ArrayEx15 {

	public static void main(String[] args) {
		
		//SOSHELP를 모스부호로 변환
		String source = "SOSHLEP";
		String[] morse = {".-", "-...", "-.-.", "-..", "."
						, "..-.", "--.", "....", "..", ".---"
						, "-.-", ".-..", "--", "-.", "---"
						, ".--", "--,-", ".-.", "...", "-"
						, "..-", "...-", ".--", "-..-", "-.--"
						, "--.."};
		String result = "";
		
		for(int i = 0; i < source.length(); i++){;
			result += morse[source.charAt(i) - 'A'];
		}
		
		System.out.println("source = " + source);
		System.out.println("morse = " + result);

	}

}
