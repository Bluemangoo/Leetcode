//Problem 1422
public class Start {
    private static void test(int count) {
        switch (count) {
            case 1: {
                System.out.println("test " + count + " start:");
                System.out.println(new Solution().maxScore("011101"));
                System.out.println("5  <-  Should be\n");
                break;
            }
            case 2: {
                System.out.println("test " + count + " start:");
                System.out.println(new Solution().maxScore("00111"));
                System.out.println("5  <-  Should be\n");
                break;
            }
            case 3: {
                System.out.println("test " + count + " start:");
                System.out.println(new Solution().maxScore("1111"));
                System.out.println("3  <-  Should be\n");
                break;
            }
            case 4: {
                System.out.println("test " + count + " start:");
                System.out.println(new Solution().maxScore("1000"));
                System.out.println("2  <-  Should be\n");
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
