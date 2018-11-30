import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class TwoGrps {

    public static void main(String args[]) throws Exception {

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        PrintWriter pw = new PrintWriter(System.out);
        //new TwoGrps().solve(br, pw);
        new TwoGrps().solve();

    }

    void solve() throws Exception {

        //int T=Integer.parseInt(br.readLine());

        long M=1000000007;
        long N=5;

            long modExp=modExponentiation(2, N,M);
            if(modExp<2)
            {
                modExp=modExp+M;
            }
        System.out.println(modExp-2);



    }

    private long modExponentiation(long num, long pow, long mod) {

        long result=1;
        while(pow>0)
        {
            if(pow%2==1)
            {
                result=(result*num)%mod;
            }
            num=(num*num)%mod;
            pow=pow/2;
            //System.out.println(result+" "+pow+" "+num);
        }
        return result;
    }
}