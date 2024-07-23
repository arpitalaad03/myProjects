//rotate a number
import java.util.*;
public class digit5 {
        public static void main(String[] args){
            Scanner scn = new Scanner(System.in);
            int input = scn.nextInt();
            int n=input;
            int dig=0;
            while(n>0) {
                n = n / 10;
                dig++;
            }
            System.out.println("the no of digits in your number is "+ dig);
            System.out.println("enter the amount of places by which you want it to rotate");
            int ro=scn.nextInt();
            ro=ro%dig;
            if (ro < 0) {
                ro=ro+dig;
            }
                // E1
                // for(int i =ro;i<=dig;i++){
                int a = (int) Math.pow(10, ro);
                int b=input%a;      //remainder
                int c=input/a;
                int d=(int)Math.pow(10,dig-ro);
                int fnum=b*d+c;
                /*int c1=c;
                int dig2=0;
                while(c1>0){
                    c1=c1/10;
                    dig2++;
                }
                System.out.println(dig2);
              int fnum=(int)(b*Math.pow(10,dig2))+c;*/
              System.out.println("the number after rotation is "+fnum);

              /*----------ANOTHER APPROACH----------
              System.out.println("enter number");
               int n = scn.nextInt();
                System.out.println("enter the amount of places by which you want it to rotate");
               int k=scn.nextInt();
                int temp=n;
               int nod=0;
               while(temp>0) {
                temp=temp / 10;
                nod++;
                }
            System.out.println("the no of digits in your number is "+ nod);
               int div=1;
               int mul=1;
              for(int i=1;i<=nod;i++) {
                  if (i <= k) {
                      div = div * 10;
                  } else {
                      mul = mul * 10;
                  }
              }
              int quo=n/div;
              int rem=n%div;
              int fnum=rem*mul+quo;
              System.out.println("the rotated number is "+fnum);
              -------------------*/

            }
        }

