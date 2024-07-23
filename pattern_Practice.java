import java.util.*;
public class pattern_Practice {
    public static void main(String[] args) {
        /*
        1
      2 3 2
    3 4 5 4 3
       2 3 2
         1
         Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int os = n / 2;
        int st = 1;
        int a = 1;
        for (int i = 1; i <= n; i++) {
            int x = a;
            for (int j = 1; j <= os; j++) {
                System.out.print("\t");
            }
            for (int k= 1; k <= st; k++) {
                System.out.print(x + "\t");
                if (k <= st / 2) {
                    x++;
                } else {
                    x--;
                }
            }
                System.out.println();
                if (i <= n / 2) {
                    os--;
                    st += 2;
                    a++;
                } else {
                    os++;
                    st -= 2;
                    a--;
                }
            }
        }
    }
//doneeeeeeeeeeeeeeey!!!

        1   1
        12 21
        12321

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sp = (2 * n - 3);
        int st=1;
        for (int i = 1; i <= n; i++) {
            int a=1;
            for (int j = 1; j <= st; j++) {
                System.out.print(a+"\t");
                a++;
            }
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }
            if(i==n){
                a--;
                st--;
            }
            for(int k=1;k<=st;k++){
                a--;
                System.out.print(a+"\t");

            }
            System.out.println("");
            sp-=2;
            st++;

        }
    }
}

        doneeeeeey!!!

          *
          **
        *****
          **
          *

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sp = n / 2;
        int st = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sp; j++) {
                if (i == n / 2+1) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            for (int j = 1; j <= st; j++) {
                System.out.print("*\t");
            }
            if (i <= n / 2) {
                st++;
            } else {
                st--;
            }
            System.out.println();
        }
    }
}
doneeeeeeey!!

         * * * * * * *
           *       *
             *   *
               *
             * * *
           * * * * *
         * * * * * * *


        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sp=0;
        int st=n;
        for (int i = 1; i <= n; i++) {
            for(int j=1;j<=sp;j++){
                System.out.print("\t");
            }
            for (int j= 1; j <= st; j++) {
                if(i>1&&i<=n/2) {
                    if (j == 1 || j == st) {
                        System.out.print("*\t");
                    } else {
                        System.out.print("\t");
                    }
                }else{
                    System.out.print("*\t");
                }
            }
            System.out.println();
            if(i<=n/2){
                sp++;
                st-=2;
            }else{
                sp--;
                st+=2;
            }
        }
    }
}
doneeeeeeey!!!!
         */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int st = n;
        for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= st; j++) {
                    if(i==1){
                        if(j==n||j<=n/2+1) {
                            System.out.print("*\t");
                        }
                        else{
                            System.out.print("\t");
                        }
                    }
                    else if(i<n/2+1) {
                        if (j == n / 2 + 1 || j == n) {
                            System.out.print("*\t");
                        } else {
                            System.out.print("\t");
                        }
                    }
                    else if(i>n/2+1&&i<n) {
                        if (j == n / 2 + 1 || j == 1) {
                            System.out.print("*\t");
                        } else {
                            System.out.print("\t");
                        }
                    }
                    else if(i==n/2+1){
                        System.out.print("*\t");
                    }
                    else {
                        if (j == 1 || j >= n / 2 + 1) {
                            System.out.print("*\t");
                        } else {
                            System.out.print("\t");
                        }
                    }
                }
                System.out.println();
        }
    }
}





