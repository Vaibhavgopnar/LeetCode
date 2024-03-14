package leetCode;

public class PalindromNumber {

	public static void main(String[] args) {
		
		int x = 121;
		
		boolean isPal = isPalindrome(x);
		System.out.println(isPal);

	}
	
public static boolean isPalindrome(int x) {
        
        int rem = 0;
        int temp = x;
        int res = 0;

        if(x < 0)
            return false;
            
        while(x != 0){
            rem = x % 10;
            res = res * 10 + rem;
            x = x / 10;
        }

        if(temp == res){
            return true;
        }
        else
            return false;
    }

}
