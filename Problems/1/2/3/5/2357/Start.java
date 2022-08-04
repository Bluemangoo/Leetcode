//Problem 2357
public class Start {
    private static void test(int count) {
        switch (count) {
            case 1: {
                System.out.println("test " + count + " start:");
                int[] numsIn = new int[]{1, 5, 0, 3, 5};
                System.out.println(new Solution().minimumOperations(numsIn));
                System.out.println("3  <-  Should be\n");
                break;
            }
            case 2: {
                System.out.println("test " + count + " start:");
                int[] numsIn = new int[]{0};
                System.out.println(new Solution().minimumOperations(numsIn));
                System.out.println("0  <-  Should be\n");
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
