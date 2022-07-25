public class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int firstPath = 0;
        int secondPath = 0;
        int n = distance.length;
        for (int i = start; i != destination; i = (i + 1) % n) {
            firstPath += distance[i];
        }
        for (int i = destination; i != start; i = (i + 1) % n) {
            secondPath += distance[i];
        }
        return Math.min(firstPath, secondPath);
    }
}
