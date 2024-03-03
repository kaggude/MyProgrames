package nikhiljava;

import java.util.Scanner;

public class First_digit_even_odd_approach_3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER");
		int n=sc.nextInt();
		while(n>0) {
			n=n/10;
		}
		if(n%2==0) {
			System.out.println("even number is \n"+n);
		}
		else {
			System.out.println("odd number is \n"+n);
		}

	}

}
