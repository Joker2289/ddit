package Egoing;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		String[] arrayObj = new String[2];
		arrayObj[0] = "one";
		arrayObj[1] = "two";
		//arrayObj[2] = "three"; //런타임 에러 발생
		for(int i=0; i<arrayObj.length; i++) {
			System.out.println(arrayObj[i]);
		}
		
		ArrayList al = new ArrayList();
		al.add("one");
		al.add("two");
		al.add("three");
		for(int i=0; i<al.size(); i++) {
			String value = (String)al.get(i); // ArrayList를 Object타입으로 객체화 하였으므로 형변환 해줘야 한다
			System.out.println(value);
			//System.out.println(al.get(i));
		}
	}
}
