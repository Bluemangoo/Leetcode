//Problem 0919
public class Start {
    private static CBTInserter cBTInserter;
    private static void test(int count) {
        switch (count) {
            case 1: {
                System.out.println("test "+count+" start:");
                System.out.println(cBTInserter.insert(3));
                System.out.println("1  <-  Should be\n");
                break;
            }
            case 2: {
                System.out.println("test "+count+" start:");
                System.out.println(cBTInserter.insert(4));
                System.out.println("2  <-  Should be\n");
                break;
            }
            case 3: {
                System.out.println("test "+count+" start:");
                System.out.println(cBTInserter.get_root());
                System.out.println("[1, 2, 4, 3]  <-  Should be\n");
                break;
            }
            default: {
                System.err.println("Too More Tests");
                System.exit(-1);
            }
        }
    }

    public static void main(String[] args) {
        cBTInserter = new CBTInserter(new TreeNode(1,new TreeNode(2),null));
        int testTime = 3;
        for (int i = 1; i <= testTime; i++) {
            test(i);
        }
    }
}
