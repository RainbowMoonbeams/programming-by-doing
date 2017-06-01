import java.util.Scanner;

public class ADumbCalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Make a simple numeric calculator. It should prompt the user for three numbers.
		// Then add the numbers together and divide by 2. 
		// Display the result. 
		// Your program must support numbers with decimals and not just integers.
		
		System.out.println("I'll ask you for three numbers. The numbers may contain decimals.");
		System.out.println("First number:");
		double firstNumber = input.nextDouble();
		
		System.out.println("Second number:");
		double secondNumber = input.nextDouble();
		
		System.out.println("Third number:");
		double thirdNumber = input.nextDouble();
		
		double sum = firstNumber + secondNumber + thirdNumber;
		double half = sum / 2;
		
		System.out.println("The sum of the three numbers is: " + sum + " And divided by 2 is: " + half);
	}

}
