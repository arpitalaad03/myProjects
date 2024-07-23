import java.util.*;
public class pattern1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the amount of rows");
        int r = scn.nextInt();
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= i; j++) {            //ABSTRACTION PROPERTY
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}