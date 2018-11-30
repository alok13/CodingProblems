import java.util.*;

public class CountDuplicate {
    public static void main(String args[]) {
        List<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(1);
        list.add(3);
        list.add(1);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(3);
        list.add(2);
        System.out.println(countDuplicate(list));
    }

    private static int countDuplicate(List<Integer> list) {
        Map<Integer,Integer> map=new HashMap<>();
        int count=0;
        for(Integer i:list){
            if(map.containsKey(i)){
                count++;
            }else{
                map.put(i,1);
            }
        }
        return count;
    }
}
