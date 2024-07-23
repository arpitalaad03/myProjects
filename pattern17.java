import java.util.*;
public class pattern17 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int r = scn.nextInt();
        int sp = r/2;
        int st = 1;
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= sp; j++) {
                if (i == r / 2+1) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            for(int k=1;k<=st;k++){
                System.out.print("*\t");
            }
            System.out.println();
            if(i<=r/2) {
                st++;
            }else{
                st--;
            }
        }
    }
}

