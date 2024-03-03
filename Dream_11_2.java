package nikhiljava;

public class Dream_11_2  extends Dream_11{

	@Override
	void widrawal() {
		int amount=90;
		int minbal=100;
		String bank="bnk001";
		String verified=bank;

		if(amount>minbal) {
			if(bank==verified) {
				System.out.println("amount is elogiable to widraw");
			}
			else {
				System.out.println("bank is not verified ");
			}
		}
		else {
			System.out.println("Amount is must be greater than minbal"+minbal);
		}
	}
				
}
