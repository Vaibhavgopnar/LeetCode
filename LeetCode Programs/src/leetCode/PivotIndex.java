package leetCode;

public class PivotIndex {

	public static void main(String[] args) {
		
		int nums[] = {1,7,3,6,5,6};
		
		int index = pivotIndex(nums);
		System.out.println(index);
	}
	
	public static int pivotIndex(int[] nums) {
        
        int l = nums.length;
        int leftsum, rightsum;

        for(int i = 0; i < l; ++i){

            leftsum = 0;
            rightsum = 0;

            for(int j = 0; j < i; j++){
                leftsum += nums[j];              
            }
            for(int k = i + 1; k < l; k++){
                rightsum += nums[k];              
            }
            
            if(leftsum == rightsum){
               return i;
            }
              
        }

        return -1;
    }

}
