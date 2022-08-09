//Problem 1413
public class Start {
    private static void test(int count) {
        switch (count) {
            case 1: {
                System.out.println("test " + count + " start:");
                int[] numsIn = new int[]{-3, 2, -3, 4, 2};
                System.out.println(new Solution().minStartValue(numsIn));
                System.out.println("5  <-  Should be\n");
                break;
            }
            case 2: {
                System.out.println("test " + count + " start:");
                int[] numsIn = new int[]{1, 2};
                System.out.println(new Solution().minStartValue(numsIn));
                System.out.println("1  <-  Should be\n");
                break;
            }
            case 3: {
                System.out.println("test " + count + " start:");
                int[] numsIn = new int[]{1, -2, -3};
                System.out.println(new Solution().minStartValue(numsIn));
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
        int testTime = 3;
        for (int i = 1; i <= testTime; i++) {
            test(i);
        }
    }
}
