import java.util.*;
public class pattern20 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int r = scn.nextInt();
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= r; j++) {
                if(j==1||j==r){
                    System.out.print("*\t");
                }else if(i>=r/2+1 && (i==j || i+j==r+1)){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
