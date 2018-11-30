/* IMPORTANT: Multiple classes and nested static classes are supported */


import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.math.BigInteger;
import java.util.*;
import java.math.BigDecimal;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

public class TwoGroups {

        public static void main(String args[]) throws Exception {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            for (int i = 0; i < t; i++) {

                int n = sc.nextInt();
                long total = (calculatePower(2,n));
                System.out.println(total);
            }

        }

        static long calculatePower(long x, long y) {
            int mod = 1_000_000_007;
            long res = 1;     // Initialize result

            while (y > 0) {
                // If y is odd, multiply x with result
                if ((y & 1)!=0)
                    res = (res * x)%mod;

                // y must be even now
                y = y >> 1; // y = y/2
                x = (x * x)%mod; // Change x to x^2
            }
            return (res-2+mod)%mod;
        }
    }