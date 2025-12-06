package gr.aueb.cf.cf9.ch8;

/**
 * null pointer exception demo
 */
public class NpeApp {

    public static void main(String[] args) {
        String s;

        s = getOneOrNull();

        if (s == null) {            //state test
            System.out.println("s is null");
            return;
        }
        System.out.println(s.length());
    }

    private static String getOneOrNull() {
        return null;
    }
}
