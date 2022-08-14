//Problem 0565
public class Start {
    private static void test(int count) {
        switch (count) {
            case 1: {
                System.out.println("test " + count + " start:");
                int[] edgesIn = new int[]{1, 0, 0, 0, 0, 7, 7, 5};
                System.out.println(new Solution().edgeScore(edgesIn));
                System.out.println("7  <-  Should be\n");
                break;
            }
            case 2: {
                System.out.println("test " + count + " start:");
                int[] edgesIn = new int[]{2, 0, 0, 2};
                System.out.println(new Solution().edgeScore(edgesIn));
                System.out.println("0  <-  Should be\n");
                break;
            }
            case 3: {
                System.out.println("test " + count + " start:");
                int[] edgesIn = new int[]{0};
                System.out.println(new Solution().edgeScore(edgesIn));
                System.out.println("0  <-  Should be\n");
                break;
            }
            case 4: {
                System.out.println("test " + count + " start:");
                int[] edgesIn = new int[]{1,1};
                System.out.println(new Solution().edgeScore(edgesIn));
                System.out.println("1  <-  Should be\n");
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
