//At first you need to take a number "t" as input representing the count of input numbers to be tested And then take a number "n" as input, "t" number of times.
//All you have to do is for each input value of n, print "prime" if the number is prime and "not prime" otherwise.
// OPTIMIZATION HAD BEEN DONE TWO TIMES TO CHECK FOR THE TIME COMPLEXITY OF THE CODE.
import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the count of input numbers to be tested.");
        int t = scn.nextInt();

        for (int i = 0; i < t; i++) {
            System.out.println("Enter the input for each count.");
            int n = scn.nextInt();
            int count = 0;

              //for(int div=1;div<=n;div++){
            // for (int div = 2; div <= n; div++) {         //OP1
            for (int div = 2; div* div <= n; div++) {         //OP2
                  if (n % div == 0) {
                    count++;
                   break;              //OP3
                }
              }
                //if(count==2){
                //if(count==1){            //OP1
                if (count == 1) {           //OP2
                    System.out.println("prime");
                }
                else {
                    System.out.println("not prime");
                }
            }
        }

}
