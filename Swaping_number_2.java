//SWAP THE NUMBER WITHOUT USING THIRD VARIABLE 
package nikhiljava;

import java.util.Scanner;

public class Swaping_number_2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE 'a' NUMBER");
		int a=sc.nextInt();
		System.out.println("ENTER THE 'b' NUMBER");
		int b=sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b);
		

	}

}
