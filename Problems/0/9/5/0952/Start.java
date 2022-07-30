//Problem 0952
public class Start {
    private static void test(int count) {
        switch (count) {
            case 1: {
                System.out.println("test " + count + " start:");
                int[] numsIn = new int[]{4, 6, 15, 35};
                System.out.println(new Solution().largestComponentSize(numsIn));
                System.out.println("4  <-  Should be\n");
                break;
            }
            case 2: {
                System.out.println("test " + count + " start:");
                int[] numsIn = new int[]{20, 50, 9, 63};
                System.out.println(new Solution().largestComponentSize(numsIn));
                System.out.println("2  <-  Should be\n");
                break;
            }
            case 3: {
                System.out.println("test " + count + " start:");
                int[] numsIn = new int[]{2, 3, 6, 7, 4, 12, 21, 39};
                System.out.println(new Solution().largestComponentSize(numsIn));
                System.out.println("8  <-  Should be\n");
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
