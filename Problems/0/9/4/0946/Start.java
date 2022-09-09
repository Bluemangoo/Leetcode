//Problem 0946
public class Start {
    private static void test(int count) {
        switch (count) {
            case 1: {
                System.out.println("test " + count + " start:");
                int[] pushedIn = new int[]{1, 2, 3, 4, 5};
                int[] poppedIn = new int[]{4, 5, 3, 2, 1};
                System.out.println(new Solution().validateStackSequences(pushedIn, poppedIn));
                System.out.println("true  <-  Should be\n");
                break;
            }
            case 2: {
                System.out.println("test " + count + " start:");
                int[] pushedIn = new int[]{1, 2, 3, 4, 5};
                int[] poppedIn = new int[]{4, 3, 5, 1, 2};
                System.out.println(new Solution().validateStackSequences(pushedIn, poppedIn));
                System.out.println("false  <-  Should be\n");
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
