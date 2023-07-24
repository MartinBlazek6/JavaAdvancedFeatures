package map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class MapTrain {
    static Map<String,Integer> map = new HashMap<>();

    public static void main(String[] args) {
        map.putAll(Map.of(
                "Java", 1,
                "Python", 2,
                "C++", 3,
                "JavaScript", 4,
                "Ruby", 5));
        map.forEach((key, value) -> System.out.println(key + ": " + value));



        SDAHashset sdaHashset = new SDAHashset();

        sdaHashset.add(new Object());
        sdaHashset.remove(new Object());
        sdaHashset.size();
        sdaHashset.contains(new Object());
        sdaHashset.clear();




        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Java", 1);
        treeMap.put("Python", 2);
        treeMap.put("C++", 3);
        treeMap.put("JavaScript", 4);
        treeMap.put("Ruby", 5);

        printFirstAndLastEntrySets(treeMap);
    }




    public static void printFirstAndLastEntrySets(TreeMap<?, ?> treeMap) {
        if (treeMap.isEmpty()) {
            System.out.println("TreeMap is empty.");
        } else {
            System.out.println("First EntrySet: " + treeMap.firstEntry());
            System.out.println("Last EntrySet: " + treeMap.lastEntry());
        }
    }

}
