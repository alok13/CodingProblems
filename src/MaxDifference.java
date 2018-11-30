//Given an array arr[] of integers,
// find out the maximum difference between
// any two elements such that larger element
// appears after the smaller number.

public class MaxDifference {

    public static void main(String[] args)
    {
        MaxDifference maxdif = new MaxDifference();
        int arr[] = {1, 2, 90, 10, 110};
        int size = arr.length;
        System.out.println("MaximumDifference is " +
                maxdif.maxDiff(arr, size));
    }

    private int maxDiff(int[] arr, int size) {
        int max_Diff = 0;
        int min_Num=arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i]-min_Num>max_Diff)
                max_Diff=arr[i]-min_Num;
            if(arr[i]<min_Num)
                min_Num=arr[i];
        }
        return max_Diff;
    }
}
