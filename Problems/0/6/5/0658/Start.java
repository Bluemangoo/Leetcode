//Problem 0658
public class Start {
    private static void test(int count) {
        switch (count) {
            case 1: {
                System.out.println("test " + count + " start:");
                int[] arrIn = new int[]{1, 2, 3, 4, 5};
                int k = 4;
                int x = 3;
                System.out.println(new Solution().findClosestElements(arrIn, k, x));
                System.out.println("[1, 2, 3, 4]  <-  Should be\n");
                break;
            }
            case 2: {
                System.out.println("test " + count + " start:");
                int[] arrIn = new int[]{1, 2, 3, 4, 5};
                int k = 4;
                int x = -1;
                System.out.println(new Solution().findClosestElements(arrIn, k, x));
                System.out.println("[1, 2, 3, 4]  <-  Should be\n");
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
