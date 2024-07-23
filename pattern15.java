import java.util.*;
public class pattern15 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int r = scn.nextInt();
        int sp = r / 2;
        int st = 1;
       /*-------FOR STAR DIAMOND----------
       for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }
            for (int k = 1; k <= st; k++) {
                System.out.print("*\t");   //for 0th form     //CHANGE * TO 1 for 1st form
            }
            System.out.println();
            if (i <= r / 2) {
                sp--;
                st=st+2;
            } else {
                sp++;
                st=st-2;
            }
        }
        */
        int n = 1;
        for (int i = 1; i <= r; i++) {
            int a = n;
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }
            for (int k = 1; k <= st; k++) {
                System.out.print(a + "\t");
               // a++;        for 4th form
               if (k<=st/2){
                    a++;
                } else {
                    a--;
                }
            }
            System.out.println();
            //n++;               for 2nd form
            if (i <= r / 2) {
                sp--;
                st = st + 2;
                n++;
            } else {
                sp++;
                st = st - 2;
                n--;     //for 3rd form
            }
        }
    }
}
