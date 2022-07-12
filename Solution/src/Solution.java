import java.util.Collections;
import java.util.LinkedList;

public class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        LinkedList<Integer> stack = new LinkedList<>();
        for (int v : asteroids) {
            if (v > 0) {
                stack.push(v);
                continue;
            }
            while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() < -v) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                if (stack.peek() < 0) {
                    stack.push(v);
                } else if (stack.peek() == -v) {
                    stack.pop();
                }
            } else {
                stack.push(v);
            }
        }
        int n = stack.size();
        int[] res = new int[n];
        while (--n >= 0) {
            res[n] = stack.pop();
        }
        return res;
    }
}