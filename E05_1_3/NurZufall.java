package E05_1_3;

import java.util.Scanner;

public class NurZufall {

    public static void main(String[] args) {
        
        // get input from user
        Scanner input = new Scanner(System.in);
        int inputNumber = Integer.parseInt(input.next());
        input.close();

        // generate random number
        int random = (int) (Math.random() * inputNumber);

        // print result
        System.out.println(random);

    }
    
}
