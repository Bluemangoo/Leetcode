//Problem 2341

import java.util.Arrays;

public class Start {
    private static void test(int count) {
        switch (count) {
            case 1: {
                System.out.println("test 1 start:");
                int[] numsIn = new int[]{1, 3, 2, 1, 3, 2, 2};
                System.out.println(Arrays.toString(new Solution().numberOfPairs(numsIn)));
                System.out.println("Should be: [3, 1]\n");
                break;
            }
            case 2: {
                System.out.println("test 2 start:");
                int[] numsIn = new int[]{1, 1};
                System.out.println(Arrays.toString(new Solution().numberOfPairs(numsIn)));
                System.out.println("Should be: [1, 0]\n");
                break;
            }
            case 3: {
                System.out.println("test 3 start:");
                int[] numsIn = new int[]{0};
                System.out.println(Arrays.toString(new Solution().numberOfPairs(numsIn)));
                System.out.println("Should be: [0, 1]\n");
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
