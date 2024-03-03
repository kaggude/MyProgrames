package nikhiljava;

public class Indian_Army_4 extends Indian_Army_3 {
	void army_Training_Command() {
		System.out.println("Shimala");
	}
	void South_western_Command() {
		System.out.println("Jaipur");
	}
	@Override
	void Northen_Command() {
		
		System.out.println("Northen_Command");
	}

	@Override
	void western_command() {
		System.out.println("Chandimandir ");
		
	}

	@Override
	void Eastern_Command() {
		System.out.println("Kolkata ");
		
	}

	@Override
	void Central_Command() {
			System.out.println("Lucknow ");
	}
	@Override
	void Southern_Command() {
		System.out.println("Pune");
		
	}
public static void main(String[] args) {
	
	Indian_Army_3 ind=new Indian_Army_4();
	Indian_Army_4 ind1=(Indian_Army_4)ind;
	ind1.South_western_Command();
	ind1.army_Training_Command();
	ind.Central_Command();;
	ind.Eastern_Command();
	ind.Southern_Command();
	ind.Northen_Command();
	ind.western_command();
	}

}
