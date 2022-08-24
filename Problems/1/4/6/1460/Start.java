//Problem 1460
public class Start {
    private static void test(int count) {
        switch (count) {
            case 1: {
                System.out.println("test " + count + " start:");
                int[] targetIn = new int[]{1, 2, 3, 4};
                int[] arrIn = new int[]{2, 4, 1, 3};
                System.out.println(new Solution().canBeEqual(targetIn, arrIn));
                System.out.println("true  <-  Should be\n");
                break;
            }
            case 2: {
                System.out.println("test " + count + " start:");
                int[] targetIn = new int[]{7};
                int[] arrIn = new int[]{7};
                System.out.println(new Solution().canBeEqual(targetIn, arrIn));
                System.out.println("true  <-  Should be\n");
                break;
            }
            case 3: {
                System.out.println("test " + count + " start:");
                int[] targetIn = new int[]{3, 7, 9};
                int[] arrIn = new int[]{3, 7, 11};
                System.out.println(new Solution().canBeEqual(targetIn, arrIn));
                System.out.println("false  <-  Should be\n");
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
