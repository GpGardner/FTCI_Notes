import java.util.Stack;

public class StackExample {

	Stack<Integer> myStack = new Stack<Integer>();

	public void run() {

		myStack.push(1);
		// Pushes 1 to the top of our stack
		// myStack now consists of [1]
		myStack.push(2);
		// myStack now consists of [1, 2]
		myStack.push(3);
		// myStack now consists of [1, 2, 3]

		System.out.println(myStack.peek());
	}
}
