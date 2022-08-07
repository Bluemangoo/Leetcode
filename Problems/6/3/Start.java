//Problem 0565
public class Start {
    private static void test(int count) {
        switch (count) {
            case 1: {
                System.out.println("test " + count + " start:");
                int[] numsIn = new int[]{4, 4, 4, 5, 6};
                System.out.println(new Solution().validPartition(numsIn));
                System.out.println("true  <-  Should be\n");
                break;
            }
            case 2: {
                System.out.println("test " + count + " start:");
                int[] numsIn = new int[]{1, 1, 1, 2};
                System.out.println(new Solution().validPartition(numsIn));
                System.out.println("false  <-  Should be\n");
                break;
            }
            case 3: {
                System.out.println("test " + count + " start:");
                int[] numsIn = new int[]{993335, 993336, 993337, 993338, 993339, 993340, 993341};
                System.out.println(new Solution().validPartition(numsIn));
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
        int testTime = 3;
        for (int i = 1; i <= testTime; i++) {
            test(i);
        }
    }
}
