package leetCode;

public class SquareRoot {

	public static void main(String[] args) {
		
		int x = 4;
		
		int sqrt = mySqrt(x);
		System.out.println(sqrt);

	}
	
	 public static int mySqrt(int x) {
	        
	        int left = 1;
	        int right = x;

	        while(left <= right) {
	            int mid = (left + right) / 2;

	            if(x / mid == mid){
	                return mid;
	            } else if(mid > x / mid){
	                right = mid - 1;
	            } else {
	                left = mid + 1;
	            }
	        }

	        return right;
	    }

}
