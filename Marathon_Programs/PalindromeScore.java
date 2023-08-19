
public class PalindromeScore {

	public static void main(String[] args) {
		String str = "azzzaazgh";
		System.out.println("\n"+palindrome(str));
	}
	public static int palindrome(String str) {
		int score=0;
		for (int i = 0; i < str.length(); i++) {
			String sub4 = (i+4)<= str.length()?str.substring(i, i+4):"ab";
			StringBuffer sb4 = new StringBuffer(sub4);
			StringBuffer rev4 = sb4.reverse();
			if(sub4.equals(rev4.toString())) {
				System.out.print("for : "+sub4+" score added is  : 5 ");
				score += 5;
			}
			String sub5 = (i+5)<= str.length()?str.substring(i, i+5):"ab";
			StringBuffer sb5 = new StringBuffer(sub5);
			StringBuffer rev5 = sb5.reverse();
			if(sub5.equals(rev5.toString())) {
				System.out.print("for : "+sub5+" score added is : 10 ");
				score += 10;
			}
		}
		return score;
	}
}
