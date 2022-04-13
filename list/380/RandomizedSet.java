import java.util.Map;
import java.util.HashMap;
import java.util.Random;

public class RandomizedSet {
    private final Map<Integer, Integer> map = new HashMap<>();
    private final int[] list = new int[2 * 100_000 + 1];
    private int len = 0;
    private final Random random = new Random();

    public boolean insert(int val) {
        if (map.containsKey(val)) {
            return false;
        }
        map.put(val, len);
        list[len++] = val;
        return true;
    }

    public boolean remove(int val) {
        if (!map.containsKey(val)) {
            return false;
        }
        int index = map.get(val);
        int v = list[--len];
        list[index] = v;
        map.put(v, index);
        map.remove(val);
        return true;
    }

    public int getRandom() {
        return list[random.nextInt(len)];
    }
}
