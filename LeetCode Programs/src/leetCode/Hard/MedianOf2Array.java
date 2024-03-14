package leetCode.Hard;

public class MedianOf2Array {

	public static void main(String[] args) {

		int[] ar1 = { 1, 2 };
		int[] ar2 = { 3, 4 };

		double res = findMedianSortedArrays(ar1, ar2);

		System.out.print(res);

	}

	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

		int m = nums1.length;
		int n = nums2.length;

		int x = m + n;

		int[] res = new int[x];

		int i = 0, j = 0, k = 0;

		while (i < m && j < n) {
			if (nums1[i] <= nums2[j]) {
				res[k] = nums1[i];
				i++;
			} else {
				res[k] = nums2[j];
				j++;
			}
			k++;
		}

		while (i < m) {
			res[k] = nums1[i];
			i++;
			k++;
		}

		while (j < n) {
			res[k] = nums2[j];
			j++;
			k++;
		}

		if (x % 2 == 0)
			return (float) (res[(x / 2) - 1] + res[x / 2]) / 2;
		else
			return res[x / 2];

	}

}
