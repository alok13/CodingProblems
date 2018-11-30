/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/
//import for Scanner and other utility classes
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

public class PalindromeEven {
    public static void main(String args[] ) throws Exception {


        //Scanner
        Scanner s = new Scanner(System.in);
        int n = 1;//s.nextInt();
        for(int i=0;i<n;i++){
            long input=s.nextLong();
            String palindrome=getEvenPalindrome(input);
            getDominatingNumber(palindrome);
        }



        // Write your code here

    }

    private static void getDominatingNumber(String palindrome) {
        int[] array=new int[10];
        for(int i=0;i<palindrome.length();i++){
            int curr=palindrome.charAt(i)-48;
            array[curr]++;
        }
        int max=0;
        int index=-1;
        for(int i=0;i<array.length;i++){
            if(max<array[i]){
                max=array[i];
                index=i;
            }
        }
        System.out.println(index);
    }

   /* private static void getDominatingNumber(String palindrome) {
        Map<Character,Integer> map=new HashMap<>();


        int[] array=new int[10];
        for(int i=0;i<palindrome.length();i++){
            char c=palindrome.charAt(i);
            if(map.containsKey(c)){
                int cont=map.get(c);
                map.put(c,cont+1);

            }else{
                map.put(c,1);
            }
//            int curr=palindrome.charAt(i)-48;
//            array[curr]++;
        }
        List list=new LinkedList(map.entrySet());
        Collections.sort(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                int cmp1=((Comparable) ((Map.Entry) (o1)).getValue())
                        .compareTo(((Map.Entry) (o2)).getValue());
                if (cmp1 != 0) {
                    return cmp1;
                } else {
                    return ((Comparable) ((Map.Entry) (o2)).getKey())
                            .compareTo(((Map.Entry) (o1)).getKey());
                }
            }
        });
        Map.Entry e= (Map.Entry) list.get(0);


        System.out.println(e.getKey());
    }*/

    private static String getEvenPalindrome(long input) {
        String res = String.valueOf(input);
        for (int j = res.length() - 1; j >= 0; --j)
            res += res.charAt(j);
        return res;
    }
}
