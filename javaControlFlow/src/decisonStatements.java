public class decisonStatements {
	public static void main(String[] args) {
		if (5 < 10) {
			System.out.println("first if");
			if (20 > 100) {
				System.out.println("second if");
				if (6 < 20) {
					System.out.println("third if");

				}
			} else if (1 < 2) {
				System.out.println("2nd if was false");
			} else {
				System.out.println("this wont run");
			}
		}
	}

}
