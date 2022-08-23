//Problem 0782
public class Start {
    private static void test(int count) {
        switch (count) {
            case 1: {
                System.out.println("test " + count + " start:");
                int[][] boardIn = new int[][]{{0, 1, 1, 0}, {0, 1, 1, 0}, {1, 0, 0, 1}, {1, 0, 0, 1}};
                System.out.println(new Solution().movesToChessboard(boardIn));
                System.out.println("2  <-  Should be\n");
                break;
            }
            case 2: {
                System.out.println("test " + count + " start:");
                int[][] boardIn = new int[][]{{0, 1}, {1, 0}};
                System.out.println(new Solution().movesToChessboard(boardIn));
                System.out.println("0  <-  Should be\n");
                break;
            }
            case 3: {
                System.out.println("test " + count + " start:");
                int[][] boardIn = new int[][]{{1, 0}, {1, 0}};
                System.out.println(new Solution().movesToChessboard(boardIn));
                System.out.println("-1  <-  Should be\n");
                break;
            }
            default: {
                System.err.println("Too More Tests");
                System.exit(-1);
            }
        }
    }

    public static void main(String[] args) {
        int testTime = 3;
        for (int i = 1; i <= testTime; i++) {
            test(i);
        }
    }
}
