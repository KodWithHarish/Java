import java.util.Scanner;

public class Reverse_No {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        int rev = 0;
        // for (int i = n; i != 0; i=i/10) {
        //     rev = rev * 10 + i % 10;
        // }
        // System.out.println(rev);

        while(n!=0) {
            rev = rev * 10 + n % 10;
            n = n / 10;
        }
        System.out.println(rev);
    }
}
