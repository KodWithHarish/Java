import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class AarryLists {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		
//		Inserting Elements into ArrayList
		for (int i = 0; i <= 5; i++) {
			arr.add(i);
		}
		
//		1.Print ArrayList Elements Directly
		System.out.print("Printing Elements Directly --> ");
		System.out.println(arr);

//		2.Print ArrayList Elements Using for Loop
		System.out.print("Printing Elements using for Loop --> ");
		for (int i = 0; i < arr.size(); i++) {
			System.out.print(arr.get(i)+" ");
		}
		
//		3.Print ArrayList Elements Using for-each Loop
		System.out.print("\nPrinting Elements using for-each Loop --> ");
		for (Integer x : arr) {
			System.out.print(x+ " ");
		}
		
//		4.Print ArrayList Elements Using Iterator
		Iterator<Integer> it = arr.iterator();
		System.out.print("\nPrinting Elements using Iterator --> ");
		while (it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		
//		5.Print ArrayList Elements Using ListIterator
		ListIterator<Integer> lt = arr.listIterator();
		System.out.print("\nPrinting Elements using ListIterator --> ");
		while (lt.hasNext()) {
			System.out.print(lt.next()+" ");
		}
		System.out.println("\n*************************************************\n");
		
//		add methods
		arr.add(9);
		arr.add(7, 10);
		System.out.println(arr);
				
		ArrayList<Integer> newArr = new ArrayList<>();
		for (int i = 100; i <= 105; i++) {
			newArr.add(i);
		}
		System.out.print("newArr Elements Are --> "+newArr);
		
		arr.addAll(newArr);
		System.out.print("\nAfter Adding newArr to arr --> "+arr);
		
		arr.addAll(3, newArr);
		System.out.print("\nAfter Adding All Elements from the Sepcified index from NewArr to arr --> "+arr);
		
		System.out.println("\n*************************************************\n");

//		remove methods
		arr.remove(0); // index value as parameter
		System.out.println(arr);
		
		ArrayList<String> strArr = new ArrayList<>();
		strArr.add("Harish");
		strArr.add("Adarsh");
		strArr.add("Poorvik");
		System.out.println(strArr);
		
		strArr.remove("Adarsh"); // value as parameter
		System.out.println(strArr);
		
		System.out.println("\n*************************************************\n");
		
//		clear method
		newArr.clear();
		System.out.println("clear newArra --> "+newArr);
		
		System.out.println("\n*************************************************\n");
		
//		get
		System.out.println("Get Element at index 6 --> "+arr.get(6));
		
		System.out.println("\n*************************************************\n");

//		set
		arr.set(0, 999);
		System.out.println("Set value at index 0 --> "+arr);
		
		System.out.println("\n*************************************************\n");

//		size
		System.out.println("size() method --> "+arr.size());
		
		System.out.println("\n*************************************************\n");

//		isEmpty
		System.out.println("isEmpty method --> "+newArr.isEmpty());
		
		System.out.println("\n*************************************************\n");
		
//		contains
		System.out.println("contains(999) method --> "+arr.contains(999));
		
		System.out.println("\n*************************************************\n");
		
//		indexOf
		System.out.println("indexOf(100) method --> "+arr.indexOf(100));
		
		System.out.println("\n*************************************************\n");
		
//		lastIndexOf
		System.out.println("lastIndexOf(100) method --> "+arr.lastIndexOf(100));
		
		System.out.println("\n*************************************************\n");
		
//		toArray method
//		Integer[] num = (Integer[]) arr.toArray();
//		System.out.print("converting toArray 1st approach --> ");
//		for (Integer x : num) {
//			System.out.print(x+" ");
//		}
		Integer[] simpleArr = arr.toArray(new Integer[0]);
		System.out.print("\nconverting toArray 2st approach --> ");
		for (Integer x : simpleArr) {
			System.out.print(x+" ");
		}
		
		System.out.println("\n*************************************************\n");

//		sublist
		List<Integer> subList = arr.subList(1, 5);
		System.out.print("subList method --> "+subList);
	}
	
}
