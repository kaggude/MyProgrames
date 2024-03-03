package nikhiljava;

import java.util.Scanner;

public class Xylem_number_check2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER");
        int n = sc.nextInt();
        int last = n % 10;
        n = n / 10;
        int sum1 = 0;
        int rev = 0;
        while (n > 0) {
            int d = n % 10;
            rev = rev * 10 + d;
            n = n / 10;
        }
        System.out.println(rev);

        int first = rev % 10;
        int sum = first + last;
        n = rev / 10;
        System.out.println(n);

        while (n > 0) {
            int x = n % 10;
            sum1 = x + sum1; // Fixed: Update the outer sum1 variable
            n = n / 10;
        }
        if (sum1 == sum) { // Fixed: Use sum1 instead of innersum
            System.out.println("the given number is xylem number"); // Fixed typo: "xylem number" instead of "xylo number"
        }
    }
}
