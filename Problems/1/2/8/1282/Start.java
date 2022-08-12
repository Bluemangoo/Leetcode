//Problem 1282
public class Start {
    private static void test(int count) {
        switch (count) {
            case 1: {
                System.out.println("test " + count + " start:");
                int[] groupSizesIn = new int[]{3, 3, 3, 3, 3, 1, 3};
                System.out.println(new Solution().groupThePeople(groupSizesIn));
                System.out.println("[[5], [0, 1, 2], [3, 4, 6]]  <-  Should be\n");
                break;
            }
            case 2: {
                System.out.println("test " + count + " start:");
                int[] groupSizesIn = new int[]{2, 1, 3, 3, 3, 2};
                System.out.println(new Solution().groupThePeople(groupSizesIn));
                System.out.println("[[1], [0, 5], [2, 3, 4]]  <-  Should be\n");
                break;
            }
            case 3: {
                System.out.println("test " + count + " start:");
                int[] groupSizesIn = new int[]{1};
                System.out.println(new Solution().groupThePeople(groupSizesIn));
                System.out.println("[[0]]  <-  Should be\n");
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
