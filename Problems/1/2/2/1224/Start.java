//Problem 1224
public class Start {
    private static void test(int count) {
        switch (count) {
            case 1: {
                System.out.println("test " + count + " start:");
                int[] numsIn = new int[]{2, 2, 1, 1, 5, 3, 3, 5};
                System.out.println(new Solution().maxEqualFreq(numsIn));
                System.out.println("7  <-  Should be\n");
                break;
            }
            case 2: {
                System.out.println("test " + count + " start:");
                int[] numsIn = new int[]{1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5};
                System.out.println(new Solution().maxEqualFreq(numsIn));
                System.out.println("13  <-  Should be\n");
                break;
            }
            case 3: {
                System.out.println("test " + count + " start:");
                int[] numsIn = new int[]{1, 1, 1, 2, 2, 2};
                System.out.println(new Solution().maxEqualFreq(numsIn));
                System.out.println("5  <-  Should be\n");
                break;
            }
            case 4: {
                System.out.println("test " + count + " start:");
                int[] numsIn = new int[]{10, 2, 8, 9, 3, 8, 1, 5, 2, 3, 7, 6};
                System.out.println(new Solution().maxEqualFreq(numsIn));
                System.out.println("8  <-  Should be\n");
                break;
            }
            case 5: {
                System.out.println("test " + count + " start:");
                int[] numsIn = new int[]{1, 1, 2, 2, 3, 4, 5, 6, 6};
                System.out.println(new Solution().maxEqualFreq(numsIn));
                System.out.println("5  <-  Should be\n");
                break;
            }
            case 6: {
                System.out.println("test " + count + " start:");
                int[] numsIn = new int[]{1, 2};
                System.out.println(new Solution().maxEqualFreq(numsIn));
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
        int testTime = 6;
        for (int i = 1; i <= testTime; i++) {
            test(i);
        }
    }
}
