import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Array {

	// ArrayLists / HashMap all elements inside must be the same type
	// ArrayList<String> is an arraylist of strings

	// Array vs ArrayList

	// Array is a specific location in memory, you cannot change the size

	// type variableName = new ObjectType
	// ArrayList<Integer> otherArray = new ArrayList<Integer>();

	// int[] myArray = { 3, 2, 1 };

	// String myString = "I really love icecream";

	// String[] stringArray = myString.split(" ");

	// List<String> arrayList = new ArrayList<String>();

	ArrayList<String> fruitList = new ArrayList<String>();

	public Array() {
	}

	public void run() {

		Scanner userInput = new Scanner(System.in);
		
		fruitList.add("Apple");
		fruitList.add("Banana");
		fruitList.add("Grape");


		

		

		
		for (String iterator : fruitList) {
			System.out.println(iterator);
		}
		
		
		
		
		
		
		// System.out.println(otherArray.size());
		// System.out.println();
		// otherArray.add(5);// Add a number from the rear 0
		// otherArray.add(10); // 1
		// otherArray.add(15);// 2
		// otherArray.add(20);// 3
		// otherArray.add(25);// 4
		// otherArray.add(30);// 5

		// System.out.println(otherArray.toString());








		// otherArray.add(0, 3);// Add a number to a specific postion

		// otherArray.remove(3);

		// Collections.reverse(otherArray); // From collections class, passes in a list type

		// System.out.println(otherArray.toString());

		// System.out.println();
		// System.out.println(otherArray.size());
		// System.out.println(otherArray.get(3));
		// System.out.print("[");
		// for (int i = 0; i < stringArray.length; i++) {
		// 	System.out.print(stringArray[i] + ", ");
		// }
		// System.out.print("]");
		// System.out.println();
		// System.out.println();
		// System.out.println();
		// System.out.println();

		// arrayList = Arrays.asList(stringArray);
		

		// System.out.println(arrayList);
		// otherArray.clear();
		// System.out.println(otherArray.size());

	}

}
