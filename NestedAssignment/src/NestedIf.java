public class NestedIf {

	public static void main(String[] args) {
		boolean i = true;
		boolean j = true;
		boolean k = true;

		if (i) {
			System.out.println("1st Condition is true!");
			if (j) {
				System.out.println("2nd Condition is true!");
				if (k) {
					System.out.println("3rd Condition is true!");
					System.out.println("Congratulations! All conditions are true!");
				}
			}
		}
    }
}
