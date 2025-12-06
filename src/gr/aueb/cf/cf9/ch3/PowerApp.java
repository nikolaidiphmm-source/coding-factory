package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Calculates the power of a number, a^n
 * a^n = a * a * a * ... * a (n φορές)
 * base*power = base * base * base * .. * base (power times)
 */
public class PowerApp {
    public static void main(String[] args) {
        //Δήλωση και αρχικοποίηση
        Scanner scanner = new Scanner(System.in);
        int base = 0 ;
        int power = 0 ;
        int result = 1; // γιατί το 0 θα έβγαζε 0
        int i = 1 ;

        //Είσοδος Δεδομένων και αντιστοίχιση σε μεταβλητές
        System.out.println("Παρακαλώ εισάγετε το base και το power");
        base = scanner.nextInt();
        power = scanner.nextInt();

        //Επεξεργασία Δεδομένων - While-do
        while (i <= power) {
            result *= base; //result = result * base
            i++;
        }

        //print results
        System.out.printf("%d ^ %d = %d\n", base , power, result);
    }
}
