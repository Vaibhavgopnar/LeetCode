package leetCode;

public class RomanToInteger {

	public static void main(String[] args) {
		
		String s = "IIV";
		
		int num = romanToInt(s);
		System.out.println(num);
	}
	
	public static int romanToInt(String s) {
        
	       int num = 0;
			int ans = 0;

			if (s.length() == 0)
				return 0;

			for (int i = s.length() - 1; i >= 0; i--) {

				if (s.charAt(i) == 'I') {
					num = 1;
				}
				if (s.charAt(i) == 'V') {
					num = 5;
				}
				if (s.charAt(i) == 'X') {
					num = 10;
				}
				if (s.charAt(i) == 'L') {
					num = 50;
				}
				if (s.charAt(i) == 'C') {
					num = 100;
				}
				if (s.charAt(i) == 'D') {
					num = 500;
				}
				if (s.charAt(i) == 'M') {
					num = 1000;
				}

				if (4 * num < ans)
					ans -= num;
				else
					ans += num;
			}

			return ans;
	    }

}
