package leetCode;

public class IsomorphicTree {

	public static void main(String[] args) {
		
		String s = "egg", t = "add";
		
		boolean isIso = isIsomorphic(s, t);

		System.out.println(isIso);
	}
	
public static boolean isIsomorphic(String s, String t) {
        
        int l1[] = new int[200];
        int l2[] = new int[200];

        if(s.length() != t.length())
            return false;
        
        for(int i=0;i<s.length();i++)
        {
            if(l1[s.charAt(i)] != l2[t.charAt(i)])
                return false;

            l1[s.charAt(i)]=i+1;
            l2[t.charAt(i)]=i+1;
        }
        return true;
    }

}
