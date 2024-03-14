package leetCode;

public class RunningSumOf1DArray {

	public static void main(String[] args) {
		
		int nums[] = {1,2,3,4};
		
		int res[] = runningSum(nums);
		
		for(int i : res) {
			System.out.println(i);
		}

	}
	
public static int[] runningSum(int[] nums) {
        
        int result[] = new int[nums.length];
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            result[i] = sum; 
        }
        return result;
    }

}
