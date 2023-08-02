import java.util.HashSet;

public class PangramChecker {

    public static boolean isPangram(String str) {
        // Remove spaces and convert to lowercase to ignore case and spaces
        str = str.replaceAll("\\s", "").toLowerCase();

        // Create a set to track unique characters
        HashSet<Character> uniqueChars = new HashSet<>();

        // Iterate through the characters in the string
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                uniqueChars.add(c);
            }
        }

        // Check if the set contains all the letters of the alphabet
        return uniqueChars.size() == 26;
    }

    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog";
        if (isPangram(sentence)) {
            System.out.println("The sentence is a pangram.");
        } else {
            System.out.println("The sentence is not a pangram.");
        }
    }
}
