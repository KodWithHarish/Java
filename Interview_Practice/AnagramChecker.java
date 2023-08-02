import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {

    public static boolean areAnagrams(String str1, String str2) {
        // Remove spaces and convert to lowercase to ignore case and spaces
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // Check if both strings have the same length
        if (str1.length() != str2.length()) {
            return false;
        }

        // Sort the characters in both strings
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);

        // Compare the sorted strings
        return Arrays.equals(chars1, chars2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 String");
        String str1 = sc.next();
        String str2 = sc.next();
        if (areAnagrams(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
        sc.close();
    }
}
