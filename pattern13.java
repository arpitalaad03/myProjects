import java.util.*;
public class pattern13 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int r = scn.nextInt();
        for (int i=0;i<r;i++){
            int val=1;
            for(int j=0;j<=i;j++){
                System.out.print(val +"\t");
                int nval= val*(i-j)/(j+1);
                val=nval;
            }
            System.out.println();
        }
    }
}
