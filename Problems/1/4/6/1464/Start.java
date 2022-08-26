//Problem 1464
public class Start {
    private static void test(int count) {
        switch (count) {
            case 1: {
                System.out.println("test " + count + " start:");
                int[] numsIn = new int[]{3, 4, 5, 2};
                System.out.println(new Solution().maxProduct(numsIn));
                System.out.println("12  <-  Should be\n");
                break;
            }
            case 2: {
                System.out.println("test " + count + " start:");
                int[] numsIn = new int[]{1, 5, 4, 5};
                System.out.println(new Solution().maxProduct(numsIn));
                System.out.println("16  <-  Should be\n");
                break;
            }
            case 3: {
                System.out.println("test " + count + " start:");
                int[] numsIn = new int[]{3, 7};
                System.out.println(new Solution().maxProduct(numsIn));
                System.out.println("12  <-  Should be\n");
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
