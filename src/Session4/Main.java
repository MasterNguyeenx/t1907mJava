package Session4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        Generic<String,Integer> g2= new Generic<>();
        Generic g = new Generic();
        Generic<Integer,Double> g3 = new Generic<>();
        g.showMessage(12);
        g.showMessage(10f);
        g2.setName("TrAnh");
        g3.setName(123);

        ArrayList<String> arrayList;
        HashSet<Double> doubles;
        PriorityQueue<String> stringspriorityQueue;
        HashMap<String , Integer> stringIntegerHashMap;

        ArrayList ar = new ArrayList();
        ar.add(1);
        ar.add("123");

    }

}
