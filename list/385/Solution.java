public class Solution {
    private char[] c;
    private int cur = 0;
    private int len;

    public NestedInteger deserialize(String s) {
        c = s.toCharArray();
        len = c.length;
        if (c[0] != '[') {
            return new NestedInteger(Integer.parseInt(s));
        }
        return getNext();
    }

    private NestedInteger getNext() {
        NestedInteger nestedInteger = new NestedInteger();
        int sum = 0;
        int sign = 1;
        while (cur < len - 1) {
            ++cur;
            if (c[cur] == ',') {
                continue;
            }
            if (c[cur] == '[') {
                nestedInteger.add(getNext());
            } else if (c[cur] == ']') {
                return nestedInteger;
            } else if (c[cur] == '-') {
                sign *= -1;
            } else {
                sum = 10 * sum + sign * (c[cur] - '0');
                if (c[cur + 1] == ',' || c[cur + 1] == ']') {
                    nestedInteger.add(new NestedInteger(sum));
                    sum = 0;
                    sign = 1;
                }
            }
        }
        return null;
    }
}