import java.util.ArrayList;
import java.util.List;

public class Solution {
    private static final String[] oneMap = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    private static final String[] twoMap = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private static final String[] over20Map = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    private static final String[] over100Map = {"", "Thousand", "Million", "Billion"};

    public String numberToWords(int num) {
        if (num == 0) {
            return "Zero";
        }
        List<StringBuilder> list = new ArrayList<>();
        int index = 0;
        while (num > 0) {
            StringBuilder builder = new StringBuilder();
            int lowest = num % 10;
            num /= 10;
            int middle = num % 10;
            num /= 10;
            int highest = num % 10;
            num /= 10;

            if (highest != 0) {
                builder.append(oneMap[highest]).append(" Hundred ");
            }
            if (middle == 1) {
                builder.append(twoMap[lowest]).append(" ");
            } else if (middle != 0) {
                builder.append(over20Map[middle]).append(" ");
            }
            if (lowest != 0 && middle != 1) {
                builder.append(oneMap[lowest]).append(" ");
            }
            if (builder.length() != 0) {
                if (index == 0) {
                    builder.deleteCharAt(builder.length() - 1);
                } else {
                    builder.append(over100Map[index]);
                }
                list.add(builder);
            }
            ++index;
        }
        StringBuilder builder = new StringBuilder();
        for (int i = list.size() - 1; i > 0; --i) {
            builder.append(list.get(i)).append(" ");
        }
        builder.append(list.get(0));
        return builder.toString();
    }
}