import java.util.Scanner;

public class Ausschankregel {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Alter: ");
		int age = scanner.nextInt();

		scanner.close();

		if (age <= 10 || age > 80) {
			System.out.println("Tee");
		} else if (age >= 11 && age <= 17) {
			System.out.println("Kein Alkohol");
		} else {
			System.out.println("Alkohol");
		}
	}
}
