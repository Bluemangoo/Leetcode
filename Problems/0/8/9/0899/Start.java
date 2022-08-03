//Problem 0899
public class Start {
    private static void test(int count) {
        switch (count) {
            case 1: {
                System.out.println("test " + count + " start:");
                System.out.println(new Solution().orderlyQueue("cba", 1));
                System.out.println("acb  <-  Should be\n");
                break;
            }
            case 2: {
                System.out.println("test " + count + " start:");
                System.out.println(new Solution().orderlyQueue("baaca", 3));
                System.out.println("aaabc  <-  Should be\n");
                break;
            }
            case 3: {
                System.out.println("test " + count + " start:");
                System.out.println(new Solution().orderlyQueue("v", 1));
                System.out.println("v  <-  Should be\n");
                break;
            }
            case 4: {
                System.out.println("test " + count + " start:");
                System.out.println(new Solution().orderlyQueue("zmwguo", 1));
                System.out.println("guozmw  <-  Should be\n");
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
