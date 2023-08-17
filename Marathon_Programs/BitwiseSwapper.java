import java.util.Scanner;

public class BitwiseSwapper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Before Swapping A : " + a + " B : " + b);
        swapBits(a, b);
        sc.close();
    }

    public static void swapBits(int a, int b) {
        int temp = a ^ b;
        a = a ^ temp;
        b = b ^ temp;
        System.out.println("After Swapping A : " + a + " B : " + b);
    }
}
