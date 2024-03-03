package nikhiljava;

import java.util.Scanner;

public class Fibonacci_Number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE  TARGET NUMBER");
		int target=sc.nextInt();
		int a=0;
		int b=1;
		int c=0;
		for(int i=1;i<=target;i++) {
			c=a+b;
			a=b;
			b=c;
		}
		System.out.println(a);

	}

}
