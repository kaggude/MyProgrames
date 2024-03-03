//REVERSE NUMBER SHOULD BE SAME THAT TIME IT IS CALLED AS PALINDROME 

package nikhiljava;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER");
		int n=sc.nextInt();
		int rev=0;
		int copy=n;
		while(n>0) {
			int d=n%10;
			rev=rev*10+d;
			n=n/10;}
		if(rev==copy) {
			System.out.println("the given number is palindrome");
		}
		else {
			System.out.println("the given number is not palindrome");

		}
		}

	}
