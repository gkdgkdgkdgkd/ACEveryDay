import java.util.*;

public class Solution {
    public int maxPoints(int[][] points) {
        int n = points.length;
        if (n <= 2) {
            return n;
        }
        int max = 2;
        Map<Line, Node> map = new HashMap<>(512);
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                Point point1 = new Point(points[i][0], points[i][1]);
                Point point2 = new Point(points[j][0], points[j][1]);
                Line line = new Line(point1, point2);
                if (map.containsKey(line)) {
                    Node node = map.get(line);
                    node.addIgnoreRepeated(point2);
                    if (node.count > max) {
                        max = node.count;
                    }
                } else {
                    map.put(line, new Node(point1,point2));
                }
            }
        }
        return max;
    }

    private static class Point {
        private final int x;
        private final int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object obj) {
            if (!(obj instanceof Point)) {
                return false;
            }
            Point point = (Point) obj;
            return x == point.x && y == point.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }

    private static class Node {
        private final Set<Point> set;
        private int count;

        public Node(Point point1, Point point2) {
            set = new HashSet<>();
            set.add(point1);
            set.add(point2);
            count = 2;
        }

        public void addIgnoreRepeated(Point point) {
            if (!set.contains(point)) {
                set.add(point);
                ++count;
            }
        }
    }

    private static class Line {
        double k;
        double b;

        public Line(Point point1, Point point2) {
            if (point1.x == point2.x) {
                k = 10_0000.0;
                b = point1.x;
            } else {
                k = (point1.y - point2.y) / ((double) point1.x - point2.x);
                if (Math.abs(k) < 1e-6) {
                    k = 0.0;
                }
                b = k * point1.x - point1.y;
            }
        }

        @Override
        public boolean equals(Object obj) {
            if (!(obj instanceof Line)) {
                return false;
            }
            Line line = (Line) obj;
            return Math.abs(k - line.k) < 1e-6 && Math.abs(b - line.b) < 1e-6;
        }

        @Override
        public int hashCode() {
            return Objects.hash(k, b);
        }
    }
}