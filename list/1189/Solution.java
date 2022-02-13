public class Solution {
    public int maxNumberOfBalloons(String text) {
        int b = 0;
        int a = 0;
        int l = 0;
        int o = 0;
        int n = 0;
        for (char c : text.toCharArray()) {
            switch (c) {
                case 'a' -> ++a;
                case 'b' -> ++b;
                case 'n' -> ++n;
                case 'l' -> ++l;
                case 'o' -> ++o;
            }
        }
        return Math.min(a, Math.min(b, Math.min(n, Math.min(l / 2, o / 2))));
    }
}