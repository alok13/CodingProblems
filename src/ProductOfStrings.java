package Utils;

public class ProductOfStrings {

    public static void main(String args[]){
        String A= "ababa";
        int a[]={1,2,1,2};

        method(a);
    }

    private static void method(int a[]) {
        int count=0;
        int out=processArray(a);
        while(out!=-1 ){
            if(a[out]==1){
                a[out]=a[out]-1;
            }else{
                a[out]=a[out]+1;
            }
            count++;
            System.out.println(count);
            out=processArray(a);

        }

        System.out.println(count);
    }

    private static int processArray(int[] a) {
        for (int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(isSqr(a[i]*a[j])){
                    return j;
                }
            }
        }
        return -1;
    }

    private static boolean isSqr(int i) {
        double sqr=Math.sqrt(i);
        return (sqr-Math.floor(sqr))==0;
    }


}
