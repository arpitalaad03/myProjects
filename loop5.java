//use of post increment and pre increment
import java.util.*;
public class loop5 {
    public static void main(String[] args){
        int x=1;
        int y=x++;               //increments the value of x but still uses the original value .It has increased the value of x to 2 but has taken the original value of y as 1.
        int z = ++x;                //first increments the value of x and then uses the value of x. It has firstly increased the value of x to 3 and then had taken the value of z as 3.
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
}
}