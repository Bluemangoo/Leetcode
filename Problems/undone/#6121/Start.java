import java.util.Arrays;

//Problem 6121
//302/query-kth-smallest-trimmed-number
public class Start {
    private static void test(int count) {
        switch (count) {
            case 1: {
                System.out.println("test 1 start:");
                String[] numsIn = new String[]{"102", "473", "251", "814"};
                int[][] queriesIn = new int[][]{{1, 1}, {2, 3}, {4, 2}, {1, 2}};
                System.out.println(Arrays.toString(new Solution().smallestTrimmedNumbers(numsIn, queriesIn)));
                System.out.println("Should be: [2, 2, 1, 0]\n");
                break;
            }
            case 2: {
                System.out.println("test 2 start:");
                String[] numsIn = new String[]{"24", "37", "96", "04"};
                int[][] queriesIn = new int[][]{{2, 1}, {2, 2}};
                System.out.println(Arrays.toString(new Solution().smallestTrimmedNumbers(numsIn, queriesIn)));
                System.out.println("Should be: [3, 0]\n");
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
