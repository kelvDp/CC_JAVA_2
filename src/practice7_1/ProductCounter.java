package practice7_1;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ProductCounter {
    // Create a Counting Map
    private Map<String, Integer> countingMap = new HashMap<>();
    // Create a Name Mapping Map
    private Map<String, String> nameMapping = new TreeMap<>();

    public static void main(String[] args) {

        // List of part data
        String[] parts = { "1S01", "1S01", "1S01", "1S01", "1S01", "1S02", "1S02", "1S02", "1H01", "1H01", "1S02",
                "1S01", "1S01", "1H01", "1H01", "1H01", "1S02", "1S02", "1M02", "1M02", "1M02" };

        // Create Product Name Part Number map
        Map<String, String> productNames = new TreeMap<>();
        productNames.put("Blue Polo Shirt", "1S01");
        productNames.put("Black Polo Shirt", "1S02");
        productNames.put("Red Ball Cap", "1H01");
        productNames.put("Duke Mug   ", "1M02");

        // Create Product Counter Object and process data
        ProductCounter counter = new ProductCounter(productNames);

        counter.processList(parts);

        counter.printReport();
    }

    public ProductCounter(Map<String, String> productNames) {
        // Your code here
        this.nameMapping = productNames;
    }

    public void processList(String[] list) {
        // your code here
        // int so1 = 0;
        // int so2 = 0;
        // int ho1 = 0;
        // int mo2 = 0;
        // for (String s : list) {
        // if (s.equals("1S01")) {
        // so1++;
        // } else if (s.equals("1S02")) {
        // so2++;
        // } else if (s.equals("1H01")) {
        // ho1++;
        // } else if (s.equals("1M02")) {
        // mo2++;
        // }

        // countingMap.put("1S01", so1);
        // countingMap.put("1S02", so2);
        // countingMap.put("1H01", ho1);
        // countingMap.put("1M01", mo2);

        // other solution
        int curValue = 0;
        for (String s : list) {
            if (countingMap.containsKey(s)) {
                curValue = countingMap.get(s);
                curValue++;
                countingMap.put(s, curValue);
            } else {
                countingMap.put(s, 1);
            }
        }
    }
    // }

    public void printReport() {
        // Your code here
        System.out.println("====Product Report====");
        for (String key : countingMap.keySet()) {
            System.out.println("Name: " + key + " Count: " + countingMap.get(key));
        }
    }
}
