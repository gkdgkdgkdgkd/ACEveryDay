import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        if (turnedOn == 0) {
            return List.of("0:00");
        }
        List<String> ans = new ArrayList<>(500);
        String[][] hour = new String[4][];
        String[][] minute = new String[5][];

        hour[0] = new String[]{"1", "2", "4", "8"};
        hour[1] = new String[]{"3", "5", "6", "9", "10"};
        hour[2] = new String[]{"7", "11"};

        minute[0] = new String[]{"01", "02", "04", "08", "16", "32"};
        minute[1] = new String[]{"03", "05", "09", "17", "33", "06", "10", "18", "34", "12", "20", "36", "24", "40", "48"};
        minute[2] = new String[]{"07", "11", "19", "35", "13", "21", "37", "25", "41", "49", "14", "22", "38", "26", "42", "50", "28", "44", "52", "56"};
        minute[3] = new String[]{"15", "23", "39", "27", "43", "51", "29", "45", "53", "57", "30", "46", "54", "58"};
        minute[4] = new String[]{"31", "47", "55", "59"};

        for (int m = 0; m <= turnedOn; m++) {
            int h = turnedOn - m;
            if(m <= 3 && h <= 5){

            }
            if (m == 0 && h <= 3) {
                for (String s : hour[h - 1]) {
                    ans.add(s + ":00");
                }
            } else if (h == 0 && m <= 5) {
                for (String s : minute[m - 1]) {
                    ans.add("0:" + s);
                }
            } else if (h <= 3 && m <= 5) {
                for (String hh : hour[h - 1]) {
                    for (String mm : minute[m - 1]) {
                        ans.add(hh + ":" + mm);
                    }
                }
            }
        }
        return ans;
    }
}