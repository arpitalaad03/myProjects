 //digit of a number
import java.util.*;
public class digit3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int dig = 0;
        int temp = n;
        while (temp != 0) {
            temp = temp / 10;
            dig++;
        }
        ;
        System.out.println("count of digits in your number is " + dig);
        int div = (int) Math.pow(10, dig - 1);
        while (div != 0) {
            int quotient =( n /div);
            System.out.println("the digits of your number are " + quotient);
            n=n%div;
            div=div/10;
        }
    }
}


