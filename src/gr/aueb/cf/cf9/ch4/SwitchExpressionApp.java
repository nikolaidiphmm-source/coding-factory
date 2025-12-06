package gr.aueb.cf.cf9.ch4;

import java.util.Scanner;

public class SwitchExpressionApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int grade = 0;
        char classification = ' ';

        System.out.println("Please enter a grade: ");
        grade = scanner.nextInt();

        classification = switch (grade) {
            case 1, 2, 3, 4 -> {
                System.out.println("Fail");
                yield 'F';
            }
            case 5, 6 -> {
                System.out.println("Pass");
                yield 'D';
            }
            case 7, 8 -> {
                System.out.println("Good");
                yield 'C';
            }
            case 9 -> {
                System.out.println("Very Good");
                yield 'B';
            }
            case 10 -> {
                System.out.println("Excellent");
                yield 'A';
            }
            default -> {
                System.out.println("Please enter between 1-10");
                yield 'F';
            }
        };
        System.out.println("Classification " + classification);

    }
}
