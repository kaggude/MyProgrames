package nikhiljava;

import java.util.Scanner;

public class First_digit_even_odd_approach_2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER");
		int n=sc.nextInt();
		int rev=0;
		int d=0;
		int count=0;
		while(n>0) {
			 d=n%10;
			n=n/10;
		}
		if(d%2==0) {
			System.out.println("even number is \n"+d);
		}
		else {
			System.out.println("odd number is \n"+d);
		}

	}

}
