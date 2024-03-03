package nikhiljava;

import java.util.Scanner;

public class Xylem_number_qsp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER");
		int n=sc.nextInt();
		int last=n%10;
		n=n/10;
		int innersum=0;
		while(n>9) {
			int innervalue=n%10;
			innersum=innersum+innervalue;
			n=n/10;
			 
		}
		int outersum=last+n;
		System.out.println(outersum);
		System.out.println(innersum);
		if(innersum==outersum) {
			System.out.println("the given number is xylo number\n"+innersum+"=="+outersum);
		}
		else {
			System.out.println("the given number is not a xylo number\n"+innersum+"!="+outersum);
		}

	}

}
