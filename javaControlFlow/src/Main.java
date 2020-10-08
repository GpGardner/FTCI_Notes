import java.util.Random;

// This file is meant to run our method from creating a new method file

public class Main {

	public static void main(String[] args) {

		// CreatingANewMethod variable = new CreatingANewMethod();

		// variable.printShirtSize('S');

		// variable.count(20);


		// int[] simpleArray = { 1,2,3,4,5 };

		// String[] newArr = {"George", "Neil", "Joseph", "Marvin"};
		//regular for loop
		// for (int i = 0; i < simpleArray.length; i++) {
			
		// 	System.out.println(simpleArray[i]);

		// }

		// System.out.println(newArr[3]);


		//ENHANCED for loop
		// for (int num : simpleArray) {

		// 	System.out.println("Current Num " + num);
			
		// }


		//while loop
		// int iterator = 15;


		// while (iterator > 0 ) {
			
		// 	System.out.println(iterator);
		// 	iterator--;

		// 	// logic

		// 	// do you want to conitune
		// 	// conitune = no
		// }	

		// do {
		// 	System.out.println("Im running");
		// 	iterator++;
		// } while (iterator < 20);



			//Key Words- Break, Continue, Return

			Random random = new Random();


			int breakPoint = random.nextInt(100);

			for (int i = 1; i <= 5; i++) {

				System.out.println("Beginning loop: "+i);

				for (int j = 0; j < 100; j++) {

					if (j==breakPoint) {

						System.out.println("Length of this loop: " +breakPoint);
						break;

					}

					System.out.println("Index is: " +j);
					
				}

				System.out.println("Finished loop: " + i);
				breakPoint = random.nextInt(100);

			}

			System.out.println("Post loop");



			



	}

}
