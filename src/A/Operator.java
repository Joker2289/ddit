package A;

public class Operator {

	public static void main(String[] args) {
		/* 1.산술 연산자
		 * - +(더하기), -(빼기), *(곱하기), /(나누기), %(나머지)
		 * - 양쪽의 피연산자가 타입이 일치해야 연산이 가능하다.
		 * - int형(4byte)보다 크기가 작은 자료형은 int형으로 형변환 후 연산을 수행한다.
		 * - 두개의 피연산자 중 자료형의 표현범위가 큰 쪽으로 형변환 후 연산을 수행한다.
		 * - 산술 연산자와 대입 연산자를 향해 연산식을 줄여서 표현할 수 있다.
		 */
		
		int a = 1 + 2;	// 3 
		System.out.println(a);
		a = a - 1;	// 2
		System.out.println(a);
		int c = a * 4;	// 8
		System.out.println(c);
//		int d = c / 0;	// 0으로 나눌수없음 - 에러 발생
//		System.out.println(d);
		float d = c / 0f;	// infinity
		System.out.println(d);
		int e = c / 3;	// 2 (int타입에선 소수점이 버려짐)
		System.out.println(e);
		float f = c / 3f;	// 2.6666667 접미사 f를 붙여도되고 c앞에 (float) 형변환 해도됨
		System.out.println(f);
		
		float g = c % 3;	// 2.0 %는 나머지를 구하는 연산 
		System.out.println(g);
		float h = c % 0f;	// NaN ( Not a Numuber - 숫자가아니다)
		System.out.println(h);
		int x = 0;	
		x = x + 1;
		x += 1;		// 산술 연산자와 대입 연산자를 향해 연산식을 줄여서 표현할 수 있다.
		
		x = x - 2;
		x = x * 3;
		x = x / 4;
		x = x % 5;
		
		x -= 2;
		x *= 3;
		x /= 4;
		x %= 5;
		
		x = x + 1;
		x += 1;
		x++;	// 같은 줄에 있는 문장에 있는 명령 먼저 처리 후 1을 더함
		++x;	// 1을 던저 더한 후 같은 줄에 있는 문장에 있는 명령을 처리
		
		x = x - 1;
		x -= 1;
		x--;
		--x;
		
		x = 0;	// 0
		System.out.println(x++);	// x를 먼저 출력하고 1을 더해서 0
		x = 0;	// 1
		System.out.println(++x);	// 1을 더한 상태에서 x를 출력해서 1
		
		// 문제1. 다음을 한줄씩 계산해서 최종 결과값을 출력해주세요.
		//123456 + 654321
		//결과값 * 123456
		//결과값 / 123456
		//결과값 - 654321
		//결과값 % 123456
		
		long z = 0l;
		z += 123456;
		z += 654321;
		z = z * 123456;	// int의 표현범위를 초과해서(오버플로우) long 타입을 씀
		z = z / 123456;	// *오버플로우 : 타입의 표현범위를 초과해서 표현범위( + - )를 돌고 돔
		z -= 654321;
		z = z % 123456;
		System.out.println(z);

	}

}
