import java.util.Scanner;

public class AllPossiblePermutations {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A String");
		String str = sc.nextLine();
		substrings(str);
	}
	public static void substrings(String str) {
	    for (int i = 0; i < str.length(); i++) {
	        for (int j = i; j <= str.length(); j++) {
	            String s = str.substring(i, j);
	            System.out.print(s + " ");
	        }
	    }
	}

}
