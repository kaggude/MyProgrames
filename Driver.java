package nikhiljava;

public class Driver  extends Car{

	@Override
	void tata() {
		System.out.println("TATA MOTORS  ");
	}

	@Override
	void mahindra() {
		System.out.println("  MAHINDRA MOTORS ");
	}
		

	@Override
	void tesla() {
		System.out.println("TESLA  MODEL ONE");
	}
		

	@Override
	void hundai() {
		System.out.println("HUNDAI MOTORS  ");
	}
	 public static void mian( String []args ) {
		 Driver dd=new Driver();
		 dd.tata();
		 dd.mahindra();
		 dd.tesla();
		 dd.hundai();
	 }
	

}
