public class stat {
    public static void main(String[] srgs) {
        System.out.println(findGcd(1,1));
    }
    static boolean findGcd(int n,int j){
        for (int i=1;i<=n;i++)
            if (n%i==0){
                System.out.println(n/i);
                if ((n/i)>j)
                return true;
            }
        return false;
    }
}
