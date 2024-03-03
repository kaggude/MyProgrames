package nikhiljava;

public class Rider  extends Bike{

	@Override
	void tata() {
		System.out.println("TACTICAL AND COMBAT SUPPORT VEHICAL");
	}

	@Override
	void mahindra() {
		System.out.println("THE STRATON PLUS APC");
	}

	@Override
	void bajaj() {
		System.out.println("BAJAJ PULSER N150 SPORTS BIKE ");
	}

	@Override
	void tvs() {
		System.out.println(" TVS SPORTS BIKES ");
	}

	public static void main(String[] args) {
		Rider rr=new Rider();
		rr.tata();
		rr.mahindra();
		rr.bajaj();
		rr.tvs();
		
	}

}
