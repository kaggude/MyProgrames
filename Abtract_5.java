package nikhiljava;

public class Abtract_5 extends Abtract_3 {
	 void fantasy_football() {
		 System.out.println(" abstract main method runtime binding will happen here");
	}
	
	@Override
	void grand_League() {
		System.out.println(" 1st winner is 1cr ");
		
	}

	@Override
	void small_League() {
		System.out.println(" 1st winner is 5lakh");
		
		
	}

	@Override
	void add_Cash() {
		System.out.println(" minimum amount should be more than 100 or equal to 100");
		
	}

	@Override
	void widraw_cash() {
		System.out.println(" minimum widrawal amount should be more than equal to 100 (amount>=100)");
		
	}

	@Override
	void public_Contest() {
		System.out.println(" public  contest play with your skilled oppents  and win more ");
	}

	@Override
	void private_Contest() {
		System.out.println(" private contest play with your friends and win more  ");
		
	}

	public static void main(String[] args) {
		 Abtract_3 ab=new  Abtract_5();
		 ab.private_Contest();
		 ab.public_Contest();
		 ab.widraw_cash();
		 ab.small_League();
		 ab.grand_League();
		 Abtract_5 ab1=(Abtract_5)ab;
		 ab1.fantasy_football();
		 }

}
