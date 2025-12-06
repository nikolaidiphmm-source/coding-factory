package gr.aueb.cf.cf9.ch2;

import java.util.Locale;
import java.util.Scanner;

/**
 * calc hours to minutes and seconds for a given number of hours 1 hour has 60 minutes and 1 hour has 3600 seconds
 */
public class HoursToMin {
    public static void main(String[] args) {
        //Δήλωση και αρχικοποίηση μεταβλητών
        Scanner scanner = new Scanner(System.in);
        final int MINUTES= 60;
        final int SECONDS = 3600;
        int hours = 0;
        int minutes = 0;
        int seconds = 0;

        //Εντολές
        //Πάρε input από τον χρήστη
        System.out.println("Please insert the number of hours");
        hours = scanner.nextInt();

        //Επεξεργάσου το input -- expressions
        minutes = hours * MINUTES;
        seconds = hours * SECONDS;

        //Δώσε στον χρήστη αποτέλεσμα
        System.out.printf(Locale.US, "The number of minutes is: %,d\n", minutes);
        System.out.printf(Locale.forLanguageTag("el"), "The number of seconds is: %,d\n", seconds);

    }
}
