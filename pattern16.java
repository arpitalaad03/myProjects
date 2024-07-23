

import java.util.*;
public class pattern16 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int r = scn.nextInt();
        int sp=2*r-3;
        int st=1;
        for (int i=1;i<=r;i++){
            int val=1;
            for(int j=1;j<=st;j++) {
                System.out.print( val+"\t");
                val++;
            }
            for (int k =1; k <=sp; k++) {
                    System.out.print("\t");
                }
            if(i==r){
                st--;
                val--;
            }
            for(int j=1;j<=st;j++){
             val--;
             System.out.print(val+"\t");
            }
                System.out.println();
                st++;
                sp = sp - 2;
            }
        }
    }

