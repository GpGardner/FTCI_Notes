/**
 * CreatingANewMethod
 */
public class CreatingANewMethod {

	String property = "George";



	public void count(int number){

		for (int i = 1; i <= number; i+=2) {



			System.out.println("The number was: "+i);



			
		}
		
		System.out.println("The loop ended");

	}



	public void printShirtSize(char variableName) {
		String msg = "";
		switch (variableName) {
			case 's':
			case 'S':
				msg = "Shirt is small";
				break;
			case 'm':
			case 'M':
				msg = "Shirt is medium";
				break;
			case 'l':
			case 'L':
			case 'x':
			case 'X':
				msg = "Shirt is big";
				break;
			default:
				msg= "sorry we couldnt find that size";
		}
		System.out.println(msg);
	}

	public void sayHello(){
		System.out.println("Hello there");
	}

}