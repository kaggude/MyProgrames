package nikhiljava;

public class Java_3 extends Java_2{
	void Display() {
		System.out.println(" WE ARE JAVA TRAINER OF QSPIDER_OLD_AIRPORT_BEN");
	}
	@Override
	void jt2() {
		
		System.out.println("Lavnya Mam");
	}

	@Override
	void jt1() {
		
		System.out.println("Rahul Sir");
	}

	@Override
	void branchHead() {
		System.out.println(" BranchHead Pradeep Sir ");
		
	}
public static void main(String[] args) {
	Java_2 j=new Java_3();
	j.branchHead();
	j.jt1();
	j.jt2();
	Java_3 jj=(Java_3)j;
	jj.Display();

	}


}
