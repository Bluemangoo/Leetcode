//Problem 0793
public class Start {
    private static void test(int count) {
        switch (count) {
            case 1: {
                System.out.println("test "+count+" start:");
                System.out.println(new Solution().preimageSizeFZF(0));
                System.out.println("5  <-  Should be\n");
                break;
            }
            case 2: {
                System.out.println("test "+count+" start:");
                System.out.println(new Solution().preimageSizeFZF(5));
                System.out.println("0  <-  Should be\n");
                break;
            }
            case 3: {
                System.out.println("test "+count+" start:");
                System.out.println(new Solution().preimageSizeFZF(3));
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
        int testTime = 3;
        for (int i = 1; i <= testTime; i++) {
            test(i);
        }
    }
}
