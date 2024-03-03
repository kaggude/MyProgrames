package nikhiljava;

import java.util.Scanner;

public class Fibonacci_series {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER");
		int n=sc.nextInt();
		int a=0;
		int b=1;
		int c=0;
		for(int i=1;i<=n;i++) {
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
		}

	}

}
