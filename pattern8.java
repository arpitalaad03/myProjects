import java.util.*;
public class pattern8 {
public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int r = scn.nextInt();
    int sp = r - 1;
    int st = 1;
    /* ---------------ANOTHER APPROACH---------------
      for (int i = 1; i <= r; i++) {
        for (int j = 1; j <= sp; j++) {
            System.out.print("\t");
        }
        for (int k = 1; k <= st; k++) {
            System.out.print("*\t");
        }
        System.out.println();
        sp--;
    }
 */

        for(int i=1;i<=r;i++){
            for (int j=1;j<=r;j++) {
                if (i+j==(r+1)) {
                    System.out.print("*");
                    break;
                } else {
                    System.out.print("\t");
                }
            }
                System.out.println();
            }

}
}
