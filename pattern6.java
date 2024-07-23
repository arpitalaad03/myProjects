import java.util.*;
public class pattern6 {
    public static void main(String [] args){
        Scanner scn=new Scanner(System.in);
        int r=scn.nextInt();
        int st=(r/2)+1;
        int sp=1;
        for(int i=1;i<=r;i++){
            for (int j=1;j<=st;j++){
                System.out.print("*\t");
            }
            for (int k=1;k<=sp;k++){
                System.out.print("\t");
            }
            for (int j=1;j<=st;j++){
                System.out.print("*\t");
            }
            System.out.println();
            if(i<=r/2) {
                st--;
                sp = sp + 2;
            }
            else{
                st++;
                sp=sp-2;
            }
        }

    }
}
