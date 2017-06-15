import java.util.Scanner;

public class HowOldAreYou {

	public static void main(String[] args) {
		// Make a program which displays a different message depending on the
		// age given. Here are the possible responses:
		//
		// age is less than 16, say "You can't drive."
		// age is less than 18, say "You can't vote."
		// age is less than 25, say "You can't rent a car."
		// age is 25 or over, say "You can do anything that's legal."
		Scanner input = new Scanner(System.in);

		System.out.println("Hi, what's your name?");
		String name = input.nextLine();

		System.out.println(name + ", how old are you?");
		int age = input.nextInt();

		if (age < 16) {
			System.out.println("You can't legally drive.");
		}
		if (age >= 16 && age <= 24) {
			System.out.println("You can legally drive!");
		}
		if (age < 18) {
			System.out.println("You can't legally vote.");
		}
		if (age >= 18 && age <= 24) {
			System.out.println("You can legally vote!");
		}
		if (age < 25) {
			System.out.println("You can't legally rent a car.");
		}
		if (age >= 25) {
			System.out.println("You can do anything that's legal - that includes driving, voting, and renting a car. Enjoy!");
		}

	}

}
