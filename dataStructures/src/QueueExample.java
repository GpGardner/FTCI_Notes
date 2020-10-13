import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	Queue<Integer> q = new LinkedList<Integer>();

	public void run() {
		for (int i = 5; i < 10; i++) {

			q.add(i);

		}

		System.out.println("Elements of queue-" + q);

		int removedHead = q.remove();

		


	}

}
