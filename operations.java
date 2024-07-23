import java.util.*;
public class operations {
    public static void main (String[] args){
       //addition
        int x=15;
        int y=10;
        int sum=x+y;
        System.out.println("the sum of "+x+" and "+y+" is "+sum);
        //product
        int prd=x*y;
        System.out.println("the product of "+x+" and "+y+" is "+prd);
        //division
        int div1=x/y;
        int div2=y/x;
        System.out.println("the division of "+x+" by "+y+" is "+div1);
        System.out.println("the division of "+y+" by "+x+" is "+div2);
        //remainder
        int rem =x%y;
        System.out.println("the remainder on dividing x by y would be "+rem);
        //BODMASS concept
        int exp1=x*y/x+y;
        int exp2=(x*y)/(x+y);
        System.out.println(exp1);
        System.out.println(exp2);
    }
}
