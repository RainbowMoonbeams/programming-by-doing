import java.util.Scanner;

public class MoreUserInput {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Ask the user for several pieces of information, and display them on the
		// screen afterward as a summary.
		// first name
		// last name
		// grade (classification)
		// student id number
		// login name
		// GPA (0.0 to 4.0)
		// You must use the most appropriate type for each variable and not just Strings
		// for everything.

		System.out.println("First name please:");
		String nameFirst = input.nextLine();

		System.out.println("Last name please:");
		String nameLast = input.nextLine();

		// return a String to account for "th" at the end of grades
		System.out.println("Which grade are you in?");
		String gradeLevel = input.nextLine();

		System.out.println("What's your student ID number?");
		String studentId = input.next();

		System.out.println("What is your login name?");
		String loginName = input.next();

		System.out.println("What is your GPA?");
		double gpa = input.nextDouble();

		// return in the following order:
		// login name
		// student id number
		// name: last, first
		// gpa
		// grade

		System.out.println("Making sure I got this right:");
		System.out.println("Login Name: " + loginName);
		System.out.println("Student ID number: " + studentId);
		System.out.println("Name: " + nameLast + ", " + nameFirst);
		System.out.println("GPA: " + gpa);
		System.out.println("Grade level: " + gradeLevel);

	}

}
