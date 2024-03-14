package leetCode.Medium;

import java.util.ArrayList;
import java.util.List;

public class PermutationsOfArray {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3 };
		List<List<Integer>> l = permute(arr);
		System.out.print(l);
	}

	public static List<List<Integer>> permute(int[] nums) {

		List<List<Integer>> result = new ArrayList<>();
		List<Integer> temp = new ArrayList<Integer>();

		int r = nums.length;

		for (int i = 1; i <= r; i++) {
			for (int j = 1; j <= r; j++) {
				for (int k = 1; k <= r; k++) {
					if (i != j && j != k && i != k) {

						temp.add(i);
						temp.add(j);
						temp.add(k);
						
						break;
					}

				}
				

			}
			

		}
		result.add(temp);
		return result;
	}

}
