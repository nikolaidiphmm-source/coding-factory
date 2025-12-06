package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

/**
 * Μετατρέπουμε τα κιλά σε γραμμάρια, όπου 1 κιλό = 1000 γραμμάρια
 */
public class KiloToGrams {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int THOUSAND = 1000;
        int inputKilos = 0;
        int inputGramms = 0;

        System.out.println("Παρακαλώ εισάγετε το βάρος σας σε κιλά: ");
        inputKilos = scanner.nextInt();
        inputGramms = inputKilos * THOUSAND;

        System.out.printf("Βάρος σε κιλά: %d, Βάρος σε γραμμάρια %d\n", inputKilos, inputGramms);
    }
}
