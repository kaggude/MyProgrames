package nikhiljava;

import java.util.Scanner;

public class Nth_Prime_Number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the target value ");
		int t=sc.nextInt();
		int count1=0;
			for(int i=1;count1<t;i++) {
				int n=i;
				int count=0;
				for(int j=1;j<=n;j++) {
					if(n%j==0){
						count++;
					}
				}
				if(count==2) {
					count1++;
				}
				if(count1==t) {
					System.out.println(i);
				}
			}
	}

}
