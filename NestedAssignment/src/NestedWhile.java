
public class NestedWhile {

	public static void main(String[] args) {
		int i = 10;
		int j = 0;
		while (i>0) {
			while (j < 10) {
				// System.out.println(i + " x " + i + " = " + j*j);
				System.out.println(i+" "+j);
				j++;
				i--;
			}
		}
	}
}
