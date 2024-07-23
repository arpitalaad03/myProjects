import java.util.*;
public class test{
    public static void main(String[]  args) {
        int i = 10;
        if (i++ == i)   //i actual value did not change and therefore 11=!10
            System.out.println(i + " is good");
        else
            System.out.println(i + " is bad");

        int j = 20;    //j actual value got changed and therefore 21=21
                if (++j == j)
            System.out.println(j + " is good");
        else
            System.out.println(j + " is bad");
    }}
