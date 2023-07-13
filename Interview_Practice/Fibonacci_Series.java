import java.util.Scanner;

class Fibonacci_Series {
    public static void main(String[] args) {
        int n1 = 0, n2 = 1,next;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size");
        int size = sc.nextInt();
        System.out.println(n1+"\n"+n2);
        for (int i = 3; i <= size; i++) {
            next = n1 + n2;
            System.out.println(next+" ");
            n1 = n2;
            n2 = next;
        }
    }
}