import java.util.Scanner;

public class JavaMath {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number to Explore Math Class Methods");
		float n = sc.nextFloat();
		MathMethods.SquareRoot(n);
		MathMethods.CubeRoot(n);
		MathMethods.AbsluteValue(n);
		MathMethods.RoundNumber(n);
		MathMethods.CeilNumber(n);
		MathMethods.FloorNumber(n);
		MathMethods.RandomNumber();
		sc.close();
	}
}

class MathMethods{
	
	public static void SquareRoot(float n) {
		System.out.println("Square root of "+n+" is --> "+Math.sqrt(n));
	}

	public static void CubeRoot(float n) {
		System.out.println("Cube root of "+n+" is --> "+Math.cbrt(n));
	}
	
	public static void AbsluteValue(float n) {
		System.out.println("Abslute Value of "+n+" is --> "+Math.abs(n));
	}
	
	public static void RoundNumber(float n) {
		System.out.println("Rounded Value of "+n+" is --> "+Math.round(n));
	}
	
	public static void CeilNumber(float n) {
		System.out.println("Ceil Value of "+n+" is --> "+Math.ceil(n));
	}
	
	public static void FloorNumber(float n) {
		System.out.println("Floor Value of "+n+" is --> "+Math.floor(n));
	}
	
	public static void RandomNumber() {
		System.out.println("Random number is --> "+Math.random());
	}
}
