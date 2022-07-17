//Problem 6164
//302/max-sum-of-a-pair-with-equal-sum-of-digits
public class Start {
    private static void test(int count) {
        switch (count) {
            case 1: {
                System.out.println("test 1 start:");
                int[] numsIn = new int[]{18, 43, 36, 13, 7};
                System.out.println(new Solution().maximumSum(numsIn));
                System.out.println("Should be: 54\n");
                break;
            }
            case 2: {
                System.out.println("test 2 start:");
                int[] numsIn = new int[]{10, 12, 19, 14};
                System.out.println(new Solution().maximumSum(numsIn));
                System.out.println("Should be: -1\n");
                break;
            }
            case 3: {
                System.out.println("test 3 start:");
                int[] numsIn = new int[]{10, 12, 19, 28};
                System.out.println(new Solution().maximumSum(numsIn));
                System.out.println("Should be: 47\n");
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
