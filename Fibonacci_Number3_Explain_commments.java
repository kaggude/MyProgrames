package nikhiljava; // Package declaration for the Java file

import java.util.Scanner; // Importing the Scanner class from java.util package

public class Fibonacci_Number3_Explain_commments { // Declaration of a public class named Fibonacci_Number

    public static void main(String[] args) { // Main method, entry point of the program
        Scanner sc=new Scanner(System.in); // Creating a Scanner object for user input
        System.out.println("ENTER THE  TARGET NUMBER"); // Prompting user to enter the target number
        int target=sc.nextInt(); // Reading the target number entered by the user
        int a=0; // Initializing the first Fibonacci number
        int b=1; // Initializing the second Fibonacci number
        int c=0; // Temporary variable to hold the sum of the previous two numbers
        for(int i=1;i<=target;i++) { // Loop to calculate Fibonacci numbers up to the target
            c=a+b; // Calculating the next Fibonacci number by summing the previous two
            a=b; // Updating the value of the first Fibonacci number
            b=c; // Updating the value of the second Fibonacci number
        }
        System.out.println(a); // Printing the last calculated Fibonacci number
 
    }
    
}
