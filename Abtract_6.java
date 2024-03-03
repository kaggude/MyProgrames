package nikhiljava;

public  class Abtract_6  extends Abtract_4{
	 void fantasy_Cricket() {
		 System.out.println("Cricket is my first love ");
	 }

	@Override
	void small_League() {
		System.out.println("Cricket is my first love ");
		
	}

	@Override
	void fantasy_football() {
		System.out.println("Cricket is my first love ");
		
	}

	@Override
	void add_Cash() {
		System.out.println("Cricket is my first love ");
		
	}

	@Override
	void widraw_cash() {
		System.out.println("Cricket is my first love ");
		
	}

	@Override
	void public_Contest() {
		System.out.println("Cricket is my first love ");
		
	}

	@Override
	void private_Contest() {
		System.out.println("Cricket is my first love ");
		
	}
public static void main(String[] args) {
	Abtract_4 abx=new Abtract_6 ();
	 abx.private_Contest();
	 abx.public_Contest();
	 abx.widraw_cash();
	 abx.small_League();
	 abx.add_Cash();
	 Abtract_6 abb=(Abtract_6)abx;
	 abb.fantasy_Cricket();

	}

}