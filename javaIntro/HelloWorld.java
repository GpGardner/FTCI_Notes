
/**
 * HelloWorld
 */
import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// String firstName = "George";
		// String lastName = "Gardner";
		// System.out.println("Hello, World!!");
		// System.out.println("Today is awesome!");
		// System.out.printf("Hello %s!\n", firstName);
		// System.out.printf("Goodbye %s %s!\n", firstName, lastName);
		Scanner input = new Scanner(System.in);
		System.out.println("Whats your name, pal?");
		String firstName = input.nextLine();
		System.out.printf("Hello %s!\n", firstName);
		System.out.println("Ok whats your last name?");
		String lastName = input.nextLine();
		System.out.printf("Oh your last name is %s, eh %s!\n", lastName, firstName);
		input.close();


	}
}