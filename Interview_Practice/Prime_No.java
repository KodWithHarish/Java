import java.util.Scanner;

public class Prime_No {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        boolean flag=false;
        if (n == 0 || n == 1) {
            System.out.println("Not Prime");
        }
        else {
            for (int i = 2; i < n / 2; i++) {
                if (n % i == 0) {
                    System.out.println("Not Prime");
                    flag = true;
                    break;
                }
            }
            if (!flag)
                System.out.println("Prime");
        }
    }
}
