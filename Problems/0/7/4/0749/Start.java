//Problem 0749
public class Start {
    private static void test(int count) {
        switch (count) {
            case 1: {
                System.out.println("test 1 start:");
                int[][] isInfectedIn = new int[][]{{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
                System.out.println(new Solution().containVirus(isInfectedIn));
                System.out.println("4  <-  Should be\n");
                break;
            }
            case 2: {
                System.out.println("test 2 start:");
                int[][] isInfectedIn = new int[][]{{1, 1, 1, 0, 0, 0, 0, 0, 0}, {1, 0, 1, 0, 1, 1, 1, 1, 1}, {1, 1, 1, 0, 0, 0, 0, 0, 0}};
                System.out.println(new Solution().containVirus(isInfectedIn));
                System.out.println("13  <-  Should be\n");
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
