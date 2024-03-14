package leetCode;

public class LengthOfLastWord {

	public static void main(String[] args) {
		
		String s = "Hello World";
		
		int len = lengthOfLastWord(s);
		System.out.println(len);

	}
	
	public static int lengthOfLastWord(String s) {
        int len = 0;
        boolean flag = false;
        if(s.length() == 0)
            return 0;

        for(int i = s.length()-1; i >= 0; i--){

            if(s.charAt(i) == ' ' && flag == true){
                break;
            }
            else if(s.charAt(i) != ' '){
                    flag = true;
                    len++;
            }
        }
        return len;
    }

}
