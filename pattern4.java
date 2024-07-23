import java.util.*;
public class pattern4{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int r = scn.nextInt();
       /* for (int i = r; i>=1; i--) {
            for (int j=r-1;j>=i;j--) {
                System.out.print("\t");
            }
            for (int k =i; k>=1; k--) {
                System.out.print("*\t");
            }
            System.out.println();
        }
        /*-----------ANOTHER APPROACH-----------*/
            int sp=0;
            int st=r;
            for(int i=1;i<=r;i++){
                for(int j=1;j<=sp;j++){
                    System.out.print("\t");
                }
                for(int k=1;k<=st;k++){
                    System.out.print("*\t");
                }
                System.out.println();
                sp++;
                st--;
            }
    }
}
