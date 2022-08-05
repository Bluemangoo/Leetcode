//Problem 0623
public class Start {
    private static void test(int count) {
        switch (count) {
            case 1: {
                System.out.println("test " + count + " start:");
                TreeNode rootIn = new TreeNode(4, new TreeNode(2, new TreeNode(3), new TreeNode(1)), new TreeNode(6, new TreeNode(5), null));
                int valIn = 1;
                int depthIn = 2;
                System.out.println(new Solution().addOneRow(rootIn, valIn, depthIn));
                System.out.println("[4, [1, [2, [3], [1]], null], [1, null, [6, [5], null]]]  <-  Should be\n");
                break;
            }
            case 2: {
                System.out.println("test " + count + " start:");
                TreeNode rootIn = new TreeNode(4, new TreeNode(2, new TreeNode(3), new TreeNode(1)), null);
                int valIn = 1;
                int depthIn = 3;
                System.out.println(new Solution().addOneRow(rootIn, valIn, depthIn));
                System.out.println("[4, [2, [1, [3], null], [1, null, [1]]], null]  <-  Should be\n");
                break;
            }
            case 3: {
                System.out.println("test " + count + " start:");
                TreeNode rootIn = new TreeNode(1, new TreeNode(2, new TreeNode(3), null), new TreeNode(3));
                int valIn = 5;
                int depthIn = 4;
                System.out.println(new Solution().addOneRow(rootIn, valIn, depthIn));
                System.out.println("[1, [2, [4, [5], [5]], null], [3]]  <-  Should be\n");
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
