import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of sides to identify the shape");
		int sides = sc.nextInt();
		identifyPolygon(sides);
		sc.close();
	}
	public static void identifyPolygon(int sides)
	{
		if(sides>0) {
			switch (sides) {
			
			case 1 : System.out.println("Coord"); 
			break;
			
			case 2 : System.out.println("Line"); 
			break;
			
			case 3 : System.out.println("Traingle"); 
			break;

			case 4 : System.out.println("Quadrilateral"); 
			break;

			case 5 : System.out.println("Pentagon"); 
			break;

			case 6 : System.out.println("Hexagon"); 
			break;

			case 7 : System.out.println("Hectagon"); 
			break;

			case 8 : System.out.println("Octagon"); 
			break;

			case 9 : System.out.println("Nanogon"); 
			break;

			case 10 : System.out.println("Decagon"); 
			break;
			
			default:
				System.err.println("No Shape Found");
			}
		}
		else {
			System.out.println("Sides should be Positive");
		}
	}

}
