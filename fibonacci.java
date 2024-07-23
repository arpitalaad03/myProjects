import java.util.*;
public class fibonacci {
    public static void main(String[] args)
    {
        Scanner scn=new Scanner(System.in);
        int times=scn.nextInt();
        int a=0;
        int b=1;
        System.out.println("The Fibonacci series till your entered number is - ");
        for(int i=1; i<=times;i++){
            System.out.println(a);
            int c=a+b;
            a=b;
            b=c;
    }
    }}
