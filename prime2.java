//Understanding the Problem:
//You have to print all prime numbers between a range.
//Take as input "low", the lower limit of range.
//Take as input "high", the higher limit of range.
//For the range print all the primes numbers between low and high (both included).
//2 <= low < high < 10 ^ 6
import java.util.*;
public class prime2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int low = scn.nextInt();               //lower limit
        int high = scn.nextInt();              //upper limit
        for (int i = low; i <= high; i++) {
            int count = 0;
            for (int div = 2; div * div <= i; div++) {
                if (i % div == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println(i + " is a prime number ");
            }
            else{
                System.out.println(i+" is not a prime number ");
            }
        }
    }
}



