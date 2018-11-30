import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class NearestPoint {
    public static void main (String[] args){
        int totalSteakhouses=3;
        List<Integer> list1=new ArrayList<>();
        list1.add(1);
        list1.add(2);
        List<Integer> list2=new ArrayList<>();
        list2.add(3);
        list2.add(4);

        List<Integer> list3=new ArrayList<>();

        list3.add(1);
        list3.add(-1);

        List<List<Integer>>finalList=new ArrayList<>();
        finalList.add(list1);
        finalList.add(list2);
        finalList.add(list3);
        int numSteakhouses=1;

        List<List<Integer>>finalList1=nearestXsteakHouses(totalSteakhouses,finalList,numSteakhouses);
        System.out.println(finalList1);

    }



    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    static List<List<Integer>> nearestXsteakHouses(int totalSteakhouses,
                                            List<List<Integer>> allLocations,
                                            int numSteakhouses)
    {
        Collections.sort(allLocations, new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                int x1=o1.get(0);
                int y1=o1.get(1);
                int x2=o2.get(0);
                int y2=o2.get(1);
                int dis1=(x1*x1)+(y1*y1);
                int dis2=(x2*x2)+(y2*y2);
                return dis1-dis2;
            }
        });
        List<List<Integer>>finalList=new ArrayList<>();
        for(int i=0;i<numSteakhouses;i++){
            finalList.add(allLocations.get(i));
        }
        return finalList;
    }
    // METHOD SIGNATURE ENDS
}
