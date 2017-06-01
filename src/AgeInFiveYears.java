import java.util.Scanner;

public class AgeInFiveYears {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Ask the user for their name. Then display their name to prove that you can recall it. 
		// Ask them for their age. Then display what their age would be five years from now. 
		// Then display what their age would be five years ago.
		
		System.out.println("What is your name?");
		String name = input.nextLine();
		
		System.out.println(name + ", what is your age?");
		int age = input.nextInt();
		
		System.out.println("Did you know that in five years, you'll be " + (age + 5) + "?? Well, math proves that.");
		
		
		System.out.println("And five years ago, you were " + (age - 5) + ". You don't look a day over " + (age -3) + ".");
		
		
		System.out.println("You don't look a day over " + (age -3) + ".");
		
		
		
		
	}

}
