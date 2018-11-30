/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/

//import for Scanner and other utility classes
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

public class EqualArray {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
        */
        //Scanner
        //Scanner s = new Scanner(System.in);
        int t = 1;//s.nextInt();
        for(int i=0;i<t;i++){
            int sizeofArray=5;//s.nextInt();
            //int arr[]=new int[sizeofArray];
            int arr[]={1,2,3,2,1};
            int totalSum=0;
            for(int j=0;j<sizeofArray;j++){
//                int curr=s.nextInt();
//                arr[j]=curr;
                totalSum+=arr[j];

            }
            findIndex(arr,sizeofArray,totalSum);
        }
        // Writing output to STDOUT



        // Write your code here

    }

    private static void findIndex(int[] arr, int sizeofArray, int totalSum) {
        int index=-1;
        int sum=Integer.MAX_VALUE;
        int curr_Sum=0;
        int left_sum=0;
        for(int i=0;i<=sizeofArray/2;i++){
            curr_Sum+=arr[i];
            left_sum=totalSum-curr_Sum;
            if(left_sum-curr_Sum<sum){
                sum=left_sum-curr_Sum;
            }
        }
        System.out.println(sum);
    }
}
