//Problem 2290
public class Start {
    private static void test(int count) {
        switch (count) {
            case 1: {
                System.out.println("test 1 start:");
                int[][] gridIn = {{0, 1, 1}, {1, 1, 0}, {1, 1, 0}};
                System.out.println(new Solution().minimumObstacles(gridIn));
                System.out.println("Should be: 2\n");
                break;
            }
            case 2: {
                System.out.println("test 2 start:");
                int[][] gridIn = {{0, 1, 0, 0, 0}, {0, 1, 0, 1, 0}, {0, 0, 0, 1, 0}};
                System.out.println(new Solution().minimumObstacles(gridIn));
                System.out.println("Should be: 0\n");
                break;
            }
            default: {
                System.err.println("Too More Tests");
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
