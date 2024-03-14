package leetCode;

public class PlusOne {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3};
		
		int res[] = plusOne(arr);
		
		for(int e : res) {
			System.out.print(e);
		}

	}
	
public static int[] plusOne(int[] digits) {
        
        for (int i = digits.length - 1; i >= 0; i--) {
	        if (digits[i] < 9) {
		        digits[i]++;
		        return digits;
	        }
	        digits[i] = 0;
        }
        if(digits[0] == 0){
            int res[] = new int[digits.length + 1];
            res[0] = 1;
            return res;
        }
        return digits;
    }

}
