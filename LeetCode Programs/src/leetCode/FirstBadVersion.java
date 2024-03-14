package leetCode;

public class FirstBadVersion {

	public static void main(String[] args) {

		int n = 5;

		int badv = firstBadVersion(n);
		System.out.println(badv);

	}

	public static int firstBadVersion(int n) {

		int l = 0;
		int h = n;

		while (l <= h) {

			int mid = l + (h - l) / 2;

			if (isBadVersion(mid) == true && isBadVersion(mid - 1) == false)
				return mid;

			if (isBadVersion(mid) == false) {

				l = mid + 1;
			} else {
				h = mid;
			}
		}
		return -1;
	}

	private static boolean isBadVersion(int mid) {

		return false;
	}

}
