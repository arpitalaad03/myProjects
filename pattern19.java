import java.util.*;
public class pattern19 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int r = scn.nextInt();
        int st = r;
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= st; j++) {
                if (i == 1) {
                    if((j==r) ||( j <= r / 2+1)) {
                        System.out.print("*\t");
                    }else {
                        System.out.print("\t");
                    }
                } else if (i <= r / 2) {
                    if(j==r/2+1||j==r){
                        System.out.print("*\t");
                    }else{
                        System.out.print("\t");
                    }
                } else if (i == r / 2 + 1) {
                        System.out.print("*\t");
                } else if (i<r ) {
                    if(j==1||j==r/2+1){
                        System.out.print("*\t");
                    }else{
                        System.out.print("\t");
                    }
                } else {
                    if((j==1 )||( j>=r/2+1)){
                        System.out.print("*\t");
                    }else{
                        System.out.print("\t");
                    }
                }
            }
            System.out.println();
        }
    }
}

