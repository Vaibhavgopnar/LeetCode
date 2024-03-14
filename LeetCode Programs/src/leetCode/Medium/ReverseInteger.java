package leetCode.Medium;

public class ReverseInteger {

	public static void main(String[] args) {

		int n = 123;
		
		int r = reverse(n);
		System.out.println(r);
	}

	public static int reverse(int x) {

		// int rem = 0;
		// int res = 0;

		// while(x != 0){
		// rem = x % 10;
		// res = (res * 10) + rem;

		// x = x / 10;

		// if((res > Integer.MAX_VALUE && x!=0) || (res < Integer.MIN_VALUE &&
		// x!=0)){

		// return 0;
		// }
		// }
		// return res;

		int y, sum = 0;
		while (x != 0) {
			y = x % 10;
			sum = sum * 10 + y;
			x = x / 10;

			if ((sum < (-214748364) && x != 0) || (sum > 214748364 && x != 0)) {
				return 0;
			}

		}
		return sum;
	}

}
