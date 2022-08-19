//Problem 1020
public class Start {
    private static void test1() {
        System.out.println("test 1 start:");
        int[][] gridIn = new int[][]{{0, 0, 0, 1, 1, 1, 0, 1, 0, 0},
                {1, 1, 0, 0, 0, 1, 0, 1, 1, 1},
                {0, 0, 0, 1, 1, 1, 0, 1, 0, 0},
                {0, 1, 1, 0, 0, 0, 1, 0, 1, 0},
                {0, 1, 1, 1, 1, 1, 0, 0, 1, 0},
                {0, 0, 1, 0, 1, 1, 1, 1, 0, 1},
                {0, 1, 1, 0, 0, 0, 1, 1, 1, 1},
                {0, 0, 1, 0, 0, 1, 0, 1, 0, 1},
                {1, 0, 1, 0, 1, 1, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 1, 0, 0, 0, 1}};
        System.out.println(new Solution().numEnclaves(gridIn));
        System.out.println("Shoud be: 3\n");

    }

    private static void test2() {
        System.out.println("test 2 start:");
        int[][] gridIn = new int[][]{{0}, {1}, {1}, {0}, {0}};
        System.out.println(new Solution().numEnclaves(gridIn));
        System.out.println("Shoud be: 0\n");
    }

    private static void test3() {
        System.out.println("test 3 start:");
        int[][] gridIn = new int[][]{{0, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1},
                {1, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 1, 0},
                {1, 1, 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 1},
                {1, 0, 0, 1, 0, 0, 1, 1, 1, 0, 0, 1, 0, 0},
                {0, 1, 0, 0, 1, 0, 0, 0, 1, 1, 1, 0, 0, 1},
                {1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 1, 1, 1},
                {0, 1, 1, 0, 0, 1, 0, 0, 1, 1, 0, 0, 1, 0},
                {0, 1, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0, 0},
                {1, 0, 0, 1, 1, 0, 0, 0, 0, 1, 1, 0, 0, 1},
                {1, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0}};
        System.out.println(new Solution().numEnclaves(gridIn));
        System.out.println("Shoud be: 11\n");
    }

    public static void main(String args[]) {
        test1();
        test2();
        test3();
    }
}
