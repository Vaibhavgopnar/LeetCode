package leetCode.Medium;

import java.util.HashMap;
import java.util.Map;

public class LongestSunstringWithoutRepeatChar {

	public static void main(String[] args) {

		String s = "abcabcbb";

		int len = lengthOfLongestSubstring(s);
		System.out.println(len);

	}

	public static int lengthOfLongestSubstring(String s) {

		if (s == null || s.length() == 0) {
			return 0;
		}

		int maxlen = 0;
		int start = 0, end = 0;

		Map<Character, Integer> map = new HashMap<>();

		while (end < s.length()) {
			char current = s.charAt(end);

			if (map.containsKey(current)) {
				start = Math.max(start, map.get(current) + 1);
			}

			map.put(current, end);
			maxlen = Math.max(end - start + 1, maxlen);
			end++;
		}
		return maxlen;
	}

}
