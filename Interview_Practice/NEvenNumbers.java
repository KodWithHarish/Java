import java.util.Scanner;

public class NEvenNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("How Many Number You Want Print :");
		int n = sc.nextInt();
		
		System.out.print(n+" First Even Numbers Are --> ");
		GenerateEvenNumbers(n);
		
		System.out.print("\n\n"+n+" First Odd Numbers Are --> ");
		GenerateOddNumbers(n);
		
		sc.close();
	}

	public static void GenerateEvenNumbers(int n) {
		for (int i = 0; i < n * 2; i += 2) {
            System.out.print(i + " ");
        }
	}
	
	public static void GenerateOddNumbers(int n) {
		for (int i = 1; i < n * 2; i += 2) {
            System.out.print(i + " ");
        }
	}
}
