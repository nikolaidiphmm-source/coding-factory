package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

/**
 * Λαμβάνει από τον χρήστη ένα ποσό ακέραιο σε ευρώ και το μετατρέπει σε δολλάρια ΗΠΑ
 * με βάση μία ισοτιμία. Για παράδειγμα αν ο χρήστης δώσει 100 ευρω και η ισοτιμία είναι 1 euro= 99 usa cents
 * τότε το τα συνολικά usa cents είναι 9000 και αυτό αντιστοιχεί σε 99 usa dollars
 * και 0 USA Cents
 */
public class EuroToUsdConverter {

    public static void main(String[] args) {

        //Δήλωση και αρχικοποίηση μεταβλητών
        Scanner scanner = new Scanner(System.in);
        final int EURO_TO_USD_CONVERTION = 99 ;
        int inputEuro = 0 ;
        int totalUSACents = 0 ;
        int usaDollars = 0 ;
        int usaCents = 0 ;

        //Data Input
        System.out.println("Please insert number in Euro:");
        inputEuro = scanner.nextInt();

        //Data processing-Expressions
        totalUSACents = inputEuro * EURO_TO_USD_CONVERTION ;
        usaDollars = totalUSACents / 100 ;
        usaCents = totalUSACents % 100 ;

        //Data output
        System.out.printf("%d Euros = %d USD Dollars και %d USD Cents %d%n", inputEuro, usaDollars, usaCents);
    }
}
