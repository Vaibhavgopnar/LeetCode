package leetCode;

import java.util.HashSet;
import java.util.Set;

public class IsHappy {

	public static void main(String[] args) {

		int n = 19;
		boolean flag = isHappy(n);
		System.out.println(flag);
	}

	public static boolean isHappy(int n) {

		Set<Integer> s = new HashSet<>();
        while (n != 1 && !s.contains(n)) {
            s.add(n);
            n = getNext(n);
        }
        return n == 1;
    }

	private static int getNext(int n) {
        int ans = 0;
        while(n != 0){
            int rem = n % 10;
            ans = ans + (rem * rem);
            n = n / 10;
        }
        return ans;
	}

}
