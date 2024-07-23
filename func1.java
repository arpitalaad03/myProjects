//finding nPr of any number
//traditional code
/*
import java.util.*;
public class func1 {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int r=scn.nextInt();
        int nfact1=1;
        for (int i=1;i<=n;i++){
            nfact1 *= i;
        }
        int nfact2=1;
        for (int i=1;i<=(n-r);i++){
            nfact2 *= i;
        }
        int npr = (nfact1)/(nfact2);
        System.out.println(n+"p"+r+"="+npr);
    }
}
*/
import java.util.*;
public class func1 {
    public static void display(int n, int r, int npr) {
        System.out.println(n + "p" + r + "=" + npr);
    }

    public static int factorial(int x) {
        int a= 1;
        for (int i = 1; i <= x; i++) {
            a *= i;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int r = scn.nextInt();
        int s=n-r;
        int fact1 = factorial(n);
        int fact2 = factorial(s);
        int npr = fact1 / fact2;
        display(n, r, npr);
    }
}








