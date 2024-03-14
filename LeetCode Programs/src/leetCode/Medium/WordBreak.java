package leetCode.Medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreak {

	public static void main(String[] args) {

		String s = "leetcode";
		List<String> wordDict = new ArrayList<>();
		wordDict.add("leet");
		wordDict.add("code");

		boolean isbreak = wordBreak(s, wordDict);
		System.out.println(isbreak);

	}

	public static boolean wordBreak(String s, List<String> wordDict) {

		Set<Integer> set = new HashSet<Integer>();
		return dfs(s, 0, wordDict, set);
	}

	public static boolean dfs(String s, int index, List<String> wordDict, Set<Integer> set) {

		if (index == s.length())
			return true;

		if (set.contains(index))
			return false;

		for (int i = index + 1; i <= s.length(); i++) {

			String t = s.substring(index, i);

			if (wordDict.contains(t))
				if (dfs(s, i, wordDict, set))
					return true;
				else
					set.add(i);
		}
		set.add(index);
		return false;

	}

}
