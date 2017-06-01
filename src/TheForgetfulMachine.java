import java.util.Scanner;

public class TheForgetfulMachine {

	public static void main(String[] args) {
		// Ask the user for their name. Then display their name to prove that you can recall it.
		// Ask them for their age. Then display that.
		// Finally, ask them for how much they make and display that.
		// You should use the most appropriate data type for each variable.

		Scanner input = new Scanner(System.in);
		
		System.out.println("Hey what's your name?");
		String name = input.nextLine();
		
		System.out.println("Hi, " + name + "! How young are ya?");
		int age = input.nextInt();
		
		System.out.println(age + " is pretty young, isn't it. Now let me ask you: how much do you make?");
		double salary = input.nextDouble();
		
		System.out.println("Wow " + salary + " is a lot of dinero for someone as young as you!");
		

	}

}
