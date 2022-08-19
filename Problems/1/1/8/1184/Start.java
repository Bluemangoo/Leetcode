//Problem 1184
public class Start {
    private static void test(int count) {
        switch (count) {
            case 1: {
                System.out.println("test 1 start:");
                int[] distanceIn = new int[]{1, 2, 3, 4};
                int startIn = 0;
                int destination = 1;
                System.out.println(new Solution().distanceBetweenBusStops(distanceIn, startIn, destination));
                System.out.println("1  <-  Should be\n");
                break;
            }
            case 2: {
                System.out.println("test 2 start:");
                int[] distanceIn = new int[]{1, 2, 3, 4};
                int startIn = 0;
                int destination = 2;
                System.out.println(new Solution().distanceBetweenBusStops(distanceIn, startIn, destination));
                System.out.println("3  <-  Should be\n");
                break;
            }
            case 3: {
                System.out.println("test 3 start:");
                int[] distanceIn = new int[]{1, 2, 3, 4};
                int startIn = 0;
                int destination = 3;
                System.out.println(new Solution().distanceBetweenBusStops(distanceIn, startIn, destination));
                System.out.println("4  <-  Should be\n");
                break;
            }
            case 4: {
                System.out.println("test 4 start:");
                int[] distanceIn = new int[]{7, 10, 1, 12, 11, 14, 5, 0};
                int startIn = 7;
                int destination = 2;
                System.out.println(new Solution().distanceBetweenBusStops(distanceIn, startIn, destination));
                System.out.println("17  <-  Should be\n");
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
