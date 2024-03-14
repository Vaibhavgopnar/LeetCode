package leetCode;

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {

		int arr[] = {0,0,1,1,1,2,2,3,3,4};

		int num = removeDuplicates(arr);
		System.out.println(num);
	}

	public static int removeDuplicates(int[] nums) {

		int k = 1;

		if (nums.length == 0)
			return 0;

		for (int i = 0; i < nums.length - 1; i++) {

			if (nums[i] != nums[i + 1]) {
				nums[k++] = nums[i + 1];
			}
		}

		return k;
	}

}
