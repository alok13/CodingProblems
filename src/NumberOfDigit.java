/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/

//import for Scanner and other utility classes
import java.math.BigInteger;
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
        */
        //Scanner
        Scanner s = new Scanner(System.in);
//        int n = s.nextInt();
//        for(int i=0;i<n;i++){
          // int number=s.nextInt();
        BigInteger number=s.nextBigInteger();
          //  getDigits(3452333232323223232323232323);
//        }

    }

    private static void getDigits(BigInteger n) {
                int count=0;
        while(BigInteger.ZERO.equals(n)){
            n=n.divide(BigInteger.valueOf(3l));
            count++;
        }
        System.out.println(count);
    }



}
