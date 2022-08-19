//Problem 1719
public class Start {
    private static void test1() {
        System.out.println("test 1 start:");
        int[][] pairsIn = new int[][]{{1, 2}, {2, 3}};
        System.out.println(new Solution().checkWays(pairsIn));
        System.out.println("Should be: 1\n");
    }

    private static void test2() {
        System.out.println("test 2 start:");
        int[][] pairsIn = new int[][]{{1, 2}, {2, 3}, {1, 3}};
        System.out.println(new Solution().checkWays(pairsIn));
        System.out.println("Should be: 2\n");
    }

    private static void test3() {
        System.out.println("test 3 start:");
        int[][] pairsIn = new int[][]{{1, 2}, {2, 3}, {2, 4}, {1, 5}};
        System.out.println(new Solution().checkWays(pairsIn));
        System.out.println("Should be: 0\n");
    }

    private static void test4() {
        System.out.println("test 4 start:");
        int[][] pairsIn = new int[][]{{1, 2}};
        System.out.println(new Solution().checkWays(pairsIn));
        System.out.println("Should be: 2\n");
    }

    public static void main(String[] args) {
        test1();
        test2();
        test3();
        test4();
    }
}
