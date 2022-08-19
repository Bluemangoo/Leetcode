//Problem 0540
public class Start {
    private static void test1() {
        System.out.println("test 1 start:");
        int[] numsIn = new int[]{1, 1, 2, 3, 3, 4, 4, 8, 8};
        System.out.println(new Solution().singleNonDuplicate(numsIn));
        System.out.println("Should be: 2\n");
    }

    private static void test2() {
        System.out.println("test 2 start:");
        int[] numsIn = new int[]{3, 3, 7, 7, 10, 11, 11};
        System.out.println(new Solution().singleNonDuplicate(numsIn));
        System.out.println("Should be: 10\n");
    }

    private static void test3() {
        System.out.println("test 3 start:");
        int[] numsIn = new int[]{3};
        System.out.println(new Solution().singleNonDuplicate(numsIn));
        System.out.println("Should be: 3\n");
    }

    private static void test4() {
        System.out.println("test 4 start:");
        int[] numsIn = new int[]{1, 1, 2};
        System.out.println(new Solution().singleNonDuplicate(numsIn));
        System.out.println("Should be: 2\n");
    }

    private static void test5() {
        System.out.println("test 5 start:");
        int[] numsIn = new int[]{1, 2, 2};
        System.out.println(new Solution().singleNonDuplicate(numsIn));
        System.out.println("Should be: 1\n");
    }

    public static void main(String[] args) {
        test1();
        test2();
        test3();
        test4();
        test5();
    }
}
