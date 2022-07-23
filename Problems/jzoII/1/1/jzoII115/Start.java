//Problem 剑指 Offer II 115 || 0444 (*Plus)
public class Start {
    private static void test(int count) {
        switch (count) {
            case 1: {
                System.out.println("test 1 start:");
                int[] numsIn = new int[]{1, 2, 3};
                int[][] sequencesIn = new int[][]{{1, 2}, {1, 3}};
                System.out.println(new Solution().sequenceReconstruction(numsIn, sequencesIn));
                System.out.println("false  <-  Should be\n");
                break;
            }
            case 2: {
                System.out.println("test 2 start:");
                int[] numsIn = new int[]{1, 2, 3};
                int[][] sequencesIn = new int[][]{{1, 2}};
                System.out.println(new Solution().sequenceReconstruction(numsIn, sequencesIn));
                System.out.println("false  <-  Should be\n");
                break;
            }
            case 3: {
                System.out.println("test 3 start:");
                int[] numsIn = new int[]{1, 2, 3};
                int[][] sequencesIn = new int[][]{{1, 2}, {1, 3}, {2, 3}};
                System.out.println(new Solution().sequenceReconstruction(numsIn, sequencesIn));
                System.out.println("true  <-  Should be\n");
                break;
            }
            case 4: {
                System.out.println("test 4 start:");
                int[] numsIn = new int[]{4, 1, 5, 2, 6, 3};
                int[][] sequencesIn = new int[][]{{5, 2, 6, 3}, {4, 1, 5, 2}};
                System.out.println(new Solution().sequenceReconstruction(numsIn, sequencesIn));
                System.out.println("true  <-  Should be\n");
                break;
            }
            default: {
                System.err.println("Too More Tests");
                System.exit(-1);
            }
        }
    }

    public static void main(String[] args) {
        int testTime = 4;
        for (int i = 1; i <= testTime; i++) {
            test(i);
        }
    }
}
