import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PartialSubSequence {

    public static void main(String args[]) throws Exception {

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num=br.readLine();

        String input = br.readLine();
        int max = 0;
        String[] sp = input.split("\\s+");
        int[] out = new int[sp.length];
        char[] charO=new char[sp.length];
        for(int i=0;i<out.length;i++){
            out[i]=1;
        }
        for (int i = 1; i < sp.length; i++)
            for (int j = 0; j < i; j++) {
                Character result = isCommon(sp[i], sp[j]);
                if ((result!=null) &&out[i] < out[j] + out[i]){
                    out[i] = out[j] + out[i];
                    charO[i]=result;
                }
            }
        int max_index=0;
        for (int i = 0; i < sp.length; i++)
            if (max < out[i]){
                max = out[i];
                max_index=i;
            }


        System.out.println(charO[max_index]);

    }

    private static Character isCommon(String s, String s1) {
        for (int i = 0; i < s.length(); i++) {
                if(s1.indexOf(s.charAt(i))>=0)
                    return s.charAt(i);
        }
        return null;
    }
}
