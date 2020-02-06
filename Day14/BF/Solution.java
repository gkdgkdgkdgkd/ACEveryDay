import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true)
        {
            System.out.println(new Solution().strStr(scanner.nextLine(),scanner.nextLine()));
        }
    }

    public int strStr(String haystack, String needle) {
        if(needle == null || needle.isEmpty() || haystack == null || haystack.isEmpty())
            return 0;
        int sLen = haystack.length();
        int tLen = needle.length();
        for(int p=0;p<sLen;++p)
        {
            int ps = p;
            int pt = 0;
            while(ps<sLen && pt<tLen && needle.charAt(pt) == haystack.charAt(ps))
            {
                ++ps;
                ++pt;
            }
            if(pt == tLen)
                return p;
        }
        return -1;
    }
}
