//Problem 2360
public class Start {
    private static void test(int count) {
        switch (count) {
            case 1: {
                System.out.println("test " + count + " start:");
                int[] edgesIn = new int[]{3,3,4,2,3};
                System.out.println(new Solution().longestCycle(edgesIn));
                System.out.println("3  <-  Should be\n");
                break;
            }
            case 2: {
                System.out.println("test " + count + " start:");
                int[] edgesIn = new int[]{2,-1,3,1};
                System.out.println(new Solution().longestCycle(edgesIn));
                System.out.println("-1  <-  Should be\n");
                break;
            }
            case 3: {
                System.out.println("test " + count + " start:");
                int[] edgesIn = new int[]{5,3,1,0,2,4,5};
                System.out.println(new Solution().longestCycle(edgesIn));
                System.out.println("6  <-  Should be\n");
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
