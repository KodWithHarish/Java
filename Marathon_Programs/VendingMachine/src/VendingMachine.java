import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Product code to get your favourite cold drink");
		String productCode = sc.next();
		getProduct(productCode);
		sc.close();
	}
	public static void getProduct(String productCode)
	{
switch (productCode) {
		
		case "p01" : System.out.println("Coca Cola"); 
		break;

		case "p02" : System.out.println("Spirte"); 
		break;

		case "p03" : System.out.println("Mirinda"); 
		break;

		case "p04" : System.out.println("String"); 
		break;
		
		case "p05" : System.out.println("Redbull"); 
		break;

		case "p06" : System.out.println("Pepsi"); 
		break;

		case "P07" : System.out.println("Tumbs up"); 
		break;

		case "P08" : System.out.println("Limca"); 
		break;

		case "P09" : System.out.println("Fanta"); 
		break;

		case "P10" : System.out.println("7 Up"); 
		break;

		case "P11" : System.out.println("Mountain Dew"); 
		break;

		case "P12" : System.out.println("Maaza"); 
		break;
		
		default:
			System.err.println("Drink Water & stay healthy");
		}
	}

}
