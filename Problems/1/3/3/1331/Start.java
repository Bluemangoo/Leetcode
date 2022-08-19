//Problem 1331

import java.util.Arrays;

public class Start {
    private static void test(int count) {
        switch (count) {
            case 1: {
                System.out.println("test " + count + " start:");
                int[] arrIn = new int[]{40, 10, 20, 30};
                System.out.println(Arrays.toString(new Solution().arrayRankTransform(arrIn)));
                System.out.println("[4, 1, 2, 3]  <-  Should be\n");
                break;
            }
            case 2: {
                System.out.println("test " + count + " start:");
                int[] arrIn = new int[]{100, 100, 100};
                System.out.println(Arrays.toString(new Solution().arrayRankTransform(arrIn)));
                System.out.println("[1, 1, 1]  <-  Should be\n");
                break;
            }
            case 3: {
                System.out.println("test " + count + " start:");
                int[] arrIn = new int[]{37, 12, 28, 9, 100, 56, 80, 5, 12};
                System.out.println(Arrays.toString(new Solution().arrayRankTransform(arrIn)));
                System.out.println("[5, 3, 4, 2, 8, 6, 7, 1, 3]  <-  Should be\n");
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
