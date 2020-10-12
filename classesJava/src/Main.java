import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Bike bike = new Bike("Orange", 2, 8);
		Bike bike = new Bike("Purple", 2, 16, true);
		Bike bikeTwo = new Bike("Blue", 2, 10, false);
		// bike.color = "blue"; directly modify property BAD

		// bike.paintBike("gold");


		// System.out.println("\nThe bike color is: " + bike.getColor() );

		System.out.println(bike.toString());
		System.out.println(bikeTwo.toString());

		System.out.println(bike.getColor());



		// bike.getCurrentGear();
		// bike.getCurrentSpeed();

		// bike.changeGear(2);
		// bike.changeSpeed(5);


		// bike.getCurrentGear();
		// bike.getCurrentSpeed();










		// Scanner scanner = new Scanner(System.in); //Instantiate scanner
		// System.out.println("How big is the banana?"); //ask question
		// String bananaSize = scanner.nextLine(); //set variable = to scanner.nextLine() which is next input
		// System.out.println("What color is the banana"); //ask question
		// String bananaColor = scanner.nextLine(); //set variable = to scanner.nextLine() which is next input

		// // int number = Integer.parseInt(scanner.nextLine());  convert an input to an int

		// Banana banana = new Banana(bananaSize, bananaColor); //Instantiate



		// 	System.out.println(banana.color);
		// 	System.out.println(banana.size);
		// 	System.out.println(banana.type);
		// 	System.out.println(banana.ripe);















		// System.out.println("What color is the bike?");
		// String color = scanner.nextLine();
		// System.out.println("How many wheels does the bike have?");
		// int wheel = Integer.parseInt(scanner.nextLine());
		// System.out.println("How many gears does the bike have?");
		// int gears = Integer.parseInt(scanner.nextLine());

		// Bike huffy = new Bike(color, wheel, gears, true); // <----- instantiate 
		// Bike schwinn = new Bike("blue", 2, 8, false);
		
		// Unicycle honda = new Unicycle("silver","honda", 36);

		// System.out.println(huffy.color);
		// System.out.println(huffy.wheels);
		// System.out.println(huffy.gears);
		// System.out.println(huffy.bell);

		// System.out.println("\n------------------\n");

		// System.out.println(schwinn.color);
		// System.out.println(schwinn.wheels);
		// System.out.println(schwinn.gears);
		// System.out.println(schwinn.bell);


		// System.out.println("\n------------------\n");

		// System.out.println("The color of our unicycle is: " + honda.color);
		// System.out.println(honda.brand);
		// System.out.println(honda.height);


	}

}
