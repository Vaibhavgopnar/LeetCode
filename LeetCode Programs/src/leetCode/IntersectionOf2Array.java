package leetCode;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOf2Array {

	public static void main(String[] args) {

		int[] arr1 = {4,9,5};
		int[] arr2 = {9,4,9,8,4};
		
		int[] res = intersection(arr1,arr2);
		
		for(int i : res) {
			System.out.println(i);
		}
	}

	public static int[] intersection(int[] nums1, int[] nums2) {

		Set<Integer> st1 = new HashSet<>();
		for (int i : nums1) {
			st1.add(i);
		}
		
		Set<Integer> st2 = new HashSet<>();
		for (int i : nums2) {
			st2.add(i);
		}
		
		Set<Integer> st3 = new HashSet<>();
		for (Integer i : st1) {
			if(st2.contains(i)) {
				st3.add(i);
			}
		}
		
		int[] res = new int[st3.size()];
		
		int j = 0;
		for(Integer i : st3) {
			res[j] = i.intValue();
			j++;
		}

		return res;
	}

}
