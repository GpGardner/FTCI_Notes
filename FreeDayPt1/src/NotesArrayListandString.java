import java.util.ArrayList;
import java.util.List;

public class NotesArrayListandString {

	public NotesArrayListandString() {
	}
	

	public void run(){
		//
		// String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		// int[] nums = {1,2,3,4,5};

		// cars[0] = "Opel";

		// cars[3] = "Ferrari";

		// System.out.println(cars.length);

		// for (String car : cars) {
		// System.out.println(car);
		// }

		// int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
		// int x = myNumbers[0][2];
		// System.out.println(x); // Outputs 7

		// for (int[] firstArr : myNumbers) {
		// for (int numbers : firstArr) {
		// System.out.println(numbers);
		// }
		// }

		// Creating a list
		List<Integer> listOne = new ArrayList<Integer>();
		List<Integer> listTwo = new ArrayList<Integer>();

		// Adds 1 at 0 index
		// listOne.add(0, 1);

		// // Adds 2 at 1 index
		// listOne.add(1, 2);
		// listOne.add(1, 5);
		// // System.out.println(listOne);
		// // System.out.println("-----------------\n");
		// // Creating another list
		// System.out.println("line 44 : " + listOne);

		// listOne.add(1);
		// listOne.add(2);
		// listOne.add(3);
		// System.out.println("line 48 : " + listOne);
		// System.out.println("-----------------\n");

		// // Will add list l2 from 1 index
		// listOne.addAll(1, listTwo);
		// System.out.println(listOne);
		// System.out.println("-----------------\n");

		// // Removes element from index 1
		// listOne.remove(1);
		// System.out.println(listOne);
		// System.out.println("-----------------\n");

		// // Prints element at index 3
		// System.out.println(listOne.get(3));
		// System.out.println("-----------------\n");

		// // Replace 0th element with 5
		// listOne.set(0, 5);
		// System.out.println(listOne);
		// System.out.println("-----------------\n");

		// listOne.add(1);
		// listTwo.add(1);

		// System.out.println("line 71 : " + listOne.equals(listTwo));


		String a = "aaaaaa";
		String newA = a.replace("a", "b");
		System.out.println(newA);
		System.out.println(a);
	}

}
