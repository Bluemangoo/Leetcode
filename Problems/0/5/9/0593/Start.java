//Problem 0593
public class Start {
    private static void test(int count) {
        switch (count) {
            case 1: {
                System.out.println("test " + count + " start:");
                int[] p1 = new int[]{0, 0};
                int[] p2 = new int[]{1, 0};
                int[] p3 = new int[]{1, 1};
                int[] p4 = new int[]{0, 1};
                System.out.println(new Solution().validSquare(p1, p2, p3, p4));
                System.out.println("true  <-  Should be\n");
                break;
            }
            case 2: {
                System.out.println("test " + count + " start:");
                int[] p1 = new int[]{0, 0};
                int[] p2 = new int[]{1, 0};
                int[] p3 = new int[]{1, 1};
                int[] p4 = new int[]{0, 12};
                System.out.println(new Solution().validSquare(p1, p2, p3, p4));
                System.out.println("false  <-  Should be\n");
                break;
            }
            case 3: {
                System.out.println("test " + count + " start:");
                int[] p1 = new int[]{1, 0};
                int[] p2 = new int[]{-1, 0};
                int[] p3 = new int[]{0, 1};
                int[] p4 = new int[]{0, -1};
                System.out.println(new Solution().validSquare(p1, p2, p3, p4));
                System.out.println("true  <-  Should be\n");
                break;
            }
            case 4: {
                System.out.println("test " + count + " start:");
                int[] p1 = new int[]{4, 0};
                int[] p2 = new int[]{-3, -1};
                int[] p3 = new int[]{0, 3};
                int[] p4 = new int[]{1, -4};
                System.out.println(new Solution().validSquare(p1, p2, p3, p4));
                System.out.println("true  <-  Should be\n");
                break;
            }
            case 5: {
                System.out.println("test " + count + " start:");
                int[] p1 = new int[]{0, 0};
                int[] p2 = new int[]{1, 1};
                int[] p3 = new int[]{0, 0};
                int[] p4 = new int[]{0, 0};
                System.out.println(new Solution().validSquare(p1, p2, p3, p4));
                System.out.println("false  <-  Should be\n");
                break;
            }
            case 6: {
                System.out.println("test " + count + " start:");
                int[] p1 = new int[]{0, 0};
                int[] p2 = new int[]{0, 0};
                int[] p3 = new int[]{0, 0};
                int[] p4 = new int[]{0, 0};
                System.out.println(new Solution().validSquare(p1, p2, p3, p4));
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
        int testTime = 6;
        for (int i = 1; i <= testTime; i++) {
            test(i);
        }
    }
}
