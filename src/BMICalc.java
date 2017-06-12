import java.util.Scanner;

public class BMICalc {

	public static void main(String[] args) {
		// The body mass index (BMI) is commonly used by health and nutrition
		// professionals to estimate human body fat in populations.

		// It is computed by taking the individual's weight (mass) in kilograms
		// and dividing it by the square of their height in meters.

		double bmi;

		Scanner input = new Scanner(System.in);
		System.out.println("I'll ask you for a few numbers then tell you your Body Mass Index.");

		System.out.println("\nWhat is your weight in lbs?");
		double weightInLbs = input.nextDouble();

		System.out.println("\nWhat is your height in inches?");
		double heightInInches = input.nextDouble();

		bmi = ((weightInLbs / (heightInInches * heightInInches)) * 703);

		System.out.println("\nYour BMI is " + bmi + ".");

	}

}
