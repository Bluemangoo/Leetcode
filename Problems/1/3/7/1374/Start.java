//Problem 1374
public class Start {
    private static void test(int count) {
        switch (count) {
            case 1: {
                System.out.println("test " + count + " start:");
                System.out.println(new Solution().generateTheString(4));
                System.out.println(" -  <-  Should be\n");
                break;
            }
            case 2: {
                System.out.println("test " + count + " start:");
                System.out.println(new Solution().generateTheString(2));
                System.out.println(" -  <-  Should be\n");
                break;
            }
            case 3: {
                System.out.println("test " + count + " start:");
                System.out.println(new Solution().generateTheString(7));
                System.out.println(" -  <-  Should be\n");
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
