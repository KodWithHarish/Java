import java.util.Scanner;

public class SwitchCondition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter + or - or * or /");
        char opt = sc.next().charAt(0);

        switch (opt) {
            case '+':
                System.out.println("Addition Operator");
                break;
            case '-':
                System.out.println("Subtraction Operator");
                break;
            case '*':
                System.out.println("Multiplication Operator");
                break;
            case '/':
                System.out.println("Division Operator");
                break;

            default:
                System.out.println("Idiot see the message carefully");
        }
    }
}
