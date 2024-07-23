//if-else inside else condition
import java.util.*;
public class cond2 {
    public static void main(String[] args){
        int x=4;
        int y=6;
        if(x==y){
            System.out.println(x+" is equals to "+y);
        }
        else{
            if(x>y){
                System.out.println(x+" is greater than "+y);
            }
            else{
                System.out.println(x+" is smaller than "+y);
            }
        }
    }
}
