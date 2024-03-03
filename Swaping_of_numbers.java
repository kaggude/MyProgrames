//SWAPING NUMBER WITH USING THE THIRD VARIABLE 
package nikhiljava;

import java.util.Scanner;

public class Swaping_of_numbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE 'a' NUMBER");
		int a=sc.nextInt();
		System.out.println("ENTER THE 'b' NUMBER");
		int b=sc.nextInt();
		int c=a;
		a=b;
		b=c;
		System.out.println(a);
		System.out.println(b);
		

	}

}
