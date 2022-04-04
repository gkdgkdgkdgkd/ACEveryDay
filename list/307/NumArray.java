public class NumArray {
    private final int[] tree;
    private final int n;
    private final int[] nums;

    public NumArray(int[] nums) {
        n = nums.length + 1;
        this.nums = nums;
        this.tree = new int[n];
        for (int i = 1; i < n; i++) {
            add(i, nums[i - 1]);
        }
    }

    public void update(int index, int val) {
        add(index + 1, val - nums[index]);
        nums[index] = val;
    }

    public int sumRange(int left, int right) {
        return query(right + 1) - query(left);
    }

    private void add(int index, int v) {
        while (index < n) {
            tree[index] += v;
            index += lowbit(index);
        }
    }

    private int query(int index) {
        int res = 0;
        while (index > 0) {
            res += tree[index];
            index -= lowbit(index);
        }
        return res;
    }

    private int lowbit(int x) {
        return x & -x;
    }
}
