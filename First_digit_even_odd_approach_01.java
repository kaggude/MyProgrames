package nikhiljava;

import java.util.Scanner;

public class First_digit_even_odd_approach_01 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER");
		int n=sc.nextInt();
		int rev=0;
		int count=0;
		while(n>0) 
		{
			int d=n%10;
			rev=rev*10+d;
			n=n/10;
		}
		int a=rev%10;
		if(a%2==0) {
			System.out.println("even number is \n"+a);
		}
		else {
			System.out.println("odd number is \n"+a);
		}

	}

}
