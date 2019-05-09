package e_oop;

public class RecursiveCall {	// 재귀호출

	public static void main(String[] args) {
		// 4! = 4 * 3 * 2 * 1;
		// 4!를 재귀호출을 사용해 구현
		
		int result = factoial(4);	//재귀호출을 사용한 메서드를 재귀메서드라고 함
		System.out.println(result);
	}

private static int factoial(int i) {
	int result = 0;
	
	if(i==1){	// 무한반복이 되지 않도록 만든 탈출구
		result = 1;
	}else{
		result = i * factoial(i-1);
	}
	return result;
}

}
