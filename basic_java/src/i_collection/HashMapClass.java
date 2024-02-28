package i_collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapClass {

	public static void main(String[] args) {
		/*
		 * put()	: 지정된 키와 값을 저장
		 * remove()	: 지정된 키로 저장된 값을 제거
		 * get()	: 지정된 키의 값을 저장(없으면 null)
		 * keySet() : 저장된 모든 키를 Set으로 반환
		 */
		
		HashMap<String,String> map = new HashMap<String, String>();	// <키의 타입, 값의 타입>
		
		map.put("title", "제목");	//키와 값을 한 쌍으로 묶어 저장
		map.put("content", "내용");
		map.put("user", "사용자");
		map.put("user", "사용자2"); 	//같은 키가 두번오면 뒤에 값이 앞에 값을 덮어쓴다
		
		
		/*map.remove("user");	*/	//저장된 키로 접근해서 삭제함
		System.out.println(map.get("title"));
		System.out.println(map.get("content"));
		System.out.println(map.get("user"));	//제거되서 null값
		
		//만약 개발자가 키값을 모른다면
		//map에 저장된 모든 키값 출력
		Set<String> keys = map.keySet();
		
		//키값과 값에 접근하는 방법
		Iterator<String> itr = keys.iterator();	//컬렉션들에 접근하는 방법을 표준화시킨 방법
		
		Iterator<String> itr2 = map.keySet().iterator();
		//위에 두줄을 한줄로 표현
		
		
		
		while(itr.hasNext()){	//hasNext() - 0번 인덱스부터 차례로 접근하면서 
								//값이 들어있음 true, 없으면 false
			String key = itr.next();	//1턴 0번 접근
										//2턴 1번 접근
			
			String value = map.get(key);	// key의 값들에 접근
			System.out.println(key + " : " + value);
		}
		
		//ArrayList에 HashMap이 담겨있는 형태 (테이블과 같은 형태)
		ArrayList<HashMap<String, Object>> list 
			= new ArrayList<HashMap<String, Object>>();
		
		
		list.add(new HashMap<String, Object>());	//방 생성
	
		//접근 방법
		for(int i=0; i<list.size(); i++){
			HashMap<String, Object> map2 = list.get(i);
			
			map2.put("key","value");
			
			System.out.println(map2.get("key"));
		}
		
		
		
		
		
		
		
	}

}
