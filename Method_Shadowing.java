package nikhiljava;

public class Method_Shadowing {
//it is compile time example ,because it is static method it will bind and stay there only we here not override the methods 
	public static void main(String[] args) {
		A a=new B();
		a.add();
		A.add();
		B b=(B)a;
		b.add();
		
		
		
	}

}
