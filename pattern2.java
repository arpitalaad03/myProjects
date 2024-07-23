import java.util.*;
public class pattern2 {
public static void main(String[] args){
    Scanner scn=new Scanner(System.in);
    System.out.println("Enter the no. of rows");
    int r=scn.nextInt();
    for (int i=r;i>=1;i--){
       for(int j=i;j>=1;j--){
           System.out.print("*");
           System.out.print(" ");
        }
        System.out.println();
    }

}}
