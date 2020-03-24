package csd;

public class AppStringPalindrome {

	public static void main(String[] args) {
		PalindromeTest.run();
	}

}
class PalindromeTest {
	public static void run() {
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		for (;;) {
			System.out.print("Enter a sentence: ");
			String s = kb.nextLine();
			
			System.out.println(StringUutil.isPalindrome(s) ? "Palindrom" : "Not Palindrom");
			
			if (s.equals("quit"))
				break;
		}
	}
}
class StringUutil {
	public static boolean isPalindrome(String s)
	{
		s = getLetters(s);
		if(s.isEmpty())
			return false;
		int L = s.length();
		for(int i = 0; i < L/2; ++i)
		{
			if(s.charAt(i) == s.charAt(L - i - 1))
				return true;
		}
		return false;
		
	}
	public static String getLetters(String s)
	{
		String result = "";
		int len = s.length();
		for( int i = 0; i < len; ++i)
		{
			char ch = s.charAt(i);
			if(Character.isLetter(ch))
				result += Character.toLowerCase(ch);	
		}
		return result;
	}
}