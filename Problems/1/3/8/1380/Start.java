//Problem 1380
public class Start {
    private static void test1() {
        System.out.println("test 1 start:");
        int[][] matrixIn = new int[][]{{3, 7, 8},
                {9, 11, 13},
                {15, 16, 17}};
        System.out.println(new Solution().luckyNumbers(matrixIn));
        System.out.println("Should be: [15]\n");
    }

    private static void test2() {
        System.out.println("test 2 start:");
        int[][] matrixIn = new int[][]{{1, 10, 4, 2},
                {9, 3, 8, 7},
                {15, 16, 17, 12}};
        System.out.println(new Solution().luckyNumbers(matrixIn));
        System.out.println("Should be: [12]\n");
    }

    private static void test3() {
        System.out.println("test 3 start:");
        int[][] matrixIn = new int[][]{{7, 8},
                {1, 2}};
        System.out.println(new Solution().luckyNumbers(matrixIn));
        System.out.println("Should be: [7]\n");
    }

    private static void test4() {
        System.out.println("test 4 start:");
        int[][] matrixIn = new int[][]{{1}};
        System.out.println(new Solution().luckyNumbers(matrixIn));
        System.out.println("Should be: [1]\n");
    }

    private static void test5() {
        System.out.println("test 6 start:");
        int[][] matrixIn = new int[][]{{1, 2}};
        System.out.println(new Solution().luckyNumbers(matrixIn));
        System.out.println("Should be: [1]\n");
    }

    private static void test6() {
        System.out.println("test 7 start:");
        int[][] matrixIn = new int[][]{{1}, {2}};
        System.out.println(new Solution().luckyNumbers(matrixIn));
        System.out.println("Should be: [2]\n");
    }

    public static void main(String[] args) {
        test1();
        test2();
        test3();
        test4();
        test5();
        test6();
    }
}
