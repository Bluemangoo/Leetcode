//Problem 0768
public class Start {
    private static void test(int count) {
        switch (count) {
            case 1: {
                System.out.println("test " + count + " start:");
                int[] arrIn = new int[]{5, 4, 3, 2, 1};
                System.out.println(new Solution().maxChunksToSorted(arrIn));
                System.out.println("1  <-  Should be\n");
                break;
            }
            case 2: {
                System.out.println("test " + count + " start:");
                int[] arrIn = new int[]{2, 1, 3, 4, 4};
                System.out.println(new Solution().maxChunksToSorted(arrIn));
                System.out.println("4  <-  Should be\n");
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
