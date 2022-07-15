//Problem 6009
//minimum-number-of-steps-to-make-two-strings-anagram-ii
public class Start {
    private static void test1(){
        System.out.println("test 1 start:");
        String sIn="leetcode";
        String tIn="coats";
        System.out.println(new Solution().minSteps(sIn,tIn));
        System.out.println("Should be: 7\n");
    }
    private static void test2(){
        System.out.println("test 2 start:");
        String sIn="night";
        String tIn="thing";
        System.out.println(new Solution().minSteps(sIn,tIn));
        System.out.println("Should be: 0\n");
    }
    private static void test3(){
        System.out.println("test 3 start:");
        String sIn="night";
        String tIn="night";
        System.out.println(new Solution().minSteps(sIn,tIn));
        System.out.println("Should be: 0\n");
    }
    public static void main(String[] args) {
        test1();
        test2();
        test3();
    }
}
