package leetCode;

public class ValidPalindrom {

	public static void main(String[] args) {

		String s = "A man, a plan, a canal: Panama";

		boolean ispal = isPalindrome(s);
		System.out.println(ispal);
	}

	public static boolean isPalindrome(String s) {

		String temp = "";
		String str = "";
		s = s.toLowerCase();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {

			} else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z' || s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				temp = temp + s.charAt(i);
			} else {

			}
		}

		s = temp;

		for (int i = temp.length() - 1; i >= 0; i--) {
			str = str + temp.charAt(i);
		}

		if (s.equals(str))
			return true;
		else
			return false;
	}

}
