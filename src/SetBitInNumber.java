public class SetBitInNumber {

    public static void main(String args[]) {
        int i = 9;
        System.out.println(countSetBits(i));
    }

    private static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            n=n&(n-1);
            count++;
        }
        return count;
    }
}
