package nikhiljava;

import java.util.Scanner;

public class Tech_Number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE N NUMBER");
		int n=sc.nextInt();
		int count=0;
		int copy=n;
		while(n>0) {
			n=n/10;
			count++;
		}
		if(count%2==0) {
		count=count/2;
		int div=1;
		for(int i=1;i<=count;i++) {
			div=div*10;
		}
	
		int l=copy%div;
		int f=copy/div;
		//System.out.println(l+" "+f);
		int n1=l+f;
		int sq=n1*n1;
		System.out.println(sq);
		if(copy==sq) {
			System.out.println("the given  number is the Tech Number"+copy+"=="+sq);
		}
		else {
			System.out.println("the given number is not a Tech Number"+copy+"!="+sq);
		}
		}

	}

}
