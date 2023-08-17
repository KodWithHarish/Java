import java.util.Scanner;

class ArraySearchingSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 14, 26, 12, 33, 2, 66 };
        int key, pos;
        System.out.println("Welcome To Searching Sorting Application\\n");
        while (true) {
            System.out.println(
                    "\n---------------------------\nArray Operation Menu\n1.Linear Search\n2.Binary Search\n3.Bubble Sort\n4.Selection Sort\n5.Insertion Sort\n6.Display Array\n7.Exit\n---------------------------");
            System.out.print("Enter Your Choice --> ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    key = InputKey();
                    pos = LinearSearch(arr, key);
                    if (pos == -1)
                        System.out.println("Element Not Found");
                    else
                        System.out.println("Element Found At Position --> " + pos);
                    break;

                case 2:
                    key = InputKey();
                    pos = BinarySearch(arr, key);
                    if (pos == -1)
                        System.out.println("Element Not Found");
                    else
                        System.out.println("Element Found At Position --> " + pos);

                    break;

                case 3:
                    System.out.println("You Have Selected BUBBLE SORT");
                    BubbleSort(arr);
                    break;

                case 4:
                    System.out.println("You Have Selected SELECTION SORT");
                    SelectionSort(arr);
                    break;

                case 5:
                    System.out.println("You Have Selected INSERTION SORT");
                    InsertionSort(arr);
                    break;

                case 6:
                    System.out.print("Array Elements Are --> ");
                    Display(arr);
                    break;

                case 7:
                    System.out.println("Thank You!!");
                    sc.close();
                    return;

                default:
                    System.out.println("By Default INSERTION SORT is Selected");
                    InsertionSort(arr);
                    break;
            }
        }
    }

    public static int LinearSearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int BinarySearch(int arr[], int key) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void BubbleSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void SelectionSort(int arr[]) {
        int min, pos, temp;
        for (int i = 0; i < arr.length - 2; i++) {
            min = arr[i];
            pos = i;
            for (int j = i + 1; j < arr.length - 1; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    pos = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[pos];
            arr[pos] = temp;
        }
    }

    public static void InsertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
    }

    public static void Display(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static int InputKey() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Element To Find --> ");
        int key = sc.nextInt();
        return key;
    }
}