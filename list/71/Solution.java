public class Solution {
    public String simplifyPath(String path) {
        String[] paths = path.split("/");
        int n = paths.length;
        String[] queue = new String[3001];
        int top = -1;
        for (int i = 0; i < n; i++) {
            if (paths[i].length() == 0 || paths[i].equals(".")) {
                continue;
            }
            if (paths[i].equals("..")) {
                if (top >= 0) {
                    --top;
                }
            } else {
                queue[++top] = paths[i];
            }
        }
        StringBuilder builder = new StringBuilder();
        builder.append("/");
        n = top + 1;
        int index = 0;
        for (int i = 0; i < n - 1; i++) {
            builder.append(queue[index++]).append("/");
        }
        if (n > 0) {
            builder.append(queue[n - 1]);
        }
        return builder.toString();
    }
}