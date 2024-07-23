//diff between .nextLine and .next
//will take just the whole next line in comparision to just the next word.
import java.util.*;
public class diffBetween {
    public static void main(String args[]){
            Scanner scn= new Scanner(System.in);
            String a= scn.nextLine();
            System.out.println("your whole string is "+a);
        String b= scn.next();
        System.out.println("your whole string is "+b);
    }

}
