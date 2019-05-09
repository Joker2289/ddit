package Egoing;

public class ObjectDemo {

	public static void main(String[] args) {
	Student s1 = new Student("박정권");
	Student s2 = new Student("박정권");
	
	System.out.println(s1==s2);
	System.out.println(s1.equals(s2));
	
	try {
		Student s3 = (Student)s1.clone();	//s3에 복사 - s1.clone 은 object타입 이므로 명시적으로 형변환 
		System.out.println(s1.name);
		System.out.println(s3.name);
	} catch (CloneNotSupportedException e) {
		e.printStackTrace();
	}	 // s1객체를 복제 
		 // 에러 > 객체를 복제하려면 이 클래스가 복제가능한 객체라는 사실을 자바 버츄얼머신에게 알려줘야한
	
	}

}

class Student implements Cloneable{ //구분자 복제가능하다고 마킹한 뜻 > 에러 
	String name;
	Student(String name){   
		this.name = name;
	}
	
	public Object clone() throws CloneNotSupportedException { // exception을 사용자에게 던짐 
		return super.clone();
	}
	
	/*public boolean equals(Student name) {		//파라미터값 타입을 Student타입으로 받는 예
					
		return this.name == name.name;
	}*/
	
	@Override	
	public boolean equals(Object obj){	//매개변수 타입을 어떤 타입으로 받을 지 정확하지 않을 때 Object타입사용
		
		Student s = (Student)obj;
		
		return this.name == s.name;
	}
	
	/*@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}*/
	
	
}
