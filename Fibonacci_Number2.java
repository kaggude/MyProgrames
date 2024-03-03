package nikhiljava;

import java.util.Scanner;

public class Fibonacci_Number2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE N NUMBER");
		int n=sc.nextInt();
		int a=0;
		int b=1;
		int c=0;
		System.out.println("ENTER THE TARGET NUMBER");
		int target=sc.nextInt();
		for(int i=1;i<=n;i++) {
			if(target==i) {
				System.out.println(a);
			}
			c=a+b;
			a=b;
			b=c;
		}

	}

}
