//Problem 0654
public class Start {
    private static void test(int count) {
        switch (count) {
            case 1: {
                System.out.println("test " + count + " start:");
                int[] numsIn = new int[]{3, 2, 1, 6, 0, 5};
                System.out.println(new Solution().constructMaximumBinaryTree(numsIn));
                System.out.println("[6, [3, null, [2, null, [1]]], [5, [0], null]]  <-  Should be\n");
                break;
            }
            case 2: {
                System.out.println("test " + count + " start:");
                int[] numsIn = new int[]{3, 2, 1};
                System.out.println(new Solution().constructMaximumBinaryTree(numsIn));
                System.out.println("[3, null, [2, null, [1]]]  <-  Should be\n");
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
