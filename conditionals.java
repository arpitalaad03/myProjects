//if-else condition
import java.util.*;
public class conditionals {
    public static void main(String[] args) {
       Scanner scn =new Scanner(System.in);

       int x=scn.nextInt();
        if (x % 2 == 0) {
            System.out.println(x + " is an even number");
        } else {
            System.out.println(x + " is an odd number");
        }
    }
}