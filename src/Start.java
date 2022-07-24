//Problem 0565
public class Start {
    private static void test(int count) {
        switch (count) {
            case 1: {
                System.out.println("test "+count+" start:");
                int[] numsIn = new int[]{5, 4, 0, 3, 1, 6, 2};
                System.out.println(new Solution().arrayNesting(numsIn));
                System.out.println("4  <-  Should be\n");
                break;
            }
            case 2: {
                System.out.println("test "+count+" start:");
                int[] numsIn = new int[]{5, 4, 3, 0, 1, 6, 2};
                System.out.println(new Solution().arrayNesting(numsIn));
                System.out.println("5  <-  Should be\n");
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
