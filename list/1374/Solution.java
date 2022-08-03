public class Solution {
    public String generateTheString(int n) {
        StringBuilder builder = new StringBuilder();
        return (n & 1) == 1 ? builder.append("a".repeat(n)).toString()
                : builder.append("a".repeat(n - 1)).append("b").toString();
    }
}
