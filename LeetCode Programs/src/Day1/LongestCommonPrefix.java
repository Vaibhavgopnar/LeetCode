package Day1;

import java.util.Arrays;

public class LongestCommonPrefix {

	public static void main(String[] args) {

		String[] str = {"flower","flow","flight"};
		
		String lcp = longestCommonPrefix(str);
		System.out.println(lcp);
	}

	public static String longestCommonPrefix(String[] strs) {
				
		Arrays.sort(strs);
		if(strs == null )
			return "";
		
		String lcp = strs[0];
		
		for(int i = 1; i < strs.length; i++) {
			
			String s = strs[i];
			int j = 0;
			
			while(j < s.length() && j < lcp.length() && s.charAt(j) == lcp.charAt(j)) {
				j++;
			}
			
			if(j == 0)
				return "";
			
			lcp = s.substring(0, j);
		}
		
		// 2nd Approch
		
//		for(String word : strs) {
//			while(word.indexOf(lcp) != 0) {
//				lcp = lcp.substring(0, lcp.length()-1);
//			}
//		}
//		if(!lcp.equals(""))
//			return lcp;
	
		return lcp;
	}
}
