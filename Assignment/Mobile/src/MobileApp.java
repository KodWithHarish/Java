import java.util.Scanner;

public class MobileApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter mobile brand name  :");
//		sc.nextLine();
		String brand = sc.nextLine();

		System.out.println("Enter mobile color :");
		String color = sc.nextLine();

		System.out.println("Enter mobile model name :");
		String model = sc.nextLine();

		System.out.println("Enter mobile ram :");
		int ram = sc.nextInt();

		System.out.println("Enter mobile storage :");
		int storage = sc.nextInt();

		System.out.println("Enter mobile display type :");
		sc.nextLine();
		String display = sc.nextLine();

		System.out.println("Enter mobile camera setup :");
		String camera = sc.nextLine();

		System.out.println("Enter mobile battery :");
		int battery = sc.nextInt();

		System.out.println("Enter mobile cost :");
		int cost = sc.nextInt();

		System.out.println("Enter mobile processor :");
		sc.nextLine();
		String processor = sc.nextLine();

		// Mobile m1 = new Mobile("xiaomi", "blue", "Redmi note 8", 4, 64, "IPS Display", "Quad Camera Setup", 4000, 12000,
		// 		"4G", "SD 665");

		Mobile m1 = new Mobile(brand, color, model, ram, storage, display, camera, battery, cost, camera, processor);
		m1.MobileSpecifications();
		m1.PlayGames();
		m1.WatchMovies();
		m1.InsertROMs();
	}
}
