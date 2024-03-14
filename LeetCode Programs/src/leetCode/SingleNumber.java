package leetCode;

import java.util.Arrays;

public class SingleNumber {

	public static void main(String[] args) {

		int nums[] = { 2, 2, 1 };

		int single = singleNumber(nums);
		System.out.println(single);
	}

	public static int singleNumber(int[] nums) {

		Arrays.sort(nums);

		if (nums.length == 1) {
			return nums[0];
		}

		for (int i = 0; i < nums.length - 1; i += 2) {
			if (nums[i] != nums[i + 1]) {
				return nums[i];
			}
		}
		return nums[nums.length - 1];
	}

}
