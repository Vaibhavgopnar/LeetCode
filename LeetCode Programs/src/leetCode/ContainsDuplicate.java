package leetCode;

import java.util.Arrays;
import java.util.HashMap;

public class ContainsDuplicate {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 1 };

		boolean fl = containsDuplicate(arr);
		System.out.println(fl);

	}

	public static boolean containsDuplicate(int[] nums) {

		Arrays.sort(nums);

//		boolean flag = false;
//		for (int i = 0; i < nums.length; i++) {
//			int num = nums[i];
//
//			for (int j = i + 1; j < nums.length; j++) {
//				if (num == nums[j]) {
//					flag = true;
//					break;
//				}
//			}
//			if (flag == true)
//				break;
//		}
//
//		for (int i = 0; i < nums.length - 1; i++) {
//			if (nums[i] == nums[i + 1]) {
//				return true;
//			}
//		}

        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return true;
            }
            map.put(nums[i],1);
        }
		return false;
	}

}
