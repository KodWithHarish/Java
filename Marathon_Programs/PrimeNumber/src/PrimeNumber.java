import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        if (n < 2) {
            System.out.println("Not Prime");
        }
        else {
        	for (int i = 2; i*1 < n; i++){
//            for (int i = 2; i < n/2; i++) {
                if (n % i == 0) {
                    System.out.println(n+" is Not Prime");
                    return;
                }
            }
            System.out.println(n+" is Prime");
        }
        sc.close();
    }

}
