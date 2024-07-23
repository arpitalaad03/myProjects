import java.util.*;
public class pattern3 {
public static void main(String[] args){
    Scanner scn=new Scanner(System.in);
    int r=scn.nextInt();
    for (int i=1;i<=r;i++){
      for(int j=(r-i);j>=1;j--){
            System.out.print("\t");
        }
        for(int k=1;k<=i;k++){
            System.out.print("*\t");
        }
        System.out.println();
    }
    /*--------------ANOTHER APPROACH--------------
    int sp=r-1;
    int st=1;
    for(int i=1;i<=r;i++){
        for(int j=1;j<=sp;j++){
            System.out.print("\t");
        }
        for(int k=1;k<=st;k++){
            System.out.print("*\t");
        }
        System.out.println();
        sp--;
        st++;
    } */
}}
