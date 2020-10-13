import java.util.ArrayList;
import java.util.Scanner;

public class Animal {
	/*
	 * Create an ArrayList of animals... Use for loop to iterate through and print
	 * out the contents of your ArrayList. Set an animal as your “favorite”, if your
	 * favorite animal is in the array list, print to the screen: “I love [that
	 * animal]!“; if it’s not in there, print to screen: “No, I don’t care for
	 * those.” What would be a way of doing this without using the for loop?
	 */

	ArrayList<String> animals = new ArrayList<String>();

	String favAnimal;

	public void run() {

		Scanner userInput = new Scanner(System.in);
		System.out.println("Whats your fav animal");
		favAnimal = userInput.nextLine();

		animals.add("pig");
		animals.add("horse");
		animals.add("chicken");
		animals.add("cow");
		animals.add("coyote");

		System.out.println(animals);

		// Enhanced For Loop
		// for each animal in animals
		// for (String animal : animals) {

		// System.out.println();
		// if (animal.equals(favAnimal)) {
		// System.out.println(animal + " is my favorite animal!");
		// } else {
		// System.out.println(animal + " is not my favorite animal.");
		// }

		// System.out.println();
		// }

		for (int i = 0; i < animals.size(); i++) {

			System.out.println();
			if (animals.get(i).equals(favAnimal)) {
				System.out.println(animals.get(i) + " is my favorite animal!");
			} else {
				System.out.println(animals.get(i) + " is not my favorite animal.");
			}

		}

	}

}
