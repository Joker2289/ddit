package Egoing;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class SetDemo {

	public static void main(String[] args) {
		Collection<Integer> A = new ArrayList<Integer>();
		A.add(1);
		A.add(2);
		A.add(3);
		
		HashSet<Integer> B = new HashSet<Integer>();
		B.add(3);
		B.add(4);
		B.add(5);
		
		HashSet<Integer> C = new HashSet<Integer>();
		C.add(1);
		C.add(2);
		
		System.out.println(A.containsAll(B)); // false > B집합의 원소가 A안에 들어있는 가 
		System.out.println(A.containsAll(C)); // true
		
		//A.addAll(B); 	  //A와 B의 합집합
		A.retainAll(B); //A와 B의 교집합
		//A.removeAll(B); //A와 B의 차집합
		
		Iterator hi = A.iterator();
		while(hi.hasNext()	) {
			System.out.println(hi.next());
		}
	}
}
