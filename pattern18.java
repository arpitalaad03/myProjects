import java.util.*;
public class pattern18 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int r = scn.nextInt();
        int os=0;
        int st=r;
        int is=r-4;
      /*  int os = 0;
        int is = r - 4;
        int st = 1;
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= os; j++) {
                System.out.print("\t");
            }
            for (int k = 1; k <= r; k++) {
                if ((i == k )||( (i + k)==( r + 1))){
                    System.out.print("*\t");
                } else if (i == 1) {
                    for (int c = 1; c<= r; c++) {
                        System.out.print("*\t");
                    }
                } else if (i > r / 2) {
                    for (int a = 1; a <= st; a++) {
                        System.out.print("*\t");
                    }
                } else if (( r / 2)>=i&&i>1) {
                    System.out.println("*");
                    for (int b = 1; b <= is; b++) {
                        System.out.print("\t");
                    }
                        System.out.println("*");
                }
            }
            System.out.println();
            if (i <= (r / 2)) {
                os++;
                is = is - 2;
            } else {
                os--;
                st = st + 2;
            }
        }*/
        for(int i=1;i<=r;i++) {
            for (int j = 1; j <= os; j++) {
                System.out.print("\t");
            }
            for (int k = 1; k <= st; k++) {
                if (i > 1 && i <= r / 2 && k > 1 && k < st) {
                    System.out.print("\t");
                } else {
                    System.out.print("*\t");
                }
            }
            System.out.println();
            if(i<=r/2){
                os++;
                st=st-2;
                is=is-2;
            }else{
                os--;
                st=st+2;
            }
        }
    }
}
