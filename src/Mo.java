/*
 * Mo's algorithm: Offline algorithm that reorders the queries to efficiently solve them.
 *
 * Time complexity: O(M sqrt(N) * cost) where M is the number of queries, N is the length of the array, and cost is the cost of each operation.
 * 
 * Using Mo's algorithm to determining the number of distinct numbers in a subsequence.
 * Reference problem: http://www.spoj.com/problems/DQUERY/
 */



        import java.io.IOException;
        import java.util.*;

public class Mo {



    static int n, m, sz;
    static int[] cnt, a, ans;

    static int res;

    public static void main (String[] args) throws IOException {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();                 // Reading input from STDIN


        //n = readInt();
        sz = (int)Math.sqrt(n);

        a = new int[n + 1];
        for (int i = 1; i <= n; i++)
            a[i] = s.nextInt();
        cnt = new int[1000001];

        m = s.nextInt();
        Query[] q = new Query[m];
        for (int i = 0; i < m; i++)
            q[i] = new Query(s.nextInt(), s.nextInt(), i);
        ans = new int[m];

        Arrays.sort(q);
        int l = 1, r = 0;
        for (Query query : q) {
            List<Integer> list=new ArrayList<>();
            while (r > query.r) {
                remove(a[r]);
                r--;
            }
            while (r < query.r) {
                r++;
                update(a[r]);
            }
            while (l < query.l) {
                remove(a[l]);
                l++;
            }
            while (l > query.l) {
                l--;
                update(a[l]);
            }
            ans[query.index] = res;
        }
        int sum=0;
        for (int i : ans){
            sum+=i;
        }
        System.out.println(sum);

    }

    static void update(int i) {

        if (cnt[i]%2!=0)
            res+=cnt[i];
        cnt[i]++;
    }

    static void remove(int i) {

        if (cnt[i]%2 == 0)
            res-=cnt[i];
        cnt[i]--;
    }

    static class Query implements Comparable<Query> {
        int l, r, index;

        Query (int l, int r, int index) {
            this.l = l;
            this.r = r;
            this.index = index;
        }

        @Override
        public int compareTo (Query o) {
            if ((l - 1) / sz != (o.l - 1) / sz)
                return (l - 1) / sz - (o.l - 1) / sz;
            return r - o.r;
        }
    }

}
