package leetCode;

public class RemoveElements {

	public static void main(String[] args) {

		int[] arr = { 3, 2, 2, 3 };
		int target = 3;

		int num = removeElement(arr, target);
		System.out.println(num);
	}

	public static int removeElement(int[] nums, int val) {

		int i = 0;
		for (int j = 0; j < nums.length; j++) {
			if (nums[j] != val) {
				int temp = nums[i];
				nums[i] = nums[j];
				nums[j] = temp;
				i++;
			}
		}
		return i;
	}

}
