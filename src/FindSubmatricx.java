import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class FindSubmatricx {

    public static void main(String args[] ) throws Exception {


        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
        String sp[]=name.split("\\s+");
        int n=Integer.parseInt(sp[0]);
        int m=Integer.parseInt(sp[1]);
        int[][] array= new int[n][m];
        for(int i=0;i<n;i++){
            String input=br.readLine();
            for(int j=0;j<m;j++){
                if(Character.toString(input.charAt(i)).equalsIgnoreCase("*"))
                    array[i][j]=1;
                else
                    array[i][j]=0;
            }
        }


        String nQ = br.readLine();
        int num=Integer.parseInt(nQ);
        int totalCount=0;
        for(int i=0;i<num;i++){
            String Q = br.readLine();
            int numQ=Integer.parseInt(Q);
            for(int j=1;j<numQ;i++){
              totalCount=totalCount+  findSquare(j,n,m,array);
            }
        }

        System.out.println(totalCount);

}

    private static int findSquare(int co, int n, int m,  int[][] array) {

        int count = 0;
        int[][] bool = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (array[i][j] == 0) {
                    for (int ii = i; ii < co; ii++) {
                        for (int jj = j; jj < co; jj++) {
                            bool[ii][jj] = -1;
                        }
                    }

                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (bool[i][j] != -1) {
                    count++;
                }
            }

        }
        return count;
    }
}
