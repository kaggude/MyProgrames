package nikhiljava;

import java.util.Scanner;
/* The program starts by creating a Scanner object to read input from the user.

It prompts the user to enter a number (n) and reads the input.

It calculates the square of the entered number and stores it in the variable sq.

The program enters a while loop that continues as long as n is greater than 0.

Inside the loop, it checks if the last digit of n is equal to the last digit of sq.
 If they are equal, it removes the last digit from both n and sq by dividing them by 10. If not, it breaks out of the loop.

After the loop, it checks if n has become 0. If it has, it means all digits matched, so it prints that the number is an automatic number. Otherwise,
 it prints that the number is not an automatic number.

The program ends.
 * */
public class Auto_Morphic_Num {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE N NUMBER");
		int n=sc.nextInt();
		int sq=n*n;
		int copy=n;
		while(n>0) {
			if(n%10==sq%10) {
				n=n/10;
				sq=sq/10;
			}
			else {
				break;
			}}
			if(n==0) {
				System.out.println("Automatic  Morphic Number "+copy);
			}
			else {
				System.out.println("Not a Automatic  Morphic number "+copy);
			}
		}

	}