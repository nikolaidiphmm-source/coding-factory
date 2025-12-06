package gr.aueb.cf.cf9.ch7;

public class StrEtc {
    public static void main(String[] args) {

        //traverse as array
        String s = "Coding Factory";

        for(char ch : s.toCharArray()) {
            System.out.print(ch + " ");
        }
        System.out.println("\u2764");

        //replace
        String firstname = "Maria-Helen";
        String simpleName = firstname.replace("-", " ");

        //Concat
        String lastName = "Smith";
        String fullName1 = firstname + " " + lastName;
        String fullName2 = firstname.concat(" ").concat(lastName);
    }
}
