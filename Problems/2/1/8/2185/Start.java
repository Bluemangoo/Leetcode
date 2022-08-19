//Problem 2185
public class Start {
    private static void test1() {
        System.out.println("test 1 start:");
        String[] wordsIn = new String[]{"pay", "attention", "practice", "attend"};
        String prefIn = "at";
        System.out.println(new Solution().prefixCount(wordsIn, prefIn));
        System.out.println("Should be: 2\n");
    }

    private static void test2() {
        System.out.println("test 2 start:");
        String[] wordsIn = new String[]{"leetcode", "win", "loops", "success"};
        String prefIn = "code";
        System.out.println(new Solution().prefixCount(wordsIn, prefIn));
        System.out.println("Should be: 0\n");
    }

    private static void test3() {
        System.out.println("test 3 start:");
        String[] wordsIn = new String[]{"leetcode"};
        String prefIn = "l";
        System.out.println(new Solution().prefixCount(wordsIn, prefIn));
        System.out.println("Should be: 1\n");
    }

    private static void test4() {
        System.out.println("test 4 start:");
        String[] wordsIn = new String[]{"leetcode"};
        String prefIn = "leetcode";
        System.out.println(new Solution().prefixCount(wordsIn, prefIn));
        System.out.println("Should be: 1\n");
    }

    private static void test5() {
        System.out.println("test 5 start:");
        String[] wordsIn = new String[]{"leetcode"};
        String prefIn = "code";
        System.out.println(new Solution().prefixCount(wordsIn, prefIn));
        System.out.println("Should be: 0\n");
    }

    public static void main(String[] args) {
        test1();
        test2();
        test3();
        test4();
        test5();
    }
}
