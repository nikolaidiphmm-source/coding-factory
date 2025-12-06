package gr.aueb.cf.cf9.ch7;

/**
 * μετατρέπει σε lower case και se upper case
 */
public class StrUpperLower {
    public static void main(String[] args) {
        String s1 = "Athens";
        String s2 = "athens";

        //equalIgnoreCase() με normalization σε uppercase
        boolean isEqual = s1.toUpperCase().equals(s2.toUpperCase());
        boolean isEqual2 = s1.toLowerCase().equals(s2.toLowerCase());

    }
}
