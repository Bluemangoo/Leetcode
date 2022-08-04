//Problem 1403
public class Start {
    private static void test(int count) {
        switch (count) {
            case 1: {
                System.out.println("test " + count + " start:");
                int[] numsIn = new int[]{4, 3, 10, 9, 8};
                System.out.println(new Solution().minSubsequence(numsIn));
                System.out.println("[10, 9]  <-  Should be\n");
                break;
            }
            case 2: {
                System.out.println("test " + count + " start:");
                int[] numsIn = new int[]{4, 4, 7, 6, 7};
                System.out.println(new Solution().minSubsequence(numsIn));
                System.out.println("[7, 7, 6]  <-  Should be\n");
                break;
            }
            case 3: {
                System.out.println("test " + count + " start:");
                int[] numsIn = new int[]{6};
                System.out.println(new Solution().minSubsequence(numsIn));
                System.out.println("[6]  <-  Should be\n");
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
