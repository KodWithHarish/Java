import java.util.*;
public class Fibonacci_Series_Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size");
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            System.out.println(fib(i));
        }
    }
    public static int fib(int n) {
        if (n == 0 || n == 1)
            return n;
        else
            return fib(n - 1) + fib(n - 2);
    }
}
