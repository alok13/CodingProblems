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

public class XorSumSet {
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
        int n = 3;//s.nextInt();
        //int[] arr=new int[n];
        int[] arr={1,2,3};
//        for(int i=0;i<n;i++){
//            arr[i]=s.nextInt();
//        }
        solve(arr,n,0);

        // Writing output to STDOUT



        // Write your code here

    }

    private static void solve(int arr[], int n, int k)
    {
        // Find maximum element in arr[]
        long max_ele = arr[0];
        for (int i=1; i<n; i++)
            if (arr[i] > max_ele)
                max_ele = arr[i];

        // Maximum possible XOR value
        //int m = (1 << (int)(log2(max_ele) + 1) ) - 1;
        int m = countBits(max_ele);

        // The value of dp[i][j] is the number of subsets having
        // XOR of their elements as j from the set arr[0...i-1]
        long[][] dp= new long[n+1][m+1];

        // Initializing all the values of dp[i][j] as 0
        for (int i=0; i<=n; i++)
            for (int j=0; j<=m; j++)
                dp[i][j] = 0;

        // The xor of empty subset is 0
        dp[0][0] = 1;

        // Fill the dp table
        for (int i=1; i<=n; i++)
            for (int j=0; j<=m; j++)
                dp[i][j] = dp[i-1][j] + dp[i-1][j^arr[i-1]];

        //  The answer is the number of subset from set
        //  arr[0..n-1] having XOR of elements as k
        //return dp[n][k];
        System.out.println( dp[n][k]);
    }

    static int countBits(long n)
    {
        int count = 0;
        while (n != 0)
        {
            count++;
            n >>= 1;
        }

        return count;
    }

}
