public class RotateArray {
    public static void main(String args[]){
       int a[]={1,2,3,4,5};
       int n=a.length;
       int k=4;
        int result[]=new int[n];
        int j=0;
        int ll=k-1;
        for(int i=k;i<=n-1;i++){
            result[j]=a[i];
            j++;
        }
        for(int i=0;i<k;i++){
            result[j]=a[i];
            j++;
        }
        for( int i=0;i<n;i++)
            System.out.println(result[i]);
    }
}
