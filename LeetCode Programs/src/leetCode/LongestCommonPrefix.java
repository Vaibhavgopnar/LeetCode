package leetCode;

public class LongestCommonPrefix {

	public static void main(String[] args) {

		String str[] = {"flower","flow","flight" };

		String s = longestCommonPrefix(str);
		System.out.println(s);
		;

	}

	public static String longestCommonPrefix(String[] strs) {

		if (strs == null)
			return "";

		String lcp = strs[0];

		for (int i = 1; i < strs.length; i++) {

			String s = strs[i];
			int j = 0;

			while (j < s.length() && j < lcp.length() && s.charAt(j) == lcp.charAt(j)) {

				j++;
			}

			if (j == 0)
				return "";

			lcp = s.substring(0, j);
		}

		return lcp;
	}

}
