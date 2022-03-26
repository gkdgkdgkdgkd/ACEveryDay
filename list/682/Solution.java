public class Solution {
    public int calPoints(String[] ops) {
        int res = 0;
        int n = ops.length;
        int[] arr = new int[n];
        int size = 0;
        for (String str : ops) {
            if (str.charAt(0) == 'C') {
                res -= arr[--size];
            } else {
                if (str.charAt(0) == 'D') {
                    arr[size] = arr[size - 1] << 1;
                } else if (str.charAt(0) == '+') {
                    arr[size] = arr[size - 1] + arr[size - 2];
                } else {
                    arr[size] = Integer.parseInt(str);
                }
                res += arr[size++];
            }
        }
        return res;
    }
}