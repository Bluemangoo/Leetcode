//Problem 1252
public class Start {
    private static void test(int count) {
        switch (count) {
            case 1: {
                System.out.println("test 1 start:");
                int[][] indicesIn = new int[][]{{0, 1}, {1, 1}};
                System.out.println(new Solution().oddCells(2, 3, indicesIn));
                System.out.println("Should be: 6\n");
                break;
            }
            case 2: {
                System.out.println("test 2 start:");
                int[][] indicesIn = new int[][]{{1, 1}, {0, 0}};
                System.out.println(new Solution().oddCells(2, 2, indicesIn));
                System.out.println("Should be: 0\n");
                break;
            }
            default: {
                System.err.println("Too More Tests");
                System.exit(-1);
            }
        }
    }

    public static void main(String[] args) {
        int testTime = 2;
        for (int i = 1; i <= testTime; i++) {
            test(i);
        }
    }
}
