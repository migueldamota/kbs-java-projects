package E05_1_3;

import java.util.Scanner;

public class Benzin {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.println("Berechnung des Durchschnittsverbrauchs");

        System.out.print("Verbrauchter Kraftstoff in l: ");
        float liter = Float.parseFloat(input.next());

        System.out.print("Gefahrene Strecke in km: ");
        float path = Float.parseFloat(input.next());

        input.close();

        float average = liter / path * 100;
        System.out.println("Der Durchschnittsverbrauch ist: " + average + " l/100km");

    }
    
}
