//Problem 0814
public class Start {
    private static void test(int count) {
        switch (count) {
            case 1: {
                System.out.println("test 1 start:");
                TreeNode rootIn = new TreeNode(1, null, new TreeNode(0, new TreeNode(0), new TreeNode(1)));
                System.out.println(new Solution().pruneTree(rootIn));
                System.out.println("[1, null, [0, null, [1]]]  <-  Should be\n");
                break;
            }
            case 2: {
                System.out.println("test 2 start:");
                TreeNode rootIn = new TreeNode(1, new TreeNode(0, new TreeNode(0), new TreeNode(0)), new TreeNode(0, new TreeNode(0), new TreeNode(1)));
                System.out.println(new Solution().pruneTree(rootIn));
                System.out.println("[1, null, [1, null, [1]]]  <-  Should be\n");
                break;
            }
            case 3: {
                System.out.println("test 3 start:");
                TreeNode rootIn = new TreeNode(1, new TreeNode(1, new TreeNode(1, new TreeNode(0), null), new TreeNode(1)), new TreeNode(0, new TreeNode(0), new TreeNode(1)));
                System.out.println(new Solution().pruneTree(rootIn));
                System.out.println("[1, [1, [1], [1]], [0, null, [1]]]  <-  Should be\n");
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
