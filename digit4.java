//inverse of a number
import java.util.*;
public class digit4 {
    public static void main(String[] args){
        Scanner scn= new Scanner(System.in);
         int n=scn.nextInt();
       /*  int dig=0;
         int n=input;
       while(input>0){
           input=input/10;
            dig++ ;
       }
       System.out.println("no of digits are"+dig); */
       int fnumber =0;
        int place=1;
      while(n>0){
           int rem=n%10;
           n=n/10;
           int b;
           b=place *(int)Math.pow(10,rem-1);
           place++;
           fnumber=fnumber+b;

       }
       System.out.println("the inverse of the inputted number is "+fnumber);
    }
}
