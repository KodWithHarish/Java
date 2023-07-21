import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks");
        int marks = sc.nextInt();

        if (marks<50){
            System.out.println("D-Grade");
            System.out.println("Congratulations");
        }


            else if (marks>=50 && marks<60){
                System.out.println("C-Grade");
                System.out.println("Congratulations");
            }


            else if (marks>=60 && marks<70){
                System.out.println("B-Grade");
                System.out.println("Congratulations");
            }


            else if (marks>=70 && marks<80){
                System.out.println("A-Grade");
                System.out.println("Congratulations");
            }


            else{
                System.out.println("A+-Grade");
                System.out.println("Congratulations");
            }
    }
}
