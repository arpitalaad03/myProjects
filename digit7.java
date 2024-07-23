//factorisation
import java.util.*;
public class digit7 {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        for(int i=1;i<=n;i++) {
            if(n%i==0){
                System.out.println("the factor of the inputted number is "+i);
            }

    }
}}
