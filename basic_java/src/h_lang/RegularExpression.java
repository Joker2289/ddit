package h_lang;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
		/*
		 * 정규표현식 (Regular Expression) : 문자열의 패턴을 검사하는 표현식
		 * 
		 * ^ 	^의 뒷문자로 시작 		ex) ^a - a로 시작하는 문자열인지 검사
		 * $	앞 문자로 종료	   		ex) a$ - a로 끝나는지 검사
		 * .	임의의 문자(줄바꿈제외)
		 * *	앞 문자가 0개 이상		ex)(a*) 앞에 문자가 0개이상 와야 된다
		 * +	앞 문자가 1개 이상 		ex)(a+) 앞에 문자가 1개이상 와야 된다
		 * ?	앞 문자가 없거나 1개		ex)(a?)
		 * []	문자의 집합이나 범위([a-z] : a부터 z까지 1글자, [^a-z] : a 부터 z가 아닌 것
		 * {}	앞 문자의 개수({2} : 2개, {2,4} : 2개이상 4개 이하)
		 * ()	그룹화(1개의 문자처럼 인식)
		 * |	OR 연산
		 * \s	공백, 탭, 줄바꿈
		 * \S	공백, 탭, 줄바꿈이 아닌 문자
		 * \w	알파벳이나 숫자
		 * \W	알파벳이나 숫자가 아닌 문자
		 * \d	숫자
		 * \D	숫자가 아닌 문자
		 * (?i)	뒷 문자의 대소문자 구분 안함
		 * \	정규표현식에서 사용되는 특수문자 표현
		 * 
		 *	제약조건에 맞게 입력을 했는지 검사 -> 주로 회원가입에 사용
		 * http://regexr.com/
		 * 
		 */
		
		
		Pattern p = Pattern.compile("[a-z]{3}[0-9]{1,3}");
		Pattern p1 = Pattern.compile("[a-z0-9]+{1,3}");
		Pattern p2 = Pattern.compile("\\w*"); 	// \를 하나 더붙여서 escape문자의 기능을 앞이해줌)
		Pattern p3 = Pattern.compile(".*");		// 어떤문자가와도 됨 너무광범위한 범위
		
		Matcher m = p.matcher("abc123");	//패턴과 문자열을 비교에서 결과를 m에 저장
		
		System.out.println(m.matches());	// matches로 결과를 true 혹은 false로 반환
		
		//아이디, 비밀번호, 전화번호, 이메일주소의 유효성을 검사하는 정규표현식을 만들어주세요
		
		//아이디
		Pattern id = Pattern.compile("\\w{6,12}");
		Matcher id2	= id.matcher("pjk2289");
		System.out.println(id2.matches());
		
		//비밀번호
		//	(?=.*[a-zA-z])(?=.*[0-9])(?=.*[!@#]).{8,20}
		Pattern pw = Pattern.compile("(\\w|\\sW){1,20}");	// SW
		Matcher pw2	= pw.matcher("pjk72007989");
		System.out.println(pw2.matches());
		
		//전화번호
		//	^0\\d{1,3}-\\d{3,4}-\\d{4}
		Pattern num = Pattern.compile("\\d{3,4}\\-\\d{3,4}\\-\\d{4}");
		Matcher num2 = num.matcher("010-4433-2289");
		System.out.println(num2.matches());
		
		//이메일
		//	\\w{6,20}@[a-zA-z]+\\.(?i)(com|net|org|([a-zA-Z]{2}.kr))
		Pattern mail = Pattern.compile("\\w{6,12}\\@[a-z]{1,10}((.com)|(.co.kr)|(.net))");
		Matcher mail2 = mail.matcher("pjk280230@gmail.com");
		System.out.println(mail2.matches());
	}

}
