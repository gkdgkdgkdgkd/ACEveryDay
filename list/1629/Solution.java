public class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int index = 0;
        int maxTime = releaseTimes[0];
        int n = releaseTimes.length;
        for (int i = 1; i < n; i++) {
            int pressTime = releaseTimes[i] - releaseTimes[i - 1];
            if (pressTime > maxTime) {
                maxTime = pressTime;
                index = i;
            } else if (pressTime == maxTime && keysPressed.charAt(i) > keysPressed.charAt(index)) {
                index = i;
            }
        }
        return keysPressed.charAt(index);
    }
}