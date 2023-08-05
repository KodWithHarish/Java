import java.util.Arrays;

public class RemoveDuplicatesFromArray {

    public static int[] removeDuplicatesUsingSorting(int[] arr) {
        Arrays.sort(arr);

        int n = arr.length;
        int[] result = new int[n];
        int index = 0;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                result[index] = arr[i];
                index++;
            }
        }

        result[index] = arr[n - 1];

        return Arrays.copyOf(result, index + 1);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 2, 2, 1, 5, 6, 3 };
        System.out.println("Original Array: " + Arrays.toString(arr));

        int[] result = removeDuplicatesUsingSorting(arr);
        System.out.println("Array after removing duplicates using sorting: " + Arrays.toString(result));
    }
}
