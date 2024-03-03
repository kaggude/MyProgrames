package nikhiljava;

public class I_phone  extends UpCasting_DownCasting {
     String iphone="iphone 15 pro ";
     void i_phone() {
    	 System.out.println(" THE I_PHONE BRAND");}
     
    	 public static void main(String[] args) {
    		 UpCasting_DownCasting ip=new I_phone();
    		 System.out.println(ip. country_1);
    		 System.out.println(ip. country_2);
    		 ip.smart_phone_1();
    		 ip.smart_phone_2();
    		 I_phone p=(I_phone) ip;
    		 System.out.println(p.iphone);
    		 p.i_phone();
    		 
    	 }
     }
