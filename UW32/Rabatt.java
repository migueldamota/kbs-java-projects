import java.text.DecimalFormat;
import java.util.Scanner;

class Rabatt {

	public static void main(String[] args) {

		double DISCOUNT_REGULAR = 5 / 100.0;
		double DISCOUNT_BIG = 8 / 100.0;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Nettobetrag: ");
		double netto = scanner.nextDouble();

		System.out.print("Bisherige Jahresumsatz: ");
		double annualSales = scanner.nextDouble();

		scanner.close();

		// Brutto
		double brutto = netto * 1.19;

		// Rabatt berechnen
		double discount = DISCOUNT_REGULAR;

		if (annualSales > 15000) {
			discount = DISCOUNT_BIG;
		}

		double discountAmount = netto * (1 - discount);
		
		DecimalFormat format = new DecimalFormat("######,##0.00");

		System.out.println("");
		System.out.println("Endbetrag:");
		System.out.println("-----------------------------");
		System.out.println("Netto: \t\t" + format.format(netto) + " Euro");
		System.out.println("Rabatt: \t" + format.format(discountAmount) + " Euro");
		System.out.println("MwSt: \t\t" + format.format(netto * 0.19) + " Euro");
		System.out.println("Brutto: \t" + format.format(brutto) + " Euro");

	}
}
