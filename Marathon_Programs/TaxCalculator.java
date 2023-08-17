import java.util.Scanner;

public class TaxCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Purchase Amount");
        int amt = sc.nextInt();
        System.out.println("Enter Purchase Tax");
        double tax = sc.nextDouble();
        double res = calculateTotalWithTax(amt, tax);
        System.out.println("Total Cost Including Tax --> " + res);
        sc.close();
    }

    public static double calculateTotalWithTax(double amt, double tax) {
        return (amt * tax) + amt;
    }
}
