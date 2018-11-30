/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/

/*

Poisonous gas
You are in a battle field and your enemy has an army of N soldiers. Each soldier has a strength denoted by an array A. Your enemy will select some soldiers such that total strength of selected soldiers is maximum. You have a poisonous gas and you can use it on the selected soldiers as many times as you want. If the total strength is even, the poisonous gas will decrease the total strength of the selected soldiers to half of the total strength, otherwise it will not affect them. Your task is to tell if its possible to reduce the total strength to 1 or not.



Input Format:

First line contains an integer T, denoting the number of test cases.

First line of each test case contains an integer N, denoting the number of soldiers.

Second line of each test case contains N space-separated integers, denoting the strength of the soldiers.



Output Format:

For each test case, print Yes if its possible to reduce the total strength to 1, otherwise print No.
 */

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

import java.util.Scanner;

public class PoinsousGas {
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
        int number = s.nextInt();                 // Reading input from STDIN

        for(int i=0;i<number;i++){
            int numberOrSolider=s.nextInt();
            int max_Count=0;
            for(int j=0;j<numberOrSolider;j++){
                int strength=s.nextInt();
                if(max_Count+strength>max_Count){
                    max_Count=max_Count+strength;
                }
            }
            System.out.println(isPowerOfTwo(max_Count)? "YES" :"NO");
        }



        // Write your code here

    }

    private static boolean isPowerOfTwo (int x)
    {
      /* First x in the below expression is
        for the case when x is 0 */
        return x!=0 && ((x&(x-1)) == 0);

    }
}
