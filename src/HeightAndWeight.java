import java.util.Scanner;

public class HeightAndWeight {
	
	public static void main( String[] args )	{
		Scanner keyboard = new Scanner(System.in);

		int age;
		String heightFeet;
		String heightInches;
		double weight;

		System.out.print( "How old are you? " );
		age = keyboard.nextInt();

		System.out.print( "How many feet tall are you? " );
		heightFeet = keyboard.next();

		System.out.print( "Any how many inches? " );
		heightInches = keyboard.next();
		
		System.out.print( "How much do you weigh? " );
		weight = keyboard.nextDouble();

		System.out.println( "So you're " + age + " old, " + heightFeet + "\'" + heightInches + "\""  + " tall and weigh " + weight + " lbs." );
	}
}