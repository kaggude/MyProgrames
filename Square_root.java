package nikhiljava;

import java.util.Scanner;

public class Square_root {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER");
		int n=sc.nextInt();
		for (int i=1;i<=n;i++) {
			if(i*i==n) {
				System.out.println("the sqr root is found "+i);
				break;
				}
			else if(i==n)
			{
				System.out.println("the sqr root is not found"+i);
			}
			}
		}
	}
