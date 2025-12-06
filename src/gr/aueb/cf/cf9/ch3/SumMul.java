package gr.aueb.cf.cf9.ch3;

/**
 * sum of 10 numbers, from 1 to 10.
 * product of 10 numbers
 */
public class SumMul {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1 ;
        int mul = 1;
        int j =1 ;

        while (i <= 10) {
            sum += i; //sum = sum + 1
            i++ ;
        }
        while (j <= 10){
            mul *= j;
            j++ ;
        }

        System.out.println("Sum = " + sum);
        System.out.println("Mul = " + mul);
    }
}
