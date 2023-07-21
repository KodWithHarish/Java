import java.util.*;
public class PersonApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the id :");
		int id = sc.nextInt();

		System.out.print("Enter the name :");
		sc.nextLine();
		String name = sc.nextLine();

		System.out.print("Enter the gender :");
		String gender = sc.next();

		System.out.print("Enter the email :");
		String email = sc.next();

		System.out.print("Enter the ph_no :");
		long phNo = sc.nextLong();

		Person p = new Person(id, name, gender, email, phNo);

		System.out.println(p.id);
		System.out.println(p.name);
		System.out.println(p.gender);
		System.out.println(p.email);
		System.out.println(p.phNo);

	}

}
