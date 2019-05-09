package exam;

public class Ex6 {

	public static void main(String[] args) {
		
		//[6-1] 다음과 같은 멤버변수를 갖는 SutdaCard클래스를 정의하시오.
		//타 입		변수명 	설 명
		//int 		num 	카드의 숫자.(1~10사이의 정수)
		//boolean 	isKwang 광(光)이면 true, 아니면 false
			
		/*public class SutdaCard{
			int num;
			boolean isKwang; 
		}*/
		
		//[6-2] 문제6-1에서 정의한 SutdaCard클래스에 두 개의 생성자와 info()를 추가해서 실행
		//결과와 같은 결과를 얻도록 하시오.
		
		/*int num ;
		boolean isKwang;

		SutdaCard(int num, boolean isKwang){
			this.num= num;
			this.isKwang = isKwang;
		}
		
		SutdaCard(){
			num = 1;
			isKwang = true;
			this(1,true);
		}
		
		String info(){
			return num + (isKwang ? "K" : "");
		}*/	
		
		
		//[6-3] 다음과 같은 멤버변수를 갖는 Student클래스를 정의하시오.
		//타 입	 변수명 	설 명
		//String name 	학생이름
		//int 	 ban 	반
		//int 	 no 	번호
		//int 	 kor 	국어점수
		//int 	 eng 	영어점수
		//int  	 math   수학점수
		
		/*class Student {
			String name;
			int ban;
			int no;
			int kor;
			int eng;
			int math;
			}*/
		
		
		
		//[6-4] 문제6-3에서 정의한 Student클래스에 다음과 같이 정의된 두 개의 메서드
		//      getTotal()과 getAverage()를 추가하시오.
		
		  /*1. 메서드명 : getTotal
				기 능 : 국어(kor), 영어(eng), 수학(math)의 점수를 모두 더해서 반환한다.
				반환타입 : int
				매개변수 : 없음
			2. 메서드명 : getAverage
				기 능 : 총점(국어점수+영어점수+수학점수)을 과목수로 나눈 평균을 구한다.
					소수점 둘째자리에서 반올림할 것.
				반환타입 : float
				매개변수 : 없음*/
		
			/*Student s = new Student();
			s.name = "홍길동";
			s.ban = 1;
			s.kor = 100;
			s.eng = 60;
			s.math = 76;
			
			System.out.println("이름 : " + s.name);
			System.out.println("총점 : " + s.getTotal());
			System.out.println("평균 : " + s.getAverage());*/
		
		/*class Student {
			String name;						//답
			int ban;
			int no;
			int kor;
			int eng;
			int math;
			int getTotal() {
			return kor + eng + math;
			}
			float getAverage() {
			return (int)(getTotal() / 3f * 10 + 0.5f) / 10f;
			}*/
			
		
		//[6-5] 다음과 같은 실행결과를 얻도록 Student클래스에 생성자와 info()를 추가하시오.
		
		//	[연습문제]/ch6/Exercise6_5.java
		//	class Exercise6_5 {
		//		public static void main(String args[]) {
		//			Student s = new Student("홍길동",1,1,100,60,76);
		//			System.out.println(s.info());
		//		}
		//	}
			
		/*student s = new student("홍길동", 1, 1, 100, 60, 76);
			
		System.out.println(s.info());
				}
		}

		class Student {
			String name;
			int ban;
			int no;
			int kor;
			int eng;
			int math;
		
			Student(String name, int ban, int no, int kor, int eng, int math) {
				this.name = name;
				this.ban = ban;
				this.no = no;
				this.kor = kor;
				this.eng = eng;
				this.math = math;
			}
		
			int getTotal() {
				return kor + eng + math;
			}
		
			float getAverage() {
				return (int) (getTotal() / 3f * 10 + 0.5f) / 10f;
			}
		
			public String info() {
				return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math
						+ "," + getTotal() + "," + getAverage();*/


		
		//[6-6] 두 점의 거리를 계산하는 getDistance()를 완성하시오.
		//[Hint] 제곱근 계산은 Math.sqrt(double a)를 사용하면 된다.
		
		//[연습문제]/ch6/Exercise6_6.java
		//class Exercise6_6 {
		// 두 점 (x,y)와 (x1,y1)간의 거리를 구한다.
		//static double getDistance(int x, int y, int x1, int y1) {
		//	return Math.sqrt((x-x1)*(x-x1) + (y-y1)*(y-y1)); 
		//}
		// public static void main(String args[]) {
		// System.out.println(getDistance(1,1,2,2));
		
		
		//[실행결과]
		//1.4142135623730951
		
		/*[6-7] 문제6-6에서 작성한 클래스메서드 getDistance()를 MyPoint클래스의 인스턴스메서
		드로 정의하시오.*/
			
		/*[연습문제]/ch6/Exercise6_7.java
			class MyPoint {
				int x; // 인스턴스 변수
				int y; // 인스턴스 변수
				MyPoint(int x, int y) {
					this.x = x;
					this.y = y;
				}
				double getDistance(int x1, int y1) {
					return Math.sqrt((x-x1)*(x-x1) + (y-y1)*(y-y1)); // x, y는 인스턴스 변수
				}
			}
			class Exercise6_7 {
				public static void main(String args[]) {
					MyPoint p = new MyPoint(1,1);
					// MyPoint와 (2,2)의 거리를 구한다.
					System.out.println(p.getDistance(2,2));
				}
			}*/	
		
		
		
	} // main끝
}// class 끝
 

/*class SutdaCard{	// 문제 2
	int num ;
	boolean isKwang;

	SutdaCard(int num, boolean isKwang){
		this.num= num;
		this.isKwang = isKwang;
	}
	
	SutdaCard(){
		num = 1;
		isKwang = true;
		this(1,true);
	}
	
	String info(){
		return num + (isKwang ? "K" : "");
	}	
}*/

/*class student{
	
	String name;	//3번
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	int getTotal(){
		return kor + eng + math; 
	}
	
	float getAverage(){
		return (int)(getTotal() / 3f * 10 + 0.5f) / 10f;	// 반올림 공식
	}
	//4번
	
	public student(String name, int ban, int no, int kor, int eng, int math){
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	String info(){
		
		return name + ", " + ban + ", " + no + ", " + kor + ", " + eng + ", " + math 
				+ ", " + getTotal() + ", " + getAverage();
	}// 5번	
}*/

/*class Exercise6_6 {
	// 두점(x, y) (x1, y1)
	static double getDistance(int x, int y, int x1, int y1){
	//공식 : 루트 (x-x1)^2 + (y-y1)^2
	}
}*/
