public class Solution {
    public int sumOfUnique(int[] nums) {
        boolean[] first = new boolean[101];
        boolean[] second = new boolean[101];
        int sum = 0;
        for (int v : nums) {
            if (!first[v]) {
                sum += v;
                first[v] = true;
            } else if (!second[v]) {
                sum -= v;
                second[v] = true;
            }
        }
        return sum;
    }
}