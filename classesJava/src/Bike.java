public class Bike {


//PROPERTIES
	private String color;

	private int wheels;

	private int gears;

	private boolean bell;

	private int currentGear = 1;

	private int currentSpeed = 0;



	//CONSTRUCTOR
	public Bike(String color, int wheels, int gears){
		this.color = color;
		this.wheels = wheels;
		this.gears = gears;
	}

	//OVERLOADED CONSTRUCTOR
	public Bike(String c, int w, int g, boolean b){
		this.color = c;
		this.wheels = w;
		this.gears = g;
		this.bell = b;
	}


	//METHODS

	//method declaration
		//availability - public or private or protected
		//return type - void
		//method name - changeGear


		//set methods - sets a property
	public void changeGear(int gearSelection){
		System.out.println("\nThe bike is now in gear " + gearSelection);
		this.currentGear = gearSelection;
	}

	public void changeSpeed(int accelerationRate){
		System.out.printf("\nThe bike speeds up from %s to %s", currentSpeed, accelerationRate);
		this.currentSpeed = this.calculateNewSpeed(currentSpeed, accelerationRate);
	}



	//get methods - get the information from the classes properties
	public void getCurrentSpeed(){
		System.out.println("\nCurrent speed is " + currentSpeed);
	}

	public void getCurrentGear(){
		System.out.println("\nCurrent gear is " + currentGear);
	}

	public String getColor(){
		return this.color;
	}

	public void paintBike(String color){
		System.out.println("The color of the bike is now " + color);
		this.color = color;
	}

	@Override
	public String toString(){
		String result = String.format("\nColor: %s\nWheels: %s\nGears: %s\nHasBell: %s\n", this.color, this.wheels, this.gears, this.bell);
		return result;
	}

	private int calculateNewSpeed(int currentSpeed, int accelerationRate){
		return currentSpeed + accelerationRate;
	}






	
}
