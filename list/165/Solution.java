public class Solution {
    public int compareVersion(String version1, String version2) {
        if (version1.equals(version2)) {
            return 0;
        }
        int p1 = 0;
        int p2 = 0;
        char[] v1 = version1.toCharArray();
        char[] v2 = version2.toCharArray();
        int len1 = v1.length;
        int len2 = v2.length;
        while (p1 < len1 && p2 < len2) {
            int num1 = 0;
            while (p1 < len1 && v1[p1] != '.') {
                num1 *= 10;
                num1 += v1[p1] - '0';
                ++p1;
            }

            int num2 = 0;
            while (p2 < len2 && v2[p2] != '.') {
                num2 *= 10;
                num2 += v2[p2] - '0';
                ++p2;
            }

            if (num1 > num2) {
                return 1;
            } else if (num1 < num2) {
                return -1;
            }
            ++p1;
            ++p2;
        }
        while (p1 < len1) {
            if (v1[p1] >= '1' && v1[p1] <= '9') {
                return 1;
            }
            ++p1;
        }

        while (p2 < len2) {
            if (v2[p2] >= '1' && v2[p2] <= '9') {
                return -1;
            }
            ++p2;
        }
        return 0;
    }
}