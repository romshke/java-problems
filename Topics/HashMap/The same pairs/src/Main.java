import java.util.*;


class MapFunctions {
    
    
    public static void calcTheSamePairs(Map<String, String> map1, Map<String, String> map2) {
        // write your code here
        int count = 0;

        for (var entry1 : map1.entrySet()) {
            for (var entry2 : map2.entrySet()) {
                if (entry1.equals(entry2)) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }

    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<>();
        map1.put("keyA", "valueA");
        map1.put("keyB", "valueB");
        map1.put("keyC", "valueC");
        map1.put("keyD", "valueD");
        map1.put("keyE", "valueE");

        Map<String, String> map2 = new HashMap<>();
        map2.put("key1", "value1");
        map2.put("keyA", "valueA");
        map2.put("key2", "value2");
        map2.put("keyB", "valueB");


        MapFunctions.calcTheSamePairs(map1, map2);
    }
}