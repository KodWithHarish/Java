public class ArraySumProduct {

	public static void main(String[] args) {
		int[] arr= {1,2,3};
		System.out.println(sum(arr)*arr.length);
	}
	public static int sum(int arr[]) {
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
		}
		return sum;
	}

}
