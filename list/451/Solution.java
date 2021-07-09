import java.util.*;

public class Solution {
    public String frequencySort(String s) {
        int n = s.length();
        char[] res = new char[n];
        int[] count = new int[62];
        for (char c : s.toCharArray()) {
            ++count[charToIndex(c)];
        }
        int max = 0;
        for (int c:count){
            if(c > max){
                max = c;
            }
        }
        Stack[] stacks = new Stack[max + 1];
        for (int i = 0; i < 62; ++i) {
            if (count[i] != 0) {
                int ct = count[i];
                if (stacks[ct] == null) {
                    stacks[ct] = new Stack<>();
                    stacks[ct].push(indexToChar(i));
                } else {
                    stacks[ct].push(indexToChar(i));
                }
            }
        }

        int index = 0;
        for (int i = max; i >= 1; --i) {
            Stack stack = stacks[i];
            if (stack != null) {
                while (!stack.isEmpty()) {
                    char c = (Character) stack.pop();
                    for (int j = 0; j < i; j++) {
                        res[index++] = c;
                    }
                }
            }
        }
        return new String(res);
    }

    private int charToIndex(char c) {
        if (c >= 'a' && c <= 'z') {
            return c - 'a';
        }
        if (c >= 'A' && c <= 'Z') {
            return c - 'A' + 26;
        }
        return c - '0' + 52;
    }

    private char indexToChar(int index) {
        if (index >= 0 && index <= 25) {
            return (char) ('a' + index);
        }
        if (index >= 26 && index <= 51) {
            return (char) ('A' + (index - 26));
        }
        return (char) ('0' + (index - 52));
    }

}