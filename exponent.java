import java.util.*;
public class exponent {
    public static void main(String args[]){
        int a=2;
        int b=3;
        int prd=a*b;
        System.out.println("product is "+prd);
        System.out.println("power is "+Math.pow(a,b));  //it bydefault gives value in double
        int exp=(int) Math.pow(a,b);                    //therefore we have mentioned int
        System.out.println("power in int is "+exp);

    }
}
