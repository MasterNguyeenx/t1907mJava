package session3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public class Teacher {

    public static void main(String[] args) {
        ArrayList<String> strArr = new ArrayList<>();
        strArr.add("Hello");
        strArr.add("World");
        System.out.println(strArr.size());
        strArr.isEmpty();

        //HashSet khong chap nhan trung lap
        HashSet<String> stringHashSet = new HashSet<>();

        stringHashSet.add("aa");
        stringHashSet.add("bb");
        stringHashSet.add("aa");
        for(String s: stringHashSet){
            System.out.println("Hash Set: "+s);
        }
        // PriorityQueue sap xep theo alphabet
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("aa");
        priorityQueue.add("bb");
        priorityQueue.add("ab");
        for(String p: priorityQueue){
            System.out.println("Priority Queue: " +p);
        }

        // 3 thang ben tren deu dung duoc for()

        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("Phong cua Tranh","Phong 10m2");
        hashMap.put("Phong cua Tuan","Phong 12m2");
        hashMap.put("Phong cua Thang","Phong 14m2");
        hashMap.put("Phong cua Nhan","Phong 5m2");
        // key - value

        System.out.println("Phong cua Tranh: "+hashMap.get("Phong cua Tranh"));
        HashMap<Integer,String> hashMap1 = new HashMap<>();
        hashMap1.put(1,"xin chao 1");

        System.out.println(hashMap1.get(1));

    }
    @Override
    public String toString() {
        return "Hello World";
    }


}
