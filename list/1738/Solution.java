import java.util.*;

public class Solution {
    public int kthLargestValue(int[][] matrix, int k) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] xor = new int[m + 1][n + 1];

        int[] result = new int[m * n];
        int resultIndex = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[resultIndex++] = xor[i + 1][j + 1] = (matrix[i][j] ^ xor[i + 1][j] ^ xor[i][j + 1] ^ xor[i][j]);
            }
        }

        return quickSelect(result, 0, m * n - 1, m * n - k + 1);
    }

    private int quickSelect(int[] nums, int start, int end, int k) {
        if (start == end) {
            return nums[start];
        }
        int left = start;
        int right = end;
        int pivot = nums[start + (end - start) / 2];
        while (left <= right) {
            if (nums[left] < pivot) {
                left++;
            } else if (nums[right] > pivot) {
                right--;
            } else {
                int temp = nums[left];
                nums[left++] = nums[right];
                nums[right--] = temp;
            }
        }
        if (start + k - 1 <= right) {
            return quickSelect(nums, start, right, k);
        }
        if (start + k - 1 >= left) {
            return quickSelect(nums, left, end, start + k - left);
        }
        return nums[right + 1];
    }
}