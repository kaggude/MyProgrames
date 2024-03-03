package nikhiljava;

import java.util.Scanner;

public class Even_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER FOR CHECK THE GIVE NUMBER IS EVEN NUMBER IS O NOT");
		int n=sc.nextInt();
		for (int i=1;i<=n;i++) {
			System.out.println("START LOOP \n");
		if(i%2==0) {
			System.out.println("THE GIVEN NUMBER IS EVEN NUMBER " +i+ "%" +2+ "==" +0+ "_CONDITION IS TRUE REMINDER OF MODULES IS COMING 0 \n"+i);
		}
		else {
			System.out.println("THE GIVEN NUMBER IS NOT AN EVEN NUMBER "+i+"%"+2+"=="+0+ "_CONDITION IS FALSE REMINDER OF MODULES IS COMING  0 \n"+i);
			
			System.out.println("END  LOOP \n");
		}
		if(n>n-1) {
			System.out.println("loop will be  going to terminate after these Iteration i++  and Execution will be stop here\n "+i);
		}
		}
		}
		
	}
