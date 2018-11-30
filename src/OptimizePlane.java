import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class OptimizePlane {

    public static void main(String[] args) {
        int maxTravelDist = 10000;
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(3000);
        List<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(5000);

        List<Integer> list3 = new ArrayList<>();

        list3.add(3);
        list3.add(7000);

        List<Integer> list4 = new ArrayList<>();

        list4.add(4);
        list4.add(10000);

        List<List<Integer>> finalList = new ArrayList<>();
        finalList.add(list1);
        finalList.add(list2);
        finalList.add(list3);
        finalList.add(list4);

        //===
        List<Integer> list11 = new ArrayList<>();
        list11.add(1);
        list11.add(2000);
        List<Integer> list21 = new ArrayList<>();
        list21.add(2);
        list21.add(3000);

        List<Integer> list31 = new ArrayList<>();

        list31.add(3);
        list31.add(4000);

        List<Integer> list41 = new ArrayList<>();

        list41.add(4);
        list41.add(5000);

        List<List<Integer>> finalList1 = new ArrayList<>();
        finalList1.add(list11);
        finalList1.add(list21);
        finalList1.add(list31);
        finalList1.add(list41);



        optimalUtilization(maxTravelDist, finalList, finalList1);

    }

    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    static List<List<Integer>> optimalUtilization(int maxTravelDist,
                                                  List<List<Integer>> forwardRouteList,
                                                  List<List<Integer>> returnRouteList) {
        HashMap<Integer, Integer> s = new HashMap<Integer, Integer>();

        for (int i = 0; i < forwardRouteList.size(); i++)
            s.put(forwardRouteList.get(i).get(1), forwardRouteList.get(i).get(0));

        List<List<Integer>> finalList1 = new ArrayList<>();
        for (int j = 0; j < returnRouteList.size(); j++)
            if (s.containsKey(maxTravelDist - returnRouteList.get(j).get(1))) {
                List<Integer> newPair = new ArrayList<>();
                int dis = maxTravelDist - returnRouteList.get(j).get(1);
                newPair.add(s.get(dis));
                newPair.add(returnRouteList.get(j).get(0));
                finalList1.add(newPair);
            }
        System.out.println(finalList1);
        return finalList1;
    }

}
