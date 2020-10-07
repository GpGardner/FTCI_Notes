import java.util.Scanner;

public class MadLib {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter your age");
		int age = Integer.parseInt(input.nextLine());
		if (age > 18) {
			
			System.out.println("Whats their name");
			String name = input.nextLine();
			System.out.println("enter and adverb");
			String adverb = input.nextLine();
			System.out.println("enter and adjective");
			String adjective = input.nextLine();
			System.out.println("enter and noun");
			String noun = input.nextLine();
			System.out.println("enter and noun");
			String nounTwo = input.nextLine();
			System.out.println("enter and number");
			String number = input.nextLine();
			System.out.println("enter your name");
			String yourName = input.nextLine();
			
			System.out.printf(
					"Dear %s,\nYou are %s %s and I want to be your %s!\nI want to go to the %s with you in %s days.\nSincerely, %s",
					name, adverb, adjective, noun, nounTwo, number, yourName);
		}

		input.close();

	}
}
