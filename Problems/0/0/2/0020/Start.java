//Problem 0020
public class Start {
    private static void test(int count) {
        switch (count) {
            case 1: {
                System.out.println("test 1 start:");
                System.out.println(new Solution().isValid("()"));
                System.out.println("Should be: true\n");
                break;
            }
            case 2: {
                System.out.println("test 2 start:");
                System.out.println(new Solution().isValid("()[]{}"));
                System.out.println("Should be: true\n");
                break;
            }
            case 3: {
                System.out.println("test 3 start:");
                System.out.println(new Solution().isValid("(]"));
                System.out.println("Should be: false\n");
                break;
            }
            case 4: {
                System.out.println("test 4 start:");
                System.out.println(new Solution().isValid("([)]"));
                System.out.println("Should be: false\n");
                break;
            }
            case 5: {
                System.out.println("test 5 start:");
                System.out.println(new Solution().isValid("{[]}"));
                System.out.println("Should be: true\n");
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
