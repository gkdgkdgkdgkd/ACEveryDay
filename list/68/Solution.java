import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        int lineLen = 0;
        int n = words.length;
        int from = 0;
        List<String> res = new ArrayList<>();
        StringBuilder builder;
        int[] len = new int[n];
        int spaceNum = 0;
        for (int i = 0; i < n; i++) {
            len[i] = words[i].length();
            if (lineLen == 0) {
                from = i;
                lineLen += len[i];
            } else if (lineLen + 1 + len[i] <= maxWidth) {
                lineLen += 1 + len[i];
                ++spaceNum;
            } else {
                int count = i - from;
                builder = new StringBuilder();
                if (count == 1) {
                    builder.append(words[from]).append(" ".repeat(maxWidth - len[from]));
                } else {
                    spaceNum += maxWidth - lineLen;
                    if (spaceNum % (count - 1) == 0) {
                        while (from < i - 1) {
                            builder.append(words[from++]).append(" ".repeat(spaceNum / (count - 1)));
                        }
                    } else {
                        int remain = spaceNum % (count - 1);
                        int num = spaceNum / (count - 1);
                        while (from < i - 1) {
                            builder.append(words[from++]).append(" ".repeat(num + (remain-- > 0 ? 1 : 0)));
                        }
                    }
                    builder.append(words[i - 1]);
                }
                res.add(builder.toString());
                lineLen = 0;
                spaceNum = 0;
                --i;
            }
        }
        if (from < n) {
            builder = new StringBuilder();
            while (from < n - 1) {
                builder.append(words[from++]).append(" ");
            }
            builder.append(words[n - 1]).append(" ".repeat(maxWidth - lineLen));
            res.add(builder.toString());
        }
        return res;
    }
}