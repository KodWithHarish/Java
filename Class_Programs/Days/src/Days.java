import java.util.Scanner;

public class Days {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1-7");
        int num = sc.nextInt();

        switch (num) {
            case 1:
                System.out.println("Super Sunday");
                break;
            case 2:
                System.out.println("Boring Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wensday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Last working day Friday");
                break;
            case 7:
                System.out.println("Weekend Saturday");
                break;

            default:
                System.out.println("Idiot there are only 7 days in a week");
        }
    }
}
