import java.util.Scanner;

public class ReverseApp {

	public static void main(String[] args) {
		
		int value;  // user inputs values to be reversed 
		int reverse; // declare variable to be printed 
		
		
		Scanner input = new Scanner(System.in); // creating scanner object 
		
		System.out.println("Enter Numbers Here"); // prompt user to enter numbers 
		
        value = input.nextInt(); // take user's input and set to value 
		
		 
		
		while (value > 0)  // keep looping numbers that are greater than zero
		{

			reverse = value %10;  // use modulus to store the remainder into the variable
			
			System.out.print(reverse);  // print out variable declared as "reverse" 
			value = value / 10 ; // store the quotient without the remainder because "int" only shows whole numbers 
			
			
		}
	}	



}
