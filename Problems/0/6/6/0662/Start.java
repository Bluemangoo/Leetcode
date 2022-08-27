//Problem 0565
public class Start {
    private static void test(int count) {
        switch (count) {
            case 1: {
                System.out.println("test " + count + " start:");
                TreeNode rootIn = new TreeNode(1, new TreeNode(3, new TreeNode(5), new TreeNode(3)), new TreeNode(2, null, new TreeNode(9)));
                System.out.println(new Solution().widthOfBinaryTree(rootIn));
                System.out.println("4  <-  Should be\n");
                break;
            }
            case 2: {
                System.out.println("test " + count + " start:");
                TreeNode rootIn = new TreeNode(1, new TreeNode(3, new TreeNode(5, new TreeNode(6), null), null), new TreeNode(2, null, new TreeNode(9, new TreeNode(7), null)));
                System.out.println(new Solution().widthOfBinaryTree(rootIn));
                System.out.println("7  <-  Should be\n");
                break;
            }
            case 3: {
                System.out.println("test " + count + " start:");
                TreeNode rootIn = new TreeNode(1, new TreeNode(3, new TreeNode(5), null), new TreeNode(2));
                System.out.println(new Solution().widthOfBinaryTree(rootIn));
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
        int testTime = 3;
        for (int i = 1; i <= testTime; i++) {
            test(i);
        }
    }
}
