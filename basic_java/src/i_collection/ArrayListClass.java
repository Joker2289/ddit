package i_collection;

import java.util.ArrayList;

public class ArrayListClass {

	public static void main(String[] args) {
		/*
		 * add()	: 마지막 위치에 객체를 추가
		 * get()	: 지정된 위치의 객체를 반환
		 * size()	: 지정된 객체의 수 반환
		 * remove() : 지정된 위치의 객체를 제거	
		 * set()	: 인덱스에 들어있는 값 변경
		 */

		ArrayList list = new ArrayList();	//배열과 구조가 동일하다
	//	= ArrayList<Object> list = new ArrayList<Object>(); //Object타입과 동일하다
		//타입을 지정해주지 않으면 아무거나 넣을 수 있다
		list.add(1);
		list.add("abc");
		list.add(true);
		list.add(new ArrayListClass());
		//어떤타입인지 예측하기 힘드므로 이 방법은 좋지 않다.
		
		ArrayList<String> list2 = new ArrayList<String>();
		//제네릭
		
		list2.add("add");
	//	list2.add(1); 에러 int형
		list2.add("123");
		
		//길이반환 .size
		for(int i=0; i<list2.size(); i++){
			System.out.println(list2.get(i));
			list2.remove(i); //인덱스 값 삭제
		}
		
		//int형 2차원배열
		ArrayList<ArrayList<Integer>> list3 = new ArrayList<ArrayList<Integer>>();
		
		list3.add(new ArrayList<Integer>());	//0번 행 방생성
		list3.add(new ArrayList<Integer>());	//1번 행 방생성
		
		ArrayList<Integer> al = list3.get(0);	//0번 행 인덱스를 반환
		ArrayList<Integer> al2 = list3.get(1);	//1번 행 인덱스를 반환
		
		al.add(0);	// 0. 0
		
		// 위에 두줄을 한 줄로 요약
		list3.get(0).add(10);		// 0. 1
		list3.get(0).add(20);		// 0. 2
		list3.get(0).add(30);		// 0. 3
		list3.get(0).add(40);		// 0. 4
		
		
		System.out.println(list3.get(0));
		System.out.println(list3.get(1));

	
		//for문 이용한 접근
		for(int i = 0; i < list3.size(); i++){
			ArrayList<Integer> list4 = list3.get(i);
			for(int j = 0; j < list4.size(); j++){
				System.out.println(list4.get(j));
			}
		}
		
		System.out.println(list3.get(0));
		
		
		
	}

}
