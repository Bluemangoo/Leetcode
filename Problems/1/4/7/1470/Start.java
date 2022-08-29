import java.util.Arrays;

//Problem 1470
public class Start {
    private static void test(int count) {
        switch (count) {
            case 1: {
                System.out.println("test " + count + " start:");
                int[] numsIn = new int[]{2, 5, 1, 3, 4, 7};
                int nIn = 3;
                System.out.println(Arrays.toString(new Solution().shuffle(numsIn, nIn)));
                System.out.println("[2, 3, 5, 4, 1, 7]  <-  Should be\n");
                break;
            }
            case 2: {
                System.out.println("test " + count + " start:");
                int[] numsIn = new int[]{1, 2, 3, 4, 4, 3, 2, 1};
                int nIn = 4;
                System.out.println(Arrays.toString(new Solution().shuffle(numsIn, nIn)));
                System.out.println("[1, 4, 2, 3, 3, 2, 4, 1]  <-  Should be\n");
                break;
            }
            case 3: {
                System.out.println("test " + count + " start:");
                int[] numsIn = new int[]{1, 1, 2, 2};
                int nIn = 2;
                System.out.println(Arrays.toString(new Solution().shuffle(numsIn, nIn)));
                System.out.println("[1, 2, 1, 2]  <-  Should be\n");
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
