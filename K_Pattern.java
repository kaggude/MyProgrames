package nikhiljava;

import java.util.Scanner;

public class K_Pattern {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=9;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n;j++) {
			if(j==1 || i+j==n-1 || i-j==n-7) {
				System.out.print("* ");
			}
			else {
				System.out.print("  ");
			}
			
		}
		System.out.println( );
	}
	}
}

