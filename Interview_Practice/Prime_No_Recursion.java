import java.util.Scanner;

public class Prime_No_Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        System.out.println(isPrime(n,2)?"Prime":"Not Prime");
    }

    public static boolean isPrime(int n, int i)
    {
        if (n <= 2)
            return (n == 2) ? true : false;
        if (n % i == 0)
            return false;
        if (i * i > n)
            return true;
        return isPrime(n, i + 1);
    }
}
