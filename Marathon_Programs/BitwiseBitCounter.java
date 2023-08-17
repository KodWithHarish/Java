import java.util.Scanner;

public class BitwiseBitCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Numbers");
        int n = sc.nextInt();
        System.out.println("Number Of Set Bits --> " + countSetBits(n));
        sc.close();
    }

    public static int countSetBits(int n) {
        int count = 0;
        // for (int i = 0; i < 32; i++) {
        // if ((n & (1 << i)) != 0) {
        // count++;
        // }
        // }
        while (n > 0) {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }
}
