import java.util.*;
public class pattern10 {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int r=scn.nextInt();
        int os=r/2;
        int is=-1;
        for (int i=1;i<=r;i++){
             for (int j=1;j<=os;j++){
                System.out.print("\t");
            }
             System.out.print("*\t");
             for(int k=1;k<=is;k++){
                 System.out.print("\t");
             }
             if ((i>1)&&(i<r)){
                System.out.print("*");}
            if(i<=r/2){
                os--;
                is=is+2;
            }
            else{
                os++;
                is=is-2;
            }
            System.out.println();
        }
    }
}