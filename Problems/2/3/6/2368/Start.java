//Problem 2368
public class Start {
    private static void test(int count) {
        switch (count) {
            case 1: {
                System.out.println("test " + count + " start:");
                int nIn = 7;
                int[][] edgesIn = new int[][]{{0, 1}, {1, 2}, {3, 1}, {4, 0}, {0, 5}, {5, 6}};
                int[] restrictedIn = new int[]{4, 5};
                System.out.println(new Solution().reachableNodes(nIn, edgesIn, restrictedIn));
                System.out.println("4  <-  Should be\n");
                break;
            }
            case 2: {
                System.out.println("test " + count + " start:");
                int nIn = 7;
                int[][] edgesIn = new int[][]{{0, 1}, {0, 2}, {0, 5}, {0, 4}, {3, 2}, {6, 5}};
                int[] restrictedIn = new int[]{4, 2, 1};
                System.out.println(new Solution().reachableNodes(nIn, edgesIn, restrictedIn));
                System.out.println("3  <-  Should be\n");
                break;
            }
            case 3: {
                System.out.println("test " + count + " start:");
                int nIn = 2;
                int[][] edgesIn = new int[][]{{0, 1}};
                int[] restrictedIn = new int[]{1};
                System.out.println(new Solution().reachableNodes(nIn, edgesIn, restrictedIn));
                System.out.println("1  <-  Should be\n");
                break;
            }
            case 4: {
                System.out.println("test " + count + " start:");
                int nIn = 10;
                int[][] edgesIn = new int[][]{{4, 1}, {1, 3}, {1, 5}, {0, 5}, {3, 6}, {8, 4}, {5, 7}, {6, 9}, {3, 2}};
                int[] restrictedIn = new int[]{2, 7};
                System.out.println(new Solution().reachableNodes(nIn, edgesIn, restrictedIn));
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
        int testTime = 4;
        for (int i = 1; i <= testTime; i++) {
            test(i);
        }
    }
}
