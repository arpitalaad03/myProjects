//reverse of a number
import java.util.*;
public class digit2 {
    public static void  main(String[] args){
        Scanner scn =new Scanner (System.in);
        int n=scn.nextInt();
        int dig=0;
      //  while(n!=0){
        while(n>0){
            dig=n%10;
            n=n/10;
            System.out.print(dig);
            }

        }}

