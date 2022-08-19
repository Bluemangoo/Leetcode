//Problem 1417
public class Start {
    private static void test(int count) {
        switch (count) {
            case 1: {
                System.out.println("test " + count + " start:");
                System.out.println(new Solution().reformat("a0b1c2"));
                System.out.println("0a1b2c  <-  Should be\n");
                break;
            }
            case 2: {
                System.out.println("test " + count + " start:");
                System.out.println(new Solution().reformat("leetcode"));
                System.out.println("  <-  Should be\n");
                break;
            }
            case 3: {
                System.out.println("test " + count + " start:");
                System.out.println(new Solution().reformat("1229857369"));
                System.out.println("  <-  Should be\n");
                break;
            }
            case 4: {
                System.out.println("test " + count + " start:");
                System.out.println(new Solution().reformat("covid2019"));
                System.out.println("c2o0v1i9d  <-  Should be\n");
                break;
            }
            case 5: {
                System.out.println("test " + count + " start:");
                System.out.println(new Solution().reformat("ab123"));
                System.out.println("1a2b3  <-  Should be\n");
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
