package gr.aueb.cf.cf9.ch4;

/**
 * Εκτυπώνει 10 αστεράκια οριζόντια με for
 */
public class StarHorizontalApp {
    public static void main(String[] args) {
        //in the same line
        for (int i = 1; i <= 10; i++) {
            System.out.print("*");
        }

        // vertical
        for (int j = 1; j <= 10; j++) {
            System.out.println("*");
        }

        //grid
        for (int i = 1; i <=10 ; i++) {
            for (int j = 1; j <= 20; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //1,2,3,..stars
        for (int i = 1; i <= 10; i++) {
            for (int j =1; j <=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // 10,9,8,.. stars
        for (int i = 10; i >= 1; i--) {
            for (int j =1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
