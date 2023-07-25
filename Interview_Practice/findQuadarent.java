import java.util.Scanner;

public class findQuadarent {
    public static void main(String[] args) {
        System.out.println("Enter (x,y) value");
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("First");
        }

        else if (x > 0 && y < 0) {
            System.out.println("Second");
        }

        else if (x<0 && y<0) {
            System.out.println("Third");
        }

        else {
            System.out.println("Fourth");
        }
    }
}
