import java.util.*;

public class StockPrice {
    private final Map<Integer, Integer> map = new HashMap<>();
    private final TreeMap<Integer, Integer> priceMap = new TreeMap<>();
    private int maxTimestamp = 0;

    public void update(int timestamp, int price) {
        maxTimestamp = Math.max(timestamp, maxTimestamp);
        Integer val = map.get(timestamp);
        if (val != null) {
            int count = priceMap.get(val);
            if (count == 1) {
                priceMap.remove(val);
            } else {
                priceMap.put(val, count - 1);
            }
        }
        map.put(timestamp, price);
        priceMap.put(price, priceMap.getOrDefault(price, 0) + 1);
    }

    public int current() {
        return map.get(maxTimestamp);
    }

    public int maximum() {
        return priceMap.lastKey();
    }

    public int minimum() {
        return priceMap.firstKey();
    }
}
