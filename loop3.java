//taking string and integer input at once
import java.util.*;
public class loop3 {
    public static void main(String[] args){
        Scanner scn= new Scanner (System.in);
        //int n=scn.nextInt();            //was not taking input
        int n= Integer.parseInt(scn.nextLine());
        String name=scn.nextLine();
        System.out.println(" dear "+name+" your counting is ");
        for(int i=0;i<=n;i++){
            System.out.println(i);
        }
    }
}
