//Problem 1598
public class Start {
    private static void test(int count) {
        switch (count) {
            case 1: {
                System.out.println("test " + count + " start:");
                String[] logsIn = new String[]{"d1/", "d2/", "../", "d21/", "./"};
                System.out.println(new Solution().minOperations(logsIn));
                System.out.println("2  <-  Should be\n");
                break;
            }
            case 2: {
                System.out.println("test " + count + " start:");
                String[] logsIn = new String[]{"d1/", "d2/", "./", "d3/", "../", "d31/"};
                System.out.println(new Solution().minOperations(logsIn));
                System.out.println("3  <-  Should be\n");
                break;
            }
            case 3: {
                System.out.println("test " + count + " start:");
                String[] logsIn = new String[]{"d1/", "../", "../", "../"};
                System.out.println(new Solution().minOperations(logsIn));
                System.out.println("0  <-  Should be\n");
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
