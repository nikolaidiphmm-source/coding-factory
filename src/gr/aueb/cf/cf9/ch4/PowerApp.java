package gr.aueb.cf.cf9.ch4;

import java.util.Scanner;

/**
 * ο χρήστης εισάγει τα base και power και το πρόγραμμα
 * υπολογίζει το base^power, πχ 2^10 = 1024
 */
public class PowerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base = 0;
        int power = 0;
        int result = 1;

        System.out.println("Please enter base number:");
        base = scanner.nextInt();
        System.out.println("Please enter power number: ");
        power = scanner.nextInt();

        for (int i = 1; i <= power; i++) {
            result *= base;
        }
        System.out.println(base + "^" + power + "=" + result);
    }
}
