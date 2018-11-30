

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
Bob has an array A[] of N integers. Initially, all the elements of the array are zero.
Bob asks you to perform Q operations on this array.

There are three types of operations that can be performed:

 1 X: Update the value of A[X] to  2 * A[X] + 1.
 2 X: Update the value A[X] to  A[x]/2 , where  is Greatest Integer Function.
 3 X Y: Take all the A[i] such that  X <= i <= Y and convert them into their corresponding binary strings.
 Now concatenate all the binary strings and find the total no. of '1' in the resulting string.
Note: It is guaranteed that there is at least 1 type-3 query in the every test case. All the array elements will fit into 64 bit integers.

Input Format:
First line consists of two space-separated integers N and Q.
Next, Q lines consist of Q operations of either of the 3 types as described above.
 */

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ArrayQueries {
    public static void main(String args[]) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input*/

        //BufferedReader
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String firstLine = br.readLine();
//        String[] strs = firstLine.trim().split("\\s+");
        //int[] array = new int[Integer.valueOf(strs[0])];
        int[] array = new int[5];
        //for (int i = 0; i < Integer.valueOf(strs[1]); i++) {
        for (int i = 0; i < 5; i++) {
            String arr[]={"1 1","1 2", "1 3","3 1 3","3 2 4"};
            //String inputLine = br.readLine();
            String inputLine = arr[i];
            String[] input = inputLine.trim().split("\\s+");
            if(input.length>2){
                calculateSetBit(input,array);
            }else{
                operateArray(input,array);
            }
        }


    }

    private static void operateArray(String[] input, int[] array) {
        int first=Integer.valueOf(input[0]);
        int second=Integer.valueOf(input[1])-1;
        if(first==1){
        array[second]=2*array[second]+1;
        }else{
            array[second]=array[second]/2;
        }
    }

    private static void calculateSetBit(String[] input, int[] array) {
        int count=0;
        int start=Integer.valueOf(input[1])-1;
        int end=Integer.valueOf(input[2])-1;
        for(int i=start;i<=end;i++){
            int n=array[i];
            while (n>0)
            {
                count += n & 1;
                n >>= 1;
            }
        }
        System.out.println(count);

    }
}
