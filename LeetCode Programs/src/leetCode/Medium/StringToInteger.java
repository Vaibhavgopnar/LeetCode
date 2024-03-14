package leetCode.Medium;

public class StringToInteger {

	public static void main(String[] args) {

		String s = "42";

		int i = myAtoi(s);
		System.out.println(i);

	}

	public static int myAtoi(String s) {

		long res = 0;
		s = s.trim();

		if (s.length() == 0)
			return 0;

		// for (int i = 0; i < s.length(); ++i){
		// if(s.charAt(i) == ' ' || s.charAt(i) == '-' || s.charAt(i) == '+'){
		// continue;
		// }
		// else if(s.charAt(i) > '9' || s.charAt(i) < '0'){
		// break;
		// }
		// else{
		// if(res < Integer.MIN_VALUE || res > Integer.MAX_VALUE){
		// break;
		// }
		// res = res * 10 + s.charAt(i) - '0';
		// }

		// }

		// if(s.contains("-")){
		// return -res;
		// }
		// if(res < Integer.MIN_VALUE)
		// return Integer.MIN_VALUE;
		// if(res > Integer.MAX_VALUE)
		// return Integer.MAX_VALUE;

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (i == 0 && (ch == '-' || ch == '+')) {
				continue;
			} else if (ch > '9' || ch < '0') {
				break;
			} else if (ch == ' ') {
				continue;
			} else {
				if (res < Integer.MIN_VALUE || res > Integer.MAX_VALUE) {
					break;
				}

				res = (res * 10) + (ch - '0');
			}
		}

		if (s.charAt(0) == '-') {
			res = -res;
		}

		if (res < Integer.MIN_VALUE || res > Integer.MAX_VALUE) {
			return res < Integer.MIN_VALUE ? Integer.MIN_VALUE : Integer.MAX_VALUE;
		}

		return (int) res;

	}

}
