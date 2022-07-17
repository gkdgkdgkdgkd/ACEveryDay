import java.util.TreeMap;

public class MyCalendar {
    private final TreeMap<Integer, Integer> map = new TreeMap<>();

    public boolean book(int start, int end) {
        Integer key = map.floorKey(end - 1);
        if (key != null && map.get(key) > start) {
            return false;
        }
        map.put(start, end);
        return true;
    }
}

