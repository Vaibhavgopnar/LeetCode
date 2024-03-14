package leetCode;

public class MajorityElement {

	public static void main(String[] args) {
		
		int nums[] = {3,4,3};
		
		int me = majorityElement(nums);
		System.out.println(me);

	}
	
	 public static int majorityElement(int[] nums) {
	        
	        int res = nums[0];
	        int count = 1;

	        for(int i = 0; i < nums.length; i++){
	            int num = nums[i];

	            if(res == num)
	                ++count;
	            else
	                --count;

	            if(count == 0){
	                res = num;
	                count = 1;
	            }

	        }
	        return res;
	    }

}
