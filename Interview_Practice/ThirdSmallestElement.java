import java.util.Arrays;
import java.util.HashSet;

public class ThirdSmallestElement {

	public static void main(String[] args) {
		int[] arr= {1,2,1,3,4,5,6};
		Arrays.sort(arr);
		System.out.println(arr[2]);
		System.out.println(thirdSmallest(arr));
	}
	public static int thirdSmallest(int arr[]) {
		HashSet<Integer> set = new HashSet<>();
		for (int x : arr) {
			set.add(x);
		}
		return (int) set.toArray()[2];
	}

}
