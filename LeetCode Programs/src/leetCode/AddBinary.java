package leetCode;

public class AddBinary {

	public static void main(String[] args) {
		
		String a = "1010", b = "1011";
		
		String res = addBinary(a, b);
		System.out.println(res);
	}
	
public static String addBinary(String a, String b) {
        
        int res = 0;
        int l1 = a.length();
        int l2 = b.length();

        String result = "";
        int i = 0;

        while(i < l1 || i < l2 || res != 0){
            int x = 0;
            int y = 0;
            if(i < l1 && a.charAt(l1-1-i) == '1') 
                x = 1;
            if(i < l2 && b.charAt(l2-1-i) == '1') 
                y = 1;
            
            result = (x+y+res) % 2 + result;
            res = (x+y+res) / 2;
   
            i++;
        }
        return result;
    }

}
