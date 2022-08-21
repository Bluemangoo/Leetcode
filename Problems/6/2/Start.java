//Problem 0565
public class Start {
    private static void test(int count) {
        switch (count) {
            case 1: {
                System.out.println("test " + count + " start:");
                System.out.println(new Solution().largestPalindromic("444947137"));
                System.out.println("7449447  <-  Should be\n");
                break;
            }
            case 2: {
                System.out.println("test " + count + " start:");
                System.out.println(new Solution().largestPalindromic("00009"));
                System.out.println("9  <-  Should be\n");
                break;
            }
            case 3: {
                System.out.println("test " + count + " start:");
                System.out.println(new Solution().largestPalindromic("9"));
                System.out.println("9  <-  Should be\n");
                break;
            }
            case 4: {
                System.out.println("test " + count + " start:");
                System.out.println(new Solution().largestPalindromic("0"));
                System.out.println("0  <-  Should be\n");
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
