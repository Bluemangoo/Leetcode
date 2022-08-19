//Problem 1920

import java.util.Arrays;

public class Start {
    private static void test(int count) {
        switch (count) {
            case 1: {
                System.out.println("test 1 start:");
                int[] numsIn = {0, 2, 1, 5, 3, 4};
                System.out.println(Arrays.toString(new Solution().buildArray(numsIn)));
                System.out.println("Should be: [0, 1, 2, 4, 5, 3]\n");
                break;
            }
            case 2: {
                System.out.println("test 2 start:");
                int[] numsIn = {5, 0, 1, 2, 3, 4};
                System.out.println(Arrays.toString(new Solution().buildArray(numsIn)));
                System.out.println("Should be: [4, 5, 0, 1, 2, 3]\n");
                break;
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
