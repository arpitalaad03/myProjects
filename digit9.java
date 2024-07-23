//pythagorean triplets
import java.util.*;
public class digit9 {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int a=scn.nextInt();
        int b=scn.nextInt();
        int c=scn.nextInt();
        int max=a;
        if(b>=max){
            max=b;}
        if (c >= max) {
            max=c;}

        if (max == a) {
            System.out.println((a*a)==(b*b+c*c));
        } else if (max == b) {
            System.out.println((b*b)==(a*a+c*c));
        }else{
            System.out.println((c*c)==(b*b+a*a));
        }
    }
}
