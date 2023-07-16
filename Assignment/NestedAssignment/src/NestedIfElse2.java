import java.util.Scanner;

public class NestedIfElse2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Suppose You want to go for a trip with your friends");
		System.out.println("Take Permission from Mom [true/false]");
		boolean mom = sc.nextBoolean();
		System.out.println("Take Permission from Dad [true/false]");
		boolean dad = sc.nextBoolean();

		boolean trip = true;
		if (mom == trip && dad == trip) {
			System.out.println("Chal Chal Chal Gadi Nikal.");
		} else {
			if (mom == trip && dad != trip) {
				System.out.println("Mom :  Ask Your Dad, if dad says yes go....");
			} else {
				System.out.println("Dad :  Ask Your Mom, if mom says yes go.....");
			}
		}
	}
}
