import java.util.Scanner;

public class JavaLand {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Anzahl der Kinder: ");
		int children = scanner.nextInt();

		System.out.print("Einkommen: ");
		double income = scanner.nextDouble();

		scanner.close();

		double costs = 0;

		if (income < 45000) {
			switch (children) {
				case 1:
					costs += 70;
					break;
				case 2:
					costs += 130;
					break;
				case 3:
					costs += 220;
					break;
				default:
					costs += 240 * children;
			}
		} else {
			switch (children) {
				case 1:
				case 2:
					costs += 70;
					break;
				default:
					costs += 140 * children;
					break;
			}
		}

		System.out.println("Kosten: " + costs + " Euro");
	}
}
