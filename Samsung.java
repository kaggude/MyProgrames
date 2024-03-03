package nikhiljava;

public class Samsung  extends UpCasting_DownCasting{
	 String samsung="samsung s23 ultra ";
	 void smart_phone_2() {
			System.out.println("THE N0.2 BRAND ");
		}

	public static void main(String[] args) {
		
		 UpCasting_DownCasting ip1=new Samsung();
		 System.out.println(ip1. country_1);
		 System.out.println(ip1. country_2);
		 ip1.smart_phone_1();
		 ip1.smart_phone_2();
		 Samsung p1=(Samsung) ip1;
		 System.out.println(p1.samsung);
		 p1.smart_phone_2();
	}

}
