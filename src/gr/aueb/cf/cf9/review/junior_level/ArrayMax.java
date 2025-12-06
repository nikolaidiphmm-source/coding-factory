package gr.aueb.cf.cf9.review.junior_level;
/*
οι μεταβλητές a, m δεν είναι καλά ονόματα
ο κώδικας θα μπορούσε να είναι μέθοδος
δεν έχει documentation
δεν έχει έλεγχος για κενό array
δεν έχει δομή
δεν έχει soc
 */
public class ArrayMax {
    public static void main(String[] args) {
        int [] a = {1, 2, 3, 4, 5 };
        int m = a[0];

        for (int i = 1; i <a.length; i++) {
            if (a[i] > m) {
                m = a[i];
            }
        }
        System.out.println(m);
    }
}
