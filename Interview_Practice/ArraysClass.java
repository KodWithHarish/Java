import java.util.Arrays;
import java.util.List;


public class ArraysClass {
	public static void main(String[] args) {
		int arr[]= {3,4,7,5,1,8,6,9};
		print(arr);
		print();
		
		Integer[] array1 = { 1, 2, 3, 4, 5 };
        List<Integer> list = Arrays.asList(array1);
        System.out.println(list); 
        print();
        
        Arrays.sort(arr);
        print(arr);
        print();
        
		print(Arrays.binarySearch(arr, 6));
		print();
		
//		arr, from, to, key
		System.out.println(Arrays.binarySearch(arr, 5, 8, 8));
		print();
		
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {1,2,3,5,4};
		print(Arrays.compare(arr1, arr2)); // 1 0 -1
		print();
		
		int newArr[] =Arrays.copyOf(arr1, 2);
		print(newArr);
		
		newArr = Arrays.copyOfRange(arr1, 2, 5);
		print(newArr);
		print();
		
		print(Arrays.equals(arr1, arr2));
		print();
		
		int empty[] = new int[10];
		Arrays.fill(empty, 69);
		print(empty);
		print();
		
		Integer[] array2 = { 1, 2, 3, 4, 5 };
		print(Arrays.mismatch(array1, array2));
		print();
		
		int res[] = new int[array2.length];
		
        Arrays.parallelPrefix(array2, (x, y) -> x + y);
        System.out.println(Arrays.toString(array2));
		print();
		
		
//		int random =(int) (Math.random()*100);
//		print(random);
//		
//		int min = 10;
//        int max = 20;
//
//        Random ran = new Random();
//        int randomNumber = ran.nextInt(max - min + 1) + min;
//        print(randomNumber);
		
//		printDecimal("123.356");
		
		
		int prefix[] = new int[array2.length];
		int sum=0;
		for (int i = 0; i < res.length; i++) {
			sum+=array2[i];
			prefix[i]=sum;
		}
		print(prefix);
		print();

		int[] arr3 = {4,6,1,3,2,8,9};
		Arrays.parallelSort(arr3);
		print(arr3);
		
//        pattern(4);
//		pt(4);
		
		
        

		
	}
	static void pt(int len) {
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				if(i%2==0) {
					System.out.printf("%02d ",(len*i)+j+1);
				}
				else {
					System.out.printf("%02d ",((len*(i+1))-j));
				}
			}
			System.out.println();
		}
	}
	static void print(int arr[]) {
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	static void print(int n) {
		System.out.println(n);
	}
	static void print() {
		System.out.println(("*".repeat(50)));
	}
	static void print(boolean b) {
		System.out.println(b);
	}
	
	static void printDecimal(String str) {
//		int index = str.indexOf('.');
//		System.out.println((str.substring(index+1)));
		String[] split = str.split("\\.");
		System.out.println(split[1]);
	}
	
	static void pattern(int len) {
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				if (i%2==0) {
						System.out.print(j+(len*i)+1);
				}
				else {
						System.out.print(len*(i+1)-j);
				}
			}
			System.out.println();
		}
	}
}
