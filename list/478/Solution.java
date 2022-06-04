import java.util.Random;

public class Solution {
    private final double radius;
    private final double x;
    private final double y;
    private final double max;
    private static final Random random = new Random();

    public Solution(double radius, double x_center, double y_center) {
        this.radius = radius;
        x = x_center;
        y = y_center;
        max = radius * radius;
    }

    public double[] randPoint() {
        double nx;
        double ny;
        do {
            nx = random.nextDouble() * (2 * radius) - radius;
            ny = random.nextDouble() * (2 * radius) - radius;
        } while (nx * nx + ny * ny > max);
        return new double[]{nx + x, ny + y};
    }
}