//Problem 1260
public class Start {
    private static void test(int count) {
        switch (count) {
            case 1: {
                System.out.println("test 1 start:");
                int[][] gridIn = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
                int kIn = 1;
                System.out.println(new Solution().shiftGrid(gridIn, kIn));
                System.out.println("[[9, 1, 2], [3, 4, 5], [6, 7, 8]]  <-  Should be\n");
                break;
            }
            case 2: {
                System.out.println("test 2 start:");
                int[][] gridIn = new int[][]{{3, 8, 1, 9}, {19, 7, 2, 5}, {4, 6, 11, 10}, {12, 0, 21, 13}};
                int kIn = 4;
                System.out.println(new Solution().shiftGrid(gridIn, kIn));
                System.out.println("[[12 ,0 ,21 ,13], [3 ,8 ,1 ,9], [19, 7, 2, 5], [4, 6, 11, 10]]  <-  Should be\n");
                break;
            }
            case 3: {
                System.out.println("test 3 start:");
                int[][] gridIn = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
                int kIn = 9;
                System.out.println(new Solution().shiftGrid(gridIn, kIn));
                System.out.println("[[1, 2, 3], [4, 5, 6], [7, 8, 9]]  <-  Should be\n");
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
