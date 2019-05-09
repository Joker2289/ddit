package f_oop2;

public class Test {

	public static void main(String[] args) {
		//SampleParent sp = null;
		SampleChild sc = new SampleChild();
		//SampleChild sc2 = null;
		
		/*sc.childMethod();*/
		//sp = sc;
		System.out.println(sc.parentVariable);
		SampleParent sc2 = sc;
		sc2.parentMethod();
		System.out.println(sc2.parentVariable);
		System.out.println(sc2.var);
		
		sc.parentMethod();
		System.out.println(sc.parentVariable);
		System.out.println(sc.var);
		
		SampleParent sc3 = new SampleParent();
		sc3.parentMethod();
	}

}


//void eatLunch(parent baby){
	
//}


// Parent
// child



//child1 Ob   =   new child1();
//child2 Ob   =   new child2();
//child3 Ob   =   new child3();

//parent Ob  =  new child1(), child2(), child3();



// sc = TYPE[Child]   ob =child
// sc2 = TYPE [Parant]   ob  =child