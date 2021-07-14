public class Solution {
    public int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
        long diff = 0;
        int n = nums1.length;
        int[] nums1Copy = new int[n];
        int[] count = new int[100_000 + 1];
        int max = 0;
        for (int i = 0; i < n; i++) {
            diff += Math.abs(nums1[i] - nums2[i]);
            ++count[nums1[i]];
            max = Math.max(nums1[i], max);
        }

        if (diff == 0) {
            return 0;
        }

        int index = 0;
        for (int i = 1; i <= max; i++) {
            int val = count[i];
            for (int j = 0; j < val; j++) {
                nums1Copy[index++] = i;
            }
        }

        max = 0;
        for (int i = 0; i < n; i++) {
            int closest = find(nums1Copy, nums2[i]);
            int abs = Math.abs(nums1[i] - nums2[i]) - Math.abs(closest - nums2[i]);
            if (abs > max) {
                max = abs;
            }
        }
        return (int) ((diff - max) % 1_000_000_007);
    }

    private int find(int[] arr, int val) {
        int n = arr.length;
        int l = 0;
        int r = n - 1;
        while (l < r) {
            int m = (l + r) >> 1;
            if (arr[m] == val) {
                return arr[m];
            } else if (arr[m] > val) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        if (l > 0) {
            if (Math.abs(arr[l - 1] - val) < Math.abs(arr[l] - val)) {
                return arr[l - 1];
            }
        }
        if (l < n - 1) {
            if (Math.abs(arr[l + 1] - val) < Math.abs(arr[l] - val)) {
                return arr[l + 1];
            }
        }
        return arr[l];
    }
}