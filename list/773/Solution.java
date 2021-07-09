import java.util.*;

public class Solution {
    public int slidingPuzzle(int[][] board) {
        final int[][] target = {
                {1,2,3},
                {4,5,0}
        };
        if(Arrays.deepEquals(target,board)){
            return 0;
        }
        Set<Node> set = new HashSet<>();
        Queue<int[][]> queue = new LinkedList<>();
        queue.add(board);
        int res = 0;
        set.add(new Node(board));
        while (!queue.isEmpty()) {
            ++res;
            int size = queue.size();
            for (int i = 0; i < size; ++i) {
                int[][] top = queue.remove();
                for (int[][] s : get(top)) {
                    if (!set.contains(new Node(s))) {
                        if (Arrays.deepEquals(s, target)) {
                            return res;
                        }
                        queue.offer(s);
                        set.add(new Node(s));
                    }
                }
            }
        }

        return -1;
    }

    private static class Node{
        int [][] board;
        public Node(int [][]board){
            this.board = board;
        }

        @Override
        public int hashCode() {
            return Arrays.deepHashCode(board);
        }

        @Override
        public boolean equals(Object obj) {
            if(!(obj instanceof Node)){
                return false;
            }
            Node node = (Node) obj;
            return Arrays.deepEquals(board,node.board);
        }

        @Override
        public String toString() {
            return Arrays.deepToString(board);
        }
    }

    private int[][][] get(int[][] board) {
        int zi = -1;
        int zj = -1;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 0) {
                    zi = i;
                    zj = j;
                    break;
                }
            }
            if (zi != -1) {
                break;
            }
        }

        int[][] state1 = new int[2][3];
        int[][] state2 = new int[2][3];
        int[][] state3 = new int[2][3];
        int num = 2;
        if (zi == 0 && zj == 0) {
            state1[0] = new int[]{board[0][1], 0, board[0][2]};
            state1[1] = new int[]{board[1][0], board[1][1], board[1][2]};
            state2[0] = new int[]{board[1][0], board[0][1], board[0][2]};
            state2[1] = new int[]{0, board[1][1], board[1][2]};
        } else if (zi == 0 && zj == 1) {
            state1[0] = new int[]{0, board[0][0], board[0][2]};
            state1[1] = new int[]{board[1][0], board[1][1], board[1][2]};
            state2[0] = new int[]{board[0][0], board[0][2], 0};
            state2[1] = new int[]{board[1][0], board[1][1], board[1][2]};
            state3[0] = new int[]{board[0][0], board[1][1], board[0][2]};
            state3[1] = new int[]{board[1][0], 0, board[1][2]};
            num = 3;
        } else if (zi == 0 && zj == 2) {
            state1[0] = new int[]{board[0][0], 0, board[0][1]};
            state1[1] = new int[]{board[1][0], board[1][1], board[1][2]};
            state2[0] = new int[]{board[0][0], board[0][1], board[1][2]};
            state2[1] = new int[]{board[1][0], board[1][1], 0};
        } else if (zi == 1 && zj == 0) {
            state1[0] = new int[]{0, board[0][1], board[0][2]};
            state1[1] = new int[]{board[0][0], board[1][1], board[1][2]};
            state2[0] = new int[]{board[0][0], board[0][1], board[0][2]};
            state2[1] = new int[]{board[1][1], 0, board[1][2]};
        } else if (zi == 1 && zj == 1) {
            state1[0] = new int[]{board[0][0], 0, board[0][2]};
            state1[1] = new int[]{board[1][0], board[0][1], board[1][2]};
            state2[0] = new int[]{board[0][0], board[0][1], board[0][2]};
            state2[1] = new int[]{board[1][0], board[1][2], 0};
            state3[0] = new int[]{board[0][0], board[0][1], board[0][2]};
            state3[1] = new int[]{0, board[1][0], board[1][2]};
            num = 3;
        } else {
            state1[0] = new int[]{board[0][0], board[0][1], 0};
            state1[1] = new int[]{board[1][0], board[1][1], board[0][2]};
            state2[0] = new int[]{board[0][0], board[0][1], board[0][2]};
            state2[1] = new int[]{board[1][0], 0, board[1][1]};
        }
        int[][][] res = new int[num][2][3];
        res[0] = state1;
        res[1] = state2;
        if(num == 3){
            res[2] = state3;
        }
        return res;
    }
}