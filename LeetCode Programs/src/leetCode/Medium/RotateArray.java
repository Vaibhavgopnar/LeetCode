package leetCode.Medium;

public class RotateArray {

	public static void main(String[] args) {

		int nums[] = {1,2,3,4,5,6,7};
				
		int k = 3;
		
		rotate(nums, k);
	}

	public static void rotate(int[] nums, int k) {
		
		int[] temp = new int[nums.length];
		int len = nums.length;

		// for(int i = 1; i <= k; i++){
		// int end = nums[len-1];
		// for(int j = len-1; j > 0; j--){
		// nums[j] = nums[j-1];
		// }

		// nums[0] = end;
		// }
		// System.out.print(Arrays.toString(temp));

		if (k >= len)
			k = k % len;

		for (int i = 0; i < k; i++) {
			temp[i] = nums[len - k + i];
		}
		for (int j = 0; j < len - k; j++) {
			temp[j + k] = nums[j];
		}
		for (int i = 0; i < len; i++) {
			nums[i] = temp[i];
			System.out.println(temp[i]);
		}
	}

}
