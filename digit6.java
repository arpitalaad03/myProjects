//HCF and LCM of two numbers
import java.util.*;
public class digit6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
       int m=0;
        //finding HCF first.
      if (n1 >= n2) {
          m = n2;
        } else {
          m = n1;
        }
         System.out.println("the min among these are "+m);
     /*  E1 int m=0;
        if ( n1 == n2) {
            System.out.println("The HCF of the two numbers are "+n1);
        }
        else{
            m=n1>n2 ? n2 :n1;
        }
        E2  for (int hcf = m; hcf <= 2; hcf--) {
             if (((n1 % hcf) == 0) && ((n2 % hcf) == 0))
            {
                System.out.println("The HCF of the two numbers are " + hcf);
            }else{
            i--;}
        */
       int hcf=m;
       while(m>=2){
           if (((n1 % hcf) == 0) && ((n2 % hcf) == 0))
           {
               System.out.println("The HCF of the two numbers are " + hcf);
               break;
           }else{hcf--;}
       }
       //time for LCM
        //since hcf*lcm=n1*n2
        int lcm=((n1*n2)/hcf);
        System.out.println("The LCM of the two numbers are " + lcm);

        /*-------------ANOTHER APPROACH---------------
        int temp1=n1;
        int temp2=n2;
        while(n1%n2!=0){
        int rem=n1%n2;
        n1=n2;
        n2=rem;
        }
        int hcf=n2;
        System.out.println(hcf);
         //since hcf*lcm=n1*n2
          int lcm=((temp1*temp2)/hcf);
        System.out.println("The LCM of the two numbers are " + lcm);

        ------------*------------ */


        }
    }



