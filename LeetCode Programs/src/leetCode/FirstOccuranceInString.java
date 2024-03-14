package leetCode;

public class FirstOccuranceInString {

	public static void main(String[] args) {
		
		String haystack = "sadbutsad", needle = "sad";
		
		int index = strStr(haystack, needle);
		System.out.println(index);

	}
	
	public static int strStr(String haystack, String needle) {

        int s2l=needle.length();
        if(haystack.length()==needle.length())
            if(haystack.equals(needle))
                return 0;

        for(int i=0;i<haystack.length()-s2l+1;i++){
            if(haystack.substring(i, i+s2l).equals(needle))
                return i;
        }
            
        return -1;
    }

}
