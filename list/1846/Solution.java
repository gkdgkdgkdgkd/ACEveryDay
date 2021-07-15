public class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        int n = arr.length;
        int [] count = new int[n+1];
        int index = n-1;
        for (int i = 0; i < n; i++) {
            if(arr[i] < n){
                ++count[arr[i]];
            }else{
                arr[index--] = arr[i];
            }
        }
        index = 0;
        for (int i = 1; i <= n; i++) {
            int val = count[i];
            for (int j = 0; j < val; j++) {
                arr[index++] = i;
            }
        }
        arr[0] = 1;
        for (int i = 1; i < n; i++) {
            if(Math.abs(arr[i] - arr[i-1]) > 1){
                arr[i] = arr[i-1] + 1;
            }
        }
        return arr[n-1];
    }
}