import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	// Create a HashMap with keys “Name”, “Age”, “Hometown” and “Favorite Food”.
	// Ask the user for the values!
	// Iterate through the Hash and introduce this person:
	// “This is _____,
	// They are ___-years-old,
	// from ________,
	// and their favorite food is _________.”

	Map<String, String> preferences = new HashMap<>();

	public void run() {

		preferences.put("Name", "George");
		preferences.put("Age", "29");
		preferences.put("Hometown", "Altoona");
		preferences.put("FavFood", "Pizza");

		System.out.println("George: ");
		System.out.printf("This is %s\n", preferences.get("Name"));
		System.out.printf("They are %s - years old\n", preferences.get("Age"));
		System.out.printf("from %s\n", preferences.get("Hometown"));
		System.out.printf("and their favorite food is %s\n", preferences.get("FavFood"));
	}

}
