package leetCode;

import java.util.HashSet;

public class LongestPalindrome {

	public static void main(String[] args) {
		
		String s = "abccccdd";
		
		int len = longestPalindrome(s);
		System.out.println(len);

	}
	
public static int longestPalindrome(String s) {
        
        HashSet<Character>h=new HashSet<>();

        int len=0;

        for(char c : s.toCharArray()){
            if(h.contains(c)){
                len += 2;
                h.remove(c);
            }
            else{
                h.add(c);
            }
        }

        if(h.size() > 0){
            return len + 1;
        }
        return len;
    }

}
