//Problem 2367
public class Start {
    private static void test(int count) {
        switch (count) {
            case 1: {
                System.out.println("test " + count + " start:");
                int[] numsIn = new int[]{0, 1, 4, 6, 7, 10};
                int diffIn = 3;
                System.out.println(new Solution().arithmeticTriplets(numsIn, diffIn));
                System.out.println("2  <-  Should be\n");
                break;
            }
            case 2: {
                System.out.println("test " + count + " start:");
                int[] numsIn = new int[]{4, 5, 6, 7, 8, 9};
                int diffIn = 2;
                System.out.println(new Solution().arithmeticTriplets(numsIn, diffIn));
                System.out.println("2  <-  Should be\n");
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
