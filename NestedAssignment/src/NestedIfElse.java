import java.util.Scanner;

public class NestedIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age");
        int age = sc.nextInt();

        if (age > 18) {
            System.out.println("Do you have a Driving license? [true/false]");
            boolean dl = sc.nextBoolean();
            if (dl) {
                System.out.println("You're all set to become the next Fast and Furious star! Just remember to bring your own explosion effects!");
            } else {
                System.out.println("Oh no! You don't have a driving license. Don't worry, the RTO will be waiting for you with a red carpet and confetti cannons!");
            }
        } else {
            System.out.println("Your age should be more than 18. Don't worry! While you wait to become the next Vin Diesel, practice your driving skills in Sai Driving School.");
        }
        System.out.println("Thank You! Drive Carefully and remember, always use the indicator on the correct side.");
    }
}
