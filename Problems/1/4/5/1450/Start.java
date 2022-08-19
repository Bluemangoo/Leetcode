//Problem 1450
public class Start {
    private static void test(int count) {
        switch (count) {
            case 1: {
                System.out.println("test " + count + " start:");
                int[] startTimeIn = new int[]{1, 2, 3};
                int[] endTimeIn = new int[]{3, 2, 7};
                int queryTimeIn = 4;
                System.out.println(new Solution().busyStudent(startTimeIn, endTimeIn, queryTimeIn));
                System.out.println("1  <-  Should be\n");
                break;
            }
            case 2: {
                System.out.println("test " + count + " start:");
                int[] startTimeIn = new int[]{4};
                int[] endTimeIn = new int[]{4};
                int queryTimeIn = 4;
                System.out.println(new Solution().busyStudent(startTimeIn, endTimeIn, queryTimeIn));
                System.out.println("1  <-  Should be\n");
                break;
            }
            case 3: {
                System.out.println("test " + count + " start:");
                int[] startTimeIn = new int[]{4};
                int[] endTimeIn = new int[]{4};
                int queryTimeIn = 5;
                System.out.println(new Solution().busyStudent(startTimeIn, endTimeIn, queryTimeIn));
                System.out.println("0  <-  Should be\n");
                break;
            }
            case 4: {
                System.out.println("test " + count + " start:");
                int[] startTimeIn = new int[]{1, 1, 1, 1};
                int[] endTimeIn = new int[]{1, 3, 2, 4};
                int queryTimeIn = 7;
                System.out.println(new Solution().busyStudent(startTimeIn, endTimeIn, queryTimeIn));
                System.out.println("0  <-  Should be\n");
                break;
            }
            case 5: {
                System.out.println("test " + count + " start:");
                int[] startTimeIn = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1};
                int[] endTimeIn = new int[]{10, 10, 10, 10, 10, 10, 10, 10, 10};
                int queryTimeIn = 5;
                System.out.println(new Solution().busyStudent(startTimeIn, endTimeIn, queryTimeIn));
                System.out.println("5  <-  Should be\n");
                break;
            }
            default: {
                System.err.println("Too More Tests");
                System.exit(-1);
            }
        }
    }

    public static void main(String[] args) {
        int testTime = 5;
        for (int i = 1; i <= testTime; i++) {
            test(i);
        }
    }
}
