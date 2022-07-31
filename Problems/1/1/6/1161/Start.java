//Problem 1161
public class Start {
    private static void test(int count) {
        switch (count) {
            case 1: {
                System.out.println("test " + count + " start:");
                TreeNode rootIn=new TreeNode(1,new TreeNode(7,new TreeNode(7),new TreeNode(-8)),new TreeNode(0));
                System.out.println(new Solution().maxLevelSum(rootIn));
                System.out.println("2  <-  Should be\n");
                break;
            }
            case 2: {
                System.out.println("test " + count + " start:");
                TreeNode rootIn=new TreeNode(989,null,new TreeNode(10250,new TreeNode(98693),new TreeNode(-89388,null,new TreeNode(-32127))));
                System.out.println(new Solution().maxLevelSum(rootIn));
                System.out.println("2  <-  Should be\n");
                break;
            }
            case 3: {
                System.out.println("test " + count + " start:");
                TreeNode rootIn=new TreeNode(1,new TreeNode(2),new TreeNode(3));
                System.out.println(new Solution().maxLevelSum(rootIn));
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
