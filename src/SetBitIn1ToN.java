//Given a positive integer n, count the total number of set
// bits in binary representation of all numbers from 1 to n.

/*
https://stackoverflow.com/questions/7942732/number-of-1s-in-the-twos-complement-binary-representations-of-integers-in-a-ran
 */

public class SetBitIn1ToN {
    public static void main(String args[]) {
        System.out.println(solve(17));
    }

    static int count(int a) {
        int sum = 0;
        while (a>0) {
            sum += 1;
            a = a & (a - 1);
        }
        return sum;
    }

    static long solve(int a) {
        if (a == 0) return 0;
        if (a % 2 == 0) return solve(a - 1) + count(a);
        return ((long) a + 1) / 2 + 2 * solve(a / 2);
    }
}
