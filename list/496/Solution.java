import java.util.Arrays;

public class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] stack = new int[1001];
        int top = -1;
        int[] map = new int[10_001];
        Arrays.fill(map, -1);
        for (int v : nums2) {
            while (top != -1 && stack[top] < v) {
                map[stack[top--]] = v;
            }
            stack[++top] = v;
        }
        int[] res = new int[nums1.length];
        int index = 0;
        for (int v : nums1) {
            res[index++] = map[v];
        }
        return res;
    }
}