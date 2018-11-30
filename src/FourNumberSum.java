import java.util.HashMap;
import java.util.Map;

public class FourNumberSum {

    public static void main(String args[]) {
        FourNumberSum findfour = new FourNumberSum();
        int A[] = {1, 4, 45, 6, 10, 12};
        int n = A.length-1;
        int X = 21;
        findfour.find4Numbers(A, n, X);
    }

    private void find4Numbers(int[] a, int n, int sum) {
        quickSort(a, 0, n - 1);
       for(int i=0;i<n-3;i++){
           for(int j=i+1;j<n-2;j++){
               int requiredSum=sum-(a[i]+a[j]);
               if(findTwoNumberSum(a,j+1,n,requiredSum)){
                   System.out.println(a[i]);
                   System.out.println(a[j]);
               }
           }
       }
    }

    private boolean findTwoNumberSum(int[] a, int starting, int n, int requiredSum) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=starting;i<n;i++){
            int look=requiredSum-a[i];
            if(map.containsKey(look)){
                System.out.println(a[map.get(look)]);
                System.out.println(a[i]);
                return true;

            }else{
                map.put(a[i],i);
            }
        }
        return false;
    }

    private void quickSort(int[] arr, int low, int high) {

        if (arr == null || arr.length == 0)
            return;

        if (low >= high)
            return;

        // pick the pivot
        int middle = low + (high - low) / 2;
        int pivot = arr[middle];

        // make left < pivot and right > pivot
        int i = low, j = high;
        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }

            while (arr[j] > pivot) {
                j--;
            }

            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        // recursively sort two sub parts

        if (low < j)
            quickSort(arr, low, j);

        if (high > i)
            quickSort(arr, i, high);
    }




//    private int partition(int[] a, int low, int high) {
//        int middle = low + (high - low) / 2;
//        int pivot = a[middle];
//        int i = low;
//        int j = high;
//        while (low < high) {
//            while (a[i] < pivot) {
//                i++;
//            }
//            while (a[j] > pivot) {
//                j--;
//            }
//            if (i <= j) {
//                int temp = a[i];
//                a[i] = a[j];
//                a[j] = temp;
//                i++;
//                j--;
//            }
//
//        }
//        return pivot;
//    }
}
