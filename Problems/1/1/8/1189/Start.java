//Problem 0002
public class Start {
    private static void test1() {
        System.out.println("test 1 start:");
        System.out.println(new Solution().maxNumberOfBalloons("nlaebolko"));
        System.out.println("Should be: 1\n");
    }

    private static void test2() {
        System.out.println("test 2 start:");
        System.out.println(new Solution().maxNumberOfBalloons("loonbalxballpoon"));
        System.out.println("Should be: 2\n");
    }

    private static void test3() {
        System.out.println("test 3 start:");
        System.out.println(new Solution().maxNumberOfBalloons("leetcode"));
        System.out.println("Should be: 0\n");
    }

    private static void test4() {
        System.out.println("test 4 start:");
        System.out.println(new Solution().maxNumberOfBalloons("ballon"));
        System.out.println("Should be: 0\n");
    }

    public static void main(String[] args) {
        test1();
        test2();
        test3();
        test4();
    }
}
