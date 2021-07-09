public class Solution {
    private int [] weights;
    private int D;
    public int shipWithinDays(int[] weights, int D) {
        this.weights = weights;
        this.D = D;
        int n = weights.length;
        int right = 0;
        int left = 0;
        for (int i = 0; i < n; i++) {
            right += weights[i];
            if(weights[i] > left){
                left = weights[i];
            }
        }
        if (D == 1) {
            return right;
        }else if(D == n){
            return left;
        }

        while (left <= right){
            int mid = (left+right) >> 1;
            if(canShip(mid)){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return left;
    }

    private boolean canShip(int mid){
        int day = 1;
        int cur = mid;
        for (int weight:weights){
            if(weight > cur){
                ++day;
                cur = mid;
            }
            cur -= weight;
        }
        return day <= D;
    }
}
