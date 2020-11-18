import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayProblem {

	// Given the array nums consisting of 2n elements in the form
	// [x1,x2,...,xn,y1,y2,...,yn].

	// Return the array in the form [x1,y1,x2,y2,...,xn,yn].

	public void run() {
		int[] nums = { 1, 2, 3, 4, 4, 3, 2, 1 };

		int n = 4;
		boolean flip = true;

		List<Integer> answer = new ArrayList<>();

		int[] firstHalf = Arrays.copyOfRange(nums, 0, n), 
					secondHalf = Arrays.copyOfRange(nums, n, nums.length);

		int i1 = 0;
		int i2 = 0;
		while (answer.size() <= n * 2 - 1) {

			if (flip) {
				answer.add(firstHalf[i1]);
				i1++;
				flip = false;
			} else {
				answer.add(secondHalf[i2]);
				i2++;
				flip = true;
			}
		}

		System.out.println(answer.toArray());

	}

}
