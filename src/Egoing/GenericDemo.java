package Egoing;

class StudentInfo{
	public int grade;
	StudentInfo(int grade){ this.grade = grade;}
}

/*class StudentPerson{ //중복 
	public StudentInfo info;
	StudentPerson(StudentInfo info){ this.info = info;}
}*/

class EmployeeInfo{
	public int rank;
	EmployeeInfo(int rank){ this.rank = rank;}
}

/*class EmployeePerson{ //중복 
	public EmployeeInfo info;
	EmployeePerson(EmployeeInfo info){ this.info = info;}
}*/

/*class Person{ 
	public Object info; // 두 info를 공통으로 받을만한 타입이 없어 Object를 타입으로 쓴다   
	Person(Object info){ this.info = info;}
}*/

class Person<T>{
	public T info;
	Person(T info){ this.info = info; }
}

public class GenericDemo {

	public static void main(String[] args) {
		/*
		StudentInfo si = new StudentInfo(2);
		StudentPerson sp = new StudentPerson(si);
		System.out.println(sp.info.grade); // 2
		EmployeeInfo ei = new EmployeeInfo(1);
		EmployeePerson ep = new EmployeePerson(ei);
		System.out.println(ep.info.rank); // 1
		 */	
		
//		Person p1 = new Person("부장"); // 문법적으로는 아무런 문제가 없지만 코드의 취지, 코드가 설계된 목적성에 어긋난다 
									   // 버그지만 컴파일 할때도 검출되지 않기 때문에 굉장히 심각한 문제를 야기한다 
		
//		EmployeeInfo ei = (EmployeeInfo)p1.info; // p1.info - Object 타입이고 ei는 EmployeeInfo라는 구체적인 타입이므로 형변환 해줘야함 
		// 컴파일과정에선 오류가 발생하지 않지만 런타임과정에선 오류가 발생한다  -- ClassCastException 런타임오류 
		// 타입이 안전하지 않다 > 자바의 정서에는 맞지않다 
		
		Person<EmployeeInfo> p1 = new Person<EmployeeInfo>(new EmployeeInfo(1));
		EmployeeInfo ei1 = p1.info;
		System.out.println(ei1.rank); // 컴파일 성공 1 
		
//		Person<String> p2 = new Person<String>("부장");
//		String ei2 = p2.info;
//		System.out.println(ei2.rank); // 컴파일 실패 
		
	
	}

}
