
public class NoticingEvenNumbers {

	public static void main(String[] args) {
		// Write a program that uses a for loop to display all the numbers from
		// 1 to 20, marking those which are even (divisible by two). It should
		// use modulus by 2: if the remainder is zero, it's divisible by 2.
		//
		// This means you'll need an if statement inside the loop.

		int number = 1;

		System.out.println("Printing numbers 1-20. Pointing at the even numbers and ~ at the odd numbers.");

		do {

			if (number % 2 == 0) {
				System.out.println(number + " <");
			}
			if (number % 2 == 1) {
				System.out.println(number + " ~");
			}
			number++;

		} while (number <= 20);

	}

}
