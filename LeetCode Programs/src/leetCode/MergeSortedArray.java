package leetCode;

public class MergeSortedArray {

	public static void main(String[] args) {
		
		int  nums1[] = {1,2,3,0,0,0};
		int m = 3;
		
		int nums2[] = {2,5,6};
		int n = 3;

		merge(nums1, m, nums2, n);
	}
	
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int len = m+n;
        int[] res = new int[len];

        int i = 0; 
        int j = 0; 
        int k = 0;

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

        for (int l = 0; l < res.length; l++) {
            nums1[l] = res[l];
            System.out.println(res[l]);
        }
    }

}
