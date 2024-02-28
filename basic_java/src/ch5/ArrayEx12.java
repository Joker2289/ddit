package ch5;

public class ArrayEx12 {

	public static void main(String[] args) {

		// String 배열
		String[] name = {"Park", "jweong", "kweon"};
		
		for(int i=0; i<name.length; i++){
			System.out.println("name[" + i + "] = "+name[i]);
		}
		
		String tmp = name[2];	// 배열 name의 세 번째 요소를 tmp에 저장
		System.out.println("tmp = "+tmp);
		name[0] = "박";	// 배열 name의 인덱스 0을 박으로 저장
		
		for(String str : name){	//향상된 for문
			System.out.print(str);
		}

	}

}
