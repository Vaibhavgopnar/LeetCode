package leetCode;

public class IsSubsequence {

	public static void main(String[] args) {
		
		String s = "abc", t = "ahbgdc";
		
		boolean is = isSubsequence(s, t);
		System.out.println(is);

	}
	
public static boolean isSubsequence(String s, String t) {
        
        char s1[] = s.toCharArray();
        char t1[] = t.toCharArray();
        int j = 0;

        if(s.length() < 1)
        return true;

        for(int i = 0; i < t.length(); i++){
    
                if(s1[j] == t1[i]){
                    j++;
                }

            if(j == s.length())
            return true;
        }
        return false;
    }

}
