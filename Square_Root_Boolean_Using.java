package nikhiljava;

import java.util.Scanner;

public class Square_Root_Boolean_Using {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER");
		int n=sc.nextInt();
	boolean flag=false;
	for(int i=1;i<=n;i++) {
		if(i*i==n) {
			flag=true;
			System.out.println("the sqr root is "+i);
		}
	}
	if(flag==false) {
		System.out.println("the sqr is not found");
	}

	}

}
