//Problem 0540
public class Start {
    private static void test1() {
        System.out.println("test 1 start:");
        System.out.println(new Solution().isPalindrome(121));
        System.out.println("Should be: true\n");
    }

    private static void test2() {
        System.out.println("test 2 start:");
        System.out.println(new Solution().isPalindrome(-121));
        System.out.println("Should be: false\n");
    }

    private static void test3() {
        System.out.println("test 3 start:");
        System.out.println(new Solution().isPalindrome(10));
        System.out.println("Should be: false\n");
    }

    private static void test4() {
        System.out.println("test 4 start:");
        System.out.println(new Solution().isPalindrome(1001));
        System.out.println("Should be: true\n");
    }

    private static void test5() {
        System.out.println("test 5 start:");
        System.out.println(new Solution().isPalindrome(1));
        System.out.println("Should be: true\n");
    }

    private static void test6() {
        System.out.println("test 6 start:");
        System.out.println(new Solution().isPalindrome(-1));
        System.out.println("Should be: false\n");
    }

    private static void test7() {
        System.out.println("test 7 start:");
        System.out.println(new Solution().isPalindrome(11));
        System.out.println("Should be: true\n");
    }

    public static void main(String[] args) {
        test1();
        test2();
        test3();
        test4();
        test5();
        test6();
        test7();
    }
}
