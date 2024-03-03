package nikhiljava;
import java.util.Scanner; // Importing Scanner class for user input
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
public class AutoMorphicNumber { // Declaring a class named AutoMorphicNumber
    public static void main(String[] args) { // Declaring the main method
        Scanner sc = new Scanner(System.in); // Creating a Scanner object to read input
        System.out.println("ENTER THE N NUMBER"); // Prompting the user to enter a number
        int n = sc.nextInt(); // Reading the input number and storing it in variable n
        int sq = n * n; // Calculating the square of the entered number and storing it in variable sq
        while (n > 0) { // Starting a while loop that continues as long as n is greater than 0
            if (n % 10 == sq % 10) { // Checking if the last digit of n is equal to the last digit of sq
                n = n / 10; // Removing the last digit from n
                sq = sq / 10; // Removing the last digit from sq
            } else { // If the last digits are not equal
                break; // Exiting the loop
            }
        }
        if (n == 0) { // Checking if n has become 0 after the loop
            System.out.println("Automatic  Morphic Number " + n); // Printing that the number is an automatic number
        } else { // If n is not 0
            System.out.println("Not a Automatic  Morphic number " + n); // Printing that the number is not an automatic number
        }
    }
}
