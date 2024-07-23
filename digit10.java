//benjamin bulbs
import java.util.*;
public class digit10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int i = 1; i*i <= n; i++) {
            System.out.println("The bulbs lightened up are" + (i * i));
        }
    }
}
