import java.util.Scanner;

public class SumOfNNaturalNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Range : ");
		int range = sc.nextInt();
		System.out.println("Sum Of First " + range + " Numbers Is --> " + Sum(range));
		sc.close();
	}
	
	public static int Sum(int range) {
		int sum=0;
		for(int i=0;i<=range;i++) {
			sum+=i;
		}
		return sum;
	}
}
