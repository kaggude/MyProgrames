package nikhiljava;

import java.util.Scanner;

public class Number_Pattern {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=5;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n;j++) {
			if(i==j || i+j==n+1) {
				System.out.print(i+" ");
			}
			else {
				System.out.print("  ");
			}
			
		}
		System.out.println( );
	}
	}
}

