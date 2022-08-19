//Problem 2359
public class Start {
    private static void test(int count) {
        switch (count) {
            case 1: {
                System.out.println("test " + count + " start:");
                int[] edgesIn = new int[]{2, 2, 3, -1};
                int node1 = 0;
                int node2 = 1;
                System.out.println(new Solution().closestMeetingNode(edgesIn, node1, node2));
                System.out.println("2  <-  Should be\n");
                break;
            }
            case 2: {
                System.out.println("test " + count + " start:");
                int[] edgesIn = new int[]{1, 2, -1};
                int node1 = 0;
                int node2 = 2;
                System.out.println(new Solution().closestMeetingNode(edgesIn, node1, node2));
                System.out.println("2  <-  Should be\n");
                break;
            }
            case 3: {
                System.out.println("test " + count + " start:");
                int[] edgesIn = new int[]{5, 3, 1, 0, 2, 4, 5};
                int node1 = 3;
                int node2 = 2;
                System.out.println(new Solution().closestMeetingNode(edgesIn, node1, node2));
                System.out.println("3  <-  Should be\n");
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
