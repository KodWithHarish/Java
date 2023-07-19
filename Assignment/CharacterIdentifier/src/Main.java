import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Character to idenitify");
        char ch = sc.next().charAt(0);
        identifyCharacter(ch);
        sc.close();
    }

    public static void identifyCharacter(char ch) {
        if (Character.isLowerCase(ch)) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch+" is --> Lower-case Vowel");
            } 
            else {
                System.out.println(ch+" is --> Lower-case Consonant");
            }
        }
        else if (Character.isUpperCase(ch)) {
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                System.out.println(ch+" is --> Upper-case Vowel");
            } 
            else {
                System.out.println(ch+" is --> Upper-case Consonant");
            }
        } 
        else if (Character.isDigit(ch)) {
            System.out.println(ch+" is --> Number");
        } 
        else {
            System.out.println(ch+" is --> Special Character/Symbols");
        }
    }
}
