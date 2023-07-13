import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        int rev = 0;
        int temp = n;
        while (n != 0) {
            rev = rev * 10 + n % 10;
            n = n / 10;
        }
        System.out.println((rev==temp)?"Palindrome":"Not Palindrome");
    }
}
