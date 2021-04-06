import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] nums = {0,0,1,1,1,1,2,3,3};
        int l = new Solution().removeDuplicates(nums);
        for (int i = 0; i < l; i++) {
            System.out.print(nums[i]+" ");
        }
    }
}
