//Problem 0565
public class Start {
    private static void test(int count) {
        switch (count) {
            case 1: {
                System.out.println("test " + count + " start:");
                TreeNode rootIn = new TreeNode(1, new TreeNode(2), null);
                System.out.println(new Solution().printTree(rootIn));
                System.out.println("[[, 1, ], [2, , ]]  <-  Should be\n");
                break;
            }
            case 2: {
                System.out.println("test " + count + " start:");
                TreeNode rootIn = new TreeNode(1, new TreeNode(2, null, new TreeNode(4)), new TreeNode(3));
                System.out.println(new Solution().printTree(rootIn));
                System.out.println("[[, , , 1, , , ], [, 2, , , , 3, ], [, , 4, , , , ]]  <-  Should be\n");
                break;
            }
            default: {
                System.err.println("Too More Tests");
                System.exit(-1);
            }
        }
    }

    public static void main(String[] args) {
        int testTime = 2;
        for (int i = 1; i <= testTime; i++) {
            test(i);
        }
    }
}
