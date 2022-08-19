//Problem 0757
public class Start {
    private static void test(int count) {
        switch (count) {
            case 1: {
                System.out.println("test 1 start:");
                int[][] intervalsIn = new int[][]{{1, 3}, {1, 4}, {2, 5}, {3, 5}};
                System.out.println(new Solution().intersectionSizeTwo(intervalsIn));
                System.out.println("3  <-  Should be\n");
                break;
            }
            case 2: {
                System.out.println("test 2 start:");
                int[][] intervalsIn = new int[][]{{1, 2}, {2, 3}, {2, 4}, {4, 5}};
                System.out.println(new Solution().intersectionSizeTwo(intervalsIn));
                System.out.println("5  <-  Should be\n");
                break;
            }
            case 3: {
                System.out.println("test 3 start:");
                int[][] intervalsIn = new int[][]{{1, 2}, {7, 9}, {101, 118}};
                System.out.println(new Solution().intersectionSizeTwo(intervalsIn));
                System.out.println("6  <-  Should be\n");
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
