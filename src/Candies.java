 /* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

 import java.util.Scanner;

 public class Candies {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
            */
        //Scanner
       // Scanner s = new Scanner(System.in);
        String stringInput = "babammm";//s.nextLine();
        int testCases=2;//s.nextInt();
        int arr[]={2,5};
        for(int i=0;i<testCases;i++){
            int size=arr[i];//s.nextInt();
            containsPalindrome(stringInput,size);
        }
    }

     private static void containsPalindrome(String stringInput, int size) {
        int count=-1;
        for(int i=0;i<stringInput.length()-size;i++){
            String testString=stringInput.substring(i,size);
            if(isPalindrome(testString)){
                System.out.println(size);
                return;
            }
        }
         System.out.println(count);
     }

     private static boolean isPalindrome(String testString) {
        int arr[]=new int[26];
        for(int i=0;i<testString.length();i++)
            arr[(int)(testString.charAt(i)-'a')]++;

            // Count odd occurring characters
            int odd = 0;
            for (int i = 0; i < arr.length; i++)
            {
                if ((arr[i] & 1) == 1)
                    odd++;

                if (odd > 1)
                    return false;
            }

            // Return true if odd count is 0 or 1,
            return true;

     }
 }
