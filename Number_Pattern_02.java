package nikhiljava;

import java.util.Scanner;

public class Number_Pattern_02 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=5;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n;j++) {
			if(i==j || i+j==n+1) {
				System.out.print(j+" ");
			}
			else {
				System.out.print("  ");
			}
			
		}
		System.out.println( );
	}
	}
}

