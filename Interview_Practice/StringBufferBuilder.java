
public class StringBufferBuilder {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello");
//		StringBuilder sb = new StringBuilder("Hello");

		
		sb.append(", World");
		print(sb);
		
//		can pass all kind of data types 
//		byte,short,int,long,float,double,boolean,char
		sb.append(false);
		print(sb);
		
		char arr[]= {'h','a','r','i','s','h',' ','k','u','m'};
		sb.append(arr);
		print(sb);
		
		sb.append(arr, 2, 5);
		print(sb);
		
		sb.append(sb, 1, 3);
		print(sb);
		
		System.out.println("*".repeat(50));
		
//		initial capacity is 16
//		newCapacity = oldCapacity*2+2
		System.out.println(sb.capacity());
		
		sb.charAt(0);
		sb.deleteCharAt(0);
		sb.delete(0, 1);
		sb.ensureCapacity(10);	
		
		StringBuffer str1 = new StringBuffer("Raja Ram Mohan Roy");
		
		char ch[] = new char[3]; //Ram
		str1.getChars(5, 8, ch, 0);
		print(ch);
		
//		can pass all kind of data types 
//		byte,short,int,long,float,double,boolean,char
		str1.insert(0, true);
		print(str1);
		
		str1.insert(0, "Harish");
		print(str1);
		
		str1.insert(0, arr); // harish kum
		print(str1);
		
		str1.insert(10, ch, 0, 3); // Ram
		print(str1);
		
		str1.insert(1, arr);
		
		print(str1.indexOf("Ram", 0));
		print(str1.indexOf("Harish"));
		
		print(str1.lastIndexOf("Ram"));
		
		str1.setCharAt(0, '*');
		print(str1);
		
		str1.replace(0, 1, "Replaced # ");
		print(str1);
		
		str1.setLength(7);
		print(str1);
		
		print(str1.subSequence(1, 3));
		print(str1.substring(3));
		print(str1.substring(0, 3));
		
		print(str1.toString());
		
		print("*".repeat(50));
		StringBuffer ss = new StringBuffer("Raja Ram Mohan Roy");
//		StringBuilder ss = new StringBuilder("Raja Ram Mohan Roy");

		print(ss.capacity());
		
		ss.delete(8,18);
		print(ss);
		
		ss.trimToSize();
		print(ss.capacity());
		
		ss.chars().forEach(c -> print(c));
	}
	
	static void print(CharSequence subSequence) {
		System.out.println(subSequence);
	}

	public static void print(StringBuffer sb) {
		System.out.println(sb);
	}
	public static void print(String s) {
		System.out.println(s);
	}
	public static void print(char sb[]) {
		for (char s : sb) {
			System.out.print(s+" ");
		}
		System.out.println();
	}
	public static void print(int n) {
		System.out.println(n);
	}
	
}
