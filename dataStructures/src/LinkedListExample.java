import java.util.LinkedList;

public class LinkedListExample {

	LinkedList<String> animalList = new LinkedList<String>();

	public void run() {
		animalList.add("frog");
		animalList.add("giraffe");
		animalList.add("buffalo");
		animalList.add("mongoose");

		System.out.println(animalList);

		animalList.addFirst("shark");

		System.out.println(animalList);

		animalList.addLast("koala");

		System.out.println(animalList);

		animalList.add(3, "cuttlefish");

		System.out.println(animalList);

		animalList.remove(3);
		// Removes the element that is at the 3rd index of the LinkedList
		animalList.remove("piranha");
		// Removes the first instance of "piranha" in the LinkedList

		animalList.removeFirst();
		// Removes the first element of the LinkedList
		animalList.removeLast();
		// Removes the last elements of the LinkedList

		animalList.contains("giraffe");
		// Returns `true` if "giraffe" is present in the LinkedList

		animalList.size();
		// Returns an integer denoting the size of the LinkedList

		animalList.get(3);
		// Returns the value located at the 3rd index of the LinkedList
		animalList.set(3, "emu");
		// Sets the value at index 4 to "emu"
		System.out.println(animalList);
		// => [frog, giraffe, buffalo, emu]

	}

}
