package nikhiljava;

import java.util.Scanner;

public class Sunny_Number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER");
		int n=sc.nextInt();
		int n1=n+1;
		for (int i=1;i<=n1;i++) {
			if(i*i==n1) {
				System.out.println("the Sunny number found "+n);
				break;
				}
			else if(i==n1)
			{
				System.out.println("the Sunny number not found \n"+n);
			}
			}
		}
	}
